/*
 * Decompiled with CFR.
 */
package org.lwjgl.system.windows;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.SharedLibrary;
import org.lwjgl.system.windows.WinBase;
import org.lwjgl.system.windows.WindowsUtil;

public class WindowsLibrary
extends SharedLibrary.Default {
    public static final long HINSTANCE;

    public WindowsLibrary(String name) {
        this(name, WindowsLibrary.loadLibrary(name));
    }

    public WindowsLibrary(String name, long handle) {
        super(name, handle);
    }

    private static long loadLibrary(String name) {
        long handle;
        try (MemoryStack stack = MemoryStack.stackPush();){
            handle = WinBase.LoadLibrary(stack.UTF16(name));
        }
        if (handle == 0L) {
            throw new UnsatisfiedLinkError("Failed to load library: " + name + " (error code = " + WinBase.getLastError() + ")");
        }
        return handle;
    }

    /*
     * Unable to fully structure code
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public String getPath() {
        maxLen = 256;
        buffer = MemoryUtil.memAlloc(maxLen);
        while (true) {
            block7: {
                len = WinBase.GetModuleFileName(this.address(), buffer);
                err = WinBase.getLastError();
                if (err != 0) break block7;
                ** break block8
            }
            if (err != 122) {
                var5_6 = null;
                return var5_6;
            }
            maxLen = maxLen * 3 / 2;
            buffer = MemoryUtil.memRealloc(buffer, maxLen);
        }
        finally {
            MemoryUtil.memFree(buffer);
        }
lbl-1000:
        // 1 sources

        {
            var5_5 = len == 0 ? null : MemoryUtil.memUTF16(buffer, len);
        }
        return var5_5;
    }

    @Override
    public long getFunctionAddress(ByteBuffer functionName) {
        return WinBase.GetProcAddress(this.address(), functionName);
    }

    @Override
    public void free() {
        if (!WinBase.FreeLibrary(this.address())) {
            WindowsUtil.windowsThrowException("Failed to unload library: " + this.getName());
        }
    }

    static {
        try (MemoryStack stack = MemoryStack.stackPush();){
            HINSTANCE = WinBase.GetModuleHandle(stack.UTF16(Library.JNI_LIBRARY_NAME));
            if (HINSTANCE == 0L) {
                throw new RuntimeException("Failed to retrieve LWJGL module handle.");
            }
        }
    }
}

