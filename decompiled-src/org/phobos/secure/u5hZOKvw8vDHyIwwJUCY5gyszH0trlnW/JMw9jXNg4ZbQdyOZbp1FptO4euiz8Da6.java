/*
 * Decompiled with CFR.
 */
package org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.RugDPRqy5xmkJR7Yctr5fQZFvaNSp12I.wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.TEKcAvFhe9734wtYxvE6WeObBGDnnbLV;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB;

public abstract sealed class JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6
extends Enum<JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6>
permits OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB, wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9, TEKcAvFhe9734wtYxvE6WeObBGDnnbLV {
    public static final /* synthetic */ /* enum */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6 HashSet;
    public static final /* synthetic */ /* enum */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6 ConcurrentHashSet;
    public static final /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6[] $VALUES;
    public static final /* synthetic */ /* enum */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6 LinkedHashSet;

    static {
        HashSet = new OWKfQwB34eQgYoHgeK4erc4LUDqIUpFB("HashSet", 0);
        LinkedHashSet = new wZmdtiRea8zkEXOTgQSBioOcKvFp0Be9("LinkedHashSet", 1);
        ConcurrentHashSet = new TEKcAvFhe9734wtYxvE6WeObBGDnnbLV("ConcurrentHashSet", 2);
        $VALUES = JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6.$values();
    }

    public static /* bridge */ /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6[] $values() {
        return new JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6[]{HashSet, LinkedHashSet, ConcurrentHashSet};
    }

    @Nullable
    public static /* bridge */ /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6 typeOf(Set<?> map) {
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
                yield ConcurrentHashSet;
            }
            case 2 -> {
                HashSet ignored = (HashSet)set2;
                yield HashSet;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6 valueOf(String name) {
        return Enum.valueOf(JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6.class, name);
    }

    public static /* bridge */ /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6[] values() {
        return (JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6[])$VALUES.clone();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ JMw9jXNg4ZbQdyOZbp1FptO4euiz8Da6() {
        void cfr_renamed_373;
        void cfr_renamed_374;
    }
}

