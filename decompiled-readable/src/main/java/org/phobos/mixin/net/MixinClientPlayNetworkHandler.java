/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import com.llamalad7.mixinextras.sugar.Local;
import java.time.Instant;
import net.minecraft.class_1255;
import net.minecraft.class_1297;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import net.minecraft.class_2600;
import net.minecraft.class_2663;
import net.minecraft.class_269;
import net.minecraft.class_2739;
import net.minecraft.class_2744;
import net.minecraft.class_2797;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_3515;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_7469;
import net.minecraft.class_7608;
import net.minecraft.class_7610;
import net.minecraft.class_7637;
import org.earthhack.ducks.IClientPlayerNetworkHandler;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.mixin.net.MixinClientCommonNetworkHandler;
import org.phobos.mixin.net.interfaces.IClientConnection;
import org.phobos.secure.group039.SecureClass0684;
import org.phobos.secure.group023.SecureClass0391;
import org.phobos.secure.group031.SecureClass0558;
import org.phobos.secure.group037.SoundFixerModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public abstract class MixinClientPlayNetworkHandler
extends MixinClientCommonNetworkHandler
implements EventSubscriber,
SecureInterface0134,
IClientPlayerNetworkHandler {
    @Shadow
    public class_7610.class_7612 field_39808;
    @Shadow
    @Final
    private class_269 field_47878;
    @Shadow
    public class_7637 field_39858;
    @Shadow
    private class_638 field_3699;

    @Redirect(method={"onScoreboardScoreUpdate"}, at=@At(value="INVOKE", target="Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;)V"))
    private void onScoreboardScoreUpdateHook(Logger instance, String string, Object object) {
    }

    @Inject(method={"onEntityTrackerUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    public void onEntityPosition(class_2739 packet, CallbackInfo ci) {
        ci.cancel();
        try {
            class_2600.method_11074((class_2596)packet, (class_2547)((class_634)this), (class_1255)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3);
            class_1297 entity = this.field_3699.method_8469(packet.comp_1127());
            if (entity != null) {
                entity.method_5841().method_12779(packet.comp_1128());
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Shadow
    public abstract class_2535 method_48296();

    @Redirect(method={"onEntityStatus"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/world/ClientWorld;playSound(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZ)V"))
    private void onEntityStatusHook(class_638 instance, double x, double y, double z, class_3414 sound, class_3419 category, float volume, float pitch, boolean useDistance) {
        instance.method_8486(x, y, z, sound, category, volume, pitch, SoundFixerModule.cfr_renamed_25() || useDistance);
    }

    @Inject(method={"onEntityStatus"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/particle/ParticleManager;addEmitter(Lnet/minecraft/entity/Entity;Lnet/minecraft/particle/ParticleEffect;I)V")})
    private void entityStatusHook(class_2663 packet, CallbackInfo ci, @Local class_1297 entity) {
        this.invoke(new SecureClass0558(entity));
    }

    @Override
    public void pPFgvgxM1D02XsYLbokyaHYnMp44ojC0(class_2596<?> packet) {
        ((IClientConnection)this.method_48296()).invokeSendInternal(packet, null, true);
    }

    @Inject(method={"onEntityEquipmentUpdate"}, at={@At(value="HEAD")})
    private void onEntityEquipmentUpdateHook(class_2744 packet, CallbackInfo ci) {
        if (MixinClientPlayNetworkHandler.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return;
        }
        this.invoke(new SecureClass0391(packet, MixinClientPlayNetworkHandler.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687.method_8469(packet.method_11820())));
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void sendChatMessageHook(String message, CallbackInfo ci) {
        ci.cancel();
        SecureClass0684 event = this.invoke(new SecureClass0684(message));
        if (event.isCancelled()) {
            return;
        }
        String content = event.getMessage();
        Instant instant = Instant.now();
        long l = class_3515.class_7426.method_43531();
        class_7637.class_7816 lastSeenMessages = this.field_39858.method_46266();
        class_7469 messageSignatureData = this.field_39808.pack(new class_7608(content, instant, l, lastSeenMessages.comp_1073()));
        this.method_52787((class_2596<?>)new class_2797(content, instant, l, messageSignatureData, lastSeenMessages.comp_1074()));
    }
}

