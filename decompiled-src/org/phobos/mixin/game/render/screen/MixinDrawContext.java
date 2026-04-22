/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.screen;

import com.llamalad7.mixinextras.injector.ModifyReceiver;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_5632;
import net.minecraft.class_5684;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.iFdY2vDybaACzPpBEWIgHuFIjkV6JyoI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={class_332.class})
public abstract class MixinDrawContext {
    @Inject(method={"drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;II)V"}, at={@At(value="INVOKE", target="Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V", shift=At.Shift.BEFORE)}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void drawTooltipHook1(class_327 textRenderer, List<class_2561> text, Optional<class_5632> data, int x, int y, CallbackInfo ci, List<class_5684> list) {
        class_5632 class_56322;
        if (data.isPresent() && (class_56322 = data.get()) instanceof iFdY2vDybaACzPpBEWIgHuFIjkV6JyoI) {
            iFdY2vDybaACzPpBEWIgHuFIjkV6JyoI meteorTooltipData = (iFdY2vDybaACzPpBEWIgHuFIjkV6JyoI)class_56322;
            list.add(meteorTooltipData.BNQ4g6Im1pA3bDjN3mf50E2uh2z3JE57());
        }
    }

    @ModifyReceiver(method={"drawTooltip(Lnet/minecraft/client/font/TextRenderer;Ljava/util/List;Ljava/util/Optional;II)V"}, at={@At(value="INVOKE", target="Ljava/util/Optional;ifPresent(Ljava/util/function/Consumer;)V")})
    private Optional<class_5632> drawTooltipHook2(Optional<class_5632> data, Consumer<class_5632> consumer) {
        if (data.isPresent() && data.get() instanceof iFdY2vDybaACzPpBEWIgHuFIjkV6JyoI) {
            return Optional.empty();
        }
        return data;
    }
}

