/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.NSVGGradient;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NSVGpaint")
public class NSVGPaint
extends Struct<NSVGPaint> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int COLOR;
    public static final int GRADIENT;

    protected NSVGPaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGPaint create(long address, @Nullable ByteBuffer container) {
        return new NSVGPaint(address, container);
    }

    public NSVGPaint(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NSVGPaint.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="signed char")
    public byte type() {
        return NSVGPaint.ntype(this.address());
    }

    @NativeType(value="unsigned int")
    public int color() {
        return NSVGPaint.ncolor(this.address());
    }

    @NativeType(value="NSVGgradient *")
    public NSVGGradient gradient() {
        return NSVGPaint.ngradient(this.address());
    }

    public static NSVGPaint create(long address) {
        return new NSVGPaint(address, null);
    }

    @Nullable
    public static NSVGPaint createSafe(long address) {
        return address == 0L ? null : new NSVGPaint(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static byte ntype(long struct) {
        return UNSAFE.getByte(null, struct + (long)TYPE);
    }

    public static int ncolor(long struct) {
        return UNSAFE.getInt(null, struct + (long)COLOR);
    }

    public static NSVGGradient ngradient(long struct) {
        return NSVGGradient.create(MemoryUtil.memGetAddress(struct + (long)GRADIENT));
    }

    static {
        Struct.Layout layout = NSVGPaint.__struct(NSVGPaint.__member(1), NSVGPaint.__union(NSVGPaint.__member(4), NSVGPaint.__member(POINTER_SIZE)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        COLOR = layout.offsetof(2);
        GRADIENT = layout.offsetof(3);
    }

    public static class Buffer
    extends StructBuffer<NSVGPaint, Buffer> {
        private static final NSVGPaint ELEMENT_FACTORY = NSVGPaint.create(-1L);

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
        protected NSVGPaint getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="signed char")
        public byte type() {
            return NSVGPaint.ntype(this.address());
        }

        @NativeType(value="unsigned int")
        public int color() {
            return NSVGPaint.ncolor(this.address());
        }

        @NativeType(value="NSVGgradient *")
        public NSVGGradient gradient() {
            return NSVGPaint.ngradient(this.address());
        }
    }
}

