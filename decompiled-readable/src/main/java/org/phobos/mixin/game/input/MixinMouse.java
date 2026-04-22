/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_310;
import net.minecraft.class_312;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group013.SecureClass0193;
import org.phobos.secure.group057.SecureEnum0021;
import org.phobos.secure.group022.SecureClass0361;
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
        if (SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ() != null && SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().PMdCLdotybEjPeYpgrv9oPD0ZZIabKWL() != null) {
            SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().PMdCLdotybEjPeYpgrv9oPD0ZZIabKWL().OYssFpdwJwRrcZcUo3yP96nBL4auyaho(vertical);
            return;
        }
    }

    @Inject(method={"onMouseButton"}, at={@At(value="HEAD")})
    private void onMouseButtonHook(long window, int button, int action, int mod, CallbackInfo ci) {
        this.invoke(new SecureClass0193(button, action, SecureEnum0021.Mouse));
    }
}

