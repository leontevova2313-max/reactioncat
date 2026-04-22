/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.NSVGShape;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NSVGimage")
public class NSVGImage
extends Struct<NSVGImage> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int WIDTH;
    public static final int HEIGHT;
    public static final int SHAPES;

    protected NSVGImage(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGImage create(long address, @Nullable ByteBuffer container) {
        return new NSVGImage(address, container);
    }

    public NSVGImage(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NSVGImage.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    public float width() {
        return NSVGImage.nwidth(this.address());
    }

    public float height() {
        return NSVGImage.nheight(this.address());
    }

    @NativeType(value="NSVGshape *")
    public NSVGShape shapes() {
        return NSVGImage.nshapes(this.address());
    }

    public static NSVGImage create(long address) {
        return new NSVGImage(address, null);
    }

    @Nullable
    public static NSVGImage createSafe(long address) {
        return address == 0L ? null : new NSVGImage(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static float nwidth(long struct) {
        return UNSAFE.getFloat(null, struct + (long)WIDTH);
    }

    public static float nheight(long struct) {
        return UNSAFE.getFloat(null, struct + (long)HEIGHT);
    }

    public static NSVGShape nshapes(long struct) {
        return NSVGShape.create(MemoryUtil.memGetAddress(struct + (long)SHAPES));
    }

    static {
        Struct.Layout layout = NSVGImage.__struct(NSVGImage.__member(4), NSVGImage.__member(4), NSVGImage.__member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        WIDTH = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        SHAPES = layout.offsetof(2);
    }

    public static class Buffer
    extends StructBuffer<NSVGImage, Buffer> {
        private static final NSVGImage ELEMENT_FACTORY = NSVGImage.create(-1L);

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
        protected NSVGImage getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public float width() {
            return NSVGImage.nwidth(this.address());
        }

        public float height() {
            return NSVGImage.nheight(this.address());
        }

        @NativeType(value="NSVGshape *")
        public NSVGShape shapes() {
            return NSVGImage.nshapes(this.address());
        }
    }
}

