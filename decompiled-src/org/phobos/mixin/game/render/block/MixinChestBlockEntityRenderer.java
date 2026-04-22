/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.block;

import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_630;
import net.minecraft.class_826;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.b7LJhjthZHOzFD1Ia5dH2tDae2WOp8N7;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_826.class})
public abstract class MixinChestBlockEntityRenderer {
    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;Lnet/minecraft/client/model/ModelPart;Lnet/minecraft/client/model/ModelPart;Lnet/minecraft/client/model/ModelPart;FII)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void render(class_4587 matrices, class_4588 vertices, class_630 lid, class_630 latch, class_630 base, float openFactor, int light, int overlay, CallbackInfo ci) {
        if (!b7LJhjthZHOzFD1Ia5dH2tDae2WOp8N7.cfr_renamed_24()) {
            return;
        }
        ci.cancel();
        latch.field_3654 = lid.field_3654 = -(openFactor * 1.5707964f);
        base.method_22698(matrices, vertices, light, overlay);
        lid.method_22698(matrices, vertices, light, overlay);
        latch.method_22698(matrices, vertices, light, overlay);
    }
}

