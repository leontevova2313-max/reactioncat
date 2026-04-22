/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_243;
import org.earthhack.ducks.IVec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_243.class})
public abstract class MixinVec3d
implements IVec3d {
    @Mutable
    @Shadow
    @Final
    public double field_1351;
    @Mutable
    @Shadow
    @Final
    public double field_1350;
    @Mutable
    @Shadow
    @Final
    public double field_1352;

    @Override
    public void setZ(double value) {
        this.field_1350 = value;
    }

    @Override
    public void setY(double value) {
        this.field_1351 = value;
    }

    @Override
    public void setX(double value) {
        this.field_1352 = value;
    }
}

