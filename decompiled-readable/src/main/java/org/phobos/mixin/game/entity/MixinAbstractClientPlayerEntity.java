/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.earthhack.ducks.IAbstractClientPlayerEntity;
import org.earthhack.ducks.IDamageProtectionEntity;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.mixin.game.entity.MixinLivingEntity;
import org.phobos.secure.group009.SecureClass0137;
import org.phobos.secure.group011.EngineModule;
import org.phobos.secure.group011.SecureClass0171;
import org.phobos.secure.group024.SecureClass0405;
import org.phobos.secure.group034.Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn;
import org.phobos.secure.group048.SecureClass0873;
import org.phobos.secure.group052.SecureClass0941;
import org.phobos.secure.group054.SecureClass0991;
import org.phobos.secure.group059.SecureInterface0141;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_742.class})
public abstract class MixinAbstractClientPlayerEntity
extends MixinLivingEntity
implements EventSubscriber,
IDamageProtectionEntity,
IAbstractClientPlayerEntity {
    @Unique
    private int jumpScore;
    @Unique
    private final SecureClass0405 entityData;
    @Unique
    private final SecureInterface0141 movementModel;
    @Unique
    private final SecureClass0991[] predictions = new SecureClass0991[7];
    @Unique
    private final SecureClass0873 history;
    @Unique
    private int UnIJ6jRElQBjOSXROg7b4HHlGSatksRg;

    @Inject(method={"getSkinTextures"}, at={@At(value="HEAD")}, cancellable=true)
    private void getSkinTexturesHook(CallbackInfoReturnable<class_8685> cir) {
        SecureClass0171 fakePlayer;
        MixinAbstractClientPlayerEntity mixinAbstractClientPlayerEntity = this;
        if (mixinAbstractClientPlayerEntity instanceof SecureClass0171 && (fakePlayer = (SecureClass0171)((Object)mixinAbstractClientPlayerEntity)).z7XshxyBnGYZqiCwr6joUQ1hZ8ZkHYPG() != null) {
            cir.setReturnValue((Object)fakePlayer.z7XshxyBnGYZqiCwr6joUQ1hZ8ZkHYPG());
        }
    }

    @Override
    public SecureClass0405 getEntityData() {
        return this.entityData;
    }

    @Override
    public int getJumpScore() {
        return this.jumpScore;
    }

    @Inject(method={"getFovMultiplier"}, at={@At(value="HEAD")}, cancellable=true)
    private void fovHook(CallbackInfoReturnable<Float> cir) {
        Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn event = this.invoke(new Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn());
        if (event.isCancelled()) {
            cir.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }

    @Override
    public void setJumpScore(int score) {
        this.jumpScore = score;
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void tickHook(CallbackInfo ci) {
        class_1657 player;
        if (MixinAbstractClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null || !EngineModule.d77jHtmtjEcZaX8VcNg7n9skOp8U5L3R().cfr_renamed_7()) {
            return;
        }
        class_1297 entity = (class_1297)this;
        if (entity instanceof class_1657 && ((player = (class_1657)entity).method_7337() || player.method_7325())) {
            this.history.clear();
            return;
        }
        if (entity.method_5858((class_1297)MixinAbstractClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) > SecureClass0941.srvk1zlVYxEOlApma0MJlyjkpcqN9jKb) {
            this.history.clear();
            return;
        }
        this.history.fWeLZrXSPnWppN6ePZNCtIGPWRnR3aM3(entity);
    }

    @Override
    public void osaK4VvTbMAghRAvAu4tdaBs9dsmMR01(int damageProtection) {
        this.UnIJ6jRElQBjOSXROg7b4HHlGSatksRg = damageProtection;
    }

    @Override
    public int cfr_renamed_0() {
        return this.UnIJ6jRElQBjOSXROg7b4HHlGSatksRg;
    }

    @Override
    public void addJumpScore() {
        ++this.jumpScore;
    }

    @Override
    public SecureClass0873 getHistory() {
        return this.history;
    }

    @Override
    public SecureClass0991[] getPredictions() {
        return this.predictions;
    }

    @Override
    public SecureInterface0141 getMovementModel() {
        return this.movementModel;
    }

    public MixinAbstractClientPlayerEntity() {
        this.movementModel = new SecureClass0137();
        this.history = new SecureClass0873(20);
        this.entityData = new SecureClass0405();
    }
}

