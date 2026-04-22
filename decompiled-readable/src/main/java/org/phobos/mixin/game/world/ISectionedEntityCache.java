/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import net.minecraft.class_5568;
import net.minecraft.class_5572;
import net.minecraft.class_5573;
import net.minecraft.class_5584;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_5573.class})
public interface ISectionedEntityCache<T extends class_5568> {
    @Accessor(value="trackedPositions")
    public LongSortedSet getTrackedPositions();

    @Accessor(value="trackingSections")
    public Long2ObjectMap<class_5572<T>> getTrackingSections();

    @Accessor(value="posToStatus")
    public Long2ObjectFunction<class_5584> getPosToStatus();

    @Accessor(value="entityClass")
    public Class<T> getEntityClass();
}

