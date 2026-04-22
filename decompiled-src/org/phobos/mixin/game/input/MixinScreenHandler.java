/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.iYmlth7CCSgNLAYAj7emZLZlCtV7pBKQ;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1703.class})
public abstract class MixinScreenHandler
implements EventSubscriber {
    @Inject(method={"internalOnSlotClick"}, at={@At(value="HEAD")}, cancellable=true)
    private void internalOnSlotClick(int slotIndex, int button, class_1713 actionType, class_1657 player, CallbackInfo ci) {
        this.invoke(new iYmlth7CCSgNLAYAj7emZLZlCtV7pBKQ(slotIndex, button, actionType), ci);
    }
}

