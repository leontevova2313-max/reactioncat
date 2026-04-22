/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import java.awt.Color;
import net.minecraft.class_723;
import org.phobos.secure.3BztNC70MwSEQNTzZ4lvFGqznxpf9J2W.h8XsoosExKicgnRCZfFzsLmTTsiGoQx4;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_723.class_4795.class})
public abstract class MixinCrimsonSporeFactory {
    @Redirect(method={"createParticle(Lnet/minecraft/particle/SimpleParticleType;Lnet/minecraft/client/world/ClientWorld;DDDDDD)Lnet/minecraft/client/particle/Particle;"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/particle/WaterSuspendParticle;setColor(FFF)V"))
    private void createParticleHook(class_723 instance, float red, float green, float blue) {
        Color color = h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.tBxwXTKQIYH0xM8u3eXM0b2mCkNxGiH1();
        if (color == null) {
            instance.method_3084(red, green, blue);
            return;
        }
        instance.method_3084((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
    }
}

