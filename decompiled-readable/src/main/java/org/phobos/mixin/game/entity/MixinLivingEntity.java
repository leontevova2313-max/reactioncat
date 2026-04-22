/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1268;
import net.minecraft.class_1282;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1324;
import net.minecraft.class_1432;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4174;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import org.earthhack.ducks.IDamageProtectionEntity;
import org.earthhack.ducks.ILivingEntity;
import org.earthhack.ducks.ITotemPoppingEntity;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.mixin.game.entity.MixinEntity;
import org.phobos.secure.group003.SecureClass0029;
import org.phobos.secure.group009.SecureClass0146;
import org.phobos.secure.group010.AntiLevitationModule;
import org.phobos.secure.group013.SecureClass0185;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.RotationsModule;
import org.phobos.secure.group017.CalculationsModule;
import org.phobos.secure.group019.ElytraFlyModule;
import org.phobos.secure.group029.SecureClass0506;
import org.phobos.secure.group033.SecureClass0580;
import org.phobos.secure.group033.oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf;
import org.phobos.secure.group033.SecureClass0593;
import org.phobos.secure.group034.SecureClass0606;
import org.phobos.secure.group041.SecureClass0714;
import org.phobos.secure.group048.iDcIB0RVD154XdSvuyYlKlF1DbSckbGv;
import org.phobos.secure.group057.AntiClimbModule;
import org.phobos.secure.group058.LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group030.SecureClass0525;
import org.phobos.secure.group031.SecureClass0556;
import org.phobos.secure.group040.SecureClass0704;
import org.phobos.secure.group040.SecureClass0700;
import org.phobos.secure.group054.SecureClass0976;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1309.class})
public abstract class MixinLivingEntity
extends MixinEntity
implements EventSubscriber,
IDamageProtectionEntity,
ITotemPoppingEntity,
ILivingEntity {
    @Unique
    private final SecureClass0377 rightLegPivotZAnimation;
    @Unique
    private final SecureClass0377 bodyPitchAnimation = new SecureClass0377();
    @Unique
    private float prevHeadPivotY;
    @Unique
    private final SecureClass0377 rightLegPivotYAnimation;
    @Unique
    private SecureClass0506 ghostModel;
    @Unique
    private float prevRightArmPivotY;
    @Unique
    private float prevLeftArimPitch;
    @Unique
    private float prevRightArmPitch;
    @Unique
    private final SecureClass0377 headPivotYAnimation;
    @Unique
    private float prevBodyPitch;
    @Unique
    private float prevLeftArmPivotY;
    @Unique
    private float prevLeftLegPivotY;
    @Unique
    private float prevBodyPivotY;
    @Unique
    private final SecureClass0377 leftArmPivotYAnimation;
    @Unique
    private final SecureClass0377 bodyPivotYAnimation;
    @Unique
    private float prevRightLegPivotZ;
    @Unique
    private float prevLeftLegPivotZ;
    @Unique
    private float prevRightLegPivotY;
    @Unique
    private final SecureClass0377 leftLegPivotYAnimation;
    @Unique
    private final SecureClass0377 leftLegPivotZAnimation;
    @Unique
    private boolean $sneaking;
    @Unique
    private float lastAttackCooldown;
    @Unique
    private int lastOffhandCount;
    @Unique
    private final SecureClass0377 rightArmPivotYAnimation;
    @Unique
    private class_1799 pktF9rFfj5JFV5oTNNkZ9OMNhZIp3eVu;
    @Unique
    private final SecureClass0704 sneakAnimations;
    @Unique
    private long lastLerp = 0L;
    @Unique
    private int lastMainhandCount;
    @Unique
    private class_1799 OqodmT846bkbMZ4kEXJIU1AR820gXCiA;
    @Unique
    private final SecureClass0377 FPX2uDXDChfZDf7626pQJiRmixdvbjY2;
    @Shadow
    private int field_6228;
    @Unique
    private boolean oldElytra;
    @Shadow
    protected int field_6273;
    @Unique
    private final SecureClass0377 rightArmPitchAnimation;
    @Unique
    private int UnIJ6jRElQBjOSXROg7b4HHlGSatksRg;
    @Shadow
    protected class_1799 field_6277;
    @Unique
    private final kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 lastTotemPop;
    @Unique
    private final SecureClass0377 globalAnimation;
    @Unique
    private final SecureClass0377 leftArmPitchAnimation;

    @Shadow
    public abstract boolean method_5643(class_1282 var1, float var2);

    @Override
    public void osaK4VvTbMAghRAvAu4tdaBs9dsmMR01(int damageProtection) {
        this.UnIJ6jRElQBjOSXROg7b4HHlGSatksRg = damageProtection;
    }

    @Shadow
    public abstract boolean method_6059(class_6880<class_1291> var1);

    @Shadow
    public abstract double method_45325(class_6880<class_1320> var1);

    public MixinLivingEntity() {
        this.rightLegPivotZAnimation = new SecureClass0377();
        this.leftLegPivotZAnimation = new SecureClass0377();
        this.rightLegPivotYAnimation = new SecureClass0377(12.0f, 12.0f);
        this.leftLegPivotYAnimation = new SecureClass0377(12.0f, 12.0f);
        this.headPivotYAnimation = new SecureClass0377();
        this.bodyPivotYAnimation = new SecureClass0377();
        this.leftArmPivotYAnimation = new SecureClass0377(2.0f, 2.0f);
        this.rightArmPivotYAnimation = new SecureClass0377(2.0f, 2.0f);
        this.rightArmPitchAnimation = new SecureClass0377(0.0f, 0.0f);
        this.leftArmPitchAnimation = new SecureClass0377(0.0f, 0.0f);
        this.globalAnimation = new SecureClass0377(0.0f, 0.0f);
        this.sneakAnimations = new SecureClass0704(this.bodyPitchAnimation, this.rightLegPivotZAnimation, this.leftLegPivotZAnimation, this.rightLegPivotYAnimation, this.leftLegPivotYAnimation, this.headPivotYAnimation, this.bodyPivotYAnimation, this.leftArmPivotYAnimation, this.rightArmPivotYAnimation, this.rightArmPitchAnimation, this.leftArmPitchAnimation);
        this.FPX2uDXDChfZDf7626pQJiRmixdvbjY2 = new SecureClass0377();
        this.lastTotemPop = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
    }

    @Override
    public void setLastMainhandStack(class_1799 stack) {
        this.OqodmT846bkbMZ4kEXJIU1AR820gXCiA = stack;
    }

    @Shadow
    @Nullable
    public abstract class_1293 method_6112(class_6880<class_1291> var1);

    @Shadow
    public abstract boolean method_35053();

    @Override
    public class_1799 OvIdOSBEVB7QrO8zg54Grdl01cHz1jVo() {
        return this.pktF9rFfj5JFV5oTNNkZ9OMNhZIp3eVu;
    }

    @Override
    public void setLastLerp(long time) {
        this.lastLerp = time;
    }

    @Override
    public void setLastOffhandStack(class_1799 stack) {
        this.pktF9rFfj5JFV5oTNNkZ9OMNhZIp3eVu = stack;
    }

    @Override
    public int getLastMainhandCount() {
        return this.lastMainhandCount;
    }

    @Override
    public void setLastMainhandCount(int count) {
        this.lastMainhandCount = count;
    }

    @Override
    public class_1799 qvWYd5cioN5ski3L3rgHm6MbdCNconzk() {
        return this.OqodmT846bkbMZ4kEXJIU1AR820gXCiA;
    }

    @Override
    public float getLastAttackCooldown() {
        return class_3532.method_15363((float)((this.lastAttackCooldown + 0.5f) / this.__getAttackCooldownProgressPerTick()), (float)0.0f, (float)1.0f);
    }

    @Override
    public int cfr_renamed_0() {
        return switch (CalculationsModule.ZRQzdvaPDLyHVr77Oy0VVQZFFZ1pUzc8()) {
            default -> throw new MatchException(null, null);
            case oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf.Normal, oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf.Enchants -> this.UnIJ6jRElQBjOSXROg7b4HHlGSatksRg;
            case oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf.Generic -> 32;
        };
    }

    @Shadow
    @Nullable
    public abstract class_1324 method_5996(class_6880<class_1320> var1);

    public kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 lastTotemPop() {
        return this.lastTotemPop;
    }

    @Shadow
    public abstract class_243 method_26318(class_243 var1, float var2);

    @Shadow
    public abstract float method_5705(float var1);

    @Unique
    private float __getAttackCooldownProgressPerTick() {
        return (float)(1.0 / this.method_45325((class_6880<class_1320>)class_5134.field_23723) * 20.0);
    }

    @Override
    public void setGhostModel(SecureClass0506 ghostModel) {
        this.ghostModel = ghostModel;
    }

    @Redirect(method={"jump"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getYaw()F"))
    private float jumpHook1(class_1309 instance) {
        SecureClass0976 event = this.invoke(new SecureClass0976(this.method_36454()));
        return event.nMMoPJXHxbsIsOOocc5lzXzssycQ7WgT();
    }

    @ModifyExpressionValue(method={"jump"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getJumpVelocity()F")})
    private float jumpHook(float original) {
        return this.invoke(new SecureClass0185(original)).EuYoz8tzAk43uSx9bwHApxrmTm1oXcsK();
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;hasStatusEffect(Lnet/minecraft/registry/entry/RegistryEntry;)Z"))
    private boolean travelHook1(class_1309 instance, class_6880<class_1291> effect) {
        if (effect != null && (effect.equals((Object)class_1294.field_5902) || effect.equals((Object)class_1294.field_5906)) && AntiLevitationModule.cfr_renamed_12()) {
            instance.field_6017 = 0.0f;
            return false;
        }
        return instance.method_6059(effect);
    }

    @Inject(method={"getStepHeight"}, at={@At(value="RETURN")}, cancellable=true)
    public void getStepHeightHook(CallbackInfoReturnable<Float> cir) {
        if (this == MixinLivingEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) {
            SecureClass0029 event = this.invoke(new SecureClass0029(((Float)cir.getReturnValue()).floatValue()));
            cir.setReturnValue((Object)Float.valueOf(event.cfr_renamed_13()));
        }
    }

    @Inject(method={"getHandSwingDuration"}, at={@At(value="RETURN")}, cancellable=true)
    private void swingSpeedHook(CallbackInfoReturnable<Integer> cir) {
        SecureClass0580 event = this.invoke(new SecureClass0580((class_1309)class_1309.class.cast(this), (Integer)cir.getReturnValue()));
        cir.setReturnValue((Object)event.NqwXClcCCGwxIxybB7M8wW71AJWlgdAd());
    }

    @Inject(method={"travel"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getVelocityAffectingPos()Lnet/minecraft/util/math/BlockPos;")}, cancellable=true)
    private void travelHook4(class_243 movementInput, CallbackInfo ci) {
        boolean bl;
        if (!AntiLevitationModule.IBxFTnLTdggfhrZcCrPp3iV1g9I0yOso()) {
            return;
        }
        ci.cancel();
        double d = this.method_56989();
        boolean bl2 = bl = this.method_18798().field_1351 <= 0.0;
        if (bl && this.method_6059((class_6880<class_1291>)class_1294.field_5906)) {
            d = Math.min(d, 0.01);
        }
        class_2338 blockPos = this.method_23314();
        float p = this.method_37908().method_8320(blockPos).method_26204().method_9499();
        float f = this.method_24828() ? p * 0.91f : 0.91f;
        class_243 vec3d6 = this.method_26318(movementInput, p);
        double q = vec3d6.field_1351;
        if (this.method_6059((class_6880<class_1291>)class_1294.field_5902)) {
            int input = AntiLevitationModule.cfr_renamed_14();
            switch (input) {
                case 1: {
                    q = (0.3 * (double)(this.method_6112((class_6880<class_1291>)class_1294.field_5902).method_5578() + 1) - vec3d6.field_1351) * 0.2;
                    break;
                }
                case -1: {
                    q = -(0.3 * (double)(this.method_6112((class_6880<class_1291>)class_1294.field_5902).method_5578() + 1) - vec3d6.field_1351) * 0.2;
                    break;
                }
                case 0: {
                    q = 0.0;
                    break;
                }
            }
        } else {
            q = this.method_37908().field_9236 && !this.method_37908().method_22340(blockPos) ? (this.method_23318() > (double)this.method_37908().method_31607() ? -0.1 : 0.0) : (q -= d);
        }
        if (this.method_35053()) {
            this.method_18800(vec3d6.field_1352, q, vec3d6.field_1350);
        } else {
            this.method_18800(vec3d6.field_1352 * (double)f, this instanceof class_1432 ? q * (double)f : q * (double)0.98f, vec3d6.field_1350 * (double)f);
        }
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;isFallFlying()Z"))
    private boolean travelHook(class_1309 instance) {
        return SecureClass0556.fCUev7dtJpWCMCfvfiNWKAXEd53FVwbI(instance);
    }

    @Inject(method={"isClimbing"}, at={@At(value="HEAD")}, cancellable=true)
    private void isClimbingHook(CallbackInfoReturnable<Boolean> cir) {
        if (AntiClimbModule.cfr_renamed_15()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Override
    public void setLastOffhandCount(int count) {
        this.lastOffhandCount = count;
    }

    @Inject(method={"updateTrackedPositionAndAngles"}, at={@At(value="HEAD")})
    private void trackedPositionUpdateHook(double x, double y, double z, float yaw, float pitch, int interpolationSteps, CallbackInfo ci) {
        this.invoke(new SecureClass0714((class_1309)class_1309.class.cast(this), x, y, z, yaw, pitch, this.lastLerp));
        this.lastLerp = SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98();
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getPitch()F"))
    private float travelHook2(class_1309 instance) {
        LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs rotation = SecureClass0700.FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm();
        if (!rotation.cfr_renamed_16() && RotationsModule.LyhipsDcSND2mt20iy06Gz5RoalgpLk2()) {
            return rotation.SfAOCZWjOxio7WWcx4VHvoxfiaar48V1();
        }
        return instance.method_36455();
    }

    @Override
    public SecureClass0506 getGhostModel() {
        return this.ghostModel;
    }

    @Inject(method={"clearActiveItem"}, at={@At(value="HEAD")})
    private void clearActiveItemHook(CallbackInfo ci) {
        if (!(this instanceof class_746)) {
            return;
        }
        this.invoke(new SecureClass0593(this.field_6277));
    }

    @Override
    public int getLastOffhandCount() {
        return this.lastOffhandCount;
    }

    @Inject(method={"isFallFlying"}, at={@At(value="TAIL")}, cancellable=true)
    private void isFallFlyingHook(CallbackInfoReturnable<Boolean> cir) {
        if (ElytraFlyModule.cfr_renamed_17()) {
            boolean elytra = (Boolean)cir.getReturnValue();
            if (this.oldElytra && !elytra) {
                cir.setReturnValue((Object)ElytraFlyModule.jbG8W28gzU0kdCliisouEPslb6LfD66m());
            }
            this.oldElytra = elytra;
        }
    }

    @Inject(method={"jump"}, at={@At(value="RETURN")})
    private void jumpHook2(CallbackInfo ci) {
        this.invoke(new iDcIB0RVD154XdSvuyYlKlF1DbSckbGv());
    }

    @Inject(method={"baseTick"}, at={@At(value="HEAD")})
    public void baseTickHook(CallbackInfo ci) {
        SecureClass0606 event = this.invoke(new SecureClass0606(this.field_6228));
        this.field_6228 = event.cfr_renamed_18();
    }

    @Inject(method={"swingHand(Lnet/minecraft/util/Hand;)V"}, at={@At(value="HEAD")})
    private void swingHandHook(class_1268 hand, CallbackInfo ci) {
        if (hand != class_1268.field_5808) {
            return;
        }
        this.lastAttackCooldown = this.field_6273;
    }

    @Inject(method={"eatFood"}, at={@At(value="HEAD")})
    private void eatFoodHook(class_1937 world, class_1799 stack, class_4174 foodComponent, CallbackInfoReturnable<class_1799> cir) {
        this.invoke(new SecureClass0146((class_1309)this, foodComponent, stack));
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"))
    private class_243 travelHook3(class_1309 instance) {
        LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs rotation = SecureClass0700.FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm();
        if (!rotation.cfr_renamed_16() && RotationsModule.LyhipsDcSND2mt20iy06Gz5RoalgpLk2()) {
            return rotation.WjVxiuc6QFRnGXPGp2cp2k8qugOPid4Z();
        }
        return instance.method_5720();
    }

    @Override
    public void setPrevBodyPivotY(float prevBodyPivotY) {
        this.prevBodyPivotY = prevBodyPivotY;
    }

    @Override
    public float getPrevLeftArmPivotY() {
        return this.prevLeftArmPivotY;
    }

    @Override
    public float getPrevBodyPivotY() {
        return this.prevBodyPivotY;
    }

    @Override
    public float getPrevHeadPivotY() {
        return this.prevHeadPivotY;
    }

    @Override
    public float getPrevBodyPitch() {
        return this.prevBodyPitch;
    }

    public float getPrevLeftArimPitch() {
        return this.prevLeftArimPitch;
    }

    @Override
    public void setPrevHeadPivotY(float prevHeadPivotY) {
        this.prevHeadPivotY = prevHeadPivotY;
    }

    @Override
    public void setPrevRightLegPivotY(float prevRightLegPivotY) {
        this.prevRightLegPivotY = prevRightLegPivotY;
    }

    @Override
    public float getPrevRightLegPivotZ() {
        return this.prevRightLegPivotZ;
    }

    @Override
    public void setPrevLeftArmPivotY(float prevLeftArmPivotY) {
        this.prevLeftArmPivotY = prevLeftArmPivotY;
    }

    @Override
    public void setPrevBodyPitch(float prevBodyPitch) {
        this.prevBodyPitch = prevBodyPitch;
    }

    @Override
    public void setPrevLeftLegPivotY(float prevLeftLegPivotY) {
        this.prevLeftLegPivotY = prevLeftLegPivotY;
    }

    @Override
    public float getPrevLeftLegPivotZ() {
        return this.prevLeftLegPivotZ;
    }

    @Override
    public void setPrevRightArmPivotY(float prevRightArmPivotY) {
        this.prevRightArmPivotY = prevRightArmPivotY;
    }

    @Override
    public void setPrevLeftLegPivotZ(float prevLeftLegPivotZ) {
        this.prevLeftLegPivotZ = prevLeftLegPivotZ;
    }

    public void setPrevRightArmPitch(float prevRightArmPitch) {
        this.prevRightArmPitch = prevRightArmPitch;
    }

    @Override
    public float getPrevRightLegPivotY() {
        return this.prevRightLegPivotY;
    }

    @Override
    public float getPrevLeftLegPivotY() {
        return this.prevLeftLegPivotY;
    }

    @Override
    public void setPrevRightLegPivotZ(float prevRightLegPivotZ) {
        this.prevRightLegPivotZ = prevRightLegPivotZ;
    }

    @Override
    public float getPrevRightArmPitch() {
        return this.prevRightArmPitch;
    }

    @Override
    public float getPrevRightArmPivotY() {
        return this.prevRightArmPivotY;
    }

    @Override
    public SecureClass0377 getBodyPivotYAnimation() {
        return this.bodyPivotYAnimation;
    }

    @Override
    public SecureClass0377 getBodyPitchAnimation() {
        return this.bodyPitchAnimation;
    }

    @Override
    public SecureClass0377 getRightArmPitchAnimation() {
        return this.rightArmPitchAnimation;
    }

    @Override
    public SecureClass0377 getLeftLegPivotYAnimation() {
        return this.leftLegPivotYAnimation;
    }

    @Override
    public SecureClass0377 getRightLegPivotYAnimation() {
        return this.rightLegPivotYAnimation;
    }

    @Override
    public void set$sneaking(boolean $sneaking) {
        this.$sneaking = $sneaking;
    }

    @Override
    public SecureClass0377 getLeftArmPivotYAnimation() {
        return this.leftArmPivotYAnimation;
    }

    @Override
    public SecureClass0377 getHeadPivotYAnimation() {
        return this.headPivotYAnimation;
    }

    @Override
    public SecureClass0377 getRightLegPivotZAnimation() {
        return this.rightLegPivotZAnimation;
    }

    public void setPrevLeftArimPitch(float prevLeftArimPitch) {
        this.prevLeftArimPitch = prevLeftArimPitch;
    }

    @Override
    public SecureClass0377 getLeftLegPivotZAnimation() {
        return this.leftLegPivotZAnimation;
    }

    @Override
    public SecureClass0377 getLeftArmPitchAnimation() {
        return this.leftArmPitchAnimation;
    }

    @Override
    public SecureClass0704 getSneakAnimations() {
        return this.sneakAnimations;
    }

    @Override
    public SecureClass0377 getGlobalAnimation() {
        return this.globalAnimation;
    }

    @Override
    public boolean is$sneaking() {
        return this.$sneaking;
    }

    @Override
    public SecureClass0377 getRightArmPivotYAnimation() {
        return this.rightArmPivotYAnimation;
    }

    @Override
    public SecureClass0377 cfr_renamed_1() {
        return this.FPX2uDXDChfZDf7626pQJiRmixdvbjY2;
    }
}

