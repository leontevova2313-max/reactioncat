/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import net.minecraft.class_4587;
import net.minecraft.class_804;
import org.phobos.secure.pc6HIQuJAclXcc4JCpbef8Fre45f1Kdg.uni43wETtC32pZfcu8OiyPvEk0acU3Po;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_804.class})
public abstract class MixinTransformation {
    @Inject(method={"apply"}, at={@At(value="HEAD")}, cancellable=true)
    private void applyHook(boolean leftHanded, class_4587 matrices, CallbackInfo ci) {
        if (uni43wETtC32pZfcu8OiyPvEk0acU3Po.qZnCasjMSUZ6lGJcCkZzLqbpPWYWSlIh()) {
            ci.cancel();
        }
    }
}

