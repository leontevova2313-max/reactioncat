/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_743;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group051.SecureClass0935;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_743.class})
public abstract class MixinKeyboardInput
implements EventSubscriber {
    @Inject(method={"tick"}, at={@At(value="FIELD", target="Lnet/minecraft/client/input/KeyboardInput;sneaking:Z", shift=At.Shift.AFTER)})
    private void tickHook(boolean slowDown, float slowDownFactor, CallbackInfo ci) {
        this.invoke(new SecureClass0935((class_743)this));
    }
}

