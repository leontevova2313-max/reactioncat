/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

import engine.linking.NativeMethodHandler;
import java.util.regex.Pattern;

public final class SecureClass0363 {
    public /* synthetic */ SecureClass0363() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ native /* synthetic */ boolean ruq3ANOH4L6j8PmYKlHMwnPjN6fWneX2(String var0);

    static {
        NativeMethodHandler.registerNativeCallbacks(28);
        SecureClass0363.__set__LjA2S5mIZzyVWnACbQmjNLJ6rTRNtnTT(Pattern.compile("^(https?://)?(www\\.)?(imgur\\.com|i\\.imgur\\.com|namemc\\.com|cdn\\.discordapp\\.com|media\\.discordapp\\.net)/.*\\.(png|jpg|jpeg)(\\?.*)?$", 2));
    }

    public static native /* synthetic */ Pattern __get__LjA2S5mIZzyVWnACbQmjNLJ6rTRNtnTT();

    public static native /* synthetic */ void __set__LjA2S5mIZzyVWnACbQmjNLJ6rTRNtnTT(Pattern var0);
}

