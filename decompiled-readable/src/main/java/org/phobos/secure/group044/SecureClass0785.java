/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import java.util.function.BiFunction;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group035.zu8fgmKaFhJUFPtIaNn7PlLVdsWGlowj;

public class SecureClass0785<T> {
    @SafeVarargs
    @NotNull
    public static /* bridge */ /* synthetic */ <T> zu8fgmKaFhJUFPtIaNn7PlLVdsWGlowj<T> E62jDJikEwLtRhnB8KU5jArUIljxo3D9(T t, T Pm8qS63vWN0sseAes4WQEuqyaByvnJXa, BiFunction<T, T, T> ... GSGqByA6oLdzbI8mghp12X1IP5lnvAEx) {
        MutableObject field001 = new MutableObject();
        BiFunction<T, T, T>[] biFunctionArray = GSGqByA6oLdzbI8mghp12X1IP5lnvAEx;
        int n = biFunctionArray.length;
        int n2 = 0;
        while (n2 < n) {
            BiFunction<T, T, T> field002 = biFunctionArray[n2];
            T field003 = field002.apply(t, Pm8qS63vWN0sseAes4WQEuqyaByvnJXa);
            zu8fgmKaFhJUFPtIaNn7PlLVdsWGlowj<T> field004 = new zu8fgmKaFhJUFPtIaNn7PlLVdsWGlowj<T>(field003);
            field001.setValue(field004);
            if (!field004.mzi6pCaGASxIxo7DbUq7qC57oUs8mLkz()) {
                return field004;
            }
            ++n2;
        }
        return (zu8fgmKaFhJUFPtIaNn7PlLVdsWGlowj)field001.getValue();
    }
}

