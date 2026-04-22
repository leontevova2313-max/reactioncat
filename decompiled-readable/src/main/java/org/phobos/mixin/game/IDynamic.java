/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game;

import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_9779.class_9781.class})
public interface IDynamic {
    @Accessor(value="paused")
    public boolean isPaused();

    @Accessor(value="tickFrozen")
    public boolean isFrozen();
}

