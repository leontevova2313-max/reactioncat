/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1291;
import net.minecraft.class_1309;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.yA4G3zyDrNeQiyn0k1PQQDm1i9b0onxQ;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1291.class})
public abstract class MixinStatusEffect
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T,
EventSubscriber {
    @Inject(method={"onApplied(Lnet/minecraft/entity/LivingEntity;I)V"}, at={@At(value="HEAD")})
    private void onAppliedHook(class_1309 entity, int amplifier, CallbackInfo ci) {
        this.invoke(new yA4G3zyDrNeQiyn0k1PQQDm1i9b0onxQ(entity, (class_1291)this, amplifier));
    }
}

