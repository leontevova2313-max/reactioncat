/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.NSVGPaint;
import org.lwjgl.nanovg.NSVGPath;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NSVGshape")
public class NSVGShape
extends Struct<NSVGShape> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int ID;
    public static final int FILL;
    public static final int STROKE;
    public static final int OPACITY;
    public static final int STROKEWIDTH;
    public static final int STROKEDASHOFFSET;
    public static final int STROKEDASHARRAY;
    public static final int STROKEDASHCOUNT;
    public static final int STROKELINEJOIN;
    public static final int STROKELINECAP;
    public static final int MITERLIMIT;
    public static final int FILLRULE;
    public static final int FLAGS;
    public static final int BOUNDS;
    public static final int FILLGRADIENT;
    public static final int STROKEGRADIENT;
    public static final int XFORM;
    public static final int PATHS;
    public static final int NEXT;

    protected NSVGShape(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGShape create(long address, @Nullable ByteBuffer container) {
        return new NSVGShape(address, container);
    }

    public NSVGShape(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NSVGShape.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="char[64]")
    public ByteBuffer id() {
        return NSVGShape.nid(this.address());
    }

    @NativeType(value="char[64]")
    public String idString() {
        return NSVGShape.nidString(this.address());
    }

    @NativeType(value="NSVGpaint")
    public NSVGPaint fill() {
        return NSVGShape.nfill(this.address());
    }

    @NativeType(value="NSVGpaint")
    public NSVGPaint stroke() {
        return NSVGShape.nstroke(this.address());
    }

    public float opacity() {
        return NSVGShape.nopacity(this.address());
    }

    public float strokeWidth() {
        return NSVGShape.nstrokeWidth(this.address());
    }

    public float strokeDashOffset() {
        return NSVGShape.nstrokeDashOffset(this.address());
    }

    @NativeType(value="float[8]")
    public FloatBuffer strokeDashArray() {
        return NSVGShape.nstrokeDashArray(this.address());
    }

    public float strokeDashArray(int index) {
        return NSVGShape.nstrokeDashArray(this.address(), index);
    }

    @NativeType(value="char")
    public byte strokeDashCount() {
        return NSVGShape.nstrokeDashCount(this.address());
    }

    @NativeType(value="char")
    public byte strokeLineJoin() {
        return NSVGShape.nstrokeLineJoin(this.address());
    }

    @NativeType(value="char")
    public byte strokeLineCap() {
        return NSVGShape.nstrokeLineCap(this.address());
    }

    public float miterLimit() {
        return NSVGShape.nmiterLimit(this.address());
    }

    @NativeType(value="char")
    public byte fillRule() {
        return NSVGShape.nfillRule(this.address());
    }

    @NativeType(value="unsigned char")
    public byte flags() {
        return NSVGShape.nflags(this.address());
    }

    @NativeType(value="float[4]")
    public FloatBuffer bounds() {
        return NSVGShape.nbounds(this.address());
    }

    public float bounds(int index) {
        return NSVGShape.nbounds(this.address(), index);
    }

    @NativeType(value="char[64]")
    public ByteBuffer fillGradient() {
        return NSVGShape.nfillGradient(this.address());
    }

    @NativeType(value="char[64]")
    public String fillGradientString() {
        return NSVGShape.nfillGradientString(this.address());
    }

    @NativeType(value="char[64]")
    public ByteBuffer strokeGradient() {
        return NSVGShape.nstrokeGradient(this.address());
    }

    @NativeType(value="char[64]")
    public String strokeGradientString() {
        return NSVGShape.nstrokeGradientString(this.address());
    }

    @NativeType(value="float[6]")
    public FloatBuffer xform() {
        return NSVGShape.nxform(this.address());
    }

    public float xform(int index) {
        return NSVGShape.nxform(this.address(), index);
    }

    @NativeType(value="NSVGpath *")
    public NSVGPath paths() {
        return NSVGShape.npaths(this.address());
    }

    @NativeType(value="NSVGshape *")
    public NSVGShape next() {
        return NSVGShape.nnext(this.address());
    }

    public static NSVGShape create(long address) {
        return new NSVGShape(address, null);
    }

    @Nullable
    public static NSVGShape createSafe(long address) {
        return address == 0L ? null : new NSVGShape(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static ByteBuffer nid(long struct) {
        return MemoryUtil.memByteBuffer(struct + (long)ID, 64);
    }

    public static String nidString(long struct) {
        return MemoryUtil.memASCII(struct + (long)ID);
    }

    public static NSVGPaint nfill(long struct) {
        return NSVGPaint.create(struct + (long)FILL);
    }

    public static NSVGPaint nstroke(long struct) {
        return NSVGPaint.create(struct + (long)STROKE);
    }

    public static float nopacity(long struct) {
        return UNSAFE.getFloat(null, struct + (long)OPACITY);
    }

    public static float nstrokeWidth(long struct) {
        return UNSAFE.getFloat(null, struct + (long)STROKEWIDTH);
    }

    public static float nstrokeDashOffset(long struct) {
        return UNSAFE.getFloat(null, struct + (long)STROKEDASHOFFSET);
    }

    public static FloatBuffer nstrokeDashArray(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)STROKEDASHARRAY, 8);
    }

    public static float nstrokeDashArray(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)STROKEDASHARRAY + Checks.check(index, 8) * 4L);
    }

    public static byte nstrokeDashCount(long struct) {
        return UNSAFE.getByte(null, struct + (long)STROKEDASHCOUNT);
    }

    public static byte nstrokeLineJoin(long struct) {
        return UNSAFE.getByte(null, struct + (long)STROKELINEJOIN);
    }

    public static byte nstrokeLineCap(long struct) {
        return UNSAFE.getByte(null, struct + (long)STROKELINECAP);
    }

    public static float nmiterLimit(long struct) {
        return UNSAFE.getFloat(null, struct + (long)MITERLIMIT);
    }

    public static byte nfillRule(long struct) {
        return UNSAFE.getByte(null, struct + (long)FILLRULE);
    }

    public static byte nflags(long struct) {
        return UNSAFE.getByte(null, struct + (long)FLAGS);
    }

    public static FloatBuffer nbounds(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)BOUNDS, 4);
    }

    public static float nbounds(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)BOUNDS + Checks.check(index, 4) * 4L);
    }

    public static ByteBuffer nfillGradient(long struct) {
        return MemoryUtil.memByteBuffer(struct + (long)FILLGRADIENT, 64);
    }

    public static String nfillGradientString(long struct) {
        return MemoryUtil.memASCII(struct + (long)FILLGRADIENT);
    }

    public static ByteBuffer nstrokeGradient(long struct) {
        return MemoryUtil.memByteBuffer(struct + (long)STROKEGRADIENT, 64);
    }

    public static String nstrokeGradientString(long struct) {
        return MemoryUtil.memASCII(struct + (long)STROKEGRADIENT);
    }

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)XFORM + Checks.check(index, 6) * 4L);
    }

    public static NSVGPath npaths(long struct) {
        return NSVGPath.create(MemoryUtil.memGetAddress(struct + (long)PATHS));
    }

    public static NSVGShape nnext(long struct) {
        return NSVGShape.create(MemoryUtil.memGetAddress(struct + (long)NEXT));
    }

    static {
        Struct.Layout layout = NSVGShape.__struct(NSVGShape.__array(1, 64), NSVGShape.__member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF), NSVGShape.__member(NSVGPaint.SIZEOF, NSVGPaint.ALIGNOF), NSVGShape.__member(4), NSVGShape.__member(4), NSVGShape.__member(4), NSVGShape.__array(4, 8), NSVGShape.__member(1), NSVGShape.__member(1), NSVGShape.__member(1), NSVGShape.__member(4), NSVGShape.__member(1), NSVGShape.__member(1), NSVGShape.__array(4, 4), NSVGShape.__array(1, 64), NSVGShape.__array(1, 64), NSVGShape.__array(4, 6), NSVGShape.__member(POINTER_SIZE), NSVGShape.__member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        ID = layout.offsetof(0);
        FILL = layout.offsetof(1);
        STROKE = layout.offsetof(2);
        OPACITY = layout.offsetof(3);
        STROKEWIDTH = layout.offsetof(4);
        STROKEDASHOFFSET = layout.offsetof(5);
        STROKEDASHARRAY = layout.offsetof(6);
        STROKEDASHCOUNT = layout.offsetof(7);
        STROKELINEJOIN = layout.offsetof(8);
        STROKELINECAP = layout.offsetof(9);
        MITERLIMIT = layout.offsetof(10);
        FILLRULE = layout.offsetof(11);
        FLAGS = layout.offsetof(12);
        BOUNDS = layout.offsetof(13);
        FILLGRADIENT = layout.offsetof(14);
        STROKEGRADIENT = layout.offsetof(15);
        XFORM = layout.offsetof(16);
        PATHS = layout.offsetof(17);
        NEXT = layout.offsetof(18);
    }

    public static class Buffer
    extends StructBuffer<NSVGShape, Buffer> {
        private static final NSVGShape ELEMENT_FACTORY = NSVGShape.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected NSVGShape getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="char[64]")
        public ByteBuffer id() {
            return NSVGShape.nid(this.address());
        }

        @NativeType(value="char[64]")
        public String idString() {
            return NSVGShape.nidString(this.address());
        }

        @NativeType(value="NSVGpaint")
        public NSVGPaint fill() {
            return NSVGShape.nfill(this.address());
        }

        @NativeType(value="NSVGpaint")
        public NSVGPaint stroke() {
            return NSVGShape.nstroke(this.address());
        }

        public float opacity() {
            return NSVGShape.nopacity(this.address());
        }

        public float strokeWidth() {
            return NSVGShape.nstrokeWidth(this.address());
        }

        public float strokeDashOffset() {
            return NSVGShape.nstrokeDashOffset(this.address());
        }

        @NativeType(value="float[8]")
        public FloatBuffer strokeDashArray() {
            return NSVGShape.nstrokeDashArray(this.address());
        }

        public float strokeDashArray(int index) {
            return NSVGShape.nstrokeDashArray(this.address(), index);
        }

        @NativeType(value="char")
        public byte strokeDashCount() {
            return NSVGShape.nstrokeDashCount(this.address());
        }

        @NativeType(value="char")
        public byte strokeLineJoin() {
            return NSVGShape.nstrokeLineJoin(this.address());
        }

        @NativeType(value="char")
        public byte strokeLineCap() {
            return NSVGShape.nstrokeLineCap(this.address());
        }

        public float miterLimit() {
            return NSVGShape.nmiterLimit(this.address());
        }

        @NativeType(value="char")
        public byte fillRule() {
            return NSVGShape.nfillRule(this.address());
        }

        @NativeType(value="unsigned char")
        public byte flags() {
            return NSVGShape.nflags(this.address());
        }

        @NativeType(value="float[4]")
        public FloatBuffer bounds() {
            return NSVGShape.nbounds(this.address());
        }

        public float bounds(int index) {
            return NSVGShape.nbounds(this.address(), index);
        }

        @NativeType(value="char[64]")
        public ByteBuffer fillGradient() {
            return NSVGShape.nfillGradient(this.address());
        }

        @NativeType(value="char[64]")
        public String fillGradientString() {
            return NSVGShape.nfillGradientString(this.address());
        }

        @NativeType(value="char[64]")
        public ByteBuffer strokeGradient() {
            return NSVGShape.nstrokeGradient(this.address());
        }

        @NativeType(value="char[64]")
        public String strokeGradientString() {
            return NSVGShape.nstrokeGradientString(this.address());
        }

        @NativeType(value="float[6]")
        public FloatBuffer xform() {
            return NSVGShape.nxform(this.address());
        }

        public float xform(int index) {
            return NSVGShape.nxform(this.address(), index);
        }

        @NativeType(value="NSVGpath *")
        public NSVGPath paths() {
            return NSVGShape.npaths(this.address());
        }

        @NativeType(value="NSVGshape *")
        public NSVGShape next() {
            return NSVGShape.nnext(this.address());
        }
    }
}

