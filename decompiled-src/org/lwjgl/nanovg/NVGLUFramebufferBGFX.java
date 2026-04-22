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

@NativeType(value="struct NVGLUframebuffer")
public class NVGLUFramebufferBGFX
extends Struct<NVGLUFramebufferBGFX> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int CTX;
    public static final int HANDLE;
    public static final int IMAGE;
    public static final int VIEWID;

    protected NVGLUFramebufferBGFX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NVGLUFramebufferBGFX create(long address, @Nullable ByteBuffer container) {
        return new NVGLUFramebufferBGFX(address, container);
    }

    public NVGLUFramebufferBGFX(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), NVGLUFramebufferBGFX.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="NVGcontext *")
    public long ctx() {
        return NVGLUFramebufferBGFX.nctx(this.address());
    }

    @NativeType(value="bgfx_frame_buffer_handle_t")
    public short handle() {
        return NVGLUFramebufferBGFX.nhandle(this.address());
    }

    public int image() {
        return NVGLUFramebufferBGFX.nimage(this.address());
    }

    @NativeType(value="bgfx_view_id_t")
    public short viewId() {
        return NVGLUFramebufferBGFX.nviewId(this.address());
    }

    public static NVGLUFramebufferBGFX create(long address) {
        return new NVGLUFramebufferBGFX(address, null);
    }

    @Nullable
    public static NVGLUFramebufferBGFX createSafe(long address) {
        return address == 0L ? null : new NVGLUFramebufferBGFX(address, null);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    public static long nctx(long struct) {
        return MemoryUtil.memGetAddress(struct + (long)CTX);
    }

    public static short nhandle(long struct) {
        return UNSAFE.getShort(null, struct + (long)HANDLE);
    }

    public static int nimage(long struct) {
        return UNSAFE.getInt(null, struct + (long)IMAGE);
    }

    public static short nviewId(long struct) {
        return UNSAFE.getShort(null, struct + (long)VIEWID);
    }

    static {
        Struct.Layout layout = NVGLUFramebufferBGFX.__struct(NVGLUFramebufferBGFX.__member(POINTER_SIZE), NVGLUFramebufferBGFX.__member(2), NVGLUFramebufferBGFX.__member(4), NVGLUFramebufferBGFX.__member(2));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        CTX = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        VIEWID = layout.offsetof(3);
    }

    public static class Buffer
    extends StructBuffer<NVGLUFramebufferBGFX, Buffer> {
        private static final NVGLUFramebufferBGFX ELEMENT_FACTORY = NVGLUFramebufferBGFX.create(-1L);

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
        protected NVGLUFramebufferBGFX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="NVGcontext *")
        public long ctx() {
            return NVGLUFramebufferBGFX.nctx(this.address());
        }

        @NativeType(value="bgfx_frame_buffer_handle_t")
        public short handle() {
            return NVGLUFramebufferBGFX.nhandle(this.address());
        }

        public int image() {
            return NVGLUFramebufferBGFX.nimage(this.address());
        }

        @NativeType(value="bgfx_view_id_t")
        public short viewId() {
            return NVGLUFramebufferBGFX.nviewId(this.address());
        }
    }
}

