/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.function.Function;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_7648;
import net.minecraft.class_8038;
import net.minecraft.class_8762;
import net.minecraft.class_9191;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group002.SecureClass0025;
import org.phobos.secure.group010.SecureClass0153;
import org.phobos.secure.group014.Uav8rUVDQXhLpv24KG69IxumAqYdM6c6;
import org.phobos.secure.group034.SecureClass0600;
import org.phobos.secure.group034.QtJL3nvotFcpGZktZW8qgApjWGz5foLa;
import org.phobos.secure.group060.SecureClass1087;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group044.EUOIYnZlODSHU4Bam8oau1LF2LacvSKZ;
import org.phobos.secure.group046.SecureClass0817;
import org.phobos.secure.group054.uKW2C6G4tQeRoIsxW3B4wD3p9ne9OT93;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2535.class})
public abstract class MixinClientConnection
implements EventSubscriber {
    private static final Logger nC5Ln5Xz2SD9FhWpcyQE9ejK2b4ZmO99 = LoggerFactory.getLogger(MixinClientConnection.class);

    @Unique
    private void readPacked(class_2596<?> packet, Function<class_2596<?>, SecureClass1087> eventFactory, @Nullable Function<class_2596<?>, SecureClass1087> postReceiveEventFactory) {
        if (!(packet instanceof class_8038)) {
            return;
        }
        class_8038 packed = (class_8038)packet;
        Iterator<T> iterator = packed.method_48324().iterator();
        while (iterator.hasNext()) {
            class_2596 unpacked = (class_2596)iterator.next();
            SecureClass1087 normal = eventFactory.apply(unpacked);
            this.invoke(normal, unpacked.getClass());
            if (!normal.isCancelled() || postReceiveEventFactory == null) continue;
            try {
                iterator.remove();
                this.invoke(postReceiveEventFactory.apply(unpacked), unpacked.getClass());
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
            }
        }
        return;
    }

    @Unique
    private SecureClass0153<?> getPostSend(class_2596<?> packet) {
        return new uKW2C6G4tQeRoIsxW3B4wD3p9ne9OT93<class_2596<?>>(packet);
    }

    @Inject(method={"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V"}, at={@At(value="RETURN")})
    private void channelRead0Hook2(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, CallbackInfo ci) {
        try {
            this.invoke(this.getPostReceive(packet), packet.getClass());
            this.readPacked(packet, this::getPostReceive, null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Inject(method={"sendImmediately"}, at={@At(value="RETURN")})
    private void sendImmediatelyHook2(class_2596<?> packet, @Nullable class_7648 callbacks, boolean flush, CallbackInfo ci) {
        this.invoke(this.getPostSend(packet), packet.getClass());
    }

    @Inject(method={"sendImmediately"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendImmediatelyHook1(class_2596<?> packet, @Nullable class_7648 callbacks, boolean flush, CallbackInfo ci) {
        this.invoke(this.getSend(packet), packet.getClass(), ci);
    }

    @Inject(method={"channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void channelRead0Hook1(ChannelHandlerContext channelHandlerContext, class_2596<?> packet, CallbackInfo ci) {
        try {
            this.invoke(this.getReceive(packet), packet.getClass(), ci);
            this.readPacked(packet, this::getReceive, this::getPostReceive);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Unique
    private SecureClass0153<?> getPostReceive(class_2596<?> packet) {
        return new QtJL3nvotFcpGZktZW8qgApjWGz5foLa<class_2596<?>>(packet);
    }

    @Unique
    private SecureClass0153<?> getReceive(class_2596<?> packet) {
        return new EUOIYnZlODSHU4Bam8oau1LF2LacvSKZ<class_2596<?>>(packet);
    }

    @Inject(method={"addHandlers"}, at={@At(value="HEAD")})
    private static void addHandlersHook(ChannelPipeline pipeline, class_2598 side, boolean local, class_8762 packetSizeLogger, CallbackInfo ci) {
        if (side.equals((Object)class_2598.field_11942)) {
            SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(new SecureClass0600(pipeline, local));
        }
    }

    @Unique
    private SecureClass0153<?> getSend(class_2596<?> packet) {
        return new Uav8rUVDQXhLpv24KG69IxumAqYdM6c6<class_2596<?>>(packet);
    }

    @Inject(method={"connect(Ljava/net/InetSocketAddress;ZLnet/minecraft/util/profiler/MultiValueDebugSampleLogImpl;)Lnet/minecraft/network/ClientConnection;"}, at={@At(value="HEAD")})
    private static void connectHook(InetSocketAddress address, boolean useEpoll, class_9191 packetSizeLog, CallbackInfoReturnable<class_2535> cir) {
        new SecureClass0817().Z5OjNaubpkgNnDazlz8NpqjxXaqrkBhv(resolver -> resolver.cfr_renamed_65(address.getHostString())).Z5OjNaubpkgNnDazlz8NpqjxXaqrkBhv(resolver -> {
            try {
                InetSocketAddress real = new InetSocketAddress(InetAddress.getByAddress(resolver.S7G8EVnsl04vwbf28UTSwERkOWJXq4EX, address.getAddress().getAddress()), address.getPort());
                SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(new SecureClass0025(address.getAddress().getHostName(), real.getAddress().getHostAddress()));
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }
}

