/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.internal;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_4608;
import org.phobos.secure.group005.AmbienceModule;
import org.phobos.secure.group022.SecureInterface0062;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4608.class})
public abstract class MixinOverlayTexture
implements SecureInterface0062 {
    @Shadow
    @Final
    private class_1043 field_21013;

    @Override
    public void LgN674SZYLyIyHbdvAFPvtaTXCW90apX() {
        this.pack();
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void initHook(CallbackInfo ci) {
        SecureInterface0062.OnVAcncIqSLfRvh1c9x9yhbUwc7t2SBT(this);
        this.pack();
    }

    private void pack() {
        class_1011 nativeImage = this.field_21013.method_4525();
        int i = 0;
        while (i < 16) {
            for (int j = 0; j < 16; ++j) {
                if (i >= 8) continue;
                assert (nativeImage != null);
                if (AmbienceModule.QYuw9tBcsX8RgHrfwyLxO2hX9hkcjiXu()) {
                    Color color = AmbienceModule.f9FWytvKEc6mwAFo46qJUqvSbA8eWO9G();
                    nativeImage.method_4305(j, i, MixinOverlayTexture.getColorInt(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()));
                    continue;
                }
                nativeImage.method_4305(j, i, -1308622593);
            }
            RenderSystem.activeTexture((int)33985);
            this.field_21013.method_23207();
            nativeImage.method_22619(0, 0, 0, 0, 0, nativeImage.method_4307(), nativeImage.method_4323(), false, true, false, false);
            RenderSystem.activeTexture((int)33984);
            ++i;
        }
        return;
    }

    private static int getColorInt(int red, int green, int blue, int alpha) {
        alpha = 255 - alpha;
        return (alpha << 24) + (blue << 16) + (green << 8) + red;
    }
}

