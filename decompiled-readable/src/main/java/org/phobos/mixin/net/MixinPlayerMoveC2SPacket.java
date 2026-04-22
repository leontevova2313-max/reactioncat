/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import net.minecraft.class_2828;
import org.earthhack.ducks.IPlayerMoveC2SPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_2828.class})
public abstract class MixinPlayerMoveC2SPacket
implements IPlayerMoveC2SPacket {
    @Unique
    private boolean skipping;

    @Override
    public boolean isSkipping() {
        return this.skipping;
    }

    @Override
    public void setSkipping() {
        this.skipping = true;
    }
}

