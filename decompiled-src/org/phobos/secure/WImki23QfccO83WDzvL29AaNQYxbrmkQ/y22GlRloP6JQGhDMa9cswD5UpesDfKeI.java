/*
 * Decompiled with CFR.
 */
package org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ;

import io.netty.buffer.ByteBuf;

public class y22GlRloP6JQGhDMa9cswD5UpesDfKeI {
    public static /* bridge */ /* synthetic */ int rq9EsHmFLhJOgUv9B7IKsRl99bhsNn6J(ByteBuf yruLJTgMd6M1p9Hg4tQ36it0C4niS0NO) {
        byte jbYtwMktKa84rEV3kFjzqkIwjp4LZYiE;
        int n = 0;
        int v51Hr9qZ9645qv75Vrtc3oPhY11cZmrG = 0;
        do {
            jbYtwMktKa84rEV3kFjzqkIwjp4LZYiE = yruLJTgMd6M1p9Hg4tQ36it0C4niS0NO.readByte();
            n |= (jbYtwMktKa84rEV3kFjzqkIwjp4LZYiE & 0x7F) << v51Hr9qZ9645qv75Vrtc3oPhY11cZmrG++ * 7;
            if (v51Hr9qZ9645qv75Vrtc3oPhY11cZmrG <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while (y22GlRloP6JQGhDMa9cswD5UpesDfKeI.B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(jbYtwMktKa84rEV3kFjzqkIwjp4LZYiE));
        return n;
    }

    public static /* bridge */ /* synthetic */ boolean B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(byte tRaCW225AhqnH3OFx9aKFUsPzAIVx55w) {
        return (tRaCW225AhqnH3OFx9aKFUsPzAIVx55w & 0x80) == 128;
    }

    public static /* bridge */ /* synthetic */ int DOzbeFffPaqTzHmTqrqzx0oz6JwrFFBe(int baYjWbD38IDci21gdxbZL6Z6W4kAwj6b) {
        int h5P9sdBKEXc9ZIZl5Y1KE8psFVENBJgN = 1;
        while (h5P9sdBKEXc9ZIZl5Y1KE8psFVENBJgN < 5) {
            if ((baYjWbD38IDci21gdxbZL6Z6W4kAwj6b & -1 << h5P9sdBKEXc9ZIZl5Y1KE8psFVENBJgN * 7) == 0) {
                return h5P9sdBKEXc9ZIZl5Y1KE8psFVENBJgN;
            }
            ++h5P9sdBKEXc9ZIZl5Y1KE8psFVENBJgN;
        }
        return 5;
    }

    public static /* bridge */ /* synthetic */ ByteBuf JMbqNqs0ttE83YlrWILwUCbjjTb6wp6q(ByteBuf hcSjofDG2cWb0s6pAjT5S54QwcRaB3Hv, int hNciUfBPwKQzd5bshtgyk4BlQtypbaok) {
        while (true) {
            if ((hNciUfBPwKQzd5bshtgyk4BlQtypbaok & 0xFFFFFF80) == 0) {
                hcSjofDG2cWb0s6pAjT5S54QwcRaB3Hv.writeByte(hNciUfBPwKQzd5bshtgyk4BlQtypbaok);
                return hcSjofDG2cWb0s6pAjT5S54QwcRaB3Hv;
            }
            hcSjofDG2cWb0s6pAjT5S54QwcRaB3Hv.writeByte(hNciUfBPwKQzd5bshtgyk4BlQtypbaok & 0x7F | 0x80);
            hNciUfBPwKQzd5bshtgyk4BlQtypbaok >>>= 7;
        }
    }
}

