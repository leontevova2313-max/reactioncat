/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.NSVGGradientStop;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType(value="struct NSVGgradient")
public class NSVGGradient
extends Struct<NSVGGradient> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int XFORM;
    public static final int SPREAD;
    public static final int FX;
    public static final int FY;
    public static final int NSTOPS;
    public static final int PSTOPS;

    protected NSVGGradient(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NSVGGradient create(long address, @Nullable ByteBuffer container) {
        return new NSVGGradient(address, container);
    }

    public NSVGGradient(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NSVGGradient.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="float[6]")
    public FloatBuffer xform() {
        return NSVGGradient.nxform(this.address());
    }

    public float xform(int index) {
        return NSVGGradient.nxform(this.address(), index);
    }

    @NativeType(value="char")
    public byte spread() {
        return NSVGGradient.nspread(this.address());
    }

    public float fx() {
        return NSVGGradient.nfx(this.address());
    }

    public float fy() {
        return NSVGGradient.nfy(this.address());
    }

    public int nstops() {
        return NSVGGradient.nnstops(this.address());
    }

    @NativeType(value="NSVGgradientStop[1]")
    public NSVGGradientStop.Buffer pstops() {
        return NSVGGradient.npstops(this.address());
    }

    @NativeType(value="NSVGgradientStop")
    public NSVGGradientStop pstops(int index) {
        return NSVGGradient.npstops(this.address(), index);
    }

    public static NSVGGradient create(long address) {
        return new NSVGGradient(address, null);
    }

    @Nullable
    public static NSVGGradient createSafe(long address) {
        return address == 0L ? null : new NSVGGradient(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static FloatBuffer nxform(long struct) {
        return MemoryUtil.memFloatBuffer(struct + (long)XFORM, 6);
    }

    public static float nxform(long struct, int index) {
        return UNSAFE.getFloat(null, struct + (long)XFORM + Checks.check(index, 6) * 4L);
    }

    public static byte nspread(long struct) {
        return UNSAFE.getByte(null, struct + (long)SPREAD);
    }

    public static float nfx(long struct) {
        return UNSAFE.getFloat(null, struct + (long)FX);
    }

    public static float nfy(long struct) {
        return UNSAFE.getFloat(null, struct + (long)FY);
    }

    public static int nnstops(long struct) {
        return UNSAFE.getInt(null, struct + (long)NSTOPS);
    }

    public static NSVGGradientStop.Buffer npstops(long struct) {
        return NSVGGradientStop.create(struct + (long)PSTOPS, NSVGGradient.nnstops(struct));
    }

    public static NSVGGradientStop npstops(long struct, int index) {
        return NSVGGradientStop.create(struct + (long)PSTOPS + Checks.check(index, NSVGGradient.nnstops(struct)) * (long)NSVGGradientStop.SIZEOF);
    }

    static {
        Struct.Layout layout = NSVGGradient.__struct(NSVGGradient.__array(4, 6), NSVGGradient.__member(1), NSVGGradient.__member(4), NSVGGradient.__member(4), NSVGGradient.__member(4), NSVGGradient.__array(NSVGGradientStop.SIZEOF, NSVGGradientStop.ALIGNOF, 1));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        XFORM = layout.offsetof(0);
        SPREAD = layout.offsetof(1);
        FX = layout.offsetof(2);
        FY = layout.offsetof(3);
        NSTOPS = layout.offsetof(4);
        PSTOPS = layout.offsetof(5);
    }

    public static class Buffer
    extends StructBuffer<NSVGGradient, Buffer> {
        private static final NSVGGradient ELEMENT_FACTORY = NSVGGradient.create(-1L);

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
        protected NSVGGradient getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="float[6]")
        public FloatBuffer xform() {
            return NSVGGradient.nxform(this.address());
        }

        public float xform(int index) {
            return NSVGGradient.nxform(this.address(), index);
        }

        @NativeType(value="char")
        public byte spread() {
            return NSVGGradient.nspread(this.address());
        }

        public float fx() {
            return NSVGGradient.nfx(this.address());
        }

        public float fy() {
            return NSVGGradient.nfy(this.address());
        }

        public int nstops() {
            return NSVGGradient.nnstops(this.address());
        }

        @NativeType(value="NSVGgradientStop[1]")
        public NSVGGradientStop.Buffer pstops() {
            return NSVGGradient.npstops(this.address());
        }

        @NativeType(value="NSVGgradientStop")
        public NSVGGradientStop pstops(int index) {
            return NSVGGradient.npstops(this.address(), index);
        }
    }
}

