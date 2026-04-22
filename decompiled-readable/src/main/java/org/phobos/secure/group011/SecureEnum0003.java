/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

public enum SecureEnum0003 {
    API_1_0("1.0"),
    API_1_1("1.1"),
    API_1_2_beta("1.2+beta");

    public final /* synthetic */ String version;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0003(String string) {
        void version;
        this.version = version;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0003 get(String version) {
        SecureEnum0003[] field001 = SecureEnum0003.values();
        int n = field001.length;
        int n2 = 0;
        while (n2 < n) {
            SecureEnum0003 value = field001[n2];
            if (value.getVersion().equals(version)) {
                return value;
            }
            ++n2;
        }
        return null;
    }
}

