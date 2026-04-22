/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2886;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2886.class})
public interface IPlayerInteractItemC2SPacket {
    @Mutable
    @Accessor(value="pitch")
    public void setPitch(float var1);

    @Mutable
    @Accessor(value="yaw")
    public void setYaw(float var1);
}

