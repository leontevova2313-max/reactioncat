/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_276;
import net.minecraft.class_283;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_283.class})
public interface IPostEffectPass {
    @Mutable
    @Accessor(value="output")
    public void setOutput(class_276 var1);

    @Mutable
    @Accessor(value="input")
    public void setInput(class_276 var1);
}

