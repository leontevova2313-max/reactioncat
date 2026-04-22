/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import java.util.Iterator;
import java.util.List;
import net.minecraft.class_2558;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_364;
import net.minecraft.class_4068;
import net.minecraft.class_408;
import net.minecraft.class_437;
import org.earthhack.ducks.IClickEvent;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group022.SecureClass0361;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_437.class})
public abstract class MixinScreen {
    @Shadow
    public int field_22790;
    @Shadow
    @Nullable
    protected class_310 field_22787;
    @Shadow
    protected class_327 field_22793;
    @Shadow
    public int field_22789;

    @Inject(method={"handleTextClick"}, at={@At(value="HEAD")}, cancellable=true)
    private void handleTextClickHook2(class_2583 style, CallbackInfoReturnable<Boolean> cir) {
        class_2558 event = style.method_10970();
        if (event == null) {
            return;
        }
        IClickEvent clickEvent = IClickEvent.cast(event);
        List<Runnable> callbacks = clickEvent.getCallbacks();
        if (callbacks.isEmpty()) {
            return;
        }
        Iterator<Runnable> iterator = callbacks.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                cir.setReturnValue((Object)true);
                callbacks.clear();
                return;
            }
            Runnable callback = iterator.next();
            callback.run();
        }
    }

    @Shadow
    public abstract void method_25394(class_332 var1, int var2, int var3, float var4);

    @Shadow
    protected abstract <T extends class_364 & class_4068> T method_37063(T var1);

    @Inject(method={"close"}, at={@At(value="TAIL")})
    private void closeHook(CallbackInfo ci) {
        if (this instanceof class_408) {
            SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().xL1ePIqDdUqNhZuCBHuzZ9fVbK8YNR3q().RTyboAqcVCXJWK5Q3djyjEhjMsaRJ6vf().cfr_renamed_56().setValue(null);
        }
    }
}

