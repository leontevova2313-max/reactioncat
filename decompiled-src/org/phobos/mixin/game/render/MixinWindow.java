/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render;

import java.awt.Dimension;
import java.awt.Toolkit;
import net.minecraft.class_1041;
import org.lwjgl.glfw.GLFW;
import org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM.arYwQPBy5k2b3w7Raa54qs5UDA8xHfxr;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1041.class})
public abstract class MixinWindow {
    @Shadow
    private int field_5197;
    @Shadow
    private int field_5182;
    @Shadow
    @Final
    private long field_5187;

    @Inject(method={"updateWindowRegion"}, at={@At(value="TAIL")})
    private void updateWindowRegionHook(CallbackInfo ci) {
        if (!arYwQPBy5k2b3w7Raa54qs5UDA8xHfxr.JSwEeVP9gHi8R49fnJEwGywEpuysE5r1()) {
            return;
        }
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        GLFW.glfwSetWindowAttrib((long)this.field_5187, (int)131077, (int)0);
        GLFW.glfwSetWindowMonitor((long)this.field_5187, (long)0L, (int)0, (int)0, (int)dimension.width, (int)dimension.height, (int)-1);
    }
}

