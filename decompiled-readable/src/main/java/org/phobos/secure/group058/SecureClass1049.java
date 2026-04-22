/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group058;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1058;
import net.minecraft.class_1087;
import net.minecraft.class_128;
import net.minecraft.class_129;
import net.minecraft.class_1309;
import net.minecraft.class_148;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_1937;
import net.minecraft.class_2350;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_308;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_4696;
import net.minecraft.class_5819;
import net.minecraft.class_757;
import net.minecraft.class_777;
import net.minecraft.class_811;
import net.minecraft.class_918;
import net.minecraft.class_9801;
import org.joml.Math;
import org.joml.Matrix4f;
import org.phobos.secure.group003.SecureClass0036;
import org.phobos.secure.group009.SecureClass0145;
import org.phobos.secure.group007.SecureClass0101;
import org.phobos.secure.group010.SecureClass0158;
import org.phobos.secure.group012.SecureClass0172;
import org.phobos.secure.group012.SecureClass0178;
import org.phobos.secure.group034.SecureClass0597;
import org.phobos.secure.group049.SecureClass0887;
import org.phobos.secure.group058.SecureClass1058;
import org.phobos.secure.group058.SecureClass1050;
import org.phobos.secure.group061.SecureClass1106;
import org.phobos.secure.group022.SecureClass0375;
import org.phobos.secure.group023.SecureClass0387;
import org.phobos.secure.group028.SecureClass0496;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass1049 {
    public static /* synthetic */ SecureClass0496 field001;
    public static /* synthetic */ SecureClass0172 field002;
    public static /* synthetic */ SecureClass0375 field003;
    public static /* synthetic */ SecureClass1050 field004;
    public static final /* synthetic */ float[][] field005;
    public static /* synthetic */ SecureClass0036 field006;
    public static /* synthetic */ SecureClass1106 field007;
    public static /* synthetic */ SecureClass0597 field008;
    public static /* synthetic */ SecureClass0145 field009;
    public static /* synthetic */ SecureClass1058 field010;
    public static /* synthetic */ SecureClass0178 field011;
    public static /* synthetic */ SecureClass0887 field012;
    public static /* synthetic */ SecureClass0387 field013;

    public static /* bridge */ /* synthetic */ void Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(Matrix4f WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, double d, double qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, double Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, double bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, float f, float Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, float XI2o0nYhssQsUeKVknbEYUDjM25n3WrI, float rupq4WRR8CZQzyhNoua2THBTzh6xuF74) {
        class_287 field014 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        field014.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)d, (float)bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, 0.0f).method_22913(f, rupq4WRR8CZQzyhNoua2THBTzh6xuF74);
        field014.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, (float)bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, 0.0f).method_22913(Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, rupq4WRR8CZQzyhNoua2THBTzh6xuF74);
        field014.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, (float)Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, 0.0f).method_22913(Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, XI2o0nYhssQsUeKVknbEYUDjM25n3WrI);
        field014.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)d, (float)Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, 0.0f).method_22913(f, XI2o0nYhssQsUeKVknbEYUDjM25n3WrI);
        RenderSystem.setShader(class_757::method_34542);
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field014);
    }

    public static /* bridge */ /* synthetic */ void VrLSK0v5C3snQgdpcad5oFJ0ZA5P2tnH(class_4587 V1xaE3XwqA7MXNmhfXKsbJlZkwV7K4mT, double NMj6WPEUA8n7Qx9JSTHuG9az4aOwHqS7, double By7YVVfxtgpU84ssBCt0BmlRR1YqFXa1, double PnfxyNEBfBE6gTKQXG5nyzYIIpzzgsRL, double dymxEMFN54Mmw62YQsJ7chMdYItSrUO2, class_1058 xl15sEJySuOWB7f74Slcj0heJQzVSQ0e) {
        SecureClass1049.cfr_renamed_650(V1xaE3XwqA7MXNmhfXKsbJlZkwV7K4mT, xl15sEJySuOWB7f74Slcj0heJQzVSQ0e, NMj6WPEUA8n7Qx9JSTHuG9az4aOwHqS7, By7YVVfxtgpU84ssBCt0BmlRR1YqFXa1, PnfxyNEBfBE6gTKQXG5nyzYIIpzzgsRL, dymxEMFN54Mmw62YQsJ7chMdYItSrUO2);
    }

    public static /* bridge */ /* synthetic */ void PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2() {
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_54(class_4587 pmru4RuqOl0bNA6lyj2kWvXwYFMSJM5y, double d, double D8Hvo00uorpFpT0qE4Xhet7uGcCTTDAL, double sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU) {
        SecureClass1049.YH5ynAaHwuJDkhAdDLW4LvhcagrB0aRa(pmru4RuqOl0bNA6lyj2kWvXwYFMSJM5y, d, D8Hvo00uorpFpT0qE4Xhet7uGcCTTDAL, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, 0.0f, 0.0f, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU);
    }

    public static /* bridge */ /* synthetic */ void MJf1ZFhViV4uBtjqWdnkW01gMY1Rg6YP() {
        field009 = new SecureClass0145();
        field006 = new SecureClass0036();
        field011 = new SecureClass0178();
        field012 = new SecureClass0887();
        field002 = new SecureClass0172();
        field004 = new SecureClass1050();
        field001 = new SecureClass0496();
        field003 = new SecureClass0375();
        field010 = new SecureClass1058();
        field008 = new SecureClass0597();
        field013 = new SecureClass0387();
        field007 = new SecureClass1106();
    }

    public static /* bridge */ /* synthetic */ void XQqkUY3NMgzs9k8246Inl5ZsnzcuvnK8(class_4587 GXnY9aGMYhGt209FD4CdBPj7wvZOhtWj, Color FbVedkik3j0SQBAtQeRz4QfKmTSFH3pM, double d, double B3CEy2EzeQ3NH0EZ54pUxHlH7jbNwCn4, double GmskPGbBuwDQXkIuA1R5duc45wx3e7cq) {
        SecureClass1049.sOnMjt2bNgL7ROgvjtWFeGvDpzOTh5Ne(GXnY9aGMYhGt209FD4CdBPj7wvZOhtWj, FbVedkik3j0SQBAtQeRz4QfKmTSFH3pM, d, B3CEy2EzeQ3NH0EZ54pUxHlH7jbNwCn4, GmskPGbBuwDQXkIuA1R5duc45wx3e7cq, GmskPGbBuwDQXkIuA1R5duc45wx3e7cq, 0.0f, 0.0f, 512.0, 512.0, 512.0, 512.0);
    }

    public static /* bridge */ /* synthetic */ void CxXb7E8pYODHa7ZHmD6RaI3oQit3QoMM(class_4587 class_45872, class_2960 V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3, double d, double zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, double d2) {
        float field015 = 8.0f;
        float field016 = 8.0f;
        RenderSystem.setShaderTexture((int)0, (class_2960)V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3);
        SecureClass1049.Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(class_45872.method_23760().method_23761(), d, d + d2, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl + d2, (8.0f + 0.0f) / (float)64.0, (8.0f + (float)8.0) / (float)64.0, (field015 + 0.0f) / (float)64.0, (field015 + (float)field016) / (float)64.0);
        SecureClass1049.nwbC4jlpvpybvhhB686ieifdd3FYSRvx(class_45872, V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3, d, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, d2);
    }

    public static /* bridge */ /* synthetic */ void YuyqokWxnJpy51WZI5UHL9vF0Sh6HXU9(class_4587 class_45872, double d, double oRjSuyiGQucjyO8oKBl02uTpdrzZfr4S, double AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw, class_2960 JnqnDiN0nMtkrWJZaZS9rkwFtn50Ii6t) {
        class_287 field017 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1585);
        Matrix4f field018 = class_45872.method_23760().method_23761();
        int field019 = 0;
        while (true) {
            if (field019 >= 360) {
                RenderSystem.setShaderTexture((int)0, (class_2960)JnqnDiN0nMtkrWJZaZS9rkwFtn50Ii6t);
                RenderSystem.setShader(class_757::method_34542);
                SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field017);
                return;
            }
            double field020 = Math.toRadians((float)field019);
            double field021 = Math.sin((double)field020) * AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw;
            double field022 = Math.cos((double)field020) * AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw;
            field017.method_22918(field018, (float)(d + field021), (float)(oRjSuyiGQucjyO8oKBl02uTpdrzZfr4S + field022), 0.0f).method_22913(0.0f, 0.0f);
            field019 += (int)Math.min((double)1.0, (double)(360 - field019));
        }
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_650(class_4587 DmqCS2RhL07vyxLl0WT1oDnjaRJ4nFfG, class_1058 z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb, double d, double d2, double p6paFSaNu9a776UkpUqNLJkQbmznZf6Z, double d3) {
        if (p6paFSaNu9a776UkpUqNLJkQbmznZf6Z != 0.0 && d3 != 0.0) {
            RenderSystem.setShaderTexture((int)0, (class_2960)z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_45852());
            SecureClass1049.hFzzpMwdiLV2iHHqIglUeB9rlhhQHeqR(DmqCS2RhL07vyxLl0WT1oDnjaRJ4nFfG.method_23760().method_23761(), Color.WHITE, d, d + p6paFSaNu9a776UkpUqNLJkQbmznZf6Z, d2, d2 + d3, z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4594(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4577(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4593(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4575());
        }
    }

    public static /* bridge */ /* synthetic */ void nwbC4jlpvpybvhhB686ieifdd3FYSRvx(class_4587 z1uOQr6wI77gsJzlvZT6QYXvDEqjSlKt, class_2960 iSKTAiQXd0HeHwESZksCeSjDf9wSESNA, double WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H, double d, double b9DRMJlxzhkcilbdO766XeFGXzOc68Gq) {
        float field023 = 8.0f;
        float field024 = 8.0f;
        RenderSystem.enableBlend();
        RenderSystem.setShaderTexture((int)0, (class_2960)iSKTAiQXd0HeHwESZksCeSjDf9wSESNA);
        SecureClass1049.Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(z1uOQr6wI77gsJzlvZT6QYXvDEqjSlKt.method_23760().method_23761(), WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H, WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H + b9DRMJlxzhkcilbdO766XeFGXzOc68Gq, d, d + b9DRMJlxzhkcilbdO766XeFGXzOc68Gq, (40.0f + 0.0f) / (float)64.0, (40.0f + (float)8.0) / (float)64.0, (field023 + 0.0f) / (float)64.0, (field023 + (float)field024) / (float)64.0);
        RenderSystem.disableBlend();
    }

    public static /* bridge */ /* synthetic */ void IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx() {
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* bridge */ /* synthetic */ void hFzzpMwdiLV2iHHqIglUeB9rlhhQHeqR(Matrix4f o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, Color CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r, double d, double FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, double Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, double d2, float RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, float L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, float TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9, float OKic3EA4k7K644R8MuGqT3zB4IoMTmwo) {
        class_287 field025 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        field025.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)d, (float)d2, 0.0f).method_22913(RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, OKic3EA4k7K644R8MuGqT3zB4IoMTmwo).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        field025.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, (float)d2, 0.0f).method_22913(L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, OKic3EA4k7K644R8MuGqT3zB4IoMTmwo).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        field025.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, (float)Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, 0.0f).method_22913(L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        field025.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)d, (float)Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, 0.0f).method_22913(RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        RenderSystem.setShader(class_757::method_34543);
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field025);
    }

    public static /* bridge */ /* synthetic */ void wLb0Yedtepw4LrPRQNhcssNgQwk6lA2r(class_4587 qMeWdxmBNGONJii2tCWxXtKZNqK79N3A, Color xQT2V876gZjqANCvIP2SLLAGmB0jMUF1, double field026, double field028, double field027, double field029, float ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C, Runnable WHqzFFQsDfH1QON9d4fVgfvTD9weONiq) {
        if (field026 < field027) {
            double d = field026;
            field026 = field027;
            field027 = d;
        }
        if (field028 < field029) {
            double d = field028;
            field028 = field029;
            field029 = d;
        }
        Matrix4f matrix4f = qMeWdxmBNGONJii2tCWxXtKZNqK79N3A.method_23760().method_23761();
        float field030 = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getRed() / 255.0f;
        float field031 = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getGreen() / 255.0f;
        float field032 = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getBlue() / 255.0f;
        float f = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getAlpha() / 255.0f;
        class_287 field033 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        field033.method_22918(matrix4f, (float)field026, (float)field029, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(field030, field031, field032, f);
        field033.method_22918(matrix4f, (float)field027, (float)field029, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(field030, field031, field032, f);
        field033.method_22918(matrix4f, (float)field027, (float)field028, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(field030, field031, field032, f);
        field033.method_22918(matrix4f, (float)field026, (float)field028, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(field030, field031, field032, f);
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        WHqzFFQsDfH1QON9d4fVgfvTD9weONiq.run();
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field033);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void uuWSmeHcju9t8JiCcFC82dtA6cYFtHVe(class_4587 tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, Color H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, double NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, double zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP, double d, double Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM, double BLssml81pq3UQUlAOhk2MmpGO253KpnS) {
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + BLssml81pq3UQUlAOhk2MmpGO253KpnS, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d - BLssml81pq3UQUlAOhk2MmpGO253KpnS, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void XV3creKFLqN4NknEVf24gLgVScaWwyh0(class_4587 class_45872, Color color, double oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, double wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP, double A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, double WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05) {
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + 1.0, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, 0.0f);
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY - 1.0, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void VRGrIVrn4B2c1SV9EDbbZFJtZRjlMA5N(float mZk7ezBVXjKM2uEPwgE99doRilGT675E, float wlfdYLnwilgCCYTdnSwaRHYOhNhMaTxi, float f, float BIIVkuF5dIYw44onxwdsT00mRurAelzw, float rFIky3xp3E3FqpMkrWVEWoC5eMoMkY8u, float PPFx7ZFBjeJZsqrPh7BdUIewK0cYCeTf, float s2H0lsRtfT3jDe5IYz0YjyDxFEAB5JX6, Color E4TALTDjFlbr04dZUREWmPhgNCuEXNU7, Color Y56GFdp15lbWLnLloxL57UtxJFto4AJS, Color t1R1Ge2bAupHBPQI12HCqKGr7uSevZSk, Color C4ZcQgTNUk5RBezjVYGL3qXL5GFBUOvY) {
        field009.GaUdnf7WNghfdelKZdrB0GPgtNE8BqJy(mZk7ezBVXjKM2uEPwgE99doRilGT675E, wlfdYLnwilgCCYTdnSwaRHYOhNhMaTxi, f, BIIVkuF5dIYw44onxwdsT00mRurAelzw, rFIky3xp3E3FqpMkrWVEWoC5eMoMkY8u, 1.0f, 1.0f, PPFx7ZFBjeJZsqrPh7BdUIewK0cYCeTf, s2H0lsRtfT3jDe5IYz0YjyDxFEAB5JX6, E4TALTDjFlbr04dZUREWmPhgNCuEXNU7, Y56GFdp15lbWLnLloxL57UtxJFto4AJS, t1R1Ge2bAupHBPQI12HCqKGr7uSevZSk, C4ZcQgTNUk5RBezjVYGL3qXL5GFBUOvY);
        field009.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ void DoZGhSxLvGHdPoVlMOj7olAYtwpNV7IT(class_4587 lUedT8CDMMusUy5XIsKt6Tm7s4vYEKQK, Color color, double RoR1CIZLWOD397LfHItARWBKuWH3SFhJ, double kwjopAhc2iewvjN69eVA4f35gscTc6ap, double hHFT42nPKkFVErVxvzuLa9x04iNQgfou, float cK4Dxw0NCumbHO8yELe2v5Ua8H7YIBJ2) {
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(lUedT8CDMMusUy5XIsKt6Tm7s4vYEKQK, color, RoR1CIZLWOD397LfHItARWBKuWH3SFhJ, kwjopAhc2iewvjN69eVA4f35gscTc6ap, RoR1CIZLWOD397LfHItARWBKuWH3SFhJ + (double)cK4Dxw0NCumbHO8yELe2v5Ua8H7YIBJ2, hHFT42nPKkFVErVxvzuLa9x04iNQgfou, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_651(class_4587 USgGAapGmSj8O4jB0Z24mmnEvPrFNdpt, float N6IJXwLZTEL11nJaMDA5qEGo9FkPxZVz, float jnXPbl3LYaOgMzDpzL9AKtreQ384CGp4, Color xu84xClmAXxj6ajlMovjF96F6iFmcOFn, float eWTrWpzbRq1gRV9QymPAo4MDOxdyUjfi) {
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_310 field034 = class_310.method_1551();
        class_287 field035 = SecureClass1049.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(USgGAapGmSj8O4jB0Z24mmnEvPrFNdpt.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), 0.0f, 0.0f, field034.method_22683().method_4486() + 20, field034.method_22683().method_4502() + 20, 0.0f);
        field012.EWUX9KUrKhuukMiHrXnLaLde5CswJ5Er(N6IJXwLZTEL11nJaMDA5qEGo9FkPxZVz, jnXPbl3LYaOgMzDpzL9AKtreQ384CGp4, xu84xClmAXxj6ajlMovjF96F6iFmcOFn, eWTrWpzbRq1gRV9QymPAo4MDOxdyUjfi);
        field012.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field035);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void hkByEZxkzGdHkvFF3ozYkB9GuVrm3Tjf(class_4587 xox992YgnDaL9Sl4gQ4e5kghWZX5hyj1, float G9sfwh0UXWNvFaKTzCmrGnjGP6zDBuko, float rnp2nm7XZe4Hlur1gcMxX3EpX67iZ3Or, float yLOIFeoz4b3EN7CKsjyQA5So5AEPtCBi, float mqQHlWAXRfRmhtH8oHhPUpWHQIIMRZnR, Color pCRWHgnVRPKs9MkxweQ7UnGKePCcGJfb, Color color, Color Hshva4OJYXaGrtaV3H2lnj7W2W3SqPfR, Color Fs1owle4rsk2mXXfxzF8okdIvxJZyxFG) {
        SecureClass1049.jBDbAsc3FKoayGKvmQcq2fkhodv6OkvZ(xox992YgnDaL9Sl4gQ4e5kghWZX5hyj1, G9sfwh0UXWNvFaKTzCmrGnjGP6zDBuko, rnp2nm7XZe4Hlur1gcMxX3EpX67iZ3Or, yLOIFeoz4b3EN7CKsjyQA5So5AEPtCBi, mqQHlWAXRfRmhtH8oHhPUpWHQIIMRZnR, pCRWHgnVRPKs9MkxweQ7UnGKePCcGJfb, color, Hshva4OJYXaGrtaV3H2lnj7W2W3SqPfR, Fs1owle4rsk2mXXfxzF8okdIvxJZyxFG, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void BCvHTR9spxTIlwQoWXbxwfRMmMM4HAn0(class_4587 class_45872, Color xCwbt21KHdGgCTrfDmiISjg6vcvCofHD, double d, double FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr, double DvIqd2lJx44TvMEfyrW9L3iFkfuwvaJX, float f) {
        SecureClass1049.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, xCwbt21KHdGgCTrfDmiISjg6vcvCofHD, d, FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr, DvIqd2lJx44TvMEfyrW9L3iFkfuwvaJX, FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr + (double)f, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void jBDbAsc3FKoayGKvmQcq2fkhodv6OkvZ(class_4587 p63R5v0gjwRRFtr3ll2eKhvIJGx2IZW7, float QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, float f, float X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, float GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, Color iWl0dR2fhG46bSfO7h3Ipv8wotxXwOtg, Color OsFlYu052vmSrt4DG4f60P0KGoNUVnAA, Color Q74M4gHPRXWBxRg6ka0usPg3olqhTKm4, Color EfJWeT2dkFBgBByf8vXH2YbT0vfLwzdL, float CRs9GCKaZzJz4cHucZu5PKbhNUywodAR) {
        Matrix4f field036 = p63R5v0gjwRRFtr3ll2eKhvIJGx2IZW7.method_23760().method_23761();
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.setShader(class_757::method_34540);
        class_287 field037 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        field037.method_22918(field036, X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, f, 0.0f).method_39415(EfJWeT2dkFBgBByf8vXH2YbT0vfLwzdL.getRGB());
        field037.method_22918(field036, QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, f, 0.0f).method_39415(OsFlYu052vmSrt4DG4f60P0KGoNUVnAA.getRGB());
        field037.method_22918(field036, QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, 0.0f).method_39415(iWl0dR2fhG46bSfO7h3Ipv8wotxXwOtg.getRGB());
        field037.method_22918(field036, X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, 0.0f).method_39415(Q74M4gHPRXWBxRg6ka0usPg3olqhTKm4.getRGB());
        class_286.method_43433((class_9801)field037.method_60800());
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void tH7onY1GvR64O4Xgvcy56HCZcgCyZeoD(class_4587 AY7YZn7G7AAAXGtWwImPPvSIzVhBltVH, float Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz, float f, float k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I, float v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW, Color s5H96lRFR07f7DzZCySQwRddhDyWTUbp, float w0z2lmym0q4uSZC4xL4EJ5V3JheIGgAV) {
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 field038 = SecureClass1049.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(AY7YZn7G7AAAXGtWwImPPvSIzVhBltVH.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz - 10.0f, f - 10.0f, k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I + 20.0f, v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW + 20.0f, 0.0f);
        field011.adVuotlB0dpUXi939sWpfaNueUhBRGUN(Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz, f, k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I, v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW, 1.0f, s5H96lRFR07f7DzZCySQwRddhDyWTUbp, w0z2lmym0q4uSZC4xL4EJ5V3JheIGgAV, 1.0f - (float)s5H96lRFR07f7DzZCySQwRddhDyWTUbp.getAlpha() / 255.0f);
        field011.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field038);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void ahp8kK8puENHHDfSwo0BlPONICiCmrEo(float oaHBsVy50tpUMDycbpnXsZY32kXRyIV6, float SpvutM6N3d7zZ7jPYUEqHcZF0YkIcbpo, float f, float Vy5UFTmFO5FUKgZRJeixXduPP0C8ygoL, float mec2vxOfLHo9TMwQNGCPQKFwl5Dku5cn, Color ssYjqaRfPlkXjuJI9SunJIsNuQvlxIsX) {
        field006.dkmEnN1vjvKkc9CZ5m8XaguuB0XH4pm7(oaHBsVy50tpUMDycbpnXsZY32kXRyIV6, SpvutM6N3d7zZ7jPYUEqHcZF0YkIcbpo, f, Vy5UFTmFO5FUKgZRJeixXduPP0C8ygoL, mec2vxOfLHo9TMwQNGCPQKFwl5Dku5cn, ssYjqaRfPlkXjuJI9SunJIsNuQvlxIsX);
        field006.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ Runnable Bcd30A6AbzYfgSeNNWUTETgnjS4MrUPF(float ldYrB5roQKc73VwZAykqiDM1dSKRlBI2, float ORSuCs01gklJjqxamC36TOV3uUravVi2, float SiLUGOiNyfBJxUb5cLHB0vULGGZyExQ6, float f, Color A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R, float gfnwCOdWP1EKdCQLraqgYJKOpf1EbCka) {
        return () -> {
            field011.adVuotlB0dpUXi939sWpfaNueUhBRGUN(ldYrB5roQKc73VwZAykqiDM1dSKRlBI2, ORSuCs01gklJjqxamC36TOV3uUravVi2, SiLUGOiNyfBJxUb5cLHB0vULGGZyExQ6, f, 1.0f, A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R, gfnwCOdWP1EKdCQLraqgYJKOpf1EbCka, 1.0f - (float)A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R.getAlpha() / 255.0f);
            field011.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        };
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_652(float kW43ghhq6rmnWomheGi1fKRQhuWOxvu8, float puOko2D66eyyj0CrNGgXQgg3FslkstXW, float dZfVQhOqA8Ns4SPLVwPHaFrPMLvKjCLh, float OhOJPhmLlMlx3sa4kGPzeXGYFz6QayQP, float rqQIH8YSnsjCGlh0OhTqnB7VpX3AXbvk, float PGhz43raTzFfQXonRtn5hujZ54NDE8EI, Color r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR) {
        field009.wa6VZ1dTcOa2n61Kcp3CmsH96wShw4Zn(kW43ghhq6rmnWomheGi1fKRQhuWOxvu8, puOko2D66eyyj0CrNGgXQgg3FslkstXW, dZfVQhOqA8Ns4SPLVwPHaFrPMLvKjCLh, OhOJPhmLlMlx3sa4kGPzeXGYFz6QayQP, rqQIH8YSnsjCGlh0OhTqnB7VpX3AXbvk, 1.0f, 1.0f, PGhz43raTzFfQXonRtn5hujZ54NDE8EI, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR);
        field009.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ void E0B33x2eVapaEv3p17aYD4kV13sBnWJv(class_4587 f8v67YOoPALawwq2X5NlCl7tUtm3cwJc, Color MWJ8bOU4I2Gor9zewszpKZn5E7i3BNtR, double UfORq4J7rE9LzKrufbQBbn6AGsJO6dqK, double d, double QQWqXITwLjAFsegM0I2lgRBqDl7yHZP5, double TCh2RdJ3id3i1M7LqnaLjuu6WGLK76pa) {
        float[] field039 = SecureClass0898.gnqLEsxEGMPGfzJPlR7HLZ0btMc3yksh(SecureClass0898.uVf8sjVFl5nBx29N1S6gGeKvsbO2IBbr(MWJ8bOU4I2Gor9zewszpKZn5E7i3BNtR.getRGB()));
        Matrix4f field040 = f8v67YOoPALawwq2X5NlCl7tUtm3cwJc.method_23760().method_23761();
        class_287 field041 = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        field041.method_22918(field040, (float)UfORq4J7rE9LzKrufbQBbn6AGsJO6dqK, (float)d, 0.0f).method_22915(field039[0], field039[1], field039[2], field039[3]);
        field041.method_22918(field040, (float)QQWqXITwLjAFsegM0I2lgRBqDl7yHZP5, (float)TCh2RdJ3id3i1M7LqnaLjuu6WGLK76pa, 0.0f).method_22915(field039[0], field039[1], field039[2], field039[3]);
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.setShader(class_757::method_34540);
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field041);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void xOvxPgVP2JgXo6pnZsmk0hw0scMdMpEe(class_4587 xFb7XFEETpVCn8MBnmJnazf4aYD338SZ, Color JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq, double U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK, double yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU, double WpqfLElIbI7Ff2IIrPCLSHdks5QnJYoK, double fdqEAqrshbcWbzUxsx1UilT3uT0mzwnf, int field042, float iOADsaQVwlJOSHndSoeBs9qVleN8eYS8, Runnable Rw8ui5zNp4QlaA4xd2TDw2X3S0cXY6G6) {
        field042 = class_3532.method_15340((int)field042, (int)16, (int)360);
        Matrix4f field043 = xFb7XFEETpVCn8MBnmJnazf4aYD338SZ.method_23760().method_23761();
        float field044 = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getRed() / 255.0f;
        float field045 = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getGreen() / 255.0f;
        float f = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getBlue() / 255.0f;
        float field046 = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getAlpha() / 255.0f;
        class_287 field047 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        field047.method_22918(field043, (float)U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK, (float)yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU, iOADsaQVwlJOSHndSoeBs9qVleN8eYS8).method_22915(field044, field045, f, field046);
        float field048 = 360.0f / (float)field042;
        float field049 = 0.0f;
        while (true) {
            if (!(field049 <= 360.0f)) {
                SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
                Rw8ui5zNp4QlaA4xd2TDw2X3S0cXY6G6.run();
                SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field047);
                SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
                return;
            }
            double field050 = Math.toRadians((float)field049);
            double field051 = Math.sin((double)field050) * WpqfLElIbI7Ff2IIrPCLSHdks5QnJYoK;
            double d = Math.cos((double)field050) * fdqEAqrshbcWbzUxsx1UilT3uT0mzwnf;
            field047.method_22918(field043, (float)(U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK + field051), (float)(yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU + d), iOADsaQVwlJOSHndSoeBs9qVleN8eYS8).method_22915(field044, field045, f, field046);
            field049 += field048;
        }
    }

    public static /* bridge */ /* synthetic */ void eISpsbyEUjYaKaEBfXb2sAEoWTQEDpVo(class_4587 tKAMzelqRHpgv12iVX4LQIDBdrOnNg0H, float MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, float D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, float wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, float iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, Color L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx, Color wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ, float XMKfU6CuisSevJ8sFH3j51mJjj83Tto5) {
        Matrix4f matrix4f = tKAMzelqRHpgv12iVX4LQIDBdrOnNg0H.method_23760().method_23761();
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShader(class_757::method_34540);
        class_287 field052 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        field052.method_22918(matrix4f, MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getRed() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getGreen() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getBlue() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getAlpha() / 255.0f);
        field052.method_22918(matrix4f, MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getRed() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getGreen() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getBlue() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getAlpha() / 255.0f);
        field052.method_22918(matrix4f, wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getRed() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getGreen() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getBlue() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getAlpha() / 255.0f);
        field052.method_22918(matrix4f, wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getRed() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getGreen() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getBlue() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getAlpha() / 255.0f);
        class_286.method_43433((class_9801)field052.method_60800());
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void Vyjt1DL8yZ9ovz48utVOIZ5SDsHk7id3(class_4587 class_45872, float EqRDAZpQGezxv6ptOMy5noHLidJUXMmw, float a9MfbjnY9ws9EpwqipFzc4gP6XZ3eq7S, float HWc1fnWylZIRGVLgafYTNhIuY7wYQ6kF, float f, float vITQTVWnL5baTSwd8CrJlT5rwhFEbpNT, Color FFluMEnbLfDR13XvMl3uCzccsGGVDchN, Color ZLPPXFDl1zfyEeuQCIhtbYOMMc7QrAIY, Color WzMnX7rG31KpfcnaFMQsVPKx5YVPIl3k, Color Xgp0xyX1m57CuMMIOn929VxQF8ciwGll) {
        SecureClass1049.LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_45872, EqRDAZpQGezxv6ptOMy5noHLidJUXMmw, a9MfbjnY9ws9EpwqipFzc4gP6XZ3eq7S, HWc1fnWylZIRGVLgafYTNhIuY7wYQ6kF, f, 0.0f, vITQTVWnL5baTSwd8CrJlT5rwhFEbpNT, 0.0f, 1.0f, FFluMEnbLfDR13XvMl3uCzccsGGVDchN, ZLPPXFDl1zfyEeuQCIhtbYOMMc7QrAIY, WzMnX7rG31KpfcnaFMQsVPKx5YVPIl3k, Xgp0xyX1m57CuMMIOn929VxQF8ciwGll);
    }

    public static /* bridge */ /* synthetic */ void j0HDaeC7P2lOxF11Qp0iT3rTO2dKxb4k(Matrix4f iI08L9BAIoht62R41T096erx7zI5dzZe, float qBpY3auKng0ytwAfg1ctgfNbhhkNp6AT, float f, float o69haep5CUMKVLJ6gJSWdkXEGvP8u97U, float KrxSqge4OymQOxiZ5nNYGSK6EpUmrQ97, float p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9, float zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl, float zlGeszttnSoqrLdK3AtIALz3Wh8ln623, float JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE, float Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, float sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, float VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, float V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, float lO1qYCgH3t2ZgN1KWc7uJHO5WqXyRamO) {
        class_287 field053 = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        SecureClass1049.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(zlGeszttnSoqrLdK3AtIALz3Wh8ln623 - V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE - V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, 0);
        SecureClass1049.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(zlGeszttnSoqrLdK3AtIALz3Wh8ln623 - sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl + sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, 1);
        SecureClass1049.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9 + Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl + Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, 2);
        SecureClass1049.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9 + VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE - VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, 3);
        int field054 = 0;
        while (true) {
            if (field054 >= 4) {
                SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field053);
                return;
            }
            float[] field055 = field005[field054];
            float f2 = field055[2];
            for (float KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO = (float)field054 * 90.0f; KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO <= (float)(field054 + 1) * 90.0f; KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO += 90.0f / lO1qYCgH3t2ZgN1KWc7uJHO5WqXyRamO) {
                float field056 = Math.toRadians((float)KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO);
                float field057 = Math.sin((float)field056) * f2;
                float field058 = Math.cos((float)field056) * f2;
                field053.method_22918(iI08L9BAIoht62R41T096erx7zI5dzZe, field055[0] + field057, field055[1] + field058, 0.0f).method_22915(qBpY3auKng0ytwAfg1ctgfNbhhkNp6AT, f, o69haep5CUMKVLJ6gJSWdkXEGvP8u97U, KrxSqge4OymQOxiZ5nNYGSK6EpUmrQ97);
            }
            ++field054;
        }
    }

    public static /* bridge */ /* synthetic */ void LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_4587 T0JXqimlvfYjLIcJS9C3814sYY8GPZt4, float aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8, float HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn, float ThAoEdwjgIVcAYeArbrJLtVCord0pakz, float UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5, float N4xEhzsaTq0KSHeI1F5MO96hljhdtsoA, float AOxhNx45XMtVk3g8g7e3MeIXVtd2HMfw, float cQDaEypPDaYE0TEiJ9YXL6csyizzu61h, float hcsElboOsuEIlRGc21eQo41BNsq41OJF, Color Tyn3OJNLtbLMBQJHsZQ8XL0jaObah6lr, Color MLMGcDI8yKHGaac0vDHi0T0mAHudAf5o, Color V7sCAIP2YhpCizJLwUmi5vgDm0IwE6Lt, Color vT1IjFWbUViEFaFPmXAvwZMw1pladRax) {
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 field059 = SecureClass1049.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(T0JXqimlvfYjLIcJS9C3814sYY8GPZt4.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8 - 10.0f, HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn - 10.0f, ThAoEdwjgIVcAYeArbrJLtVCord0pakz + 20.0f, UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5 + 20.0f, N4xEhzsaTq0KSHeI1F5MO96hljhdtsoA);
        SecureClass1049.VRGrIVrn4B2c1SV9EDbbZFJtZRjlMA5N(aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8, HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn, ThAoEdwjgIVcAYeArbrJLtVCord0pakz, UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5, hcsElboOsuEIlRGc21eQo41BNsq41OJF, AOxhNx45XMtVk3g8g7e3MeIXVtd2HMfw, cQDaEypPDaYE0TEiJ9YXL6csyizzu61h, Tyn3OJNLtbLMBQJHsZQ8XL0jaObah6lr, MLMGcDI8yKHGaac0vDHi0T0mAHudAf5o, V7sCAIP2YhpCizJLwUmi5vgDm0IwE6Lt, vT1IjFWbUViEFaFPmXAvwZMw1pladRax);
        class_286.method_43433((class_9801)field059.method_60800());
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void a64m0VV3kqjLaic7npqZ2bKBCbiTs4cH(class_4587 SYLL23E9k9lacQwXBYLHP6Q1wop3uupw, Color YBwMVzsGqFDRgdwA3ivYB9vOfp99j9pL, double d, double M6cJkUhA3KWVMBO9rZjsCZmmB6aKWaTN, double JjhKwQeuQLqFlX7ItWC34Ms3O3BPz88m, double hYxZ2h0LmIh9VTaenk8MMG1XllnHtZoB, int nQbPTpPMFoHkYqZS5QJygEeRHJV0OJCi) {
        SecureClass1049.xOvxPgVP2JgXo6pnZsmk0hw0scMdMpEe(SYLL23E9k9lacQwXBYLHP6Q1wop3uupw, YBwMVzsGqFDRgdwA3ivYB9vOfp99j9pL, d, M6cJkUhA3KWVMBO9rZjsCZmmB6aKWaTN, JjhKwQeuQLqFlX7ItWC34Ms3O3BPz88m, hYxZ2h0LmIh9VTaenk8MMG1XllnHtZoB, nQbPTpPMFoHkYqZS5QJygEeRHJV0OJCi, 0.0f, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void rhE0UhdAyIcHOqSXGvl0wxMEHAwwUrNV(class_4587 NRUaJh076Gihe6HfqvV7eAUYSWhlEvF7, float adZ8H5H7pwVBMpMjyL2ON1XnvZDJRsFJ, float n1RKugjOJokrfvStR7AroFpuLb3JtJDm, float pnXj90bEab4xz0EkhN30E1Y6ZRTvmYJA, float oXucK9MpIkOLmAp1N5r8tYsl9tJO8OZr, Color QSNuLxQ7qqcSCyETGQzsN2Og7jj4NWUw, Color color) {
        SecureClass1049.eISpsbyEUjYaKaEBfXb2sAEoWTQEDpVo(NRUaJh076Gihe6HfqvV7eAUYSWhlEvF7, adZ8H5H7pwVBMpMjyL2ON1XnvZDJRsFJ, n1RKugjOJokrfvStR7AroFpuLb3JtJDm, pnXj90bEab4xz0EkhN30E1Y6ZRTvmYJA, oXucK9MpIkOLmAp1N5r8tYsl9tJO8OZr, QSNuLxQ7qqcSCyETGQzsN2Og7jj4NWUw, color, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void kld10KIySKBbYakcqCxEEqdJ7xP9eSOO(class_4587 pkYCzvmp2mTOPKMZI6Kg646dwFtlUky3, float jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, float fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, float FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, float UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, Color RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D, Color ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs, float f) {
        Matrix4f field060 = pkYCzvmp2mTOPKMZI6Kg646dwFtlUky3.method_23760().method_23761();
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShader(class_757::method_34540);
        class_287 field061 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        field061.method_22918(field060, jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, f).method_22915((float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getRed() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getGreen() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getBlue() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getAlpha() / 255.0f);
        field061.method_22918(field060, jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, f).method_22915((float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getRed() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getGreen() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getBlue() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getAlpha() / 255.0f);
        field061.method_22918(field060, FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, f).method_22915((float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getRed() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getGreen() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getBlue() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getAlpha() / 255.0f);
        field061.method_22918(field060, FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, f).method_22915((float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getRed() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getGreen() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getBlue() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getAlpha() / 255.0f);
        class_286.method_43433((class_9801)field061.method_60800());
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void MOk14QkPU2TldY3Gr86lWjoAcTwWF4tJ(class_4587 class_45872, float f, float urZX8atWQDPM0qNaqzVmkKCidO6lhcIq, float RmLxJC3KGGpJEM6hDZe7zhWUnlTOgdyr, float Q2VVnqsEGRQjte4bZmRGmckeek6nHK6B, Color color, Color color2) {
        SecureClass1049.kld10KIySKBbYakcqCxEEqdJ7xP9eSOO(class_45872, f, urZX8atWQDPM0qNaqzVmkKCidO6lhcIq, RmLxJC3KGGpJEM6hDZe7zhWUnlTOgdyr, Q2VVnqsEGRQjte4bZmRGmckeek6nHK6B, color, color2, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void kMnnAHPLjQ3703SmFkCtnJ2aVgMmRFSx(class_4587 SnO7H8gJclbfprOJGTOY0vJXvVm1qm4j, Color vf1tB12LXu0jMv4olyeY3yJY1eTXEkps, double iTWhTBA8O2alSt9fOSnmW9NsHHZ5GF7f, double AvTqFNKSr2t7XFXFLurFZVpI1gdoZJ38, double cjsS6niq8kuQMnA3ELWFPnkm5xi00agq, double uJfZwe4M0XoLQEnFEgdw5OihYrMVSwke, float t61zd8hEIzlQwI2DqWVA2wuqeGXJPTYZ, float iZOiXiaDWW8imlVWD8s5Lw2b0BcJ2BLx, float WJUca4hHtCoOCvqHgZgvBGoNlzMxPQRM, float YUZitb2juMgJeltAIO5zv0a2001KqPGu, float YV8thLoQyTcDX809UYqHgnMmYaiCWka9, Runnable W9kvPSSjejAxVMUkRo6rrJNdhxUBMlCH) {
        Matrix4f field062 = SnO7H8gJclbfprOJGTOY0vJXvVm1qm4j.method_23760().method_23761();
        float field063 = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getRed() / 255.0f;
        float f = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getGreen() / 255.0f;
        float field064 = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getBlue() / 255.0f;
        float field065 = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getAlpha() / 255.0f;
        SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        W9kvPSSjejAxVMUkRo6rrJNdhxUBMlCH.run();
        SecureClass1049.j0HDaeC7P2lOxF11Qp0iT3rTO2dKxb4k(field062, field063, f, field064, field065, (float)iTWhTBA8O2alSt9fOSnmW9NsHHZ5GF7f, (float)AvTqFNKSr2t7XFXFLurFZVpI1gdoZJ38, (float)cjsS6niq8kuQMnA3ELWFPnkm5xi00agq, (float)uJfZwe4M0XoLQEnFEgdw5OihYrMVSwke, t61zd8hEIzlQwI2DqWVA2wuqeGXJPTYZ, iZOiXiaDWW8imlVWD8s5Lw2b0BcJ2BLx, WJUca4hHtCoOCvqHgZgvBGoNlzMxPQRM, YUZitb2juMgJeltAIO5zv0a2001KqPGu, YV8thLoQyTcDX809UYqHgnMmYaiCWka9);
        SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ class_287 K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(Matrix4f xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, class_287 field066, float tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, float sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, float vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, float PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, float dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12) {
        field066.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        field066.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz + PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        field066.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ + vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz + PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        field066.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ + vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        return field066;
    }

    public static /* bridge */ /* synthetic */ void QdjJWxy2cLPO3z5ygW4TLwQKXgbqppsr(class_4587 class_45872, Color LLqTePRBa00zULv2PMcseGtCZlofULny, float f, float O5vY9305ZxKICAuJ4NvgdO5cLgT4l6uc, float ZLaV5qbwqsNYAufThoxqNOV2UobstPyS, float IvytobZw6dNWvsa78KLNHKk7nGPIb3mM, Runnable HbThIjQWp5GzwUsoC4qb7KG6uAqbTFpf) {
        float field067 = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getRed() / 255.0f;
        float field068 = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getGreen() / 255.0f;
        float field069 = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getBlue() / 255.0f;
        float field070 = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getAlpha() / 255.0f;
        Matrix4f field071 = class_45872.method_23760().method_23761();
        class_287 field072 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_1576);
        int field073 = 0;
        while (true) {
            if (field073 > 360) {
                SecureClass1049.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
                HbThIjQWp5GzwUsoC4qb7KG6uAqbTFpf.run();
                SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field072);
                SecureClass1049.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
                return;
            }
            field072.method_22918(field071, (float)((double)f + Math.sin((double)((double)field073 * 3.141526 / 180.0)) * (double)ZLaV5qbwqsNYAufThoxqNOV2UobstPyS), (float)((double)O5vY9305ZxKICAuJ4NvgdO5cLgT4l6uc + Math.cos((double)((double)field073 * 3.141526 / 180.0)) * (double)ZLaV5qbwqsNYAufThoxqNOV2UobstPyS), 0.0f).method_22915(field067, field068, field069, field070);
            ++field073;
        }
    }

    public static /* bridge */ /* synthetic */ void DEZoARO1MQHMizazuOqtjqeFu21Uw8uc(class_4587 class_45872, float UJzEDm3pXwBglSo2tFTkAHAZ2ATWjhic, float UJIgw1wiyj4rVq5e4ZbApdhcz4bZSgJe, float f, float pLEQNTksvIJA8VmRjEnnECYPOD4w4ZUA, float hjrwkS0kjhyLZLY96IHS3GI2N8N54Gzd, float DIhDs08lu2mgfK2aAFsJi0AsLydbc3iN, float THp2E5CoXWouvJPbZlRtBIqDpIs2H8dQ, Color nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1) {
        SecureClass1049.LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_45872, UJzEDm3pXwBglSo2tFTkAHAZ2ATWjhic, UJIgw1wiyj4rVq5e4ZbApdhcz4bZSgJe, f, pLEQNTksvIJA8VmRjEnnECYPOD4w4ZUA, 0.0f, hjrwkS0kjhyLZLY96IHS3GI2N8N54Gzd, DIhDs08lu2mgfK2aAFsJi0AsLydbc3iN, THp2E5CoXWouvJPbZlRtBIqDpIs2H8dQ, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1);
    }

    public static /* bridge */ /* synthetic */ void WJjnQ0QgFTWAL6KnkS8mE7YAmgXWonZj(class_4587 ML1c7LTmxSWLqaaNNInPRokStgd1ifbJ, Color color, float zA4uVrjh2Ah5OG5XskEoEQH2qnqvuGT8, float n2p8rCSna8zvBPni9LgVSgGKMA2aUE3Y, float f, float wGoPdn0p74tiJNaHKXVPBCblU7PV2M5X) {
        SecureClass1049.QdjJWxy2cLPO3z5ygW4TLwQKXgbqppsr(ML1c7LTmxSWLqaaNNInPRokStgd1ifbJ, color, zA4uVrjh2Ah5OG5XskEoEQH2qnqvuGT8, n2p8rCSna8zvBPni9LgVSgGKMA2aUE3Y, f, wGoPdn0p74tiJNaHKXVPBCblU7PV2M5X, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void gOh2JD1PxSMJFDP6OeRf0JJ7E1qRxkEp(class_4587 CiX0I2aBbfxSSsXFm8YbezY7E56FHqbx, Color color, double onRmv4DBDKDD3LLb5FK7kzJaviYIUiG3, double d, double QpyNXLGFTXlCOrIpNuV2cBijfbSPO50h, double yiKDYk1GFma4FmXGLMwxTy1qHjOFx6Qz, float GKqo69CLzxN92HUKetm3xkLzAUWbSBux, float kfVVlTPLsi7uiODiDC81y9sYXo6wdDsI, float m4NuL47ODc21Oa5CIHMkA8BHMUWqOOY0, float f, float q66Q5F9EkLtWdnASrbtrAcut13ePHhnB) {
        SecureClass1049.kMnnAHPLjQ3703SmFkCtnJ2aVgMmRFSx(CiX0I2aBbfxSSsXFm8YbezY7E56FHqbx, color, onRmv4DBDKDD3LLb5FK7kzJaviYIUiG3, d, QpyNXLGFTXlCOrIpNuV2cBijfbSPO50h, yiKDYk1GFma4FmXGLMwxTy1qHjOFx6Qz, GKqo69CLzxN92HUKetm3xkLzAUWbSBux, kfVVlTPLsi7uiODiDC81y9sYXo6wdDsI, m4NuL47ODc21Oa5CIHMkA8BHMUWqOOY0, f, q66Q5F9EkLtWdnASrbtrAcut13ePHhnB, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void Dv7R9f6RtMjCWno3RMzV1TOVj3UIQ1cc(class_332 OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI, class_1799 BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, int n, int YKUwKFD9fXSYdE91v5tLt4ZA9jIGmzkp, Color Y1B9WsRFKOmK04fKgjljXXqXFB3gbRlG) {
        class_4587 class_45872 = OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51448();
        if (BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7960()) {
            return;
        }
        class_1087 field074 = SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4019(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, (class_1937)SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, (class_1309)SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724, 0);
        class_45872.method_22903();
        class_45872.method_46416((float)(n + 8), (float)(YKUwKFD9fXSYdE91v5tLt4ZA9jIGmzkp + 8), 150.0f);
        try {
            class_45872.method_22905(16.0f, -16.0f, 16.0f);
            boolean field075 = !field074.method_24304();
            boolean field076 = field075;
            if (field075) {
                class_308.method_24210();
            }
            SecureClass1049.MnHOcBlMWmYKuLa8BFUJoJdgU1KwQuTO(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, class_45872, (class_4597)OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51450(), 0xF000F0, Y1B9WsRFKOmK04fKgjljXXqXFB3gbRlG, field074);
            OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51452();
            if (field075) {
                class_308.method_24211();
            }
        }
        catch (Throwable iJUlA5b7EfscPIDgEFyFIeIeMK4iO6FF) {
            class_128 field077 = class_128.method_560((Throwable)iJUlA5b7EfscPIDgEFyFIeIeMK4iO6FF, (String)"Phobos item rendering");
            class_129 class_1295 = field077.method_562("Item being rendered");
            class_1295.method_577("Item Type", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7909()));
            class_1295.method_577("Item Components", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_57353()));
            class_1295.method_577("Item Foil", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7958()));
            throw new class_148(field077);
        }
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ void u0b5atAjjS66I01VUszn4vOgqKuQTGuG(class_1087 NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp, class_1799 class_17992, int rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, Color color, class_4587 JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, class_4588 YRvjScjHtlelE0Yite28T1NGsLwQStdL) {
        class_5819 field078 = class_5819.method_43047();
        long field079 = 42L;
        class_2350[] class_2350Array = class_2350.values();
        int n = class_2350Array.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                field078.method_43052(42L);
                SecureClass1049.ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, YRvjScjHtlelE0Yite28T1NGsLwQStdL, NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp.method_4707(null, null, field078), class_17992, rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, color);
                return;
            }
            class_2350 field080 = class_2350Array[n2];
            field078.method_43052(42L);
            SecureClass1049.ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, YRvjScjHtlelE0Yite28T1NGsLwQStdL, NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp.method_4707(null, field080, field078), class_17992, rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, color);
            ++n2;
        }
    }

    public /* synthetic */ SecureClass1049() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(float scmA09vQiPMdI7F36rY97fodbz00sCRn, float hxXQHaHsSHYF3SKkl2s8p4lbDN6OqPjX, float DHZnHyex6DJJYa4g5jjjyXAHOSVSoe3x, int n) {
        SecureClass1049.field005[n][0] = scmA09vQiPMdI7F36rY97fodbz00sCRn;
        SecureClass1049.field005[n][1] = hxXQHaHsSHYF3SKkl2s8p4lbDN6OqPjX;
        SecureClass1049.field005[n][2] = DHZnHyex6DJJYa4g5jjjyXAHOSVSoe3x;
    }

    public static /* bridge */ /* synthetic */ void MnHOcBlMWmYKuLa8BFUJoJdgU1KwQuTO(class_1799 jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, class_4587 WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, class_4597 BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, int zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, Color wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ, class_1087 field081) {
        if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_7960()) {
            return;
        }
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_22903();
        if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_31574(class_1802.field_8547)) {
            field081 = SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_918.field_40532);
        } else if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_31574(class_1802.field_27070)) {
            field081 = SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_918.field_40533);
        }
        field081.method_4709().method_3503(class_811.field_4317).method_23075(false, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR);
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_46416(-0.5f, -0.5f, -0.5f);
        if (field081.method_4713()) {
            SecureInterface0134.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().field_27770.method_3166(jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, class_811.field_4317, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ.hashCode());
        } else {
            class_1921 field082 = wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ.getAlpha() != 255 ? SecureClass0101.cfr_renamed_185(jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, true) : class_4696.method_23678((class_1799)jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, (boolean)true);
            class_4588 class_45882 = class_918.method_29711((class_4597)BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, (class_1921)field082, (boolean)true, (boolean)false);
            SecureClass1049.u0b5atAjjS66I01VUszn4vOgqKuQTGuG(field081, jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, class_45882);
        }
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_22909();
    }

    public static /* bridge */ /* synthetic */ void ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(class_4587 j9HZUKxjDs5Z69JzBvf8duSpQOaK4u7N, class_4588 WVrKAjhFEtfGkbj7QWjYaKHan3hhENOz, List<class_777> skCOVKttaIlEVZkQ8GMKN5x7P2gYxeXh, class_1799 kYw6fAq8B3Izp04g2fs3bQwBwd6WDacO, int oXHLJ38gZFMkPraAQBpxt2sNlkjM6rvh, Color e7spU4JAY0SHOcvKPYR9817jLbIo101c) {
        boolean field083 = !kYw6fAq8B3Izp04g2fs3bQwBwd6WDacO.method_7960();
        class_4587.class_4665 class_46652 = j9HZUKxjDs5Z69JzBvf8duSpQOaK4u7N.method_23760();
        Iterator<class_777> iterator = skCOVKttaIlEVZkQ8GMKN5x7P2gYxeXh.iterator();
        while (iterator.hasNext()) {
            class_777 field084 = iterator.next();
            float field085 = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getAlpha() / 255.0f;
            float field086 = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getRed() / 255.0f;
            float field087 = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getGreen() / 255.0f;
            float field088 = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getBlue() / 255.0f;
            WVrKAjhFEtfGkbj7QWjYaKHan3hhENOz.method_22919(class_46652, field084, field086, field087, field088, field085, oXHLJ38gZFMkPraAQBpxt2sNlkjM6rvh, class_4608.field_21444);
        }
        return;
    }

    static {
        field005 = new float[][]{new float[3], new float[3], new float[3], new float[3]};
    }
}

