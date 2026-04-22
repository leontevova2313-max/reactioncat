/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

public enum SecureEnum0009 {
    Center("center"),
    Right("right"),
    Left("left");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0009(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0009 fromString(String string) {
        return switch (string) {
            case "right" -> Right;
            case "left" -> Left;
            default -> Center;
        };
    }
}

