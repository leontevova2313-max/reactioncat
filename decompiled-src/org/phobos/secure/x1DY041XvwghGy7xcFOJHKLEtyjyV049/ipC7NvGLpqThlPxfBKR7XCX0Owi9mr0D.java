/*
 * Decompiled with CFR.
 */
package org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l.YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG._5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.YS5Y4LXdnllbhFYEkY8vTY2I5algUObk;

public abstract sealed class ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D
extends Enum<ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D>
permits _5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl, YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8, YS5Y4LXdnllbhFYEkY8vTY2I5algUObk {
    public static final /* synthetic */ /* enum */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D ArrayList;
    public static final /* synthetic */ /* enum */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D LinkedList;
    public static final /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D[] $VALUES;
    public static final /* synthetic */ /* enum */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D CopyOnWriteArrayList;

    static {
        ArrayList = new _5ZSBFOaBxHrFTPfMX1qsUbXSlQsMBXbl("ArrayList", 0);
        LinkedList = new YVrSQdTXl6JptfF4g1NO1ANTAllEnJA8("LinkedList", 1);
        CopyOnWriteArrayList = new YS5Y4LXdnllbhFYEkY8vTY2I5algUObk("CopyOnWriteArrayList", 2);
        $VALUES = ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D() {
        void cfr_renamed_373;
        void cfr_renamed_374;
    }

    public static /* bridge */ /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D[] $values() {
        return new ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D[]{ArrayList, LinkedList, CopyOnWriteArrayList};
    }

    public static /* bridge */ /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D[] values() {
        return (ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D[])$VALUES.clone();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D typeOf(List<?> list) {
        List<?> list2 = list;
        Objects.requireNonNull(list2);
        List<?> list3 = list2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ArrayList.class, LinkedList.class, CopyOnWriteArrayList.class}, list3, n)) {
            case 0 -> {
                ArrayList ignored = (ArrayList)list3;
                yield ArrayList;
            }
            case 1 -> {
                LinkedList ignored = (LinkedList)list3;
                yield LinkedList;
            }
            case 2 -> {
                CopyOnWriteArrayList ignored = (CopyOnWriteArrayList)list3;
                yield CopyOnWriteArrayList;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D valueOf(String name) {
        return Enum.valueOf(ipC7NvGLpqThlPxfBKR7XCX0Owi9mr0D.class, name);
    }
}

