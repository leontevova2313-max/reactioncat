/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.internal;

import net.minecraft.class_291;
import net.minecraft.class_2960;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_761.class})
public interface IWorldRenderer {
    @Accessor(value="MOON_PHASES")
    public static class_2960 getMoonPhases() {
        return class_2960.method_60656((String)"textures/environment/moon_phases.png");
    }

    @Accessor(value="starsBuffer")
    public class_291 getStarsBuffer();

    @Accessor(value="lightSkyBuffer")
    public class_291 getLightSkyBuffer();

    @Accessor(value="SUN")
    public static class_2960 getSun() {
        return class_2960.method_60656((String)"textures/environment/sun.png");
    }

    @Accessor(value="darkSkyBuffer")
    public class_291 getDarkSkyBuffer();

    @Accessor(value="END_SKY")
    public static class_2960 getEndSky() {
        return class_2960.method_60656((String)"textures/environment/end_sky.png");
    }
}

