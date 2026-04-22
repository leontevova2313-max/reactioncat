/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1657;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group035._770CqaTAPYBwpgCeySVoa3CPLLrqdomG;
import org.phobos.secure.group047.NoRenderModule;
import org.phobos.secure.group051.XRayModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2248.class})
public abstract class MixinBlock
implements EventSubscriber {
    @Inject(method={"shouldDrawSide"}, at={@At(value="HEAD")}, cancellable=true)
    private static void shouldDrawSideHook(class_2680 state, class_1922 world, class_2338 pos, class_2350 side, class_2338 otherPos, CallbackInfoReturnable<Boolean> cir) {
        if (NoRenderModule.R1M3Y91nTUxM6sRuTZOtYyFqDqnQw7vn(state)) {
            cir.setReturnValue((Object)false);
            return;
        }
        XRayModule.QbQeuMt9irM15NNuxiwACpPAYBjtt8hR(state.method_26204(), cir);
    }

    @Inject(method={"spawnBreakParticles"}, at={@At(value="HEAD")}, cancellable=true)
    private void spawnBreakParticlesHook(class_1937 world, class_1657 player, class_2338 pos, class_2680 state, CallbackInfo ci) {
        this.invoke(new _770CqaTAPYBwpgCeySVoa3CPLLrqdomG(), ci);
    }
}

