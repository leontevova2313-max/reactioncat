/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.interfaces;

import net.minecraft.class_1799;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_759.class})
public interface IHeldItemRenderer {
    @Accessor(value="equipProgressMainHand")
    public void setEquipProgressMainHand(float var1);

    @Accessor(value="equipProgressOffHand")
    public float getEquipProgressOffHand();

    @Accessor(value="mainHand")
    public void setMainHand(class_1799 var1);

    @Accessor(value="offHand")
    public void setOffHand(class_1799 var1);

    @Accessor(value="equipProgressOffHand")
    public void setEquipProgressOffHand(float var1);

    @Accessor(value="equipProgressMainHand")
    public float getEquipProgressMainHand();
}

