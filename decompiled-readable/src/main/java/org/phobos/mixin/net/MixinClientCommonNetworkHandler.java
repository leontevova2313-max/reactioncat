/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import net.minecraft.class_2596;
import net.minecraft.class_8673;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group043.SecureClass0777;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_8673.class})
public abstract class MixinClientCommonNetworkHandler
implements EventSubscriber {
    @Shadow
    public abstract void method_52787(class_2596<?> var1);

    @Inject(method={"onPacketException"}, at={@At(value="FIELD", target="Lnet/minecraft/client/network/ClientCommonNetworkHandler;strictErrorHandling:Z")}, cancellable=true)
    private void onPacketExceptionHook(class_2596<?> packet, Exception exception, CallbackInfo ci) {
        this.invoke(new SecureClass0777(), ci);
    }
}

