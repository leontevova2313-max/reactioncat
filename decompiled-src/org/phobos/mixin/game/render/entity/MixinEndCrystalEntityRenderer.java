/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import net.minecraft.class_1511;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import net.minecraft.class_892;
import net.minecraft.class_895;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Quaternionf;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW._4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.aWRbbqjFwRW2QyQatwYpdVHG5w2qwPoj;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_892.class})
public abstract class MixinEndCrystalEntityRenderer
implements EventSubscriber {
    @Shadow
    @Final
    public static class_1921 field_21736;
    @Shadow
    @Final
    private class_630 field_21003;
    @Unique
    private static final class_1921 END_CRYSTAL_SEE_THROUGH;
    @Shadow
    @Final
    private static class_2960 field_4663;
    @Shadow
    @Final
    private class_630 field_21005;
    @Shadow
    @Final
    public static float field_21002;
    @Shadow
    @Final
    private class_630 field_21004;
    @Unique
    private static final class_1921 END_CRYSTAL_TRANSPARENT;

    static {
        END_CRYSTAL_SEE_THROUGH = _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.J3CdobzIaaj2TyZwNKIgMjSZIyC4Jege(field_4663);
        END_CRYSTAL_TRANSPARENT = _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.cfr_renamed_29(field_4663);
    }

    @Inject(method={"render(Lnet/minecraft/entity/decoration/EndCrystalEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void render(class_1511 endCrystalEntity, float yaw, float tickDelta, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, CallbackInfo ci) {
        ci.cancel();
        aWRbbqjFwRW2QyQatwYpdVHG5w2qwPoj event = new aWRbbqjFwRW2QyQatwYpdVHG5w2qwPoj(endCrystalEntity, yaw, tickDelta, matrixStack, vertexConsumerProvider, i, this.field_21003, this.field_21004);
        hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qjh0a1LwDVhAI61V9UqIfnR0BqRpN3uo(event);
        if (event.isCancelled()) {
            return;
        }
        matrixStack.method_22903();
        float h = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_30(endCrystalEntity, tickDelta);
        float j = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(((float)endCrystalEntity.field_7034 + tickDelta) * 3.0f);
        class_4588 vertexConsumer = vertexConsumerProvider.getBuffer(hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.u75TWynMhjawlH4CyPSlAZOP0O6bUv5n() ? END_CRYSTAL_SEE_THROUGH : (hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.a5l1sBMyAcOoOhDq6k9fLEroIbpjlJb2() ? END_CRYSTAL_TRANSPARENT : field_21736));
        matrixStack.method_22903();
        float scale = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.YTtqj7VidmuGs4JuKjlLIsMLqagxU8W2();
        matrixStack.method_22905(scale, scale, scale);
        matrixStack.method_46416(0.0f, -0.5f, 0.0f);
        int k = class_4608.field_21444;
        if (endCrystalEntity.method_6836()) {
            this.field_21005.method_22699(matrixStack, vertexConsumer, i, k, hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.YMcmBnJoVIihJsUmkd5oU1LPvolBBP45().hashCode());
        }
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(j));
        matrixStack.method_46416(0.0f, 1.5f + h / 2.0f, 0.0f);
        matrixStack.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
        this.field_21004.method_22699(matrixStack, vertexConsumer, i, k, hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.YMcmBnJoVIihJsUmkd5oU1LPvolBBP45().hashCode());
        float l = 0.875f;
        matrixStack.method_22905(l, l, l);
        matrixStack.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(j));
        this.field_21004.method_22699(matrixStack, vertexConsumer, i, k, hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.YMcmBnJoVIihJsUmkd5oU1LPvolBBP45().hashCode());
        matrixStack.method_22905(l, l, l);
        matrixStack.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field_21002, 0.0f, field_21002));
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(j));
        this.field_21003.method_22699(matrixStack, vertexConsumer, i, k, hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.YMcmBnJoVIihJsUmkd5oU1LPvolBBP45().hashCode());
        matrixStack.method_22909();
        matrixStack.method_22909();
        class_2338 blockPos = endCrystalEntity.method_6838();
        if (blockPos != null) {
            float m = (float)blockPos.method_10263() + 0.5f;
            float n = (float)blockPos.method_10264() + 0.5f;
            float o = (float)blockPos.method_10260() + 0.5f;
            float p = (float)((double)m - endCrystalEntity.method_23317());
            float q = (float)((double)n - endCrystalEntity.method_23318());
            float r = (float)((double)o - endCrystalEntity.method_23321());
            matrixStack.method_46416(p, q, r);
            class_895.method_3917((float)(-p), (float)(-q + h), (float)(-r), (float)tickDelta, (int)endCrystalEntity.field_7034, (class_4587)matrixStack, (class_4597)vertexConsumerProvider, (int)i);
        }
    }
}

