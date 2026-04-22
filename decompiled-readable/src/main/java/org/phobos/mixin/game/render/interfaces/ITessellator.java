/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_289;
import net.minecraft.class_9799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_289.class})
public interface ITessellator {
    @Accessor(value="allocator")
    public class_9799 getAllocator();
}

