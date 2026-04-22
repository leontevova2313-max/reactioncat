/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1664;
import net.minecraft.class_1934;
import net.minecraft.class_2561;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_274;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_5250;
import net.minecraft.class_5348;
import net.minecraft.class_5481;
import net.minecraft.class_640;
import net.minecraft.class_7532;
import net.minecraft.class_9013;
import net.minecraft.class_9015;
import net.minecraft.class_9022;
import net.minecraft.class_9025;
import net.minecraft.class_922;
import org.earthhack.ducks.IPlayerListEntry;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ._3LAObobilITioN96THuwvMKtAdvhcErw;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.staEq8tMqIz6sDI4EAK1XuhGS1bMPyd2;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_355.class}, priority=0x7FFFFFFF)
public abstract class MixinPlayerListHud
implements EventSubscriber {
    @Shadow
    @Final
    private class_310 field_2155;
    @Shadow
    @Nullable
    private class_2561 field_2153;
    @Unique
    private final U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 JeWb9gecYJDmoMltulofhYqY5IhtRXyW = new U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8();
    @Shadow
    private boolean field_2158;
    @Shadow
    @Nullable
    private class_2561 field_2154;
    @Shadow
    @Final
    private Map<UUID, class_355.class_7732> field_40393;

    @Redirect(method={"collectPlayerEntries"}, at=@At(value="INVOKE", target="Ljava/util/stream/Stream;limit(J)Ljava/util/stream/Stream;"))
    private Stream<class_640> collectPlayerEntriesHook(Stream<class_640> stream, long limit) {
        if (NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return stream.limit(NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().KZJHVJZeeIpLZMsHkkqSK1yLHFuZk8NW().getValue().intValue());
        }
        return stream.limit(limit);
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    public void render(class_332 context, int scaledWindowWidth, class_269 scoreboard, @Nullable class_266 objective, CallbackInfo ci) {
        int u;
        float y2;
        float x2;
        float y1;
        float x1;
        int var10005;
        int var10003;
        int var10002;
        int var10001;
        boolean bl;
        int n;
        int m;
        boolean custom;
        ci.cancel();
        boolean bl2 = custom = !staEq8tMqIz6sDI4EAK1XuhGS1bMPyd2.EvQhQt7VfoB2jFBNcR2YaCwVnQ10yqqz().EKjBpE6Lt6QGdGI01wWNBCeeYyIJKmrs();
        if (custom) {
            this.JeWb9gecYJDmoMltulofhYqY5IhtRXyW.uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(this.field_2158 ? 0.0f : 500.0f);
            this.JeWb9gecYJDmoMltulofhYqY5IhtRXyW.BMMCpqfUxEdTwLEu5UFj3ge24ytSFktk(10.0f, 0.1f);
            if (this.JeWb9gecYJDmoMltulofhYqY5IhtRXyW.HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY() >= 495.0f) {
                return;
            }
            context.method_51448().method_22903();
            context.method_51448().method_46416(0.0f, -this.JeWb9gecYJDmoMltulofhYqY5IhtRXyW.HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY(), 0.0f);
        } else if (!this.field_2158) {
            return;
        }
        List<class_640> list = this.method_48213();
        ArrayList<class_355.class_9018> list2 = new ArrayList<class_355.class_9018>(list.size());
        int i = this.field_2155.field_1772.method_1727(" ");
        int j = 0;
        int k = 0;
        for (class_640 playerListEntry : list) {
            IPlayerListEntry access;
            boolean bl4 = NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().Zuh8IGGkqov570n5DnsSYgPq2WYXWQ3e().getValue() != false && playerListEntry instanceof IPlayerListEntry && (access = (IPlayerListEntry)playerListEntry).getUser() != null;
            class_2561 text = this.method_1918(playerListEntry);
            j = Math.max(j, this.field_2155.field_1772.method_27525((class_5348)text) + (bl4 ? 9 : 0));
            int l = 0;
            class_5250 text2 = null;
            m = 0;
            if (objective != null) {
                class_9015 scoreHolder = class_9015.method_55420((GameProfile)playerListEntry.method_2966());
                class_9013 readableScoreboardScore = scoreboard.method_55430(scoreHolder, objective);
                if (readableScoreboardScore != null) {
                    l = readableScoreboardScore.method_55397();
                }
                if (objective.method_1118() != class_274.class_275.field_1471) {
                    class_9022 numberFormat = objective.method_55380((class_9022)class_9025.field_47568);
                    text2 = class_9013.method_55398((class_9013)readableScoreboardScore, (class_9022)numberFormat);
                    m = this.field_2155.field_1772.method_27525((class_5348)text2);
                    k = Math.max(k, m > 0 ? i + m : 0);
                }
            }
            list2.add(new class_355.class_9018(text, l, text2, m));
        }
        if (!this.field_40393.isEmpty()) {
            Set<T> set = list.stream().map(playerEntry -> playerEntry.method_2966().getId()).collect(Collectors.toSet());
            this.field_40393.keySet().removeIf(uuid -> !set.contains(uuid));
        }
        int o = n = list.size();
        int p = 1;
        while (o > 20) {
            o = (n + ++p - 1) / p;
        }
        boolean bl3 = bl = this.field_2155.method_1542() || this.field_2155.method_1562().method_48296().method_10771();
        int q = objective != null ? (objective.method_1118() == class_274.class_275.field_1471 ? 90 : k) : 0;
        m = Math.min(p * ((bl ? 9 : 0) + j + q + 13), scaledWindowWidth - 50) / p;
        int r = scaledWindowWidth / 2 - (m * p + (p - 1) * 5) / 2;
        int s = 10;
        int t = m * p + (p - 1) * 5;
        List list3 = null;
        if (this.field_2153 != null) {
            list3 = this.field_2155.field_1772.method_1728((class_5348)this.field_2153, scaledWindowWidth - 50);
            for (class_5481 orderedText : list3) {
                t = Math.max(t, this.field_2155.field_1772.method_30880(orderedText));
            }
        }
        List list4 = null;
        if (this.field_2154 != null) {
            list4 = this.field_2155.field_1772.method_1728((class_5348)this.field_2154, scaledWindowWidth - 50);
            for (class_5481 orderedText2 : list4) {
                t = Math.max(t, this.field_2155.field_1772.method_30880(orderedText2));
            }
        }
        Color color = new Color(0, 0, 0, 100);
        if (list3 != null) {
            var10001 = scaledWindowWidth / 2 - t / 2 - 1;
            var10002 = s - 1;
            var10003 = scaledWindowWidth / 2 + t / 2 + 1;
            var10005 = list3.size();
            Objects.requireNonNull(this.field_2155.field_1772);
            if (custom) {
                x1 = scaledWindowWidth / 2 - t / 2 - 1;
                y1 = s - 1;
                x2 = scaledWindowWidth / 2 + t / 2 + 1;
                y2 = s + list3.size() * 9;
                _3LAObobilITioN96THuwvMKtAdvhcErw.gOh2JD1PxSMJFDP6OeRf0JJ7E1qRxkEp(context.method_51448(), color, x1, y1, x2, y2, 6.0f, 6.0f, 0.0f, 0.0f, 30.0f);
            } else {
                context.method_25294(var10001, var10002, var10003, s + var10005 * 9, Integer.MIN_VALUE);
            }
            for (class_5481 orderedText2 : list3) {
                u = this.field_2155.field_1772.method_30880(orderedText2);
                context.method_35720(this.field_2155.field_1772, orderedText2, scaledWindowWidth / 2 - u / 2, s, -1);
                Objects.requireNonNull(this.field_2155.field_1772);
                s += 9;
            }
            ++s;
        }
        if (custom) {
            x1 = scaledWindowWidth / 2 - t / 2 - 1;
            y1 = s - 1;
            x2 = scaledWindowWidth / 2 + t / 2 + 1;
            y2 = s + o * 9;
            _3LAObobilITioN96THuwvMKtAdvhcErw.gOh2JD1PxSMJFDP6OeRf0JJ7E1qRxkEp(context.method_51448(), color, x1, y1, x2, y2, list3 != null ? 0.0f : 6.0f, list3 != null ? 0.0f : 6.0f, list4 != null ? 0.0f : 6.0f, list4 != null ? 0.0f : 6.0f, 30.0f);
        } else {
            context.method_25294(scaledWindowWidth / 2 - t / 2 - 1, s - 1, scaledWindowWidth / 2 + t / 2 + 1, s + o * 9, Integer.MIN_VALUE);
        }
        int v = this.field_2155.field_1690.method_19344(0x20FFFFFF);
        for (int w = 0; w < n; ++w) {
            int aa;
            int ab;
            IPlayerListEntry access;
            boolean bl4;
            u = w / o;
            int x = w % o;
            int y = r + u * m + u * 5;
            int z = s + x * 9;
            context.method_25294(y, z, y + m, z + 8, v);
            RenderSystem.enableBlend();
            if (w >= list.size()) continue;
            class_640 playerListEntry2 = list.get(w);
            class_355.class_9018 scoreDisplayEntry = (class_355.class_9018)list2.get(w);
            GameProfile gameProfile = playerListEntry2.method_2966();
            boolean bl5 = NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().mupdLfbxbgT9e7hL5qioLFeT0xTB5ttZ().getValue();
            boolean bl6 = bl4 = NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().Zuh8IGGkqov570n5DnsSYgPq2WYXWQ3e().getValue() != false && playerListEntry2 instanceof IPlayerListEntry && (access = (IPlayerListEntry)playerListEntry2).getUser() != null;
            if (bl) {
                class_1657 playerEntity = this.field_2155.field_1687.method_18470(gameProfile.getId());
                boolean bl22 = playerEntity != null && class_922.method_38563((class_1309)playerEntity);
                boolean bl32 = playerEntity != null && playerEntity.method_7348(class_1664.field_7563);
                class_7532.method_44445((class_332)context, (class_2960)playerListEntry2.method_52810().comp_1626(), (int)y, (int)z, (int)8, (boolean)bl32, (boolean)bl22);
                y += 9;
            }
            access = (IPlayerListEntry)playerListEntry2;
            if (bl4) {
                fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 user = access.getUser();
                RenderSystem.setShaderTexture((int)0, (class_2960)user.YPRvd633df2AswGYHDNNepVuLdjAArls());
                _3LAObobilITioN96THuwvMKtAdvhcErw.cfr_renamed_54(context.method_51448(), y, z, 8.0);
                y += 9;
            }
            context.method_27535(this.field_2155.field_1772, NbKWAJgi1wNsYUEijNJ7WmQIH9i2P8c0.WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD().BUxlEFeDvhkln3jmCqY61oWBMIkpAcp3(scoreDisplayEntry.comp_2134, access.getUser()), y, z, playerListEntry2.method_2958() == class_1934.field_9219 ? -1862270977 : -1);
            if (objective != null && playerListEntry2.method_2958() != class_1934.field_9219 && (ab = (aa = y + j + 1) + q - (bl4 ? 9 : 0)) - aa > 5) {
                this.method_1922(objective, z, scoreDisplayEntry, aa, ab, gameProfile.getId(), context);
            }
            this.method_1923(context, m, y - (bl && bl4 ? 18 : (bl || bl4 ? 9 : 0)), z, playerListEntry2);
        }
        if (list4 != null) {
            var10001 = scaledWindowWidth / 2 - t / 2 - 1;
            var10002 = (s += o * 9 + 1) - 1;
            var10003 = scaledWindowWidth / 2 + t / 2 + 1;
            var10005 = list4.size();
            Objects.requireNonNull(this.field_2155.field_1772);
            if (custom) {
                float x12 = scaledWindowWidth / 2 - t / 2 - 1;
                float y12 = s - 1;
                float x22 = scaledWindowWidth / 2 + t / 2 + 1;
                float y22 = s + var10005 * 9;
                _3LAObobilITioN96THuwvMKtAdvhcErw.gOh2JD1PxSMJFDP6OeRf0JJ7E1qRxkEp(context.method_51448(), color, x12, y12, x22, y22, 0.0f, 0.0f, 6.0f, 6.0f, 30.0f);
            } else {
                context.method_25294(var10001, var10002, var10003, s + var10005 * 9, Integer.MIN_VALUE);
            }
            for (class_5481 orderedText3 : list4) {
                int x = this.field_2155.field_1772.method_30880(orderedText3);
                context.method_35720(this.field_2155.field_1772, orderedText3, scaledWindowWidth / 2 - x / 2, s, -1);
                Objects.requireNonNull(this.field_2155.field_1772);
                s += 9;
            }
        }
        if (custom) {
            context.method_51448().method_22909();
        }
    }

    @Shadow
    protected abstract List<class_640> method_48213();

    @Shadow
    public abstract class_2561 method_1918(class_640 var1);

    @Shadow
    protected abstract void method_1923(class_332 var1, int var2, int var3, int var4, class_640 var5);

    @Shadow
    protected abstract void method_1922(class_266 var1, int var2, class_355.class_9018 var3, int var4, int var5, UUID var6, class_332 var7);
}

