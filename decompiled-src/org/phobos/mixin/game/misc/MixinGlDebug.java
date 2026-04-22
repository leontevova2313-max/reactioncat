/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_1008;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1008.class})
public abstract class MixinGlDebug {
    @Inject(method={"info"}, at={@At(value="HEAD")}, cancellable=true)
    private static void infoHook(int source, int type, int id, int severity, int messageLength, long message, long l, CallbackInfo ci) {
        ci.cancel();
    }
}

