/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2637;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2637.class})
public interface IChunkDeltaUpdateS2CPacket {
    @Accessor(value="positions")
    public short[] getPositions();
}

