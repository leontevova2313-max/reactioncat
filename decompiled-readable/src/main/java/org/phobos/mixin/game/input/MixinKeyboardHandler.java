/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_309;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group013.SecureClass0193;
import org.phobos.secure.group057.SecureEnum0021;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_309.class})
public abstract class MixinKeyboardHandler
implements EventSubscriber {
    @Inject(method={"onKey"}, at={@At(value="HEAD")})
    private void onKeyHook(long ctx, int key, int scan, int action, int mod, CallbackInfo ci) {
        this.invoke(new SecureClass0193(key, action, SecureEnum0021.Keyboard));
    }
}

