/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.List;
import java.util.function.Function;
import net.minecraft.class_9136;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.JuiRoWnEfipaiH78Njzx3R2XiVUCuUQ7;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_9136.class})
public class MixinPacketCodecDispatcher<B extends ByteBuf, V, T> {
    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void initHook(Function<V, ? extends T> packetIdGetter, List<class_9136.class_9138<B, V, T>> packetTypes, Object2IntMap<T> typeToIndex, CallbackInfo ci) {
        JuiRoWnEfipaiH78Njzx3R2XiVUCuUQ7.skVlkQ2DBCxLHUJ9njB1m6Bg0AahuDrC(typeToIndex);
    }
}

