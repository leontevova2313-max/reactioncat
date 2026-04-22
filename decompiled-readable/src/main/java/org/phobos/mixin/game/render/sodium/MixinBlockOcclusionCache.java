/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.sodium;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group047.NoRenderModule;
import org.phobos.secure.group051.XRayModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(targets={"me.jellysquid.mods.sodium.client.render.chunk.compile.pipeline.BlockOcclusionCache"}, remap=false)
public abstract class MixinBlockOcclusionCache
implements EventSubscriber {
    @Inject(method={"shouldDrawSide"}, at={@At(value="RETURN")}, cancellable=true)
    private void shouldRenderHook(class_2680 state, class_1922 view, class_2338 pos, class_2350 facing, CallbackInfoReturnable<Boolean> cir) {
        if (NoRenderModule.R1M3Y91nTUxM6sRuTZOtYyFqDqnQw7vn(state)) {
            cir.setReturnValue((Object)false);
            return;
        }
        XRayModule.QbQeuMt9irM15NNuxiwACpPAYBjtt8hR(state.method_26204(), cir);
    }
}

