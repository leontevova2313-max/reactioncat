/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1665;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1665.class})
public interface IPersistentProjectileEntity {
    @Accessor(value="inGround")
    public boolean collided();

    @Accessor(value="inGroundTime")
    public int getInGroundTime();
}

