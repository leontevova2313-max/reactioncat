/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group029;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.field001;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group001.IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM;
import org.phobos.secure.group006.cR98YcGt78pLmtrRTQFZg4XsoIDp6azU;
import org.phobos.secure.group022.PD06jhH6VAccO3ahtRt0xDUfsifOEc31;
import org.phobos.secure.group028.wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV;

public abstract sealed class SecureClass0523
extends Enum<SecureClass0523>
permits IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM, PD06jhH6VAccO3ahtRt0xDUfsifOEc31, wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV, cR98YcGt78pLmtrRTQFZg4XsoIDp6azU {
    public static final /* synthetic */ /* enum */ SecureClass0523 field001;
    public static final /* synthetic */ /* enum */ SecureClass0523 HashMap;
    public static final /* synthetic */ SecureClass0523[] $VALUES;
    public static final /* synthetic */ /* enum */ SecureClass0523 WeakHashMap;
    public static final /* synthetic */ /* enum */ SecureClass0523 LinkedHashMap;

    @Nullable
    public static /* bridge */ /* synthetic */ SecureClass0523 typeOf(Map<?, ?> map) {
        Map<?, ?> map2 = map;
        Objects.requireNonNull(map2);
        Map<?, ?> map3 = map2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{LinkedHashMap.class, WeakHashMap.class, HashMap.class, field001.class}, map3, n)) {
            case 0 -> {
                LinkedHashMap ignored = (LinkedHashMap)map3;
                yield LinkedHashMap;
            }
            case 1 -> {
                WeakHashMap ignored = (WeakHashMap)map3;
                yield WeakHashMap;
            }
            case 2 -> {
                HashMap ignored = (HashMap)map3;
                yield HashMap;
            }
            case 3 -> {
                field001 ignored = (field001)map3;
                yield field001;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ SecureClass0523[] values() {
        return (SecureClass0523[])$VALUES.clone();
    }

    public static /* bridge */ /* synthetic */ SecureClass0523[] $values() {
        return new SecureClass0523[]{HashMap, LinkedHashMap, WeakHashMap, field001};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass0523() {
        void field002;
        void field003;
    }

    static {
        HashMap = new IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM("HashMap", 0);
        LinkedHashMap = new PD06jhH6VAccO3ahtRt0xDUfsifOEc31("LinkedHashMap", 1);
        WeakHashMap = new wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV("WeakHashMap", 2);
        field001 = new cR98YcGt78pLmtrRTQFZg4XsoIDp6azU("field001", 3);
        $VALUES = SecureClass0523.$values();
    }

    public static /* bridge */ /* synthetic */ SecureClass0523 valueOf(String name) {
        return Enum.valueOf(SecureClass0523.class, name);
    }
}

