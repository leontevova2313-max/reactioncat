/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.LibNanoVG;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NSVGPath;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class NanoSVG {
    public static final int NSVG_PAINT_UNDEF = -1;
    public static final int NSVG_PAINT_NONE = 0;
    public static final int NSVG_PAINT_COLOR = 1;
    public static final int NSVG_PAINT_LINEAR_GRADIENT = 2;
    public static final int NSVG_PAINT_RADIAL_GRADIENT = 3;
    public static final int NSVG_SPREAD_PAD = 0;
    public static final int NSVG_SPREAD_REFLECT = 1;
    public static final int NSVG_SPREAD_REPEAT = 2;
    public static final int NSVG_JOIN_MITER = 0;
    public static final int NSVG_JOIN_ROUND = 1;
    public static final int NSVG_JOIN_BEVEL = 2;
    public static final int NSVG_CAP_BUTT = 0;
    public static final int NSVG_CAP_ROUND = 1;
    public static final int NSVG_CAP_SQUARE = 2;
    public static final int NSVG_FILLRULE_NONZERO = 0;
    public static final int NSVG_FILLRULE_EVENODD = 1;
    public static final int NSVG_FLAGS_VISIBLE = 1;

    protected NanoSVG() {
        throw new UnsupportedOperationException();
    }

    public static native long nnsvgParseFromFile(long var0, long var2, float var4);

    @Nullable
    @NativeType(value="NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType(value="char const *") ByteBuffer filename, @NativeType(value="char const *") ByteBuffer units, float dpi) {
        if (Checks.CHECKS) {
            Checks.checkNT1(filename);
            Checks.checkNT1(units);
        }
        long __result = NanoSVG.nnsvgParseFromFile(MemoryUtil.memAddress(filename), MemoryUtil.memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    @NativeType(value="NSVGimage *")
    public static NSVGImage nsvgParseFromFile(@NativeType(value="char const *") CharSequence filename, @NativeType(value="char const *") CharSequence units, float dpi) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = NanoSVG.nnsvgParseFromFile(filenameEncoded, unitsEncoded, dpi);
            NSVGImage nSVGImage = NSVGImage.createSafe(__result);
            return nSVGImage;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native long nnsvgParse(long var0, long var2, float var4);

    @Nullable
    @NativeType(value="NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType(value="char *") ByteBuffer input, @NativeType(value="char const *") ByteBuffer units, float dpi) {
        if (Checks.CHECKS) {
            Checks.checkNT1(input);
            Checks.checkNT1(units);
        }
        long __result = NanoSVG.nnsvgParse(MemoryUtil.memAddress(input), MemoryUtil.memAddress(units), dpi);
        return NSVGImage.createSafe(__result);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Nullable
    @NativeType(value="NSVGimage *")
    public static NSVGImage nsvgParse(@NativeType(value="char *") CharSequence input, @NativeType(value="char const *") CharSequence units, float dpi) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nASCII(input, true);
            long inputEncoded = stack.getPointerAddress();
            stack.nASCII(units, true);
            long unitsEncoded = stack.getPointerAddress();
            long __result = NanoSVG.nnsvgParse(inputEncoded, unitsEncoded, dpi);
            NSVGImage nSVGImage = NSVGImage.createSafe(__result);
            return nSVGImage;
        }
        finally {
            stack.setPointer(stackPointer);
        }
    }

    public static native long nnsvgDuplicatePath(long var0);

    @Nullable
    @NativeType(value="NSVGpath *")
    public static NSVGPath nsvgDuplicatePath(@NativeType(value="NSVGpath *") NSVGPath p) {
        long __result = NanoSVG.nnsvgDuplicatePath(p.address());
        return NSVGPath.createSafe(__result);
    }

    public static native void nnsvgDelete(long var0);

    public static void nsvgDelete(@NativeType(value="NSVGimage *") NSVGImage image) {
        NanoSVG.nnsvgDelete(image.address());
    }

    @NativeType(value="NSVGrasterizer *")
    public static native long nsvgCreateRasterizer();

    public static native void nnsvgRasterize(long var0, long var2, float var4, float var5, float var6, long var7, int var9, int var10, int var11);

    public static void nsvgRasterize(@NativeType(value="NSVGrasterizer *") long r, @NativeType(value="NSVGimage *") NSVGImage image, float tx, float ty, float scale, @NativeType(value="unsigned char *") ByteBuffer dst, int w, int h, int stride) {
        if (Checks.CHECKS) {
            Checks.check(r);
            Checks.check((Buffer)dst, h * stride);
        }
        NanoSVG.nnsvgRasterize(r, image.address(), tx, ty, scale, MemoryUtil.memAddress(dst), w, h, stride);
    }

    public static native void nnsvgDeleteRasterizer(long var0);

    public static void nsvgDeleteRasterizer(@NativeType(value="NSVGrasterizer *") long rasterizer) {
        if (Checks.CHECKS) {
            Checks.check(rasterizer);
        }
        NanoSVG.nnsvgDeleteRasterizer(rasterizer);
    }

    static {
        LibNanoVG.initialize();
    }
}

