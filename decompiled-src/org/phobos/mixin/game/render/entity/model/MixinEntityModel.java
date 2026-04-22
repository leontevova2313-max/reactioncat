/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity.model;

import net.minecraft.class_1297;
import net.minecraft.class_583;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_583.class})
public abstract class MixinEntityModel<T extends class_1297> {
    @Shadow
    public boolean field_3449;
    @Shadow
    public float field_3447;
}

