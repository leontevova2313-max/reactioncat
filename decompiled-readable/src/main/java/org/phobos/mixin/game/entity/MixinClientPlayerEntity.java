/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1297;
import net.minecraft.class_1313;
import net.minecraft.class_1799;
import net.minecraft.class_2394;
import net.minecraft.class_2398;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2848;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_437;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.earthhack.ducks.IClientPlayerEntity;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group007.PortalsModule;
import org.phobos.secure.group017.SprintModule;
import org.phobos.secure.group027.SecureClass0476;
import org.phobos.secure.group027.SecureClass0466;
import org.phobos.secure.group034.SecureClass0601;
import org.phobos.secure.group035.SecureClass0621;
import org.phobos.secure.group041.SecureClass0722;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group055.SecureClass1008;
import org.phobos.secure.group063.ParticlesModule;
import org.phobos.secure.group021.DisablerModule;
import org.phobos.secure.group022.SecureClass0376;
import org.phobos.secure.group030.SecureClass0530;
import org.phobos.secure.group054.SecureClass0968;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.NoPushModule;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_746.class})
public abstract class MixinClientPlayerEntity
extends class_742
implements EventSubscriber,
IClientPlayerEntity,
SecureInterface0134 {
    @Shadow
    public boolean field_3919;
    @Shadow
    public boolean field_3927;
    @Shadow
    public double field_3926;
    @Unique
    private int WvA9m4by0IPDsB3cxdLuA5ZvSRV8CQ0r;
    @Shadow
    public double field_3924;
    @Shadow
    public boolean field_3936;
    @Shadow
    public boolean field_3920;
    @Shadow
    @Final
    public class_634 field_3944;
    @Shadow
    @Final
    public class_310 field_3937;
    @Shadow
    public float field_3941;
    @Shadow
    public float field_3925;
    @Shadow
    public int field_3923;
    @Shadow
    public class_744 field_3913;
    @Shadow
    public double field_3940;
    @Unique
    private int Hs6Q8bhfJvpffjUoVHSMCmVacD5tUhSD;

    @ModifyArg(method={"move"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/AbstractClientPlayerEntity;move(Lnet/minecraft/entity/MovementType;Lnet/minecraft/util/math/Vec3d;)V"), index=1)
    private class_243 moveHook1(class_243 vec) {
        return ((SecureClass0376)this.invoke(new SecureClass0376(vec, false))).ZJqwE4dXAuifKHTmWA0Kq1gzQwVqIwvw();
    }

    @Override
    public void invokeCrashInternal() {
        throw new RuntimeException("[Phobos] Force crash!");
    }

    @Override
    public int GFohAU5AwqrYRLuq9JMja2RxLpEAy3Lo() {
        return this.WvA9m4by0IPDsB3cxdLuA5ZvSRV8CQ0r;
    }

    @Inject(method={"closeScreen"}, at={@At(value="HEAD")})
    private void closeHook(CallbackInfo ci) {
        class_437 class_4372 = MixinClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1755;
        if (class_4372 instanceof SecureClass0870) {
            SecureClass0870 themedScreen = (SecureClass0870)class_4372;
            themedScreen.method_25419();
        }
    }

    @ModifyExpressionValue(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/option/KeyBinding;isPressed()Z")})
    private boolean tickMovementHook(boolean original) {
        return ((SecureClass1008)this.invoke(new SecureClass1008(original))).cfr_renamed_8();
    }

    @Inject(method={"addEnchantedHitParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void addEnchantedHitParticlesHook(class_1297 target, CallbackInfo ci) {
        ci.cancel();
        int multiplier = ParticlesModule.cfr_renamed_9();
        if (multiplier == 0) {
            return;
        }
        int i = 0;
        while (i < multiplier) {
            this.field_3937.field_1713.method_3061(target, (class_2394)class_2398.field_11208);
            ++i;
        }
        return;
    }

    @ModifyExpressionValue(method={"canStartSprinting"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isWalking()Z")})
    private boolean canStartSprintingHook(boolean original) {
        if (!SprintModule.hEBptiDUPTkp9CXuNQ16yMCezYVB2nEp()) {
            return original;
        }
        float forwards = Math.abs(this.field_3913.field_3907);
        float sideways = Math.abs(this.field_3913.field_3905);
        return this.method_5869() ? forwards > 1.0E-5f || sideways > 1.0E-5f : (double)forwards > 0.8 || (double)sideways > 0.8;
    }

    @Shadow
    public abstract boolean method_3134();

    public MixinClientPlayerEntity(class_638 world, GameProfile profile) {
        super(world, profile);
        throw new IllegalStateException("MixinClientPlayerEntity constructor called!");
    }

    @Shadow
    public abstract void method_46742();

    @Inject(method={"pushOutOfBlocks"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPushOutOfBlocksHook(double x, double y, CallbackInfo ci) {
        if (!NoPushModule.MwBxTEvwUoMGCMcv17UhagMSYW8qIgvb()) {
            return;
        }
        ci.cancel();
    }

    @Override
    public int getGroundTicks() {
        return this.Hs6Q8bhfJvpffjUoVHSMCmVacD5tUhSD;
    }

    @Inject(method={"tick"}, at={@At(value="TAIL")})
    private void playerTickHook2(CallbackInfo ci) {
    }

    @Inject(method={"dropSelectedItem"}, at={@At(value="HEAD")})
    private void onDropSelectedItem(boolean all, CallbackInfoReturnable<Boolean> cir) {
        class_1799 stack = this.method_31548().method_37417(all);
        this.invoke(new SecureClass0968(stack));
    }

    @Inject(method={"move"}, at={@At(value="RETURN")})
    private void moveHook(class_1313 movementType, class_243 movement, CallbackInfo ci) {
        if (this.method_24828()) {
            ++this.Hs6Q8bhfJvpffjUoVHSMCmVacD5tUhSD;
            this.WvA9m4by0IPDsB3cxdLuA5ZvSRV8CQ0r = 0;
        } else {
            this.Hs6Q8bhfJvpffjUoVHSMCmVacD5tUhSD = 0;
            ++this.WvA9m4by0IPDsB3cxdLuA5ZvSRV8CQ0r;
        }
    }

    @ModifyExpressionValue(method={"tickNausea"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/Screen;shouldPause()Z")})
    private boolean tickNauseaHook(boolean original) {
        if (!PortalsModule.yCBZZ9xnVMPmButFZJL2vBewKlwsnQb1()) {
            return true;
        }
        return original;
    }

    @Inject(method={"canStartSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    private void canStartSprintingHook(CallbackInfoReturnable<Boolean> cir) {
        if (MixinClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return;
        }
        if (!SecureClass0722.NSlM0s5P2OtWgxzkW0kXhBLW6JKg36Ng(MixinClientPlayerEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724)) {
            return;
        }
        cir.setReturnValue((Object)false);
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")}, cancellable=true)
    private void playerTickHook1(CallbackInfo ci) {
        this.invoke(new SecureClass0476(), ci);
    }

    @ModifyExpressionValue(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/input/Input;hasForwardMovement()Z")})
    private boolean modifyMovement(boolean original) {
        if (!SprintModule.hEBptiDUPTkp9CXuNQ16yMCezYVB2nEp()) {
            return original;
        }
        return Math.abs(this.field_3913.field_3907) > 1.0E-5f || Math.abs(this.field_3913.field_3905) > 1.0E-5f;
    }

    @Shadow
    public abstract boolean method_5715();

    @Inject(method={"addCritParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void addCritParticlesHook(class_1297 target, CallbackInfo ci) {
        ci.cancel();
        int multiplier = ParticlesModule.cfr_renamed_9();
        if (multiplier == 0) {
            return;
        }
        int i = 0;
        while (i < multiplier) {
            this.field_3937.field_1713.method_3061(target, (class_2394)class_2398.field_11205);
            ++i;
        }
        return;
    }

    @Override
    public void superTick() {
        super.method_5773();
    }

    @Shadow
    public abstract float method_5705(float var1);

    @Redirect(method={"tickMovement"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;hasVehicle()Z", ordinal=1))
    private boolean tickMovementHook(class_746 player) {
        SecureClass0601 event = (SecureClass0601)this.invoke(new SecureClass0601());
        if (event.isCancelled()) {
            return true;
        }
        return player.method_5765();
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendMovementPackets(CallbackInfo ci) {
        boolean sneaking;
        ci.cancel();
        SecureClass0466 event = (SecureClass0466)this.invoke(new SecureClass0466(this.method_23317(), this.method_23318(), this.method_23321(), this.method_24828(), this.method_36454(), this.method_36455()));
        if (event.isCancelled()) {
            return;
        }
        SecureClass0530 action = (SecureClass0530)this.invoke(new SecureClass0530(this.method_5624(), this.method_5715()));
        boolean sprinting = action.KkXpXoqmfKiK0fM5w2t0b0eIa8dyQI9B();
        if (sprinting != this.field_3919) {
            class_2848.class_2849 mode = sprinting ? class_2848.class_2849.field_12981 : class_2848.class_2849.field_12985;
            this.field_3944.method_52787((class_2596)new class_2848((class_1297)this, mode));
            this.field_3919 = sprinting;
        }
        if ((sneaking = action.AG36AeeyDlEKJKJEUK4pLggyozrVvya9()) != this.field_3936) {
            class_2848.class_2849 mode = sneaking ? class_2848.class_2849.field_12979 : class_2848.class_2849.field_12984;
            this.field_3944.method_52787((class_2596)new class_2848((class_1297)this, mode));
            this.field_3936 = sneaking;
        }
        if (this.method_3134()) {
            boolean bl3;
            float yaw = event.cENwMarLw4aCUeV0gI0nMf7qXuqbgWZz();
            float pitch = event.bsNeCdXxjbJJI6k5QBnRzIrFucCmvwdB();
            double x = event.kj0uTL3m9jhaDiPj4VJlr2DYpt5YknV5();
            double y = event.omX4GYwQzlvkGRzwJXCR7wd7n24dbCv3();
            double z = event.cfr_renamed_10();
            boolean onGround = event.XWCh1QFywsIbAVO3rXk1a42Mi6figSfC();
            float packetYaw = DisablerModule.MgO7DEg0gu8AW7X70ZRDASoDyv4mJYOg() ? yaw + 3.6E7f : yaw;
            double d = x - this.field_3926;
            double e = y - this.field_3940;
            double f = z - this.field_3924;
            double g = yaw - this.field_3941;
            double h = pitch - this.field_3925;
            ++this.field_3923;
            boolean bl2 = class_3532.method_41190((double)d, (double)e, (double)f) > class_3532.method_33723((double)2.0E-4) || this.field_3923 >= 20;
            boolean bl = bl3 = g != 0.0 || h != 0.0;
            if (this.method_5765()) {
                class_243 vec3d = this.method_18798();
                this.field_3944.method_52787((class_2596)new class_2828.class_2830(vec3d.field_1352, -999.0, vec3d.field_1350, packetYaw, pitch, onGround));
                bl2 = false;
            } else if (bl2 && bl3) {
                this.field_3944.method_52787((class_2596)new class_2828.class_2830(x, y, z, packetYaw, pitch, onGround));
            } else if (bl2) {
                this.field_3944.method_52787((class_2596)new class_2828.class_2829(x, y, z, onGround));
            } else if (bl3) {
                this.field_3944.method_52787((class_2596)new class_2828.class_2831(packetYaw, pitch, onGround));
            } else if (this.field_3920 != this.method_24828()) {
                this.field_3944.method_52787((class_2596)new class_2828.class_5911(onGround));
            }
            if (bl2) {
                this.field_3926 = x;
                this.field_3940 = y;
                this.field_3924 = z;
                this.field_3923 = 0;
            }
            if (bl3) {
                this.field_3941 = yaw;
                this.field_3925 = pitch;
            }
            this.field_3920 = onGround;
            this.field_3927 = (Boolean)this.field_3937.field_1690.method_42423().method_41753();
        }
        this.invoke(new SecureClass0621());
    }
}

