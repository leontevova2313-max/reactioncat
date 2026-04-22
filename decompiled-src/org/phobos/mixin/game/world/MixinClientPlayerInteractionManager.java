/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1109;
import net.minecraft.class_1113;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1735;
import net.minecraft.class_1922;
import net.minecraft.class_1934;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2498;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_2868;
import net.minecraft.class_310;
import net.minecraft.class_3419;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_634;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_7204;
import net.minecraft.class_746;
import org.earthhack.ducks.IClientPlayerInteractionManager;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.PbYYzaXWL1NAzVgl8omTJBealk0ckocH;
import org.phobos.secure.233YlkA2dSoXPmZOG4uyJFB5W5MKs63U.TrhUPtklcVeA5ikV3vvCNYCjOJhipOZL;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.xRByCHocHbbXW9I2yXdeM2bAYjBPitfI;
import org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM.B0RlYqqZB6QHXnjvEL7wLB8EyEY38sNQ;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.Cpr4daoM3vfAQRmwXdNMc8se6aTxolNT;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.Y1MIRYxr6msp3xqD15cOIDtVrniQoF3s;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.QOSDKHWsVmRlBTPlsRmDD9evyLzwU5zw;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.RcZKbaEMMe1sq0sQQR2wU4K1KWPZnoCs;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.AdkJSt61vKWY2gYoglBrGsNsEgA3qch1;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ._8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_636.class})
public abstract class MixinClientPlayerInteractionManager
implements IClientPlayerInteractionManager,
EventSubscriber {
    @Shadow
    private class_1934 field_3719;
    @Shadow
    private float field_3715;
    @Shadow
    private boolean field_3717;
    @Shadow
    @Final
    private class_634 field_3720;
    @Shadow
    @Final
    private class_310 field_3712;
    @Shadow
    private int field_3721;
    @Shadow
    public class_2338 field_3714;
    @Shadow
    private float field_3713;
    @Shadow
    private int field_3716;

    @Shadow
    protected abstract void method_41931(class_638 var1, class_7204 var2);

    @Inject(method={"attackEntity"}, at={@At(value="HEAD")})
    private void attackHookPre(class_1657 player, class_1297 target, CallbackInfo ci) {
        this.invoke(new PbYYzaXWL1NAzVgl8omTJBealk0ckocH(target), ci);
    }

    @Shadow
    public abstract boolean method_2899(class_2338 var1);

    @Inject(method={"interactBlock"}, at={@At(value="HEAD")}, cancellable=true)
    public void interactHook(class_746 player, class_1268 hand, class_3965 bhr, CallbackInfoReturnable<class_1269> cir) {
        xRByCHocHbbXW9I2yXdeM2bAYjBPitfI event = this.invoke(new xRByCHocHbbXW9I2yXdeM2bAYjBPitfI(bhr, player.method_5998(hand)));
        if (event.isCancelled()) {
            cir.setReturnValue((Object)class_1269.field_5814);
        }
    }

    @Shadow
    public abstract void method_2911();

    @Shadow
    public abstract boolean method_2910(class_2338 var1, class_2350 var2);

    @Shadow
    protected abstract boolean method_2922(class_2338 var1);

    @Inject(method={"updateBlockBreakingProgress"}, at={@At(value="HEAD")}, cancellable=true)
    public void updateBlockBreakingProgress(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
        RcZKbaEMMe1sq0sQQR2wU4K1KWPZnoCs event = this.invoke(new RcZKbaEMMe1sq0sQQR2wU4K1KWPZnoCs(pos, direction));
        if (!event.isCancelled()) {
            return;
        }
        this.field_3717 = false;
        cir.setReturnValue((Object)true);
    }

    @Inject(method={"syncSelectedSlot"}, at={@At(value="HEAD")}, cancellable=true)
    public final void syncSelectedSlot(CallbackInfo ci) {
        ci.cancel();
        if (this.field_3712.field_1724 == null) {
            return;
        }
        int slot = _8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.anAutf67qHXPVFTTrqCMYiqVRzqqLceW().jocwzJWh6tJXAdw1100G6sI3lIu04WwF();
        if (slot != this.field_3721) {
            int lastSlot = this.field_3721;
            this.field_3721 = slot;
            this.field_3720.method_52787((class_2596)new class_2868(this.field_3721));
            this.invoke(new Cpr4daoM3vfAQRmwXdNMc8se6aTxolNT(this.OglrmbqdY8Y5MGj7fOc0RFPPYv6ictKO(lastSlot), this.OglrmbqdY8Y5MGj7fOc0RFPPYv6ictKO(slot)));
        }
    }

    @Inject(method={"cancelBlockBreaking"}, at={@At(value="HEAD")}, cancellable=true)
    public void cancelBlockBreaking(CallbackInfo ci) {
        this.invoke(new TrhUPtklcVeA5ikV3vvCNYCjOJhipOZL(), ci);
    }

    @Shadow
    public abstract int method_51888();

    @Inject(method={"attackEntity"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;syncSelectedSlot()V", shift=At.Shift.AFTER)})
    private void attackHook(class_1657 player, class_1297 target, CallbackInfo ci) {
        this.invoke(new B0RlYqqZB6QHXnjvEL7wLB8EyEY38sNQ(target), ci);
    }

    @Inject(method={"breakBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void breakBlockHook(class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
        Y1MIRYxr6msp3xqD15cOIDtVrniQoF3s event = this.invoke(new Y1MIRYxr6msp3xqD15cOIDtVrniQoF3s(pos));
        if (event.isCancelled()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Override
    public boolean updateBreaking(class_2338 pos, class_2350 direction) {
        this.method_2911();
        if (this.field_3716 > 0) {
            --this.field_3716;
            return true;
        }
        if (this.field_3719.method_8386() && this.field_3712.field_1687.method_8621().method_11952(pos)) {
            this.field_3716 = 5;
            class_2680 blockState = this.field_3712.field_1687.method_8320(pos);
            this.field_3712.method_1577().method_4907(this.field_3712.field_1687, pos, blockState, 1.0f);
            this.method_41931(this.field_3712.field_1687, sequence -> {
                this.method_2899(pos);
                return new class_2846(class_2846.class_2847.field_12968, pos, direction, sequence);
            });
            return true;
        }
        if (!this.method_2922(pos)) {
            return this.method_2910(pos, direction);
        }
        class_2680 blockState = this.field_3712.field_1687.method_8320(pos);
        if (blockState.method_26215()) {
            this.field_3717 = false;
            return false;
        }
        this.field_3715 += blockState.method_26165((class_1657)this.field_3712.field_1724, (class_1922)this.field_3712.field_1724.method_37908(), pos);
        if (this.field_3713 % 4.0f == 0.0f) {
            class_2498 blockSoundGroup = blockState.method_26231();
            this.field_3712.method_1483().method_4873((class_1113)new class_1109(blockSoundGroup.method_10596(), class_3419.field_15245, (blockSoundGroup.method_10597() + 1.0f) / 8.0f, blockSoundGroup.method_10599() * 0.5f, class_1113.method_43221(), pos));
        }
        this.field_3713 += 1.0f;
        this.field_3712.method_1577().method_4907(this.field_3712.field_1687, pos, blockState, class_3532.method_15363((float)this.field_3715, (float)0.0f, (float)1.0f));
        if (this.field_3715 >= 1.0f) {
            this.field_3717 = false;
            this.method_41931(this.field_3712.field_1687, sequence -> {
                this.method_2899(pos);
                return new class_2846(class_2846.class_2847.field_12973, pos, direction, sequence);
            });
            this.field_3715 = 0.0f;
            this.field_3713 = 0.0f;
            this.field_3716 = 5;
        }
        this.field_3712.field_1687.method_8517(this.field_3712.field_1724.method_5628(), this.field_3714, this.method_51888());
        return true;
    }

    @Inject(method={"attackBlock"}, at={@At(value="HEAD")}, cancellable=true)
    public void attackBlock(class_2338 pos, class_2350 direction, CallbackInfoReturnable<Boolean> cir) {
        AdkJSt61vKWY2gYoglBrGsNsEgA3qch1 event = this.invoke(new AdkJSt61vKWY2gYoglBrGsNsEgA3qch1(pos, direction));
        if (event.isCancelled()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Unique
    private class_1735 OglrmbqdY8Y5MGj7fOc0RFPPYv6ictKO(int index) {
        int i = 36;
        while (true) {
            if (i >= 45) {
                throw new IllegalArgumentException("Index out of bounds: " + index);
            }
            assert (this.field_3712.field_1724 != null);
            class_1735 slot = this.field_3712.field_1724.field_7498.method_7611(i);
            if (slot.method_34266() == index) {
                return slot;
            }
            ++i;
        }
    }

    @Inject(method={"interactItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;syncSelectedSlot()V")}, cancellable=true)
    private void useItemHook(class_1657 player, class_1268 hand, CallbackInfoReturnable<class_1269> cir) {
        QOSDKHWsVmRlBTPlsRmDD9evyLzwU5zw event = this.invoke(new QOSDKHWsVmRlBTPlsRmDD9evyLzwU5zw(hand, player));
        if (event.isCancelled()) {
            cir.setReturnValue((Object)class_1269.field_5814);
        }
    }
}

