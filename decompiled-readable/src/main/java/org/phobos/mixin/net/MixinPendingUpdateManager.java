/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import net.minecraft.class_7202;
import org.earthhack.ducks.IPendingUpdateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_7202.class})
public abstract class MixinPendingUpdateManager
implements IPendingUpdateManager {
    @Shadow
    private int field_37954;

    @Override
    public void decrementSequence() {
        --this.field_37954;
    }
}

