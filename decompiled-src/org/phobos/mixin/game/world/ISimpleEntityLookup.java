/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_5568;
import net.minecraft.class_5570;
import net.minecraft.class_5573;
import net.minecraft.class_5578;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_5578.class})
public interface ISimpleEntityLookup<T extends class_5568> {
    @Accessor(value="index")
    public class_5570<T> getEntityIndex();

    @Accessor(value="cache")
    public class_5573<T> getEntityCache();
}

