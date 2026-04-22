/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_758;
import org.phobos.secure.group005.AmbienceModule;
import org.phobos.secure.group010.SecureClass0154;
import org.phobos.secure.group013.rpCSxe6sjJP3Ex1WJo7eu5jPWgLfUQm0;
import org.phobos.secure.group057.SecureClass1030;
import org.phobos.secure.group022.SecureClass0361;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_758.class})
public abstract class MixinBackgroundRenderer {
    @Shadow
    private static float field_4034;
    @Shadow
    private static float field_4033;
    @Shadow
    private static float field_4032;

    @Unique
    private static <T> T post(T obj) {
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(obj);
        return obj;
    }

    @Inject(method={"getFogModifier(Lnet/minecraft/entity/Entity;F)Lnet/minecraft/client/render/BackgroundRenderer$StatusEffectFogModifier;"}, at={@At(value="HEAD")}, cancellable=true)
    private static void getFogModifierHook(class_1297 entity, float tickDelta, CallbackInfoReturnable<Object> cir) {
        rpCSxe6sjJP3Ex1WJo7eu5jPWgLfUQm0 event = MixinBackgroundRenderer.post(new rpCSxe6sjJP3Ex1WJo7eu5jPWgLfUQm0());
        if (event.isCancelled()) {
            cir.setReturnValue(null);
        }
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/RenderSystem;clearColor(FFFF)V", shift=At.Shift.BEFORE)})
    private static void renderHook(class_4184 camera, float tickDelta, class_638 world, int viewDistance, float skyDarkness, CallbackInfo ci) {
        if (AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().sWEsWONTQSrSWRnXxKQ1ee3XvZ6UqPsc().getValue().booleanValue()) {
            Color color = AmbienceModule.W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ().cfr_renamed_42().getValue();
            field_4034 = (float)color.getRed() / 255.0f;
            field_4033 = (float)color.getGreen() / 255.0f;
            field_4032 = (float)color.getBlue() / 255.0f;
            return;
        }
    }

    @Inject(method={"applyFog"}, at={@At(value="TAIL")})
    private static void applyFogHook(class_4184 camera, class_758.class_4596 type, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        SecureClass0154.DtHij1dy2hUyF69xizewVhNf0AhRFmZX = RenderSystem.getShaderFogStart();
        SecureClass0154.HUic8yUdCDHAIBJP8GU4uUj9oA0zwQjk = RenderSystem.getShaderFogEnd();
        SecureClass0154.IsU1oOkYJb0FFLfVpCbLVlXTSwGNjMJj = RenderSystem.getShaderFogShape();
        MixinBackgroundRenderer.post(new SecureClass1030(type, viewDistance, tickDelta, thickFog));
    }
}

