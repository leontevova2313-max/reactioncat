/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1923;
import net.minecraft.class_2818;
import net.minecraft.class_631;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group004.SecureClass0057;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={class_631.class})
public abstract class MixinClientChunkManager
implements EventSubscriber {
    @Inject(method={"unload"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/world/ClientChunkManager$ClientChunkMap;compareAndSet(ILnet/minecraft/world/chunk/WorldChunk;Lnet/minecraft/world/chunk/WorldChunk;)Lnet/minecraft/world/chunk/WorldChunk;", shift=At.Shift.AFTER)}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void unloadHook(class_1923 chunkPos, CallbackInfo ci, int index, class_2818 worldChunk) {
        this.invoke(new SecureClass0057(worldChunk));
    }
}

