/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_339;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_339.class})
public abstract class MixinClickableWidget {
    @Shadow
    protected float field_22765;
    @Shadow
    public boolean field_22763;

    @Shadow
    public abstract int method_25364();

    @Shadow
    public abstract int method_25368();

    @Shadow
    public abstract int method_46427();

    @Shadow
    public abstract int method_46426();
}

