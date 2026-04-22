/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import engine.linking.NativeMethodHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.phobos.secure.group020.SecureInterface0051;

public class SecureClass0147 {
    public static /* synthetic */ int field001;
    public static final /* synthetic */ Map<Integer, Supplier<SecureInterface0051>> field002;
    public static final /* synthetic */ Map<Class<? extends SecureInterface0051>, Integer> field003;

    public static /* bridge */ /* synthetic */ int tPgtnz8GcwRcz1uOFXP2WqBMlUcynP2h(SecureInterface0051 qFryOmM3f6E6LG8aBvhngrCSPQ1I265z) {
        Integer field004 = field003.get(qFryOmM3f6E6LG8aBvhngrCSPQ1I265z.getClass());
        if (field004 != null) {
            return field004;
        }
        throw new IllegalArgumentException("Unknown packet class: " + qFryOmM3f6E6LG8aBvhngrCSPQ1I265z.getClass().getName());
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(17);
        field001 = 0;
        field002 = new HashMap<Integer, Supplier<SecureInterface0051>>();
        field003 = new HashMap<Class<? extends SecureInterface0051>, Integer>();
    }

    public static /* bridge */ native /* synthetic */ void xCUsGGMh2OnZnK6iR7L4NAymvO1IOyCt();

    public static /* bridge */ /* synthetic */ SecureInterface0051 cfr_renamed_157(int U36aJVbGL8Lel6rnPFhm2RJIx1ipvSqi) {
        Supplier<SecureInterface0051> field005 = field002.get(U36aJVbGL8Lel6rnPFhm2RJIx1ipvSqi);
        if (field005 != null) {
            return field005.get();
        }
        throw new IllegalArgumentException("Unknown packet id: " + U36aJVbGL8Lel6rnPFhm2RJIx1ipvSqi);
    }
}

