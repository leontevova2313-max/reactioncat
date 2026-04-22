/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NVGpaint")
public class NVGPaint
extends Struct<NVGPaint>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int EXTENT;
    public static final int RADIUS;
    public static final int FEATHER;
    public static final int INNERCOLOR;
    public static final int OUTERCOLOR;
    public static final int IMAGE;

    protected NVGPaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NVGPaint create(long address, @Nullable ByteBuffer container) {
        return new NVGPaint(address, container);
    }

    public NVGPaint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NVGPaint.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="float[6]")
    public FloatBuffer xform() {
        return NVGPaint.nxform(this.address());
    }

    public float xform(int index) {
        return NVGPaint.nxform(this.address(), index);
    }

    @NativeType(value="float[2]")
    public FloatBuffer extent() {
        return NVGPaint.nextent(this.address());
    }

    public float extent(int index) {
        return NVGPaint.nextent(this.address(), index);
    }

    public float radius() {
        return NVGPaint.nradius(this.address());
    }

    public float feather() {
        return NVGPaint.nfeather(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor innerColor() {
        return NVGPaint.ninnerColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor outerColor() {
        return NVGPaint.nouterColor(this.address());
    }

    public int image() {
        return NVGPaint.nimage(this.address());
    }

    public NVGPaint xform(@NativeType(value="float[6]") FloatBuffer value) {
        NVGPaint.nxform(this.address(), value);
        return this;
    }

    public NVGPaint xform(int index, float value) {
        NVGPaint.nxform(this.address(), index, value);
        return this;
    }

    public NVGPaint extent(@NativeType(value="float[2]") FloatBuffer value) {
        NVGPaint.nextent(this.address(), value);
        return this;
    }

    public NVGPaint extent(int index, float value) {
        NVGPaint.nextent(this.address(), index, value);
        return this;
    }

    public NVGPaint radius(float value) {
        NVGPaint.nradius(this.address(), value);
        return this;
    }

    public NVGPaint feather(float value) {
        NVGPaint.nfeather(this.address(), value);
        return this;
    }

    public NVGPaint innerColor(@NativeType(value="NVGcolor") NVGColor value) {
        NVGPaint.ninnerColor(this.address(), value);
        return this;
    }

    public NVGPaint innerColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.innerColor());
        return this;
    }

    public NVGPaint outerColor(@NativeType(value="NVGcolor") NVGColor value) {
        NVGPaint.nouterColor(this.address(), value);
        return this;
    }

    public NVGPaint outerColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.outerColor());
        return this;
    }

    public NVGPaint image(int value) {
        NVGPaint.nimage(this.address(), value);
        return this;
    }

    public NVGPaint set(FloatBuffer xform, FloatBuffer extent, float radius, float feather, NVGColor innerColor, NVGColor outerColor, int image) {
        this.xform(xform);
        this.extent(extent);
        this.radius(radius);
        this.feather(feather);
        this.innerColor(innerColor);
        this.outerColor(outerColor);
        this.image(image);
        return this;
    }

    public NVGPaint set(NVGPaint src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static NVGPaint malloc() {
        return new NVGPaint(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGPaint calloc() {
        return new NVGPaint(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGPaint create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGPaint(MemoryUtil.memAddress(container), container);
    }

    public static NVGPaint create(long address) {
        return new NVGPaint(address, null);
    }

    @Nullable
    public static NVGPaint createSafe(long address) {
        return address == 0L ? null : new NVGPaint(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(NVGPaint.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = NVGPaint.__create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    @Deprecated
    public static NVGPaint mallocStack() {
        return NVGPaint.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint callocStack() {
        return NVGPaint.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGPaint mallocStack(MemoryStack stack) {
        return NVGPaint.malloc(stack);
    }

    @Deprecated
    public static NVGPaint callocStack(MemoryStack stack) {
        return NVGPaint.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return NVGPaint.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return NVGPaint.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return NVGPaint.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return NVGPaint.calloc(capacity, stack);
    }

    public static NVGPaint malloc(MemoryStack stack) {
        return new NVGPaint(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGPaint calloc(MemoryStack stack) {
        return new NVGPaint(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)XFORM + Checks.check(index, 6) * 4L);
    }

    public static FloatBuffer nextent(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)EXTENT, 2);
    }

    public static float nextent(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)EXTENT + Checks.check(index, 2) * 4L);
    }

    public static float nradius(long struct) {
        return UNSAFE.getFloat(null, struct + (long)RADIUS);
    }

    public static float nfeather(long struct) {
        return UNSAFE.getFloat(null, struct + (long)FEATHER);
    }

    public static NVGColor ninnerColor(long struct) {
        return NVGColor.create(struct + (long)INNERCOLOR);
    }

    public static NVGColor nouterColor(long struct) {
        return NVGColor.create(struct + (long)OUTERCOLOR);
    }

    public static int nimage(long struct) {
        return UNSAFE.getInt(null, struct + (long)IMAGE);
    }

    public static void nxform(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 6);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + (long)XFORM, value.remaining() * 4);
    }

    public static void nxform(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + (long)XFORM + Checks.check(index, 6) * 4L, value);
    }

    public static void nextent(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + (long)EXTENT, value.remaining() * 4);
    }

    public static void nextent(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + (long)EXTENT + Checks.check(index, 2) * 4L, value);
    }

    public static void nradius(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)RADIUS, value);
    }

    public static void nfeather(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)FEATHER, value);
    }

    public static void ninnerColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void nouterColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)OUTERCOLOR, NVGColor.SIZEOF);
    }

    public static void nimage(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)IMAGE, value);
    }

    static {
        Struct.Layout layout = NVGPaint.__struct(NVGPaint.__array(4, 6), NVGPaint.__array(4, 2), NVGPaint.__member(4), NVGPaint.__member(4), NVGPaint.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), NVGPaint.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), NVGPaint.__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XFORM = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
        FEATHER = layout.offsetof(3);
        INNERCOLOR = layout.offsetof(4);
        OUTERCOLOR = layout.offsetof(5);
        IMAGE = layout.offsetof(6);
    }

    public static class Buffer
    extends StructBuffer<NVGPaint, Buffer>
    implements NativeResource {
        private static final NVGPaint ELEMENT_FACTORY = NVGPaint.create(-1L);

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
        protected NVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="float[6]")
        public FloatBuffer xform() {
            return NVGPaint.nxform(this.address());
        }

        public float xform(int index) {
            return NVGPaint.nxform(this.address(), index);
        }

        @NativeType(value="float[2]")
        public FloatBuffer extent() {
            return NVGPaint.nextent(this.address());
        }

        public float extent(int index) {
            return NVGPaint.nextent(this.address(), index);
        }

        public float radius() {
            return NVGPaint.nradius(this.address());
        }

        public float feather() {
            return NVGPaint.nfeather(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor innerColor() {
            return NVGPaint.ninnerColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor outerColor() {
            return NVGPaint.nouterColor(this.address());
        }

        public int image() {
            return NVGPaint.nimage(this.address());
        }

        public Buffer xform(@NativeType(value="float[6]") FloatBuffer value) {
            NVGPaint.nxform(this.address(), value);
            return this;
        }

        public Buffer xform(int index, float value) {
            NVGPaint.nxform(this.address(), index, value);
            return this;
        }

        public Buffer extent(@NativeType(value="float[2]") FloatBuffer value) {
            NVGPaint.nextent(this.address(), value);
            return this;
        }

        public Buffer extent(int index, float value) {
            NVGPaint.nextent(this.address(), index, value);
            return this;
        }

        public Buffer radius(float value) {
            NVGPaint.nradius(this.address(), value);
            return this;
        }

        public Buffer feather(float value) {
            NVGPaint.nfeather(this.address(), value);
            return this;
        }

        public Buffer innerColor(@NativeType(value="NVGcolor") NVGColor value) {
            NVGPaint.ninnerColor(this.address(), value);
            return this;
        }

        public Buffer innerColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.innerColor());
            return this;
        }

        public Buffer outerColor(@NativeType(value="NVGcolor") NVGColor value) {
            NVGPaint.nouterColor(this.address(), value);
            return this;
        }

        public Buffer outerColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.outerColor());
            return this;
        }

        public Buffer image(int value) {
            NVGPaint.nimage(this.address(), value);
            return this;
        }
    }
}

