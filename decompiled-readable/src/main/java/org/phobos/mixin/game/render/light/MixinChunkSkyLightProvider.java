/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.light;

import net.minecraft.class_3572;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group063.dkniv8R95kjr5mGauwWeWYUtXRqG96bJ;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_3572.class})
public abstract class MixinChunkSkyLightProvider
implements EventSubscriber {
    @Inject(method={"method_51531"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateHook(CallbackInfo ci) {
        this.invoke(new dkniv8R95kjr5mGauwWeWYUtXRqG96bJ(), ci);
    }
}

