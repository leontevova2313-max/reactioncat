/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.awt.Color;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3887;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_583;
import net.minecraft.class_7833;
import net.minecraft.class_922;
import net.minecraft.class_9817;
import org.earthhack.ducks.ILivingEntity;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.mixin.game.render.entity.MixinEntityRenderer;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.pOwDbfdrV7njOL8JmH4NBe2oQwawfJzZ;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW._4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb._9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_922.class})
public abstract class MixinLivingEntityRenderer<T extends class_1309, M extends class_583<T>>
extends MixinEntityRenderer<T>
implements EventSubscriber,
s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Shadow
    protected M field_4737;
    @Shadow
    @Final
    protected List<class_3887<T, M>> field_4738;

    @Inject(method={"getRenderLayer"}, at={@At(value="HEAD")}, cancellable=true)
    private void getRenderLayerHook(T entity, boolean showBody, boolean translucent, boolean showOutline, CallbackInfoReturnable<class_1921> cir) {
        if (hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.cfr_renamed_33(entity) && !translucent && showBody) {
            cir.setReturnValue((Object)_4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.J3CdobzIaaj2TyZwNKIgMjSZIyC4Jege(this.method_3931(entity)));
            return;
        }
    }

    @Shadow
    protected abstract float method_4044(T var1, float var2);

    @Shadow
    protected abstract float method_4045(T var1, float var2);

    @Shadow
    protected abstract boolean method_25450(T var1);

    @Shadow
    public static int method_23622(class_1309 entity, float whiteOverlayProgress) {
        return 0;
    }

    @Shadow
    protected abstract boolean method_4056(T var1);

    @Shadow
    protected abstract void method_4042(T var1, class_4587 var2, float var3);

    @Shadow
    private static float method_18656(class_2350 direction) {
        return 0.0f;
    }

    @Shadow
    protected abstract float method_23185(T var1, float var2);

    @Inject(method={"render(Lnet/minecraft/entity/LivingEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook(T livingEntity, float f, float tickDelta, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, CallbackInfo ci) {
        class_9817 leashable;
        class_1297 class_12972;
        class_2350 direction;
        float bodyDelta;
        class_1297 var11;
        if (hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.jEBOVTBlkhI8Ww9vH7Zg9mhaJnjodOZq) {
            return;
        }
        ci.cancel();
        pOwDbfdrV7njOL8JmH4NBe2oQwawfJzZ<class_1309, class_583<class_1309>> event = new pOwDbfdrV7njOL8JmH4NBe2oQwawfJzZ<class_1309, class_583<class_1309>>((class_1309)livingEntity, f, tickDelta, matrixStack, i, (class_583<class_1309>)this.field_4737, (List<class_3887<class_1309, class_583<class_1309>>>)this.field_4738);
        hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.exFXReCLUAwmbEerlOXvRRKGHNnWOJLS(event);
        if (event.isCancelled()) {
            return;
        }
        float jitter = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.AekSpQ3RY5j8K9090C81vP06Gib6su8V(tickDelta);
        boolean limbs = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.cfr_renamed_34();
        boolean rotations = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.dwUCEhoQBQX1Hun1W4TEMsmkuq71BvzY();
        matrixStack.method_22903();
        ((class_583)this.field_4737).field_3447 = this.method_4044(livingEntity, tickDelta);
        ((class_583)this.field_4737).field_3449 = livingEntity.method_5765();
        ((class_583)this.field_4737).field_3448 = livingEntity.method_6109();
        float bodyYaw = class_3532.method_17821((float)(rotations ? jitter : tickDelta), (float)((class_1309)livingEntity).field_6220, (float)((class_1309)livingEntity).field_6283);
        float headYaw = class_3532.method_17821((float)(rotations ? jitter : tickDelta), (float)((class_1309)livingEntity).field_6259, (float)((class_1309)livingEntity).field_6241);
        float bodyOffset = headYaw - bodyYaw;
        if (livingEntity.method_5765() && (var11 = livingEntity.method_5854()) instanceof class_1309) {
            class_1309 livingEntity2 = (class_1309)var11;
            bodyYaw = class_3532.method_17821((float)(rotations ? jitter : tickDelta), (float)livingEntity2.field_6220, (float)livingEntity2.field_6283);
            bodyOffset = headYaw - bodyYaw;
            bodyDelta = class_3532.method_15393((float)bodyOffset);
            if (bodyDelta < -85.0f) {
                bodyDelta = -85.0f;
            }
            if (bodyDelta >= 85.0f) {
                bodyDelta = 85.0f;
            }
            bodyYaw = headYaw - bodyDelta;
            if (bodyDelta * bodyDelta > 2500.0f) {
                bodyYaw += bodyDelta * 0.2f;
            }
            bodyOffset = headYaw - bodyYaw;
        }
        float pitch = class_3532.method_16439((float)(rotations ? jitter : tickDelta), (float)((class_1309)livingEntity).field_6004, (float)livingEntity.method_36455());
        if (MixinLivingEntityRenderer.method_38563(livingEntity)) {
            pitch *= -1.0f;
            bodyOffset *= -1.0f;
        }
        bodyOffset = class_3532.method_15393((float)bodyOffset);
        if (livingEntity.method_41328(class_4050.field_18078) && (direction = livingEntity.method_18401()) != null) {
            float animationProgress = livingEntity.method_18381(class_4050.field_18076) - 0.1f;
            matrixStack.method_46416((float)(-direction.method_10148()) * animationProgress, 0.0f, (float)(-direction.method_10165()) * animationProgress);
        }
        bodyDelta = livingEntity.method_55693();
        matrixStack.method_22905(bodyDelta, bodyDelta, bodyDelta);
        float animationProgress = this.method_4045(livingEntity, tickDelta);
        this.method_4058(livingEntity, matrixStack, animationProgress, bodyYaw, tickDelta, bodyDelta);
        matrixStack.method_22905(-1.0f, -1.0f, 1.0f);
        this.method_4042(livingEntity, matrixStack, tickDelta);
        matrixStack.method_46416(0.0f, -1.501f, 0.0f);
        float limbSpeed = 0.0f;
        float limbPos = 0.0f;
        if (!livingEntity.method_5765() && livingEntity.method_5805()) {
            limbSpeed = ((class_1309)livingEntity).field_42108.method_48570(limbs ? jitter : tickDelta);
            limbPos = ((class_1309)livingEntity).field_42108.method_48572(limbs ? jitter : tickDelta);
            if (livingEntity.method_6109()) {
                limbPos *= 3.0f;
            }
            if (limbSpeed > 1.0f) {
                limbSpeed = 1.0f;
            }
        }
        this.field_4737.method_2816(livingEntity, limbPos, limbSpeed, tickDelta);
        this.field_4737.method_2819(livingEntity, limbPos, limbSpeed, animationProgress, bodyOffset, pitch);
        class_310 minecraftClient = class_310.method_1551();
        boolean visible = this.method_4056(livingEntity);
        boolean canSee = !visible && !livingEntity.method_5756((class_1657)minecraftClient.field_1724);
        boolean outline = minecraftClient.method_27022(livingEntity);
        class_1921 renderLayer = this.method_24302(livingEntity, visible, canSee, outline);
        if (renderLayer != null) {
            class_4588 vertexConsumer = vertexConsumerProvider.getBuffer(renderLayer);
            int n = MixinLivingEntityRenderer.method_23622(livingEntity, this.method_23185(livingEntity, tickDelta));
            jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk ghost = ((ILivingEntity)livingEntity).getGhostModel();
            this.field_4737.method_2828(matrixStack, vertexConsumer, i, n, ghost != null ? _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color.WHITE, ghost.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()).hashCode() : (canSee || !(livingEntity instanceof class_1657) ? 0x26FFFFFF : hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.bohqkKKJn5igtCEOlbpwt7ulEOHAJFOn().hashCode()));
        }
        if (!livingEntity.method_7325()) {
            for (class_3887 class_38872 : this.field_4738) {
                class_38872.method_4199(matrixStack, vertexConsumerProvider, i, livingEntity, limbPos, limbSpeed, tickDelta, animationProgress, bodyOffset, pitch);
            }
        }
        matrixStack.method_22909();
        if (livingEntity instanceof class_9817 && (class_12972 = (leashable = (class_9817)livingEntity).method_60952()) != null) {
            this.__renderLeash(livingEntity, tickDelta, matrixStack, vertexConsumerProvider, class_12972);
        }
        if (this.method_4055(livingEntity)) {
            this.method_3926(livingEntity, livingEntity.method_5476(), matrixStack, vertexConsumerProvider, i, tickDelta);
        }
    }

    @Inject(method={"setupTransforms"}, at={@At(value="HEAD")}, cancellable=true)
    protected void setupTransformsHook(T entity, class_4587 matrices, float animationProgress, float bodyYaw, float tickDelta, float scale, CallbackInfo ci) {
        ci.cancel();
        if (this.method_25450(entity)) {
            bodyYaw += (float)(Math.cos((double)((class_1309)entity).field_6012 * 3.25) * Math.PI * (double)0.4f);
        }
        if (!entity.method_41328(class_4050.field_18078)) {
            matrices.method_22907(class_7833.field_40716.rotationDegrees(180.0f - bodyYaw));
        }
        if (((class_1309)entity).field_6213 > 0 && !jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.cfr_renamed_35()) {
            float f = ((float)((class_1309)entity).field_6213 + tickDelta - 1.0f) / 20.0f * 1.6f;
            if ((f = class_3532.method_15355((float)f)) > 1.0f) {
                f = 1.0f;
            }
            matrices.method_22907(class_7833.field_40718.rotationDegrees(f * this.method_4039(entity)));
        } else if (entity.method_6123()) {
            matrices.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - entity.method_36455()));
            matrices.method_22907(class_7833.field_40716.rotationDegrees(((float)((class_1309)entity).field_6012 + tickDelta) * -75.0f));
        } else if (entity.method_41328(class_4050.field_18078)) {
            class_2350 direction = entity.method_18401();
            float g = direction != null ? MixinLivingEntityRenderer.method_18656(direction) : bodyYaw;
            matrices.method_22907(class_7833.field_40716.rotationDegrees(g));
            matrices.method_22907(class_7833.field_40718.rotationDegrees(this.method_4039(entity)));
            matrices.method_22907(class_7833.field_40716.rotationDegrees(270.0f));
        } else if (MixinLivingEntityRenderer.method_38563(entity)) {
            matrices.method_46416(0.0f, (entity.method_17682() + 0.1f) / scale, 0.0f);
            matrices.method_22907(class_7833.field_40718.rotationDegrees(180.0f));
        }
    }

    @Shadow
    public static boolean method_38563(class_1309 entity) {
        return false;
    }

    @Shadow
    protected abstract void method_4058(T var1, class_4587 var2, float var3, float var4, float var5, float var6);

    @ModifyExpressionValue(method={"hasLabel(Lnet/minecraft/entity/LivingEntity;)Z"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;getCameraEntity()Lnet/minecraft/entity/Entity;")})
    private class_1297 hasLabel(class_1297 original) {
        if (cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.FSo5NM8CyCAmli7dfSvCjLoOi0gZCJsM()) {
            return null;
        }
        return original;
    }

    @Shadow
    protected abstract boolean method_4055(T var1);

    @Shadow
    protected abstract float method_4039(T var1);

    @Shadow
    @Nullable
    protected abstract class_1921 method_24302(T var1, boolean var2, boolean var3, boolean var4);
}

