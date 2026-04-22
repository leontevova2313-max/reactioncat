/*
 * Decompiled with CFR.
 */
package org.phobos.secure.pc6HIQuJAclXcc4JCpbef8Fre45f1Kdg;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class KkE0BLpZBhb7dLyt5iT3wfK5L1A1IgSK
implements Runnable {
    public final /* synthetic */ Map<Supplier<Boolean>, Runnable> vOgzNMsr649gl3sBlsOzBdRikBktmX0m;

    public /* synthetic */ KkE0BLpZBhb7dLyt5iT3wfK5L1A1IgSK(Runnable ... YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT) {
        this.vOgzNMsr649gl3sBlsOzBdRikBktmX0m = new ConcurrentHashMap<Supplier<Boolean>, Runnable>(YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT.length);
        Runnable[] runnableArray = YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT;
        int n = runnableArray.length;
        int n2 = 0;
        while (n2 < n) {
            Runnable li8qYbbOi0WLcy8DmlvPdKOeNcZ3kTD5 = runnableArray[n2];
            this.vOgzNMsr649gl3sBlsOzBdRikBktmX0m.put(() -> true, li8qYbbOi0WLcy8DmlvPdKOeNcZ3kTD5);
            ++n2;
        }
        return;
    }
}

