/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface SecureInterface0001
extends Library {
    public static final /* synthetic */ SecureInterface0001 field001;

    static {
        field001 = (SecureInterface0001)Native.load((String)"Shell32", SecureInterface0001.class);
    }
}

