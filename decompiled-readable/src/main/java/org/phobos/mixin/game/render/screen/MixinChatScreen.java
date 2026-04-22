/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.screen;

import java.awt.Color;
import net.minecraft.class_2558;
import net.minecraft.class_2583;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_408;
import org.earthhack.ducks.IChatScreen;
import org.earthhack.ducks.IClickEvent;
import org.jetbrains.annotations.Nullable;
import org.phobos.mixin.game.ui.MixinScreen;
import org.phobos.secure.group007.skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N;
import org.phobos.secure.group014.ChatModule;
import org.phobos.secure.group041.SecureClass0728;
import org.phobos.secure.group055.SecureClass0997;
import org.phobos.secure.group057.SecureClass1039;
import org.phobos.secure.group060.ColorsModule;
import org.phobos.secure.group063.SecureClass1154;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_408.class})
public abstract class MixinChatScreen
extends MixinScreen
implements IChatScreen,
SecureInterface0134 {
    @Shadow
    protected class_342 field_2382;

    @Unique
    private void renderOutline(SecureClass1039 uiManager, class_332 instance, int x1, int y1, int x2, int y2) {
        float alpha = uiManager.STtDfUbYBadHDlTb7uasuc21Y68aWdfE().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
        if (alpha <= 0.05f) {
            return;
        }
        Color color = SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(ColorsModule.CBbCYalAkLz95FQbLPBJwWcEs1cg1qoI().eJJoBQSdiwzH620Ib47BRI67ywgI6gn0.getValue(), alpha);
        instance.method_49601(x1, y1, x2 - x1, y2 - y1, color.hashCode());
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/util/math/MatrixStack;pop()V", ordinal=0)}, cancellable=true)
    private void renderHook2(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!ChatModule.cfr_renamed_44()) {
            return;
        }
        ci.cancel();
    }

    @Inject(method={"onChatFieldUpdate"}, at={@At(value="HEAD")})
    private void onChatFieldUpdateHook(String chatText, CallbackInfo ci) {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().xL1ePIqDdUqNhZuCBHuzZ9fVbK8YNR3q().VdF1ufS91BCMAao2vy0fFL4vLdIfgHvj(this.field_2382.method_1882());
    }

    @Override
    public class_342 getChatField() {
        return this.field_2382;
    }

    @Shadow
    @Nullable
    protected abstract class_2583 method_44052(double var1, double var3);

    @Inject(method={"keyPressed"}, at={@At(value="HEAD")}, cancellable=true)
    private void keyPressedHook(int keyCode, int scanCode, int modifiers, CallbackInfoReturnable<Boolean> cir) {
        if (keyCode != 258) {
            return;
        }
        SecureClass0728 manager = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().xL1ePIqDdUqNhZuCBHuzZ9fVbK8YNR3q();
        String suggestion = manager.RTyboAqcVCXJWK5Q3djyjEhjMsaRJ6vf().cfr_renamed_45();
        if (suggestion == null) {
            return;
        }
        this.field_2382.method_1852(suggestion);
        cir.setReturnValue((Object)true);
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/widget/TextFieldWidget;render(Lnet/minecraft/client/gui/DrawContext;IIF)V")})
    private void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (ChatModule.cfr_renamed_44()) {
            return;
        }
        SecureClass0728 manager = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().xL1ePIqDdUqNhZuCBHuzZ9fVbK8YNR3q();
        String suggestion = manager.RTyboAqcVCXJWK5Q3djyjEhjMsaRJ6vf().cfr_renamed_45();
        if (suggestion == null) {
            return;
        }
        context.method_25303(MixinChatScreen.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772, suggestion, this.field_2382.method_46426(), this.field_2382.method_46427(), ChatModule.mFqSDQxgxC8Ynu5djo4ZqDWjF8YLlFy2);
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;fill(IIIII)V"))
    private void renderHook(class_332 instance, int x1, int y1, int x2, int y2, int color) {
        SecureClass1039 uiManager = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().XVcV3CWbNNhp1FM0aDURWJGVCIXpfLLQ();
        uiManager.STtDfUbYBadHDlTb7uasuc21Y68aWdfE().uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(SecureClass1154.burMvkdaV7AK7QhLRtKKTksQkXJnZ4Bx().cfr_renamed_46(this.field_2382.method_1882()) ? 1.0f : 0.0f);
        if (ChatModule.cfr_renamed_44()) {
            return;
        }
        instance.method_25294(x1, y1, x2, y2, color);
        this.renderOutline(uiManager, instance, x1, y1, x2, y2);
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void renderHook1(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        class_2583 style = this.method_44052(mouseX, mouseY);
        if (style == null) {
            SecureClass0997.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            return;
        }
        class_2558 event = style.method_10970();
        if (event == null) {
            SecureClass0997.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            return;
        }
        IClickEvent clickEvent = IClickEvent.cast(event);
        if (clickEvent.getCallbacks().isEmpty()) {
            SecureClass0997.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            return;
        }
        SecureClass0997.tdtL04cdASt1wPu11c1DKmRz6wY2mczX(skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N.Link);
    }
}

