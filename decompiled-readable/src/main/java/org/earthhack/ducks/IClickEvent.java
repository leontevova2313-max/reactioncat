/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import java.util.List;
import net.minecraft.class_2558;

public interface IClickEvent {
    default public void addCallback(Runnable runnable) {
        this.getCallbacks().add(runnable);
    }

    public List<Runnable> getCallbacks();

    public static IClickEvent cast(class_2558 event) {
        return (IClickEvent)event;
    }
}

