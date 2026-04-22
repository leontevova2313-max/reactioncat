/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.LibNanoVG;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGGlyphPosition;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NVGTextRow;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoVG {
    public static final float NVG_PI = (float)Math.PI;
    public static final int NVG_CCW = 1;
    public static final int NVG_CW = 2;
    public static final int NVG_SOLID = 1;
    public static final int NVG_HOLE = 2;
    public static final int NVG_BUTT = 0;
    public static final int NVG_ROUND = 1;
    public static final int NVG_SQUARE = 2;
    public static final int NVG_BEVEL = 3;
    public static final int NVG_MITER = 4;
    public static final int NVG_ALIGN_LEFT = 1;
    public static final int NVG_ALIGN_CENTER = 2;
    public static final int NVG_ALIGN_RIGHT = 4;
    public static final int NVG_ALIGN_TOP = 8;
    public static final int NVG_ALIGN_MIDDLE = 16;
    public static final int NVG_ALIGN_BOTTOM = 32;
    public static final int NVG_ALIGN_BASELINE = 64;
    public static final int NVG_ZERO = 1;
    public static final int NVG_ONE = 2;
    public static final int NVG_SRC_COLOR = 4;
    public static final int NVG_ONE_MINUS_SRC_COLOR = 8;
    public static final int NVG_DST_COLOR = 16;
    public static final int NVG_ONE_MINUS_DST_COLOR = 32;
    public static final int NVG_SRC_ALPHA = 64;
    public static final int NVG_ONE_MINUS_SRC_ALPHA = 128;
    public static final int NVG_DST_ALPHA = 256;
    public static final int NVG_ONE_MINUS_DST_ALPHA = 512;
    public static final int NVG_SRC_ALPHA_SATURATE = 1024;
    public static final int NVG_SOURCE_OVER = 0;
    public static final int NVG_SOURCE_IN = 1;
    public static final int NVG_SOURCE_OUT = 2;
    public static final int NVG_ATOP = 3;
    public static final int NVG_DESTINATION_OVER = 4;
    public static final int NVG_DESTINATION_IN = 5;
    public static final int NVG_DESTINATION_OUT = 6;
    public static final int NVG_DESTINATION_ATOP = 7;
    public static final int NVG_LIGHTER = 8;
    public static final int NVG_COPY = 9;
    public static final int NVG_XOR = 10;
    public static final int NVG_IMAGE_GENERATE_MIPMAPS = 1;
    public static final int NVG_IMAGE_REPEATX = 2;
    public static final int NVG_IMAGE_REPEATY = 4;
    public static final int NVG_IMAGE_FLIPY = 8;
    public static final int NVG_IMAGE_PREMULTIPLIED = 16;
    public static final int NVG_IMAGE_NEAREST = 32;
    static final long nvgCreateInternal;
    static final long nvgInternalParams;
    static final long nvgDeleteInternal;

    protected NanoVG() {
        throw new UnsupportedOperationException();
    }

    public static native void nnvgBeginFrame(long var0, float var2, float var3, float var4);

    public static void nvgBeginFrame(@NativeType(value="NVGcontext *") long ctx, float windowWidth, float windowHeight, float devicePixelRatio) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgBeginFrame(ctx, windowWidth, windowHeight, devicePixelRatio);
    }

    public static native void nnvgCancelFrame(long var0);

    public static void nvgCancelFrame(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgCancelFrame(ctx);
    }

    public static native void nnvgEndFrame(long var0);

    public static void nvgEndFrame(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgEndFrame(ctx);
    }

    public static native void nnvgGlobalCompositeOperation(long var0, int var2);

    public static void nvgGlobalCompositeOperation(@NativeType(value="NVGcontext *") long ctx, int op) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgGlobalCompositeOperation(ctx, op);
    }

    public static native void nnvgGlobalCompositeBlendFunc(long var0, int var2, int var3);

    public static void nvgGlobalCompositeBlendFunc(@NativeType(value="NVGcontext *") long ctx, int sfactor, int dfactor) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgGlobalCompositeBlendFunc(ctx, sfactor, dfactor);
    }

    public static native void nnvgGlobalCompositeBlendFuncSeparate(long var0, int var2, int var3, int var4, int var5);

    public static void nvgGlobalCompositeBlendFuncSeparate(@NativeType(value="NVGcontext *") long ctx, int srcRGB, int dstRGB, int srcAlpha, int dstAlpha) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgGlobalCompositeBlendFuncSeparate(ctx, srcRGB, dstRGB, srcAlpha, dstAlpha);
    }

    public static native void nnvgRGB(byte var0, byte var1, byte var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgRGB(@NativeType(value="unsigned char") byte r, @NativeType(value="unsigned char") byte g, @NativeType(value="unsigned char") byte b, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgRGB(r, g, b, __result.address());
        return __result;
    }

    public static native void nnvgRGBf(float var0, float var1, float var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgRGBf(float r, float g, float b, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgRGBf(r, g, b, __result.address());
        return __result;
    }

    public static native void nnvgRGBA(byte var0, byte var1, byte var2, byte var3, long var4);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgRGBA(@NativeType(value="unsigned char") byte r, @NativeType(value="unsigned char") byte g, @NativeType(value="unsigned char") byte b, @NativeType(value="unsigned char") byte a, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgRGBA(r, g, b, a, __result.address());
        return __result;
    }

    public static native void nnvgRGBAf(float var0, float var1, float var2, float var3, long var4);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgRGBAf(float r, float g, float b, float a, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgRGBAf(r, g, b, a, __result.address());
        return __result;
    }

    public static native void nnvgLerpRGBA(long var0, long var2, float var4, long var5);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgLerpRGBA(@NativeType(value="NVGcolor") NVGColor c0, @NativeType(value="NVGcolor") NVGColor c1, float u, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgLerpRGBA(c0.address(), c1.address(), u, __result.address());
        return __result;
    }

    public static native void nnvgTransRGBA(long var0, byte var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgTransRGBA(@NativeType(value="NVGcolor") NVGColor c0, @NativeType(value="unsigned char") byte a, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgTransRGBA(c0.address(), a, __result.address());
        return __result;
    }

    public static native void nnvgTransRGBAf(long var0, float var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgTransRGBAf(@NativeType(value="NVGcolor") NVGColor c0, float a, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgTransRGBAf(c0.address(), a, __result.address());
        return __result;
    }

    public static native void nnvgHSL(float var0, float var1, float var2, long var3);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgHSL(float h, float s, float l, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgHSL(h, s, l, __result.address());
        return __result;
    }

    public static native void nnvgHSLA(float var0, float var1, float var2, byte var3, long var4);

    @NativeType(value="NVGcolor")
    public static NVGColor nvgHSLA(float h, float s, float l, @NativeType(value="unsigned char") byte a, @NativeType(value="NVGcolor") NVGColor __result) {
        NanoVG.nnvgHSLA(h, s, l, a, __result.address());
        return __result;
    }

    public static native void nnvgSave(long var0);

    public static void nvgSave(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgSave(ctx);
    }

    public static native void nnvgRestore(long var0);

    public static void nvgRestore(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRestore(ctx);
    }

    public static native void nnvgReset(long var0);

    public static void nvgReset(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgReset(ctx);
    }

    public static native void nnvgShapeAntiAlias(long var0, int var2);

    public static void nvgShapeAntiAlias(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="int") boolean enabled) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgShapeAntiAlias(ctx, enabled ? 1 : 0);
    }

    public static native void nnvgStrokeColor(long var0, long var2);

    public static void nvgStrokeColor(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgStrokeColor(ctx, color.address());
    }

    public static native void nnvgStrokePaint(long var0, long var2);

    public static void nvgStrokePaint(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="NVGpaint") NVGPaint paint) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgStrokePaint(ctx, paint.address());
    }

    public static native void nnvgFillColor(long var0, long var2);

    public static void nvgFillColor(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="NVGcolor") NVGColor color) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFillColor(ctx, color.address());
    }

    public static native void nnvgFillPaint(long var0, long var2);

    public static void nvgFillPaint(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="NVGpaint") NVGPaint paint) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFillPaint(ctx, paint.address());
    }

    public static native void nnvgMiterLimit(long var0, float var2);

    public static void nvgMiterLimit(@NativeType(value="NVGcontext *") long ctx, float limit) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgMiterLimit(ctx, limit);
    }

    public static native void nnvgStrokeWidth(long var0, float var2);

    public static void nvgStrokeWidth(@NativeType(value="NVGcontext *") long ctx, float size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgStrokeWidth(ctx, size);
    }

    public static native void nnvgLineCap(long var0, int var2);

    public static void nvgLineCap(@NativeType(value="NVGcontext *") long ctx, int cap) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgLineCap(ctx, cap);
    }

    public static native void nnvgLineJoin(long var0, int var2);

    public static void nvgLineJoin(@NativeType(value="NVGcontext *") long ctx, int join) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgLineJoin(ctx, join);
    }

    public static native void nnvgGlobalAlpha(long var0, float var2);

    public static void nvgGlobalAlpha(@NativeType(value="NVGcontext *") long ctx, float alpha) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgGlobalAlpha(ctx, alpha);
    }

    public static native void nnvgResetTransform(long var0);

    public static void nvgResetTransform(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgResetTransform(ctx);
    }

    public static native void nnvgTransform(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void nvgTransform(@NativeType(value="NVGcontext *") long ctx, float a, float b, float c, float d, float e, float f) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTransform(ctx, a, b, c, d, e, f);
    }

    public static native void nnvgTranslate(long var0, float var2, float var3);

    public static void nvgTranslate(@NativeType(value="NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTranslate(ctx, x, y);
    }

    public static native void nnvgRotate(long var0, float var2);

    public static void nvgRotate(@NativeType(value="NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRotate(ctx, angle);
    }

    public static native void nnvgSkewX(long var0, float var2);

    public static void nvgSkewX(@NativeType(value="NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgSkewX(ctx, angle);
    }

    public static native void nnvgSkewY(long var0, float var2);

    public static void nvgSkewY(@NativeType(value="NVGcontext *") long ctx, float angle) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgSkewY(ctx, angle);
    }

    public static native void nnvgScale(long var0, float var2, float var3);

    public static void nvgScale(@NativeType(value="NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgScale(ctx, x, y);
    }

    public static native void nnvgCurrentTransform(long var0, long var2);

    public static void nvgCurrentTransform(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="float *") FloatBuffer xform) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer)xform, 6);
        }
        NanoVG.nnvgCurrentTransform(ctx, MemoryUtil.memAddress(xform));
    }

    public static native void nnvgTransformIdentity(long var0);

    public static void nvgTransformIdentity(@NativeType(value="float *") FloatBuffer dst) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformIdentity(MemoryUtil.memAddress(dst));
    }

    public static native void nnvgTransformTranslate(long var0, float var2, float var3);

    public static void nvgTransformTranslate(@NativeType(value="float *") FloatBuffer dst, float tx, float ty) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformTranslate(MemoryUtil.memAddress(dst), tx, ty);
    }

    public static native void nnvgTransformScale(long var0, float var2, float var3);

    public static void nvgTransformScale(@NativeType(value="float *") FloatBuffer dst, float sx, float sy) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformScale(MemoryUtil.memAddress(dst), sx, sy);
    }

    public static native void nnvgTransformRotate(long var0, float var2);

    public static void nvgTransformRotate(@NativeType(value="float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformRotate(MemoryUtil.memAddress(dst), a);
    }

    public static native void nnvgTransformSkewX(long var0, float var2);

    public static void nvgTransformSkewX(@NativeType(value="float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformSkewX(MemoryUtil.memAddress(dst), a);
    }

    public static native void nnvgTransformSkewY(long var0, float var2);

    public static void nvgTransformSkewY(@NativeType(value="float *") FloatBuffer dst, float a) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
        }
        NanoVG.nnvgTransformSkewY(MemoryUtil.memAddress(dst), a);
    }

    public static native void nnvgTransformMultiply(long var0, long var2);

    public static void nvgTransformMultiply(@NativeType(value="float *") FloatBuffer dst, @NativeType(value="float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
            Checks.check((Buffer)src, 6);
        }
        NanoVG.nnvgTransformMultiply(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src));
    }

    public static native void nnvgTransformPremultiply(long var0, long var2);

    public static void nvgTransformPremultiply(@NativeType(value="float *") FloatBuffer dst, @NativeType(value="float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
            Checks.check((Buffer)src, 6);
        }
        NanoVG.nnvgTransformPremultiply(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src));
    }

    public static native int nnvgTransformInverse(long var0, long var2);

    @NativeType(value="int")
    public static boolean nvgTransformInverse(@NativeType(value="float *") FloatBuffer dst, @NativeType(value="float const *") FloatBuffer src) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dst, 6);
            Checks.check((Buffer)src, 6);
        }
        return NanoVG.nnvgTransformInverse(MemoryUtil.memAddress(dst), MemoryUtil.memAddress(src)) != 0;
    }

    public static native void nnvgTransformPoint(long var0, long var2, long var4, float var6, float var7);

    public static void nvgTransformPoint(@NativeType(value="float *") FloatBuffer dstx, @NativeType(value="float *") FloatBuffer dsty, @NativeType(value="float const *") FloatBuffer xform, float srcx, float srcy) {
        if (Checks.CHECKS) {
            Checks.check((Buffer)dstx, 1);
            Checks.check((Buffer)dsty, 1);
            Checks.check((Buffer)xform, 6);
        }
        NanoVG.nnvgTransformPoint(MemoryUtil.memAddress(dstx), MemoryUtil.memAddress(dsty), MemoryUtil.memAddress(xform), srcx, srcy);
    }

    public static native float nvgDegToRad(float var0);

    public static native float nvgRadToDeg(float var0);

    public static native int nnvgCreateImage(long var0, long var2, int var4);

    public static int nvgCreateImage(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer filename, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(filename);
        }
        return NanoVG.nnvgCreateImage(ctx, MemoryUtil.memAddress(filename), imageFlags);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgCreateImage(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence filename, int imageFlags) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgCreateImage(ctx, filenameEncoded, imageFlags);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgCreateImageMem(long var0, int var2, long var3, int var5);

    public static int nvgCreateImageMem(@NativeType(value="NVGcontext *") long ctx, int imageFlags, @NativeType(value="unsigned char *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVG.nnvgCreateImageMem(ctx, imageFlags, MemoryUtil.memAddress(data), data.remaining());
    }

    public static native int nnvgCreateImageRGBA(long var0, int var2, int var3, int var4, long var5);

    public static int nvgCreateImageRGBA(@NativeType(value="NVGcontext *") long ctx, int w, int h, int imageFlags, @NativeType(value="unsigned char const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer)data, w * h * 4);
        }
        return NanoVG.nnvgCreateImageRGBA(ctx, w, h, imageFlags, MemoryUtil.memAddress(data));
    }

    public static native void nnvgUpdateImage(long var0, int var2, long var3);

    public static void nvgUpdateImage(@NativeType(value="NVGcontext *") long ctx, int image, @NativeType(value="unsigned char const *") ByteBuffer data) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgUpdateImage(ctx, image, MemoryUtil.memAddress(data));
    }

    public static native void nnvgImageSize(long var0, int var2, long var3, long var5);

    public static void nvgImageSize(@NativeType(value="NVGcontext *") long ctx, int image, @NativeType(value="int *") IntBuffer w, @NativeType(value="int *") IntBuffer h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check((Buffer)w, 1);
            Checks.check((Buffer)h, 1);
        }
        NanoVG.nnvgImageSize(ctx, image, MemoryUtil.memAddress(w), MemoryUtil.memAddress(h));
    }

    public static native void nnvgDeleteImage(long var0, int var2);

    public static void nvgDeleteImage(@NativeType(value="NVGcontext *") long ctx, int image) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgDeleteImage(ctx, image);
    }

    public static native void nnvgLinearGradient(long var0, float var2, float var3, float var4, float var5, long var6, long var8, long var10);

    @NativeType(value="NVGpaint")
    public static NVGPaint nvgLinearGradient(@NativeType(value="NVGcontext *") long ctx, float sx, float sy, float ex, float ey, @NativeType(value="NVGcolor") NVGColor icol, @NativeType(value="NVGcolor") NVGColor ocol, @NativeType(value="NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgLinearGradient(ctx, sx, sy, ex, ey, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    public static native void nnvgBoxGradient(long var0, float var2, float var3, float var4, float var5, float var6, float var7, long var8, long var10, long var12);

    @NativeType(value="NVGpaint")
    public static NVGPaint nvgBoxGradient(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float r, float f, @NativeType(value="NVGcolor") NVGColor icol, @NativeType(value="NVGcolor") NVGColor ocol, @NativeType(value="NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgBoxGradient(ctx, x, y, w, h, r, f, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    public static native void nnvgRadialGradient(long var0, float var2, float var3, float var4, float var5, long var6, long var8, long var10);

    @NativeType(value="NVGpaint")
    public static NVGPaint nvgRadialGradient(@NativeType(value="NVGcontext *") long ctx, float cx, float cy, float inr, float outr, @NativeType(value="NVGcolor") NVGColor icol, @NativeType(value="NVGcolor") NVGColor ocol, @NativeType(value="NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRadialGradient(ctx, cx, cy, inr, outr, icol.address(), ocol.address(), __result.address());
        return __result;
    }

    public static native void nnvgImagePattern(long var0, float var2, float var3, float var4, float var5, float var6, int var7, float var8, long var9);

    @NativeType(value="NVGpaint")
    public static NVGPaint nvgImagePattern(@NativeType(value="NVGcontext *") long ctx, float ox, float oy, float ex, float ey, float angle, int image, float alpha, @NativeType(value="NVGpaint") NVGPaint __result) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgImagePattern(ctx, ox, oy, ex, ey, angle, image, alpha, __result.address());
        return __result;
    }

    public static native void nnvgScissor(long var0, float var2, float var3, float var4, float var5);

    public static void nvgScissor(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgScissor(ctx, x, y, w, h);
    }

    public static native void nnvgIntersectScissor(long var0, float var2, float var3, float var4, float var5);

    public static void nvgIntersectScissor(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgIntersectScissor(ctx, x, y, w, h);
    }

    public static native void nnvgResetScissor(long var0);

    public static void nvgResetScissor(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgResetScissor(ctx);
    }

    public static native void nnvgBeginPath(long var0);

    public static void nvgBeginPath(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgBeginPath(ctx);
    }

    public static native void nnvgMoveTo(long var0, float var2, float var3);

    public static void nvgMoveTo(@NativeType(value="NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgMoveTo(ctx, x, y);
    }

    public static native void nnvgLineTo(long var0, float var2, float var3);

    public static void nvgLineTo(@NativeType(value="NVGcontext *") long ctx, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgLineTo(ctx, x, y);
    }

    public static native void nnvgBezierTo(long var0, float var2, float var3, float var4, float var5, float var6, float var7);

    public static void nvgBezierTo(@NativeType(value="NVGcontext *") long ctx, float c1x, float c1y, float c2x, float c2y, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgBezierTo(ctx, c1x, c1y, c2x, c2y, x, y);
    }

    public static native void nnvgQuadTo(long var0, float var2, float var3, float var4, float var5);

    public static void nvgQuadTo(@NativeType(value="NVGcontext *") long ctx, float cx, float cy, float x, float y) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgQuadTo(ctx, cx, cy, x, y);
    }

    public static native void nnvgArcTo(long var0, float var2, float var3, float var4, float var5, float var6);

    public static void nvgArcTo(@NativeType(value="NVGcontext *") long ctx, float x1, float y1, float x2, float y2, float radius) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgArcTo(ctx, x1, y1, x2, y2, radius);
    }

    public static native void nnvgClosePath(long var0);

    public static void nvgClosePath(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgClosePath(ctx);
    }

    public static native void nnvgPathWinding(long var0, int var2);

    public static void nvgPathWinding(@NativeType(value="NVGcontext *") long ctx, int dir) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgPathWinding(ctx, dir);
    }

    public static native void nnvgArc(long var0, float var2, float var3, float var4, float var5, float var6, int var7);

    public static void nvgArc(@NativeType(value="NVGcontext *") long ctx, float cx, float cy, float r, float a0, float a1, int dir) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgArc(ctx, cx, cy, r, a0, a1, dir);
    }

    public static native void nnvgRect(long var0, float var2, float var3, float var4, float var5);

    public static void nvgRect(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRect(ctx, x, y, w, h);
    }

    public static native void nnvgRoundedRect(long var0, float var2, float var3, float var4, float var5, float var6);

    public static void nvgRoundedRect(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float r) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRoundedRect(ctx, x, y, w, h, r);
    }

    public static native void nnvgRoundedRectVarying(long var0, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9);

    public static void nvgRoundedRectVarying(@NativeType(value="NVGcontext *") long ctx, float x, float y, float w, float h, float radTopLeft, float radTopRight, float radBottomRight, float radBottomLeft) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgRoundedRectVarying(ctx, x, y, w, h, radTopLeft, radTopRight, radBottomRight, radBottomLeft);
    }

    public static native void nnvgEllipse(long var0, float var2, float var3, float var4, float var5);

    public static void nvgEllipse(@NativeType(value="NVGcontext *") long ctx, float cx, float cy, float rx, float ry) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgEllipse(ctx, cx, cy, rx, ry);
    }

    public static native void nnvgCircle(long var0, float var2, float var3, float var4);

    public static void nvgCircle(@NativeType(value="NVGcontext *") long ctx, float cx, float cy, float r) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgCircle(ctx, cx, cy, r);
    }

    public static native void nnvgFill(long var0);

    public static void nvgFill(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFill(ctx);
    }

    public static native void nnvgStroke(long var0);

    public static void nvgStroke(@NativeType(value="NVGcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgStroke(ctx);
    }

    public static native int nnvgCreateFont(long var0, long var2, long var4);

    public static int nvgCreateFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer name, @NativeType(value="char const *") ByteBuffer filename) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
            Checks.checkNT1(filename);
        }
        return NanoVG.nnvgCreateFont(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(filename));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgCreateFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence name, @NativeType(value="char const *") CharSequence filename) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgCreateFont(ctx, nameEncoded, filenameEncoded);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgCreateFontAtIndex(long var0, long var2, long var4, int var6);

    public static int nvgCreateFontAtIndex(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer name, @NativeType(value="char const *") ByteBuffer filename, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
            Checks.checkNT1(filename);
        }
        return NanoVG.nnvgCreateFontAtIndex(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(filename), fontIndex);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgCreateFontAtIndex(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence name, @NativeType(value="char const *") CharSequence filename, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgCreateFontAtIndex(ctx, nameEncoded, filenameEncoded, fontIndex);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgCreateFontMem(long var0, long var2, long var4, int var6, int var7);

    public static int nvgCreateFontMem(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer name, @NativeType(value="unsigned char *") ByteBuffer data, @NativeType(value="int") boolean freeData) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return NanoVG.nnvgCreateFontMem(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgCreateFontMem(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence name, @NativeType(value="unsigned char *") ByteBuffer data, @NativeType(value="int") boolean freeData) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgCreateFontMem(ctx, nameEncoded, MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgCreateFontMemAtIndex(long var0, long var2, long var4, int var6, int var7, int var8);

    public static int nvgCreateFontMemAtIndex(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer name, @NativeType(value="unsigned char *") ByteBuffer data, @NativeType(value="int") boolean freeData, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return NanoVG.nnvgCreateFontMemAtIndex(ctx, MemoryUtil.memAddress(name), MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgCreateFontMemAtIndex(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence name, @NativeType(value="unsigned char *") ByteBuffer data, @NativeType(value="int") boolean freeData, int fontIndex) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgCreateFontMemAtIndex(ctx, nameEncoded, MemoryUtil.memAddress(data), data.remaining(), freeData ? 1 : 0, fontIndex);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgFindFont(long var0, long var2);

    public static int nvgFindFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(name);
        }
        return NanoVG.nnvgFindFont(ctx, MemoryUtil.memAddress(name));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgFindFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence name) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgFindFont(ctx, nameEncoded);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgAddFallbackFontId(long var0, int var2, int var3);

    public static int nvgAddFallbackFontId(@NativeType(value="NVGcontext *") long ctx, int baseFont, int fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVG.nnvgAddFallbackFontId(ctx, baseFont, fallbackFont);
    }

    public static native int nnvgAddFallbackFont(long var0, long var2, long var4);

    public static int nvgAddFallbackFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer baseFont, @NativeType(value="char const *") ByteBuffer fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(baseFont);
            Checks.checkNT1(fallbackFont);
        }
        return NanoVG.nnvgAddFallbackFont(ctx, MemoryUtil.memAddress(baseFont), MemoryUtil.memAddress(fallbackFont));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgAddFallbackFont(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence baseFont, @NativeType(value="char const *") CharSequence fallbackFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            stack.nASCII(fallbackFont, true);
            long fallbackFontEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgAddFallbackFont(ctx, baseFontEncoded, fallbackFontEncoded);
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgResetFallbackFontsId(long var0, int var2);

    public static void nvgResetFallbackFontsId(@NativeType(value="NVGcontext *") long ctx, int baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgResetFallbackFontsId(ctx, baseFont);
    }

    public static native void nnvgResetFallbackFonts(long var0, long var2);

    public static void nvgResetFallbackFonts(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(baseFont);
        }
        NanoVG.nnvgResetFallbackFonts(ctx, MemoryUtil.memAddress(baseFont));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void nvgResetFallbackFonts(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence baseFont) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(baseFont, true);
            long baseFontEncoded = stack.getPointerAddress();
            NanoVG.nnvgResetFallbackFonts(ctx, baseFontEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgFontSize(long var0, float var2);

    public static void nvgFontSize(@NativeType(value="NVGcontext *") long ctx, float size) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFontSize(ctx, size);
    }

    public static native void nnvgFontBlur(long var0, float var2);

    public static void nvgFontBlur(@NativeType(value="NVGcontext *") long ctx, float blur) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFontBlur(ctx, blur);
    }

    public static native void nnvgTextLetterSpacing(long var0, float var2);

    public static void nvgTextLetterSpacing(@NativeType(value="NVGcontext *") long ctx, float spacing) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTextLetterSpacing(ctx, spacing);
    }

    public static native void nnvgTextLineHeight(long var0, float var2);

    public static void nvgTextLineHeight(@NativeType(value="NVGcontext *") long ctx, float lineHeight) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTextLineHeight(ctx, lineHeight);
    }

    public static native void nnvgTextAlign(long var0, int var2);

    public static void nvgTextAlign(@NativeType(value="NVGcontext *") long ctx, int align) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTextAlign(ctx, align);
    }

    public static native void nnvgFontFaceId(long var0, int var2);

    public static void nvgFontFaceId(@NativeType(value="NVGcontext *") long ctx, int font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgFontFaceId(ctx, font);
    }

    public static native void nnvgFontFace(long var0, long var2);

    public static void nvgFontFace(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkNT1(font);
        }
        NanoVG.nnvgFontFace(ctx, MemoryUtil.memAddress(font));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void nvgFontFace(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence font) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(font, true);
            long fontEncoded = stack.getPointerAddress();
            NanoVG.nnvgFontFace(ctx, fontEncoded);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native float nnvgText(long var0, float var2, float var3, long var4, long var6);

    public static float nvgText(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVG.nnvgText(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float nvgText(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") CharSequence string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float f = NanoVG.nnvgText(ctx, x, y, stringEncoded, stringEncoded + (long)stringEncodedLength);
            return f;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgTextBox(long var0, float var2, float var3, float var4, long var5, long var7);

    public static void nvgTextBox(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") ByteBuffer string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        NanoVG.nnvgTextBox(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void nvgTextBox(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") CharSequence string) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            NanoVG.nnvgTextBox(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + (long)stringEncodedLength);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native float nnvgTextBounds(long var0, float var2, float var3, long var4, long var6, long var8);

    public static float nvgTextBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") ByteBuffer string, @Nullable @NativeType(value="float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer)bounds, 4);
        }
        return NanoVG.nnvgTextBounds(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), MemoryUtil.memAddressSafe(bounds));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float nvgTextBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") CharSequence string, @Nullable @NativeType(value="float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer)bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float f = NanoVG.nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + (long)stringEncodedLength, MemoryUtil.memAddressSafe(bounds));
            return f;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgTextBoxBounds(long var0, float var2, float var3, float var4, long var5, long var7, long var9);

    public static void nvgTextBoxBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") ByteBuffer string, @Nullable @NativeType(value="float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer)bounds, 4);
        }
        NanoVG.nnvgTextBoxBounds(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), MemoryUtil.memAddressSafe(bounds));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void nvgTextBoxBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") CharSequence string, @Nullable @NativeType(value="float *") FloatBuffer bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer)bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            NanoVG.nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + (long)stringEncodedLength, MemoryUtil.memAddressSafe(bounds));
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native int nnvgTextGlyphPositions(long var0, float var2, float var3, long var4, long var6, long var8, int var10);

    public static int nvgTextGlyphPositions(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") ByteBuffer string, @NativeType(value="NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVG.nnvgTextGlyphPositions(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), positions.address(), positions.remaining());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgTextGlyphPositions(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") CharSequence string, @NativeType(value="NVGglyphPosition *") NVGGlyphPosition.Buffer positions) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgTextGlyphPositions(ctx, x, y, stringEncoded, stringEncoded + (long)stringEncodedLength, positions.address(), positions.remaining());
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgTextMetrics(long var0, long var2, long var4, long var6);

    public static void nvgTextMetrics(@NativeType(value="NVGcontext *") long ctx, @Nullable @NativeType(value="float *") FloatBuffer ascender, @Nullable @NativeType(value="float *") FloatBuffer descender, @Nullable @NativeType(value="float *") FloatBuffer lineh) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe((Buffer)ascender, 1);
            Checks.checkSafe((Buffer)descender, 1);
            Checks.checkSafe((Buffer)lineh, 1);
        }
        NanoVG.nnvgTextMetrics(ctx, MemoryUtil.memAddressSafe(ascender), MemoryUtil.memAddressSafe(descender), MemoryUtil.memAddressSafe(lineh));
    }

    public static native int nnvgTextBreakLines(long var0, long var2, long var4, float var6, long var7, int var9);

    public static int nvgTextBreakLines(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") ByteBuffer string, float breakRowWidth, @NativeType(value="NVGtextRow *") NVGTextRow.Buffer rows) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        return NanoVG.nnvgTextBreakLines(ctx, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), breakRowWidth, rows.address(), rows.remaining());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int nvgTextBreakLines(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="char const *") CharSequence string, float breakRowWidth, @NativeType(value="NVGtextRow *") NVGTextRow.Buffer rows) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            int n = NanoVG.nnvgTextBreakLines(ctx, stringEncoded, stringEncoded + (long)stringEncodedLength, breakRowWidth, rows.address(), rows.remaining());
            return n;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    @NativeType(value="void *")
    private static native long nvgCreateInternal();

    @NativeType(value="void *")
    private static native long nvgInternalParams();

    @NativeType(value="void *")
    private static native long nvgDeleteInternal();

    public static native void nnvgCurrentTransform(long var0, float[] var2);

    public static void nvgCurrentTransform(@NativeType(value="NVGcontext *") long ctx, @NativeType(value="float *") float[] xform) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check(xform, 6);
        }
        NanoVG.nnvgCurrentTransform(ctx, xform);
    }

    public static native void nnvgTransformIdentity(float[] var0);

    public static void nvgTransformIdentity(@NativeType(value="float *") float[] dst) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformIdentity(dst);
    }

    public static native void nnvgTransformTranslate(float[] var0, float var1, float var2);

    public static void nvgTransformTranslate(@NativeType(value="float *") float[] dst, float tx, float ty) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformTranslate(dst, tx, ty);
    }

    public static native void nnvgTransformScale(float[] var0, float var1, float var2);

    public static void nvgTransformScale(@NativeType(value="float *") float[] dst, float sx, float sy) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformScale(dst, sx, sy);
    }

    public static native void nnvgTransformRotate(float[] var0, float var1);

    public static void nvgTransformRotate(@NativeType(value="float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformRotate(dst, a);
    }

    public static native void nnvgTransformSkewX(float[] var0, float var1);

    public static void nvgTransformSkewX(@NativeType(value="float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformSkewX(dst, a);
    }

    public static native void nnvgTransformSkewY(float[] var0, float var1);

    public static void nvgTransformSkewY(@NativeType(value="float *") float[] dst, float a) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
        }
        NanoVG.nnvgTransformSkewY(dst, a);
    }

    public static native void nnvgTransformMultiply(float[] var0, float[] var1);

    public static void nvgTransformMultiply(@NativeType(value="float *") float[] dst, @NativeType(value="float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        NanoVG.nnvgTransformMultiply(dst, src);
    }

    public static native void nnvgTransformPremultiply(float[] var0, float[] var1);

    public static void nvgTransformPremultiply(@NativeType(value="float *") float[] dst, @NativeType(value="float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        NanoVG.nnvgTransformPremultiply(dst, src);
    }

    public static native int nnvgTransformInverse(float[] var0, float[] var1);

    @NativeType(value="int")
    public static boolean nvgTransformInverse(@NativeType(value="float *") float[] dst, @NativeType(value="float const *") float[] src) {
        if (Checks.CHECKS) {
            Checks.check(dst, 6);
            Checks.check(src, 6);
        }
        return NanoVG.nnvgTransformInverse(dst, src) != 0;
    }

    public static native void nnvgTransformPoint(float[] var0, float[] var1, float[] var2, float var3, float var4);

    public static void nvgTransformPoint(@NativeType(value="float *") float[] dstx, @NativeType(value="float *") float[] dsty, @NativeType(value="float const *") float[] xform, float srcx, float srcy) {
        if (Checks.CHECKS) {
            Checks.check(dstx, 1);
            Checks.check(dsty, 1);
            Checks.check(xform, 6);
        }
        NanoVG.nnvgTransformPoint(dstx, dsty, xform, srcx, srcy);
    }

    public static native void nnvgImageSize(long var0, int var2, int[] var3, int[] var4);

    public static void nvgImageSize(@NativeType(value="NVGcontext *") long ctx, int image, @NativeType(value="int *") int[] w, @NativeType(value="int *") int[] h) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.check(w, 1);
            Checks.check(h, 1);
        }
        NanoVG.nnvgImageSize(ctx, image, w, h);
    }

    public static native float nnvgTextBounds(long var0, float var2, float var3, long var4, long var6, float[] var8);

    public static float nvgTextBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") ByteBuffer string, @Nullable @NativeType(value="float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        return NanoVG.nnvgTextBounds(ctx, x, y, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), bounds);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static float nvgTextBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, @NativeType(value="char const *") CharSequence string, @Nullable @NativeType(value="float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            float f = NanoVG.nnvgTextBounds(ctx, x, y, stringEncoded, stringEncoded + (long)stringEncodedLength, bounds);
            return f;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgTextBoxBounds(long var0, float var2, float var3, float var4, long var5, long var7, float[] var9);

    public static void nvgTextBoxBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") ByteBuffer string, @Nullable @NativeType(value="float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        NanoVG.nnvgTextBoxBounds(ctx, x, y, breakRowWidth, MemoryUtil.memAddress(string), MemoryUtil.memAddress(string) + (long)string.remaining(), bounds);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void nvgTextBoxBounds(@NativeType(value="NVGcontext *") long ctx, float x, float y, float breakRowWidth, @NativeType(value="char const *") CharSequence string, @Nullable @NativeType(value="float *") float[] bounds) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(bounds, 4);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            NanoVG.nnvgTextBoxBounds(ctx, x, y, breakRowWidth, stringEncoded, stringEncoded + (long)stringEncodedLength, bounds);
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native void nnvgTextMetrics(long var0, float[] var2, float[] var3, float[] var4);

    public static void nvgTextMetrics(@NativeType(value="NVGcontext *") long ctx, @Nullable @NativeType(value="float *") float[] ascender, @Nullable @NativeType(value="float *") float[] descender, @Nullable @NativeType(value="float *") float[] lineh) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
            Checks.checkSafe(ascender, 1);
            Checks.checkSafe(descender, 1);
            Checks.checkSafe(lineh, 1);
        }
        NanoVG.nnvgTextMetrics(ctx, ascender, descender, lineh);
    }

    static {
        LibNanoVG.initialize();
        nvgCreateInternal = NanoVG.nvgCreateInternal();
        nvgInternalParams = NanoVG.nvgInternalParams();
        nvgDeleteInternal = NanoVG.nvgDeleteInternal();
    }
}

