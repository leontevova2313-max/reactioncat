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
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group010.SecureClass0158;
import org.phobos.secure.group058.SecureClass1049;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_766.class})
public abstract class MixinRotatingCubeMapRenderer
implements SecureInterface0134 {
    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHook1(class_332 context, int width, int height, float alpha, float tickDelta, CallbackInfo ci) {
        if (!SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue().booleanValue()) {
            return;
        }
        ci.cancel();
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 buffer = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        SecureClass1049.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(context.method_51448().method_23760().method_23761(), buffer, 0.0f, 0.0f, P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4486(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4502(), 0.0f);
        SecureClass1049.F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH.gHJwmeSUBBEgBfahMf2YOBSM7U6DOYqf();
        SecureClass1049.F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(buffer);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }
}

