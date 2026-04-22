/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_377;
import net.minecraft.class_382;
import net.minecraft.class_4588;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_327.class})
public interface ITextRenderer {
    @Accessor(value="validateAdvance")
    public boolean getValidateAdvance();

    @Invoker(value="getFontStorage")
    public class_377 invokeGetFontStorage(class_2960 var1);

    @Invoker(value="drawGlyph")
    public void invokeDrawGlyph(class_382 var1, boolean var2, boolean var3, float var4, float var5, float var6, Matrix4f var7, class_4588 var8, float var9, float var10, float var11, float var12, int var13);
}

