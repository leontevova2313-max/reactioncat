/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_332.class})
public interface IDrawContext {
    @Invoker(value="tryDraw")
    public void invokeDraw();
}

