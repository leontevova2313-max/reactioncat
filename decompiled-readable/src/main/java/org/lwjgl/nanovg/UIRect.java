/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct UIrect")
public class UIRect
extends Struct<UIRect>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int V;
    public static final int X;
    public static final int Y;
    public static final int W;
    public static final int H;

    protected UIRect(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected UIRect create(long address, @Nullable ByteBuffer container) {
        return new UIRect(address, container);
    }

    public UIRect(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), UIRect.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="int[4]")
    public IntBuffer v() {
        return UIRect.nv(this.address());
    }

    public int v(int index) {
        return UIRect.nv(this.address(), index);
    }

    public int x() {
        return UIRect.nx(this.address());
    }

    public int y() {
        return UIRect.ny(this.address());
    }

    public int w() {
        return UIRect.nw(this.address());
    }

    public int h() {
        return UIRect.nh(this.address());
    }

    public UIRect v(@NativeType(value="int[4]") IntBuffer value) {
        UIRect.nv(this.address(), value);
        return this;
    }

    public UIRect v(int index, int value) {
        UIRect.nv(this.address(), index, value);
        return this;
    }

    public UIRect x(int value) {
        UIRect.nx(this.address(), value);
        return this;
    }

    public UIRect y(int value) {
        UIRect.ny(this.address(), value);
        return this;
    }

    public UIRect w(int value) {
        UIRect.nw(this.address(), value);
        return this;
    }

    public UIRect h(int value) {
        UIRect.nh(this.address(), value);
        return this;
    }

    public UIRect set(UIRect src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static UIRect malloc() {
        return new UIRect(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static UIRect calloc() {
        return new UIRect(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static UIRect create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new UIRect(MemoryUtil.memAddress(container), container);
    }

    public static UIRect create(long address) {
        return new UIRect(address, null);
    }

    @Nullable
    public static UIRect createSafe(long address) {
        return address == 0L ? null : new UIRect(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(UIRect.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = UIRect.__create(capacity, SIZEOF);
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
    public static UIRect mallocStack() {
        return UIRect.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect callocStack() {
        return UIRect.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static UIRect mallocStack(MemoryStack stack) {
        return UIRect.malloc(stack);
    }

    @Deprecated
    public static UIRect callocStack(MemoryStack stack) {
        return UIRect.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return UIRect.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return UIRect.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return UIRect.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return UIRect.calloc(capacity, stack);
    }

    public static UIRect malloc(MemoryStack stack) {
        return new UIRect(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static UIRect calloc(MemoryStack stack) {
        return new UIRect(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static IntBuffer nv(long struct) {
        return MemoryUtil.memIntBuffer(struct + (long)V, 4);
    }

    public static int nv(long struct, int index) {
        return UNSAFE.getInt(null, struct + (long)V + Checks.check(index, 4) * 4L);
    }

    public static int nx(long struct) {
        return UNSAFE.getInt(null, struct + (long)X);
    }

    public static int ny(long struct) {
        return UNSAFE.getInt(null, struct + (long)Y);
    }

    public static int nw(long struct) {
        return UNSAFE.getInt(null, struct + (long)W);
    }

    public static int nh(long struct) {
        return UNSAFE.getInt(null, struct + (long)H);
    }

    public static void nv(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + (long)V, value.remaining() * 4);
    }

    public static void nv(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + (long)V + Checks.check(index, 4) * 4L, value);
    }

    public static void nx(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)X, value);
    }

    public static void ny(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)Y, value);
    }

    public static void nw(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)W, value);
    }

    public static void nh(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)H, value);
    }

    static {
        Struct.Layout layout = UIRect.__struct(UIRect.__union(UIRect.__array(4, 4), UIRect.__struct(UIRect.__member(4), UIRect.__member(4), UIRect.__member(4), UIRect.__member(4))));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        V = layout.offsetof(1);
        X = layout.offsetof(3);
        Y = layout.offsetof(4);
        W = layout.offsetof(5);
        H = layout.offsetof(6);
    }

    public static class Buffer
    extends StructBuffer<UIRect, Buffer>
    implements NativeResource {
        private static final UIRect ELEMENT_FACTORY = UIRect.create(-1L);

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
        protected UIRect getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="int[4]")
        public IntBuffer v() {
            return UIRect.nv(this.address());
        }

        public int v(int index) {
            return UIRect.nv(this.address(), index);
        }

        public int x() {
            return UIRect.nx(this.address());
        }

        public int y() {
            return UIRect.ny(this.address());
        }

        public int w() {
            return UIRect.nw(this.address());
        }

        public int h() {
            return UIRect.nh(this.address());
        }

        public Buffer v(@NativeType(value="int[4]") IntBuffer value) {
            UIRect.nv(this.address(), value);
            return this;
        }

        public Buffer v(int index, int value) {
            UIRect.nv(this.address(), index, value);
            return this;
        }

        public Buffer x(int value) {
            UIRect.nx(this.address(), value);
            return this;
        }

        public Buffer y(int value) {
            UIRect.ny(this.address(), value);
            return this;
        }

        public Buffer w(int value) {
            UIRect.nw(this.address(), value);
            return this;
        }

        public Buffer h(int value) {
            UIRect.nh(this.address(), value);
            return this;
        }
    }
}

