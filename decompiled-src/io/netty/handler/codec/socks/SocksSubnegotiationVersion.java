/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksSubnegotiationVersion {
    AUTH_PASSWORD(1),
    UNKNOWN(-1);

    private final byte b;

    private SocksSubnegotiationVersion(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksSubnegotiationVersion fromByte(byte b) {
        return SocksSubnegotiationVersion.valueOf(b);
    }

    public static SocksSubnegotiationVersion valueOf(byte b) {
        SocksSubnegotiationVersion[] socksSubnegotiationVersionArray = SocksSubnegotiationVersion.values();
        int n = socksSubnegotiationVersionArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksSubnegotiationVersion code = socksSubnegotiationVersionArray[n2];
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

