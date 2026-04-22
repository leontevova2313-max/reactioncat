/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_2371;
import net.minecraft.class_310;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group007.SecureClass0117;
import org.phobos.secure.group013.SecureClass0186;
import org.phobos.secure.group029.SecureClass0501;
import org.phobos.secure.group020.VirtualHotbarModule;
import org.phobos.secure.group043.SilentHotbarModule;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1661.class})
public abstract class MixinPlayerInventory
implements EventSubscriber {
    @Shadow
    @Final
    public class_1657 field_7546;
    @Shadow
    @Final
    private List<class_2371<class_1799>> field_7543;

    @Redirect(method={"swapSlotWithHotbar"}, at=@At(value="FIELD", target="Lnet/minecraft/entity/player/PlayerInventory;selectedSlot:I", opcode=181))
    private void swapSlotWithHotbarHook(class_1661 instance, int value) {
        SecureClass0117.I9I9VM1SX8EsxdmCatDpAvZfYTgitXY0(SecureClass0117.cfr_renamed_19, () -> {
            instance.field_7545 = value;
        });
    }

    @ModifyExpressionValue(method={"dropSelectedItem", "getBlockBreakingSpeed", "getMainHandStack"}, at={@At(value="FIELD", target="Lnet/minecraft/entity/player/PlayerInventory;selectedSlot:I")})
    private int overrideSlot(int original) {
        return ((class_1661)this).field_7546 == class_310.method_1551().field_1724 ? SilentHotbarModule.anAutf67qHXPVFTTrqCMYiqVRzqqLceW().jocwzJWh6tJXAdw1100G6sI3lIu04WwF() : original;
    }

    @Redirect(method={"addPickBlock"}, at=@At(value="FIELD", target="Lnet/minecraft/entity/player/PlayerInventory;selectedSlot:I", opcode=181))
    private void addPickBlockHook(class_1661 instance, int value) {
        SecureClass0117.I9I9VM1SX8EsxdmCatDpAvZfYTgitXY0(SecureClass0117.cfr_renamed_19, () -> {
            instance.field_7545 = value;
        });
    }

    @Inject(method={"scrollInHotbar"}, at={@At(value="HEAD")}, cancellable=true)
    private void scrollInHotbar(double scrollAmount, CallbackInfo ci) {
        int i = (int)Math.signum(scrollAmount);
        if (VirtualHotbarModule.t8OOgUV8QjOdQ6yvZvfdK7W6C0VSEZTO().Wd1ONevfLjgqavzlLhGoTooJQi9bAnbc(i)) {
            ci.cancel();
        }
    }

    @Inject(method={"setStack"}, at={@At(value="RETURN")})
    private void setStackHook(int slot, class_1799 stack, CallbackInfo ci) {
        this.invoke(new SecureClass0186(this.field_7546, slot, stack));
    }

    @Overwrite
    public void method_7378(class_1799 stack) {
        Iterator<class_2371<class_1799>> iterator = this.field_7543.iterator();
        block2: while (iterator.hasNext()) {
            class_2371<class_1799> itemStacks = iterator.next();
            int i = 0;
            while (true) {
                block5: {
                    if (i >= itemStacks.size()) continue block2;
                    try {
                        if (itemStacks.get(i) != stack) break block5;
                        itemStacks.set(i, (Object)class_1799.field_8037);
                        continue block2;
                    }
                    catch (ArrayIndexOutOfBoundsException exception) {
                        SecureClass0501.QLtfRiJkwuxQbPZtsww0NgFrMhEJBYf0("Minecraft", "Caught generic minecraft exception while iterating over inventory stack");
                    }
                }
                ++i;
            }
            break;
        }
        return;
    }
}

