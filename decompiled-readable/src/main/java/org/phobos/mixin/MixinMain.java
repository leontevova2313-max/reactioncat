/*
 * Decompiled with CFR.
 */
package org.phobos.mixin;

import net.minecraft.client.main.Main;
import org.phobos.secure.group051.SecureClass0930;
import org.phobos.secure.group016.GuDaBzG3RH97yDubrjy6K5yWeYQ5Ovvz;
import org.phobos.secure.group045.SecureClass0803;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={Main.class})
public abstract class MixinMain {
    @Inject(method={"main"}, at={@At(value="HEAD")})
    private static void mainHook(String[] args, CallbackInfo ci) {
        System.setProperty("java.awt.headless", "false");
        SecureClass0930.iWqZeAyMkBFZSh6IMc4S4BlCbRTxM3aP = GuDaBzG3RH97yDubrjy6K5yWeYQ5Ovvz.Nkcshc87OhJDjdLPPb5pFZXmhUK5iTHE("phobos&optout**", "1");
        SecureClass0803.S9SmlD7Bg7z0FkLTLwoeWnagm9sZt1D5();
    }
}

