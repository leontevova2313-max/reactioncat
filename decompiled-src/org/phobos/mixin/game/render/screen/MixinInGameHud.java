/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1306;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_4061;
import net.minecraft.class_8646;
import net.minecraft.class_9779;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2._6jlNlZOnEKWVQGReVLkeEcQq64O4wt7J;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a._95oggeUjbjGqC2mhthw4xSRQozY2m3GE;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.n06V4jYMMdWGbExHTb4jZrNP0D3hv8US;
import org.phobos.secure.N8Mbvei5jZJniHivyFx9alrtSLUznZLt.UhzXi0lrN2yUwxuxeyFcJ8osEDCKEhnf;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.Uv7wQPUzK5dry6wKhwT18sz3NYK1WQ0k;
import org.phobos.secure.m0W5AbJZPb6oL8kGQnlxCA1x2TGXa70A.GwLeFYUWiuIhU4JWBJ4jKuI2zGXUMD52;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ._8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.F8i4eZVrBNF6ioeinoUCBKslhcEJ2y26;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_329.class})
public abstract class MixinInGameHud
implements EventSubscriber {
    @Shadow
    @Final
    private static class_2960 field_45315;
    @Shadow
    @Final
    private static class_2960 field_45314;
    @Shadow
    @Final
    private static class_2960 field_45312;
    @Shadow
    @Final
    private static class_2960 field_45310;
    @Shadow
    @Final
    private class_355 field_2015;
    @Shadow
    @Final
    private class_310 field_2035;
    @Shadow
    @Final
    private static class_2960 field_45311;
    @Shadow
    @Final
    private static class_2960 field_45313;

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void renderHook(class_332 ctx, class_9779 tickCounter, CallbackInfo ci) {
        this.invoke(new F8i4eZVrBNF6ioeinoUCBKslhcEJ2y26(ctx, tickCounter.method_60637(true)));
    }

    @Overwrite
    private void method_1759(class_332 context, class_9779 tickCounter) {
        Uv7wQPUzK5dry6wKhwT18sz3NYK1WQ0k.t8OOgUV8QjOdQ6yvZvfdK7W6C0VSEZTO().EVWYwgvoUNOIKP1e1VkWGFKK7hCcumog();
        class_1657 playerEntity = this.method_1737();
        if (playerEntity != null) {
            int o;
            int n;
            int m;
            class_1799 itemStack = playerEntity.method_6079();
            class_1306 arm = playerEntity.method_6068().method_5928();
            int i = context.method_51421() / 2;
            RenderSystem.enableBlend();
            context.method_51448().method_22903();
            context.method_51448().method_46416(0.0f, 0.0f, -90.0f);
            context.method_52706(field_45310, i - 91, context.method_51443() - 22, 182, 22);
            context.method_52706(field_45311, i - 91 - 1 + Uv7wQPUzK5dry6wKhwT18sz3NYK1WQ0k.t8OOgUV8QjOdQ6yvZvfdK7W6C0VSEZTO().ImNEoMY7E2PyAbWBKlzB2nyzhnv4FJaS(_8v87DvHZFmaELlrW5XbY9VXTqSAeo5hP.Zq3kqI2muZqCNUMU9MKz1a6wyN10WAwL(playerEntity.method_31548().field_7545)) * 20, context.method_51443() - 22 - 1, 24, 23);
            if (!itemStack.method_7960() && !n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
                if (arm == class_1306.field_6182) {
                    context.method_52706(field_45312, i - 91 - 29, context.method_51443() - 23, 29, 24);
                } else {
                    context.method_52706(field_45313, i + 91, context.method_51443() - 23, 29, 24);
                }
            }
            context.method_51448().method_22909();
            RenderSystem.disableBlend();
            int l = 1;
            for (m = 0; m < 9; ++m) {
                n = i - 90 + m * 20 + 2;
                o = context.method_51443() - 16 - 3;
                this.method_1762(context, n, o, tickCounter, playerEntity, (class_1799)playerEntity.method_31548().field_7547.get(Uv7wQPUzK5dry6wKhwT18sz3NYK1WQ0k.t8OOgUV8QjOdQ6yvZvfdK7W6C0VSEZTO().WccPWg3P3ablP9Ajv3KOzvDkhGcrUd3L(m)), l++);
            }
            if (!itemStack.method_7960() && !n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
                m = context.method_51443() - 16 - 3;
                if (arm == class_1306.field_6182) {
                    this.method_1762(context, i - 91 - 26, m, tickCounter, playerEntity, itemStack, l++);
                } else {
                    this.method_1762(context, i + 91 + 10, m, tickCounter, playerEntity, itemStack, l++);
                }
            }
            if (this.field_2035.field_1690.method_42565().method_41753() == class_4061.field_18153) {
                RenderSystem.enableBlend();
                float f = this.field_2035.field_1724.method_7261(0.0f);
                if (f < 1.0f) {
                    n = context.method_51443() - 20;
                    o = i + 91 + 6;
                    if (arm == class_1306.field_6183) {
                        o = i - 91 - 22;
                    }
                    int p = (int)(f * 19.0f);
                    context.method_52706(field_45314, o, n, 18, 18);
                    context.method_52708(field_45315, 18, 18, 0, 18 - p, o, n + 18 - p, 18, p);
                }
                RenderSystem.disableBlend();
            }
        }
    }

    @Inject(method={"renderCrosshair"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderCrosshairHook(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        if (_95oggeUjbjGqC2mhthw4xSRQozY2m3GE.cfr_renamed_12()) {
            ci.cancel();
        }
    }

    @Inject(method={"renderScoreboardSidebar*"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderScoreboardSidebarHook(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        this.invoke(new UhzXi0lrN2yUwxuxeyFcJ8osEDCKEhnf(), ci);
    }

    @Inject(method={"renderHeldItemTooltip"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHeldItemTooltipHook(class_332 context, CallbackInfo ci) {
        this.invoke(new GwLeFYUWiuIhU4JWBJ4jKuI2zGXUMD52(), ci);
    }

    @Shadow
    @Nullable
    protected abstract class_1657 method_1737();

    @Inject(method={"renderStatusEffectOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderStatusEffectHook(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        this.invoke(new _6jlNlZOnEKWVQGReVLkeEcQq64O4wt7J(), ci);
    }

    @Shadow
    protected abstract void method_1762(class_332 var1, int var2, int var3, class_9779 var4, class_1657 var5, class_1799 var6, int var7);

    @Inject(method={"renderPlayerList"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPlayerList(class_332 context, class_9779 tickCounter, CallbackInfo ci) {
        ci.cancel();
        assert (this.field_2035.field_1687 != null && this.field_2035.field_1724 != null);
        class_269 scoreboard = this.field_2035.field_1687.method_8428();
        class_266 scoreboardObjective = scoreboard.method_1189(class_8646.field_45156);
        this.field_2015.method_1921(this.field_2035.field_1690.field_1907.method_1434() && (!this.field_2035.method_1542() || this.field_2035.field_1724.field_3944.method_45732().size() > 1 || scoreboardObjective != null));
        this.field_2015.method_1919(context, context.method_51421(), scoreboard, scoreboardObjective);
    }
}

