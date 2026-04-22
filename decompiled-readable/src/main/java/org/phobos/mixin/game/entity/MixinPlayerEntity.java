/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.class_1268;
import net.minecraft.class_1313;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_4048;
import net.minecraft.class_4050;
import net.minecraft.class_742;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.mixin.game.entity.MixinLivingEntity;
import org.phobos.secure.group004.SecureInterface0006;
import org.phobos.secure.group009.SecureClass0140;
import org.phobos.secure.group007.gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt;
import org.phobos.secure.group032.eiydFjP7n1oxGua1krENv2V2LZy7fa6E;
import org.phobos.secure.group034.SecureClass0596;
import org.phobos.secure.group035.SecureClass0617;
import org.phobos.secure.group035.M9MS0QOiO4J5cDQURmO9aA3JC1LmDn9H;
import org.phobos.secure.group023.SecureClass0402;
import org.phobos.secure.group030.SecureClass0533;
import org.phobos.secure.group036.ReachModule;
import org.phobos.secure.group042.GameTiersModule;
import org.phobos.secure.group045.SecureClass0795;
import org.phobos.secure.group046.TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX;
import org.phobos.secure.group054.SecureClass0981;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1015;
import org.phobos.secure.group059.SecureInterface0139;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1657.class})
public abstract class MixinPlayerEntity
extends MixinLivingEntity
implements SecureInterface0134,
EventSubscriber,
SecureInterface0139 {
    @Unique
    private SecureInterface0006 simulation;
    @Unique
    private boolean dirty;
    @Unique
    private SecureClass0795 lastPlayerAnimatorPosition;

    @Override
    public SecureClass0795 V74CqzrIKhXZKgrrR53oZbWAGgADORjh() {
        return this.lastPlayerAnimatorPosition;
    }

    @Override
    public SecureInterface0006 Ztd86GhIbbCo1rw4VnszPbMoolmwXE31() {
        return this.simulation;
    }

    @Unique
    private void travel(SecureClass0533 event, CallbackInfo ci) {
        if (event.isCancelled() && MixinPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null) {
            MixinPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_5784(class_1313.field_6308, MixinPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_18798());
            ci.cancel();
        }
    }

    @Inject(method={"travel"}, at={@At(value="RETURN")}, cancellable=true)
    private void travelHook2(class_243 vec3d, CallbackInfo ci) {
        if (!this.method_7340()) {
            return;
        }
        this.travel(this.invoke(new eiydFjP7n1oxGua1krENv2V2LZy7fa6E(vec3d)), ci);
    }

    @Inject(method={"getBaseDimensions"}, at={@At(value="HEAD")}, cancellable=true)
    private void getBaseDimensionsHook(class_4050 pose, CallbackInfoReturnable<class_4048> cir) {
        if (!class_4050.field_18081.equals((Object)pose)) {
            return;
        }
        gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.lO4TD1kZXu3gwIykZk0IOAqOO9L96yBn(arg_0 -> cir.setReturnValue(arg_0));
    }

    @Inject(method={"travel"}, at={@At(value="HEAD")}, cancellable=true)
    private void travelHook1(class_243 vec3d, CallbackInfo ci) {
        if (!this.method_7340()) {
            return;
        }
        this.travel(this.invoke(new M9MS0QOiO4J5cDQURmO9aA3JC1LmDn9H(vec3d)), ci);
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")}, cancellable=true)
    private void jumpHook(CallbackInfo ci) {
        if (!this.method_7340()) {
            return;
        }
        this.invoke(new SecureClass0596(), ci);
    }

    @Inject(method={"getBlockInteractionRange"}, at={@At(value="RETURN")}, cancellable=true)
    public void interactionRangeHook(CallbackInfoReturnable<Double> cir) {
        MixinPlayerEntity o = this;
        class_1657 entity = (class_1657)o;
        if (!entity.method_7340()) {
            return;
        }
        cir.setReturnValue((Object)ReachModule.P0xFXTUvDPWYGgXB2ypH2mdI8uAN47OO((Double)cir.getReturnValue()));
    }

    @Inject(method={"updateCapeAngles"}, at={@At(value="HEAD")})
    private void moveCloakUpdate(CallbackInfo info) {
        class_1657 class_16572 = (class_1657)this;
        if (class_16572 instanceof class_742) {
            class_742 player = (class_742)class_16572;
            this.XS64v7YgMRfPZc1XSEljhiWmfu4InR8X(16);
            SecureClass0140 playerDelegate = new SecureClass0140(player);
            if (this.dirty) {
                this.dirty = false;
                this.simulation.puaWi15IwqbMJHFXs14f9IhPSjiefaTH(new SecureClass0795(1.0f, 1.0f, 0.0f));
                for (int i = 0; i < 5; ++i) {
                    this.Jagic2ehSizRNkB1MQ3QhtIUZdsgJCXz(playerDelegate);
                }
            }
            this.Jagic2ehSizRNkB1MQ3QhtIUZdsgJCXz(playerDelegate);
        }
    }

    @ModifyExpressionValue(method={"attack"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getYaw()F")})
    private float attackHook(float original) {
        SecureClass0402 event = this.invoke(new SecureClass0402(original));
        return event.HQPLUvnwgduGUYx74WNj0hXBta85t5ww();
    }

    @Redirect(method={"dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/ItemEntity;"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;swingHand(Lnet/minecraft/util/Hand;)V"))
    private void dropItemHook(class_1657 player, class_1268 hand) {
        SecureClass1015 event = this.invoke(new SecureClass1015());
        if (event.isCancelled()) {
            return;
        }
        player.method_6104(hand);
    }

    @Override
    public void gKYHWWAq4GneEv6r7EEiIDTB0qAu96Di(SecureInterface0006 simulation) {
        this.simulation = simulation;
    }

    @ModifyReturnValue(method={"getDisplayName"}, at={@At(value="RETURN")})
    public class_2561 prependTier(class_2561 original) {
        if (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            class_1657 self = (class_1657)this;
            return SecureClass0617.KFdiYifp5hcp8zQrxjtw3zssvgICqxeF(self, original);
        }
        return original;
    }

    @Shadow
    public abstract float method_7261(float var1);

    @ModifyExpressionValue(method={"adjustMovementForSneaking"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;clipAtLedge()Z")})
    private boolean clipAtLedgeHook(boolean original) {
        if (!this.method_7340()) {
            return original;
        }
        return SecureClass0981.AnLYQDyE3Q0pWRrT2sU4WnVqNHbxU9Tw(original);
    }

    @Inject(method={"getEntityInteractionRange"}, at={@At(value="RETURN")}, cancellable=true)
    public void entityInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
        MixinPlayerEntity o = this;
        class_1657 entity = (class_1657)o;
        if (!entity.method_7340()) {
            return;
        }
        cir.setReturnValue((Object)ReachModule.P0xFXTUvDPWYGgXB2ypH2mdI8uAN47OO((Double)cir.getReturnValue()));
    }

    @Override
    public void JqcMReFw8eeWDKoNL2pP7pmUbi32JEjH(SecureClass0795 lastPlayerAnimatorPosition) {
        this.lastPlayerAnimatorPosition = lastPlayerAnimatorPosition;
    }

    @Override
    public void rlZIqKOes9XRmqaRvdusH1Jk90M6CdvH() {
        this.dirty = true;
    }

    @Redirect(method={"attack"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V", ordinal=0))
    private void attackHook1(class_1657 player, class_243 velocity) {
        TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX event;
        if (player.method_7340() && (event = this.invoke(new TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX())).isCancelled()) {
            return;
        }
        player.method_18799(velocity);
    }

    @Shadow
    public abstract boolean method_7340();

    @Redirect(method={"attack"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;setSprinting(Z)V", ordinal=0))
    private void attackHook2(class_1657 player, boolean sprint) {
        TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX event;
        if (player.method_7340() && (event = this.invoke(new TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX())).isCancelled()) {
            return;
        }
        player.method_5728(sprint);
    }
}

