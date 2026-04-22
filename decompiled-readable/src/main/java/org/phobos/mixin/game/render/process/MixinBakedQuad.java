/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import net.minecraft.class_777;
import org.earthhack.ducks.IBakedQuad;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_777.class})
public abstract class MixinBakedQuad
implements IBakedQuad {
    @Shadow
    @Final
    protected int[] field_4175;

    @Override
    public float getZ(int vertex) {
        return Float.intBitsToFloat(this.field_4175[vertex * 8 + 2]);
    }

    @Override
    public float getY(int vertex) {
        return Float.intBitsToFloat(this.field_4175[vertex * 8 + 1]);
    }

    @Override
    public float getX(int vertex) {
        return Float.intBitsToFloat(this.field_4175[vertex * 8]);
    }
}

