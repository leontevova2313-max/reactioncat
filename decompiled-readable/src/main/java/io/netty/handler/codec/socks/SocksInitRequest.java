/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.socks;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.socks.SocksAuthScheme;
import io.netty.handler.codec.socks.SocksRequest;
import io.netty.handler.codec.socks.SocksRequestType;
import io.netty.util.internal.ObjectUtil;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class SocksInitRequest
extends SocksRequest {
    private final List<SocksAuthScheme> authSchemes;

    public SocksInitRequest(List<SocksAuthScheme> authSchemes) {
        super(SocksRequestType.INIT);
        this.authSchemes = ObjectUtil.checkNotNull(authSchemes, "authSchemes");
    }

    public List<SocksAuthScheme> authSchemes() {
        return Collections.unmodifiableList(this.authSchemes);
    }

    @Override
    public void encodeAsByteBuf(ByteBuf byteBuf) {
        byteBuf.writeByte(this.protocolVersion().byteValue());
        byteBuf.writeByte(this.authSchemes.size());
        Iterator<SocksAuthScheme> iterator = this.authSchemes.iterator();
        while (iterator.hasNext()) {
            SocksAuthScheme authScheme = iterator.next();
            byteBuf.writeByte(authScheme.byteValue());
        }
        return;
    }
}

