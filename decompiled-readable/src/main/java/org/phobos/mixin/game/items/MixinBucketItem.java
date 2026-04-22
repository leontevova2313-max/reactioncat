/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.items;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1755;
import net.minecraft.class_3965;
import org.earthhack.ducks.IBucketItem;
import org.phobos.secure.group035.ANWEGG3xnXxXByxGcpzAPx23twDHzwVU;
import org.phobos.secure.group038.SecureInterface0097;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_1755.class})
public abstract class MixinBucketItem
implements IBucketItem {
    @Unique
    private final SecureInterface0097<class_3965> placement = new ANWEGG3xnXxXByxGcpzAPx23twDHzwVU<class_3965>();

    @Override
    public void addPlacement(class_3965 blockHitResult) {
        this.placement.qphQttUk3jezu7BB5KsPAzKq4C45WbrU(blockHitResult);
    }

    @ModifyExpressionValue(method={"use"}, at={@At(value="INVOKE", target="Lnet/minecraft/item/BucketItem;raycast(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/world/RaycastContext$FluidHandling;)Lnet/minecraft/util/hit/BlockHitResult;")})
    private class_3965 useHook(class_3965 original) {
        return this.placement.cfr_renamed_21(original);
    }
}

