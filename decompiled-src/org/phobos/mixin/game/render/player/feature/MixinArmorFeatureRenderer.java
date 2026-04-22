/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player.feature;

import com.llamalad7.mixinextras.sugar.Local;
import java.awt.Color;
import java.util.function.Function;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_4668;
import net.minecraft.class_572;
import net.minecraft.class_970;
import org.earthhack.ducks.ILivingEntity;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk;
import org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l.S6bSHVSViBYZ6m8UBbf7ACazAsQknmiF;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb._9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_970.class})
public abstract class MixinArmorFeatureRenderer<T extends class_1309, M extends class_572<T>, A extends class_572<T>>
implements EventSubscriber {
    @Unique
    private static final Function<class_2960, class_1921> ARMOR_CUTOUT_NO_CULL_TRANSPARENT = class_156.method_34866(texture -> MixinArmorFeatureRenderer.createArmorCutoutNoCullTransparent("armor_cutout_no_cull", texture, false));

    @Redirect(method={"renderArmor"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/entity/feature/ArmorFeatureRenderer;renderArmorParts(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/entity/model/BipedEntityModel;ILnet/minecraft/util/Identifier;)V"))
    private void renderArmorPartsHook(class_970<T, M, A> instance, class_4587 matrices, class_4597 vertexConsumers, int light, A model, int rgba, class_2960 identifier, @Local(argsOnly=true) T entity) {
        Color color;
        Color col = new Color(rgba, false);
        jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk ghost = ((ILivingEntity)entity).getGhostModel();
        Color color2 = color = ghost != null ? _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(col, ghost.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.XNZCxS0iAywNJerFu5SLZZPUnFajne6W(col);
        if (color.getAlpha() < 255) {
            this.renderArmorPartsTransparent(matrices, vertexConsumers, light, model, color.hashCode(), identifier);
            return;
        }
        this.method_23192(matrices, vertexConsumers, light, model, color.hashCode(), identifier);
    }

    @Unique
    private void renderArmorPartsTransparent(class_4587 matrices, class_4597 vertexConsumers, int light, A model, int i, class_2960 identifier) {
        class_4588 vertexConsumer = vertexConsumers.getBuffer(MixinArmorFeatureRenderer.getArmorCutoutNoCullTransparent(identifier));
        model.method_2828(matrices, vertexConsumer, light, class_4608.field_21444, i);
    }

    @Unique
    private static class_1921 getArmorCutoutNoCullTransparent(class_2960 texture) {
        return ARMOR_CUTOUT_NO_CULL_TRANSPARENT.apply(texture);
    }

    @Unique
    private static class_1921.class_4687 createArmorCutoutNoCullTransparent(String name, class_2960 texture, boolean decal) {
        class_1921.class_4688 multiPhaseParameters = class_1921.class_4688.method_23598().method_34578(class_4668.field_29449).method_34577((class_4668.class_5939)new class_4668.class_4683(texture, false, false)).method_23615(class_4668.field_21370).method_23603(class_1921.field_21345).method_23608(class_4668.field_21383).method_23611(class_4668.field_21385).method_23607(class_4668.field_22241).method_23604(decal ? class_4668.field_21347 : class_4668.field_21348).method_23617(true);
        return class_1921.method_24049((String)name, (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)multiPhaseParameters);
    }

    @Shadow
    protected abstract void method_23192(class_4587 var1, class_4597 var2, int var3, A var4, int var5, class_2960 var6);

    @Inject(method={"renderArmor"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderArmorHook(class_4587 matrices, class_4597 vertexConsumers, T livingEntity, class_1304 equipmentSlot, int i, A bipedEntityModel, CallbackInfo ci) {
        this.invoke(new S6bSHVSViBYZ6m8UBbf7ACazAsQknmiF(), ci);
    }
}

