/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksAuthStatus {
    SUCCESS(0),
    FAILURE(-1);

    private final byte b;

    private SocksAuthStatus(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksAuthStatus fromByte(byte b) {
        return SocksAuthStatus.valueOf(b);
    }

    public static SocksAuthStatus valueOf(byte b) {
        SocksAuthStatus[] socksAuthStatusArray = SocksAuthStatus.values();
        int n = socksAuthStatusArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksAuthStatus code = socksAuthStatusArray[n2];
            if (code.b == b) {
                return code;
            }
            ++n2;
        }
        return FAILURE;
    }

    public byte byteValue() {
        return this.b;
    }
}

