/*
 * Decompiled with CFR.
 */
package org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt;

public enum fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p {
    API_1_0("1.0"),
    API_1_1("1.1"),
    API_1_2_beta("1.2+beta");

    public final /* synthetic */ String version;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p(String string) {
        void version;
        this.version = version;
    }

    public static /* bridge */ /* synthetic */ fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p get(String version) {
        fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p[] fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2pArray = fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p.values();
        int n = fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2pArray.length;
        int n2 = 0;
        while (n2 < n) {
            fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p value = fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2pArray[n2];
            if (value.getVersion().equals(version)) {
                return value;
            }
            ++n2;
        }
        return null;
    }
}

