/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game;

import net.minecraft.class_9779;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.3BztNC70MwSEQNTzZ4lvFGqznxpf9J2W.Pb8LJ10kSZxbvcvDPrSVRkEhO1RScZha;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_9779.class_9781.class})
public abstract class MixinDynamic
implements EventSubscriber {
    @Shadow
    private float field_51959;
    @Shadow
    private float field_51958;

    @Inject(method={"beginRenderTick(J)I"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/RenderTickCounter$Dynamic;prevTimeMillis:J", opcode=181)})
    private void beginRenderTickHook(long millis, CallbackInfoReturnable<Integer> cir) {
        Pb8LJ10kSZxbvcvDPrSVRkEhO1RScZha event = this.invoke(new Pb8LJ10kSZxbvcvDPrSVRkEhO1RScZha(this.field_51958, this.field_51959));
        this.field_51958 *= event.SBsdeDOm90oZD28rfc3fcKWh6SStEkoP();
        this.field_51959 = event.UX3axZaPL3HGyBLBzqCUQPlmCp7bCpAv();
    }
}

