/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_4970;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_4970.class})
public interface IAbstractBlock {
    @Mutable
    @Accessor(value="slipperiness")
    public void setSlipperiness(float var1);
}

