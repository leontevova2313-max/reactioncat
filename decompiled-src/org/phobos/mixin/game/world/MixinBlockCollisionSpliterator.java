/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_5329;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.phobos.secure.ulFKkKf3PI2HUx83QjvCny5RVdQ1JbCt.bnwhLUVJoNE2zflX8b15cg5BPt1cncCa;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_5329.class})
public abstract class MixinBlockCollisionSpliterator
implements EventSubscriber,
s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @WrapOperation(method={"computeNext"}, at={@At(value="INVOKE", target="Lnet/minecraft/block/BlockState;getCollisionShape(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/ShapeContext;)Lnet/minecraft/util/shape/VoxelShape;")})
    private class_265 computeNextHook(class_2680 state, class_1922 world, class_2338 pos, class_3726 context, Operation<class_265> operator) {
        class_265 shape = (class_265)operator.call(new Object[]{state, world, pos, context});
        if (world != MixinBlockCollisionSpliterator.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687) {
            return shape;
        }
        bnwhLUVJoNE2zflX8b15cg5BPt1cncCa event = this.invoke(new bnwhLUVJoNE2zflX8b15cg5BPt1cncCa(state, pos, shape));
        if (event.isCancelled()) {
            return class_259.method_1073();
        }
        return event.U8WgiXLUcRedURoiaWNVgEkpVWDtUuDW();
    }
}

