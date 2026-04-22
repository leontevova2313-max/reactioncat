/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_2350;
import net.minecraft.class_251;
import net.minecraft.class_265;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_265.class})
public interface IVoxelShape {
    @Accessor(value="voxels")
    public class_251 getVoxels();

    @Invoker(value="getCoordIndex")
    public int index(class_2350.class_2351 var1, double var2);
}

