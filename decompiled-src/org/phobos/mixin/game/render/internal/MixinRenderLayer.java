/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.internal;

import net.minecraft.class_1921;
import net.minecraft.class_9801;
import org.earthhack.ducks.IRenderLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1921.class})
public abstract class MixinRenderLayer
implements IRenderLayer {
    @Unique
    private Runnable starter;
    @Unique
    private Runnable finisher;

    @Override
    public void setStarter(Runnable starter) {
        this.starter = starter;
    }

    @Override
    public void setFinisher(Runnable finisher) {
        this.finisher = finisher;
    }

    @Inject(method={"draw"}, at={@At(value="TAIL")})
    private void drawHook2(class_9801 buffer, CallbackInfo ci) {
        if (this.finisher == null) {
            return;
        }
        this.finisher.run();
    }

    @Inject(method={"draw"}, at={@At(value="HEAD")})
    private void drawHook1(class_9801 buffer, CallbackInfo ci) {
        if (this.starter == null) {
            return;
        }
        this.starter.run();
    }
}

