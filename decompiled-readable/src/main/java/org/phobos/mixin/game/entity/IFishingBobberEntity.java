/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1297;
import net.minecraft.class_1536;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1536.class})
public interface IFishingBobberEntity {
    @Accessor(value="hookedEntity")
    @Nullable
    public class_1297 getHookedEntity();
}

