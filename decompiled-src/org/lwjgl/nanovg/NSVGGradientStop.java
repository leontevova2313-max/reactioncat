/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NSVGgradientStop")
public class NSVGGradientStop
extends Struct<NSVGGradientStop> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int COLOR;
    public static final int OFFSET;

    protected NSVGGradientStop(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGGradientStop create(long address, @Nullable ByteBuffer container) {
        return new NSVGGradientStop(address, container);
    }

    public NSVGGradientStop(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NSVGGradientStop.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="unsigned int")
    public int color() {
        return NSVGGradientStop.ncolor(this.address());
    }

    public float offset() {
        return NSVGGradientStop.noffset(this.address());
    }

    public static NSVGGradientStop create(long address) {
        return new NSVGGradientStop(address, null);
    }

    @Nullable
    public static NSVGGradientStop createSafe(long address) {
        return address == 0L ? null : new NSVGGradientStop(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static int ncolor(long struct) {
        return UNSAFE.getInt(null, struct + (long)COLOR);
    }

    public static float noffset(long struct) {
        return UNSAFE.getFloat(null, struct + (long)OFFSET);
    }

    static {
        Struct.Layout layout = NSVGGradientStop.__struct(NSVGGradientStop.__member(4), NSVGGradientStop.__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        COLOR = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    public static class Buffer
    extends StructBuffer<NSVGGradientStop, Buffer> {
        private static final NSVGGradientStop ELEMENT_FACTORY = NSVGGradientStop.create(-1L);

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
        protected NSVGGradientStop getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="unsigned int")
        public int color() {
            return NSVGGradientStop.ncolor(this.address());
        }

        public float offset() {
            return NSVGGradientStop.noffset(this.address());
        }
    }
}

