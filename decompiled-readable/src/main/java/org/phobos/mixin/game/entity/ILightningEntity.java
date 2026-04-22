/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1538;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1538.class})
public interface ILightningEntity {
    @Accessor(value="remainingActions")
    public void setRemainingActions(int var1);

    @Accessor(value="ambientTick")
    public void setAmbientTick(int var1);
}

