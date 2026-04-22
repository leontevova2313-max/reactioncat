/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_310;
import net.minecraft.class_312;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.dgVpkxFU8gOPA0bLSOvRKJkkxNkjLsmC;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo.pjdG7AefWspK1Iu3nzEgulRUm2zMGqBC;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_312.class})
public abstract class MixinMouse
implements EventSubscriber {
    @Inject(method={"onMouseScroll"}, at={@At(value="HEAD")})
    private void onMouseScrollHook(long window, double horizontal, double vertical, CallbackInfo ci) {
        if (window != class_310.method_1551().method_22683().method_4490()) {
            return;
        }
        if (_5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ() != null && _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().PMdCLdotybEjPeYpgrv9oPD0ZZIabKWL() != null) {
            _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().PMdCLdotybEjPeYpgrv9oPD0ZZIabKWL().OYssFpdwJwRrcZcUo3yP96nBL4auyaho(vertical);
            return;
        }
    }

    @Inject(method={"onMouseButton"}, at={@At(value="HEAD")})
    private void onMouseButtonHook(long window, int button, int action, int mod, CallbackInfo ci) {
        this.invoke(new dgVpkxFU8gOPA0bLSOvRKJkkxNkjLsmC(button, action, pjdG7AefWspK1Iu3nzEgulRUm2zMGqBC.Mouse));
    }
}

