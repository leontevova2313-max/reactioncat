/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2558;
import org.earthhack.ducks.IClickEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_2558.class})
public abstract class MixinClickEvent
implements IClickEvent {
    @Unique
    private final List<Runnable> callbacks = new ArrayList<Runnable>();

    @Override
    public List<Runnable> getCallbacks() {
        return this.callbacks;
    }
}

