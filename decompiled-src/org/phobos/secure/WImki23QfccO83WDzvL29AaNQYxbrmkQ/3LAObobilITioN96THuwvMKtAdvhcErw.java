/*
 * Decompiled with CFR.
 */
package org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ;

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
import org.phobos.secure.1QTSqdFu1qt4b1WvDl15MoAj2vMj5tlJ.dQUW3R3dewI7xqCpAxXfPVxmX1393uBs;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.xm3s3uJsT4uuI0XTPSXhuGIhg98wBz0c;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.cWMXA5nZ7CO0JZ3WLpwBd1pTlxvFal0D;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.s7DAjgNhRmduZVDyDddmFhhDDl4kBube;
import org.phobos.secure.7KgfbqPz0TZEvgx4F8x37flDNykxuB6z._6nwg3Gcr0zuj7n7chk0XAah4rKGxxRr8;
import org.phobos.secure.7KgfbqPz0TZEvgx4F8x37flDNykxuB6z.fgfydxZhTcHETwd61pqog2Km3kVePF5k;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm._1iutLI29KjOx5p3aauXH61CD9QbwDus2;
import org.phobos.secure.RugDPRqy5xmkJR7Yctr5fQZFvaNSp12I.icMdWmNr8Pb5WH0pNEwP2pghI4tk0utl;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.IZ98uvBRGGYNr4uMhVTPEVZTqLx36f7H;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ._7sWj8MK2EfzsmFyygcWoZtrby37qFvnw;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.A6GjiMAvA6QNBen5PRoViHmjE6sPEYf9;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.RqE3RZtv0AJpL95xb8TghNkqnySaHTbo;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.DlVGS4h93eZ3L3XQxDLniiHqHmt4jqN3;
import org.phobos.secure.fTk4RlLkMp5c4dhA0Mjh9YGk4LiwJiv4.q7MzOanRLwl12Zyv3vxGXVzGnChQ6zQg;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb._9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;

public final class _3LAObobilITioN96THuwvMKtAdvhcErw {
    public static /* synthetic */ q7MzOanRLwl12Zyv3vxGXVzGnChQ6zQg jhVUhveuE0CJ2zwVB3LzgMG6K8hcnzW5;
    public static /* synthetic */ _6nwg3Gcr0zuj7n7chk0XAah4rKGxxRr8 F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH;
    public static /* synthetic */ RqE3RZtv0AJpL95xb8TghNkqnySaHTbo gbKEMPkyczzDYmCuZzi5RjtsTet4C4zQ;
    public static /* synthetic */ _7sWj8MK2EfzsmFyygcWoZtrby37qFvnw yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC;
    public static final /* synthetic */ float[][] Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ;
    public static /* synthetic */ dQUW3R3dewI7xqCpAxXfPVxmX1393uBs cfr_renamed_649;
    public static /* synthetic */ A6GjiMAvA6QNBen5PRoViHmjE6sPEYf9 wkJ25QBRvDZ47lKRsfS8sqnf1fWbTFt3;
    public static /* synthetic */ _1iutLI29KjOx5p3aauXH61CD9QbwDus2 lW1vaArtAjM4eSX3m0U5nde4oKGeCh2R;
    public static /* synthetic */ xm3s3uJsT4uuI0XTPSXhuGIhg98wBz0c jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6;
    public static /* synthetic */ IZ98uvBRGGYNr4uMhVTPEVZTqLx36f7H Xm0hxlFQMaf1TF2kijZLMwXFYZYhmmAW;
    public static /* synthetic */ fgfydxZhTcHETwd61pqog2Km3kVePF5k g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO;
    public static /* synthetic */ icMdWmNr8Pb5WH0pNEwP2pghI4tk0utl cQwaIMAns7JxuT5RSVSbaujwENH8Kaok;
    public static /* synthetic */ DlVGS4h93eZ3L3XQxDLniiHqHmt4jqN3 mqwZmk50LDBaiFJW9dZlurbUwOstTdU9;

    public static /* bridge */ /* synthetic */ void Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(Matrix4f WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, double d, double qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, double Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, double bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, float f, float Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, float XI2o0nYhssQsUeKVknbEYUDjM25n3WrI, float rupq4WRR8CZQzyhNoua2THBTzh6xuF74) {
        class_287 Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1585);
        Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)d, (float)bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, 0.0f).method_22913(f, rupq4WRR8CZQzyhNoua2THBTzh6xuF74);
        Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, (float)bDQTBvkKZSZ5x7QEnAeY8hnndYWT2Kzq, 0.0f).method_22913(Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, rupq4WRR8CZQzyhNoua2THBTzh6xuF74);
        Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)qZUXyxZKYZV3aWqmZFZ8rSj4ANmFC0H7, (float)Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, 0.0f).method_22913(Or1GUvFi57eDpYcSdNifX9NUfrOjh0RN, XI2o0nYhssQsUeKVknbEYUDjM25n3WrI);
        Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz.method_22918(WebJ4b8Zu6il39u9TBLXlCI6qXWOoWwl, (float)d, (float)Y6nMw3oHzqIEP2UOnvgem2UE5Y6sEaJm, 0.0f).method_22913(f, XI2o0nYhssQsUeKVknbEYUDjM25n3WrI);
        RenderSystem.setShader(class_757::method_34542);
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(Vf4ozetmUo8L7TJ3kE68x2o0oYdcsXIz);
    }

    public static /* bridge */ /* synthetic */ void VrLSK0v5C3snQgdpcad5oFJ0ZA5P2tnH(class_4587 V1xaE3XwqA7MXNmhfXKsbJlZkwV7K4mT, double NMj6WPEUA8n7Qx9JSTHuG9az4aOwHqS7, double By7YVVfxtgpU84ssBCt0BmlRR1YqFXa1, double PnfxyNEBfBE6gTKQXG5nyzYIIpzzgsRL, double dymxEMFN54Mmw62YQsJ7chMdYItSrUO2, class_1058 xl15sEJySuOWB7f74Slcj0heJQzVSQ0e) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.cfr_renamed_650(V1xaE3XwqA7MXNmhfXKsbJlZkwV7K4mT, xl15sEJySuOWB7f74Slcj0heJQzVSQ0e, NMj6WPEUA8n7Qx9JSTHuG9az4aOwHqS7, By7YVVfxtgpU84ssBCt0BmlRR1YqFXa1, PnfxyNEBfBE6gTKQXG5nyzYIIpzzgsRL, dymxEMFN54Mmw62YQsJ7chMdYItSrUO2);
    }

    public static /* bridge */ /* synthetic */ void PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2() {
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_54(class_4587 pmru4RuqOl0bNA6lyj2kWvXwYFMSJM5y, double d, double D8Hvo00uorpFpT0qE4Xhet7uGcCTTDAL, double sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.YH5ynAaHwuJDkhAdDLW4LvhcagrB0aRa(pmru4RuqOl0bNA6lyj2kWvXwYFMSJM5y, d, D8Hvo00uorpFpT0qE4Xhet7uGcCTTDAL, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, 0.0f, 0.0f, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU, sJhbxAjAVallKpyQvMpB1RQ3siv2D5TU);
    }

    public static /* bridge */ /* synthetic */ void MJf1ZFhViV4uBtjqWdnkW01gMY1Rg6YP() {
        jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6 = new xm3s3uJsT4uuI0XTPSXhuGIhg98wBz0c();
        cfr_renamed_649 = new dQUW3R3dewI7xqCpAxXfPVxmX1393uBs();
        g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO = new fgfydxZhTcHETwd61pqog2Km3kVePF5k();
        cQwaIMAns7JxuT5RSVSbaujwENH8Kaok = new icMdWmNr8Pb5WH0pNEwP2pghI4tk0utl();
        F5ErLPC8f3RTXoGmEFhFGIzVwJviPKFH = new _6nwg3Gcr0zuj7n7chk0XAah4rKGxxRr8();
        yUQJkDUfqKjgwK7WCkg89ftXd39J8TTC = new _7sWj8MK2EfzsmFyygcWoZtrby37qFvnw();
        jhVUhveuE0CJ2zwVB3LzgMG6K8hcnzW5 = new q7MzOanRLwl12Zyv3vxGXVzGnChQ6zQg();
        gbKEMPkyczzDYmCuZzi5RjtsTet4C4zQ = new RqE3RZtv0AJpL95xb8TghNkqnySaHTbo();
        Xm0hxlFQMaf1TF2kijZLMwXFYZYhmmAW = new IZ98uvBRGGYNr4uMhVTPEVZTqLx36f7H();
        lW1vaArtAjM4eSX3m0U5nde4oKGeCh2R = new _1iutLI29KjOx5p3aauXH61CD9QbwDus2();
        mqwZmk50LDBaiFJW9dZlurbUwOstTdU9 = new DlVGS4h93eZ3L3XQxDLniiHqHmt4jqN3();
        wkJ25QBRvDZ47lKRsfS8sqnf1fWbTFt3 = new A6GjiMAvA6QNBen5PRoViHmjE6sPEYf9();
    }

    public static /* bridge */ /* synthetic */ void XQqkUY3NMgzs9k8246Inl5ZsnzcuvnK8(class_4587 GXnY9aGMYhGt209FD4CdBPj7wvZOhtWj, Color FbVedkik3j0SQBAtQeRz4QfKmTSFH3pM, double d, double B3CEy2EzeQ3NH0EZ54pUxHlH7jbNwCn4, double GmskPGbBuwDQXkIuA1R5duc45wx3e7cq) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.sOnMjt2bNgL7ROgvjtWFeGvDpzOTh5Ne(GXnY9aGMYhGt209FD4CdBPj7wvZOhtWj, FbVedkik3j0SQBAtQeRz4QfKmTSFH3pM, d, B3CEy2EzeQ3NH0EZ54pUxHlH7jbNwCn4, GmskPGbBuwDQXkIuA1R5duc45wx3e7cq, GmskPGbBuwDQXkIuA1R5duc45wx3e7cq, 0.0f, 0.0f, 512.0, 512.0, 512.0, 512.0);
    }

    public static /* bridge */ /* synthetic */ void CxXb7E8pYODHa7ZHmD6RaI3oQit3QoMM(class_4587 class_45872, class_2960 V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3, double d, double zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, double d2) {
        float ByEQXIdUuI35vKmChtatLHXz7MtCxJwE = 8.0f;
        float jeIjkn8NfRy2ujVAdGYdQA1XfHEiN3IE = 8.0f;
        RenderSystem.setShaderTexture((int)0, (class_2960)V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(class_45872.method_23760().method_23761(), d, d + d2, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl + d2, (8.0f + 0.0f) / (float)64.0, (8.0f + (float)8.0) / (float)64.0, (ByEQXIdUuI35vKmChtatLHXz7MtCxJwE + 0.0f) / (float)64.0, (ByEQXIdUuI35vKmChtatLHXz7MtCxJwE + (float)jeIjkn8NfRy2ujVAdGYdQA1XfHEiN3IE) / (float)64.0);
        _3LAObobilITioN96THuwvMKtAdvhcErw.nwbC4jlpvpybvhhB686ieifdd3FYSRvx(class_45872, V21ubAIAxuWFZ7UbQCbZcw0AabIB2yN3, d, zEzVKIEAMDn574HaePzSPSKVI5K1ebHl, d2);
    }

    public static /* bridge */ /* synthetic */ void YuyqokWxnJpy51WZI5UHL9vF0Sh6HXU9(class_4587 class_45872, double d, double oRjSuyiGQucjyO8oKBl02uTpdrzZfr4S, double AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw, class_2960 JnqnDiN0nMtkrWJZaZS9rkwFtn50Ii6t) {
        class_287 rcongQN5dsS9LOcYBZHdN6WcMDqEjGnD = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1585);
        Matrix4f M999i9Zvg96ozVjo98eOFWAO7nlB6qmv = class_45872.method_23760().method_23761();
        int IM5DYhumgSoc3ha191LM5AGu5XZHGuzj = 0;
        while (true) {
            if (IM5DYhumgSoc3ha191LM5AGu5XZHGuzj >= 360) {
                RenderSystem.setShaderTexture((int)0, (class_2960)JnqnDiN0nMtkrWJZaZS9rkwFtn50Ii6t);
                RenderSystem.setShader(class_757::method_34542);
                s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(rcongQN5dsS9LOcYBZHdN6WcMDqEjGnD);
                return;
            }
            double sjUmcn9I5A0cRSBaWUqQtkGshpnwOalX = Math.toRadians((float)IM5DYhumgSoc3ha191LM5AGu5XZHGuzj);
            double JPQyLYUZU4zT6ZSXi34qu0U7BMSF0wiM = Math.sin((double)sjUmcn9I5A0cRSBaWUqQtkGshpnwOalX) * AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw;
            double JL1XBJ29oVvVKors1uPm8wiI4hRriPPC = Math.cos((double)sjUmcn9I5A0cRSBaWUqQtkGshpnwOalX) * AlTmlRy3vtjQSO2WCLqxWH9Y1EzfFqsw;
            rcongQN5dsS9LOcYBZHdN6WcMDqEjGnD.method_22918(M999i9Zvg96ozVjo98eOFWAO7nlB6qmv, (float)(d + JPQyLYUZU4zT6ZSXi34qu0U7BMSF0wiM), (float)(oRjSuyiGQucjyO8oKBl02uTpdrzZfr4S + JL1XBJ29oVvVKors1uPm8wiI4hRriPPC), 0.0f).method_22913(0.0f, 0.0f);
            IM5DYhumgSoc3ha191LM5AGu5XZHGuzj += (int)Math.min((double)1.0, (double)(360 - IM5DYhumgSoc3ha191LM5AGu5XZHGuzj));
        }
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_650(class_4587 DmqCS2RhL07vyxLl0WT1oDnjaRJ4nFfG, class_1058 z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb, double d, double d2, double p6paFSaNu9a776UkpUqNLJkQbmznZf6Z, double d3) {
        if (p6paFSaNu9a776UkpUqNLJkQbmznZf6Z != 0.0 && d3 != 0.0) {
            RenderSystem.setShaderTexture((int)0, (class_2960)z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_45852());
            _3LAObobilITioN96THuwvMKtAdvhcErw.hFzzpMwdiLV2iHHqIglUeB9rlhhQHeqR(DmqCS2RhL07vyxLl0WT1oDnjaRJ4nFfG.method_23760().method_23761(), Color.WHITE, d, d + p6paFSaNu9a776UkpUqNLJkQbmznZf6Z, d2, d2 + d3, z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4594(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4577(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4593(), z7UU1fRI7HZpk2A1tHzYO4nhW6yKOuwb.method_4575());
        }
    }

    public static /* bridge */ /* synthetic */ void nwbC4jlpvpybvhhB686ieifdd3FYSRvx(class_4587 z1uOQr6wI77gsJzlvZT6QYXvDEqjSlKt, class_2960 iSKTAiQXd0HeHwESZksCeSjDf9wSESNA, double WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H, double d, double b9DRMJlxzhkcilbdO766XeFGXzOc68Gq) {
        float Ii1W9YpbNHST9XnQPy9HlJkyp2nxI9TD = 8.0f;
        float iKmyVh1Hb1X711kobfx5H4BYVUogF0oF = 8.0f;
        RenderSystem.enableBlend();
        RenderSystem.setShaderTexture((int)0, (class_2960)iSKTAiQXd0HeHwESZksCeSjDf9wSESNA);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Kjzb51zlH42sHlLOHbYqyyc3CSlLq1ac(z1uOQr6wI77gsJzlvZT6QYXvDEqjSlKt.method_23760().method_23761(), WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H, WvbC6rnhRfOFmlgy0xSI0To0jis7Vo8H + b9DRMJlxzhkcilbdO766XeFGXzOc68Gq, d, d + b9DRMJlxzhkcilbdO766XeFGXzOc68Gq, (40.0f + 0.0f) / (float)64.0, (40.0f + (float)8.0) / (float)64.0, (Ii1W9YpbNHST9XnQPy9HlJkyp2nxI9TD + 0.0f) / (float)64.0, (Ii1W9YpbNHST9XnQPy9HlJkyp2nxI9TD + (float)iKmyVh1Hb1X711kobfx5H4BYVUogF0oF) / (float)64.0);
        RenderSystem.disableBlend();
    }

    public static /* bridge */ /* synthetic */ void IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx() {
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* bridge */ /* synthetic */ void hFzzpMwdiLV2iHHqIglUeB9rlhhQHeqR(Matrix4f o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, Color CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r, double d, double FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, double Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, double d2, float RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, float L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, float TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9, float OKic3EA4k7K644R8MuGqT3zB4IoMTmwo) {
        class_287 OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575);
        OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)d, (float)d2, 0.0f).method_22913(RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, OKic3EA4k7K644R8MuGqT3zB4IoMTmwo).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, (float)d2, 0.0f).method_22913(L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, OKic3EA4k7K644R8MuGqT3zB4IoMTmwo).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)FkmIrMmdRbcIW95rJuEVMNWE1L0AyQ9z, (float)Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, 0.0f).method_22913(L8AcrVBRUIr9PiPjy9mjuFM5yw3FYhA9, TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP.method_22918(o5f5lBua3mU70iHKxXovVy8Jp24HkeyI, (float)d, (float)Az7Z0qviXW4r577zLEDdiLk6FiwC0y7d, 0.0f).method_22913(RggOZdvnSnyXmSwdmOBSkNlKlcYhFwNl, TjPoDoR3hrIZsOUhIN5blClS8TKxOpl9).method_22915((float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getRed() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getGreen() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getBlue() / 255.0f, (float)CK5jkDiatLz6ZHh7IFchI2MGh0LYQX1r.getAlpha() / 255.0f);
        RenderSystem.setShader(class_757::method_34543);
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(OpvkGgrcPXBZVji2eMXw6q9Y7EkRqrAP);
    }

    public static /* bridge */ /* synthetic */ void wLb0Yedtepw4LrPRQNhcssNgQwk6lA2r(class_4587 qMeWdxmBNGONJii2tCWxXtKZNqK79N3A, Color xQT2V876gZjqANCvIP2SLLAGmB0jMUF1, double Dqr1yvHot4Mjime7TpYe78b0IdmzwptU, double oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn, double LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ, double K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW, float ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C, Runnable WHqzFFQsDfH1QON9d4fVgfvTD9weONiq) {
        if (Dqr1yvHot4Mjime7TpYe78b0IdmzwptU < LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ) {
            double d = Dqr1yvHot4Mjime7TpYe78b0IdmzwptU;
            Dqr1yvHot4Mjime7TpYe78b0IdmzwptU = LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ;
            LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ = d;
        }
        if (oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn < K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW) {
            double d = oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn;
            oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn = K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW;
            K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW = d;
        }
        Matrix4f matrix4f = qMeWdxmBNGONJii2tCWxXtKZNqK79N3A.method_23760().method_23761();
        float uQmZgHcP3zITpnCSjGOzMoGJ88PzeYlI = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getRed() / 255.0f;
        float Mysr6Wvb76d5I70MYl0oowM3Fly50J48 = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getGreen() / 255.0f;
        float EZG8T0XZLuVnKmyteqpgABol57q13k1i = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getBlue() / 255.0f;
        float f = (float)xQT2V876gZjqANCvIP2SLLAGmB0jMUF1.getAlpha() / 255.0f;
        class_287 QkNam6EiHy3WljicH4UWlwCvpzXNgSq9 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        QkNam6EiHy3WljicH4UWlwCvpzXNgSq9.method_22918(matrix4f, (float)Dqr1yvHot4Mjime7TpYe78b0IdmzwptU, (float)K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(uQmZgHcP3zITpnCSjGOzMoGJ88PzeYlI, Mysr6Wvb76d5I70MYl0oowM3Fly50J48, EZG8T0XZLuVnKmyteqpgABol57q13k1i, f);
        QkNam6EiHy3WljicH4UWlwCvpzXNgSq9.method_22918(matrix4f, (float)LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ, (float)K5QqFxgWU9rSmRdWBk1WYuMHmZpM8WUW, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(uQmZgHcP3zITpnCSjGOzMoGJ88PzeYlI, Mysr6Wvb76d5I70MYl0oowM3Fly50J48, EZG8T0XZLuVnKmyteqpgABol57q13k1i, f);
        QkNam6EiHy3WljicH4UWlwCvpzXNgSq9.method_22918(matrix4f, (float)LEsNjtEEqOz61SoHmhPj6UKaFqLLWXHQ, (float)oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(uQmZgHcP3zITpnCSjGOzMoGJ88PzeYlI, Mysr6Wvb76d5I70MYl0oowM3Fly50J48, EZG8T0XZLuVnKmyteqpgABol57q13k1i, f);
        QkNam6EiHy3WljicH4UWlwCvpzXNgSq9.method_22918(matrix4f, (float)Dqr1yvHot4Mjime7TpYe78b0IdmzwptU, (float)oXg8RHtYDmI6sbPdC0Fk7FK6LO4EYOCn, ujcbFh41qE8V5gskWnGhLLyZbuBj2p0C).method_22915(uQmZgHcP3zITpnCSjGOzMoGJ88PzeYlI, Mysr6Wvb76d5I70MYl0oowM3Fly50J48, EZG8T0XZLuVnKmyteqpgABol57q13k1i, f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        WHqzFFQsDfH1QON9d4fVgfvTD9weONiq.run();
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(QkNam6EiHy3WljicH4UWlwCvpzXNgSq9);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void uuWSmeHcju9t8JiCcFC82dtA6cYFtHVe(class_4587 tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, Color H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, double NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, double zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP, double d, double Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM, double BLssml81pq3UQUlAOhk2MmpGO253KpnS) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + BLssml81pq3UQUlAOhk2MmpGO253KpnS, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(tKHx1Ke1ZcjW7i3LkuE9UGrxjFMWORuY, H9yVwtrOt5Z5IQbzobhRqKQtLnNKZVTh, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d - BLssml81pq3UQUlAOhk2MmpGO253KpnS, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + BLssml81pq3UQUlAOhk2MmpGO253KpnS, NiR05ViAuZPDVNKD4g1KFYtmDQdWd6IF + d, zfi8K6rTrnvD4ECPgXqb1bt8IOkFJwqP + Q8Q7Yb8MePNPcMH9T82xe6x3FyP1PqJM - BLssml81pq3UQUlAOhk2MmpGO253KpnS, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void XV3creKFLqN4NknEVf24gLgVScaWwyh0(class_4587 class_45872, Color color, double oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, double wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP, double A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, double WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + 1.0, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, 0.0f);
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, color, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY - 1.0, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + 1.0, oHAXOPAXj9Lpu7UGWFGgWb9fHJ4woN5f + A6ZP6RYOwFIEZu5FtG1F0ioP9chvseXY, wW8yzGbHehYAtjFGgI8OmTefhvrj0hqP + WxBIPkaRwGjVUaXfVo86OzdM6pcvKI05 - 1.0, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void VRGrIVrn4B2c1SV9EDbbZFJtZRjlMA5N(float mZk7ezBVXjKM2uEPwgE99doRilGT675E, float wlfdYLnwilgCCYTdnSwaRHYOhNhMaTxi, float f, float BIIVkuF5dIYw44onxwdsT00mRurAelzw, float rFIky3xp3E3FqpMkrWVEWoC5eMoMkY8u, float PPFx7ZFBjeJZsqrPh7BdUIewK0cYCeTf, float s2H0lsRtfT3jDe5IYz0YjyDxFEAB5JX6, Color E4TALTDjFlbr04dZUREWmPhgNCuEXNU7, Color Y56GFdp15lbWLnLloxL57UtxJFto4AJS, Color t1R1Ge2bAupHBPQI12HCqKGr7uSevZSk, Color C4ZcQgTNUk5RBezjVYGL3qXL5GFBUOvY) {
        jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6.GaUdnf7WNghfdelKZdrB0GPgtNE8BqJy(mZk7ezBVXjKM2uEPwgE99doRilGT675E, wlfdYLnwilgCCYTdnSwaRHYOhNhMaTxi, f, BIIVkuF5dIYw44onxwdsT00mRurAelzw, rFIky3xp3E3FqpMkrWVEWoC5eMoMkY8u, 1.0f, 1.0f, PPFx7ZFBjeJZsqrPh7BdUIewK0cYCeTf, s2H0lsRtfT3jDe5IYz0YjyDxFEAB5JX6, E4TALTDjFlbr04dZUREWmPhgNCuEXNU7, Y56GFdp15lbWLnLloxL57UtxJFto4AJS, t1R1Ge2bAupHBPQI12HCqKGr7uSevZSk, C4ZcQgTNUk5RBezjVYGL3qXL5GFBUOvY);
        jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ void DoZGhSxLvGHdPoVlMOj7olAYtwpNV7IT(class_4587 lUedT8CDMMusUy5XIsKt6Tm7s4vYEKQK, Color color, double RoR1CIZLWOD397LfHItARWBKuWH3SFhJ, double kwjopAhc2iewvjN69eVA4f35gscTc6ap, double hHFT42nPKkFVErVxvzuLa9x04iNQgfou, float cK4Dxw0NCumbHO8yELe2v5Ua8H7YIBJ2) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(lUedT8CDMMusUy5XIsKt6Tm7s4vYEKQK, color, RoR1CIZLWOD397LfHItARWBKuWH3SFhJ, kwjopAhc2iewvjN69eVA4f35gscTc6ap, RoR1CIZLWOD397LfHItARWBKuWH3SFhJ + (double)cK4Dxw0NCumbHO8yELe2v5Ua8H7YIBJ2, hHFT42nPKkFVErVxvzuLa9x04iNQgfou, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_651(class_4587 USgGAapGmSj8O4jB0Z24mmnEvPrFNdpt, float N6IJXwLZTEL11nJaMDA5qEGo9FkPxZVz, float jnXPbl3LYaOgMzDpzL9AKtreQ384CGp4, Color xu84xClmAXxj6ajlMovjF96F6iFmcOFn, float eWTrWpzbRq1gRV9QymPAo4MDOxdyUjfi) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_310 m4NlZXBBj5U0RKNnozXgpYoxf6aar9Mb = class_310.method_1551();
        class_287 s7QaFxuSC45vEkEW2yNKPvJQF6K3OBD5 = _3LAObobilITioN96THuwvMKtAdvhcErw.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(USgGAapGmSj8O4jB0Z24mmnEvPrFNdpt.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), 0.0f, 0.0f, m4NlZXBBj5U0RKNnozXgpYoxf6aar9Mb.method_22683().method_4486() + 20, m4NlZXBBj5U0RKNnozXgpYoxf6aar9Mb.method_22683().method_4502() + 20, 0.0f);
        cQwaIMAns7JxuT5RSVSbaujwENH8Kaok.EWUX9KUrKhuukMiHrXnLaLde5CswJ5Er(N6IJXwLZTEL11nJaMDA5qEGo9FkPxZVz, jnXPbl3LYaOgMzDpzL9AKtreQ384CGp4, xu84xClmAXxj6ajlMovjF96F6iFmcOFn, eWTrWpzbRq1gRV9QymPAo4MDOxdyUjfi);
        cQwaIMAns7JxuT5RSVSbaujwENH8Kaok.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(s7QaFxuSC45vEkEW2yNKPvJQF6K3OBD5);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void hkByEZxkzGdHkvFF3ozYkB9GuVrm3Tjf(class_4587 xox992YgnDaL9Sl4gQ4e5kghWZX5hyj1, float G9sfwh0UXWNvFaKTzCmrGnjGP6zDBuko, float rnp2nm7XZe4Hlur1gcMxX3EpX67iZ3Or, float yLOIFeoz4b3EN7CKsjyQA5So5AEPtCBi, float mqQHlWAXRfRmhtH8oHhPUpWHQIIMRZnR, Color pCRWHgnVRPKs9MkxweQ7UnGKePCcGJfb, Color color, Color Hshva4OJYXaGrtaV3H2lnj7W2W3SqPfR, Color Fs1owle4rsk2mXXfxzF8okdIvxJZyxFG) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.jBDbAsc3FKoayGKvmQcq2fkhodv6OkvZ(xox992YgnDaL9Sl4gQ4e5kghWZX5hyj1, G9sfwh0UXWNvFaKTzCmrGnjGP6zDBuko, rnp2nm7XZe4Hlur1gcMxX3EpX67iZ3Or, yLOIFeoz4b3EN7CKsjyQA5So5AEPtCBi, mqQHlWAXRfRmhtH8oHhPUpWHQIIMRZnR, pCRWHgnVRPKs9MkxweQ7UnGKePCcGJfb, color, Hshva4OJYXaGrtaV3H2lnj7W2W3SqPfR, Fs1owle4rsk2mXXfxzF8okdIvxJZyxFG, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void BCvHTR9spxTIlwQoWXbxwfRMmMM4HAn0(class_4587 class_45872, Color xCwbt21KHdGgCTrfDmiISjg6vcvCofHD, double d, double FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr, double DvIqd2lJx44TvMEfyrW9L3iFkfuwvaJX, float f) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.Oamm3UQlWx7OJXrO265XDEwYwFdmDpea(class_45872, xCwbt21KHdGgCTrfDmiISjg6vcvCofHD, d, FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr, DvIqd2lJx44TvMEfyrW9L3iFkfuwvaJX, FCE2qOUOjSMulWnhm4uoe1xhWWCFiTfr + (double)f, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void jBDbAsc3FKoayGKvmQcq2fkhodv6OkvZ(class_4587 p63R5v0gjwRRFtr3ll2eKhvIJGx2IZW7, float QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, float f, float X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, float GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, Color iWl0dR2fhG46bSfO7h3Ipv8wotxXwOtg, Color OsFlYu052vmSrt4DG4f60P0KGoNUVnAA, Color Q74M4gHPRXWBxRg6ka0usPg3olqhTKm4, Color EfJWeT2dkFBgBByf8vXH2YbT0vfLwzdL, float CRs9GCKaZzJz4cHucZu5PKbhNUywodAR) {
        Matrix4f glQX0oa5KTR4bDWO16wweOavthqyttWQ = p63R5v0gjwRRFtr3ll2eKhvIJGx2IZW7.method_23760().method_23761();
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.setShader(class_757::method_34540);
        class_287 JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ.method_22918(glQX0oa5KTR4bDWO16wweOavthqyttWQ, X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, f, 0.0f).method_39415(EfJWeT2dkFBgBByf8vXH2YbT0vfLwzdL.getRGB());
        JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ.method_22918(glQX0oa5KTR4bDWO16wweOavthqyttWQ, QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, f, 0.0f).method_39415(OsFlYu052vmSrt4DG4f60P0KGoNUVnAA.getRGB());
        JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ.method_22918(glQX0oa5KTR4bDWO16wweOavthqyttWQ, QcFvcXIBeH13GHXtClUIaFbhoggVPMzy, GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, 0.0f).method_39415(iWl0dR2fhG46bSfO7h3Ipv8wotxXwOtg.getRGB());
        JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ.method_22918(glQX0oa5KTR4bDWO16wweOavthqyttWQ, X9rguGL2UtQHGYxzdAiXViwr8w8SKzPH, GrKtNcDweqxOoqL6T6ItS9afaR8lQoEh, 0.0f).method_39415(Q74M4gHPRXWBxRg6ka0usPg3olqhTKm4.getRGB());
        class_286.method_43433((class_9801)JSyBmRKa7tc2bxn0LGldxrL0lq4HeXQZ.method_60800());
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void tH7onY1GvR64O4Xgvcy56HCZcgCyZeoD(class_4587 AY7YZn7G7AAAXGtWwImPPvSIzVhBltVH, float Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz, float f, float k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I, float v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW, Color s5H96lRFR07f7DzZCySQwRddhDyWTUbp, float w0z2lmym0q4uSZC4xL4EJ5V3JheIGgAV) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 zNF7M02TMB3w0xwXoMXk2g8YeoXje4CX = _3LAObobilITioN96THuwvMKtAdvhcErw.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(AY7YZn7G7AAAXGtWwImPPvSIzVhBltVH.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz - 10.0f, f - 10.0f, k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I + 20.0f, v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW + 20.0f, 0.0f);
        g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO.adVuotlB0dpUXi939sWpfaNueUhBRGUN(Z4gc1nfMMIT3C7FirpVCdqXP1SDwZSfz, f, k2MWD4c4lZqrpxSvJzeTLJXfcygoAk2I, v3ZsFAxarVvMNQfKVZ3Ptir5V7CsDxyW, 1.0f, s5H96lRFR07f7DzZCySQwRddhDyWTUbp, w0z2lmym0q4uSZC4xL4EJ5V3JheIGgAV, 1.0f - (float)s5H96lRFR07f7DzZCySQwRddhDyWTUbp.getAlpha() / 255.0f);
        g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(zNF7M02TMB3w0xwXoMXk2g8YeoXje4CX);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void ahp8kK8puENHHDfSwo0BlPONICiCmrEo(float oaHBsVy50tpUMDycbpnXsZY32kXRyIV6, float SpvutM6N3d7zZ7jPYUEqHcZF0YkIcbpo, float f, float Vy5UFTmFO5FUKgZRJeixXduPP0C8ygoL, float mec2vxOfLHo9TMwQNGCPQKFwl5Dku5cn, Color ssYjqaRfPlkXjuJI9SunJIsNuQvlxIsX) {
        cfr_renamed_649.dkmEnN1vjvKkc9CZ5m8XaguuB0XH4pm7(oaHBsVy50tpUMDycbpnXsZY32kXRyIV6, SpvutM6N3d7zZ7jPYUEqHcZF0YkIcbpo, f, Vy5UFTmFO5FUKgZRJeixXduPP0C8ygoL, mec2vxOfLHo9TMwQNGCPQKFwl5Dku5cn, ssYjqaRfPlkXjuJI9SunJIsNuQvlxIsX);
        cfr_renamed_649.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ Runnable Bcd30A6AbzYfgSeNNWUTETgnjS4MrUPF(float ldYrB5roQKc73VwZAykqiDM1dSKRlBI2, float ORSuCs01gklJjqxamC36TOV3uUravVi2, float SiLUGOiNyfBJxUb5cLHB0vULGGZyExQ6, float f, Color A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R, float gfnwCOdWP1EKdCQLraqgYJKOpf1EbCka) {
        return () -> {
            g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO.adVuotlB0dpUXi939sWpfaNueUhBRGUN(ldYrB5roQKc73VwZAykqiDM1dSKRlBI2, ORSuCs01gklJjqxamC36TOV3uUravVi2, SiLUGOiNyfBJxUb5cLHB0vULGGZyExQ6, f, 1.0f, A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R, gfnwCOdWP1EKdCQLraqgYJKOpf1EbCka, 1.0f - (float)A0xjy1miZL7U7Rw8BNskoQ3vLuIkFY0R.getAlpha() / 255.0f);
            g8IvwmG7Cgw5ENiRWKDKUyR9DxKDwULO.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
        };
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_652(float kW43ghhq6rmnWomheGi1fKRQhuWOxvu8, float puOko2D66eyyj0CrNGgXQgg3FslkstXW, float dZfVQhOqA8Ns4SPLVwPHaFrPMLvKjCLh, float OhOJPhmLlMlx3sa4kGPzeXGYFz6QayQP, float rqQIH8YSnsjCGlh0OhTqnB7VpX3AXbvk, float PGhz43raTzFfQXonRtn5hujZ54NDE8EI, Color r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR) {
        jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6.wa6VZ1dTcOa2n61Kcp3CmsH96wShw4Zn(kW43ghhq6rmnWomheGi1fKRQhuWOxvu8, puOko2D66eyyj0CrNGgXQgg3FslkstXW, dZfVQhOqA8Ns4SPLVwPHaFrPMLvKjCLh, OhOJPhmLlMlx3sa4kGPzeXGYFz6QayQP, rqQIH8YSnsjCGlh0OhTqnB7VpX3AXbvk, 1.0f, 1.0f, PGhz43raTzFfQXonRtn5hujZ54NDE8EI, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR, r8miqPxBkzzlZdC7oBmHt2vGQ9dJYiDR);
        jUbIzu1g8WxeMAl7faZNdQFRnqAupQn6.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
    }

    public static /* bridge */ /* synthetic */ void E0B33x2eVapaEv3p17aYD4kV13sBnWJv(class_4587 f8v67YOoPALawwq2X5NlCl7tUtm3cwJc, Color MWJ8bOU4I2Gor9zewszpKZn5E7i3BNtR, double UfORq4J7rE9LzKrufbQBbn6AGsJO6dqK, double d, double QQWqXITwLjAFsegM0I2lgRBqDl7yHZP5, double TCh2RdJ3id3i1M7LqnaLjuu6WGLK76pa) {
        float[] GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9 = _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.gnqLEsxEGMPGfzJPlR7HLZ0btMc3yksh(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.uVf8sjVFl5nBx29N1S6gGeKvsbO2IBbr(MWJ8bOU4I2Gor9zewszpKZn5E7i3BNtR.getRGB()));
        Matrix4f oLsNcIl6tzLD8S4GhOQUyyhjGZKMrA6L = f8v67YOoPALawwq2X5NlCl7tUtm3cwJc.method_23760().method_23761();
        class_287 qjwKLVpwxnQNK1qWHJs3dZeDzPRHIhwq = class_289.method_1348().method_60827(class_293.class_5596.field_29344, class_290.field_1576);
        qjwKLVpwxnQNK1qWHJs3dZeDzPRHIhwq.method_22918(oLsNcIl6tzLD8S4GhOQUyyhjGZKMrA6L, (float)UfORq4J7rE9LzKrufbQBbn6AGsJO6dqK, (float)d, 0.0f).method_22915(GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[0], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[1], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[2], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[3]);
        qjwKLVpwxnQNK1qWHJs3dZeDzPRHIhwq.method_22918(oLsNcIl6tzLD8S4GhOQUyyhjGZKMrA6L, (float)QQWqXITwLjAFsegM0I2lgRBqDl7yHZP5, (float)TCh2RdJ3id3i1M7LqnaLjuu6WGLK76pa, 0.0f).method_22915(GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[0], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[1], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[2], GTjp9NI66iZyPnA7nvmWWiWK7pGg1OC9[3]);
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.setShader(class_757::method_34540);
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(qjwKLVpwxnQNK1qWHJs3dZeDzPRHIhwq);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void xOvxPgVP2JgXo6pnZsmk0hw0scMdMpEe(class_4587 xFb7XFEETpVCn8MBnmJnazf4aYD338SZ, Color JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq, double U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK, double yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU, double WpqfLElIbI7Ff2IIrPCLSHdks5QnJYoK, double fdqEAqrshbcWbzUxsx1UilT3uT0mzwnf, int oYNcNqt88jdFAWH2jNf68NHcaeyJWW0b, float iOADsaQVwlJOSHndSoeBs9qVleN8eYS8, Runnable Rw8ui5zNp4QlaA4xd2TDw2X3S0cXY6G6) {
        oYNcNqt88jdFAWH2jNf68NHcaeyJWW0b = class_3532.method_15340((int)oYNcNqt88jdFAWH2jNf68NHcaeyJWW0b, (int)16, (int)360);
        Matrix4f jEb2xCeqHnGCjID6184BVMPjVMr7Qmfw = xFb7XFEETpVCn8MBnmJnazf4aYD338SZ.method_23760().method_23761();
        float g0MlnQzsbxJWrXC72kugxKGPAcod3CEu = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getRed() / 255.0f;
        float a6SJPNguyLxSGSaItSMshLnMM0BZ35KT = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getGreen() / 255.0f;
        float f = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getBlue() / 255.0f;
        float MWUoOSM88BYLeHKAhT5AMlkA2snsKKQE = (float)JhvQ6yX4JavHvu2SmGCC5yp5phI3PbKq.getAlpha() / 255.0f;
        class_287 Rbm5bVym6Nvit1ARZpSxWYLVqaOy7MKz = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        Rbm5bVym6Nvit1ARZpSxWYLVqaOy7MKz.method_22918(jEb2xCeqHnGCjID6184BVMPjVMr7Qmfw, (float)U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK, (float)yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU, iOADsaQVwlJOSHndSoeBs9qVleN8eYS8).method_22915(g0MlnQzsbxJWrXC72kugxKGPAcod3CEu, a6SJPNguyLxSGSaItSMshLnMM0BZ35KT, f, MWUoOSM88BYLeHKAhT5AMlkA2snsKKQE);
        float uIl6Ptp2OepkJKtmj7MgWSrGEaRKBEi2 = 360.0f / (float)oYNcNqt88jdFAWH2jNf68NHcaeyJWW0b;
        float XcJLDWkUpSxYWAdpdPCnsQdzjnEalPS7 = 0.0f;
        while (true) {
            if (!(XcJLDWkUpSxYWAdpdPCnsQdzjnEalPS7 <= 360.0f)) {
                _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
                Rw8ui5zNp4QlaA4xd2TDw2X3S0cXY6G6.run();
                s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(Rbm5bVym6Nvit1ARZpSxWYLVqaOy7MKz);
                _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
                return;
            }
            double m7p5qNqkCtNvBgYx7XxpTdHc9dZQOgnc = Math.toRadians((float)XcJLDWkUpSxYWAdpdPCnsQdzjnEalPS7);
            double BOae6CdwhO82BYyksmKhP3fZoin8EtUX = Math.sin((double)m7p5qNqkCtNvBgYx7XxpTdHc9dZQOgnc) * WpqfLElIbI7Ff2IIrPCLSHdks5QnJYoK;
            double d = Math.cos((double)m7p5qNqkCtNvBgYx7XxpTdHc9dZQOgnc) * fdqEAqrshbcWbzUxsx1UilT3uT0mzwnf;
            Rbm5bVym6Nvit1ARZpSxWYLVqaOy7MKz.method_22918(jEb2xCeqHnGCjID6184BVMPjVMr7Qmfw, (float)(U6uXnkV2vfAeWmMSmzNrWxs0WeD7VPaK + BOae6CdwhO82BYyksmKhP3fZoin8EtUX), (float)(yu12HaGzgdJQOFmBYuXBBVPjto5nrnlU + d), iOADsaQVwlJOSHndSoeBs9qVleN8eYS8).method_22915(g0MlnQzsbxJWrXC72kugxKGPAcod3CEu, a6SJPNguyLxSGSaItSMshLnMM0BZ35KT, f, MWUoOSM88BYLeHKAhT5AMlkA2snsKKQE);
            XcJLDWkUpSxYWAdpdPCnsQdzjnEalPS7 += uIl6Ptp2OepkJKtmj7MgWSrGEaRKBEi2;
        }
    }

    public static /* bridge */ /* synthetic */ void eISpsbyEUjYaKaEBfXb2sAEoWTQEDpVo(class_4587 tKAMzelqRHpgv12iVX4LQIDBdrOnNg0H, float MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, float D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, float wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, float iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, Color L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx, Color wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ, float XMKfU6CuisSevJ8sFH3j51mJjj83Tto5) {
        Matrix4f matrix4f = tKAMzelqRHpgv12iVX4LQIDBdrOnNg0H.method_23760().method_23761();
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShader(class_757::method_34540);
        class_287 VGINr1vkykuwfyONdMWkRx8g8XOKNSI6 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        VGINr1vkykuwfyONdMWkRx8g8XOKNSI6.method_22918(matrix4f, MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getRed() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getGreen() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getBlue() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getAlpha() / 255.0f);
        VGINr1vkykuwfyONdMWkRx8g8XOKNSI6.method_22918(matrix4f, MjsBAcNr8ApAZE9Xw0ZFmfe8HrHcUPv7, iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getRed() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getGreen() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getBlue() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getAlpha() / 255.0f);
        VGINr1vkykuwfyONdMWkRx8g8XOKNSI6.method_22918(matrix4f, wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, iaPN32EL5XbFMMjqWDQtkBYDBL6Zunvi, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getRed() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getGreen() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getBlue() / 255.0f, (float)wwg8pNbta8Wh6VFni3y4DOdxwhiyLynJ.getAlpha() / 255.0f);
        VGINr1vkykuwfyONdMWkRx8g8XOKNSI6.method_22918(matrix4f, wvB41R5QhWStFHo5AhBGKX9oMjS85Gcc, D1hwj6xDSmBj4bVW0NdNpyfp81pjvf9A, XMKfU6CuisSevJ8sFH3j51mJjj83Tto5).method_22915((float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getRed() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getGreen() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getBlue() / 255.0f, (float)L1zNZGhSQZBHLY4LSPx1H9qc8Ulq1CUx.getAlpha() / 255.0f);
        class_286.method_43433((class_9801)VGINr1vkykuwfyONdMWkRx8g8XOKNSI6.method_60800());
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void Vyjt1DL8yZ9ovz48utVOIZ5SDsHk7id3(class_4587 class_45872, float EqRDAZpQGezxv6ptOMy5noHLidJUXMmw, float a9MfbjnY9ws9EpwqipFzc4gP6XZ3eq7S, float HWc1fnWylZIRGVLgafYTNhIuY7wYQ6kF, float f, float vITQTVWnL5baTSwd8CrJlT5rwhFEbpNT, Color FFluMEnbLfDR13XvMl3uCzccsGGVDchN, Color ZLPPXFDl1zfyEeuQCIhtbYOMMc7QrAIY, Color WzMnX7rG31KpfcnaFMQsVPKx5YVPIl3k, Color Xgp0xyX1m57CuMMIOn929VxQF8ciwGll) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_45872, EqRDAZpQGezxv6ptOMy5noHLidJUXMmw, a9MfbjnY9ws9EpwqipFzc4gP6XZ3eq7S, HWc1fnWylZIRGVLgafYTNhIuY7wYQ6kF, f, 0.0f, vITQTVWnL5baTSwd8CrJlT5rwhFEbpNT, 0.0f, 1.0f, FFluMEnbLfDR13XvMl3uCzccsGGVDchN, ZLPPXFDl1zfyEeuQCIhtbYOMMc7QrAIY, WzMnX7rG31KpfcnaFMQsVPKx5YVPIl3k, Xgp0xyX1m57CuMMIOn929VxQF8ciwGll);
    }

    public static /* bridge */ /* synthetic */ void j0HDaeC7P2lOxF11Qp0iT3rTO2dKxb4k(Matrix4f iI08L9BAIoht62R41T096erx7zI5dzZe, float qBpY3auKng0ytwAfg1ctgfNbhhkNp6AT, float f, float o69haep5CUMKVLJ6gJSWdkXEGvP8u97U, float KrxSqge4OymQOxiZ5nNYGSK6EpUmrQ97, float p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9, float zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl, float zlGeszttnSoqrLdK3AtIALz3Wh8ln623, float JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE, float Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, float sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, float VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, float V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, float lO1qYCgH3t2ZgN1KWc7uJHO5WqXyRamO) {
        class_287 cdBEYf6yD2t3bIEwulgMyk1IbfXip2zQ = class_289.method_1348().method_60827(class_293.class_5596.field_27381, class_290.field_1576);
        _3LAObobilITioN96THuwvMKtAdvhcErw.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(zlGeszttnSoqrLdK3AtIALz3Wh8ln623 - V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE - V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, V3lHAbAushfOhkptWXV4qqEb2rzQ8EiY, 0);
        _3LAObobilITioN96THuwvMKtAdvhcErw.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(zlGeszttnSoqrLdK3AtIALz3Wh8ln623 - sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl + sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, sLKyKPnExp9BhJ7AHZedmB6JXByvFNN9, 1);
        _3LAObobilITioN96THuwvMKtAdvhcErw.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9 + Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, zZkZvmv9QFW9ANKKoyIBm3teGXvDFQAl + Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, Z8b7YFqivtpwg9N8nEkq6iOPEVqkXxbR, 2);
        _3LAObobilITioN96THuwvMKtAdvhcErw.ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(p3Q9PbvFXstuzRuYNVnYPLPJo0RqH5c9 + VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, JbjrDHBFXY0LQL887Ov7ApJ5Dmye2OtE - VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, VEJ0aJC09Sxm8aFilTsexb7RYbCPUn6d, 3);
        int dJElgctT4HHZCtRmimRjNQoYOyLxPPOq = 0;
        while (true) {
            if (dJElgctT4HHZCtRmimRjNQoYOyLxPPOq >= 4) {
                s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(cdBEYf6yD2t3bIEwulgMyk1IbfXip2zQ);
                return;
            }
            float[] BRKrAhF5sng2rYPRkjQy93Fe8KTIuzny = Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ[dJElgctT4HHZCtRmimRjNQoYOyLxPPOq];
            float f2 = BRKrAhF5sng2rYPRkjQy93Fe8KTIuzny[2];
            for (float KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO = (float)dJElgctT4HHZCtRmimRjNQoYOyLxPPOq * 90.0f; KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO <= (float)(dJElgctT4HHZCtRmimRjNQoYOyLxPPOq + 1) * 90.0f; KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO += 90.0f / lO1qYCgH3t2ZgN1KWc7uJHO5WqXyRamO) {
                float Xo1XrjyVk8OOur3b3qhW75WeWLSXaort = Math.toRadians((float)KXz3qbiy6Pbyc2UNNoCOP42XafI7vPYO);
                float R9P8SwFmKie7nedvJ9PWYlYMb3LlKT3e = Math.sin((float)Xo1XrjyVk8OOur3b3qhW75WeWLSXaort) * f2;
                float QWnoUGV8w6NJYx6wwu27knWnc8nOotmo = Math.cos((float)Xo1XrjyVk8OOur3b3qhW75WeWLSXaort) * f2;
                cdBEYf6yD2t3bIEwulgMyk1IbfXip2zQ.method_22918(iI08L9BAIoht62R41T096erx7zI5dzZe, BRKrAhF5sng2rYPRkjQy93Fe8KTIuzny[0] + R9P8SwFmKie7nedvJ9PWYlYMb3LlKT3e, BRKrAhF5sng2rYPRkjQy93Fe8KTIuzny[1] + QWnoUGV8w6NJYx6wwu27knWnc8nOotmo, 0.0f).method_22915(qBpY3auKng0ytwAfg1ctgfNbhhkNp6AT, f, o69haep5CUMKVLJ6gJSWdkXEGvP8u97U, KrxSqge4OymQOxiZ5nNYGSK6EpUmrQ97);
            }
            ++dJElgctT4HHZCtRmimRjNQoYOyLxPPOq;
        }
    }

    public static /* bridge */ /* synthetic */ void LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_4587 T0JXqimlvfYjLIcJS9C3814sYY8GPZt4, float aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8, float HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn, float ThAoEdwjgIVcAYeArbrJLtVCord0pakz, float UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5, float N4xEhzsaTq0KSHeI1F5MO96hljhdtsoA, float AOxhNx45XMtVk3g8g7e3MeIXVtd2HMfw, float cQDaEypPDaYE0TEiJ9YXL6csyizzu61h, float hcsElboOsuEIlRGc21eQo41BNsq41OJF, Color Tyn3OJNLtbLMBQJHsZQ8XL0jaObah6lr, Color MLMGcDI8yKHGaac0vDHi0T0mAHudAf5o, Color V7sCAIP2YhpCizJLwUmi5vgDm0IwE6Lt, Color vT1IjFWbUViEFaFPmXAvwZMw1pladRax) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        class_287 dWcsbDV9rsUFiyOJaQWwLNetsAX8KKQd = _3LAObobilITioN96THuwvMKtAdvhcErw.K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(T0JXqimlvfYjLIcJS9C3814sYY8GPZt4.method_23760().method_23761(), class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1592), aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8 - 10.0f, HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn - 10.0f, ThAoEdwjgIVcAYeArbrJLtVCord0pakz + 20.0f, UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5 + 20.0f, N4xEhzsaTq0KSHeI1F5MO96hljhdtsoA);
        _3LAObobilITioN96THuwvMKtAdvhcErw.VRGrIVrn4B2c1SV9EDbbZFJtZRjlMA5N(aLGg0dCFmwCoDM4Dq2RrNO7gVTOGFRP8, HqZCMZDW2TFRLSgHEOZSStFOrUKUKJmn, ThAoEdwjgIVcAYeArbrJLtVCord0pakz, UtLluwEZ5osyi4XaLJ3zXDq8u7YAppG5, hcsElboOsuEIlRGc21eQo41BNsq41OJF, AOxhNx45XMtVk3g8g7e3MeIXVtd2HMfw, cQDaEypPDaYE0TEiJ9YXL6csyizzu61h, Tyn3OJNLtbLMBQJHsZQ8XL0jaObah6lr, MLMGcDI8yKHGaac0vDHi0T0mAHudAf5o, V7sCAIP2YhpCizJLwUmi5vgDm0IwE6Lt, vT1IjFWbUViEFaFPmXAvwZMw1pladRax);
        class_286.method_43433((class_9801)dWcsbDV9rsUFiyOJaQWwLNetsAX8KKQd.method_60800());
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void a64m0VV3kqjLaic7npqZ2bKBCbiTs4cH(class_4587 SYLL23E9k9lacQwXBYLHP6Q1wop3uupw, Color YBwMVzsGqFDRgdwA3ivYB9vOfp99j9pL, double d, double M6cJkUhA3KWVMBO9rZjsCZmmB6aKWaTN, double JjhKwQeuQLqFlX7ItWC34Ms3O3BPz88m, double hYxZ2h0LmIh9VTaenk8MMG1XllnHtZoB, int nQbPTpPMFoHkYqZS5QJygEeRHJV0OJCi) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.xOvxPgVP2JgXo6pnZsmk0hw0scMdMpEe(SYLL23E9k9lacQwXBYLHP6Q1wop3uupw, YBwMVzsGqFDRgdwA3ivYB9vOfp99j9pL, d, M6cJkUhA3KWVMBO9rZjsCZmmB6aKWaTN, JjhKwQeuQLqFlX7ItWC34Ms3O3BPz88m, hYxZ2h0LmIh9VTaenk8MMG1XllnHtZoB, nQbPTpPMFoHkYqZS5QJygEeRHJV0OJCi, 0.0f, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void rhE0UhdAyIcHOqSXGvl0wxMEHAwwUrNV(class_4587 NRUaJh076Gihe6HfqvV7eAUYSWhlEvF7, float adZ8H5H7pwVBMpMjyL2ON1XnvZDJRsFJ, float n1RKugjOJokrfvStR7AroFpuLb3JtJDm, float pnXj90bEab4xz0EkhN30E1Y6ZRTvmYJA, float oXucK9MpIkOLmAp1N5r8tYsl9tJO8OZr, Color QSNuLxQ7qqcSCyETGQzsN2Og7jj4NWUw, Color color) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.eISpsbyEUjYaKaEBfXb2sAEoWTQEDpVo(NRUaJh076Gihe6HfqvV7eAUYSWhlEvF7, adZ8H5H7pwVBMpMjyL2ON1XnvZDJRsFJ, n1RKugjOJokrfvStR7AroFpuLb3JtJDm, pnXj90bEab4xz0EkhN30E1Y6ZRTvmYJA, oXucK9MpIkOLmAp1N5r8tYsl9tJO8OZr, QSNuLxQ7qqcSCyETGQzsN2Og7jj4NWUw, color, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void kld10KIySKBbYakcqCxEEqdJ7xP9eSOO(class_4587 pkYCzvmp2mTOPKMZI6Kg646dwFtlUky3, float jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, float fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, float FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, float UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, Color RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D, Color ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs, float f) {
        Matrix4f l6myK3aSlwwvXHflkclbm3nLwdfwanPm = pkYCzvmp2mTOPKMZI6Kg646dwFtlUky3.method_23760().method_23761();
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.setShader(class_757::method_34540);
        class_287 ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA.method_22918(l6myK3aSlwwvXHflkclbm3nLwdfwanPm, jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, f).method_22915((float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getRed() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getGreen() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getBlue() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getAlpha() / 255.0f);
        ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA.method_22918(l6myK3aSlwwvXHflkclbm3nLwdfwanPm, jWpQwpxi9EcoHznSh2RqRKFGW0h2O5tz, UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, f).method_22915((float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getRed() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getGreen() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getBlue() / 255.0f, (float)RWRAMXCzsAkEsOYHXtTj3PXZ9jmfRI3D.getAlpha() / 255.0f);
        ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA.method_22918(l6myK3aSlwwvXHflkclbm3nLwdfwanPm, FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, UenAauj4ftqRSv1rAT81kHffWpOuX7Rf, f).method_22915((float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getRed() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getGreen() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getBlue() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getAlpha() / 255.0f);
        ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA.method_22918(l6myK3aSlwwvXHflkclbm3nLwdfwanPm, FtBoUb0JQRtXpq2rnt8a200CkoslOTxq, fuytNlhv2GZRWWRvfQc2444F6LFmJf8P, f).method_22915((float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getRed() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getGreen() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getBlue() / 255.0f, (float)ucrsHnjcyTFpsdEeTGUgEBw2ojx568cs.getAlpha() / 255.0f);
        class_286.method_43433((class_9801)ETSYNUFk7hiu8s5lZSnMoDWjA8dG9CxA.method_60800());
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ void MOk14QkPU2TldY3Gr86lWjoAcTwWF4tJ(class_4587 class_45872, float f, float urZX8atWQDPM0qNaqzVmkKCidO6lhcIq, float RmLxJC3KGGpJEM6hDZe7zhWUnlTOgdyr, float Q2VVnqsEGRQjte4bZmRGmckeek6nHK6B, Color color, Color color2) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.kld10KIySKBbYakcqCxEEqdJ7xP9eSOO(class_45872, f, urZX8atWQDPM0qNaqzVmkKCidO6lhcIq, RmLxJC3KGGpJEM6hDZe7zhWUnlTOgdyr, Q2VVnqsEGRQjte4bZmRGmckeek6nHK6B, color, color2, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void kMnnAHPLjQ3703SmFkCtnJ2aVgMmRFSx(class_4587 SnO7H8gJclbfprOJGTOY0vJXvVm1qm4j, Color vf1tB12LXu0jMv4olyeY3yJY1eTXEkps, double iTWhTBA8O2alSt9fOSnmW9NsHHZ5GF7f, double AvTqFNKSr2t7XFXFLurFZVpI1gdoZJ38, double cjsS6niq8kuQMnA3ELWFPnkm5xi00agq, double uJfZwe4M0XoLQEnFEgdw5OihYrMVSwke, float t61zd8hEIzlQwI2DqWVA2wuqeGXJPTYZ, float iZOiXiaDWW8imlVWD8s5Lw2b0BcJ2BLx, float WJUca4hHtCoOCvqHgZgvBGoNlzMxPQRM, float YUZitb2juMgJeltAIO5zv0a2001KqPGu, float YV8thLoQyTcDX809UYqHgnMmYaiCWka9, Runnable W9kvPSSjejAxVMUkRo6rrJNdhxUBMlCH) {
        Matrix4f WenDniGfnMpX9F4YfsbtHCwSZnhlRvmP = SnO7H8gJclbfprOJGTOY0vJXvVm1qm4j.method_23760().method_23761();
        float lHUON3IgNS3ZZwvVIzxcEbAxb7Elr3Ml = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getRed() / 255.0f;
        float f = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getGreen() / 255.0f;
        float bXbHbcCmYLMycLEIWZEALrynPU2uFmCe = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getBlue() / 255.0f;
        float zX6HDtJu3GloGuYAf7NIfUYx0FyJnyrq = (float)vf1tB12LXu0jMv4olyeY3yJY1eTXEkps.getAlpha() / 255.0f;
        _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
        W9kvPSSjejAxVMUkRo6rrJNdhxUBMlCH.run();
        _3LAObobilITioN96THuwvMKtAdvhcErw.j0HDaeC7P2lOxF11Qp0iT3rTO2dKxb4k(WenDniGfnMpX9F4YfsbtHCwSZnhlRvmP, lHUON3IgNS3ZZwvVIzxcEbAxb7Elr3Ml, f, bXbHbcCmYLMycLEIWZEALrynPU2uFmCe, zX6HDtJu3GloGuYAf7NIfUYx0FyJnyrq, (float)iTWhTBA8O2alSt9fOSnmW9NsHHZ5GF7f, (float)AvTqFNKSr2t7XFXFLurFZVpI1gdoZJ38, (float)cjsS6niq8kuQMnA3ELWFPnkm5xi00agq, (float)uJfZwe4M0XoLQEnFEgdw5OihYrMVSwke, t61zd8hEIzlQwI2DqWVA2wuqeGXJPTYZ, iZOiXiaDWW8imlVWD8s5Lw2b0BcJ2BLx, WJUca4hHtCoOCvqHgZgvBGoNlzMxPQRM, YUZitb2juMgJeltAIO5zv0a2001KqPGu, YV8thLoQyTcDX809UYqHgnMmYaiCWka9);
        _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
    }

    public static /* bridge */ /* synthetic */ class_287 K6BR6bUptSafqEeVNhYc5imh4tRoIzhL(Matrix4f xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, class_287 HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl, float tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, float sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, float vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, float PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, float dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12) {
        HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz + PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ + vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz + PZJAOj2Hhzr8yvdkw5SJ3hFNKBJl8K9c, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl.method_22918(xzxIPkcjWzD4VN499qyWONfCs0Zn0AMx, tTyKVJbdyK5uZa1hwOKgewxxEbl0LDNJ + vrhudGrujszz2lZuAGkRK9kCHTcbGqCl, sBi8uvlTPU8Os6IrNfSDjdHW3MWOSiRz, dO1YmQbvM9GGCRThFyhfyIueK8M4Cc12);
        return HYpFlocsz9TQLOPMrpfOGdJUWa1Xuzdl;
    }

    public static /* bridge */ /* synthetic */ void QdjJWxy2cLPO3z5ygW4TLwQKXgbqppsr(class_4587 class_45872, Color LLqTePRBa00zULv2PMcseGtCZlofULny, float f, float O5vY9305ZxKICAuJ4NvgdO5cLgT4l6uc, float ZLaV5qbwqsNYAufThoxqNOV2UobstPyS, float IvytobZw6dNWvsa78KLNHKk7nGPIb3mM, Runnable HbThIjQWp5GzwUsoC4qb7KG6uAqbTFpf) {
        float QDWmzeCjxXkgPU40FC3QK46lSRg83zvE = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getRed() / 255.0f;
        float obEPSYQaUWvjmAESV4UfbhmsCdmXyX7I = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getGreen() / 255.0f;
        float FYGYACY1a84YjQxJsPiJeNbHIb5jfMbr = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getBlue() / 255.0f;
        float RQVnATymlDwoA7NI7RRzW8jtMVtOtgUt = (float)LLqTePRBa00zULv2PMcseGtCZlofULny.getAlpha() / 255.0f;
        Matrix4f RIIl3yAcVMIQoqRTpqwk0T9tw5OONAum = class_45872.method_23760().method_23761();
        class_287 Miuinx2KovzE9WwpQqVIfhkpdYeg05eN = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_1576);
        int T4BDTnde2aQZavjXt9ngdzZWVNqK4y7j = 0;
        while (true) {
            if (T4BDTnde2aQZavjXt9ngdzZWVNqK4y7j > 360) {
                _3LAObobilITioN96THuwvMKtAdvhcErw.IoDAO9gPpIQ4fszNTzyaeESWup9lpxkx();
                HbThIjQWp5GzwUsoC4qb7KG6uAqbTFpf.run();
                s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(Miuinx2KovzE9WwpQqVIfhkpdYeg05eN);
                _3LAObobilITioN96THuwvMKtAdvhcErw.PcQxuXXXj7a13H3n9jAgYRcwDc4r5Oy2();
                return;
            }
            Miuinx2KovzE9WwpQqVIfhkpdYeg05eN.method_22918(RIIl3yAcVMIQoqRTpqwk0T9tw5OONAum, (float)((double)f + Math.sin((double)((double)T4BDTnde2aQZavjXt9ngdzZWVNqK4y7j * 3.141526 / 180.0)) * (double)ZLaV5qbwqsNYAufThoxqNOV2UobstPyS), (float)((double)O5vY9305ZxKICAuJ4NvgdO5cLgT4l6uc + Math.cos((double)((double)T4BDTnde2aQZavjXt9ngdzZWVNqK4y7j * 3.141526 / 180.0)) * (double)ZLaV5qbwqsNYAufThoxqNOV2UobstPyS), 0.0f).method_22915(QDWmzeCjxXkgPU40FC3QK46lSRg83zvE, obEPSYQaUWvjmAESV4UfbhmsCdmXyX7I, FYGYACY1a84YjQxJsPiJeNbHIb5jfMbr, RQVnATymlDwoA7NI7RRzW8jtMVtOtgUt);
            ++T4BDTnde2aQZavjXt9ngdzZWVNqK4y7j;
        }
    }

    public static /* bridge */ /* synthetic */ void DEZoARO1MQHMizazuOqtjqeFu21Uw8uc(class_4587 class_45872, float UJzEDm3pXwBglSo2tFTkAHAZ2ATWjhic, float UJIgw1wiyj4rVq5e4ZbApdhcz4bZSgJe, float f, float pLEQNTksvIJA8VmRjEnnECYPOD4w4ZUA, float hjrwkS0kjhyLZLY96IHS3GI2N8N54Gzd, float DIhDs08lu2mgfK2aAFsJi0AsLydbc3iN, float THp2E5CoXWouvJPbZlRtBIqDpIs2H8dQ, Color nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.LwFNugYgXhGqfIlswUaMRMTG0NBOYXVl(class_45872, UJzEDm3pXwBglSo2tFTkAHAZ2ATWjhic, UJIgw1wiyj4rVq5e4ZbApdhcz4bZSgJe, f, pLEQNTksvIJA8VmRjEnnECYPOD4w4ZUA, 0.0f, hjrwkS0kjhyLZLY96IHS3GI2N8N54Gzd, DIhDs08lu2mgfK2aAFsJi0AsLydbc3iN, THp2E5CoXWouvJPbZlRtBIqDpIs2H8dQ, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1, nwrzqdtx0T8J76OT1YabHr2RJgIDZLZ1);
    }

    public static /* bridge */ /* synthetic */ void WJjnQ0QgFTWAL6KnkS8mE7YAmgXWonZj(class_4587 ML1c7LTmxSWLqaaNNInPRokStgd1ifbJ, Color color, float zA4uVrjh2Ah5OG5XskEoEQH2qnqvuGT8, float n2p8rCSna8zvBPni9LgVSgGKMA2aUE3Y, float f, float wGoPdn0p74tiJNaHKXVPBCblU7PV2M5X) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.QdjJWxy2cLPO3z5ygW4TLwQKXgbqppsr(ML1c7LTmxSWLqaaNNInPRokStgd1ifbJ, color, zA4uVrjh2Ah5OG5XskEoEQH2qnqvuGT8, n2p8rCSna8zvBPni9LgVSgGKMA2aUE3Y, f, wGoPdn0p74tiJNaHKXVPBCblU7PV2M5X, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void gOh2JD1PxSMJFDP6OeRf0JJ7E1qRxkEp(class_4587 CiX0I2aBbfxSSsXFm8YbezY7E56FHqbx, Color color, double onRmv4DBDKDD3LLb5FK7kzJaviYIUiG3, double d, double QpyNXLGFTXlCOrIpNuV2cBijfbSPO50h, double yiKDYk1GFma4FmXGLMwxTy1qHjOFx6Qz, float GKqo69CLzxN92HUKetm3xkLzAUWbSBux, float kfVVlTPLsi7uiODiDC81y9sYXo6wdDsI, float m4NuL47ODc21Oa5CIHMkA8BHMUWqOOY0, float f, float q66Q5F9EkLtWdnASrbtrAcut13ePHhnB) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.kMnnAHPLjQ3703SmFkCtnJ2aVgMmRFSx(CiX0I2aBbfxSSsXFm8YbezY7E56FHqbx, color, onRmv4DBDKDD3LLb5FK7kzJaviYIUiG3, d, QpyNXLGFTXlCOrIpNuV2cBijfbSPO50h, yiKDYk1GFma4FmXGLMwxTy1qHjOFx6Qz, GKqo69CLzxN92HUKetm3xkLzAUWbSBux, kfVVlTPLsi7uiODiDC81y9sYXo6wdDsI, m4NuL47ODc21Oa5CIHMkA8BHMUWqOOY0, f, q66Q5F9EkLtWdnASrbtrAcut13ePHhnB, () -> RenderSystem.setShader(class_757::method_34540));
    }

    public static /* bridge */ /* synthetic */ void Dv7R9f6RtMjCWno3RMzV1TOVj3UIQ1cc(class_332 OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI, class_1799 BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, int n, int YKUwKFD9fXSYdE91v5tLt4ZA9jIGmzkp, Color Y1B9WsRFKOmK04fKgjljXXqXFB3gbRlG) {
        class_4587 class_45872 = OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51448();
        if (BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7960()) {
            return;
        }
        class_1087 Eja1Jt4zFMPoZ86PQ5NP5NVAorzebQBf = s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4019(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, (class_1937)s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, (class_1309)s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724, 0);
        class_45872.method_22903();
        class_45872.method_46416((float)(n + 8), (float)(YKUwKFD9fXSYdE91v5tLt4ZA9jIGmzkp + 8), 150.0f);
        try {
            class_45872.method_22905(16.0f, -16.0f, 16.0f);
            boolean dAo6JvgW7HX0jarjNWJLeXqbCQhqMMzu = !Eja1Jt4zFMPoZ86PQ5NP5NVAorzebQBf.method_24304();
            boolean d4IlYklMcaGZ3Hj5wMa1S1ayNvPpYCCx = dAo6JvgW7HX0jarjNWJLeXqbCQhqMMzu;
            if (dAo6JvgW7HX0jarjNWJLeXqbCQhqMMzu) {
                class_308.method_24210();
            }
            _3LAObobilITioN96THuwvMKtAdvhcErw.MnHOcBlMWmYKuLa8BFUJoJdgU1KwQuTO(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv, class_45872, (class_4597)OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51450(), 0xF000F0, Y1B9WsRFKOmK04fKgjljXXqXFB3gbRlG, Eja1Jt4zFMPoZ86PQ5NP5NVAorzebQBf);
            OogqhRNynZ9V2uBrzxWsI9qqXFCuMRqI.method_51452();
            if (dAo6JvgW7HX0jarjNWJLeXqbCQhqMMzu) {
                class_308.method_24211();
            }
        }
        catch (Throwable iJUlA5b7EfscPIDgEFyFIeIeMK4iO6FF) {
            class_128 vIeIoioywFrHInZF6K5iP105S1LMOnKs = class_128.method_560((Throwable)iJUlA5b7EfscPIDgEFyFIeIeMK4iO6FF, (String)"Phobos item rendering");
            class_129 class_1295 = vIeIoioywFrHInZF6K5iP105S1LMOnKs.method_562("Item being rendered");
            class_1295.method_577("Item Type", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7909()));
            class_1295.method_577("Item Components", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_57353()));
            class_1295.method_577("Item Foil", () -> String.valueOf(BR9FNkWMENpRPEx0rbpHZmzBIRkaywIv.method_7958()));
            throw new class_148(vIeIoioywFrHInZF6K5iP105S1LMOnKs);
        }
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ void u0b5atAjjS66I01VUszn4vOgqKuQTGuG(class_1087 NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp, class_1799 class_17992, int rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, Color color, class_4587 JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, class_4588 YRvjScjHtlelE0Yite28T1NGsLwQStdL) {
        class_5819 m4gxwnkKckwsTXutImkMOYVjNhAc9rD8 = class_5819.method_43047();
        long cstU9z6iTFaBx2OQn7rzJwUnq58i09lT = 42L;
        class_2350[] class_2350Array = class_2350.values();
        int n = class_2350Array.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                m4gxwnkKckwsTXutImkMOYVjNhAc9rD8.method_43052(42L);
                _3LAObobilITioN96THuwvMKtAdvhcErw.ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, YRvjScjHtlelE0Yite28T1NGsLwQStdL, NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp.method_4707(null, null, m4gxwnkKckwsTXutImkMOYVjNhAc9rD8), class_17992, rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, color);
                return;
            }
            class_2350 nKNhjXcCRmKH1IDyfwTH4Aoe9cWauGF5 = class_2350Array[n2];
            m4gxwnkKckwsTXutImkMOYVjNhAc9rD8.method_43052(42L);
            _3LAObobilITioN96THuwvMKtAdvhcErw.ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(JHkmrTP7vd2WMZsjOAa8v9XhoeJ2YQdu, YRvjScjHtlelE0Yite28T1NGsLwQStdL, NI0eAwmIJrrMFX5cWPgzU0KrxKe1wMrp.method_4707(null, nKNhjXcCRmKH1IDyfwTH4Aoe9cWauGF5, m4gxwnkKckwsTXutImkMOYVjNhAc9rD8), class_17992, rg0jv0flGYZ0L3ioVIplsSqWB7ydEmo7, color);
            ++n2;
        }
    }

    public /* synthetic */ _3LAObobilITioN96THuwvMKtAdvhcErw() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void ces74KxZ5Ns99DWjLllkN0bJRFEGU1PY(float scmA09vQiPMdI7F36rY97fodbz00sCRn, float hxXQHaHsSHYF3SKkl2s8p4lbDN6OqPjX, float DHZnHyex6DJJYa4g5jjjyXAHOSVSoe3x, int n) {
        _3LAObobilITioN96THuwvMKtAdvhcErw.Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ[n][0] = scmA09vQiPMdI7F36rY97fodbz00sCRn;
        _3LAObobilITioN96THuwvMKtAdvhcErw.Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ[n][1] = hxXQHaHsSHYF3SKkl2s8p4lbDN6OqPjX;
        _3LAObobilITioN96THuwvMKtAdvhcErw.Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ[n][2] = DHZnHyex6DJJYa4g5jjjyXAHOSVSoe3x;
    }

    public static /* bridge */ /* synthetic */ void MnHOcBlMWmYKuLa8BFUJoJdgU1KwQuTO(class_1799 jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, class_4587 WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, class_4597 BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, int zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, Color wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ, class_1087 cgkBqatOfZa9SoSEgpjIoH06nzRPso5W) {
        if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_7960()) {
            return;
        }
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_22903();
        if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_31574(class_1802.field_8547)) {
            cgkBqatOfZa9SoSEgpjIoH06nzRPso5W = s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_918.field_40532);
        } else if (jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG.method_31574(class_1802.field_27070)) {
            cgkBqatOfZa9SoSEgpjIoH06nzRPso5W = s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_918.field_40533);
        }
        cgkBqatOfZa9SoSEgpjIoH06nzRPso5W.method_4709().method_3503(class_811.field_4317).method_23075(false, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR);
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_46416(-0.5f, -0.5f, -0.5f);
        if (cgkBqatOfZa9SoSEgpjIoH06nzRPso5W.method_4713()) {
            s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().field_27770.method_3166(jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, class_811.field_4317, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ.hashCode());
        } else {
            class_1921 N0VU3RbDYfwrMQwnPBil9yXnVfoByeFO = wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ.getAlpha() != 255 ? cWMXA5nZ7CO0JZ3WLpwBd1pTlxvFal0D.cfr_renamed_185(jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, true) : class_4696.method_23678((class_1799)jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, (boolean)true);
            class_4588 class_45882 = class_918.method_29711((class_4597)BZUvUGL4drnqJySmTfcAd4ME07T4a5fh, (class_1921)N0VU3RbDYfwrMQwnPBil9yXnVfoByeFO, (boolean)true, (boolean)false);
            _3LAObobilITioN96THuwvMKtAdvhcErw.u0b5atAjjS66I01VUszn4vOgqKuQTGuG(cgkBqatOfZa9SoSEgpjIoH06nzRPso5W, jSqdtEabbpAyhCXeb8jgGe9FHAbO4EWG, zsmvfmd5ZCIidTD9ofCAkGB3xLgY2ijR, wVLOqc4GwKjL1gm25cjUYAhw4hr5MweQ, WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR, class_45882);
        }
        WNzXnoaL7i2sxIHbxC4uVjUSfcUirjMR.method_22909();
    }

    public static /* bridge */ /* synthetic */ void ekPLcSpcuZZ79vQMmVvhAnmjo9e7sqao(class_4587 j9HZUKxjDs5Z69JzBvf8duSpQOaK4u7N, class_4588 WVrKAjhFEtfGkbj7QWjYaKHan3hhENOz, List<class_777> skCOVKttaIlEVZkQ8GMKN5x7P2gYxeXh, class_1799 kYw6fAq8B3Izp04g2fs3bQwBwd6WDacO, int oXHLJ38gZFMkPraAQBpxt2sNlkjM6rvh, Color e7spU4JAY0SHOcvKPYR9817jLbIo101c) {
        boolean JwlLYCbk0O6oHN1yplQ32JsRIGmQE0BG = !kYw6fAq8B3Izp04g2fs3bQwBwd6WDacO.method_7960();
        class_4587.class_4665 class_46652 = j9HZUKxjDs5Z69JzBvf8duSpQOaK4u7N.method_23760();
        Iterator<class_777> iterator = skCOVKttaIlEVZkQ8GMKN5x7P2gYxeXh.iterator();
        while (iterator.hasNext()) {
            class_777 Y5x1swtpoZGZ2ozy75boMFh2Xp6VQKIJ = iterator.next();
            float nYyXa5hWDkxyem05fChuWfZDob0Ri0ZW = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getAlpha() / 255.0f;
            float XEBzcrxoRyfhCypPZdTbKfFGXcHP8XY6 = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getRed() / 255.0f;
            float Su80rG1thwkU34nhDfD53rs0edyoPzsw = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getGreen() / 255.0f;
            float hQJ6CDwjKgBF1MxFyqmbtJsAaRziGmim = (float)e7spU4JAY0SHOcvKPYR9817jLbIo101c.getBlue() / 255.0f;
            WVrKAjhFEtfGkbj7QWjYaKHan3hhENOz.method_22919(class_46652, Y5x1swtpoZGZ2ozy75boMFh2Xp6VQKIJ, XEBzcrxoRyfhCypPZdTbKfFGXcHP8XY6, Su80rG1thwkU34nhDfD53rs0edyoPzsw, hQJ6CDwjKgBF1MxFyqmbtJsAaRziGmim, nYyXa5hWDkxyem05fChuWfZDob0Ri0ZW, oXHLJ38gZFMkPraAQBpxt2sNlkjM6rvh, class_4608.field_21444);
        }
        return;
    }

    static {
        Qw03wdZL3N4yRxl2RSe7sLyH4n99q2JZ = new float[][]{new float[3], new float[3], new float[3], new float[3]};
    }
}

