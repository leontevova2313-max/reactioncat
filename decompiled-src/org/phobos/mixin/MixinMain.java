/*
 * Decompiled with CFR.
 */
package org.phobos.mixin;

import net.minecraft.client.main.Main;
import org.phobos.secure.SFDLLxag6BrgT2xFaaiwM4KXMC6N6SbP.tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.GuDaBzG3RH97yDubrjy6K5yWeYQ5Ovvz;
import org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf.oqy1dmxQlZnwm9WGcb8U2ZTgastatAq1;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Main.class})
public abstract class MixinMain {
    @Inject(method={"main"}, at={@At(value="HEAD")})
    private static void mainHook(String[] args, CallbackInfo ci) {
        System.setProperty("java.awt.headless", "false");
        tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5.iWqZeAyMkBFZSh6IMc4S4BlCbRTxM3aP = GuDaBzG3RH97yDubrjy6K5yWeYQ5Ovvz.Nkcshc87OhJDjdLPPb5pFZXmhUK5iTHE("phobos&optout**", "1");
        oqy1dmxQlZnwm9WGcb8U2ZTgastatAq1.S9SmlD7Bg7z0FkLTLwoeWnagm9sZt1D5();
    }
}

