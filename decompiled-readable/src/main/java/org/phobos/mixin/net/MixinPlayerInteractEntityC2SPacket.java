/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import net.minecraft.class_1297;
import net.minecraft.class_2824;
import org.earthhack.ducks.IPlayerInteractEntityC2SPacket;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={class_2824.class})
public abstract class MixinPlayerInteractEntityC2SPacket
implements IPlayerInteractEntityC2SPacket {
    @Unique
    private class_1297 entity;
    @Shadow
    @Final
    private int field_12870;
    @Unique
    private boolean attack;
    @Shadow
    @Final
    private class_2824.class_5906 field_12871;

    @Override
    public boolean attack() {
        return this.attack;
    }

    @Override
    public void setEntity(class_1297 entity) {
        this.entity = entity;
    }

    @Override
    public void setAttack(boolean attack) {
        this.attack = attack;
    }

    @Override
    public int getEntityId() {
        return this.field_12870;
    }

    @Override
    public class_1297 entity() {
        return this.entity;
    }

    @Inject(method={"attack"}, at={@At(value="RETURN")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private static void attackPacket(class_1297 entity, boolean playerSneaking, CallbackInfoReturnable<class_2824> cir) {
        class_2824 packet = (class_2824)cir.getReturnValue();
        if (packet != null) {
            ((IPlayerInteractEntityC2SPacket)packet).setAttack(true);
            ((IPlayerInteractEntityC2SPacket)packet).setEntity(entity);
        }
    }

    @Override
    public class_2824.class_5906 getType() {
        return this.field_12871;
    }
}

