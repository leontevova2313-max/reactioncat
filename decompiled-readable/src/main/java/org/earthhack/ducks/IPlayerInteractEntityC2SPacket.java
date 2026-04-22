/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2824;

public interface IPlayerInteractEntityC2SPacket {
    public class_1297 entity();

    public void setEntity(class_1297 var1);

    public boolean attack();

    public void setAttack(boolean var1);

    public int getEntityId();

    public class_2824.class_5906 getType();

    default public class_1297 getEntityById(class_1937 world) {
        return world.method_8469(this.getEntityId());
    }
}

