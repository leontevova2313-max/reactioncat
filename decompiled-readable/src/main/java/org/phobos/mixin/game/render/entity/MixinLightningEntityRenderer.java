/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1538;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5819;
import net.minecraft.class_757;
import net.minecraft.class_919;
import org.joml.Matrix4f;
import org.phobos.secure.group005.AmbienceModule;
import org.phobos.secure.group010.SecureClass0154;
import org.phobos.secure.group010.SecureClass0158;
import org.phobos.secure.group045.SecureClass0792;
import org.phobos.secure.group050.SecureClass0898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_919.class})
public abstract class MixinLightningEntityRenderer {
    @Inject(method={"render(Lnet/minecraft/entity/LightningEntity;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook(class_1538 lightningEntity, float f, float g, class_4587 matrixStack, class_4597 vertexConsumerProvider, int i, CallbackInfo ci) {
        if (!AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() || !AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().cfr_renamed_32().getValue().booleanValue()) {
            return;
        }
        float[] fs = new float[8];
        float[] gs = new float[8];
        float h = 0.0f;
        float j = 0.0f;
        class_5819 random = class_5819.method_43049((long)lightningEntity.field_7186);
        for (int k = 7; k >= 0; --k) {
            fs[k] = h;
            gs[k] = j;
            h += (float)(random.method_43048(11) - 5);
            j += (float)(random.method_43048(11) - 5);
        }
        class_287 bufferBuilder = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        Matrix4f matrix4f = matrixStack.method_23760().method_23761();
        Color color = AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().adQPaiAhmdIo0dBiG1l3JiW9YlvBwSEK().getValue();
        float[] array = SecureClass0898.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(color);
        int l = 0;
        block1: while (true) {
            if (l >= 4) {
                SecureClass0154.XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc();
                RenderSystem.setShader(class_757::method_34531);
                RenderSystem.enableBlend();
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.setShaderColor((float)array[0], (float)array[1], (float)array[2], (float)array[3]);
                SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(bufferBuilder);
                RenderSystem.disableBlend();
                RenderSystem.defaultBlendFunc();
                SecureClass0792.Wpx1330OxcpSsERyRWQVZ8fA9HV95kF5.run();
                SecureClass0154.cD5c5foD8g4JvEZljruDvicTFTkkVlE7();
                ci.cancel();
                return;
            }
            class_5819 random2 = class_5819.method_43049((long)lightningEntity.field_7186);
            int m = 0;
            while (true) {
                float q;
                float p;
                int o;
                if (m < 3) {
                    int n = 7;
                    o = 0;
                    if (m > 0) {
                        n = 7 - m;
                    }
                    if (m > 0) {
                        o = n - 2;
                    }
                    p = fs[n] - h;
                    q = gs[n] - j;
                } else {
                    ++l;
                    continue block1;
                }
                for (int r = n; r >= o; --r) {
                    float s = p;
                    float t = q;
                    if (m == 0) {
                        p += (float)(random2.method_43048(11) - 5);
                        q += (float)(random2.method_43048(11) - 5);
                    } else {
                        p += (float)(random2.method_43048(31) - 15);
                        q += (float)(random2.method_43048(31) - 15);
                    }
                    float u = 0.5f;
                    float v = 0.45f;
                    float w = 0.45f;
                    float x = 0.5f;
                    float y = 0.1f + (float)l * 0.2f;
                    if (m == 0) {
                        y *= (float)r * 0.1f + 1.0f;
                    }
                    float z = 0.1f + (float)l * 0.2f;
                    if (m == 0) {
                        z *= ((float)r - 1.0f) * 0.1f + 1.0f;
                    }
                    MixinLightningEntityRenderer.draw(matrix4f, (class_4588)bufferBuilder, p, q, r, s, t, array[0], array[1], array[2], array[3], y, z, false, false, true, false);
                    MixinLightningEntityRenderer.draw(matrix4f, (class_4588)bufferBuilder, p, q, r, s, t, array[0], array[1], array[2], array[3], y, z, true, false, true, true);
                    MixinLightningEntityRenderer.draw(matrix4f, (class_4588)bufferBuilder, p, q, r, s, t, array[0], array[1], array[2], array[3], y, z, true, true, false, true);
                    MixinLightningEntityRenderer.draw(matrix4f, (class_4588)bufferBuilder, p, q, r, s, t, array[0], array[1], array[2], array[3], y, z, false, true, false, false);
                }
                ++m;
            }
            break;
        }
    }

    @Unique
    private static void draw(Matrix4f matrix, class_4588 buffer, float x1, float z1, int y, float x2, float z2, float red, float green, float blue, float alpha, float offset2, float offset1, boolean shiftEast1, boolean shiftSouth1, boolean shiftEast2, boolean shiftSouth2) {
        buffer.method_22918(matrix, x1 + (shiftEast1 ? offset1 : -offset1), (float)(y * 16), z1 + (shiftSouth1 ? offset1 : -offset1)).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x2 + (shiftEast1 ? offset2 : -offset2), (float)((y + 1) * 16), z2 + (shiftSouth1 ? offset2 : -offset2)).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x2 + (shiftEast2 ? offset2 : -offset2), (float)((y + 1) * 16), z2 + (shiftSouth2 ? offset2 : -offset2)).method_22915(red, green, blue, alpha);
        buffer.method_22918(matrix, x1 + (shiftEast2 ? offset1 : -offset1), (float)(y * 16), z1 + (shiftSouth2 ? offset1 : -offset1)).method_22915(red, green, blue, alpha);
    }
}

