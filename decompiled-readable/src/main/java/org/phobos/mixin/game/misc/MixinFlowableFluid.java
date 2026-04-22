/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3609;
import net.minecraft.class_3610;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group056.NoPushModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_3609.class})
public abstract class MixinFlowableFluid
implements EventSubscriber {
    @Inject(method={"getVelocity"}, at={@At(value="HEAD")}, cancellable=true)
    private void getVelocityHook(class_1922 world, class_2338 pos, class_3610 state, CallbackInfoReturnable<class_243> cir) {
        if (!NoPushModule.GLDIqOsSBp6foSScWVQCQuTHmTYUFqtP()) {
            return;
        }
        cir.setReturnValue((Object)class_243.field_1353);
    }
}

