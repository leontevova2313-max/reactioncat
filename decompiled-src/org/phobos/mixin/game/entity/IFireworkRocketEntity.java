/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1309;
import net.minecraft.class_1671;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_1671.class})
public interface IFireworkRocketEntity {
    @Accessor(value="shooter")
    public class_1309 getShooter();
}

