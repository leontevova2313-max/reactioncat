/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2560;
import net.minecraft.class_2680;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.Ll8gnE4HcbFLQn5ABaixcEqvSVqrGVxK;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_2560.class})
public abstract class MixinCobwebBlock {
    @Inject(method={"onEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void onEntityCollisionHook(class_2680 state, class_1937 world, class_2338 pos, class_1297 entity, CallbackInfo ci) {
        if (Ll8gnE4HcbFLQn5ABaixcEqvSVqrGVxK.FZTupVbhY9VGG4c8dRaLRSFhtF4RVExf()) {
            ci.cancel();
        }
    }
}

