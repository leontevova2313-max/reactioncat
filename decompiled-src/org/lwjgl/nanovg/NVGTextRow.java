/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NVGtextRow")
public class NVGTextRow
extends Struct<NVGTextRow>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int START;
    public static final int END;
    public static final int NEXT;
    public static final int WIDTH;
    public static final int MINX;
    public static final int MAXX;

    protected NVGTextRow(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NVGTextRow create(long address, @Nullable ByteBuffer container) {
        return new NVGTextRow(address, container);
    }

    public NVGTextRow(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NVGTextRow.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="char *")
    public long start() {
        return NVGTextRow.nstart(this.address());
    }

    @NativeType(value="char *")
    public long end() {
        return NVGTextRow.nend(this.address());
    }

    @NativeType(value="char *")
    public long next() {
        return NVGTextRow.nnext(this.address());
    }

    public float width() {
        return NVGTextRow.nwidth(this.address());
    }

    public float minx() {
        return NVGTextRow.nminx(this.address());
    }

    public float maxx() {
        return NVGTextRow.nmaxx(this.address());
    }

    public static NVGTextRow malloc() {
        return new NVGTextRow(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static NVGTextRow calloc() {
        return new NVGTextRow(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static NVGTextRow create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NVGTextRow(MemoryUtil.memAddress(container), container);
    }

    public static NVGTextRow create(long address) {
        return new NVGTextRow(address, null);
    }

    @Nullable
    public static NVGTextRow createSafe(long address) {
        return address == 0L ? null : new NVGTextRow(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(NVGTextRow.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = NVGTextRow.__create(capacity, SIZEOF);
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
    public static NVGTextRow mallocStack() {
        return NVGTextRow.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow callocStack() {
        return NVGTextRow.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static NVGTextRow mallocStack(MemoryStack stack) {
        return NVGTextRow.malloc(stack);
    }

    @Deprecated
    public static NVGTextRow callocStack(MemoryStack stack) {
        return NVGTextRow.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return NVGTextRow.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return NVGTextRow.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return NVGTextRow.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return NVGTextRow.calloc(capacity, stack);
    }

    public static NVGTextRow malloc(MemoryStack stack) {
        return new NVGTextRow(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static NVGTextRow calloc(MemoryStack stack) {
        return new NVGTextRow(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long nstart(long struct) {
        return MemoryUtil.memGetAddress(struct + (long)START);
    }

    public static long nend(long struct) {
        return MemoryUtil.memGetAddress(struct + (long)END);
    }

    public static long nnext(long struct) {
        return MemoryUtil.memGetAddress(struct + (long)NEXT);
    }

    public static float nwidth(long struct) {
        return UNSAFE.getFloat(null, struct + (long)WIDTH);
    }

    public static float nminx(long struct) {
        return UNSAFE.getFloat(null, struct + (long)MINX);
    }

    public static float nmaxx(long struct) {
        return UNSAFE.getFloat(null, struct + (long)MAXX);
    }

    static {
        Struct.Layout layout = NVGTextRow.__struct(NVGTextRow.__member(POINTER_SIZE), NVGTextRow.__member(POINTER_SIZE), NVGTextRow.__member(POINTER_SIZE), NVGTextRow.__member(4), NVGTextRow.__member(4), NVGTextRow.__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        START = layout.offsetof(0);
        END = layout.offsetof(1);
        NEXT = layout.offsetof(2);
        WIDTH = layout.offsetof(3);
        MINX = layout.offsetof(4);
        MAXX = layout.offsetof(5);
    }

    public static class Buffer
    extends StructBuffer<NVGTextRow, Buffer>
    implements NativeResource {
        private static final NVGTextRow ELEMENT_FACTORY = NVGTextRow.create(-1L);

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
        protected NVGTextRow getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="char *")
        public long start() {
            return NVGTextRow.nstart(this.address());
        }

        @NativeType(value="char *")
        public long end() {
            return NVGTextRow.nend(this.address());
        }

        @NativeType(value="char *")
        public long next() {
            return NVGTextRow.nnext(this.address());
        }

        public float width() {
            return NVGTextRow.nwidth(this.address());
        }

        public float minx() {
            return NVGTextRow.nminx(this.address());
        }

        public float maxx() {
            return NVGTextRow.nmaxx(this.address());
        }
    }
}

