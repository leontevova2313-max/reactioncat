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
import org.phobos.secure.233YlkA2dSoXPmZOG4uyJFB5W5MKs63U.OMLACnsjCGuV4O1gdwuEYyWZyjWMDypM;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.hhxbqRH8gqC09X9oj8RMCC4Uw2LdVzN3;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.eiydFjP7n1oxGua1krENv2V2LZy7fa6E;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm._0aSVipnCdIR8q0cL2kjoViaSmWoHEjx3;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.M9MS0QOiO4J5cDQURmO9aA3JC1LmDn9H;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.ZUelQ3EoFX5eaU2mqMNJ8pccKFoHkHdy;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.tCNcC22vA4HB2C2ka4JFfgxFOaIHakN7;
import org.phobos.secure.l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf._68Upu2wJLRgGDpYo0dcpFZKlGEDMA33S;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd;
import org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf._3YRo7hVDqW87tDwIXyVKEuio38oDpELp;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.TW5EzfdeLVR1oWkyz7l6wUnVWSgNAjQX;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.phobos.secure.ulFKkKf3PI2HUx83QjvCny5RVdQ1JbCt._0odhL643IAlLG01QC2nMp8Yq6quEF5Ap;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.DfV2qwP8E895BoOqazSAWb3WrE10Ff6c;
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
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T,
EventSubscriber,
DfV2qwP8E895BoOqazSAWb3WrE10Ff6c {
    @Unique
    private OMLACnsjCGuV4O1gdwuEYyWZyjWMDypM simulation;
    @Unique
    private boolean dirty;
    @Unique
    private _3YRo7hVDqW87tDwIXyVKEuio38oDpELp lastPlayerAnimatorPosition;

    @Override
    public _3YRo7hVDqW87tDwIXyVKEuio38oDpELp V74CqzrIKhXZKgrrR53oZbWAGgADORjh() {
        return this.lastPlayerAnimatorPosition;
    }

    @Override
    public OMLACnsjCGuV4O1gdwuEYyWZyjWMDypM Ztd86GhIbbCo1rw4VnszPbMoolmwXE31() {
        return this.simulation;
    }

    @Unique
    private void travel(tCNcC22vA4HB2C2ka4JFfgxFOaIHakN7 event, CallbackInfo ci) {
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
        this.invoke(new _0aSVipnCdIR8q0cL2kjoViaSmWoHEjx3(), ci);
    }

    @Inject(method={"getBlockInteractionRange"}, at={@At(value="RETURN")}, cancellable=true)
    public void interactionRangeHook(CallbackInfoReturnable<Double> cir) {
        MixinPlayerEntity o = this;
        class_1657 entity = (class_1657)o;
        if (!entity.method_7340()) {
            return;
        }
        cir.setReturnValue((Object)_68Upu2wJLRgGDpYo0dcpFZKlGEDMA33S.P0xFXTUvDPWYGgXB2ypH2mdI8uAN47OO((Double)cir.getReturnValue()));
    }

    @Inject(method={"updateCapeAngles"}, at={@At(value="HEAD")})
    private void moveCloakUpdate(CallbackInfo info) {
        class_1657 class_16572 = (class_1657)this;
        if (class_16572 instanceof class_742) {
            class_742 player = (class_742)class_16572;
            this.XS64v7YgMRfPZc1XSEljhiWmfu4InR8X(16);
            hhxbqRH8gqC09X9oj8RMCC4Uw2LdVzN3 playerDelegate = new hhxbqRH8gqC09X9oj8RMCC4Uw2LdVzN3(player);
            if (this.dirty) {
                this.dirty = false;
                this.simulation.puaWi15IwqbMJHFXs14f9IhPSjiefaTH(new _3YRo7hVDqW87tDwIXyVKEuio38oDpELp(1.0f, 1.0f, 0.0f));
                for (int i = 0; i < 5; ++i) {
                    this.Jagic2ehSizRNkB1MQ3QhtIUZdsgJCXz(playerDelegate);
                }
            }
            this.Jagic2ehSizRNkB1MQ3QhtIUZdsgJCXz(playerDelegate);
        }
    }

    @ModifyExpressionValue(method={"attack"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getYaw()F")})
    private float attackHook(float original) {
        ZUelQ3EoFX5eaU2mqMNJ8pccKFoHkHdy event = this.invoke(new ZUelQ3EoFX5eaU2mqMNJ8pccKFoHkHdy(original));
        return event.HQPLUvnwgduGUYx74WNj0hXBta85t5ww();
    }

    @Redirect(method={"dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/ItemEntity;"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;swingHand(Lnet/minecraft/util/Hand;)V"))
    private void dropItemHook(class_1657 player, class_1268 hand) {
        _0odhL643IAlLG01QC2nMp8Yq6quEF5Ap event = this.invoke(new _0odhL643IAlLG01QC2nMp8Yq6quEF5Ap());
        if (event.isCancelled()) {
            return;
        }
        player.method_6104(hand);
    }

    @Override
    public void gKYHWWAq4GneEv6r7EEiIDTB0qAu96Di(OMLACnsjCGuV4O1gdwuEYyWZyjWMDypM simulation) {
        this.simulation = simulation;
    }

    @ModifyReturnValue(method={"getDisplayName"}, at={@At(value="RETURN")})
    public class_2561 prependTier(class_2561 original) {
        if (cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            class_1657 self = (class_1657)this;
            return F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ.KFdiYifp5hcp8zQrxjtw3zssvgICqxeF(self, original);
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
        return GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY.AnLYQDyE3Q0pWRrT2sU4WnVqNHbxU9Tw(original);
    }

    @Inject(method={"getEntityInteractionRange"}, at={@At(value="RETURN")}, cancellable=true)
    public void entityInteractionRangeHook(CallbackInfoReturnable<Double> cir) {
        MixinPlayerEntity o = this;
        class_1657 entity = (class_1657)o;
        if (!entity.method_7340()) {
            return;
        }
        cir.setReturnValue((Object)_68Upu2wJLRgGDpYo0dcpFZKlGEDMA33S.P0xFXTUvDPWYGgXB2ypH2mdI8uAN47OO((Double)cir.getReturnValue()));
    }

    @Override
    public void JqcMReFw8eeWDKoNL2pP7pmUbi32JEjH(_3YRo7hVDqW87tDwIXyVKEuio38oDpELp lastPlayerAnimatorPosition) {
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

