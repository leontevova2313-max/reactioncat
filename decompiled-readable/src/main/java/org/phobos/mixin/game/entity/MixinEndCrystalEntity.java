/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1511;
import org.earthhack.ducks.IEndCrystalEntity;
import org.phobos.secure.group022.SecureClass0377;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value={class_1511.class})
public abstract class MixinEndCrystalEntity
implements IEndCrystalEntity {
    @Unique
    private final SecureClass0377 animation = new SecureClass0377(4.0f, 2.0f);
    @Unique
    private boolean rendering;
    @Unique
    private int lastTick;

    @Override
    public SecureClass0377 getAnimation() {
        return this.animation;
    }

    @Override
    public boolean isRendering() {
        return this.rendering;
    }

    @Override
    public void setRendering(boolean rendering) {
        this.rendering = rendering;
    }

    @Override
    public int getLastTick() {
        return this.lastTick;
    }

    @Override
    public void setLastTick(int tick) {
        this.lastTick = tick;
    }
}

