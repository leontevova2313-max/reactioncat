/*
 * Decompiled with CFR.
 */
package org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.y22GlRloP6JQGhDMa9cswD5UpesDfKeI;

public class pT7TLm0qxSz03mkU95r94rJT0QyTYXCn
extends ByteToMessageDecoder {
    public static final /* synthetic */ int Mf38WqVgU6rqOAZRyiuiLCPBlbH24c9L = 3;
    public final /* synthetic */ ByteBuf zR9b7csLIBcIUCQYSkINUEJLWgaE2FOG;

    public /* synthetic */ pT7TLm0qxSz03mkU95r94rJT0QyTYXCn() {
        this.zR9b7csLIBcIUCQYSkINUEJLWgaE2FOG = Unpooled.directBuffer(3);
    }

    public static /* bridge */ /* synthetic */ boolean u6T5VEBgKwVedPCY5v2BYqVXh6UuaeOp(ByteBuf byteBuf, ByteBuf vIGXIC4a6mfzEFAL3hw4tS4MkNVrJKzr) {
        int n = 0;
        while (true) {
            if (n >= 3) {
                throw new CorruptedFrameException("length wider than 21-bit");
            }
            if (!byteBuf.isReadable()) {
                return false;
            }
            byte YetO3723lEk9a8dFvwTg7JzvtBjRmkTb = byteBuf.readByte();
            vIGXIC4a6mfzEFAL3hw4tS4MkNVrJKzr.writeByte(YetO3723lEk9a8dFvwTg7JzvtBjRmkTb);
            if (!y22GlRloP6JQGhDMa9cswD5UpesDfKeI.B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(YetO3723lEk9a8dFvwTg7JzvtBjRmkTb)) {
                return true;
            }
            ++n;
        }
    }
}

