/*
 * Decompiled with CFR.
 */
package org.phobos.secure.E7qwU8abcwz3brAbulptWa86RqdgSg2V;

public enum VEHk08BKpf2kPjFZ898wWUYmVpNoBIfs {
    Morning,
    Afternoon,
    Evening,
    Night;


    public static /* bridge */ /* synthetic */ VEHk08BKpf2kPjFZ898wWUYmVpNoBIfs of(int hour) {
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

