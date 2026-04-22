/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_8080;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_8080.class})
public interface ILimbAnimator {
    @Accessor(value="prevSpeed")
    public void setPrevSpeed(float var1);

    @Accessor(value="prevSpeed")
    public float getPrevSpeed();

    @Accessor(value="pos")
    public void setPos(float var1);
}

