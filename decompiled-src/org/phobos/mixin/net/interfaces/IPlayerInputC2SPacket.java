/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2851;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2851.class})
public interface IPlayerInputC2SPacket {
    @Mutable
    @Accessor(value="sideways")
    public void setSideways(float var1);

    @Mutable
    @Accessor(value="sneaking")
    public void setSneaking(boolean var1);

    @Mutable
    @Accessor(value="forward")
    public void setForward(float var1);

    @Mutable
    @Accessor(value="jumping")
    public void setJumping(boolean var1);
}

