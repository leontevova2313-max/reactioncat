/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import net.minecraft.class_1058;
import net.minecraft.class_7764;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1058.class})
public abstract class MixinSprite {
    @Shadow
    public abstract class_7764 method_45851();

    @Inject(method={"getAnimationFrameDelta"}, at={@At(value="RETURN")}, cancellable=true)
    private void getAnimationFrameDeltaHook(CallbackInfoReturnable<Float> cir) {
        g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.bbIPhmaGgatCC1B6KyAQZMXFHPghRQGp(this.method_45851(), 4.0f / this.method_23841(), cir);
    }

    @Shadow
    protected abstract float method_23841();
}

