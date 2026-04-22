/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1937;
import org.phobos.secure.group006.WeatherModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1937.class})
public abstract class MixinWorld {
    @Inject(method={"getRainGradient"}, at={@At(value="TAIL")}, cancellable=true)
    private void getRainGradientHook(float tickDelta, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue((Object)Float.valueOf(WeatherModule.dafCE3okw1ETuuS6ubbtHK7Q7kGx4VI6(((Float)cir.getReturnValue()).floatValue())));
    }
}

