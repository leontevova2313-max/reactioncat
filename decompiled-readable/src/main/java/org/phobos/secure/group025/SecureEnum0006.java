/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group025;

public enum SecureEnum0006 {
    Morning,
    Afternoon,
    Evening,
    Night;


    public static /* bridge */ /* synthetic */ SecureEnum0006 of(int hour) {
        if (hour > 21 || hour <= 4) {
            return Night;
        }
        if (hour < 12) {
            return Morning;
        }
        if (hour <= 17) {
            return Afternoon;
        }
        return Evening;
    }
}

