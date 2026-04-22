/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksProtocolVersion {
    SOCKS4a(4),
    SOCKS5(5),
    UNKNOWN(-1);

    private final byte b;

    private SocksProtocolVersion(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksProtocolVersion fromByte(byte b) {
        return SocksProtocolVersion.valueOf(b);
    }

    public static SocksProtocolVersion valueOf(byte b) {
        SocksProtocolVersion[] socksProtocolVersionArray = SocksProtocolVersion.values();
        int n = socksProtocolVersionArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksProtocolVersion code = socksProtocolVersionArray[n2];
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

