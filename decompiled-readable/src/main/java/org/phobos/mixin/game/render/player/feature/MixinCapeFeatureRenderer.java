/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player.feature;

import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1664;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_7833;
import net.minecraft.class_8685;
import net.minecraft.class_972;
import org.earthhack.ducks.ILivingEntity;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Quaternionf;
import org.phobos.mixin.game.render.player.feature.MixinFeatureRenderer;
import org.phobos.secure.group013.SecureClass0190;
import org.phobos.secure.group026.SecureClass0448;
import org.phobos.secure.group023.ChamsModule;
import org.phobos.secure.group031.AnimationsModule;
import org.phobos.secure.group053.PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_972.class})
public abstract class MixinCapeFeatureRenderer
extends MixinFeatureRenderer<class_742, class_591<class_742>>
implements SecureInterface0134,
EventSubscriber {
    @Inject(method={"render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/network/AbstractClientPlayerEntity;FFFFFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook(class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, class_742 player, float f, float g, float h, float j, float k, float l, CallbackInfo ci) {
        class_1799 itemStack;
        class_8685 skinTextures;
        ci.cancel();
        if (!player.method_5767() && player.method_7348(class_1664.field_7559) && (skinTextures = player.method_52814()).comp_1627() != null && !(itemStack = player.method_6118(class_1304.field_6174)).method_31574(class_1802.field_8833)) {
            ILivingEntity accessor = (ILivingEntity)player;
            boolean sneaking = player.method_18276();
            accessor.set$sneaking(sneaking);
            if (AnimationsModule.uhUEorvwOnJawr2vLhH867pno0MJBfz8()) {
                accessor.cfr_renamed_1().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(sneaking ? 25.0f : 0.0f);
                accessor.cfr_renamed_1().BMMCpqfUxEdTwLEu5UFj3ge24ytSFktk(50.0f, 0.08f);
            }
            matrixStack.method_22903();
            matrixStack.method_46416(0.0f, 0.0f, 0.125f);
            double d = class_3532.method_16436((double)h, (double)player.field_7524, (double)player.field_7500) - class_3532.method_16436((double)h, (double)player.field_6014, (double)player.method_23317());
            double e = class_3532.method_16436((double)h, (double)player.field_7502, (double)player.field_7521) - class_3532.method_16436((double)h, (double)player.field_6036, (double)player.method_23318());
            double m = class_3532.method_16436((double)h, (double)player.field_7522, (double)player.field_7499) - class_3532.method_16436((double)h, (double)player.field_5969, (double)player.method_23321());
            float n = class_3532.method_17821((float)h, (float)player.field_6220, (float)player.field_6283);
            double o = class_3532.method_15374((float)(n * ((float)Math.PI / 180)));
            double p = -class_3532.method_15362((float)(n * ((float)Math.PI / 180)));
            float q = (float)e * 10.0f;
            q = class_3532.method_15363((float)q, (float)-6.0f, (float)32.0f);
            float r = (float)(d * o + m * p) * 100.0f;
            r = class_3532.method_15363((float)r, (float)0.0f, (float)150.0f);
            float s = (float)(d * p - m * o) * 100.0f;
            s = class_3532.method_15363((float)s, (float)-20.0f, (float)20.0f);
            if (r < 0.0f) {
                r = 0.0f;
            }
            float t = class_3532.method_16439((float)h, (float)player.field_7505, (float)player.field_7483);
            q += class_3532.method_15374((float)(class_3532.method_16439((float)h, (float)player.field_6039, (float)player.field_5973) * 6.0f)) * 32.0f * t;
            if (player.method_18276()) {
                q += 25.0f;
            }
            matrixStack.method_22907(this.getRotation(player, class_7833.field_40714, 6.0f + r / 2.0f + q));
            matrixStack.method_22907(class_7833.field_40718.rotationDegrees(s / 2.0f));
            matrixStack.method_22907(class_7833.field_40716.rotationDegrees(180.0f - s / 2.0f));
            class_4588 vertexConsumer = vertexConsumerProvider.getBuffer(this.getRenderLayer(player, skinTextures));
            ((class_591)this.method_17165()).method_2823(matrixStack, vertexConsumer, i, class_4608.field_21444);
            matrixStack.method_22909();
        }
    }

    @Unique
    private class_1921 getRenderLayer(class_742 player, class_8685 skinTextures) {
        if (ChamsModule.cfr_renamed_33((class_1309)player)) {
            return SecureClass0448.Vn4kauqfgiIwTrvj8T5OjGwc7tFSduk4(skinTextures.comp_1627());
        }
        return class_1921.method_23572((class_2960)skinTextures.comp_1627());
    }

    @Unique
    private Quaternionf getRotation(class_742 player, class_7833 instance, float deg) {
        SecureClass0190 event = this.invoke(new SecureClass0190());
        if (event.IVWOFBtZrz9G97nrhwSPFqv2wjOG6LJB() == null) {
            return instance.rotationDegrees(deg);
        }
        ILivingEntity accessor = (ILivingEntity)player;
        float f0 = deg - (accessor.is$sneaking() ? 25.0f : 0.0f);
        return switch (event.IVWOFBtZrz9G97nrhwSPFqv2wjOG6LJB()) {
            default -> throw new MatchException(null, null);
            case PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS.Lerp -> instance.rotationDegrees(deg);
            case PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS.Custom -> instance.rotationDegrees(f0 + accessor.cfr_renamed_1().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY());
        };
    }
}

