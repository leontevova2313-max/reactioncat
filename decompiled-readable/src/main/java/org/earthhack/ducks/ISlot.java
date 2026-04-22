/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_1735;

public interface ISlot {
    public float getLastRenderX();

    public float getLastRenderY();

    public void setLastRenderX(float var1);

    public void setLastRenderY(float var1);

    public boolean isLoaded();

    public void setLoaded(boolean var1);

    public static ISlot cast(class_1735 slot) {
        return (ISlot)slot;
    }
}

