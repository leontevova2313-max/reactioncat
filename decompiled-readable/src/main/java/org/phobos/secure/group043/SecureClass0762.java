/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group043;

import java.util.ArrayList;

public class SecureClass0762 {
    public static final /* synthetic */ ArrayList<Long> field001;

    public static /* bridge */ /* synthetic */ void MWSRVOIRJQ48Clsh4hkIMJMThwIKvrGp() {
        field001.add(System.currentTimeMillis());
    }

    public static /* bridge */ /* synthetic */ int XHHXz3eFYx9AM5qs0vDruiuwR8rv7h0c() {
        SecureClass0762.field001.removeIf(CxFLO3fjueU4YZVjbjz48hS1Zr4ourv1 -> CxFLO3fjueU4YZVjbjz48hS1Zr4ourv1 + 1000L < System.currentTimeMillis());
        return field001.size();
    }

    static {
        field001 = new ArrayList<E>(0);
    }
}

