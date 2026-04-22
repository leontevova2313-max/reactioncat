/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_368;
import net.minecraft.class_374;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ.AHd9VZZWXdagBFlM1lTYGmA6khn36KBw;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_374.class})
public abstract class MixinToastManager
implements EventSubscriber {
    @Inject(method={"add"}, at={@At(value="HEAD")}, cancellable=true)
    private void addHook(class_368 toast, CallbackInfo ci) {
        this.invoke(new AHd9VZZWXdagBFlM1lTYGmA6khn36KBw(), ci);
    }
}

