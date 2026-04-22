/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2828.class})
public interface IPlayerMoveC2SPacket {
    @Mutable
    @Accessor(value="x")
    public double getX();

    @Mutable
    @Accessor(value="y")
    public void setY(double var1);

    @Mutable
    @Accessor(value="pitch")
    public float getPitch();

    @Mutable
    @Accessor(value="z")
    public void setZ(double var1);

    @Mutable
    @Accessor(value="pitch")
    public void setPitch(float var1);

    @Mutable
    @Accessor(value="z")
    public double getZ();

    @Mutable
    @Accessor(value="y")
    public double getY();

    @Mutable
    @Accessor(value="x")
    public void setX(double var1);

    @Mutable
    @Accessor(value="yaw")
    public float getYaw();

    @Mutable
    @Accessor(value="onGround")
    public void setOnGround(boolean var1);

    @Mutable
    @Accessor(value="yaw")
    public void setYaw(float var1);
}

