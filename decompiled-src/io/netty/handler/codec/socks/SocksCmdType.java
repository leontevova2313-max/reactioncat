/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

public enum SocksCmdType {
    CONNECT(1),
    BIND(2),
    UDP(3),
    UNKNOWN(-1);

    private final byte b;

    private SocksCmdType(byte b) {
        this.b = b;
    }

    @Deprecated
    public static SocksCmdType fromByte(byte b) {
        return SocksCmdType.valueOf(b);
    }

    public static SocksCmdType valueOf(byte b) {
        SocksCmdType[] socksCmdTypeArray = SocksCmdType.values();
        int n = socksCmdTypeArray.length;
        int n2 = 0;
        while (n2 < n) {
            SocksCmdType code = socksCmdTypeArray[n2];
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

