/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group059;

public enum SecureEnum0023 {
    Top("top"),
    Center("center"),
    Bottom("bottom");

    public final /* synthetic */ String name;

    public static /* bridge */ /* synthetic */ SecureEnum0023 fromString(String string) {
        return switch (string) {
            case "top" -> Top;
            default -> Bottom;
        };
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0023(String string) {
        void name;
        this.name = name;
    }
}

