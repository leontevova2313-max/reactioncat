/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.http;

import io.netty.handler.codec.http.HttpConstants;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.StringUtil;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

public class QueryStringEncoder {
    private final Charset charset;
    private final StringBuilder uriBuilder;
    private boolean hasParams;
    private static final byte WRITE_UTF_UNKNOWN = 63;
    private static final char[] CHAR_MAP = "0123456789ABCDEF".toCharArray();

    public QueryStringEncoder(String uri) {
        this(uri, HttpConstants.DEFAULT_CHARSET);
    }

    public QueryStringEncoder(String uri, Charset charset) {
        ObjectUtil.checkNotNull(charset, "charset");
        this.uriBuilder = new StringBuilder(uri);
        this.charset = CharsetUtil.UTF_8.equals(charset) ? null : charset;
    }

    public void addParam(String name, String value) {
        ObjectUtil.checkNotNull(name, "name");
        if (this.hasParams) {
            this.uriBuilder.append('&');
        } else {
            this.uriBuilder.append('?');
            this.hasParams = true;
        }
        this.encodeComponent(name);
        if (value != null) {
            this.uriBuilder.append('=');
            this.encodeComponent(value);
        }
    }

    private void encodeComponent(CharSequence s) {
        if (this.charset == null) {
            this.encodeUtf8Component(s);
        } else {
            this.encodeNonUtf8Component(s);
        }
    }

    public URI toUri() throws URISyntaxException {
        return new URI(this.toString());
    }

    public String toString() {
        return this.uriBuilder.toString();
    }

    /*
     * Unable to fully structure code
     */
    private void encodeNonUtf8Component(CharSequence s) {
        buf = null;
        i = 0;
        len = s.length();
        block0: while (true) {
            if (i >= len) {
                return;
            }
            c = s.charAt(i);
            if (QueryStringEncoder.dontNeedEncoding(c)) {
                this.uriBuilder.append(c);
                ++i;
                continue;
            }
            index = 0;
            if (buf == null) {
                buf = new char[s.length() - i];
            }
            do {
                buf[index] = c;
                ++index;
            } while (++i < s.length() && !QueryStringEncoder.dontNeedEncoding(c = s.charAt(i)));
            var8_8 = bytes = new String(buf, 0, index).getBytes(this.charset);
            var9_9 = var8_8.length;
            var10_10 = 0;
            while (true) {
                if (var10_10 < var9_9) ** break;
                continue block0;
                b = var8_8[var10_10];
                this.appendEncoded(b);
                ++var10_10;
            }
            break;
        }
    }

    private void encodeUtf8Component(CharSequence s) {
        int i = 0;
        int len = s.length();
        while (true) {
            if (i >= len) {
                this.uriBuilder.append(s);
                return;
            }
            char c = s.charAt(i);
            if (!QueryStringEncoder.dontNeedEncoding(c)) {
                this.encodeUtf8Component(s, i, len);
                return;
            }
            ++i;
        }
    }

    private void encodeUtf8Component(CharSequence s, int encodingStart, int len) {
        if (encodingStart > 0) {
            this.uriBuilder.append(s, 0, encodingStart);
        }
        this.encodeUtf8ComponentSlow(s, encodingStart, len);
    }

    private void encodeUtf8ComponentSlow(CharSequence s, int start, int len) {
        for (int i = start; i < len; ++i) {
            char c = s.charAt(i);
            if (c < '\u0080') {
                if (QueryStringEncoder.dontNeedEncoding(c)) {
                    this.uriBuilder.append(c);
                    continue;
                }
                this.appendEncoded(c);
                continue;
            }
            if (c < '\u0800') {
                this.appendEncoded(0xC0 | c >> 6);
                this.appendEncoded(0x80 | c & 0x3F);
                continue;
            }
            if (StringUtil.isSurrogate(c)) {
                if (!Character.isHighSurrogate(c)) {
                    this.appendEncoded(63);
                    continue;
                }
                if (++i == s.length()) {
                    this.appendEncoded(63);
                    break;
                }
                this.writeUtf8Surrogate(c, s.charAt(i));
                continue;
            }
            this.appendEncoded(0xE0 | c >> 12);
            this.appendEncoded(0x80 | c >> 6 & 0x3F);
            this.appendEncoded(0x80 | c & 0x3F);
        }
    }

    private void writeUtf8Surrogate(char c, char c2) {
        if (Character.isLowSurrogate(c2)) {
            int codePoint = Character.toCodePoint(c, c2);
            this.appendEncoded(0xF0 | codePoint >> 18);
            this.appendEncoded(0x80 | codePoint >> 12 & 0x3F);
            this.appendEncoded(0x80 | codePoint >> 6 & 0x3F);
            this.appendEncoded(0x80 | codePoint & 0x3F);
            return;
        }
        this.appendEncoded(63);
        this.appendEncoded(Character.isHighSurrogate(c2) ? 63 : (int)c2);
    }

    private void appendEncoded(int b) {
        this.uriBuilder.append('%').append(QueryStringEncoder.forDigit(b >> 4)).append(QueryStringEncoder.forDigit(b));
    }

    private static char forDigit(int digit) {
        return CHAR_MAP[digit & 0xF];
    }

    private static boolean dontNeedEncoding(char ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9' || ch == '-' || ch == '_' || ch == '.' || ch == '*' || ch == '~';
    }
}

