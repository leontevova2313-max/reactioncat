/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.minecraft.class_1297;
import net.minecraft.class_1313;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_3532;
import net.minecraft.class_4050;
import net.minecraft.class_746;
import org.earthhack.ducks.IEntity;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group004.SecureClass0051;
import org.phobos.secure.group007.gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt;
import org.phobos.secure.group029.PhaseModule;
import org.phobos.secure.group039.NoSlowModule;
import org.phobos.secure.group041.SecureClass0722;
import org.phobos.secure.group041.SecureClass0725;
import org.phobos.secure.group049.SecureClass0886;
import org.phobos.secure.group023.AntiCheatModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.NoPushModule;
import org.phobos.secure.group059.SecureClass1079;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public abstract class MixinEntity
implements SecureInterface0134,
EventSubscriber,
IEntity {
    @Unique
    private boolean painted;
    @Unique
    private boolean clientSided;
    @Unique
    private final Map<String, Object> properties = new HashMap<String, Object>();
    @Unique
    private class_4050 serverPose;
    @Shadow
    private class_1937 field_6002;
    @Unique
    private volatile long attackTime;

    @Shadow
    public abstract class_243 method_18798();

    @Shadow
    public abstract float method_36454();

    @Shadow
    public abstract void method_36457(float var1);

    @Shadow
    public abstract class_2338 method_23314();

    @Shadow
    public abstract void method_36456(float var1);

    @Shadow
    public abstract float method_36455();

    @Shadow
    public abstract double method_23318();

    @Shadow
    private static List<class_265> method_59920(@Nullable class_1297 entity, class_1937 world, List<class_265> regularCollisions, class_238 movingEntityBoundingBox) {
        return null;
    }

    @Shadow
    public abstract float method_49476();

    @Shadow
    public abstract double method_56989();

    @Shadow
    public abstract void method_18799(class_243 var1);

    @Shadow
    public abstract void method_5814(double var1, double var3, double var5);

    @Shadow
    public abstract void method_18800(double var1, double var3, double var5);

    @Shadow
    public static class_243 method_20736(@Nullable class_1297 entity, class_243 movement, class_238 entityBoundingBox, class_1937 world, List<class_265> collisions) {
        return null;
    }

    @Shadow
    public abstract class_238 method_5829();

    @Shadow
    public abstract void method_5784(class_1313 var1, class_243 var2);

    @Shadow
    public abstract class_1937 method_37908();

    @Shadow
    private static float[] method_59921(class_238 collisionBox, List<class_265> collisions, float f, float stepHeight) {
        return null;
    }

    @Shadow
    public abstract boolean method_24828();

    @Shadow
    public abstract boolean method_5624();

    @Shadow
    protected abstract class_243 method_18796(class_243 var1, class_1313 var2);

    @Shadow
    private static class_243 method_20737(class_243 movement, class_238 entityBoundingBox, List<class_265> collisions) {
        return null;
    }

    @Override
    public void setServerPose(class_4050 pose) {
        this.serverPose = pose;
    }

    @Override
    public boolean isPainted() {
        return this.painted;
    }

    @Unique
    private class_243 ccrNoyU1GPPsBnh1Oijp4c7qR1mweGBL(class_243 input, float speed, float yaw) {
        double d = input.method_1027();
        if (d < gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.duC3XarMm1ZTpHPRlsLi4FVdrEFKBmhF(1.0E-7)) {
            return class_243.field_1353;
        }
        class_243 vec = (d > 1.0 ? input.method_1029() : input).method_1021((double)speed);
        float sin = class_3532.method_15374((float)(yaw * ((float)Math.PI / 180)));
        float cos = class_3532.method_15362((float)(yaw * ((float)Math.PI / 180)));
        return new class_243(vec.field_1352 * (double)cos - vec.field_1350 * (double)sin, vec.field_1351, vec.field_1350 * (double)cos + vec.field_1352 * (double)sin);
    }

    @Override
    @Nullable
    public class_4050 getServerPose() {
        return this.serverPose;
    }

    @Override
    public void setClientSide(boolean clientSide) {
        this.clientSided = clientSide;
    }

    @Inject(method={"adjustMovementForCollisions(Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;"}, at={@At(value="HEAD")}, cancellable=true)
    private void adjustMovementForCollisions(class_243 movement, CallbackInfoReturnable<class_243> cir) {
        boolean bl4;
        class_238 box = this.method_5829();
        List list = this.method_37908().method_20743((class_1297)this, box.method_18804(movement));
        class_243 vec3d = movement.method_1027() == 0.0 ? movement : MixinEntity.method_20736((class_1297)this, movement, box, this.method_37908(), list);
        boolean bl = movement.field_1352 != vec3d.field_1352;
        boolean bl2 = movement.field_1351 != vec3d.field_1351;
        boolean bl3 = movement.field_1350 != vec3d.field_1350;
        boolean bl5 = bl4 = bl2 && movement.field_1351 < 0.0;
        if (this.method_49476() > 0.0f && (bl4 || this.method_24828()) && (bl || bl3)) {
            float[] fs;
            class_238 box2 = bl4 ? box.method_989(0.0, vec3d.field_1351, 0.0) : box;
            class_238 box3 = box2.method_1012(movement.field_1352, (double)this.method_49476(), movement.field_1350);
            if (!bl4) {
                box3 = box3.method_1012(0.0, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.oc4pIEdAifQlmiaB7zwBF770W7Nwzzkl((double)-1.0E-5f), 0.0);
            }
            List<class_265> list2 = MixinEntity.method_59920((class_1297)this, this.field_6002, list, box3);
            float f = (float)vec3d.field_1351;
            float[] var14 = fs = MixinEntity.method_59921(box2, list2, this.method_49476(), f);
            int var15 = fs.length;
            for (int var16 = 0; var16 < var15; ++var16) {
                float g = var14[var16];
                class_243 vec3d2 = MixinEntity.method_20737(new class_243(movement.field_1352, (double)g, movement.field_1350), box2, list2);
                if (!(vec3d2.method_37268() > vec3d.method_37268())) continue;
                double d = box.field_1322 - box2.field_1322;
                cir.setReturnValue((Object)vec3d2.method_1031(0.0, -d, 0.0));
                return;
            }
        }
        cir.setReturnValue((Object)vec3d);
    }

    @Redirect(method={"move"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;playExtinguishSound()V"))
    private void moveHook(class_1297 instance) {
    }

    @Override
    public void setPainted(boolean value) {
        this.painted = value;
    }

    @Redirect(method={"move"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;adjustMovementForSneaking(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/entity/MovementType;)Lnet/minecraft/util/math/Vec3d;"))
    private class_243 moveHook(class_1297 instance, class_243 movement, class_1313 type) {
        class_243 sneaking = this.method_18796(movement, type);
        if (instance instanceof class_746) {
            SecureClass1079 event = this.invoke(new SecureClass1079(sneaking));
            return event.aqoKpTkhu9NBHi8mM62XqhbsPyQVbU0L();
        }
        return sneaking;
    }

    @Inject(method={"isCrawling"}, at={@At(value="HEAD")}, cancellable=true)
    private void isCrawlingHook(CallbackInfoReturnable<Boolean> cir) {
        if (!(this instanceof class_746)) {
            return;
        }
        if (NoSlowModule.SmyBEicwKebyQHoLxrpYzDZ4qYtQCiHW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NoSlowModule.SmyBEicwKebyQHoLxrpYzDZ4qYtQCiHW().dZiaMTiU7dNA6YKl8U6F4X3rhTkHEdtF().getValue().booleanValue()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"getPose"}, at={@At(value="RETURN")}, cancellable=true)
    private void getPoseHook(CallbackInfoReturnable<class_4050> cir) {
        if (MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return;
        }
        if (this == MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) {
            if (AntiCheatModule.cAgW8tvusUVLXmpSlaxCd5MCfHcW6Jq7().LcxaeF1UyxIbEwXF9dcQoDXiEmchuCFy().getValue().booleanValue() && cir.getReturnValue() == class_4050.field_18079 && MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_3913 != null) {
                cir.setReturnValue((Object)(MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_3913.field_3903 ? class_4050.field_18081 : class_4050.field_18076));
                return;
            }
            if (PhaseModule.sPqLKNf5Vny14PNzQc2d6QNVVEOBsvgC() && MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null && SecureClass0725.hBsB2ZxcHtoOEbY2eGhf3wXde5Szm5Rp((class_1657)MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724, (class_1937)MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687) && cir.getReturnValue() != class_4050.field_18079) {
                cir.setReturnValue((Object)class_4050.field_18076);
                return;
            }
            if (SecureClass0722.l43E3tUElcuTHdfS4EuL5pPj7nEObL0J()) {
                cir.setReturnValue((Object)class_4050.field_18076);
            }
        }
    }

    @Override
    public boolean isClientSide() {
        return this.clientSided;
    }

    @Override
    public void setAttackTime(long attackTime) {
        this.attackTime = attackTime;
    }

    @Override
    public Object get(String name) {
        return this.properties.get(name);
    }

    @Inject(method={"pushAwayFrom"}, at={@At(value="INVOKE", target="Ljava/lang/Math;sqrt(D)D", shift=At.Shift.BEFORE)}, cancellable=true)
    private void pushAwayFromHook(class_1297 entity, CallbackInfo ci) {
        if (!Objects.equals(this, MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) && !Objects.equals(entity, MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724)) {
            return;
        }
        if (!NoPushModule.MwBxTEvwUoMGCMcv17UhagMSYW8qIgvb()) {
            return;
        }
        ci.cancel();
    }

    @Override
    public void put(String name, Object value) {
        this.properties.put(name, value);
    }

    @Override
    public long getAttackTime() {
        return this.attackTime;
    }

    @Inject(method={"isGlowing"}, at={@At(value="RETURN")}, cancellable=true)
    private void isGlowingHook(CallbackInfoReturnable<Boolean> cir) {
        SecureClass0051 event = this.invoke(new SecureClass0051((class_1297)this, (Boolean)cir.getReturnValue()));
        if (this.painted) {
            cir.setReturnValue((Object)false);
            this.painted = false;
            return;
        }
        cir.setReturnValue((Object)event.JGIFBgBjynNu28r4kqpnMy2v3GreuaqJ());
    }

    @Inject(method={"updateVelocity"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateVelocityHook(float speed, class_243 input, CallbackInfo ci) {
        if (MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return;
        }
        if (this == MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) {
            ci.cancel();
            SecureClass0886 event = this.invoke(new SecureClass0886(input, speed, MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_36454(), this.ccrNoyU1GPPsBnh1Oijp4c7qR1mweGBL(input, speed, MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_36454())));
            MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_18799(MixinEntity.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_18798().method_1019(event.keMNAhyUFnWwODUPx67gPJkpephTsLAu()));
        }
    }

    @Inject(method={"movementInputToVelocity"}, at={@At(value="HEAD")}, cancellable=true)
    private static void movementInputToVelocity(class_243 movementInput, float speed, float yaw, CallbackInfoReturnable<class_243> cir) {
        double d = movementInput.method_1027();
        if (d < gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.duC3XarMm1ZTpHPRlsLi4FVdrEFKBmhF(1.0E-7)) {
            cir.setReturnValue((Object)class_243.field_1353);
        } else {
            class_243 vec3d = (d > 1.0 ? movementInput.method_1029() : movementInput).method_1021((double)speed);
            float f = class_3532.method_15374((float)(yaw * ((float)Math.PI / 180)));
            float g = class_3532.method_15362((float)(yaw * ((float)Math.PI / 180)));
            cir.setReturnValue((Object)new class_243(vec3d.field_1352 * (double)g - vec3d.field_1350 * (double)f, vec3d.field_1351, vec3d.field_1350 * (double)g + vec3d.field_1352 * (double)f));
        }
    }
}

