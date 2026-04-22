/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.screen;

import net.minecraft.class_4603;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.233YlkA2dSoXPmZOG4uyJFB5W5MKs63U.NKERquIffblFWvpaTwwfUwGVNvpULjOD;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.N9fw7neArrQjnw50rFVIBHA0doU08lV0;
import org.phobos.secure.AuMPaDyo4HD2Mdz6ox1zOjYGNwTJpKkh.rUj9OT9RNEjxqetNFfjWeRiBxtanUxjA;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt._5NL67dveaft7W6w4NPWRHOLlQPGDVzsY;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4603.class})
public abstract class MixinInGameOverlayRenderer
implements EventSubscriber {
    @Inject(method={"renderFireOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderFireOverlay(CallbackInfo ci) {
        N9fw7neArrQjnw50rFVIBHA0doU08lV0.eSb43qYGCPaZJOYdjVKCBPWDal9fdBij(new rUj9OT9RNEjxqetNFfjWeRiBxtanUxjA(), ci);
    }

    @Inject(method={"renderUnderwaterOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderUnderwaterOverlay(CallbackInfo ci) {
        N9fw7neArrQjnw50rFVIBHA0doU08lV0.eSb43qYGCPaZJOYdjVKCBPWDal9fdBij(new NKERquIffblFWvpaTwwfUwGVNvpULjOD(), ci);
    }

    @Inject(method={"renderInWallOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderInWallOverlay(CallbackInfo ci) {
        N9fw7neArrQjnw50rFVIBHA0doU08lV0.eSb43qYGCPaZJOYdjVKCBPWDal9fdBij(new _5NL67dveaft7W6w4NPWRHOLlQPGDVzsY(), ci);
    }
}

