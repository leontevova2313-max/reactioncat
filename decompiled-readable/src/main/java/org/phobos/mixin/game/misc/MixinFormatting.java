/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import net.minecraft.class_124;
import org.phobos.secure.group009.SecureClass0138;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_124.class})
public abstract class MixinFormatting {
    @Inject(method={"strip"}, at={@At(value="HEAD")}, cancellable=true)
    private static void stripHook(String string, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue((Object)SecureClass0138.BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(string));
    }

    @Inject(method={"byCode"}, at={@At(value="HEAD")}, cancellable=true)
    private static void byCode(char code, CallbackInfoReturnable<class_124> cir) {
        if (code != 'R') {
            return;
        }
        cir.setReturnValue((Object)class_124.field_1070);
    }
}

