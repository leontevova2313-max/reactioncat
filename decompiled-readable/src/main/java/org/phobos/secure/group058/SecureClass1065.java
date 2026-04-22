/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group058;

import io.netty.buffer.ByteBuf;

public class SecureClass1065 {
    public static /* bridge */ /* synthetic */ int rq9EsHmFLhJOgUv9B7IKsRl99bhsNn6J(ByteBuf yruLJTgMd6M1p9Hg4tQ36it0C4niS0NO) {
        byte field001;
        int n = 0;
        int field002 = 0;
        do {
            field001 = yruLJTgMd6M1p9Hg4tQ36it0C4niS0NO.readByte();
            n |= (field001 & 0x7F) << field002++ * 7;
            if (field002 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while (SecureClass1065.B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(field001));
        return n;
    }

    public static /* bridge */ /* synthetic */ boolean B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(byte tRaCW225AhqnH3OFx9aKFUsPzAIVx55w) {
        return (tRaCW225AhqnH3OFx9aKFUsPzAIVx55w & 0x80) == 128;
    }

    public static /* bridge */ /* synthetic */ int DOzbeFffPaqTzHmTqrqzx0oz6JwrFFBe(int baYjWbD38IDci21gdxbZL6Z6W4kAwj6b) {
        int field003 = 1;
        while (field003 < 5) {
            if ((baYjWbD38IDci21gdxbZL6Z6W4kAwj6b & -1 << field003 * 7) == 0) {
                return field003;
            }
            ++field003;
        }
        return 5;
    }

    public static /* bridge */ /* synthetic */ ByteBuf JMbqNqs0ttE83YlrWILwUCbjjTb6wp6q(ByteBuf field004, int hNciUfBPwKQzd5bshtgyk4BlQtypbaok) {
        while (true) {
            if ((hNciUfBPwKQzd5bshtgyk4BlQtypbaok & 0xFFFFFF80) == 0) {
                field004.writeByte(hNciUfBPwKQzd5bshtgyk4BlQtypbaok);
                return field004;
            }
            field004.writeByte(hNciUfBPwKQzd5bshtgyk4BlQtypbaok & 0x7F | 0x80);
            hNciUfBPwKQzd5bshtgyk4BlQtypbaok >>>= 7;
        }
    }
}

