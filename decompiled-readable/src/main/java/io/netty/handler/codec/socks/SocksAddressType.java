/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksAddressType {
    IPv4(1),
    DOMAIN(3),
    IPv6(4),
    UNKNOWN(-1);

    private final byte b;

    private SocksAddressType(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksAddressType fromByte(byte b) {
        return SocksAddressType.valueOf(b);
    }

    public static SocksAddressType valueOf(byte b) {
        SocksAddressType[] socksAddressTypeArray = SocksAddressType.values();
        int n = socksAddressTypeArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksAddressType code = socksAddressTypeArray[n2];
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

