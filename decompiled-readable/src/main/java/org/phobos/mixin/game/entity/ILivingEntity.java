/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1309.class})
public interface ILivingEntity {
    @Accessor(value="serverY")
    public double getLerpY();

    @Accessor(value="lastLeaningPitch")
    public float getLastLeaningPitch();

    @Accessor(value="serverX")
    public double getLerpX();

    @Accessor(value="leaningPitch")
    public void setLeaningPitch(float var1);

    @Accessor(value="leaningPitch")
    public float getLeaningPitch();

    @Accessor(value="lastLeaningPitch")
    public void setLastLeaningPitch(float var1);

    @Accessor(value="serverZ")
    public double getLerpZ();
}

