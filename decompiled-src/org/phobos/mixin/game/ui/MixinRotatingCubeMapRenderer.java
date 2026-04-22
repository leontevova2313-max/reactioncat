/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_332;
import net.minecraft.class_766;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.s7DAjgNhRmduZVDyDddmFhhDDl4kBube;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ._3LAObobilITioN96THuwvMKtAdvhcErw;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_766.class})
public abstract class MixinRotatingCubeMapRenderer
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook1(class_332 context, int width, int height, float alpha, float tickDelta, CallbackInfo ci) {
        if (!o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue().booleanValue()) {
            return;
        }
        ci.cancel();
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 buffer = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        _3LAObobilITioN96THuwvMKtAdvhcErw.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(context.method_51448().method_23760().method_23761(), buffer, 0.0f, 0.0f, P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4486(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4502(), 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH.gHJwmeSUBBEgBfahMf2YOBSM7U6DOYqf();
        _3LAObobilITioN96THuwvMKtAdvhcErw.F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(buffer);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }
}

