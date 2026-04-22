/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import net.minecraft.class_1041;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_344;
import net.minecraft.class_3532;
import net.minecraft.class_4185;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import net.minecraft.class_7077;
import net.minecraft.class_8020;
import net.minecraft.class_8666;
import org.earthhack.ducks.ITitleScreen;
import org.earthhack.mixin.EventSubscriber;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.nanovg.NanoVG;
import org.phobos.mixin.game.ui.MixinScreen;
import org.phobos.secure.group002.SecureClass0014;
import org.phobos.secure.group004.SecureClass0064;
import org.phobos.secure.group007.IRCModule;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group026.Yo4iGtKBdcMgOetnZ2SnZpdv8P9Gjw2p;
import org.phobos.secure.group033.SecureClass0587;
import org.phobos.secure.group041.SecureClass0731;
import org.phobos.secure.group051.t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI;
import org.phobos.secure.group058.SecureClass1049;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group031.SecureClass0548;
import org.phobos.secure.group046.SecureClass0822;
import org.phobos.secure.group053.SecureClass0959;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_442.class})
public abstract class MixinTitleScreen
extends MixinScreen
implements EventSubscriber,
SecureInterface0134,
ITitleScreen {
    @Unique
    private String line = null;
    @Unique
    private final SecureClass0822 yhgPYtTa0ZeWnOKI6DF6LDzuIka33QFR;
    @Unique
    private static final class_2960 BUTTON = class_2960.method_60654((String)"phoboslite:icon/icon_button");
    @Shadow
    private boolean field_18222;
    @Shadow
    private long field_17772;
    @Unique
    private static final class_2960 BUTTON_FOCUSED = class_2960.method_60654((String)"phoboslite:icon/icon_button_focused");
    @Unique
    private final kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 GlgOJqkWU5pT2gOIV8BRwM3kx2FYBWD1 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
    @Unique
    private final SecureClass0959 chatAnimation = new SecureClass0959(150L);
    @Unique
    private String iaYZSJ1xTJkCBPMeuSDluk2IYkJhJj5U = null;
    @Unique
    private static final class_2960 LOGO = class_2960.method_60655((String)"phoboslite", (String)"textures/logo.png");

    @Override
    @Unique
    public void onMessage() {
        this.chatAnimation.C1nsJ5zFHgdT7jsy4SYMduKesBBbMx4e(System.currentTimeMillis());
    }

    @Unique
    private boolean cfr_renamed_57(int key) {
        return GLFW.glfwGetMouseButton((long)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4490(), (int)key) == 1;
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        int i;
        float g;
        if (IRCModule.wBHYAnmithoSupd4xWGPoEClth020dLw() == null || !IRCModule.wBHYAnmithoSupd4xWGPoEClth020dLw().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() || SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ() == null || SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().lt6xZvoJKQKE6SUt1W8d8Ef6uJON4yLr() == null) {
            return;
        }
        float f = 1.0f;
        if (this.field_18222 && !((g = (float)(class_156.method_658() - this.field_17772) / 2000.0f) > 1.0f)) {
            g = class_3532.method_15363((float)g, (float)0.0f, (float)1.0f);
            f = class_3532.method_37958((float)g, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
        }
        if (((i = class_3532.method_15386((float)(f * 255.0f)) << 24) & 0xFC000000) != 0) {
            this.start();
            int height = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4502();
            int width = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4486();
            float y = (float)height - (float)height / 5.0f;
            float h = y + (float)height / 3.0f;
            float x = 2.0f;
            float w = (float)width / 2.0f;
            this.yAEjMtW234dVHMRSkOwvqmahOdG3Z4ya(x, y - (float)height / 3.0f, w, h);
            int offset = -10;
            for (String message : SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().lt6xZvoJKQKE6SUt1W8d8Ef6uJON4yLr().cfr_renamed_58()) {
                SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().Coc8O1mhqylOd8QqQG68lJi0NXLgNNIu(context, message, x, y + (float)offset + this.chatAnimation.LwGJEsHLwLepsbeEollOvRkMzBVn6N9Y(Yo4iGtKBdcMgOetnZ2SnZpdv8P9Gjw2p.rehEbW2M95i0ja9BI1GiidLnsZMo3eI4) * 10.0f, new Color(0xFFFFFF | i), 1.0f, true);
                offset -= 12;
            }
            this.yzX3tt7rFtzGYIDVQKWwMTzIlXNY58Hx();
            this.cfr_renamed_59();
        }
    }

    @Unique
    public void yzX3tt7rFtzGYIDVQKWwMTzIlXNY58Hx() {
        long ctx = this.kVmIZKMkXy5ePX4i4c9DPdU5tAlFIY7z();
        NanoVG.nvgResetScissor(ctx);
        NanoVG.nvgRestore(ctx);
        this.yECU9dNp70Fhj1AOR73Uz6woFkGeYaVY(this.yhgPYtTa0ZeWnOKI6DF6LDzuIka33QFR.cfr_renamed_60());
    }

    @Unique
    private void cfr_renamed_59() {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().cfr_renamed_59();
    }

    private void yECU9dNp70Fhj1AOR73Uz6woFkGeYaVY(SecureClass0064 section) {
        if (section == null) {
            RenderSystem.disableScissor();
            return;
        }
        class_1041 w = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683();
        int i = w.method_4507();
        double d = w.method_4495();
        double e = section.eKZ73f2douAU3GiROAWwHeWMUGlncFat() * d;
        double f = (double)i - section.HTYdzZKpZicHGhh56X34CRBpSFnRGVvP() * d;
        double g = section.yLB9XU0XwbjUZxGJS6Sl8tzSxJXRbqQm() * d;
        double h = section.ByYwh6RlerXkmCXhdBmeR8mWpMb92DpK() * d;
        RenderSystem.enableScissor((int)((int)e), (int)((int)f), (int)Math.max(0, (int)g), (int)Math.max(0, (int)h));
    }

    private void update0() {
        SecureClass0548.E7vvPTJKcXc8d62XjdIOI28YTYVaXP3N(text -> {
            this.iaYZSJ1xTJkCBPMeuSDluk2IYkJhJj5U = text;
        });
    }

    @Inject(method={"<init>(ZLnet/minecraft/client/gui/LogoDrawer;)V"}, at={@At(value="TAIL")})
    private void initHook(boolean doBackgroundFade, class_8020 logoDrawer, CallbackInfo ci) {
        this.invoke(new SecureClass0014<class_437>((class_437)class_437.class.cast(this)));
        SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.BNFRO6OQogkMSbPCmFxs8ehe9WfxSPGP(() -> {
            if (SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H() == null) {
                return;
            }
            this.line = this.code(SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H().TRtJL8LJ7isXaPlFPqWfsDmss8gV6DTx()) + "Sydney";
            this.update0();
        });
    }

    @Unique
    private long kVmIZKMkXy5ePX4i4c9DPdU5tAlFIY7z() {
        return SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().kVmIZKMkXy5ePX4i4c9DPdU5tAlFIY7z();
    }

    @Unique
    private String code(t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI permission) {
        return permission.getFormatting();
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/DrawContext;drawTextWithShadow(Lnet/minecraft/client/font/TextRenderer;Ljava/lang/String;III)I"))
    private int renderHook2(class_332 instance, class_327 textRenderer, String text, int x, int y, int color) {
        if (this.line == null || this.iaYZSJ1xTJkCBPMeuSDluk2IYkJhJj5U == null) {
            return instance.method_25303(textRenderer, text, x, y, color);
        }
        if (this.GlgOJqkWU5pT2gOIV8BRwM3kx2FYBWD1.cfr_renamed_61(30000L)) {
            this.update0();
        }
        instance.method_25303(MixinTitleScreen.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772, this.iaYZSJ1xTJkCBPMeuSDluk2IYkJhJj5U, 2, 2, color);
        instance.method_25303(MixinTitleScreen.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772, "Logged in as " + this.line + "\u00a7r", 2, 14, color);
        return instance.method_25303(textRenderer, text.replaceAll("/Fabric \\(Modded\\)", ""), x, y, color);
    }

    @Unique
    private void start() {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().start();
    }

    @Unique
    public void yAEjMtW234dVHMRSkOwvqmahOdG3Z4ya(double x, double y, double w, double h) {
        long ctx = this.kVmIZKMkXy5ePX4i4c9DPdU5tAlFIY7z();
        NanoVG.nvgSave(ctx);
        NanoVG.nvgIntersectScissor(ctx, (float)x, (float)y, (float)w, (float)h);
        this.yECU9dNp70Fhj1AOR73Uz6woFkGeYaVY(this.yhgPYtTa0ZeWnOKI6DF6LDzuIka33QFR.xmtUulPCZ8tpYTFACN3qnGUFJ1iIcRq5(new SecureClass0064(x, y, w, h)));
    }

    @Override
    @Unique
    public void T8sEDqlbuTMyksbojDTczQZwY1phkt4R() {
        this.update0();
    }

    public MixinTitleScreen() {
        this.yhgPYtTa0ZeWnOKI6DF6LDzuIka33QFR = new SecureClass0822();
    }

    @Redirect(method={"init"}, at=@At(value="NEW", target="(IIIILnet/minecraft/text/Text;Lnet/minecraft/client/gui/widget/ButtonWidget$PressAction;Lnet/minecraft/client/font/TextRenderer;)Lnet/minecraft/client/gui/widget/PressableTextWidget;"))
    private class_7077 initHook2(int x, int y, int width, int height, class_2561 text, class_4185.class_4241 onPress, class_327 textRenderer) {
        class_5250 copyright = class_2561.method_43470((String)"Copyright Phobos Ltd.");
        int length = this.field_22793.method_27525((class_5348)copyright);
        int offset = this.field_22789 - length - 2;
        return new class_7077(offset, y, length, height, (class_2561)copyright, button -> {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI("https://discord.gg/3arthh4ck"));
            }
            catch (Throwable throwable) {
                onPress.onPress(button);
            }
        }, textRenderer);
    }

    @Inject(method={"init"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/gui/widget/TextIconButtonWidget;setPosition(II)V", ordinal=1)})
    private void initHook(CallbackInfo ci) {
        assert (this.field_22787 != null);
        int l = this.field_22790 / 4 + 48;
        class_344 icon = this.method_37063(this.createUIButton(button -> this.field_22787.method_1507(SecureClass0587.cfr_renamed_62.cfr_renamed_63())));
        icon.method_48229(this.field_22789 / 2 + 104, l + 72 + 12 - 15 - 8);
        icon.method_25358(20);
        icon.method_53533(20);
    }

    @Inject(method={"init"}, at={@At(value="TAIL")})
    private void initHook1(CallbackInfo ci) {
        if (!SecureClass0731.VDen463tbYA1lRt2uhYYfNI2RZhNbklk) {
            P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1507((class_437)new SecureClass0731());
        }
    }

    @Unique
    private class_344 createUIButton(class_4185.class_4241 onPress) {
        return new class_344(0, 0, 0, 0, new class_8666(BUTTON, BUTTON_FOCUSED), onPress){

            public void method_48579(class_332 context, int mouseX, int mouseY, float delta) {
                if (SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue().booleanValue()) {
                    SecureClass1049.wLb0Yedtepw4LrPRQNhcssNgQwk6lA2r(context.method_51448(), Color.WHITE, this.method_46426(), this.method_46427(), this.method_46426() + this.method_25368(), this.method_46427() + this.method_25364(), 0.0f, () -> {
                        SecureClass1049.yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC.cfr_renamed_55(Color.WHITE);
                        SecureClass1049.yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
                    });
                    int offset = 2;
                    RenderSystem.setShaderTexture((int)0, (class_2960)LOGO);
                    SecureClass1049.cfr_renamed_64(context.method_51448(), this.method_46426() + offset, this.method_46427() + offset, this.field_22758 - offset * 2, this.field_22759 - offset * 2);
                    return;
                }
                float f = 1.0f;
                if (MixinTitleScreen.this.field_18222) {
                    float g = (float)(class_156.method_658() - MixinTitleScreen.this.field_17772) / 2000.0f;
                    if (g <= 1.0f) {
                        g = class_3532.method_15363((float)g, (float)0.0f, (float)1.0f);
                        f = class_3532.method_37958((float)g, (float)0.5f, (float)1.0f, (float)0.0f, (float)1.0f);
                    }
                    this.method_25350(f);
                }
                super.method_48579(context, mouseX, mouseY, delta);
            }
        };
    }
}

