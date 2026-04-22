/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1738;
import net.minecraft.class_1741;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_332;
import net.minecraft.class_465;
import org.earthhack.ducks.ISlot;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group007.SecureClass0098;
import org.phobos.secure.group033.qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA;
import org.phobos.secure.group039.SecureClass0687;
import org.phobos.secure.group055.SecureClass1012;
import org.phobos.secure.group058.SecureClass1049;
import org.phobos.secure.group023.TooltipsModule;
import org.phobos.secure.group043.SecureClass0768;
import org.phobos.secure.group050.SecureClass0898;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_465.class})
public abstract class MixinHandledScreen<T extends class_1703>
implements EventSubscriber {
    @Shadow
    protected int field_2776;
    @Shadow
    protected int field_2792;
    @Shadow
    @Nullable
    protected class_1735 field_2787;
    @Shadow
    protected int field_2800;
    @Unique
    private final Color MQqHkx2ryM8igbsdaYh8aiaLZrm5pOUA = new Color(1.0f, 1.0f, 1.0f, 0.2f);
    @Shadow
    @Final
    protected T field_2797;

    @Shadow
    public abstract T method_17577();

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/ingame/HandledScreen;drawSlot(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/screen/slot/Slot;)V"))
    private void renderHook(class_465<T> instance, class_332 context, class_1735 slot) {
        instance.method_2385(context, slot);
        Color color = SecureClass0098.xkZNu2E8u2U5iAp5H7o1sSNTD4mtoGuY(slot);
        if (color != null) {
            int x = slot.field_7873;
            int y = slot.field_7872;
            int width = 16;
            int height = 16;
            context.method_25294(x, y, x + width, y + height, color.hashCode());
        }
        if (!slot.method_7677().method_7960()) {
            return;
        }
        qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA ghostItem = SecureClass1012.aj1rXnYfSNfsx5s1XZL3OXscOp3EAEbE(slot);
        if (ghostItem != null) {
            class_1792 item = ghostItem.d1La58KiNy8OLO5EFL6lRzdJQJv0h9oC();
            int x = slot.field_7873;
            int y = slot.field_7872;
            class_1799 stack = new class_1799((class_1935)item);
            RenderSystem.enableBlend();
            SecureClass1049.Dv7R9f6RtMjCWno3RMzV1TOVj3UIQ1cc(context, stack, x, y, SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color.WHITE, ghostItem.cfr_renamed_50().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY()));
            RenderSystem.disableBlend();
        }
    }

    @Inject(method={"onMouseClick(Lnet/minecraft/screen/slot/Slot;IILnet/minecraft/screen/slot/SlotActionType;)V"}, at={@At(value="HEAD")})
    public void onMouseClickHook(class_1735 slot, int slotId, int button, class_1713 actionType, CallbackInfo ci) {
        this.invoke(new SecureClass0687(slot, slotId, button, actionType), ci);
    }

    @Inject(method={"drawSlot"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawItemInSlot(Lnet/minecraft/client/font/TextRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V", shift=At.Shift.AFTER)})
    private void drawSlotHook1(class_332 context, class_1735 slot, CallbackInfo ci) {
        if (!TooltipsModule.UxToJAcXzd7wz5ZXFmoPWq0HrLZ0NLlL()) {
            return;
        }
        class_1799 stack = slot.method_7677();
        if (!SecureClass0768.cfr_renamed_51(stack)) {
            return;
        }
        int x = slot.field_7873;
        int y = slot.field_7872;
        int seed = slot.field_7873 + slot.field_7872 * this.field_2792;
        class_1799[] stacks = new class_1799[27];
        SecureClass0768.cfr_renamed_52(stack, stacks);
        class_1799 result = this.analyze(stacks);
        if (result != null) {
            result.method_7939(1);
            float scale = 0.69f;
            context.method_51448().method_22903();
            context.method_51448().method_22905(scale, scale, 1.0f);
            context.method_51448().method_46416((float)x / scale + 7.0f, (float)y / scale, 15.0f);
            context.method_51428(result, 0, 0, seed);
            context.method_51448().method_22909();
        }
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        SecureClass0098.EFeatNB76Sw7xBbmriEM7I1bNkjtqiJw();
    }

    @Inject(method={"drawSlot"}, at={@At(value="HEAD")})
    private void drawSlotHook2(class_332 context, class_1735 slot, CallbackInfo ci) {
        ISlot access = (ISlot)slot;
        float renderX = (float)(this.field_2776 + slot.field_7873) + 8.0f;
        float renderY = (float)(this.field_2800 + slot.field_7872) + 8.0f;
        access.setLastRenderX(renderX);
        access.setLastRenderY(renderY);
        access.setLoaded(true);
    }

    @Unique
    @Nullable
    private class_1799 analyze(class_1799 ... stacks) {
        class_1792 item = null;
        class_1799 itemStack = null;
        class_1799[] class_1799Array = stacks;
        int n = class_1799Array.length;
        int n2 = 0;
        while (true) {
            block6: {
                class_1799 stack;
                block8: {
                    block7: {
                        if (n2 >= n) {
                            return itemStack;
                        }
                        stack = class_1799Array[n2];
                        if (stack.method_7960()) break block6;
                        if (item != null) break block7;
                        item = stack.method_7909();
                        itemStack = stack;
                        break block6;
                    }
                    class_1792 stackItem = stack.method_7909();
                    if (!(item instanceof class_1738)) break block8;
                    class_1738 armor1 = (class_1738)item;
                    if (!(stackItem instanceof class_1738)) break block8;
                    class_1738 armor2 = (class_1738)stackItem;
                    if (((class_1741)armor1.method_7686().comp_349()).equals(armor2.method_7686().comp_349())) break block6;
                }
                if (!stack.method_31574(item)) {
                    return null;
                }
            }
            ++n2;
        }
    }

    @Inject(method={"isPointOverSlot"}, at={@At(value="HEAD")}, cancellable=true)
    private void isPointOverSlotHook(class_1735 slot, double pointX, double pointY, CallbackInfoReturnable<Boolean> cir) {
    }
}

