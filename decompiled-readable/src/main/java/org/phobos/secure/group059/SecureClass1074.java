/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group059;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.field001;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group055.YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8;
import org.phobos.secure.group016._5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl;
import org.phobos.secure.group022.YS5Y4LXdnllbhFYEkY8vTY2I5algUObk;

public abstract sealed class SecureClass1074
extends Enum<SecureClass1074>
permits _5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl, YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8, YS5Y4LXdnllbhFYEkY8vTY2I5algUObk {
    public static final /* synthetic */ /* enum */ SecureClass1074 ArrayList;
    public static final /* synthetic */ /* enum */ SecureClass1074 LinkedList;
    public static final /* synthetic */ SecureClass1074[] $VALUES;
    public static final /* synthetic */ /* enum */ SecureClass1074 field001;

    static {
        ArrayList = new _5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl("ArrayList", 0);
        LinkedList = new YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8("LinkedList", 1);
        field001 = new YS5Y4LXdnllbhFYEkY8vTY2I5algUObk("field001", 2);
        $VALUES = SecureClass1074.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass1074() {
        void field002;
        void field003;
    }

    public static /* bridge */ /* synthetic */ SecureClass1074[] $values() {
        return new SecureClass1074[]{ArrayList, LinkedList, field001};
    }

    public static /* bridge */ /* synthetic */ SecureClass1074[] values() {
        return (SecureClass1074[])$VALUES.clone();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ SecureClass1074 typeOf(List<?> list) {
        List<?> list2 = list;
        Objects.requireNonNull(list2);
        List<?> list3 = list2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ArrayList.class, LinkedList.class, field001.class}, list3, n)) {
            case 0 -> {
                ArrayList ignored = (ArrayList)list3;
                yield ArrayList;
            }
            case 1 -> {
                LinkedList ignored = (LinkedList)list3;
                yield LinkedList;
            }
            case 2 -> {
                field001 ignored = (field001)list3;
                yield field001;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ SecureClass1074 valueOf(String name) {
        return Enum.valueOf(SecureClass1074.class, name);
    }
}

