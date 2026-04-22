/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import org.phobos.secure.group058.SecureClass1065;

public class SecureClass0249
extends ByteToMessageDecoder {
    public static final /* synthetic */ int field001 = 3;
    public final /* synthetic */ ByteBuf field002;

    public /* synthetic */ SecureClass0249() {
        this.field002 = Unpooled.directBuffer(3);
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
            byte field003 = byteBuf.readByte();
            vIGXIC4a6mfzEFAL3hw4tS4MkNVrJKzr.writeByte(field003);
            if (!SecureClass1065.B143YUuPgZQv0eUkD7IdjGvuUiWjygV4(field003)) {
                return true;
            }
            ++n;
        }
    }
}

