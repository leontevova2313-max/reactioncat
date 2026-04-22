/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group018;

public enum SecureEnum0005 {
    PUBLIC("public"),
    PRIVATE("private");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0005(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0005 fromString(String name) {
        SecureEnum0005[] field001 = SecureEnum0005.values();
        int n = field001.length;
        int n2 = 0;
        while (n2 < n) {
            SecureEnum0005 visibility = field001[n2];
            if (visibility.name.equalsIgnoreCase(name)) {
                return visibility;
            }
            ++n2;
        }
        return null;
    }
}

