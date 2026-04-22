/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_6374;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_6374.class})
public interface ICommonPongC2SPacket {
    @Mutable
    @Accessor(value="parameter")
    public void setParameter(int var1);
}

