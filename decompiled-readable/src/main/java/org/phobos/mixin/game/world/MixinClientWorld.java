/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1959;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2394;
import net.minecraft.class_243;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import net.minecraft.class_4538;
import net.minecraft.class_4761;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.mixin.game.world.MixinWorld;
import org.phobos.secure.group001.SecureClass0001;
import org.phobos.secure.group005.AmbienceModule;
import org.phobos.secure.group006.WeatherModule;
import org.phobos.secure.group025.SecureClass0443;
import org.phobos.secure.group051.SecureClass0912;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group056.KY6cbATCVdICaOLkj9PposBhc9JvQ5sl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_638.class})
public abstract class MixinClientWorld
extends MixinWorld
implements EventSubscriber {
    @Inject(method={"getSkyColor"}, at={@At(value="HEAD")}, cancellable=true)
    private void getSkyColor(class_243 cameraPos, float tickDelta, CallbackInfoReturnable<class_243> cir) {
        if (AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().GccY1dwTHn6Nx0kl3qpwUZLEQq0F19En().getValue().booleanValue() && AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().ulHGUBcyPIBldBfiqZ4kvFQ5uoTy8lq1().getValue() == KY6cbATCVdICaOLkj9PposBhc9JvQ5sl.Color) {
            Color skyColor = AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().f8WilMH8QYHaPQf1QyEkjczRmCMt8yh4().getValue();
            cir.setReturnValue((Object)SecureClass0898.iDrOrCYK1PV9W9Ma7mfx3Hxb4txPAYMa(skyColor));
            return;
        }
    }

    @Shadow
    public abstract void method_8406(class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12);

    @Inject(method={"playSound(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZJ)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void playSoundHook(double x, double y, double z, class_3414 event, class_3419 category, float volume, float pitch, boolean useDistance, long seed, CallbackInfo ci) {
        this.invoke(new SecureClass0001(x, y, z, event), ci);
    }

    @Inject(method={"addEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void addEntityHook(class_1297 entity, CallbackInfo ci) {
        if (entity == null) {
            ci.cancel();
            return;
        }
        if (entity instanceof class_1542) {
            return;
        }
        this.invoke(new SecureClass0443(entity), ci);
    }

    @Shadow
    @Nullable
    public abstract class_1297 method_8469(int var1);

    @Inject(method={"randomBlockDisplayTick"}, at={@At(value="INVOKE", target="Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V", shift=At.Shift.AFTER)})
    private void randomBlockDisplayTickHook(int centerX, int centerY, int centerZ, int radius, class_5819 random, class_2248 block, class_2338.class_2339 pos, CallbackInfo ci) {
        class_4538 view = (class_4538)this;
        if (((class_1959)view.method_23753((class_2338)pos).comp_349()).method_24378().isPresent()) {
            return;
        }
        class_4761 config = WeatherModule.X41zd8mirfgSS2uFIKPpNYA1SncpbZ1o();
        if (config != null && config.method_24370(random)) {
            WeatherModule.TYmcYkheSadLlXutoR5eIKfWywVHWvkB(true);
            this.method_8406(config.method_24369(), (double)pos.method_10263() + random.method_43058(), (double)pos.method_10264() + random.method_43058(), (double)pos.method_10260() + random.method_43058(), 0.0, 0.0, 0.0);
            return;
        }
    }

    @Inject(method={"removeEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void removeEntityHook(int entityId, class_1297.class_5529 removalReason, CallbackInfo ci) {
        class_1297 entity = this.method_8469(entityId);
        if (entity != null) {
            if (entity instanceof class_1542) {
                return;
            }
            this.invoke(new SecureClass0912(entity, removalReason), ci);
        }
    }
}

