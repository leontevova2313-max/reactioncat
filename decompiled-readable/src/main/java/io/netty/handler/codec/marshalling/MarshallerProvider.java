/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.marshalling;

import io.netty.channel.ChannelHandlerContext;
import org.jboss.marshalling.Marshaller;

public interface MarshallerProvider {
    public Marshaller getMarshaller(ChannelHandlerContext var1) throws Exception;
}

