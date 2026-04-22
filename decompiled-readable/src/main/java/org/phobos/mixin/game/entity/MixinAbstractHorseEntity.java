/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1496;
import org.phobos.secure.group023.EntityControlModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1496.class})
public abstract class MixinAbstractHorseEntity {
    @Inject(method={"isSaddled"}, at={@At(value="HEAD")}, cancellable=true)
    private void isSaddledHook(CallbackInfoReturnable<Boolean> cir) {
        if (EntityControlModule.IBxFTnLTdggfhrZcCrPp3iV1g9I0yOso()) {
            cir.setReturnValue((Object)true);
        }
    }
}

