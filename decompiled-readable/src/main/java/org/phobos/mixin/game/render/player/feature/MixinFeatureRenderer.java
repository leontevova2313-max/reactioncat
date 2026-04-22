/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player.feature;

import net.minecraft.class_1297;
import net.minecraft.class_3887;
import net.minecraft.class_583;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_3887.class})
public abstract class MixinFeatureRenderer<T extends class_1297, M extends class_583<T>> {
    @Shadow
    public abstract M method_17165();
}

