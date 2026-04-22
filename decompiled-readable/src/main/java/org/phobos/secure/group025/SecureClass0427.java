/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group025;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_238;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3545;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group061.SecureClass1117;
import org.phobos.secure.group054.SecureInterface0134;

public class SecureClass0427
implements SecureInterface0134 {
    public /* synthetic */ boolean field001;
    public /* synthetic */ double field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ double field004;
    public /* synthetic */ double field005;
    public /* synthetic */ double field006;
    public /* synthetic */ double field007;
    public /* synthetic */ class_3545<Float, Float> field008;
    public /* synthetic */ boolean field009;
    public /* synthetic */ double field010;
    public /* synthetic */ double field011;
    public /* synthetic */ double field012;
    public /* synthetic */ long field013;
    public final /* synthetic */ List<class_238> field014;
    public /* synthetic */ boolean field015;
    public /* synthetic */ double field016;
    public /* synthetic */ int field017;
    public /* synthetic */ long field018;
    public /* synthetic */ class_243 field019;

    public static /* bridge */ /* synthetic */ float eOmDwqIE9QeRcOyH1Qs2W9tJhX2Tyo6a(double QpKzGohf0f97QuZ3f3rjG5V5lPBRDRIR, double FVYsp1CVhSguJZzvo2R450IkRU6TFdTe, double vHWjCg1CvTiMJdjDJkMPFQ4vJFIFdLq4) {
        return SecureClass1117.t4cHqOfkrNQmsBWYbYLHvHHIP1N8ST92(SecureClass0427.yrOTdctf4VwftZKvhkMl7PAjMW9qTgya((float)QpKzGohf0f97QuZ3f3rjG5V5lPBRDRIR, (float)FVYsp1CVhSguJZzvo2R450IkRU6TFdTe, (float)vHWjCg1CvTiMJdjDJkMPFQ4vJFIFdLq4));
    }

    public static /* bridge */ /* synthetic */ float yrOTdctf4VwftZKvhkMl7PAjMW9qTgya(float hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP, float field024, float DUFkXQmcuLGJFex6ClifjBRMVgSp2g7u) {
        float field020;
        if (hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP > field024) {
            float field021 = hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP - field024;
            float f = field024 + 360.0f - hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP;
            if (field021 > f) {
                float field022 = -field024 - 360.0f + hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP;
            } else {
                float field023 = field021;
            }
        } else {
            if (!(hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP < field024)) {
                return field024;
            }
            float field025 = field024 - hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP;
            float field026 = hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP + 360.0f - field024;
            if (field025 > field026) {
                float f = field024 + 360.0f + hl4YOwAasr7r8JC2UWaOh1iEw1HpqBeP;
            } else {
                float field027 = -field025;
            }
        }
        field020 = class_3532.method_15393((float)field020);
        if ((double)Math.abs(field020) < 0.1 * Math.random() + 0.1) {
            return field024;
        }
        if (Math.abs(field020) <= DUFkXQmcuLGJFex6ClifjBRMVgSp2g7u) {
            return field024 + field020;
        }
        if (field020 < 0.0f) {
            return field024 - DUFkXQmcuLGJFex6ClifjBRMVgSp2g7u;
        }
        if (field020 > 0.0f) {
            return field024 + DUFkXQmcuLGJFex6ClifjBRMVgSp2g7u;
        }
        return field024;
    }

    public /* synthetic */ SecureClass0427() {
        this.field012 = 0.0;
        this.field007 = 0.0;
        this.field002 = 0.0;
        this.field018 = System.currentTimeMillis();
        this.field016 = 0.0;
        this.field005 = 0.0;
        this.field011 = 0.0;
        this.field014 = new ArrayList<class_238>(101);
        this.field015 = false;
        this.field006 = 0.8;
        this.field009 = false;
        this.field010 = 0.95;
        this.field001 = false;
        this.field008 = new class_3545((Object)Float.valueOf(0.35f), (Object)Float.valueOf(0.5f));
        this.field004 = 1.0;
        this.field013 = 100L;
        this.field003 = false;
        this.field017 = 1;
        this.field019 = class_243.field_1353;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_421(float[] aLk2XuKS5FGJjKttxHLt3tZp3DbBE9Oh, float[] YocZyUGQmjMFcT4V5R0Eh8g80pga49QK) {
        return SecureClass0427.BF8ileZVgg0oC6lxvNoWKZSG6Y6kMNmZ(aLk2XuKS5FGJjKttxHLt3tZp3DbBE9Oh[0], aLk2XuKS5FGJjKttxHLt3tZp3DbBE9Oh[1], YocZyUGQmjMFcT4V5R0Eh8g80pga49QK[0], YocZyUGQmjMFcT4V5R0Eh8g80pga49QK[1]);
    }

    public static /* bridge */ /* synthetic */ float xWXEXkPIhcVNTE77GQu5Bkb31Zom6Ucz(double DWaTjbnNsXEj4h1rrK4LietHaSMmLale) {
        return (float)((Math.random() - 0.5) * 2.0 * DWaTjbnNsXEj4h1rrK4LietHaSMmLale);
    }

    public static /* bridge */ /* synthetic */ double SLNEqkINZ1N6nc7d0kGIt8JmofPzaT9h(double field028, double UlJXGErSKZGE5BIv2edyrEXE1TC4k1cU, double OvGTEfAL4qlXYXv7AOuDEqvseqKnLpgg) {
        if (OvGTEfAL4qlXYXv7AOuDEqvseqKnLpgg >= field028) {
            return field028;
        }
        return Math.max(OvGTEfAL4qlXYXv7AOuDEqvseqKnLpgg, UlJXGErSKZGE5BIv2edyrEXE1TC4k1cU);
    }

    public static /* bridge */ /* synthetic */ boolean BF8ileZVgg0oC6lxvNoWKZSG6Y6kMNmZ(float f, float ZC3Nly2xH0GIpEvM0mV0CouBA1fLHhXF, float qNoFNvpP74LHrEIpKAC40D755lqtcaBj, float Tw7OpDdFh6ZfFF3WYxPovhIqqVtAq3Sz) {
        return SecureClass0427.cfr_renamed_422(f, qNoFNvpP74LHrEIpKAC40D755lqtcaBj) && (double)Math.abs(ZC3Nly2xH0GIpEvM0mV0CouBA1fLHhXF - Tw7OpDdFh6ZfFF3WYxPovhIqqVtAq3Sz) < 0.05;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_422(float F8FgE9Bdbi0yxQKduY340QPy6W73yaUM, float ZJQZrPKDJov5Qq8qf0v09xzVWpuon0eG) {
        return (double)Math.abs(class_3532.method_15393((float)F8FgE9Bdbi0yxQKduY340QPy6W73yaUM) - class_3532.method_15393((float)ZJQZrPKDJov5Qq8qf0v09xzVWpuon0eG)) < 0.1;
    }

    public static /* bridge */ /* synthetic */ boolean XFe7eiSuDcMyTFRWrCuLWuOo0X4zLkAU(@NotNull class_241 LMrTdUInT0S8cORVgzOEqhd3Nj1MCyGo, @NotNull class_241 YOTFbaZ5d1PZ0JWxdTnc2a7k5uXqtrMm) {
        return SecureClass0427.cfr_renamed_422(LMrTdUInT0S8cORVgzOEqhd3Nj1MCyGo.field_1343, YOTFbaZ5d1PZ0JWxdTnc2a7k5uXqtrMm.field_1343) && (double)Math.abs(LMrTdUInT0S8cORVgzOEqhd3Nj1MCyGo.field_1342 - YOTFbaZ5d1PZ0JWxdTnc2a7k5uXqtrMm.field_1342) < 0.1;
    }
}

