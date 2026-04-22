/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.block;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_775;
import org.phobos.secure.group051.XRayModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_775.class})
public abstract class MixinFluidRenderer {
    @Inject(method={"isSideCovered(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;FLnet/minecraft/block/BlockState;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private static void isSideCoveredHook(class_1922 world, class_2338 pos, class_2350 direction, float maxDeviation, class_2680 state, CallbackInfoReturnable<Boolean> cir) {
        if (XRayModule.cfr_renamed_25()) {
            cir.setReturnValue((Object)false);
        }
    }
}

