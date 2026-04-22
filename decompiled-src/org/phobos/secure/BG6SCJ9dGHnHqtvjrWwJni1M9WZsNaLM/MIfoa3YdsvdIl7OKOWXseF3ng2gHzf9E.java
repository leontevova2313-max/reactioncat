/*
 * Decompiled with CFR.
 */
package org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM;

public enum MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E {
    PUBLIC("public"),
    PRIVATE("private");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E fromString(String name) {
        MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E[] mIfoa3YdsvdIl7OKOWXseF3ng2gHzf9EArray = MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E.values();
        int n = mIfoa3YdsvdIl7OKOWXseF3ng2gHzf9EArray.length;
        int n2 = 0;
        while (n2 < n) {
            MIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E visibility = mIfoa3YdsvdIl7OKOWXseF3ng2gHzf9EArray[n2];
            if (visibility.name.equalsIgnoreCase(name)) {
                return visibility;
            }
            ++n2;
        }
        return null;
    }
}

