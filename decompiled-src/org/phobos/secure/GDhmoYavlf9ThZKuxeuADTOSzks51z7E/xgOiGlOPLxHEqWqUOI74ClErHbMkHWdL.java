/*
 * Decompiled with CFR.
 */
package org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM;
import org.phobos.secure.3BztNC70MwSEQNTzZ4lvFGqznxpf9J2W.cR98YcGt78pLmtrRTQFZg4XsoIDp6azU;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.PD06jhH6VAccO3ahtRt0xDUfsifOEc31;
import org.phobos.secure.fTk4RlLkMp5c4dhA0Mjh9YGk4LiwJiv4.wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV;

public abstract sealed class xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL
extends Enum<xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL>
permits IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM, PD06jhH6VAccO3ahtRt0xDUfsifOEc31, wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV, cR98YcGt78pLmtrRTQFZg4XsoIDp6azU {
    public static final /* synthetic */ /* enum */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL ConcurrentHashMap;
    public static final /* synthetic */ /* enum */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL HashMap;
    public static final /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL[] $VALUES;
    public static final /* synthetic */ /* enum */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL WeakHashMap;
    public static final /* synthetic */ /* enum */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL LinkedHashMap;

    @Nullable
    public static /* bridge */ /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL typeOf(Map<?, ?> map) {
        Map<?, ?> map2 = map;
        Objects.requireNonNull(map2);
        Map<?, ?> map3 = map2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{LinkedHashMap.class, WeakHashMap.class, HashMap.class, ConcurrentHashMap.class}, map3, n)) {
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
                ConcurrentHashMap ignored = (ConcurrentHashMap)map3;
                yield ConcurrentHashMap;
            }
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL[] values() {
        return (xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL[])$VALUES.clone();
    }

    public static /* bridge */ /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL[] $values() {
        return new xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL[]{HashMap, LinkedHashMap, WeakHashMap, ConcurrentHashMap};
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL() {
        void cfr_renamed_373;
        void cfr_renamed_374;
    }

    static {
        HashMap = new IhBDuBnJfnYnXfsglZ9E7DFoTw322dQM("HashMap", 0);
        LinkedHashMap = new PD06jhH6VAccO3ahtRt0xDUfsifOEc31("LinkedHashMap", 1);
        WeakHashMap = new wvkk4cTcu0b6yeLV3kcMPyPfS0fq3igV("WeakHashMap", 2);
        ConcurrentHashMap = new cR98YcGt78pLmtrRTQFZg4XsoIDp6azU("ConcurrentHashMap", 3);
        $VALUES = xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL.$values();
    }

    public static /* bridge */ /* synthetic */ xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL valueOf(String name) {
        return Enum.valueOf(xgOiGlOPLxHEqWqUOI74ClErHbMkHWdL.class, name);
    }
}

