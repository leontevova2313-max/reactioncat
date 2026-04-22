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
import org.phobos.secure.1QTSqdFu1qt4b1WvDl15MoAj2vMj5tlJ.ImUAvi4sOo8saNCr40FGl2MOCWqWfLW5;
import org.phobos.secure.E7qwU8abcwz3brAbulptWa86RqdgSg2V.Vp6DPRreLfFhXEiA8RE73QQClpidyKEX;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.n06V4jYMMdWGbExHTb4jZrNP0D3hv8US;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.w5cqX2CNLLKfxdduQy4pRn4iy077Ql1d;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.yFFw9C6nj6k50OKhujfeMvEqntaYz1Vr;
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
s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Overwrite
    public void method_4215(class_742 abstractClientPlayerEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i) {
        Vp6DPRreLfFhXEiA8RE73QQClpidyKEX event;
        this.method_4218(abstractClientPlayerEntity);
        if (jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.FnIzSkP2PGTjMrLncFA98RqTSQftOQee()) {
            abstractClientPlayerEntity.field_42108.method_48567(0.0f);
            ((ILimbAnimator)abstractClientPlayerEntity.field_42108).setPos(0.0f);
        }
        if (abstractClientPlayerEntity.method_7340() && !hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.jEBOVTBlkhI8Ww9vH7Zg9mhaJnjodOZq && (event = (Vp6DPRreLfFhXEiA8RE73QQClpidyKEX)this.invoke(new Vp6DPRreLfFhXEiA8RE73QQClpidyKEX(abstractClientPlayerEntity))).isCancelled()) {
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
        return w5cqX2CNLLKfxdduQy4pRn4iy077Ql1d.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)instance);
    }

    public MixinPlayerEntityRenderer(class_5617.class_5618 ctx, class_591<class_742> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
        throw new IllegalStateException("MixinPlayerEntityRenderer constructor called!");
    }

    @Inject(method={"renderArm"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderArmHook(class_4587 matrices, class_4597 vertexConsumers, int light, class_742 player, class_630 arm, class_630 sleeve, CallbackInfo ci) {
        this.invoke(new ImUAvi4sOo8saNCr40FGl2MOCWqWfLW5(matrices, (class_591<class_742>)((class_591)this.method_4038()), player, arm, sleeve), ci);
    }

    @Shadow
    protected abstract void method_4218(class_742 var1);

    @Inject(method={"<init>"}, at={@At(value="RETURN")})
    private void initHook(class_5617.class_5618 ctx, boolean slim, CallbackInfo ci) {
        this.method_4046(new yFFw9C6nj6k50OKhujfeMvEqntaYz1Vr((class_3883<class_742, class_591<class_742>>)this));
    }

    @Inject(method={"getArmPose"}, at={@At(value="HEAD")}, cancellable=true)
    private static void getArmPoseHook(class_742 player, class_1268 hand, CallbackInfoReturnable<class_572.class_573> cir) {
        if (!player.method_7340()) {
            return;
        }
        if (n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.UZokPY9FdVf5VUcV1D1BsuhjnIMBjz6u()) {
            cir.setReturnValue((Object)(class_1268.field_5808.equals((Object)hand) ? class_572.class_573.field_3406 : class_572.class_573.field_3409));
        }
    }
}

