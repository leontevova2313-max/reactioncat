/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import net.minecraft.class_4587;
import net.minecraft.class_804;
import org.phobos.secure.group044.ItemPhysicsModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_804.class})
public abstract class MixinTransformation {
    @Inject(method={"apply"}, at={@At(value="HEAD")}, cancellable=true)
    private void applyHook(boolean leftHanded, class_4587 matrices, CallbackInfo ci) {
        if (ItemPhysicsModule.qZnCasjMSUZ6lGJcCkZzLqbpPWYWSlIh()) {
            ci.cancel();
        }
    }
}

