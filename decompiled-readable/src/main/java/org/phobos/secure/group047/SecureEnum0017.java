/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import org.phobos.secure.group016.SecureInterface0038;

public enum SecureEnum0017 implements SecureInterface0038
{
    Normal("Normal"),
    Hold("Hold");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0017(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0017 fromString(String string) {
        return string.equals("Hold") ? Hold : Normal;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0017 other(SecureEnum0017 other) {
        return switch (other.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> Hold;
            case 1 -> Normal;
        };
    }
}

