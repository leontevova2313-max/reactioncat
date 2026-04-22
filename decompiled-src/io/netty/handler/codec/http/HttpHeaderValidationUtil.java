/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.http;

import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.util.AsciiString;

public final class HttpHeaderValidationUtil {
    private static final long TOKEN_CHARS_HIGH;
    private static final long TOKEN_CHARS_LOW;

    private HttpHeaderValidationUtil() {
    }

    public static boolean isConnectionHeader(CharSequence name, boolean ignoreTeHeader) {
        int len = name.length();
        switch (len) {
            case 2: {
                return ignoreTeHeader ? false : AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.TE);
            }
            case 7: {
                return AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.UPGRADE);
            }
            case 10: {
                return AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.CONNECTION) || AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.KEEP_ALIVE);
            }
            case 16: {
                return AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.PROXY_CONNECTION);
            }
            case 17: {
                return AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.TRANSFER_ENCODING);
            }
        }
        return false;
    }

    public static boolean isTeNotTrailers(CharSequence name, CharSequence value) {
        if (name.length() != 2) {
            return false;
        }
        return AsciiString.contentEqualsIgnoreCase(name, HttpHeaderNames.TE) && !AsciiString.contentEqualsIgnoreCase(value, HttpHeaderValues.TRAILERS);
    }

    public static int validateValidHeaderValue(CharSequence value) {
        int length = value.length();
        if (length == 0) {
            return -1;
        }
        if (value instanceof AsciiString) {
            return HttpHeaderValidationUtil.verifyValidHeaderValueAsciiString((AsciiString)value);
        }
        return HttpHeaderValidationUtil.verifyValidHeaderValueCharSequence(value);
    }

    private static int verifyValidHeaderValueAsciiString(AsciiString value) {
        int start;
        byte[] array = value.array();
        int b = array[start = value.arrayOffset()] & 0xFF;
        if (b < 33 || b == 127) {
            return 0;
        }
        int length = value.length();
        int i = start + 1;
        while (i < length) {
            b = array[i] & 0xFF;
            if (b < 32 && b != 9 || b == 127) {
                return i - start;
            }
            ++i;
        }
        return -1;
    }

    private static int verifyValidHeaderValueCharSequence(CharSequence value) {
        char b = value.charAt(0);
        if (b < '!' || b == '\u007f' || '\u00ff' < b) {
            return 0;
        }
        int length = value.length();
        int i = 1;
        while (i < length) {
            b = value.charAt(i);
            if (b < ' ' && b != '\t' || b == '\u007f' || '\u00ff' < b) {
                return i;
            }
            ++i;
        }
        return -1;
    }

    public static int validateToken(CharSequence token) {
        if (token instanceof AsciiString) {
            return HttpHeaderValidationUtil.validateAsciiStringToken((AsciiString)token);
        }
        return HttpHeaderValidationUtil.validateCharSequenceToken(token);
    }

    private static int validateAsciiStringToken(AsciiString token) {
        byte[] array = token.array();
        int i = token.arrayOffset();
        int len = token.arrayOffset() + token.length();
        while (i < len) {
            if (!BitSet128.contains(array[i], TOKEN_CHARS_HIGH, TOKEN_CHARS_LOW)) {
                return i - token.arrayOffset();
            }
            ++i;
        }
        return -1;
    }

    private static int validateCharSequenceToken(CharSequence token) {
        int i = 0;
        int len = token.length();
        while (i < len) {
            byte value = (byte)token.charAt(i);
            if (!BitSet128.contains(value, TOKEN_CHARS_HIGH, TOKEN_CHARS_LOW)) {
                return i;
            }
            ++i;
        }
        return -1;
    }

    static {
        BitSet128 tokenChars = new BitSet128().range('0', '9').range('a', 'z').range('A', 'Z').bits('-', '.', '_', '~').bits('!', '#', '$', '%', '&', '\'', '*', '+', '^', '`', '|');
        TOKEN_CHARS_HIGH = tokenChars.high();
        TOKEN_CHARS_LOW = tokenChars.low();
    }

    private static final class BitSet128 {
        private long high;
        private long low;

        private BitSet128() {
        }

        BitSet128 range(char fromInc, char toInc) {
            int bit = fromInc;
            while (bit <= toInc) {
                if (bit < 64) {
                    this.low |= 1L << bit;
                } else {
                    this.high |= 1L << bit - 64;
                }
                ++bit;
            }
            return this;
        }

        BitSet128 bits(char ... bits) {
            char[] cArray = bits;
            int n = cArray.length;
            int n2 = 0;
            while (n2 < n) {
                char bit = cArray[n2];
                if (bit < '@') {
                    this.low |= 1L << bit;
                } else {
                    this.high |= 1L << bit - 64;
                }
                ++n2;
            }
            return this;
        }

        long high() {
            return this.high;
        }

        long low() {
            return this.low;
        }

        static boolean contains(byte bit, long high, long low) {
            if (bit < 0) {
                return false;
            }
            if (bit < 64) {
                return 0L != (low & 1L << bit);
            }
            return 0L != (high & 1L << bit - 64);
        }
    }
}

