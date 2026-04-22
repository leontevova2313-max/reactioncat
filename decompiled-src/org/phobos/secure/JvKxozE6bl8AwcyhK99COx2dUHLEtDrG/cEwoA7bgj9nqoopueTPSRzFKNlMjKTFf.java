/*
 * Decompiled with CFR.
 */
package org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG;

public enum cEwoA7bgj9nqoopueTPSRzFKNlMjKTFf {
    Center("center"),
    Right("right"),
    Left("left");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ cEwoA7bgj9nqoopueTPSRzFKNlMjKTFf(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ cEwoA7bgj9nqoopueTPSRzFKNlMjKTFf fromString(String string) {
        return switch (string) {
            case "right" -> Right;
            case "left" -> Left;
            default -> Center;
        };
    }
}

