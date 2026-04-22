/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player.feature;

import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5697;
import net.minecraft.class_811;
import org.phobos.secure.group032.SecureClass0573;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_5697.class})
public abstract class MixinPlayerHeldItemFeatureRenderer {
    @Inject(method={"renderItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/feature/HeldItemFeatureRenderer;renderItem(Lnet/minecraft/entity/LivingEntity;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/render/model/json/ModelTransformationMode;Lnet/minecraft/util/Arm;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V")}, cancellable=true)
    private void renderItemHook(class_1309 entity, class_1799 stack, class_811 transformationMode, class_1306 arm, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (SecureClass0573.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && class_1306.field_6182.equals((Object)arm) && stack.method_31574(class_1802.field_8255)) {
            ci.cancel();
            return;
        }
    }
}

