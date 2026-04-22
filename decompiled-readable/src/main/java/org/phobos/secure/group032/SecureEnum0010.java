/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

public enum SecureEnum0010 {
    Config("Config"),
    Script("Script"),
    Proxy("Proxy");

    public final /* synthetic */ String name;

    public static /* bridge */ /* synthetic */ SecureEnum0010 fromString(String string) {
        return switch (string) {
            case "Config" -> Config;
            case "Script" -> Script;
            case "Proxy" -> Proxy;
            default -> throw new IllegalArgumentException();
        };
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0010(String string) {
        void name;
        this.name = name;
    }
}

