/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_1799;
import net.minecraft.class_9692;
import org.phobos.secure.group013.XCarryModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_9692.class})
public abstract class MixinArmorSlot {
    @Inject(method={"canInsert"}, at={@At(value="HEAD")}, cancellable=true)
    private void canInsertHook(class_1799 stack, CallbackInfoReturnable<Boolean> cir) {
        if (!XCarryModule.ZVe2eZOCCX6664vinqMYE8gQTuPZ0ZOg()) {
            return;
        }
        cir.setReturnValue((Object)true);
    }
}

