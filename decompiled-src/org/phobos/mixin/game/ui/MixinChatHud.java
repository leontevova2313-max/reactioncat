/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import net.minecraft.class_2561;
import net.minecraft.class_303;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_338;
import net.minecraft.class_3532;
import net.minecraft.class_7469;
import net.minecraft.class_7591;
import org.earthhack.ducks.IChat;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.mERkhK9y8fik4XNAIPHFIsMZJfbADFGq;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC._6eGPLTOuGtnoBaNVY9hrtujruHQWQ9Zn;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.Yo4iGtKBdcMgOetnZ2SnZpdv8P9Gjw2p;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.ni6jptcWehG2zBzrVi5Be0JfyG3W0sMr;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.Qb4ct0NUV8iH1cS2Gg9xr6K06cliZVaT;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.FMsYKFlpY8rOSgpoS0nPPF8bnY42Onqe;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_338.class})
public abstract class MixinChatHud
implements IChat,
EventSubscriber {
    @Unique
    private int prevScrolledLines;
    @Shadow
    private boolean field_2067;
    @Unique
    private boolean logLock = false;
    @Unique
    private final FMsYKFlpY8rOSgpoS0nPPF8bnY42Onqe chatAnimation = new FMsYKFlpY8rOSgpoS0nPPF8bnY42Onqe(150L);
    @Shadow
    private int field_2066;
    @Shadow
    @Final
    private List<class_303.class_7590> field_2064;
    @Unique
    private boolean FD2RmWQp4xfZQWQ0RtjRumFo3ed9XRaj = false;
    @Shadow
    @Final
    private class_310 field_2062;
    @Shadow
    @Final
    private List<class_303> field_2061;
    @Unique
    private long prevAnimation;

    @Inject(method={"drawIndicatorIcon"}, at={@At(value="HEAD")}, cancellable=true)
    private void drawIndicatorIconHook(class_332 context, int x, int y, class_7591.class_7592 icon, CallbackInfo ci) {
        if (mERkhK9y8fik4XNAIPHFIsMZJfbADFGq.cfr_renamed_47().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && !mERkhK9y8fik4XNAIPHFIsMZJfbADFGq.cfr_renamed_47().fa1nm0bscTGFrCqnmMdJUlOISkBUioSS().getValue().booleanValue()) {
            ci.cancel();
        }
    }

    @Shadow
    public abstract int method_1811();

    @Shadow
    protected abstract double method_44724(double var1);

    @Shadow
    protected abstract int method_45588(double var1, double var3);

    @Inject(method={"addVisibleMessage"}, at={@At(value="HEAD")})
    private void addVisibleMessageHook(class_303 message, CallbackInfo ci) {
        this.chatAnimation.C1nsJ5zFHgdT7jsy4SYMduKesBBbMx4e(System.currentTimeMillis());
    }

    @Unique
    private void withLogLock(Runnable runnable) {
        this.logLock = true;
        runnable.run();
        this.logLock = false;
    }

    @Shadow
    protected abstract int method_44720(class_303.class_7590 var1);

    @Shadow
    public abstract void method_44811(class_2561 var1, @Nullable class_7469 var2, @Nullable class_7591 var3);

    @Unique
    private static double getMessageOpacityMultiplier0(int age) {
        double d = (double)age / 200.0;
        d = 1.0 - d;
        d *= 10.0;
        d = class_3532.method_15350((double)d, (double)0.0, (double)1.0);
        d *= d;
        return d;
    }

    @Shadow
    protected abstract void method_44813();

    @Override
    public void backup() {
        this.prevScrolledLines = this.field_2066;
        this.prevAnimation = this.chatAnimation.XIj21zqGoJOl13NQ5icGuT9fMpddOVxz();
    }

    @Inject(method={"logChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void logChatMessage(class_303 message, CallbackInfo ci) {
        if (!this.logLock) {
            return;
        }
        ci.cancel();
    }

    @Shadow
    protected abstract void method_1815(class_303 var1);

    @Shadow
    public abstract double method_1814();

    @Shadow
    protected abstract boolean method_23677();

    @Shadow
    protected abstract int method_44752();

    @Overwrite
    public void method_1805(class_332 context, int currentTick, int mouseX, int mouseY, boolean focused) {
        int x;
        int v;
        int u;
        int t;
        if (_6eGPLTOuGtnoBaNVY9hrtujruHQWQ9Zn.cfr_renamed_48()) {
            return;
        }
        if (this.method_23677()) {
            return;
        }
        int visibleCount = this.method_1813();
        int chatLinesSize = this.field_2064.size();
        if (chatLinesSize == 0) {
            return;
        }
        float scaling = (float)this.method_1814();
        int chatWidth = class_3532.method_15386((float)((float)this.method_1811() / scaling));
        int height = context.method_51443();
        context.method_51448().method_22903();
        context.method_51448().method_22905(scaling, scaling, 1.0f);
        context.method_51448().method_46416(4.0f, 0.0f, 0.0f);
        int startY = class_3532.method_15375((float)((float)(height - 40) / scaling));
        int messageIndex = this.method_45588(this.method_44722(mouseX), this.method_44724(mouseY));
        double chatOpacity = (Double)this.field_2062.field_1690.method_42542().method_41753() * (double)0.9f + (double)0.1f;
        double textBgOpacity = (Double)this.field_2062.field_1690.method_42550().method_41753();
        double lineSpacing = (Double)this.field_2062.field_1690.method_42546().method_41753();
        int lineHeight = this.method_44752();
        int yOffset = (int)((float)((int)Math.round(-8.0 * (lineSpacing + 1.0) + 4.0 * lineSpacing)) + (mERkhK9y8fik4XNAIPHFIsMZJfbADFGq.cfr_renamed_49() ? this.chatAnimation.LwGJEsHLwLepsbeEollOvRkMzBVn6N9Y(Yo4iGtKBdcMgOetnZ2SnZpdv8P9Gjw2p.rehEbW2M95i0ja9BI1GiidLnsZMo3eI4) * 10.0f : 0.0f));
        class_303.class_7590 first = this.field_2064.getFirst();
        int q = 0;
        for (int r = 0; r + this.field_2066 < this.field_2064.size() && r < visibleCount; ++r) {
            double h;
            int s = r + this.field_2066;
            class_303.class_7590 visible = this.field_2064.get(s);
            if (visible == null || (t = currentTick - visible.comp_895()) >= 200 && !focused) continue;
            double d = h = focused ? 1.0 : MixinChatHud.getMessageOpacityMultiplier0(t);
            if (!focused && t <= 10 && mERkhK9y8fik4XNAIPHFIsMZJfbADFGq.cfr_renamed_49()) {
                h = class_3532.method_15350((double)((double)t / 10.0 * 2.2553862), (double)0.0, (double)h);
            }
            u = (int)(255.0 * h * chatOpacity);
            v = (int)(255.0 * h * textBgOpacity);
            ++q;
            if (u <= 3) continue;
            x = startY - r * lineHeight;
            int y = x + yOffset;
            int shiftY = 0;
            int shiftX = 0;
            y += shiftY;
            context.method_25294(-4, x - lineHeight + shiftY, chatWidth + 8, x + shiftY, v << 24);
            class_7591 messageIndicator = visible.comp_897();
            if (messageIndicator != null) {
                int z = messageIndicator.comp_899() | u << 24;
                context.method_25294(-4, x - lineHeight + shiftY, -2, x + shiftY, z);
                if (s == messageIndex && messageIndicator.comp_900() != null) {
                    int aa = this.method_44720(visible);
                    Objects.requireNonNull(this.field_2062.field_1772);
                    int ab = y + 9;
                    this.method_44719(context, aa, ab, messageIndicator.comp_900());
                }
            }
            context.method_51448().method_22903();
            context.method_51448().method_46416(0.0f, 0.0f, 50.0f);
            context.method_35720(this.field_2062.field_1772, visible.comp_896(), -shiftX, y, 0xFFFFFF + (u << 24));
            context.method_51448().method_22909();
        }
        long ac = this.field_2062.method_44714().method_44944();
        if (ac > 0L) {
            int ad = (int)(128.0 * chatOpacity);
            t = (int)(255.0 * textBgOpacity);
            context.method_51448().method_22903();
            context.method_51448().method_46416(0.0f, (float)startY, 0.0f);
            context.method_25294(-2, 0, chatWidth + 4, 9, t << 24);
            context.method_51448().method_46416(0.0f, 0.0f, 50.0f);
            context.method_27535(this.field_2062.field_1772, (class_2561)class_2561.method_43469((String)"chat.queue", (Object[])new Object[]{ac}), 0, 1, 0xFFFFFF + (ad << 24));
            context.method_51448().method_22909();
        }
        if (focused) {
            int ad = this.method_44752();
            t = chatLinesSize * ad;
            int ae = q * ad;
            int af = this.field_2066 * ae / chatLinesSize - startY;
            u = ae * ae / t;
            if (t != ae) {
                v = af > 0 ? 170 : 96;
                int w = this.field_2067 ? 0xCC3333 : 0x3333AA;
                x = chatWidth + 4;
                context.method_51737(x, -af, x + 2, -af - u, 100, w + (v << 24));
                context.method_51737(x + 2, -af, x + 1, -af - u, 100, 0xCCCCCC + (v << 24));
            }
        }
        context.method_51448().method_22909();
    }

    @Inject(method={"addMessage(Lnet/minecraft/text/Text;Lnet/minecraft/network/message/MessageSignatureData;Lnet/minecraft/client/gui/hud/MessageIndicator;)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void addMessageHook(class_2561 message, class_7469 signatureData, class_7591 indicator, CallbackInfo ci) {
        if (this.FD2RmWQp4xfZQWQ0RtjRumFo3ed9XRaj) {
            return;
        }
        Qb4ct0NUV8iH1cS2Gg9xr6K06cliZVaT event = this.invoke(new Qb4ct0NUV8iH1cS2Gg9xr6K06cliZVaT(message, signatureData));
        if (event.isCancelled()) {
            ci.cancel();
            return;
        }
        if (event.Na9IBGb23h8QjZN4l9QU1s2rsdx4EWQX()) {
            ci.cancel();
            this.FD2RmWQp4xfZQWQ0RtjRumFo3ed9XRaj = true;
            this.method_44811(event.OFyRpLmyzyLIglr2q5RhMfxijV8nTTDH(), signatureData, indicator);
            this.FD2RmWQp4xfZQWQ0RtjRumFo3ed9XRaj = false;
        }
    }

    @Override
    public void m51Gu4pdLKXOMEPjuw48HQ5io9iGfi20() {
        ArrayList<class_303> lines = new ArrayList<class_303>(this.field_2061);
        this.field_2061.clear();
        this.field_2064.clear();
        this.withLogLock(() -> {
            Iterator<E> iterator = lines.iterator();
            while (iterator.hasNext()) {
                class_303 line = (class_303)iterator.next();
                this.method_44811(line.comp_893(), line.comp_915(), line.comp_894());
            }
            return;
        });
    }

    @Shadow
    protected abstract void method_44719(class_332 var1, int var2, int var3, class_7591.class_7592 var4);

    @Override
    public void delete(class_7469 signature, boolean all) {
        if (signature != null) {
            ListIterator<class_303> iterator = this.field_2061.listIterator();
            boolean update = false;
            while (iterator.hasNext()) {
                class_303 line = iterator.next();
                if (!signature.equals((Object)line.comp_915())) continue;
                this.invoke(new ni6jptcWehG2zBzrVi5Be0JfyG3W0sMr(line.comp_893(), line.comp_915()));
                iterator.remove();
                update = true;
                if (all) continue;
            }
            if (update) {
                this.method_44813();
            }
        }
    }

    @Override
    public List<class_303> e4Wf3i8jz2C4MOJHQCQH2uipqjR80gDP() {
        return this.field_2061;
    }

    @Override
    public void y351pg9WET07sg2ImqOZfss7jbJ0Tk4Z() {
        this.field_2066 = this.prevScrolledLines;
        this.chatAnimation.C1nsJ5zFHgdT7jsy4SYMduKesBBbMx4e(this.prevAnimation);
    }

    @Shadow
    protected abstract void method_58744(class_303 var1);

    @Shadow
    protected abstract void method_45027(class_303 var1);

    @Shadow
    public abstract int method_1813();

    @Shadow
    protected abstract double method_44722(double var1);

    @Inject(method={"addMessage(Lnet/minecraft/client/gui/hud/ChatHudLine;)V"}, at={@At(value="HEAD")})
    private void addMessageHook(class_303 message, CallbackInfo ci) {
        this.chatAnimation.C1nsJ5zFHgdT7jsy4SYMduKesBBbMx4e(System.currentTimeMillis());
    }
}

