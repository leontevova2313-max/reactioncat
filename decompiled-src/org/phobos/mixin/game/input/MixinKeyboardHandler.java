/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_309;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.dgVpkxFU8gOPA0bLSOvRKJkkxNkjLsmC;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo.pjdG7AefWspK1Iu3nzEgulRUm2zMGqBC;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_309.class})
public abstract class MixinKeyboardHandler
implements EventSubscriber {
    @Inject(method={"onKey"}, at={@At(value="HEAD")})
    private void onKeyHook(long ctx, int key, int scan, int action, int mod, CallbackInfo ci) {
        this.invoke(new dgVpkxFU8gOPA0bLSOvRKJkkxNkjLsmC(key, action, pjdG7AefWspK1Iu3nzEgulRUm2zMGqBC.Keyboard));
    }
}

