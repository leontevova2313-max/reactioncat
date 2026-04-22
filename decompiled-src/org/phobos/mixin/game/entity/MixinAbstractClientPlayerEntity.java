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
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.fXD1v4pgqDShWjaDdsIAShF952EpKYKp;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.QyZ5YcSjEI3UDoCrv0zVhytBdJgjDPKE;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ.v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV;
import org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ._7dPv2JCRgwVxOAah6jpoZhp91XnDTRDf;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.Wsafkpz6daKMV5dmmJv1iWqXD7boHROb;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.ZXwmCfEFj3YKBWmDCJZ6rhLOuqh12lGO;
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
    private final aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r entityData;
    @Unique
    private final ZXwmCfEFj3YKBWmDCJZ6rhLOuqh12lGO movementModel;
    @Unique
    private final Wsafkpz6daKMV5dmmJv1iWqXD7boHROb[] predictions = new Wsafkpz6daKMV5dmmJv1iWqXD7boHROb[7];
    @Unique
    private final v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV history;
    @Unique
    private int UnIJ6jRElQBjOSXROg7b4HHlGSatksRg;

    @Inject(method={"getSkinTextures"}, at={@At(value="HEAD")}, cancellable=true)
    private void getSkinTexturesHook(CallbackInfoReturnable<class_8685> cir) {
        zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv fakePlayer;
        MixinAbstractClientPlayerEntity mixinAbstractClientPlayerEntity = this;
        if (mixinAbstractClientPlayerEntity instanceof zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv && (fakePlayer = (zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv)((Object)mixinAbstractClientPlayerEntity)).z7XshxyBnGYZqiCwr6joUQ1hZ8ZkHYPG() != null) {
            cir.setReturnValue((Object)fakePlayer.z7XshxyBnGYZqiCwr6joUQ1hZ8ZkHYPG());
        }
    }

    @Override
    public aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r getEntityData() {
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
        if (MixinAbstractClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null || !QyZ5YcSjEI3UDoCrv0zVhytBdJgjDPKE.d77jHtmtjEcZaX8VcNg7n9skOp8U5L3R().cfr_renamed_7()) {
            return;
        }
        class_1297 entity = (class_1297)this;
        if (entity instanceof class_1657 && ((player = (class_1657)entity).method_7337() || player.method_7325())) {
            this.history.clear();
            return;
        }
        if (entity.method_5858((class_1297)MixinAbstractClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) > _7dPv2JCRgwVxOAah6jpoZhp91XnDTRDf.srvk1zlVYxEOlApma0MJlyjkpcqN9jKb) {
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
    public v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV getHistory() {
        return this.history;
    }

    @Override
    public Wsafkpz6daKMV5dmmJv1iWqXD7boHROb[] getPredictions() {
        return this.predictions;
    }

    @Override
    public ZXwmCfEFj3YKBWmDCJZ6rhLOuqh12lGO getMovementModel() {
        return this.movementModel;
    }

    public MixinAbstractClientPlayerEntity() {
        this.movementModel = new fXD1v4pgqDShWjaDdsIAShF952EpKYKp();
        this.history = new v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV(20);
        this.entityData = new aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r();
    }
}

