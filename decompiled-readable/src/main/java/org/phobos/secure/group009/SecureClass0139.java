/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import java.util.Queue;
import java.util.function.Consumer;

public final class SecureClass0139 {
    public /* synthetic */ SecureClass0139() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void prpKemWNEspvvVaMryfBxh9ASH0fhPvn(Queue<Runnable> mMjeGkpmAUXfDWULOHGUe0STusPDnkK9) {
        SecureClass0139.L3VGabUDTY6Ftj8uE1GXZgO6q5C5IHz0(mMjeGkpmAUXfDWULOHGUe0STusPDnkK9, Runnable::run);
    }

    public static /* bridge */ /* synthetic */ <T> void L3VGabUDTY6Ftj8uE1GXZgO6q5C5IHz0(Queue<T> fDstLESZSCEQ1acFcroo5dPFuqSUiX01, Consumer<T> m9L1yzDmsICyvYJNAEyRnXIvTlEVbXw2) {
        while (!fDstLESZSCEQ1acFcroo5dPFuqSUiX01.isEmpty()) {
            T field001 = fDstLESZSCEQ1acFcroo5dPFuqSUiX01.poll();
            if (field001 == null) continue;
            m9L1yzDmsICyvYJNAEyRnXIvTlEVbXw2.accept(field001);
        }
        return;
    }
}

