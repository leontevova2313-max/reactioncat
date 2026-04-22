/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group048;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.WinNT;
import com.sun.jna.win32.StdCallLibrary;
import com.sun.jna.win32.W32APIOptions;
import java.util.Map;

public interface SecureInterface0121
extends WinNT,
StdCallLibrary {
    public static final /* synthetic */ SecureInterface0121 field001;

    static {
        field001 = (SecureInterface0121)Native.loadLibrary((String)"kernel32", SecureInterface0121.class, (Map)W32APIOptions.UNICODE_OPTIONS);
    }
}

