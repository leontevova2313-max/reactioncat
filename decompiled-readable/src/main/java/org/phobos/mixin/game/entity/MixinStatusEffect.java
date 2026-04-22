/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1291;
import net.minecraft.class_1309;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group022.SecureClass0380;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1291.class})
public abstract class MixinStatusEffect
implements SecureInterface0134,
EventSubscriber {
    @Inject(method={"onApplied(Lnet/minecraft/entity/LivingEntity;I)V"}, at={@At(value="HEAD")})
    private void onAppliedHook(class_1309 entity, int amplifier, CallbackInfo ci) {
        this.invoke(new SecureClass0380(entity, (class_1291)this, amplifier));
    }
}

