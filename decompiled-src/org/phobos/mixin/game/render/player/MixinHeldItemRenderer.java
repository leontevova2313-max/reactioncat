/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Quaternionf;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.cKndaYQtl2gSUOILqp15noZxotXHccRD;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.n06V4jYMMdWGbExHTb4jZrNP0D3hv8US;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo._3AFqh0lF09sdfXqGWjaOghi6BYyz7HCW;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.jeo4wwQ2XmAPT1iNZ3rUiGZL4BDHjjPw;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.nEcXn6cNcCgNx6HmKraZE5XloSdGgKuO;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ._8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_759.class})
public abstract class MixinHeldItemRenderer
implements EventSubscriber {
    @Shadow
    private float field_4043;
    @Shadow
    private class_1799 field_4048;

    @Redirect(method={"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;multiply(Lorg/joml/Quaternionf;)V"))
    private void renderItemHook(class_4587 instance, Quaternionf quaternion) {
        if (cKndaYQtl2gSUOILqp15noZxotXHccRD.W5Ikhy7zWqNK0X3ZzPQ04FNjPY9htaMY().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && cKndaYQtl2gSUOILqp15noZxotXHccRD.W5Ikhy7zWqNK0X3ZzPQ04FNjPY9htaMY().pDrdmNGNLcdivU6cuUcVzHgOuB8XAWPF.getValue().booleanValue()) {
            return;
        }
        instance.method_22907(quaternion);
    }

    @Shadow
    protected abstract void method_3224(class_4587 var1, class_1306 var2, float var3);

    @Shadow
    protected abstract void method_3218(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5);

    @Inject(method={"updateHeldItems"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/item/HeldItemRenderer;equipProgressMainHand:F", opcode=181, shift=At.Shift.AFTER)})
    private void updateHeldItemsHook(CallbackInfo ci) {
        if (!_8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.cfr_renamed_41().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return;
        }
        _8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.anAutf67qHXPVFTTrqCMYiqVRzqqLceW().uYMNZBmZavAVSNIT7ZBcBK0COmKxATR5();
        if (!_8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.anAutf67qHXPVFTTrqCMYiqVRzqqLceW().pJtXnzD19Z3EKTBFKX1SpYfGAUp0xi8A()) {
            return;
        }
        this.field_4043 = 1.0f;
    }

    @Inject(method={"renderFirstPersonItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderFirstPersonItemHook(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        ci.cancel();
        this.__renderFirstPersonItem(player, tickDelta, pitch, hand, swingProgress, item, equipProgress, matrices, vertexConsumers, light);
    }

    @Shadow
    protected abstract void method_3228(class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_4597 var9, int var10);

    @Inject(method={"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"}, at={@At(value="TAIL")})
    private void renderHook(float tickDelta, class_4587 matrices, class_4597.class_4598 vertexConsumers, class_746 player, int light, CallbackInfo ci) {
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    @ModifyExpressionValue(method={"updateHeldItems"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;getMainHandStack()Lnet/minecraft/item/ItemStack;")})
    private class_1799 updateHeldItemsHook(class_1799 original) {
        return _8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.KI7aUJfBMt8y9ILf5trognnszeJifH4G(original);
    }

    @Shadow
    protected abstract void method_3217(class_4587 var1, class_1306 var2, float var3);

    @Redirect(method={"renderItem(FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider$Immediate;Lnet/minecraft/client/network/ClientPlayerEntity;I)V"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/item/HeldItemRenderer;renderFirstPersonItem(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"))
    private void renderItemHook(class_759 instance, class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light) {
        this.method_3228(player, tickDelta, pitch, hand, swingProgress + cKndaYQtl2gSUOILqp15noZxotXHccRD.b21930XzHsjnZDEuDaoHcQLcgocw2gly(hand), item, equipProgress, matrices, vertexConsumers, light);
    }

    @Inject(method={"renderArmHoldingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderArmHook1(class_4587 matrices, class_4597 vertexConsumers, int light, float equipProgress, float swingProgress, class_1306 arm, CallbackInfo ci) {
        this.invoke(new nEcXn6cNcCgNx6HmKraZE5XloSdGgKuO(matrices, arm), ci);
    }

    @Shadow
    protected abstract void method_3222(class_4587 var1, class_4597 var2, int var3, float var4, class_1306 var5, float var6, class_1799 var7);

    @Shadow
    protected abstract void method_49340(class_4587 var1, float var2, class_1306 var3, class_1799 var4, class_1657 var5, float var6);

    @Unique
    private void __renderFirstPersonItem(class_742 player, float tickDelta, float pitch, class_1268 hand, float swingProgress, class_1799 item, float equipProgress, class_4587 matrices, class_4597 vertexConsumers, int light) {
        block29: {
            block31: {
                boolean bl2;
                block35: {
                    class_1306 arm;
                    block34: {
                        block33: {
                            int i;
                            boolean bl;
                            block32: {
                                block30: {
                                    if (player.method_31550()) break block29;
                                    bl = hand == class_1268.field_5808;
                                    arm = bl ? player.method_6068() : player.method_6068().method_5928();
                                    matrices.method_22903();
                                    if (!item.method_7960()) break block30;
                                    if (bl && !player.method_5767()) {
                                        this.method_3219(matrices, vertexConsumers, light, equipProgress, swingProgress, arm);
                                    }
                                    break block31;
                                }
                                if (!item.method_31574(class_1802.field_8204)) break block32;
                                if (bl && this.field_4048.method_7960()) {
                                    this.method_3231(matrices, vertexConsumers, light, pitch, equipProgress, swingProgress);
                                } else {
                                    this.method_3222(matrices, vertexConsumers, light, equipProgress, arm, swingProgress, item);
                                }
                                break block31;
                            }
                            if (!item.method_31574(class_1802.field_8399)) break block33;
                            boolean bl22 = class_1764.method_7781((class_1799)item);
                            boolean bl3 = arm == class_1306.field_6183;
                            int n = i = bl3 ? 1 : -1;
                            if (player.method_6115() && player.method_6014() > 0 && player.method_6058() == hand) {
                                this.method_3224(matrices, arm, equipProgress);
                                if (jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.gxP5Sdr5vYTqrg5UDiPPRC8tScUFDfQn()) {
                                    this.method_3217(matrices, arm, swingProgress);
                                }
                                matrices.method_46416((float)i * -0.4785682f, -0.094387f, 0.05731531f);
                                matrices.method_22907(class_7833.field_40714.rotationDegrees(-11.935f));
                                matrices.method_22907(class_7833.field_40716.rotationDegrees((float)i * 65.3f));
                                matrices.method_22907(class_7833.field_40718.rotationDegrees((float)i * -9.785f));
                                float f = (float)item.method_7935((class_1309)player) - ((float)player.method_6014() - tickDelta + 1.0f);
                                float g = f / (float)class_1764.method_7775((class_1799)item, (class_1309)player);
                                if (g > 1.0f) {
                                    g = 1.0f;
                                }
                                if (g > 0.1f) {
                                    float h = class_3532.method_15374((float)((f - 0.1f) * 1.3f));
                                    float j = g - 0.1f;
                                    float k = h * j;
                                    matrices.method_46416(k * 0.0f, k * 0.004f, k * 0.0f);
                                }
                                matrices.method_46416(g * 0.0f, g * 0.0f, g * 0.04f);
                                matrices.method_22905(1.0f, 1.0f, 1.0f + g * 0.2f);
                                matrices.method_22907(class_7833.field_40715.rotationDegrees((float)i * 45.0f));
                            } else {
                                float f = -0.4f * class_3532.method_15374((float)(class_3532.method_15355((float)swingProgress) * (float)Math.PI));
                                float g = 0.2f * class_3532.method_15374((float)(class_3532.method_15355((float)swingProgress) * ((float)Math.PI * 2)));
                                float h = -0.2f * class_3532.method_15374((float)(swingProgress * (float)Math.PI));
                                matrices.method_46416((float)i * f, g, h);
                                this.method_3224(matrices, arm, equipProgress);
                                this.method_3217(matrices, arm, swingProgress);
                                if (bl22 && swingProgress < 0.001f && bl) {
                                    matrices.method_46416((float)i * -0.641864f, 0.0f, 0.0f);
                                    matrices.method_22907(class_7833.field_40716.rotationDegrees((float)i * 10.0f));
                                }
                            }
                            _3AFqh0lF09sdfXqGWjaOghi6BYyz7HCW event = this.invoke(new _3AFqh0lF09sdfXqGWjaOghi6BYyz7HCW(hand, item, equipProgress, matrices));
                            if (!event.isCancelled()) {
                                this.method_3233((class_1309)player, item, bl3 ? class_811.field_4322 : class_811.field_4321, !bl3, matrices, vertexConsumers, light);
                            }
                            break block31;
                        }
                        boolean bl = bl2 = arm == class_1306.field_6183;
                        if (!player.method_6115() || player.method_6014() <= 0 || player.method_6058() != hand) break block34;
                        int l = bl2 ? 1 : -1;
                        switch (item.method_7976()) {
                            case field_8952: {
                                this.method_3224(matrices, arm, equipProgress);
                                break;
                            }
                            case field_8950: 
                            case field_8946: {
                                this.method_3218(matrices, tickDelta, arm, item, (class_1657)player);
                                this.method_3224(matrices, arm, equipProgress);
                                if (jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.gxP5Sdr5vYTqrg5UDiPPRC8tScUFDfQn()) {
                                    this.method_3217(matrices, arm, swingProgress);
                                    break;
                                }
                                break block35;
                            }
                            case field_8949: {
                                if (!n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.Aonvur9S8uzTfJKUr1NUGqvYDikHYaCI(matrices, arm, swingProgress, equipProgress)) {
                                    this.method_3224(matrices, arm, equipProgress);
                                    break;
                                }
                                break block35;
                            }
                            case field_8953: {
                                this.method_3224(matrices, arm, equipProgress);
                                if (jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.gxP5Sdr5vYTqrg5UDiPPRC8tScUFDfQn()) {
                                    this.method_3217(matrices, arm, swingProgress);
                                }
                                matrices.method_46416((float)l * -0.2785682f, 0.18344387f, 0.15731531f);
                                matrices.method_22907(class_7833.field_40714.rotationDegrees(-13.935f));
                                matrices.method_22907(class_7833.field_40716.rotationDegrees((float)l * 35.3f));
                                matrices.method_22907(class_7833.field_40718.rotationDegrees((float)l * -9.785f));
                                float m = (float)item.method_7935((class_1309)player) - ((float)player.method_6014() - tickDelta + 1.0f);
                                float f = m / 20.0f;
                                f = (f * f + f * 2.0f) / 3.0f;
                                if (f > 1.0f) {
                                    f = 1.0f;
                                }
                                if (f > 0.1f) {
                                    float g = class_3532.method_15374((float)((m - 0.1f) * 1.3f));
                                    float h = f - 0.1f;
                                    float j = g * h;
                                    matrices.method_46416(j * 0.0f, j * 0.004f, j * 0.0f);
                                }
                                matrices.method_46416(f * 0.0f, f * 0.0f, f * 0.04f);
                                matrices.method_22905(1.0f, 1.0f, 1.0f + f * 0.2f);
                                matrices.method_22907(class_7833.field_40715.rotationDegrees((float)l * 45.0f));
                                break;
                            }
                            case field_8951: {
                                this.method_3224(matrices, arm, equipProgress);
                                matrices.method_46416((float)l * -0.5f, 0.7f, 0.1f);
                                matrices.method_22907(class_7833.field_40714.rotationDegrees(-55.0f));
                                matrices.method_22907(class_7833.field_40716.rotationDegrees((float)l * 35.3f));
                                matrices.method_22907(class_7833.field_40718.rotationDegrees((float)l * -9.785f));
                                float m = (float)item.method_7935((class_1309)player) - ((float)player.method_6014() - tickDelta + 1.0f);
                                float f = m / 10.0f;
                                if (f > 1.0f) {
                                    f = 1.0f;
                                }
                                if (f > 0.1f) {
                                    float g = class_3532.method_15374((float)((m - 0.1f) * 1.3f));
                                    float h = f - 0.1f;
                                    float j = g * h;
                                    matrices.method_46416(j * 0.0f, j * 0.004f, j * 0.0f);
                                }
                                matrices.method_46416(0.0f, 0.0f, f * 0.2f);
                                matrices.method_22905(1.0f, 1.0f, 1.0f + f * 0.2f);
                                matrices.method_22907(class_7833.field_40715.rotationDegrees((float)l * 45.0f));
                                break;
                            }
                            case field_42717: {
                                this.method_49340(matrices, tickDelta, arm, item, (class_1657)player, equipProgress);
                                break;
                            }
                        }
                        break block35;
                    }
                    if (player.method_6123()) {
                        this.method_3224(matrices, arm, equipProgress);
                        int l = bl2 ? 1 : -1;
                        matrices.method_46416((float)l * -0.4f, 0.8f, 0.3f);
                        matrices.method_22907(class_7833.field_40716.rotationDegrees((float)l * 65.0f));
                        matrices.method_22907(class_7833.field_40718.rotationDegrees((float)l * -85.0f));
                    } else if (!n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.Aonvur9S8uzTfJKUr1NUGqvYDikHYaCI(matrices, arm, swingProgress, equipProgress)) {
                        float n = -0.4f * class_3532.method_15374((float)(class_3532.method_15355((float)swingProgress) * (float)Math.PI));
                        float m = 0.2f * class_3532.method_15374((float)(class_3532.method_15355((float)swingProgress) * ((float)Math.PI * 2)));
                        float f = -0.2f * class_3532.method_15374((float)(swingProgress * (float)Math.PI));
                        int o = bl2 ? 1 : -1;
                        matrices.method_46416((float)o * n, m, f);
                        this.method_3224(matrices, arm, equipProgress);
                        this.method_3217(matrices, arm, swingProgress);
                    }
                }
                _3AFqh0lF09sdfXqGWjaOghi6BYyz7HCW event = this.invoke(new _3AFqh0lF09sdfXqGWjaOghi6BYyz7HCW(hand, item, equipProgress, matrices));
                if (!event.isCancelled()) {
                    this.method_3233((class_1309)player, item, bl2 ? class_811.field_4322 : class_811.field_4321, !bl2, matrices, vertexConsumers, light);
                }
            }
            matrices.method_22909();
        }
    }

    @Shadow
    protected abstract void method_3231(class_4587 var1, class_4597 var2, int var3, float var4, float var5, float var6);

    @Shadow
    public abstract void method_3233(class_1309 var1, class_1799 var2, class_811 var3, boolean var4, class_4587 var5, class_4597 var6, int var7);

    @Shadow
    protected abstract void method_3219(class_4587 var1, class_4597 var2, int var3, float var4, float var5, class_1306 var6);

    @Inject(method={"applyEatOrDrinkTransformation"}, at={@At(value="HEAD")}, cancellable=true)
    private void applyEatOrDrinkTransformationHook(class_4587 matrices, float tickDelta, class_1306 arm, class_1799 stack, class_1657 player, CallbackInfo ci) {
        this.invoke(new jeo4wwQ2XmAPT1iNZ3rUiGZL4BDHjjPw(matrices, tickDelta, arm, stack), ci);
    }
}

