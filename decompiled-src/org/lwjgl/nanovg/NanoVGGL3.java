/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import javax.annotation.Nullable;
import org.lwjgl.nanovg.LibNanoVG;
import org.lwjgl.nanovg.NVGLUFramebuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoVGGL3 {
    public static final int NVG_ANTIALIAS = 1;
    public static final int NVG_STENCIL_STROKES = 2;
    public static final int NVG_DEBUG = 4;
    public static final int NVG_IMAGE_NODELETE = 65536;

    protected NanoVGGL3() {
        throw new UnsupportedOperationException();
    }

    public static native int nnvglCreateImageFromHandle(long var0, int var2, int var3, int var4, int var5);

    public static int nvglCreateImageFromHandle(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="GLuint") int textureId, int w, int h, int flags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVGGL3.nnvglCreateImageFromHandle(ctx, textureId, w, h, flags);
    }

    public static native int nnvglImageHandle(long var0, int var2);

    @NativeType(value="GLuint")
    public static int nvglImageHandle(@NativeType(value="NVGcontext *") long ctx, int image) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVGGL3.nnvglImageHandle(ctx, image);
    }

    public static native long nnvgCreate(int var0);

    @NativeType(value="NVGcontext *")
    public static long nvgCreate(int flags) {
        return NanoVGGL3.nnvgCreate(flags);
    }

    public static native void nnvgDelete(long var0);

    public static void nvgDelete(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVGGL3.nnvgDelete(ctx);
    }

    public static native long nnvgluCreateFramebuffer(long var0, int var2, int var3, int var4);

    @Nullable
    @NativeType(value="NVGLUframebuffer *")
    public static NVGLUFramebuffer nvgluCreateFramebuffer(@NativeType(value="NVGcontext *") long ctx, int w, int h, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        long __result = NanoVGGL3.nnvgluCreateFramebuffer(ctx, w, h, imageFlags);
        return NVGLUFramebuffer.createSafe(__result);
    }

    public static native void nnvgluBindFramebuffer(long var0, long var2);

    public static void nvgluBindFramebuffer(@NativeType(value="NVGcontext *") long ctx, @Nullable @NativeType(value="NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVGGL3.nnvgluBindFramebuffer(ctx, MemoryUtil.memAddressSafe(fb));
    }

    public static native void nnvgluDeleteFramebuffer(long var0, long var2);

    public static void nvgluDeleteFramebuffer(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="NVGLUframebuffer *") NVGLUFramebuffer fb) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVGGL3.nnvgluDeleteFramebuffer(ctx, fb.address());
    }

    static {
        LibNanoVG.initialize();
    }
}

