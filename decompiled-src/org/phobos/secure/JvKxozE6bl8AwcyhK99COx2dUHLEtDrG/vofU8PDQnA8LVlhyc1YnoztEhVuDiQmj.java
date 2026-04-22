/*
 * Decompiled with CFR.
 */
package org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG;

public enum vofU8PDQnA8LVlhyc1YnoztEhVuDiQmj {
    Config("Config"),
    Script("Script"),
    Proxy("Proxy");

    public final /* synthetic */ String name;

    public static /* bridge */ /* synthetic */ vofU8PDQnA8LVlhyc1YnoztEhVuDiQmj fromString(String string) {
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
    public /* synthetic */ vofU8PDQnA8LVlhyc1YnoztEhVuDiQmj(String string) {
        void name;
        this.name = name;
    }
}

