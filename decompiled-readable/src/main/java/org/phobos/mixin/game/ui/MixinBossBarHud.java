/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_332;
import net.minecraft.class_337;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group047.NoRenderModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_337.class})
public abstract class MixinBossBarHud
implements EventSubscriber {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook(class_332 context, CallbackInfo ci) {
        if (!NoRenderModule.m0zZUQYeUKVUVOMRFJJRa7oOwyM9w1Sb()) {
            return;
        }
        ci.cancel();
    }
}

