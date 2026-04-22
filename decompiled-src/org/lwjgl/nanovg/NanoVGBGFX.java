/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import javax.annotation.Nullable;
import org.lwjgl.nanovg.NVGLUFramebufferBGFX;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.Configuration;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.SharedLibrary;

public class NanoVGBGFX {
    public static final int NVG_IMAGE_NODELETE = 65536;

    protected NanoVGBGFX() {
        throw new UnsupportedOperationException();
    }

    public static long nnvgCreate(int _edgeaa, short _viewId, long _allocator) {
        long __functionAddress = Functions.Create;
        return JNI.invokeCPP(_edgeaa, _viewId, _allocator, __functionAddress);
    }

    @NativeType(value="NVGcontext *")
    public static long nvgCreate(@NativeType(value="int32_t") boolean _edgeaa, @NativeType(value="bgfx_view_id_t") int _viewId, @NativeType(value="bgfx_allocator_interface_t *") long _allocator) {
        return NanoVGBGFX.nnvgCreate(_edgeaa ? 1 : 0, (short)_viewId, _allocator);
    }

    public static void nvgDelete(@NativeType(value="NVGcontext *") long _ctx) {
        long __functionAddress = Functions.Delete;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePV(_ctx, __functionAddress);
    }

    public static void nnvgSetViewId(long _ctx, short _viewId) {
        long __functionAddress = Functions.SetViewId;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePCV(_ctx, _viewId, __functionAddress);
    }

    public static void nvgSetViewId(@NativeType(value="NVGcontext *") long _ctx, @NativeType(value="bgfx_view_id_t") int _viewId) {
        NanoVGBGFX.nnvgSetViewId(_ctx, (short)_viewId);
    }

    @NativeType(value="uint16_t")
    public static short nvgGetViewId(@NativeType(value="NVGcontext *") long _ctx) {
        long __functionAddress = Functions.GetViewId;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        return JNI.invokePC(_ctx, __functionAddress);
    }

    public static long nnvgluCreateFramebuffer(long _ctx, int _width, int _height, int imageFlags) {
        long __functionAddress = Functions.luCreateFramebuffer;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        return JNI.invokePP(_ctx, _width, _height, imageFlags, __functionAddress);
    }

    @Nullable
    @NativeType(value="NVGLUframebuffer *")
    public static NVGLUFramebufferBGFX nvgluCreateFramebuffer(@NativeType(value="NVGcontext *") long _ctx, @NativeType(value="int32_t") int _width, @NativeType(value="int32_t") int _height, @NativeType(value="int32_t") int imageFlags) {
        long __result = NanoVGBGFX.nnvgluCreateFramebuffer(_ctx, _width, _height, imageFlags);
        return NVGLUFramebufferBGFX.createSafe(__result);
    }

    public static void nnvgluBindFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luBindFramebuffer;
        JNI.invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluBindFramebuffer(@Nullable @NativeType(value="NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        NanoVGBGFX.nnvgluBindFramebuffer(MemoryUtil.memAddressSafe(_framebuffer));
    }

    public static void nnvgluDeleteFramebuffer(long _framebuffer) {
        long __functionAddress = Functions.luDeleteFramebuffer;
        JNI.invokePV(_framebuffer, __functionAddress);
    }

    public static void nvgluDeleteFramebuffer(@NativeType(value="NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        NanoVGBGFX.nnvgluDeleteFramebuffer(_framebuffer.address());
    }

    public static void nnvgluSetViewFramebuffer(short _view_id, long _framebuffer) {
        long __functionAddress = Functions.luSetViewFramebuffer;
        JNI.invokeCPV(_view_id, _framebuffer, __functionAddress);
    }

    public static void nvgluSetViewFramebuffer(@NativeType(value="bgfx_view_id_t") int _view_id, @NativeType(value="NVGLUframebuffer *") NVGLUFramebufferBGFX _framebuffer) {
        NanoVGBGFX.nnvgluSetViewFramebuffer((short)_view_id, _framebuffer.address());
    }

    public static void nvgCreateBgfxTexture(@NativeType(value="NVGcontext *") long _ctx, @NativeType(value="bgfx_texture_handle_t") short _id, int _width, int _height, int flags) {
        long __functionAddress = Functions.CreateBgfxTexture;
        if (Checks.CHECKS) {
            Checks.check(_ctx);
        }
        JNI.invokePCV(_ctx, _id, _width, _height, flags, __functionAddress);
    }

    private static void org_lwjgl_nanovg_setup(@NativeType(value="void *") long realloc, @NativeType(value="void *") long free, @NativeType(value="void *") long nvgCreateInternal, @NativeType(value="void *") long nvgInternalParams, @NativeType(value="void *") long nvgDeleteInternal) {
        long __functionAddress = Functions.org_lwjgl_nanovg_setup;
        if (Checks.CHECKS) {
            Checks.check(realloc);
            Checks.check(free);
            Checks.check(nvgCreateInternal);
            Checks.check(nvgInternalParams);
            Checks.check(nvgDeleteInternal);
        }
        JNI.invokePPPPPV(realloc, free, nvgCreateInternal, nvgInternalParams, nvgDeleteInternal, __functionAddress);
    }

    static {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator(Configuration.DEBUG_MEMORY_ALLOCATOR_INTERNAL.get(true));
        NanoVGBGFX.org_lwjgl_nanovg_setup(allocator.getRealloc(), allocator.getFree(), NanoVG.nvgCreateInternal, NanoVG.nvgInternalParams, NanoVG.nvgDeleteInternal);
    }

    private static class BGFX {
        private static final SharedLibrary library;

        private BGFX() {
        }

        static SharedLibrary getLibrary() {
            return library;
        }

        static {
            try {
                library = (SharedLibrary)Class.forName("org.lwjgl.bgfx.BGFX").getMethod("getLibrary", new Class[0]).invoke(null, new Object[0]);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class Functions {
        public static final long Create = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgCreate");
        public static final long Delete = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgDelete");
        public static final long SetViewId = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgSetViewId");
        public static final long GetViewId = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgGetViewId");
        public static final long luCreateFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluCreateFramebuffer");
        public static final long luBindFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluBindFramebuffer");
        public static final long luDeleteFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluDeleteFramebuffer");
        public static final long luSetViewFramebuffer = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgluSetViewFramebuffer");
        public static final long CreateBgfxTexture = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "nvgCreateBgfxTexture");
        public static final long org_lwjgl_nanovg_setup = APIUtil.apiGetFunctionAddress(BGFX.getLibrary(), "org_lwjgl_nanovg_setup");

        private Functions() {
        }
    }
}

