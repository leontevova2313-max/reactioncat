/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksAuthScheme {
    NO_AUTH(0),
    AUTH_GSSAPI(1),
    AUTH_PASSWORD(2),
    UNKNOWN(-1);

    private final byte b;

    private SocksAuthScheme(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksAuthScheme fromByte(byte b) {
        return SocksAuthScheme.valueOf(b);
    }

    public static SocksAuthScheme valueOf(byte b) {
        SocksAuthScheme[] socksAuthSchemeArray = SocksAuthScheme.values();
        int n = socksAuthSchemeArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksAuthScheme code = socksAuthSchemeArray[n2];
            if (code.b == b) {
                return code;
            }
            ++n2;
        }
        return UNKNOWN;
    }

    public byte byteValue() {
        return this.b;
    }
}

