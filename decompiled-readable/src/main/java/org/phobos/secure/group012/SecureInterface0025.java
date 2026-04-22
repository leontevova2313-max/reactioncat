/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group012;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
import java.util.Map;

public interface SecureInterface0025
extends WinNT,
StdCallLibrary {
    public static final /* synthetic */ SecureInterface0025 field001;

    static {
        field001 = (SecureInterface0025)Native.loadLibrary((String)"psapi", SecureInterface0025.class, (Map)W32APIOptions.UNICODE_OPTIONS);
    }
}

