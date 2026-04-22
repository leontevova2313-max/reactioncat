/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_746.class})
public interface IClientPlayerEntity {
    @Accessor(value="lastOnGround")
    public void setLastOnGround(boolean var1);

    @Accessor(value="ticksSinceLastPositionPacketSent")
    public void setTicksSinceLastPosition(int var1);
}

