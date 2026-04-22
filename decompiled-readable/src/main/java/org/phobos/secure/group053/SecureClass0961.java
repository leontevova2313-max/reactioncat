/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group053;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group049.wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9;
import org.phobos.secure.group040.TEKcAvFhe9734wtYxvE6WeObBGDnnbLV;
import org.phobos.secure.group042.OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB;

public abstract sealed class SecureClass0961
extends Enum<SecureClass0961>
permits OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB, wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9, TEKcAvFhe9734wtYxvE6WeObBGDnnbLV {
    public static final /* synthetic */ /* enum */ SecureClass0961 HashSet;
    public static final /* synthetic */ /* enum */ SecureClass0961 field001;
    public static final /* synthetic */ SecureClass0961[] $VALUES;
    public static final /* synthetic */ /* enum */ SecureClass0961 LinkedHashSet;

    static {
        HashSet = new OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB("HashSet", 0);
        LinkedHashSet = new wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9("LinkedHashSet", 1);
        field001 = new TEKcAvFhe9734wtYxvE6WeObBGDnnbLV("field001", 2);
        $VALUES = SecureClass0961.$values();
    }

    public static /* bridge */ /* synthetic */ SecureClass0961[] $values() {
        return new SecureClass0961[]{HashSet, LinkedHashSet, field001};
    }

    @Nullable
    public static /* bridge */ /* synthetic */ SecureClass0961 typeOf(Set<?> map) {
        Set<?> set = map;
        Objects.requireNonNull(set);
        Set<?> set2 = set;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{LinkedHashSet.class, ConcurrentHashMap.KeySetView.class, HashSet.class}, set2, n)) {
            case 0 -> {
                LinkedHashSet ignored = (LinkedHashSet)set2;
                yield LinkedHashSet;
            }
            case 1 -> {
                ConcurrentHashMap.KeySetView ignored = (ConcurrentHashMap.KeySetView)set2;
                yield field001;
            }
            case 2 -> {
                HashSet ignored = (HashSet)set2;
                yield HashSet;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ SecureClass0961 valueOf(String name) {
        return Enum.valueOf(SecureClass0961.class, name);
    }

    public static /* bridge */ /* synthetic */ SecureClass0961[] values() {
        return (SecureClass0961[])$VALUES.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass0961() {
        void field002;
        void field003;
    }
}

