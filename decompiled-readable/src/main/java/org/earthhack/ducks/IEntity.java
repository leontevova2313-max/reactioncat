/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_4050;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group030.SecureClass0525;

public interface IEntity {
    public long getAttackTime();

    public void setAttackTime(long var1);

    public boolean isClientSide();

    public void setClientSide(boolean var1);

    default public long Dc8fsXGD6vbHbSDxnnEbxtjJddhy5l8Q() {
        return SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98() - this.getAttackTime();
    }

    public void put(String var1, Object var2);

    public Object get(String var1);

    @Nullable
    public class_4050 getServerPose();

    public void setServerPose(class_4050 var1);

    public boolean isPainted();

    public void setPainted(boolean var1);
}

