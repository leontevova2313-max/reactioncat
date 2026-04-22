/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_1309;
import net.minecraft.class_2940;
import net.minecraft.class_2945;
import net.minecraft.class_9221;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group033.SecureClass0579;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_2945.class})
public abstract class MixinDataTracker<T>
implements EventSubscriber {
    @Shadow
    @Final
    private class_9221 field_13333;

    @Shadow
    public abstract <S> S method_12789(class_2940<S> var1);

    @Unique
    private float eval(float current, float newValue) {
        if (current > newValue) {
            return -(newValue - current);
        }
        return newValue - current;
    }

    @Inject(method={"set(Lnet/minecraft/entity/data/TrackedData;Ljava/lang/Object;Z)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/data/DataTracker$Entry;set(Ljava/lang/Object;)V")})
    private void setHook(class_2940<T> key, T value, boolean force, CallbackInfo ci) {
        class_9221 class_92212;
        if (class_1309.field_6247.equals(key) && (class_92212 = this.field_13333) instanceof class_1309) {
            class_1309 entity = (class_1309)class_92212;
            if (value instanceof Float) {
                Float floating = (Float)value;
                this.invoke(new SecureClass0579(entity, floating.floatValue(), this.eval(((Float)entity.method_5841().method_12789(class_1309.field_6247)).floatValue(), floating.floatValue())));
                return;
            }
        }
    }
}

