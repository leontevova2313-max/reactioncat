/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity.model;

import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_3532;
import net.minecraft.class_4896;
import net.minecraft.class_572;
import net.minecraft.class_630;
import net.minecraft.class_746;
import org.earthhack.ducks.ILivingEntity;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.mixin.game.render.entity.model.MixinEntityModel;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh._9X5lTWSdNiMQBzGufMEiSnaRerLvBuIg;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.g6wb6CgO5H0LVoOBvk8fteefzO8rXQvZ;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_572.class})
public abstract class MixinBipedEntityModel<T extends class_1309>
extends MixinEntityModel<T>
implements EventSubscriber,
s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Shadow
    @Final
    public class_630 field_3397;
    @Shadow
    public class_572.class_573 field_3399;
    @Shadow
    @Final
    public class_630 field_3394;
    @Shadow
    public float field_3396;
    @Shadow
    @Final
    public class_630 field_3401;
    @Shadow
    @Final
    public class_630 field_3391;
    @Shadow
    @Final
    public class_630 field_3398;
    @Shadow
    @Final
    public class_630 field_27433;
    @Shadow
    public class_572.class_573 field_3395;
    @Shadow
    @Final
    public class_630 field_3392;
    @Shadow
    public boolean field_3400;

    @Shadow
    protected abstract void method_30155(T var1);

    @Shadow
    protected abstract float method_2804(float var1, float var2, float var3);

    @Shadow
    protected abstract float method_2807(float var1);

    @Shadow
    protected abstract class_1306 method_2806(T var1);

    @Shadow
    protected abstract void method_30154(T var1);

    @Inject(method={"setAngles(Lnet/minecraft/entity/LivingEntity;FFFFF)V"}, at={@At(value="HEAD")}, cancellable=true)
    public void setAngles(T livingEntity, float f, float g, float h, float i, float j, CallbackInfo ci) {
        boolean bl3;
        class_630 var10000;
        ci.cancel();
        boolean bl = this.getFallFlyingTicks(livingEntity) > 4;
        boolean bl2 = livingEntity.method_20232();
        this.field_3398.field_3675 = i * ((float)Math.PI / 180);
        this.field_3398.field_3654 = bl ? -0.7853982f : (this.field_3396 > 0.0f ? (bl2 ? this.method_2804(this.field_3396, this.field_3398.field_3654, -0.7853982f) : this.method_2804(this.field_3396, this.field_3398.field_3654, j * ((float)Math.PI / 180))) : j * ((float)Math.PI / 180));
        this.field_3391.field_3675 = 0.0f;
        this.field_3401.field_3655 = 0.0f;
        this.field_3401.field_3657 = -5.0f;
        this.field_27433.field_3655 = 0.0f;
        this.field_27433.field_3657 = 5.0f;
        float k = 1.0f;
        if (bl) {
            k = (float)livingEntity.method_18798().method_1027();
            k /= 0.2f;
            k *= k * k;
        }
        if (k < 1.0f) {
            k = 1.0f;
        }
        this.field_3401.field_3654 = class_3532.method_15362((float)(f * 0.6662f + (float)Math.PI)) * 2.0f * g * 0.5f / k;
        this.field_27433.field_3654 = class_3532.method_15362((float)(f * 0.6662f)) * 2.0f * g * 0.5f / k;
        this.field_3401.field_3674 = 0.0f;
        this.field_27433.field_3674 = 0.0f;
        this.field_3392.field_3654 = class_3532.method_15362((float)(f * 0.6662f)) * 1.4f * g / k;
        this.field_3397.field_3654 = class_3532.method_15362((float)(f * 0.6662f + (float)Math.PI)) * 1.4f * g / k;
        this.field_3392.field_3675 = 0.005f;
        this.field_3397.field_3675 = -0.005f;
        this.field_3392.field_3674 = 0.005f;
        this.field_3397.field_3674 = -0.005f;
        if (this.field_3449) {
            var10000 = this.field_3401;
            var10000.field_3654 += -0.62831855f;
            var10000 = this.field_27433;
            var10000.field_3654 += -0.62831855f;
            this.field_3392.field_3654 = -1.4137167f;
            this.field_3392.field_3675 = 0.31415927f;
            this.field_3392.field_3674 = 0.07853982f;
            this.field_3397.field_3654 = -1.4137167f;
            this.field_3397.field_3675 = -0.31415927f;
            this.field_3397.field_3674 = -0.07853982f;
        }
        this.field_3401.field_3675 = 0.0f;
        this.field_27433.field_3675 = 0.0f;
        boolean bl4 = bl3 = livingEntity.method_6068() == class_1306.field_6183;
        if (livingEntity.method_6115()) {
            boolean bl42;
            boolean bl5 = bl42 = livingEntity.method_6058() == class_1268.field_5808;
            if (bl42 == bl3) {
                this.method_30154(livingEntity);
            } else {
                this.method_30155(livingEntity);
            }
        } else {
            boolean bl43;
            boolean bl6 = bl43 = bl3 ? this.field_3399.method_30156() : this.field_3395.method_30156();
            if (bl3 != bl43) {
                this.method_30155(livingEntity);
                this.method_30154(livingEntity);
            } else {
                this.method_30154(livingEntity);
                this.method_30155(livingEntity);
            }
        }
        this.method_29353(livingEntity, h);
        _9X5lTWSdNiMQBzGufMEiSnaRerLvBuIg event = this.invoke(new _9X5lTWSdNiMQBzGufMEiSnaRerLvBuIg());
        if (event.IVWOFBtZrz9G97nrhwSPFqv2wjOG6LJB() == null) {
            if (this.field_3400) {
                this.field_3391.field_3654 = 0.5f;
                var10000 = this.field_3401;
                var10000.field_3654 += 0.4f;
                var10000 = this.field_27433;
                var10000.field_3654 += 0.4f;
                this.field_3392.field_3655 = 4.0f;
                this.field_3397.field_3655 = 4.0f;
                this.field_3392.field_3656 = 12.2f;
                this.field_3397.field_3656 = 12.2f;
                this.field_3398.field_3656 = 4.2f;
                this.field_3391.field_3656 = 3.2f;
                this.field_27433.field_3656 = 5.2f;
                this.field_3401.field_3656 = 5.2f;
            } else {
                this.field_3391.field_3654 = 0.0f;
                this.field_3392.field_3655 = 0.0f;
                this.field_3397.field_3655 = 0.0f;
                this.field_3392.field_3656 = 12.0f;
                this.field_3397.field_3656 = 12.0f;
                this.field_3398.field_3656 = 0.0f;
                this.field_3391.field_3656 = 0.0f;
                this.field_27433.field_3656 = 2.0f;
                this.field_3401.field_3656 = 2.0f;
            }
        } else {
            float targetLeftArmPitch;
            ILivingEntity accessor = (ILivingEntity)livingEntity;
            accessor.setPrevBodyPitch(this.field_3391.field_3654);
            accessor.setPrevRightLegPivotZ(this.field_3392.field_3655);
            accessor.setPrevLeftLegPivotZ(this.field_3397.field_3655);
            accessor.setPrevRightLegPivotY(this.field_3392.field_3656);
            accessor.setPrevLeftLegPivotY(this.field_3397.field_3656);
            accessor.setPrevHeadPivotY(this.field_3398.field_3656);
            accessor.setPrevBodyPivotY(this.field_3391.field_3656);
            accessor.setPrevLeftArmPivotY(this.field_27433.field_3656);
            accessor.setPrevRightArmPivotY(this.field_3401.field_3656);
            float targetBodyPitch = this.field_3400 ? 0.5f : 0.0f;
            float targetRightLegPivotZ = this.field_3400 ? 4.0f : 0.0f;
            float targetLeftLegPivotZ = this.field_3400 ? 4.0f : 0.0f;
            float targetRightLegPivotY = this.field_3400 ? 12.2f : 12.0f;
            float targetLeftLegPivotY = this.field_3400 ? 12.2f : 12.0f;
            float targetHeadPivotY = this.field_3400 ? 4.2f : 0.0f;
            float targetBodyPivotY = this.field_3400 ? 3.2f : 0.0f;
            float targetLeftArmPivotY = this.field_3400 ? 5.2f : 2.0f;
            float targetRightArmPivotY = this.field_3400 ? 5.2f : 2.0f;
            float targetRightArmPitch = this.field_3400 ? 0.4f : 0.0f;
            float f2 = targetLeftArmPitch = this.field_3400 ? 0.4f : 0.0f;
            if (event.IVWOFBtZrz9G97nrhwSPFqv2wjOG6LJB().equals((Object)((Object)PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS.Custom))) {
                if (accessor.getBodyPitchAnimation() != null) {
                    accessor.getBodyPitchAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetBodyPitch);
                }
                if (accessor.getRightLegPivotZAnimation() != null) {
                    accessor.getRightLegPivotZAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetRightLegPivotZ);
                }
                if (accessor.getLeftLegPivotZAnimation() != null) {
                    accessor.getLeftLegPivotZAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetLeftLegPivotZ);
                }
                if (accessor.getRightLegPivotYAnimation() != null) {
                    accessor.getRightLegPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetRightLegPivotY);
                }
                if (accessor.getLeftLegPivotYAnimation() != null) {
                    accessor.getLeftLegPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetLeftLegPivotY);
                }
                if (accessor.getHeadPivotYAnimation() != null) {
                    accessor.getHeadPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetHeadPivotY);
                }
                if (accessor.getBodyPivotYAnimation() != null) {
                    accessor.getBodyPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetBodyPivotY);
                }
                if (accessor.getLeftArmPivotYAnimation() != null) {
                    accessor.getLeftArmPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetLeftArmPivotY);
                }
                if (accessor.getRightArmPivotYAnimation() != null) {
                    accessor.getRightArmPivotYAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetRightArmPivotY);
                }
                if (accessor.getRightArmPitchAnimation() != null) {
                    accessor.getRightArmPitchAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetRightArmPitch);
                }
                if (accessor.getLeftArmPitchAnimation() != null) {
                    accessor.getLeftArmPitchAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(targetLeftArmPitch);
                }
                if (accessor.getGlobalAnimation() != null) {
                    accessor.getGlobalAnimation().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(this.field_3400 ? 1.0f : 0.0f);
                    accessor.getGlobalAnimation().BMMCpqfUxEdTwLEu5UFj3ge24ytSFktk(10.0f, 0.04f);
                }
                if (accessor.getSneakAnimations() != null) {
                    accessor.getSneakAnimations().dyjYierEqksd6lebfn0DhcrG6xlC4ul9(50.0f, 0.08f);
                }
            }
            switch (event.IVWOFBtZrz9G97nrhwSPFqv2wjOG6LJB()) {
                case Lerp: {
                    if (this.field_3400) {
                        var10000 = this.field_3401;
                        var10000.field_3654 += 0.4f;
                        var10000 = this.field_27433;
                        var10000.field_3654 += 0.4f;
                    }
                    float tickDelta = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false);
                    this.field_3391.field_3654 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevBodyPitch(), (float)targetBodyPitch);
                    this.field_3392.field_3655 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevRightLegPivotZ(), (float)targetRightLegPivotZ);
                    this.field_3397.field_3655 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevLeftLegPivotZ(), (float)targetLeftLegPivotZ);
                    this.field_3392.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevRightLegPivotY(), (float)targetRightLegPivotY);
                    this.field_3397.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevLeftLegPivotY(), (float)targetLeftLegPivotY);
                    this.field_3398.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevHeadPivotY(), (float)targetHeadPivotY);
                    this.field_3391.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevBodyPivotY(), (float)targetBodyPivotY);
                    this.field_27433.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevLeftArmPivotY(), (float)targetLeftArmPivotY);
                    this.field_3401.field_3656 = class_3532.method_16439((float)tickDelta, (float)accessor.getPrevRightArmPivotY(), (float)targetRightArmPivotY);
                    break;
                }
                case Custom: {
                    this.field_3391.field_3654 = accessor.getBodyPitchAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    var10000 = this.field_3401;
                    var10000.field_3654 += accessor.getRightArmPitchAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    var10000 = this.field_27433;
                    var10000.field_3654 += accessor.getLeftArmPitchAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3392.field_3655 = accessor.getRightLegPivotZAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3397.field_3655 = accessor.getLeftLegPivotZAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3392.field_3656 = accessor.getRightLegPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3397.field_3656 = accessor.getLeftLegPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3398.field_3656 = accessor.getHeadPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3391.field_3656 = accessor.getBodyPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_27433.field_3656 = accessor.getLeftArmPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    this.field_3401.field_3656 = accessor.getRightArmPivotYAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
                    break;
                }
            }
        }
        if (this.field_3395 != class_572.class_573.field_27434) {
            class_4896.method_29350((class_630)this.field_3401, (float)h, (float)1.0f);
        }
        if (this.field_3399 != class_572.class_573.field_27434) {
            class_4896.method_29350((class_630)this.field_27433, (float)h, (float)-1.0f);
        }
        if (this.field_3396 > 0.0f) {
            float o;
            float n;
            float l = f % 26.0f;
            class_1306 arm = this.method_2806(livingEntity);
            float m = arm == class_1306.field_6183 && this.field_3447 > 0.0f ? 0.0f : this.field_3396;
            float f3 = n = arm == class_1306.field_6182 && this.field_3447 > 0.0f ? 0.0f : this.field_3396;
            if (!livingEntity.method_6115()) {
                if (l < 14.0f) {
                    this.field_27433.field_3654 = this.method_2804(n, this.field_27433.field_3654, 0.0f);
                    this.field_3401.field_3654 = class_3532.method_16439((float)m, (float)this.field_3401.field_3654, (float)0.0f);
                    this.field_27433.field_3675 = this.method_2804(n, this.field_27433.field_3675, (float)Math.PI);
                    this.field_3401.field_3675 = class_3532.method_16439((float)m, (float)this.field_3401.field_3675, (float)((float)Math.PI));
                    this.field_27433.field_3674 = this.method_2804(n, this.field_27433.field_3674, (float)Math.PI + 1.8707964f * this.method_2807(l) / this.method_2807(14.0f));
                    this.field_3401.field_3674 = class_3532.method_16439((float)m, (float)this.field_3401.field_3674, (float)((float)Math.PI - 1.8707964f * this.method_2807(l) / this.method_2807(14.0f)));
                } else if (l >= 14.0f && l < 22.0f) {
                    o = (l - 14.0f) / 8.0f;
                    this.field_27433.field_3654 = this.method_2804(n, this.field_27433.field_3654, 1.5707964f * o);
                    this.field_3401.field_3654 = class_3532.method_16439((float)m, (float)this.field_3401.field_3654, (float)(1.5707964f * o));
                    this.field_27433.field_3675 = this.method_2804(n, this.field_27433.field_3675, (float)Math.PI);
                    this.field_3401.field_3675 = class_3532.method_16439((float)m, (float)this.field_3401.field_3675, (float)((float)Math.PI));
                    this.field_27433.field_3674 = this.method_2804(n, this.field_27433.field_3674, 5.012389f - 1.8707964f * o);
                    this.field_3401.field_3674 = class_3532.method_16439((float)m, (float)this.field_3401.field_3674, (float)(1.2707963f + 1.8707964f * o));
                } else if (l >= 22.0f && l < 26.0f) {
                    o = (l - 22.0f) / 4.0f;
                    this.field_27433.field_3654 = this.method_2804(n, this.field_27433.field_3654, 1.5707964f - 1.5707964f * o);
                    this.field_3401.field_3654 = class_3532.method_16439((float)m, (float)this.field_3401.field_3654, (float)(1.5707964f - 1.5707964f * o));
                    this.field_27433.field_3675 = this.method_2804(n, this.field_27433.field_3675, (float)Math.PI);
                    this.field_3401.field_3675 = class_3532.method_16439((float)m, (float)this.field_3401.field_3675, (float)((float)Math.PI));
                    this.field_27433.field_3674 = this.method_2804(n, this.field_27433.field_3674, (float)Math.PI);
                    this.field_3401.field_3674 = class_3532.method_16439((float)m, (float)this.field_3401.field_3674, (float)((float)Math.PI));
                }
            }
            o = 0.3f;
            float p = 0.33333334f;
            this.field_3397.field_3654 = class_3532.method_16439((float)this.field_3396, (float)this.field_3397.field_3654, (float)(0.3f * class_3532.method_15362((float)(f * 0.33333334f + (float)Math.PI))));
            this.field_3392.field_3654 = class_3532.method_16439((float)this.field_3396, (float)this.field_3392.field_3654, (float)(0.3f * class_3532.method_15362((float)(f * 0.33333334f))));
        }
        this.field_3394.method_17138(this.field_3398);
    }

    @Unique
    private int getFallFlyingTicks(T livingEntity) {
        if (livingEntity instanceof class_746 && g6wb6CgO5H0LVoOBvk8fteefzO8rXQvZ.l43E3tUElcuTHdfS4EuL5pPj7nEObL0J()) {
            return 0;
        }
        return livingEntity.method_6003();
    }

    @Shadow
    protected abstract void method_29353(T var1, float var2);
}

