/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2777;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2777.class})
public interface IEntityPositionS2SPacket {
    @Mutable
    @Accessor(value="entityId")
    public void setEntityId(int var1);
}

