/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class SecureClass0784
implements Runnable {
    public final /* synthetic */ Map<Supplier<Boolean>, Runnable> field001;

    public /* synthetic */ SecureClass0784(Runnable ... YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT) {
        this.field001 = new ConcurrentHashMap<Supplier<Boolean>, Runnable>(YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT.length);
        Runnable[] runnableArray = YggZVdhKb1wUPvxgpmhA0XrHpczl2ETT;
        int n = runnableArray.length;
        int n2 = 0;
        while (n2 < n) {
            Runnable field002 = runnableArray[n2];
            this.field001.put(() -> true, field002);
            ++n2;
        }
        return;
    }
}

