/*
 * Decompiled with CFR.
 */
package org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj;

import java.util.Queue;
import java.util.function.Consumer;

public final class HGZ5eqslH96UvsBMUKhsaLj6dYhhx0uz {
    public /* synthetic */ HGZ5eqslH96UvsBMUKhsaLj6dYhhx0uz() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void prpKemWNEspvvVaMryfBxh9ASH0fhPvn(Queue<Runnable> mMjeGkpmAUXfDWULOHGUe0STusPDnkK9) {
        HGZ5eqslH96UvsBMUKhsaLj6dYhhx0uz.L3VGabUDTY6Ftj8uE1GXZgO6q5C5IHz0(mMjeGkpmAUXfDWULOHGUe0STusPDnkK9, Runnable::run);
    }

    public static /* bridge */ /* synthetic */ <T> void L3VGabUDTY6Ftj8uE1GXZgO6q5C5IHz0(Queue<T> fDstLESZSCEQ1acFcroo5dPFuqSUiX01, Consumer<T> m9L1yzDmsICyvYJNAEyRnXIvTlEVbXw2) {
        while (!fDstLESZSCEQ1acFcroo5dPFuqSUiX01.isEmpty()) {
            T s1oQkUlFyoFWzFm4LiCM9SWHAdh09Bs5 = fDstLESZSCEQ1acFcroo5dPFuqSUiX01.poll();
            if (s1oQkUlFyoFWzFm4LiCM9SWHAdh09Bs5 == null) continue;
            m9L1yzDmsICyvYJNAEyRnXIvTlEVbXw2.accept(s1oQkUlFyoFWzFm4LiCM9SWHAdh09Bs5);
        }
        return;
    }
}

