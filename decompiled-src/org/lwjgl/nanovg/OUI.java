/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.LibNanoVG;
import org.lwjgl.nanovg.UIHandler;
import org.lwjgl.nanovg.UIHandlerI;
import org.lwjgl.nanovg.UIRect;
import org.lwjgl.nanovg.UIVec2;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

public class OUI {
    public static final int UI_USERMASK = -16777216;
    public static final int UI_ANY = -1;
    public static final int UI_COLD = 0;
    public static final int UI_HOT = 1;
    public static final int UI_ACTIVE = 2;
    public static final int UI_FROZEN = 3;
    public static final int UI_ROW = 2;
    public static final int UI_COLUMN = 3;
    public static final int UI_LAYOUT = 0;
    public static final int UI_FLEX = 2;
    public static final int UI_NOWRAP = 0;
    public static final int UI_WRAP = 4;
    public static final int UI_START = 8;
    public static final int UI_MIDDLE = 0;
    public static final int UI_END = 16;
    public static final int UI_JUSTIFY = 24;
    public static final int UI_LEFT = 32;
    public static final int UI_TOP = 64;
    public static final int UI_RIGHT = 128;
    public static final int UI_DOWN = 256;
    public static final int UI_HFILL = 160;
    public static final int UI_VFILL = 320;
    public static final int UI_HCENTER = 0;
    public static final int UI_VCENTER = 0;
    public static final int UI_CENTER = 0;
    public static final int UI_FILL = 480;
    public static final int UI_BREAK = 512;
    public static final int UI_BUTTON0_DOWN = 1024;
    public static final int UI_BUTTON0_UP = 2048;
    public static final int UI_BUTTON0_HOT_UP = 4096;
    public static final int UI_BUTTON0_CAPTURE = 8192;
    public static final int UI_BUTTON2_DOWN = 16384;
    public static final int UI_SCROLL = 32768;
    public static final int UI_KEY_DOWN = 65536;
    public static final int UI_KEY_UP = 131072;
    public static final int UI_CHAR = 262144;

    protected OUI() {
        throw new UnsupportedOperationException();
    }

    @NativeType(value="UIcontext *")
    public static native long uiCreateContext(@NativeType(value="unsigned int") int var0, @NativeType(value="unsigned int") int var1);

    public static native void uiMakeCurrent(@NativeType(value="UIcontext *") long var0);

    public static native void nuiDestroyContext(long var0);

    public static void uiDestroyContext(@NativeType(value="UIcontext *") long ctx) {
        if (Checks.CHECKS) {
            Checks.check(ctx);
        }
        OUI.nuiDestroyContext(ctx);
    }

    @NativeType(value="UIcontext *")
    public static native long uiGetContext();

    public static native void uiSetCursor(int var0, int var1);

    public static native void nuiGetCursor(long var0);

    @NativeType(value="UIvec2")
    public static UIVec2 uiGetCursor(@NativeType(value="UIvec2") UIVec2 __result) {
        OUI.nuiGetCursor(__result.address());
        return __result;
    }

    public static native void nuiGetCursorDelta(long var0);

    @NativeType(value="UIvec2")
    public static UIVec2 uiGetCursorDelta(@NativeType(value="UIvec2") UIVec2 __result) {
        OUI.nuiGetCursorDelta(__result.address());
        return __result;
    }

    public static native void nuiGetCursorStart(long var0);

    @NativeType(value="UIvec2")
    public static UIVec2 uiGetCursorStart(@NativeType(value="UIvec2") UIVec2 __result) {
        OUI.nuiGetCursorStart(__result.address());
        return __result;
    }

    public static native void nuiGetCursorStartDelta(long var0);

    @NativeType(value="UIvec2")
    public static UIVec2 uiGetCursorStartDelta(@NativeType(value="UIvec2") UIVec2 __result) {
        OUI.nuiGetCursorStartDelta(__result.address());
        return __result;
    }

    public static native void nuiSetButton(int var0, int var1, int var2);

    public static void uiSetButton(@NativeType(value="unsigned int") int button, @NativeType(value="unsigned int") int mod, @NativeType(value="int") boolean enabled) {
        OUI.nuiSetButton(button, mod, enabled ? 1 : 0);
    }

    public static native int nuiGetButton(int var0);

    @NativeType(value="int")
    public static boolean uiGetButton(@NativeType(value="unsigned int") int button) {
        return OUI.nuiGetButton(button) != 0;
    }

    public static native int uiGetClicks();

    public static native void nuiSetKey(int var0, int var1, int var2);

    public static void uiSetKey(@NativeType(value="unsigned int") int key, @NativeType(value="unsigned int") int mod, @NativeType(value="int") boolean enabled) {
        OUI.nuiSetKey(key, mod, enabled ? 1 : 0);
    }

    public static native void uiSetChar(@NativeType(value="unsigned int") int var0);

    public static native void uiSetScroll(int var0, int var1);

    public static native void nuiGetScroll(long var0);

    @NativeType(value="UIvec2")
    public static UIVec2 uiGetScroll(@NativeType(value="UIvec2") UIVec2 __result) {
        OUI.nuiGetScroll(__result.address());
        return __result;
    }

    public static native void uiBeginLayout();

    public static native void uiEndLayout();

    public static native void uiUpdateHotItem();

    public static native void uiProcess(int var0);

    public static native void uiClearState();

    public static native int uiItem();

    public static native void nuiSetFrozen(int var0, int var1);

    public static void uiSetFrozen(int item, @NativeType(value="int") boolean enable) {
        OUI.nuiSetFrozen(item, enable ? 1 : 0);
    }

    public static native void uiSetHandle(int var0, @NativeType(value="void *") long var1);

    public static native long nuiAllocHandle(int var0, int var1);

    @Nullable
    @NativeType(value="void *")
    public static ByteBuffer uiAllocHandle(int item, @NativeType(value="unsigned int") int size) {
        long __result = OUI.nuiAllocHandle(item, size);
        return MemoryUtil.memByteBufferSafe(__result, size);
    }

    public static native void nuiSetHandler(long var0);

    public static void uiSetHandler(@NativeType(value="UIhandler") UIHandlerI handler) {
        OUI.nuiSetHandler(handler.address());
    }

    public static native void uiSetEvents(int var0, @NativeType(value="unsigned int") int var1);

    public static native void uiSetFlags(int var0, @NativeType(value="unsigned int") int var1);

    public static native int uiInsert(int var0, int var1);

    public static native int uiAppend(int var0, int var1);

    public static native int uiInsertBack(int var0, int var1);

    public static native int uiInsertFront(int var0, int var1);

    public static native void uiSetSize(int var0, int var1, int var2);

    public static native void uiSetLayout(int var0, @NativeType(value="unsigned int") int var1);

    public static native void uiSetBox(int var0, @NativeType(value="unsigned int") int var1);

    public static native void nuiSetMargins(int var0, short var1, short var2, short var3, short var4);

    public static void uiSetMargins(int item, @NativeType(value="short") int l, @NativeType(value="short") int t, @NativeType(value="short") int r, @NativeType(value="short") int b) {
        OUI.nuiSetMargins(item, (short)l, (short)t, (short)r, (short)b);
    }

    public static native void uiFocus(int var0);

    public static native int uiFirstChild(int var0);

    public static native int uiNextSibling(int var0);

    public static native int uiGetItemCount();

    @NativeType(value="unsigned int")
    public static native int uiGetAllocSize();

    @NativeType(value="UIitemState")
    public static native int uiGetState(int var0);

    @NativeType(value="void *")
    public static native long uiGetHandle(int var0);

    public static native int uiGetHotItem();

    public static native int uiGetFocusedItem();

    public static native int uiFindItem(int var0, int var1, int var2, @NativeType(value="unsigned int") int var3, @NativeType(value="unsigned int") int var4);

    public static native long nuiGetHandler();

    @Nullable
    @NativeType(value="UIhandler")
    public static UIHandler uiGetHandler() {
        return UIHandler.createSafe(OUI.nuiGetHandler());
    }

    @NativeType(value="unsigned int")
    public static native int uiGetEvents(int var0);

    @NativeType(value="unsigned int")
    public static native int uiGetFlags(int var0);

    @NativeType(value="unsigned int")
    public static native int uiGetKey();

    @NativeType(value="unsigned int")
    public static native int uiGetModifier();

    public static native void nuiGetRect(int var0, long var1);

    @NativeType(value="UIrect")
    public static UIRect uiGetRect(int item, @NativeType(value="UIrect") UIRect __result) {
        OUI.nuiGetRect(item, __result.address());
        return __result;
    }

    public static native int nuiContains(int var0, int var1, int var2);

    @NativeType(value="int")
    public static boolean uiContains(int item, int x, int y) {
        return OUI.nuiContains(item, x, y) != 0;
    }

    public static native int uiGetWidth(int var0);

    public static native int uiGetHeight(int var0);

    @NativeType(value="unsigned int")
    public static native int uiGetLayout(int var0);

    @NativeType(value="unsigned int")
    public static native int uiGetBox(int var0);

    public static native short uiGetMarginLeft(int var0);

    public static native short uiGetMarginTop(int var0);

    public static native short uiGetMarginRight(int var0);

    public static native short uiGetMarginDown(int var0);

    public static native int uiRecoverItem(int var0);

    public static native void uiRemapItem(int var0, int var1);

    public static native int uiGetLastItemCount();

    static {
        LibNanoVG.initialize();
    }
}

