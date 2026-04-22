/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import org.phobos.secure.group016.SecureInterface0038;

public enum SecureEnum0021 implements SecureInterface0038
{
    Keyboard("Keyboard"),
    Mouse("Mouse");

    public final /* synthetic */ String name;

    public static /* bridge */ /* synthetic */ SecureEnum0021 fromString(String string) {
        return string.equals("Mouse") ? Mouse : Keyboard;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0021(String string) {
        void name;
        this.name = name;
    }
}

