/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NVGcolor")
public class NVGColor
extends Struct<NVGColor>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RGBA;
    public static final int R;
    public static final int G;
    public static final int B;
    public static final int A;

    protected NVGColor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NVGColor create(long address, @Nullable ByteBuffer container) {
        return new NVGColor(address, container);
    }

    public NVGColor(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NVGColor.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="float[4]")
    public FloatBuffer rgba() {
        return NVGColor.nrgba(this.address());
    }

    public float rgba(int index) {
        return NVGColor.nrgba(this.address(), index);
    }

    public float r() {
        return NVGColor.nr(this.address());
    }

    public float g() {
        return NVGColor.ng(this.address());
    }

    public float b() {
        return NVGColor.nb(this.address());
    }

    public float a() {
        return NVGColor.na(this.address());
    }

    public NVGColor rgba(@NativeType(value="float[4]") FloatBuffer value) {
        NVGColor.nrgba(this.address(), value);
        return this;
    }

    public NVGColor rgba(int index, float value) {
        NVGColor.nrgba(this.address(), index, value);
        return this;
    }

    public NVGColor r(float value) {
        NVGColor.nr(this.address(), value);
        return this;
    }

    public NVGColor g(float value) {
        NVGColor.ng(this.address(), value);
        return this;
    }

    public NVGColor b(float value) {
        NVGColor.nb(this.address(), value);
        return this;
    }

    public NVGColor a(float value) {
        NVGColor.na(this.address(), value);
        return this;
    }

    public NVGColor set(NVGColor src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static NVGColor malloc() {
        return new NVGColor(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGColor calloc() {
        return new NVGColor(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGColor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGColor(MemoryUtil.memAddress(container), container);
    }

    public static NVGColor create(long address) {
        return new NVGColor(address, null);
    }

    @Nullable
    public static NVGColor createSafe(long address) {
        return address == 0L ? null : new NVGColor(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(NVGColor.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = NVGColor.__create(capacity, SIZEOF);
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
    public static NVGColor mallocStack() {
        return NVGColor.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor callocStack() {
        return NVGColor.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGColor mallocStack(MemoryStack stack) {
        return NVGColor.malloc(stack);
    }

    @Deprecated
    public static NVGColor callocStack(MemoryStack stack) {
        return NVGColor.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return NVGColor.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return NVGColor.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return NVGColor.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return NVGColor.calloc(capacity, stack);
    }

    public static NVGColor malloc(MemoryStack stack) {
        return new NVGColor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGColor calloc(MemoryStack stack) {
        return new NVGColor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static FloatBuffer nrgba(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)RGBA, 4);
    }

    public static float nrgba(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)RGBA + Checks.check(index, 4) * 4L);
    }

    public static float nr(long struct) {
        return UNSAFE.getFloat(null, struct + (long)R);
    }

    public static float ng(long struct) {
        return UNSAFE.getFloat(null, struct + (long)G);
    }

    public static float nb(long struct) {
        return UNSAFE.getFloat(null, struct + (long)B);
    }

    public static float na(long struct) {
        return UNSAFE.getFloat(null, struct + (long)A);
    }

    public static void nrgba(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + (long)RGBA, value.remaining() * 4);
    }

    public static void nrgba(long struct, int index, float value) {
        UNSAFE.putFloat(null, struct + (long)RGBA + Checks.check(index, 4) * 4L, value);
    }

    public static void nr(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)R, value);
    }

    public static void ng(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)G, value);
    }

    public static void nb(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)B, value);
    }

    public static void na(long struct, float value) {
        UNSAFE.putFloat(null, struct + (long)A, value);
    }

    static {
        Struct.Layout layout = NVGColor.__struct(NVGColor.__union(NVGColor.__array(4, 4), NVGColor.__struct(NVGColor.__member(4), NVGColor.__member(4), NVGColor.__member(4), NVGColor.__member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RGBA = layout.offsetof(1);
        R = layout.offsetof(3);
        G = layout.offsetof(4);
        B = layout.offsetof(5);
        A = layout.offsetof(6);
    }

    public static class Buffer
    extends StructBuffer<NVGColor, Buffer>
    implements NativeResource {
        private static final NVGColor ELEMENT_FACTORY = NVGColor.create(-1L);

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
        protected NVGColor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="float[4]")
        public FloatBuffer rgba() {
            return NVGColor.nrgba(this.address());
        }

        public float rgba(int index) {
            return NVGColor.nrgba(this.address(), index);
        }

        public float r() {
            return NVGColor.nr(this.address());
        }

        public float g() {
            return NVGColor.ng(this.address());
        }

        public float b() {
            return NVGColor.nb(this.address());
        }

        public float a() {
            return NVGColor.na(this.address());
        }

        public Buffer rgba(@NativeType(value="float[4]") FloatBuffer value) {
            NVGColor.nrgba(this.address(), value);
            return this;
        }

        public Buffer rgba(int index, float value) {
            NVGColor.nrgba(this.address(), index, value);
            return this;
        }

        public Buffer r(float value) {
            NVGColor.nr(this.address(), value);
            return this;
        }

        public Buffer g(float value) {
            NVGColor.ng(this.address(), value);
            return this;
        }

        public Buffer b(float value) {
            NVGColor.nb(this.address(), value);
            return this;
        }

        public Buffer a(float value) {
            NVGColor.na(this.address(), value);
            return this;
        }
    }
}

