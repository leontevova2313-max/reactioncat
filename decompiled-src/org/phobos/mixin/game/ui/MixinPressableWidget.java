/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import java.awt.Color;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4264;
import org.phobos.mixin.game.ui.MixinClickableWidget;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ._3LAObobilITioN96THuwvMKtAdvhcErw;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4264.class})
public abstract class MixinPressableWidget
extends MixinClickableWidget
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Shadow
    public abstract void method_48589(class_332 var1, class_327 var2, int var3);

    @Inject(method={"renderWidget"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderWidgetHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        if (!o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue().booleanValue()) {
            return;
        }
        ci.cancel();
        _3LAObobilITioN96THuwvMKtAdvhcErw.wLb0Yedtepw4LrPRQNhcssNgQwk6lA2r(context.method_51448(), Color.WHITE, this.method_46426(), this.method_46427(), this.method_46426() + this.method_25368(), this.method_46427() + this.method_25364(), 0.0f, () -> {
            _3LAObobilITioN96THuwvMKtAdvhcErw.yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC.cfr_renamed_55(Color.WHITE);
            _3LAObobilITioN96THuwvMKtAdvhcErw.yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        });
        int i = this.field_22763 ? 0xFFFFFF : 0xA0A0A0;
        this.method_48589(context, MixinPressableWidget.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772, i | class_3532.method_15386((float)(this.field_22765 * 255.0f)) << 24);
    }
}

