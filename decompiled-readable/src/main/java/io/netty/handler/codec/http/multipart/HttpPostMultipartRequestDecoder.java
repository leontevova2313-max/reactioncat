/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.http.multipart;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpConstants;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.codec.http.QueryStringDecoder;
import io.netty.handler.codec.http.multipart.Attribute;
import io.netty.handler.codec.http.multipart.CaseIgnoringComparator;
import io.netty.handler.codec.http.multipart.DefaultHttpDataFactory;
import io.netty.handler.codec.http.multipart.FileUpload;
import io.netty.handler.codec.http.multipart.HttpData;
import io.netty.handler.codec.http.multipart.HttpDataFactory;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.netty.handler.codec.http.multipart.InterfaceHttpData;
import io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder;
import io.netty.util.CharsetUtil;
import io.netty.util.ReferenceCounted;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.InternalThreadLocalMap;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HttpPostMultipartRequestDecoder
implements InterfaceHttpPostRequestDecoder {
    private final HttpDataFactory factory;
    private final HttpRequest request;
    private Charset charset;
    private boolean isLastChunk;
    private final List<InterfaceHttpData> bodyListHttpData = new ArrayList<InterfaceHttpData>();
    private final Map<String, List<InterfaceHttpData>> bodyMapHttpData = new TreeMap<CharSequence, List<InterfaceHttpData>>(CaseIgnoringComparator.INSTANCE);
    private ByteBuf undecodedChunk;
    private int bodyListHttpDataRank;
    private final String multipartDataBoundary;
    private String multipartMixedBoundary;
    private HttpPostRequestDecoder.MultiPartStatus currentStatus = HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED;
    private Map<CharSequence, Attribute> currentFieldAttributes;
    private FileUpload currentFileUpload;
    private Attribute currentAttribute;
    private boolean destroyed;
    private int discardThreshold = 0xA00000;
    private static final String FILENAME_ENCODED = HttpHeaderValues.FILENAME.toString() + '*';

    public HttpPostMultipartRequestDecoder(HttpRequest request) {
        this(new DefaultHttpDataFactory(16384L), request, HttpConstants.DEFAULT_CHARSET);
    }

    public HttpPostMultipartRequestDecoder(HttpDataFactory factory, HttpRequest request) {
        this(factory, request, HttpConstants.DEFAULT_CHARSET);
    }

    public HttpPostMultipartRequestDecoder(HttpDataFactory factory, HttpRequest request, Charset charset) {
        this.request = ObjectUtil.checkNotNull(request, "request");
        this.charset = ObjectUtil.checkNotNull(charset, "charset");
        this.factory = ObjectUtil.checkNotNull(factory, "factory");
        String contentTypeValue = this.request.headers().get(HttpHeaderNames.CONTENT_TYPE);
        if (contentTypeValue == null) {
            throw new HttpPostRequestDecoder.ErrorDataDecoderException("No '" + HttpHeaderNames.CONTENT_TYPE + "' header present.");
        }
        String[] dataBoundary = HttpPostRequestDecoder.getMultipartDataBoundary(contentTypeValue);
        if (dataBoundary != null) {
            this.multipartDataBoundary = dataBoundary[0];
            if (dataBoundary.length > 1 && dataBoundary[1] != null) {
                try {
                    this.charset = Charset.forName(dataBoundary[1]);
                }
                catch (IllegalCharsetNameException e) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                }
            }
        } else {
            this.multipartDataBoundary = null;
        }
        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
        try {
            if (request instanceof HttpContent) {
                this.offer((HttpContent)((Object)request));
            } else {
                this.parseBody();
            }
        }
        catch (Throwable e) {
            this.destroy();
            PlatformDependent.throwException(e);
        }
    }

    private void checkDestroyed() {
        if (this.destroyed) {
            throw new IllegalStateException(HttpPostMultipartRequestDecoder.class.getSimpleName() + " was destroyed already");
        }
    }

    @Override
    public boolean isMultipart() {
        this.checkDestroyed();
        return true;
    }

    @Override
    public void setDiscardThreshold(int discardThreshold) {
        this.discardThreshold = ObjectUtil.checkPositiveOrZero(discardThreshold, "discardThreshold");
    }

    @Override
    public int getDiscardThreshold() {
        return this.discardThreshold;
    }

    @Override
    public List<InterfaceHttpData> getBodyHttpDatas() {
        this.checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        return this.bodyListHttpData;
    }

    @Override
    public List<InterfaceHttpData> getBodyHttpDatas(String name) {
        this.checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        return this.bodyMapHttpData.get(name);
    }

    @Override
    public InterfaceHttpData getBodyHttpData(String name) {
        this.checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        List<InterfaceHttpData> list = this.bodyMapHttpData.get(name);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public HttpPostMultipartRequestDecoder offer(HttpContent content) {
        this.checkDestroyed();
        if (content instanceof LastHttpContent) {
            this.isLastChunk = true;
        }
        ByteBuf buf = content.content();
        if (this.undecodedChunk == null) {
            this.undecodedChunk = buf.alloc().buffer(buf.readableBytes()).writeBytes(buf);
        } else {
            this.undecodedChunk.writeBytes(buf);
        }
        this.parseBody();
        if (this.undecodedChunk != null && this.undecodedChunk.writerIndex() > this.discardThreshold) {
            if (this.undecodedChunk.refCnt() == 1) {
                this.undecodedChunk.discardReadBytes();
            } else {
                ByteBuf buffer = this.undecodedChunk.alloc().buffer(this.undecodedChunk.readableBytes());
                buffer.writeBytes(this.undecodedChunk);
                this.undecodedChunk.release();
                this.undecodedChunk = buffer;
            }
        }
        return this;
    }

    @Override
    public boolean hasNext() {
        this.checkDestroyed();
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE && this.bodyListHttpDataRank >= this.bodyListHttpData.size()) {
            throw new HttpPostRequestDecoder.EndOfDataDecoderException();
        }
        return !this.bodyListHttpData.isEmpty() && this.bodyListHttpDataRank < this.bodyListHttpData.size();
    }

    @Override
    public InterfaceHttpData next() {
        this.checkDestroyed();
        if (this.hasNext()) {
            return this.bodyListHttpData.get(this.bodyListHttpDataRank++);
        }
        return null;
    }

    @Override
    public InterfaceHttpData currentPartialHttpData() {
        if (this.currentFileUpload != null) {
            return this.currentFileUpload;
        }
        return this.currentAttribute;
    }

    private void parseBody() {
        if (this.currentStatus != HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE && this.currentStatus != HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) {
            this.parseBodyMultipart();
            return;
        }
        if (this.isLastChunk) {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
        }
    }

    protected void addHttpData(InterfaceHttpData data) {
        if (data == null) {
            return;
        }
        List<InterfaceHttpData> datas = this.bodyMapHttpData.get(data.getName());
        if (datas == null) {
            datas = new ArrayList<InterfaceHttpData>(1);
            this.bodyMapHttpData.put(data.getName(), datas);
        }
        datas.add(data);
        this.bodyListHttpData.add(data);
    }

    private void parseBodyMultipart() {
        if (this.undecodedChunk == null || this.undecodedChunk.readableBytes() == 0) {
            return;
        }
        InterfaceHttpData data = this.decodeMultipart(this.currentStatus);
        while (data != null) {
            this.addHttpData(data);
            if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE || this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) break;
            data = this.decodeMultipart(this.currentStatus);
        }
    }

    private InterfaceHttpData decodeMultipart(HttpPostRequestDecoder.MultiPartStatus state) {
        switch (state) {
            case NOTSTARTED: {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException("Should not be called with the current getStatus");
            }
            case PREAMBLE: {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException("Should not be called with the current getStatus");
            }
            case HEADERDELIMITER: {
                return this.findMultipartDelimiter(this.multipartDataBoundary, HttpPostRequestDecoder.MultiPartStatus.DISPOSITION, HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE);
            }
            case DISPOSITION: {
                return this.findMultipartDisposition();
            }
            case FIELD: {
                Charset localCharset = null;
                Attribute charsetAttribute = this.currentFieldAttributes.get(HttpHeaderValues.CHARSET);
                if (charsetAttribute != null) {
                    try {
                        localCharset = Charset.forName(charsetAttribute.getValue());
                    }
                    catch (IOException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (UnsupportedCharsetException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                }
                Attribute nameAttribute = this.currentFieldAttributes.get(HttpHeaderValues.NAME);
                if (this.currentAttribute == null) {
                    long size;
                    Attribute lengthAttribute = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_LENGTH);
                    try {
                        size = lengthAttribute != null ? Long.parseLong(lengthAttribute.getValue()) : 0L;
                    }
                    catch (IOException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (NumberFormatException ignored) {
                        size = 0L;
                    }
                    try {
                        this.currentAttribute = size > 0L ? this.factory.createAttribute(this.request, HttpPostMultipartRequestDecoder.cleanString(nameAttribute.getValue()), size) : this.factory.createAttribute(this.request, HttpPostMultipartRequestDecoder.cleanString(nameAttribute.getValue()));
                    }
                    catch (NullPointerException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IllegalArgumentException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IOException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    if (localCharset != null) {
                        this.currentAttribute.setCharset(localCharset);
                    }
                }
                if (!HttpPostMultipartRequestDecoder.loadDataMultipartOptimized(this.undecodedChunk, this.multipartDataBoundary, this.currentAttribute)) {
                    return null;
                }
                Attribute finalAttribute = this.currentAttribute;
                this.currentAttribute = null;
                this.currentFieldAttributes = null;
                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
                return finalAttribute;
            }
            case FILEUPLOAD: {
                return this.getFileUpload(this.multipartDataBoundary);
            }
            case MIXEDDELIMITER: {
                return this.findMultipartDelimiter(this.multipartMixedBoundary, HttpPostRequestDecoder.MultiPartStatus.MIXEDDISPOSITION, HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER);
            }
            case MIXEDDISPOSITION: {
                return this.findMultipartDisposition();
            }
            case MIXEDFILEUPLOAD: {
                return this.getFileUpload(this.multipartMixedBoundary);
            }
            case PREEPILOGUE: {
                return null;
            }
            case EPILOGUE: {
                return null;
            }
        }
        throw new HttpPostRequestDecoder.ErrorDataDecoderException("Shouldn't reach here.");
    }

    private static void skipControlCharacters(ByteBuf undecodedChunk) {
        char c;
        if (!undecodedChunk.hasArray()) {
            try {
                HttpPostMultipartRequestDecoder.skipControlCharactersStandard(undecodedChunk);
            }
            catch (IndexOutOfBoundsException e1) {
                throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e1);
            }
            return;
        }
        HttpPostBodyUtil.SeekAheadOptimize sao = new HttpPostBodyUtil.SeekAheadOptimize(undecodedChunk);
        do {
            if (sao.pos < sao.limit) continue;
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException("Access out of bounds");
        } while (Character.isISOControl(c = (char)(sao.bytes[sao.pos++] & 0xFF)) || Character.isWhitespace(c));
        sao.setReadPosition(1);
    }

    private static void skipControlCharactersStandard(ByteBuf undecodedChunk) {
        char c;
        while (Character.isISOControl(c = (char)undecodedChunk.readUnsignedByte()) || Character.isWhitespace(c)) {
        }
        undecodedChunk.readerIndex(undecodedChunk.readerIndex() - 1);
    }

    private InterfaceHttpData findMultipartDelimiter(String delimiter, HttpPostRequestDecoder.MultiPartStatus dispositionStatus, HttpPostRequestDecoder.MultiPartStatus closeDelimiterStatus) {
        String newline;
        int readerIndex = this.undecodedChunk.readerIndex();
        try {
            HttpPostMultipartRequestDecoder.skipControlCharacters(this.undecodedChunk);
        }
        catch (HttpPostRequestDecoder.NotEnoughDataDecoderException ignored) {
            this.undecodedChunk.readerIndex(readerIndex);
            return null;
        }
        this.skipOneLine();
        try {
            newline = HttpPostMultipartRequestDecoder.readDelimiterOptimized(this.undecodedChunk, delimiter, this.charset);
        }
        catch (HttpPostRequestDecoder.NotEnoughDataDecoderException ignored) {
            this.undecodedChunk.readerIndex(readerIndex);
            return null;
        }
        if (newline.equals(delimiter)) {
            this.currentStatus = dispositionStatus;
            return this.decodeMultipart(dispositionStatus);
        }
        if (!newline.equals(delimiter + "--")) {
            this.undecodedChunk.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.ErrorDataDecoderException("No Multipart delimiter found");
        }
        this.currentStatus = closeDelimiterStatus;
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER) {
            this.currentFieldAttributes = null;
            return this.decodeMultipart(HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private InterfaceHttpData findMultipartDisposition() {
        readerIndex = this.undecodedChunk.readerIndex();
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
            this.currentFieldAttributes = new TreeMap<CharSequence, Attribute>(CaseIgnoringComparator.INSTANCE);
        }
        block20: while (true) {
            block40: {
                block39: {
                    block37: {
                        block38: {
                            if (this.skipOneLine()) break block37;
                            try {
                                HttpPostMultipartRequestDecoder.skipControlCharacters(this.undecodedChunk);
                                newline = HttpPostMultipartRequestDecoder.readLineOptimized(this.undecodedChunk, this.charset);
                            }
                            catch (HttpPostRequestDecoder.NotEnoughDataDecoderException ignored) {
                                this.undecodedChunk.readerIndex(readerIndex);
                                return null;
                            }
                            contents = HttpPostMultipartRequestDecoder.splitMultipartHeader(newline);
                            if (!HttpHeaderNames.CONTENT_DISPOSITION.contentEqualsIgnoreCase(contents[0])) break block38;
                            if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
                                checkSecondArg = HttpHeaderValues.FORM_DATA.contentEqualsIgnoreCase(contents[1]);
                            } else {
                                v0 = checkSecondArg = HttpHeaderValues.ATTACHMENT.contentEqualsIgnoreCase(contents[1]) != false || HttpHeaderValues.FILE.contentEqualsIgnoreCase(contents[1]) != false;
                            }
                            if (!checkSecondArg) continue;
                            break block39;
                        }
                        if (HttpHeaderNames.CONTENT_TRANSFER_ENCODING.contentEqualsIgnoreCase(contents[0])) {
                            try {
                                attribute = this.factory.createAttribute(this.request, HttpHeaderNames.CONTENT_TRANSFER_ENCODING.toString(), HttpPostMultipartRequestDecoder.cleanString(contents[1]));
                            }
                            catch (NullPointerException e) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                            }
                            catch (IllegalArgumentException e) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                            }
                            this.currentFieldAttributes.put(HttpHeaderNames.CONTENT_TRANSFER_ENCODING, attribute);
                            continue;
                        }
                        if (HttpHeaderNames.CONTENT_LENGTH.contentEqualsIgnoreCase(contents[0])) {
                            try {
                                attribute = this.factory.createAttribute(this.request, HttpHeaderNames.CONTENT_LENGTH.toString(), HttpPostMultipartRequestDecoder.cleanString(contents[1]));
                            }
                            catch (NullPointerException e) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                            }
                            catch (IllegalArgumentException e) {
                                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                            }
                            this.currentFieldAttributes.put(HttpHeaderNames.CONTENT_LENGTH, attribute);
                            continue;
                        }
                        if (!HttpHeaderNames.CONTENT_TYPE.contentEqualsIgnoreCase(contents[0])) continue;
                        if (HttpHeaderValues.MULTIPART_MIXED.contentEqualsIgnoreCase(contents[1])) {
                            if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
                                values = StringUtil.substringAfter(contents[2], '=');
                                this.multipartMixedBoundary = "--" + values;
                                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER;
                                return this.decodeMultipart(HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER);
                            }
                            throw new HttpPostRequestDecoder.ErrorDataDecoderException("Mixed Multipart found in a previous Mixed Multipart");
                        }
                        break block40;
                    }
                    filenameAttribute = this.currentFieldAttributes.get(HttpHeaderValues.FILENAME);
                    if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.DISPOSITION) {
                        if (filenameAttribute != null) {
                            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD;
                            return this.decodeMultipart(HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD);
                        }
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.FIELD;
                        return this.decodeMultipart(HttpPostRequestDecoder.MultiPartStatus.FIELD);
                    }
                    if (filenameAttribute != null) {
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD;
                        return this.decodeMultipart(HttpPostRequestDecoder.MultiPartStatus.MIXEDFILEUPLOAD);
                    }
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException("Filename not found");
                }
                i = 2;
                while (true) {
                    if (i >= contents.length) continue block20;
                    values /* !! */  = contents[i].split("=", 2);
                    try {
                        attribute = this.getContentDispositionAttribute(values /* !! */ );
                    }
                    catch (NullPointerException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IllegalArgumentException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    this.currentFieldAttributes.put(attribute.getName(), attribute);
                    ++i;
                }
            }
            i = 1;
            while (true) {
                if (i >= contents.length) ** break;
                charsetHeader = HttpHeaderValues.CHARSET.toString();
                if (contents[i].regionMatches(true, 0, charsetHeader, 0, charsetHeader.length())) {
                    values /* !! */  = StringUtil.substringAfter(contents[i], '=');
                    try {
                        attribute = this.factory.createAttribute(this.request, charsetHeader, HttpPostMultipartRequestDecoder.cleanString((String)values /* !! */ ));
                    }
                    catch (NullPointerException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IllegalArgumentException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    this.currentFieldAttributes.put(HttpHeaderValues.CHARSET, attribute);
                } else if (contents[i].contains("=")) {
                    name = StringUtil.substringBefore(contents[i], '=');
                    values = StringUtil.substringAfter(contents[i], '=');
                    try {
                        attribute = this.factory.createAttribute(this.request, HttpPostMultipartRequestDecoder.cleanString(name), values);
                    }
                    catch (NullPointerException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IllegalArgumentException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    this.currentFieldAttributes.put(name, attribute);
                } else {
                    try {
                        attribute = this.factory.createAttribute(this.request, HttpPostMultipartRequestDecoder.cleanString(contents[0]), contents[i]);
                    }
                    catch (NullPointerException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    catch (IllegalArgumentException e) {
                        throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                    }
                    this.currentFieldAttributes.put(attribute.getName(), attribute);
                }
                ++i;
            }
            break;
        }
    }

    private Attribute getContentDispositionAttribute(String ... values) {
        String name = HttpPostMultipartRequestDecoder.cleanString(values[0]);
        String value = values[1];
        if (HttpHeaderValues.FILENAME.contentEquals(name)) {
            int last = value.length() - 1;
            if (last > 0 && value.charAt(0) == '\"' && value.charAt(last) == '\"') {
                value = value.substring(1, last);
            }
        } else if (FILENAME_ENCODED.equals(name)) {
            try {
                name = HttpHeaderValues.FILENAME.toString();
                String[] split = HttpPostMultipartRequestDecoder.cleanString(value).split("'", 3);
                value = QueryStringDecoder.decodeComponent(split[2], Charset.forName(split[0]));
            }
            catch (ArrayIndexOutOfBoundsException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            catch (UnsupportedCharsetException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
        } else {
            value = HttpPostMultipartRequestDecoder.cleanString(value);
        }
        return this.factory.createAttribute(this.request, name, value);
    }

    protected InterfaceHttpData getFileUpload(String delimiter) {
        Attribute charsetAttribute;
        Attribute encoding = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_TRANSFER_ENCODING);
        Charset localCharset = this.charset;
        HttpPostBodyUtil.TransferEncodingMechanism mechanism = HttpPostBodyUtil.TransferEncodingMechanism.BIT7;
        if (encoding != null) {
            String code;
            try {
                code = encoding.getValue().toLowerCase();
            }
            catch (IOException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            if (code.equals(HttpPostBodyUtil.TransferEncodingMechanism.BIT7.value())) {
                localCharset = CharsetUtil.US_ASCII;
            } else if (code.equals(HttpPostBodyUtil.TransferEncodingMechanism.BIT8.value())) {
                localCharset = CharsetUtil.ISO_8859_1;
                mechanism = HttpPostBodyUtil.TransferEncodingMechanism.BIT8;
            } else {
                if (!code.equals(HttpPostBodyUtil.TransferEncodingMechanism.BINARY.value())) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException("TransferEncoding Unknown: " + code);
                }
                mechanism = HttpPostBodyUtil.TransferEncodingMechanism.BINARY;
            }
        }
        if ((charsetAttribute = this.currentFieldAttributes.get(HttpHeaderValues.CHARSET)) != null) {
            try {
                localCharset = Charset.forName(charsetAttribute.getValue());
            }
            catch (IOException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            catch (UnsupportedCharsetException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
        }
        if (this.currentFileUpload == null) {
            long size;
            Attribute filenameAttribute = this.currentFieldAttributes.get(HttpHeaderValues.FILENAME);
            Attribute nameAttribute = this.currentFieldAttributes.get(HttpHeaderValues.NAME);
            Attribute contentTypeAttribute = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_TYPE);
            Attribute lengthAttribute = this.currentFieldAttributes.get(HttpHeaderNames.CONTENT_LENGTH);
            try {
                size = lengthAttribute != null ? Long.parseLong(lengthAttribute.getValue()) : 0L;
            }
            catch (IOException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            catch (NumberFormatException ignored) {
                size = 0L;
            }
            try {
                String contentType = contentTypeAttribute != null ? contentTypeAttribute.getValue() : "application/octet-stream";
                this.currentFileUpload = this.factory.createFileUpload(this.request, HttpPostMultipartRequestDecoder.cleanString(nameAttribute.getValue()), HttpPostMultipartRequestDecoder.cleanString(filenameAttribute.getValue()), contentType, mechanism.value(), localCharset, size);
            }
            catch (NullPointerException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            catch (IllegalArgumentException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            catch (IOException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
        }
        if (!HttpPostMultipartRequestDecoder.loadDataMultipartOptimized(this.undecodedChunk, delimiter, this.currentFileUpload)) {
            return null;
        }
        if (!this.currentFileUpload.isCompleted()) {
            return null;
        }
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.FILEUPLOAD) {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.HEADERDELIMITER;
            this.currentFieldAttributes = null;
        } else {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.MIXEDDELIMITER;
            this.cleanMixedAttributes();
        }
        FileUpload fileUpload = this.currentFileUpload;
        this.currentFileUpload = null;
        return fileUpload;
    }

    @Override
    public void destroy() {
        this.cleanFiles();
        for (InterfaceHttpData httpData : this.bodyListHttpData) {
            if (httpData.refCnt() <= 0) continue;
            httpData.release();
        }
        this.destroyed = true;
        if (this.undecodedChunk != null && this.undecodedChunk.refCnt() > 0) {
            this.undecodedChunk.release();
            this.undecodedChunk = null;
        }
    }

    @Override
    public void cleanFiles() {
        this.checkDestroyed();
        this.factory.cleanRequestHttpData(this.request);
    }

    @Override
    public void removeHttpDataFromClean(InterfaceHttpData data) {
        this.checkDestroyed();
        this.factory.removeHttpDataFromClean(this.request, data);
    }

    private void cleanMixedAttributes() {
        this.currentFieldAttributes.remove(HttpHeaderValues.CHARSET);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_LENGTH);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_TRANSFER_ENCODING);
        this.currentFieldAttributes.remove(HttpHeaderNames.CONTENT_TYPE);
        this.currentFieldAttributes.remove(HttpHeaderValues.FILENAME);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String readLineOptimized(ByteBuf undecodedChunk, Charset charset) {
        int readerIndex = undecodedChunk.readerIndex();
        ReferenceCounted line = null;
        try {
            if (undecodedChunk.isReadable()) {
                int posLfOrCrLf = HttpPostBodyUtil.findLineBreak(undecodedChunk, undecodedChunk.readerIndex());
                if (posLfOrCrLf <= 0) {
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                }
                try {
                    line = undecodedChunk.alloc().heapBuffer(posLfOrCrLf);
                    ((ByteBuf)line).writeBytes(undecodedChunk, posLfOrCrLf);
                    byte nextByte = undecodedChunk.readByte();
                    if (nextByte == 13) {
                        undecodedChunk.readByte();
                    }
                    String string = ((ByteBuf)line).toString(charset);
                    return string;
                }
                finally {
                    line.release();
                }
            }
        }
        catch (IndexOutOfBoundsException e) {
            undecodedChunk.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e);
        }
        undecodedChunk.readerIndex(readerIndex);
        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
    }

    private static String readDelimiterOptimized(ByteBuf undecodedChunk, String delimiter, Charset charset) {
        int readerIndex = undecodedChunk.readerIndex();
        byte[] bdelimiter = delimiter.getBytes(charset);
        int delimiterLength = bdelimiter.length;
        try {
            int delimiterPos = HttpPostBodyUtil.findDelimiter(undecodedChunk, readerIndex, bdelimiter, false);
            if (delimiterPos < 0) {
                undecodedChunk.readerIndex(readerIndex);
                throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
            }
            StringBuilder sb = new StringBuilder(delimiter);
            undecodedChunk.readerIndex(readerIndex + delimiterPos + delimiterLength);
            if (undecodedChunk.isReadable()) {
                byte nextByte = undecodedChunk.readByte();
                if (nextByte == 13) {
                    nextByte = undecodedChunk.readByte();
                    if (nextByte == 10) {
                        return sb.toString();
                    }
                    undecodedChunk.readerIndex(readerIndex);
                    throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                }
                if (nextByte == 10) {
                    return sb.toString();
                }
                if (nextByte == 45) {
                    sb.append('-');
                    nextByte = undecodedChunk.readByte();
                    if (nextByte == 45) {
                        sb.append('-');
                        if (!undecodedChunk.isReadable()) {
                            return sb.toString();
                        }
                        nextByte = undecodedChunk.readByte();
                        if (nextByte == 13) {
                            nextByte = undecodedChunk.readByte();
                            if (nextByte == 10) {
                                return sb.toString();
                            }
                            undecodedChunk.readerIndex(readerIndex);
                            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
                        }
                        if (nextByte == 10) {
                            return sb.toString();
                        }
                        undecodedChunk.readerIndex(undecodedChunk.readerIndex() - 1);
                        return sb.toString();
                    }
                }
            }
        }
        catch (IndexOutOfBoundsException e) {
            undecodedChunk.readerIndex(readerIndex);
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException(e);
        }
        undecodedChunk.readerIndex(readerIndex);
        throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
    }

    private static void rewriteCurrentBuffer(ByteBuf buffer, int lengthToSkip) {
        if (lengthToSkip == 0) {
            return;
        }
        int readerIndex = buffer.readerIndex();
        int readableBytes = buffer.readableBytes();
        if (readableBytes == lengthToSkip) {
            buffer.readerIndex(readerIndex);
            buffer.writerIndex(readerIndex);
            return;
        }
        buffer.setBytes(readerIndex, buffer, readerIndex + lengthToSkip, readableBytes - lengthToSkip);
        buffer.readerIndex(readerIndex);
        buffer.writerIndex(readerIndex + readableBytes - lengthToSkip);
    }

    private static boolean loadDataMultipartOptimized(ByteBuf undecodedChunk, String delimiter, HttpData httpData) {
        byte[] bdelimiter;
        if (!undecodedChunk.isReadable()) {
            return false;
        }
        int startReaderIndex = undecodedChunk.readerIndex();
        int posDelimiter = HttpPostBodyUtil.findDelimiter(undecodedChunk, startReaderIndex, bdelimiter = delimiter.getBytes(httpData.getCharset()), true);
        if (posDelimiter < 0) {
            int readableBytes = undecodedChunk.readableBytes();
            int lastPosition = readableBytes - bdelimiter.length - 1;
            if (lastPosition < 0) {
                lastPosition = 0;
            }
            if ((posDelimiter = HttpPostBodyUtil.findLastLineBreak(undecodedChunk, startReaderIndex + lastPosition)) < 0 && httpData.definedLength() == httpData.length() + (long)readableBytes - 1L && undecodedChunk.getByte(readableBytes + startReaderIndex - 1) == 13) {
                lastPosition = 0;
                posDelimiter = readableBytes - 1;
            }
            if (posDelimiter < 0) {
                ByteBuf content = undecodedChunk.copy();
                try {
                    httpData.addContent(content, false);
                }
                catch (IOException e) {
                    throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
                }
                undecodedChunk.readerIndex(startReaderIndex);
                undecodedChunk.writerIndex(startReaderIndex);
                return false;
            }
            if ((posDelimiter += lastPosition) == 0) {
                return false;
            }
            ByteBuf content = undecodedChunk.copy(startReaderIndex, posDelimiter);
            try {
                httpData.addContent(content, false);
            }
            catch (IOException e) {
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
            HttpPostMultipartRequestDecoder.rewriteCurrentBuffer(undecodedChunk, posDelimiter);
            return false;
        }
        ByteBuf content = undecodedChunk.copy(startReaderIndex, posDelimiter);
        try {
            httpData.addContent(content, true);
        }
        catch (IOException e) {
            throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
        }
        HttpPostMultipartRequestDecoder.rewriteCurrentBuffer(undecodedChunk, posDelimiter);
        return true;
    }

    private static String cleanString(String field) {
        int size = field.length();
        StringBuilder sb = new StringBuilder(size);
        int i = 0;
        while (i < size) {
            char nextChar = field.charAt(i);
            switch (nextChar) {
                case '\t': 
                case ',': 
                case ':': 
                case ';': 
                case '=': {
                    sb.append(' ');
                    break;
                }
                case '\"': {
                    break;
                }
                default: {
                    sb.append(nextChar);
                }
            }
            ++i;
        }
        return sb.toString().trim();
    }

    private boolean skipOneLine() {
        if (!this.undecodedChunk.isReadable()) {
            return false;
        }
        byte nextByte = this.undecodedChunk.readByte();
        if (nextByte == 13) {
            if (!this.undecodedChunk.isReadable()) {
                this.undecodedChunk.readerIndex(this.undecodedChunk.readerIndex() - 1);
                return false;
            }
            nextByte = this.undecodedChunk.readByte();
            if (nextByte == 10) {
                return true;
            }
            this.undecodedChunk.readerIndex(this.undecodedChunk.readerIndex() - 2);
            return false;
        }
        if (nextByte == 10) {
            return true;
        }
        this.undecodedChunk.readerIndex(this.undecodedChunk.readerIndex() - 1);
        return false;
    }

    private static String[] splitMultipartHeader(String sb) {
        int colonEnd;
        int nameStart;
        char ch;
        int nameEnd;
        ArrayList<String> headers = new ArrayList<String>(1);
        for (nameEnd = nameStart = HttpPostBodyUtil.findNonWhitespace(sb, 0); nameEnd < sb.length() && (ch = sb.charAt(nameEnd)) != ':' && !Character.isWhitespace(ch); ++nameEnd) {
        }
        for (colonEnd = nameEnd; colonEnd < sb.length(); ++colonEnd) {
            if (sb.charAt(colonEnd) != ':') continue;
            ++colonEnd;
            break;
        }
        int valueStart = HttpPostBodyUtil.findNonWhitespace(sb, colonEnd);
        int valueEnd = HttpPostBodyUtil.findEndOfString(sb);
        headers.add(sb.substring(nameStart, nameEnd));
        String svalue = valueStart >= valueEnd ? "" : sb.substring(valueStart, valueEnd);
        String[] values = svalue.indexOf(59) >= 0 ? HttpPostMultipartRequestDecoder.splitMultipartHeaderValues(svalue) : svalue.split(",");
        for (String value : values) {
            headers.add(value.trim());
        }
        String[] array = new String[headers.size()];
        int i = 0;
        while (i < headers.size()) {
            array[i] = (String)headers.get(i);
            ++i;
        }
        return array;
    }

    private static String[] splitMultipartHeaderValues(String svalue) {
        ArrayList<String> values = InternalThreadLocalMap.get().arrayList(1);
        boolean inQuote = false;
        boolean escapeNext = false;
        int start = 0;
        int i = 0;
        while (true) {
            if (i >= svalue.length()) {
                values.add(svalue.substring(start));
                return values.toArray(EmptyArrays.EMPTY_STRINGS);
            }
            char c = svalue.charAt(i);
            if (inQuote) {
                if (escapeNext) {
                    escapeNext = false;
                } else if (c == '\\') {
                    escapeNext = true;
                } else if (c == '\"') {
                    inQuote = false;
                }
            } else if (c == '\"') {
                inQuote = true;
            } else if (c == ';') {
                values.add(svalue.substring(start, i));
                start = i + 1;
            }
            ++i;
        }
    }

    int getCurrentAllocatedCapacity() {
        return this.undecodedChunk.capacity();
    }
}

