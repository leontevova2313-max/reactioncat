/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player;

import net.minecraft.class_1007;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_3883;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5617;
import net.minecraft.class_572;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_922;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.mixin.game.render.interfaces.ILimbAnimator;
import org.phobos.secure.group003.SecureClass0039;
import org.phobos.secure.group025.SecureClass0441;
import org.phobos.secure.group032.SecureClass0573;
import org.phobos.secure.group023.ChamsModule;
import org.phobos.secure.group031.AnimationsModule;
import org.phobos.secure.group031.SecureClass0556;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group054.SecureClass0994;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1007.class})
public abstract class MixinPlayerEntityRenderer
extends class_922<class_742, class_591<class_742>>
implements EventSubscriber,
SecureInterface0134 {
    @Overwrite
    public void method_4215(class_742 abstractClientPlayerEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i) {
        SecureClass0441 event;
        this.method_4218(abstractClientPlayerEntity);
        if (AnimationsModule.FnIzSkP2PGTjMrLncFA98RqTSQftOQee()) {
            abstractClientPlayerEntity.field_42108.method_48567(0.0f);
            ((ILimbAnimator)abstractClientPlayerEntity.field_42108).setPos(0.0f);
        }
        if (abstractClientPlayerEntity.method_7340() && !ChamsModule.jEBOVTBlkhI8Ww9vH7Zg9mhaJnjodOZq && (event = (SecureClass0441)this.invoke(new SecureClass0441(abstractClientPlayerEntity))).isCancelled()) {
            float yaw = abstractClientPlayerEntity.method_36454();
            float prevYaw = abstractClientPlayerEntity.field_5982;
            float bodyYaw = abstractClientPlayerEntity.field_6283;
            float prevBodyYaw = abstractClientPlayerEntity.field_6220;
            float headYaw = abstractClientPlayerEntity.field_6241;
            float prevHeadYaw = abstractClientPlayerEntity.field_6259;
            float pitch = abstractClientPlayerEntity.method_36455();
            float prevPitch = abstractClientPlayerEntity.field_6004;
            abstractClientPlayerEntity.method_36456(event.cENwMarLw4aCUeV0gI0nMf7qXuqbgWZz());
            abstractClientPlayerEntity.field_5982 = event.cIgsk1QxV72LE1jVfpj9g1Rgjcr3ZvGU();
            abstractClientPlayerEntity.method_5636(event.E3NW22UXhChouqkLIoPM34Dfx0x8D6cX());
            abstractClientPlayerEntity.field_6220 = event.T2UrERvkGHRjOAa7t11bzHD5ByYw4Md9();
            abstractClientPlayerEntity.method_5847(event.cENwMarLw4aCUeV0gI0nMf7qXuqbgWZz());
            abstractClientPlayerEntity.field_6259 = event.cIgsk1QxV72LE1jVfpj9g1Rgjcr3ZvGU();
            abstractClientPlayerEntity.method_36457(event.bsNeCdXxjbJJI6k5QBnRzIrFucCmvwdB());
            abstractClientPlayerEntity.field_6004 = event.Tsa8ozv5Q9hQi4BqJkDABnt4VJY0pgMS();
            super.method_4054((class_1309)abstractClientPlayerEntity, f, g, matrixStack, vertexConsumerProvider, i);
            abstractClientPlayerEntity.method_36456(yaw);
            abstractClientPlayerEntity.field_5982 = prevYaw;
            abstractClientPlayerEntity.method_5636(bodyYaw);
            abstractClientPlayerEntity.field_6220 = prevBodyYaw;
            abstractClientPlayerEntity.method_5847(headYaw);
            abstractClientPlayerEntity.field_6259 = prevHeadYaw;
            abstractClientPlayerEntity.method_36457(pitch);
            abstractClientPlayerEntity.field_6004 = prevPitch;
            return;
        }
        super.method_4054((class_1309)abstractClientPlayerEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    @Redirect(method={"setupTransforms(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/client/util/math/MatrixStack;FFFF)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;isFallFlying()Z"))
    private boolean isFallFlyingHook(class_742 instance) {
        return SecureClass0556.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)instance);
    }

    public MixinPlayerEntityRenderer(class_5617.class_5618 ctx, class_591<class_742> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
        throw new IllegalStateException("MixinPlayerEntityRenderer constructor called!");
    }

    @Inject(method={"renderArm"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderArmHook(class_4587 matrices, class_4597 vertexConsumers, int light, class_742 player, class_630 arm, class_630 sleeve, CallbackInfo ci) {
        this.invoke(new SecureClass0039(matrices, (class_591<class_742>)((class_591)this.method_4038()), player, arm, sleeve), ci);
    }

    @Shadow
    protected abstract void method_4218(class_742 var1);

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void initHook(class_5617.class_5618 ctx, boolean slim, CallbackInfo ci) {
        this.method_4046(new SecureClass0994((class_3883<class_742, class_591<class_742>>)this));
    }

    @Inject(method={"getArmPose"}, at={@At(value="HEAD")}, cancellable=true)
    private static void getArmPoseHook(class_742 player, class_1268 hand, CallbackInfoReturnable<class_572.class_573> cir) {
        if (!player.method_7340()) {
            return;
        }
        if (SecureClass0573.UZokPY9FdVf5VUcV1D1BsuhjnIMBjz6u()) {
            cir.setReturnValue((Object)(class_1268.field_5808.equals((Object)hand) ? class_572.class_573.field_3406 : class_572.class_573.field_3409));
        }
    }
}

