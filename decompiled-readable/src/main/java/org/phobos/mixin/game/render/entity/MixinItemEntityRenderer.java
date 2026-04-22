/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import net.minecraft.class_1542;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_916;
import org.phobos.secure.group044.ItemPhysicsModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_916.class})
public abstract class MixinItemEntityRenderer {
    @Inject(method={"render(Lnet/minecraft/entity/ItemEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook(class_1542 itemEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, CallbackInfo ci) {
        if (ItemPhysicsModule.yUqLT9ZtvY7fgdUfS8MhxXkK7fASNPJT(itemEntity, f, g, matrixStack, vertexConsumerProvider, i)) {
            ci.cancel();
        }
    }
}

