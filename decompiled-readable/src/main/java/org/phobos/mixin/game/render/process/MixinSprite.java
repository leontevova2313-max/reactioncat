/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import net.minecraft.class_1058;
import net.minecraft.class_7764;
import org.phobos.secure.group014.SecureClass0224;
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
        SecureClass0224.bbIPhmaGgatCC1B6KyAQZMXFHPghRQGp(this.method_45851(), 4.0f / this.method_23841(), cir);
    }

    @Shadow
    protected abstract float method_23841();
}

