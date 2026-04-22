/*
 * Decompiled with CFR.
 */
package io.netty.handler.ssl;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class PemReader {
    private static final InternalLogger logger = InternalLoggerFactory.getInstance(PemReader.class);
    private static final Pattern CERT_HEADER = Pattern.compile("-+BEGIN\\s[^-\\r\\n]*CERTIFICATE[^-\\r\\n]*-+(?:\\s|\\r|\\n)+");
    private static final Pattern CERT_FOOTER = Pattern.compile("-+END\\s[^-\\r\\n]*CERTIFICATE[^-\\r\\n]*-+(?:\\s|\\r|\\n)*");
    private static final Pattern KEY_HEADER = Pattern.compile("-+BEGIN\\s[^-\\r\\n]*PRIVATE\\s+KEY[^-\\r\\n]*-+(?:\\s|\\r|\\n)+");
    private static final Pattern KEY_FOOTER = Pattern.compile("-+END\\s[^-\\r\\n]*PRIVATE\\s+KEY[^-\\r\\n]*-+(?:\\s|\\r|\\n)*");
    private static final Pattern BODY = Pattern.compile("[a-z0-9+/=][a-z0-9+/=\\r\\n]*", 2);

    /*
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ByteBuf[] readCertificates(File file) throws CertificateException {
        try {
            FileInputStream in = new FileInputStream(file);
            try {
                ByteBuf[] byteBufArray = PemReader.readCertificates(in);
                return byteBufArray;
            }
            finally {
                PemReader.safeClose(in);
            }
        }
        catch (FileNotFoundException e) {
            throw new CertificateException("could not find certificate file: " + file);
        }
    }

    static ByteBuf[] readCertificates(InputStream in) throws CertificateException {
        String content;
        try {
            content = PemReader.readContent(in);
        }
        catch (IOException e) {
            throw new CertificateException("failed to read certificate input stream", e);
        }
        ArrayList<ByteBuf> certs = new ArrayList<ByteBuf>();
        Matcher m = CERT_HEADER.matcher(content);
        int start = 0;
        while (m.find(start)) {
            m.usePattern(BODY);
            if (!m.find()) break;
            ByteBuf base64 = Unpooled.copiedBuffer(m.group(0), CharsetUtil.US_ASCII);
            m.usePattern(CERT_FOOTER);
            if (!m.find()) break;
            ByteBuf der = Base64.decode(base64);
            base64.release();
            certs.add(der);
            start = m.end();
            m.usePattern(CERT_HEADER);
        }
        if (certs.isEmpty()) {
            throw new CertificateException("found no certificates in input stream");
        }
        return certs.toArray(new ByteBuf[0]);
    }

    /*
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ByteBuf readPrivateKey(File file) throws KeyException {
        try {
            FileInputStream in = new FileInputStream(file);
            try {
                ByteBuf byteBuf = PemReader.readPrivateKey(in);
                return byteBuf;
            }
            finally {
                PemReader.safeClose(in);
            }
        }
        catch (FileNotFoundException e) {
            throw new KeyException("could not find key file: " + file);
        }
    }

    static ByteBuf readPrivateKey(InputStream in) throws KeyException {
        String content;
        try {
            content = PemReader.readContent(in);
        }
        catch (IOException e) {
            throw new KeyException("failed to read key input stream", e);
        }
        Matcher m = KEY_HEADER.matcher(content);
        if (!m.find()) {
            throw PemReader.keyNotFoundException();
        }
        m.usePattern(BODY);
        if (!m.find()) {
            throw PemReader.keyNotFoundException();
        }
        ByteBuf base64 = Unpooled.copiedBuffer(m.group(0), CharsetUtil.US_ASCII);
        m.usePattern(KEY_FOOTER);
        if (!m.find()) {
            throw PemReader.keyNotFoundException();
        }
        ByteBuf der = Base64.decode(base64);
        base64.release();
        return der;
    }

    private static KeyException keyNotFoundException() {
        return new KeyException("could not find a PKCS #8 private key in input stream (see https://netty.io/wiki/sslcontextbuilder-and-private-key.html for more information)");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String readContent(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            byte[] buf = new byte[8192];
            while (true) {
                int ret;
                if ((ret = in.read(buf)) < 0) {
                    String string = out.toString(CharsetUtil.US_ASCII.name());
                    return string;
                }
                out.write(buf, 0, ret);
            }
        }
        finally {
            PemReader.safeClose(out);
        }
    }

    private static void safeClose(InputStream in) {
        try {
            in.close();
        }
        catch (IOException e) {
            logger.warn("Failed to close a stream.", e);
        }
    }

    private static void safeClose(OutputStream out) {
        try {
            out.close();
        }
        catch (IOException e) {
            logger.warn("Failed to close a stream.", e);
        }
    }

    private PemReader() {
    }
}

