/*
 * Decompiled with CFR.
 */
package org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.NonNull;
import net.minecraft.class_1007;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_156;
import net.minecraft.class_1657;
import net.minecraft.class_1664;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3887;
import net.minecraft.class_4050;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_572;
import net.minecraft.class_583;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_6854;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_922;
import net.minecraft.class_9801;
import org.earthhack.ducks.IEntityRenderDispatcher;
import org.earthhack.ducks.ILivingEntity;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;
import org.phobos.mixin.game.render.interfaces.INativeImage;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2._5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O;
import org.phobos.secure.1QTSqdFu1qt4b1WvDl15MoAj2vMj5tlJ.ImUAvi4sOo8saNCr40FGl2MOCWqWfLW5;
import org.phobos.secure.1QTSqdFu1qt4b1WvDl15MoAj2vMj5tlJ.JQD8lA2YPF0sCVRzYhTPaWWwFEg8VIpD;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx._1a0DNT9eRg4WZWz3elL4xt7SN1vNVe2x;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.n2kaY45plvhPvLTJGwLdGgL9N5RrTree;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.s7DAjgNhRmduZVDyDddmFhhDDl4kBube;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.iazgxb5cdZJXCciePQxq22QbVRMwDJnO;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.zZ6szWkOzeGstgY9mWxOxmsuT6fnWTmg;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.mLVxxDDFkerUwEmX4khvm9xEgqfS1U7y;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.rpjRaPjCZMa5v1bzZhPkVQoQoQC8BBkN;
import org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM.X1p69yFXRZBkdmyy8FuEbbUv7CrfEwsC;
import org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM._8N5t7e2Q4eYPHJz8EWo9xIZ248ZXMP2x;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.rqMpas6hBytDXGfoySMj6f99n3vu3sut;
import org.phobos.secure.E7qwU8abcwz3brAbulptWa86RqdgSg2V._6i8e3IhOe6nYF4Y9oJF9j6PVoUsPCV2W;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG._2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ;
import org.phobos.secure.KCc25p0Ms0G8li5hGx4IIWIcsKmCc9nl.NcYkf6t0sgVJk7xkGQ1HVuJD4hdqROPb;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.AvXOzyZ1j87subakF67vKeQu5VhALQEO;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.re51qPuuuuEVLseiWpV90IzFmylknIuq;
import org.phobos.secure.N8Mbvei5jZJniHivyFx9alrtSLUznZLt.Q1L3fcmHqa2NwSfKYlYnehFrmhhS2Htu;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.AxU9DkyZzgnznGwLiuhtNhvn78Ii8Kbm;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ.gCvgzyM2KYcIfWMVjA7TLK4HMknzYNhk;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.h051oGnfbeVHvnLJ3029aut39JqYeo9d;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.jKcS2tNmtpJbUKLSFIqtftpbFEYwe5vL;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.zQu1yDaMR6k8bwk4q0Us08SbW4dDH4R3;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B._3zBoddXkCLXXUaNl5AlAYGuHIlhXUA63;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.hivAKZlWBRcg4Kg4NhIpBVVtQdUYXx2F;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._3Cs2b98SM3HTQEd76fzJSOWYmajQDF2s;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.TbAxsBC01BrEmtCcGqoG8WUYCwpfVeEm;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.vFtDkIM6uA0xQwu7Ihs5RVVgb5whv1om;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.w5cqX2CNLLKfxdduQy4pRn4iy077Ql1d;
import org.phobos.secure.l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf.QPQw9x4ePRpLHZWVD2CpwegV14M54uDe;
import org.phobos.secure.m0W5AbJZPb6oL8kGQnlxCA1x2TGXa70A._9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE;
import org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf._1DCT2AmtvTGHRBYxhD8bXe43YKsgEaQr;
import org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf.kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.AR3PUueqgAtj4YCSNNnO6Seh162gNIYe;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb._9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    public static /* synthetic */ AvXOzyZ1j87subakF67vKeQu5VhALQEO AaOoCtxeS95t4amH3i67zP5c28M4UBFc;
    public static /* synthetic */ n2kaY45plvhPvLTJGwLdGgL9N5RrTree JOLXNgHhCyaLq1ApUQTV6K7R9rlSxAdE;
    public static /* synthetic */ gCvgzyM2KYcIfWMVjA7TLK4HMknzYNhk OxTCcdjcUmGHuF3eJ2qgNvIJZX3yCyTp;
    public static /* synthetic */ zZ6szWkOzeGstgY9mWxOxmsuT6fnWTmg rtNAPsml9YUO4Vcalr3mThYtZITZWzyA;
    public static /* synthetic */ jKcS2tNmtpJbUKLSFIqtftpbFEYwe5vL EH1OMHzfgiCPjkevQDvbo2xURIVrlCwi;
    public static /* synthetic */ TbAxsBC01BrEmtCcGqoG8WUYCwpfVeEm yYdEcxn5Zw1y0V1gexD2fbxCDb8qi5qi;
    public static /* synthetic */ _1a0DNT9eRg4WZWz3elL4xt7SN1vNVe2x uAaQipOBDjFLd2lsGKw59yrTCxRZHsJy;
    public static /* synthetic */ hivAKZlWBRcg4Kg4NhIpBVVtQdUYXx2F cfr_renamed_211;
    public static /* synthetic */ re51qPuuuuEVLseiWpV90IzFmylknIuq iPyfT2PrzBSyE1cdraD9zoStdysixk5i;
    public static final /* synthetic */ Matrix4f jrUNjljFx8cvUow5IRs07XpZ5AtWNv20;
    public static /* synthetic */ X1p69yFXRZBkdmyy8FuEbbUv7CrfEwsC cfr_renamed_212;
    public static /* synthetic */ vFtDkIM6uA0xQwu7Ihs5RVVgb5whv1om h36MtxA26fowaqmuziAaEhOEM02kwVLO;
    public static final /* synthetic */ IEntityRenderDispatcher ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD;
    public static final /* synthetic */ Logger nC5Ln5Xz2SD9FhWpcyQE9ejK2b4ZmO99;
    public static /* synthetic */ _3Cs2b98SM3HTQEd76fzJSOWYmajQDF2s lXiWCgfFmVz3l7LJE5j78vr4IL1RatGj;
    public static /* synthetic */ iazgxb5cdZJXCciePQxq22QbVRMwDJnO jeURgiceDRl87QI1x6QTRGe8gCGqJ3g8;
    public static /* synthetic */ mLVxxDDFkerUwEmX4khvm9xEgqfS1U7y frA2wekPBpX1ptq5PP41VSjAuZjN8AtP;
    public static /* synthetic */ _3zBoddXkCLXXUaNl5AlAYGuHIlhXUA63 LZ5GZYKldZ3AhFoa7h53pNRwmAD7w7jU;
    public static final /* synthetic */ zQu1yDaMR6k8bwk4q0Us08SbW4dDH4R3 Ef74dXftIbaPjXdCpaFZHA489NKIz88y;
    public static /* synthetic */ JQD8lA2YPF0sCVRzYhTPaWWwFEg8VIpD Rosuq8YDe3QDsjn2oUCFgZs3WqBpiCTr;
    public static /* synthetic */ AR3PUueqgAtj4YCSNNnO6Seh162gNIYe usF3yyQy0YSKchdVIp63WhCeXXOz3tAl;
    public static final /* synthetic */ Queue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW> Wuq5yW9hWE212BFvBBHfevPNpg6JVW57;
    public static /* synthetic */ class_6854 IsU1oOkYJb0FFLfVpCbLVlXTSwGNjMJj;
    public static final /* synthetic */ Queue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ> UXZrZc4gCdPmQiSW6iqQCtWZ06Zsovd9;
    public static final /* synthetic */ char cfr_renamed_213 = 'z';
    public static /* synthetic */ float DtHij1dy2hUyF69xizewVhNf0AhRFmZX;
    public static final /* synthetic */ char cfr_renamed_214 = 'a';
    public static /* synthetic */ long cfr_renamed_215;
    public static /* synthetic */ float TWef3vkqzgdYcObli6pV1ik4dCN2a5Lk;
    public static final /* synthetic */ Queue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd> PeeIhRw5PrZNMACbxjJxC2xIawoOMu5j;
    public static /* synthetic */ boolean cfr_renamed_216;
    public static final /* synthetic */ Random XL2TEtekW1xfxDN0s8JBNqCVkMmSMtUH;
    public static final /* synthetic */ Queue<Consumer<Matrix4f>> rOoOB6CLEx77mYrO36dwZjFDcqy0Ni80;
    public static final /* synthetic */ Queue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u> cHvVsOX1JUMrGnASZAqiFfe6IBwl0gpK;
    public static /* synthetic */ class_6854 H13GXaHbiizjL4XkjTgdHKoVWPBRZspc;
    public static /* synthetic */ class_243 KIk0loEGEw6ZlW63TMBFDlE0vSkSQZzZ;
    public static /* synthetic */ float HUic8yUdCDHAIBJP8GU4uUj9oA0zwQjk;
    public static final /* synthetic */ Matrix4f gLxEFteOSvzsBkMo91QHS0sZfUrlnldU;
    public static final /* synthetic */ Queue<h051oGnfbeVHvnLJ3029aut39JqYeo9d> SM4hktjyGU6QSLOTfcgH3XLwCief3aKT;
    public static final /* synthetic */ Matrix4f feagZTJV0b1ETKgfUthTwp5BU9EvyLrf;
    public static final /* synthetic */ Queue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk> b9vuAz9W9KX11lJ4Rm8D30K8cSzaaqsL;
    public static /* synthetic */ float xwzfld69V2Kv0YIazuvajwUfOTYTBq8v;

    public static /* bridge */ /* synthetic */ void vpeU25mfWRrcKmT6bWYY1oXfE8E6TLDm() {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    public static /* bridge */ /* synthetic */ void lIy7GlFgIWRMbJgZ3tTxMMQAaUcxv1iF(class_591<?> eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw, Runnable YYON81xgcpD14bWRIAkuaJi4NaIE0rWG) {
        boolean ASe2iHu7HA7GC42VArtwECqIj2LWZ77w = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3482.field_3665;
        boolean b0vedbRI3yeU2VUbrOc4gS0HCdnwv1u6 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3479.field_3665;
        boolean QYTrDcoUGG9H3aLYD7faIUDmpteW4Mje = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3484.field_3665;
        boolean IBEwvn3w9Pomaw6Q4OInRauWXpOIPFjN = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3486.field_3665;
        boolean GgfXHak16ejE7F3YuOxGucZnNCjZrX9E = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3483.field_3665;
        boolean Vhfk8pZ4NJp4ovjqN0Esjworv9cDGfEN = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3394.field_3665;
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.ni5HvReAZONTEojCfYBR4Vz2IgksRENT(eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw);
        YYON81xgcpD14bWRIAkuaJi4NaIE0rWG.run();
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_217(eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw, ASe2iHu7HA7GC42VArtwECqIj2LWZ77w, b0vedbRI3yeU2VUbrOc4gS0HCdnwv1u6, QYTrDcoUGG9H3aLYD7faIUDmpteW4Mje, IBEwvn3w9Pomaw6Q4OInRauWXpOIPFjN, GgfXHak16ejE7F3YuOxGucZnNCjZrX9E, Vhfk8pZ4NJp4ovjqN0Esjworv9cDGfEN);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_217(class_591<?> GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J, boolean BwDs34F5aFOqS9U5tJhCnDu4t0Gjng9T, boolean ZmYrVhVHOQVb9YZp7gLEWExKTls3kvUJ, boolean WIZ60dKzipihUlZBtLDBOW7vxfNGfGIu, boolean neqE2JwJKpBMR3TAXYoYIg2G0HQqS4bI, boolean AiWjGxAQTVApqK2Zvr0OHw60Hc7aV4Lq, boolean xxpASl30DLEJQ2uWr6h6oycOIho5ja5X) {
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3482.field_3665 = BwDs34F5aFOqS9U5tJhCnDu4t0Gjng9T;
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3479.field_3665 = ZmYrVhVHOQVb9YZp7gLEWExKTls3kvUJ;
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3484.field_3665 = WIZ60dKzipihUlZBtLDBOW7vxfNGfGIu;
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3486.field_3665 = neqE2JwJKpBMR3TAXYoYIg2G0HQqS4bI;
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3483.field_3665 = AiWjGxAQTVApqK2Zvr0OHw60Hc7aV4Lq;
        GhSLwKLg4XP9a28FlBshqi0Az3CbLU0J.field_3394.field_3665 = xxpASl30DLEJQ2uWr6h6oycOIho5ja5X;
    }

    public static /* bridge */ /* synthetic */ void krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(class_287 qJefs32OvSSIjNXY5HvQkVUZcVc2RFWI, boolean YQpbP4ZsWSgLJJqT5BQgbZ7MKkfWUL5s) {
        try {
            class_286.method_43433((class_9801)qJefs32OvSSIjNXY5HvQkVUZcVc2RFWI.method_60800());
        }
        catch (IllegalStateException illegalStateException) {
            // empty catch block
        }
        if (YQpbP4ZsWSgLJJqT5BQgbZ7MKkfWUL5s) {
            RenderSystem.enableDepthTest();
        }
        RenderSystem.enableCull();
        RenderSystem.depthMask((boolean)true);
        RenderSystem.disableBlend();
    }

    public static /* bridge */ /* synthetic */ void Jkg2YSiYU5fV4kpvQcUdC5hUaK4hWSO7(_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW B0SuxJOwWzpYKG1wXcyeKxo8nbhRnSx3) {
        Wuq5yW9hWE212BFvBBHfevPNpg6JVW57.add(B0SuxJOwWzpYKG1wXcyeKxo8nbhRnSx3);
    }

    public static /* bridge */ /* synthetic */ void QkWoT9BuZdRo5S1p61T4KympgR0canKf(class_1657 w7KHu1iK1rlu0tRF92R4vBRzb8REV0pt, class_583<class_1657> class_5832, long tJlh4HPvoevbt2frRAXOENvFmFFMdgzD, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Color> xvbzzNlohNMjZPZCkDwVKBlgKpdNbPA1, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Long> AGpE6ckHwMKMXGTLsq6S22csNNekRzGd, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Boolean> g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Color> mAH2F9ayh75qkUJz8QkgU2aUMSGulVJd, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Float> mTTOBzB2uInezJuui4Nb6S8heDe6AEI8, float aaWrh2TOkjlJsdhATaDGLhqBwWVg4MvI) {
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.btlBfaM6PaYa0D6Vknp5osohZCQ0ctBW(w7KHu1iK1rlu0tRF92R4vBRzb8REV0pt, class_5832, tJlh4HPvoevbt2frRAXOENvFmFFMdgzD, xvbzzNlohNMjZPZCkDwVKBlgKpdNbPA1, AGpE6ckHwMKMXGTLsq6S22csNNekRzGd, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, mAH2F9ayh75qkUJz8QkgU2aUMSGulVJd, mTTOBzB2uInezJuui4Nb6S8heDe6AEI8, aaWrh2TOkjlJsdhATaDGLhqBwWVg4MvI, n2kYTjBX4WzFmrgid17ZdrSGIqJI6hB8 -> {});
    }

    public static /* bridge */ /* synthetic */ void qPqPivisjxa5HHSZm4Wpz1jwwx7kQqGu(class_4587 class_45872) {
        class_1297 QJDLqU5gfvaW7ZVruWDMDpcyGqZMHdO5 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560();
        if (QJDLqU5gfvaW7ZVruWDMDpcyGqZMHdO5 instanceof class_1657) {
            class_1657 MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox = (class_1657)QJDLqU5gfvaW7ZVruWDMDpcyGqZMHdO5;
            float FIQKMsErpDsTu9pytiqUloMfNP8LkVfP = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false);
            if (rpjRaPjCZMa5v1bzZhPkVQoQoQC8BBkN.lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL()) {
                return;
            }
            float wzKcKa3vEuaSfWoQZ8CchsK2fQ0HJDFa = MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox.field_5973 - MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox.field_6039;
            float NXkTHQFFUoa3bMSSu05fbny20bu6VYRN = -(MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox.field_5973 + wzKcKa3vEuaSfWoQZ8CchsK2fQ0HJDFa * FIQKMsErpDsTu9pytiqUloMfNP8LkVfP);
            float vb9LNJHJokehG6o2HRbMmzES8o86DSNE = class_3532.method_16439((float)FIQKMsErpDsTu9pytiqUloMfNP8LkVfP, (float)MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox.field_7505, (float)MGwC050PaiVwbBxzmsoiZUr8NZ3Mtbox.field_7483);
            class_45872.method_22904(-((double)(class_3532.method_15374((float)(NXkTHQFFUoa3bMSSu05fbny20bu6VYRN * (float)Math.PI)) * vb9LNJHJokehG6o2HRbMmzES8o86DSNE) * 0.5), (double)Math.abs(class_3532.method_15362((float)(NXkTHQFFUoa3bMSSu05fbny20bu6VYRN * (float)Math.PI)) * vb9LNJHJokehG6o2HRbMmzES8o86DSNE), 0.0);
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(class_3532.method_15374((float)(NXkTHQFFUoa3bMSSu05fbny20bu6VYRN * (float)Math.PI)) * vb9LNJHJokehG6o2HRbMmzES8o86DSNE * 3.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(Math.abs(class_3532.method_15362((float)(NXkTHQFFUoa3bMSSu05fbny20bu6VYRN * (float)Math.PI - 0.2f)) * vb9LNJHJokehG6o2HRbMmzES8o86DSNE) * 5.0f));
        }
    }

    public static /* bridge */ /* synthetic */ void ni5HvReAZONTEojCfYBR4Vz2IgksRENT(class_591<?> XAfnjLFyHh82YdBtFiuj4wSact5K7zxA) {
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3482.field_3665 = true;
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3479.field_3665 = true;
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3484.field_3665 = true;
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3486.field_3665 = true;
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3483.field_3665 = true;
        XAfnjLFyHh82YdBtFiuj4wSact5K7zxA.field_3394.field_3665 = true;
    }

    public static /* bridge */ /* synthetic */ boolean xr6hQxYGVYGytVRBSXbqSR6PUSU9weTH(class_1297 ZNcO77slJbpm4vSxpXP5Rq6LssIObJZT) {
        if (qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740 == null) {
            return true;
        }
        class_238 VO6vc4DydePQdeADmftVE1CtYTAsusNU = AxU9DkyZzgnznGwLiuhtNhvn78Ii8Kbm.cfr_renamed_218(ZNcO77slJbpm4vSxpXP5Rq6LssIObJZT, Q1L3fcmHqa2NwSfKYlYnehFrmhhS2Htu.e6Tkz7Cm0hf6OzPOvqO84J4IPWfscfUr());
        if (!VO6vc4DydePQdeADmftVE1CtYTAsusNU.method_1013() && VO6vc4DydePQdeADmftVE1CtYTAsusNU.method_995() != 0.0) {
            return qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740.method_23093(VO6vc4DydePQdeADmftVE1CtYTAsusNU);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void Zu4jswg7DsNVTNTC6VwbpYIhnyqSyA6Y() {
        Vector3f nRhqrvVvaLlJggXDOsMCyTjk4VDYeHHL = new Vector3f(0.0f, 0.0f, 1.0f);
        o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a2 = new o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a();
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a2);
        if (((Boolean)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.method_42448().method_41753()).booleanValue() && (!o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a2.isCancelled() || rpjRaPjCZMa5v1bzZhPkVQoQoQC8BBkN.lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL())) {
            class_4587 Hhcon0Fb93HJ4m5m7cyPHnwcXQqsCRc5 = new class_4587();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.qPqPivisjxa5HHSZm4Wpz1jwwx7kQqGu(Hhcon0Fb93HJ4m5m7cyPHnwcXQqsCRc5);
            nRhqrvVvaLlJggXDOsMCyTjk4VDYeHHL.mulPosition((Matrix4fc)Hhcon0Fb93HJ4m5m7cyPHnwcXQqsCRc5.method_23760().method_23761().invert());
        }
        KIk0loEGEw6ZlW63TMBFDlE0vSkSQZzZ = new class_243((double)nRhqrvVvaLlJggXDOsMCyTjk4VDYeHHL.x, (double)(-nRhqrvVvaLlJggXDOsMCyTjk4VDYeHHL.y), (double)nRhqrvVvaLlJggXDOsMCyTjk4VDYeHHL.z).method_1037(-((float)Math.toRadians(qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19329()))).method_1024(-((float)Math.toRadians(qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19330()))).method_1019(qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19326());
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_219() {
        QPQw9x4ePRpLHZWVD2CpwegV14M54uDe twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da = _8N5t7e2Q4eYPHJz8EWo9xIZ248ZXMP2x.fkZ5wWCQFzjLQ1OEv2mHi4zDV4tyDvjy();
        cfr_renamed_212 = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(X1p69yFXRZBkdmyy8FuEbbUv7CrfEwsC::new, "dissolve_shader");
        frA2wekPBpX1ptq5PP41VSjAuZjN8AtP = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(mLVxxDDFkerUwEmX4khvm9xEgqfS1U7y::new, "dissolve_lines_shader");
        iPyfT2PrzBSyE1cdraD9zoStdysixk5i = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(re51qPuuuuEVLseiWpV90IzFmylknIuq::new, "multicolor");
        cfr_renamed_211 = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(hivAKZlWBRcg4Kg4NhIpBVVtQdUYXx2F::new, "multicolor_lines");
        jeURgiceDRl87QI1x6QTRGe8gCGqJ3g8 = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(iazgxb5cdZJXCciePQxq22QbVRMwDJnO::new, "circle");
        uAaQipOBDjFLd2lsGKw59yrTCxRZHsJy = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(_1a0DNT9eRg4WZWz3elL4xt7SN1vNVe2x::new, "circle_lines");
        LZ5GZYKldZ3AhFoa7h53pNRwmAD7w7jU = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(_3zBoddXkCLXXUaNl5AlAYGuHIlhXUA63::new, "plasma");
        AaOoCtxeS95t4amH3i67zP5c28M4UBFc = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(AvXOzyZ1j87subakF67vKeQu5VhALQEO::new, "plasma_lines");
        h36MtxA26fowaqmuziAaEhOEM02kwVLO = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(vFtDkIM6uA0xQwu7Ihs5RVVgb5whv1om::new, "skybox");
        OxTCcdjcUmGHuF3eJ2qgNvIJZX3yCyTp = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(gCvgzyM2KYcIfWMVjA7TLK4HMknzYNhk::new, "fluid");
        lXiWCgfFmVz3l7LJE5j78vr4IL1RatGj = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(_3Cs2b98SM3HTQEd76fzJSOWYmajQDF2s::new, "fluid_lines");
        EH1OMHzfgiCPjkevQDvbo2xURIVrlCwi = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(jKcS2tNmtpJbUKLSFIqtftpbFEYwe5vL::new, "silk");
        rtNAPsml9YUO4Vcalr3mThYtZITZWzyA = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(zZ6szWkOzeGstgY9mWxOxmsuT6fnWTmg::new, "silk_lines");
        JOLXNgHhCyaLq1ApUQTV6K7R9rlSxAdE = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(n2kaY45plvhPvLTJGwLdGgL9N5RrTree::new, "noise");
        usF3yyQy0YSKchdVIp63WhCeXXOz3tAl = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(AR3PUueqgAtj4YCSNNnO6Seh162gNIYe::new, "noise_lines");
        yYdEcxn5Zw1y0V1gexD2fbxCDb8qi5qi = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(TbAxsBC01BrEmtCcGqoG8WUYCwpfVeEm::new, "flux");
        Rosuq8YDe3QDsjn2oUCFgZs3WqBpiCTr = twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(JQD8lA2YPF0sCVRzYhTPaWWwFEg8VIpD::new, "flux_lines");
        if (twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da instanceof NcYkf6t0sgVJk7xkGQ1HVuJD4hdqROPb) {
            NcYkf6t0sgVJk7xkGQ1HVuJD4hdqROPb QnjkJM6GXj7T4Vnka0hc2o0Ix6t5xZX4 = (NcYkf6t0sgVJk7xkGQ1HVuJD4hdqROPb)twgZcRT2TcmFDKxD5u0uWA27XIWtT5Da;
            for (Map.Entry<String, Throwable> cSVRohQDPSWdpxKEpklDjHYdHppES0Nv : QnjkJM6GXj7T4Vnka0hc2o0Ix6t5xZX4.DgtMfb1DHYgjCGc5goPKLOZDXz41jkLC().entrySet()) {
                _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Renderer", "Failed to create a shader for " + cSVRohQDPSWdpxKEpklDjHYdHppES0Nv.getKey() + ", Error: " + cSVRohQDPSWdpxKEpklDjHYdHppES0Nv.getValue().getMessage());
            }
        }
    }

    public static /* bridge */ /* synthetic */ void QRVxJwGX65hot4PManKdjk8Ch14WOqyN(class_591<?> sR2390DWRv8cJ7pHO52W4aifR6IcLem5) {
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3482.field_3665 = false;
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3479.field_3665 = false;
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3484.field_3665 = false;
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3486.field_3665 = false;
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3483.field_3665 = false;
        sR2390DWRv8cJ7pHO52W4aifR6IcLem5.field_3394.field_3665 = false;
    }

    public static /* bridge */ /* synthetic */ void start() {
        RenderSystem.disableCull();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_220(class_1657 UrFtrklPEQRtbaS3zQjLKvUvkOqu0DYZ, class_583<class_1657> fNjCZ2suOoFHQyBDpgvYxaJQRgRgzVuU, long GtUwyep75E6PYW1QcxzuAPFVNqkc3jF7, Color rnr3L6AmgwV937onBcRjFRBd5JYE8UBT, boolean y6zZepZKsRl73zsigzfIhxyi7uziDzc1, Color MnU8I0y6TDRdzfkdbdPpzwdgAYbbFhdn, float PjQuuaH84aXr2Cz8aQ6GcmgOmvQgrY7z, float DIaOjR4gPk2xHj0Lb7YEDDTdA9cFsfYV) {
        rqMpas6hBytDXGfoySMj6f99n3vu3sut CmQqJX9KBL4h41wbBTOsqzOUCrggX5uu = h051oGnfbeVHvnLJ3029aut39JqYeo9d.KEDPhkzfIAD22SQKDGRt2fH4l1ts3xUn().cfr_renamed_221(fNjCZ2suOoFHQyBDpgvYxaJQRgRgzVuU).ozXWsgE44AfkIAJUceDyteW4t9vTe9Qw(UrFtrklPEQRtbaS3zQjLKvUvkOqu0DYZ).l8y1amLiVL3QzoCSoZBMzvWQkGUZSl47(rnr3L6AmgwV937onBcRjFRBd5JYE8UBT, MnU8I0y6TDRdzfkdbdPpzwdgAYbbFhdn).SeuqqFyGHNBVZWxxWz5Ppku74hd69Uwl(DIaOjR4gPk2xHj0Lb7YEDDTdA9cFsfYV);
        if (y6zZepZKsRl73zsigzfIhxyi7uziDzc1) {
            CmQqJX9KBL4h41wbBTOsqzOUCrggX5uu.KKCrRfWJm6qf5a7bkSfV78gVniuE80w9(PjQuuaH84aXr2Cz8aQ6GcmgOmvQgrY7z);
        }
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.SM4hktjyGU6QSLOTfcgH3XLwCief3aKT.add(CmQqJX9KBL4h41wbBTOsqzOUCrggX5uu.cfr_renamed_222());
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_223(tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u AlIa5DuoJYLR4H4prFi9TbEQ3azZfUBF) {
        cHvVsOX1JUMrGnASZAqiFfe6IBwl0gpK.add(AlIa5DuoJYLR4H4prFi9TbEQ3azZfUBF);
    }

    public static /* bridge */ /* synthetic */ void BsJf3bUXteMpYpejOu9Xs7Yp0d2UhSfD() {
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((int)770, (int)771, (int)0, (int)1);
    }

    public static /* bridge */ /* synthetic */ void XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc() {
        if (IsU1oOkYJb0FFLfVpCbLVlXTSwGNjMJj == null) {
            return;
        }
        xwzfld69V2Kv0YIazuvajwUfOTYTBq8v = RenderSystem.getShaderFogStart();
        TWef3vkqzgdYcObli6pV1ik4dCN2a5Lk = RenderSystem.getShaderFogEnd();
        H13GXaHbiizjL4XkjTgdHKoVWPBRZspc = RenderSystem.getShaderFogShape();
        RenderSystem.setShaderFogStart((float)DtHij1dy2hUyF69xizewVhNf0AhRFmZX);
        RenderSystem.setShaderFogEnd((float)HUic8yUdCDHAIBJP8GU4uUj9oA0zwQjk);
        RenderSystem.setShaderFogShape((class_6854)IsU1oOkYJb0FFLfVpCbLVlXTSwGNjMJj);
    }

    public static /* bridge */ /* synthetic */ void cD5c5foD8g4JvEZljruDvicTFTkkVlE7() {
        if (H13GXaHbiizjL4XkjTgdHKoVWPBRZspc == null) {
            return;
        }
        RenderSystem.setShaderFogStart((float)xwzfld69V2Kv0YIazuvajwUfOTYTBq8v);
        RenderSystem.setShaderFogEnd((float)TWef3vkqzgdYcObli6pV1ik4dCN2a5Lk);
        RenderSystem.setShaderFogShape((class_6854)H13GXaHbiizjL4XkjTgdHKoVWPBRZspc);
    }

    public static /* bridge */ /* synthetic */ boolean w0gcYsV2P9GTHlFoHZq06pgYpbD2meZq(class_238 lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW) {
        if (qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740 == null) {
            return true;
        }
        if (!lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW.method_1013() && lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW.method_995() != 0.0) {
            return qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740.method_23093(lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void qOuqOJQ1FWCWu6GjpcxHus086TfoZj2y(_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk MFNA9ohBPgngnwwHxSDrtMTmsu5o0SWZ) {
        b9vuAz9W9KX11lJ4Rm8D30K8cSzaaqsL.add(MFNA9ohBPgngnwwHxSDrtMTmsu5o0SWZ);
    }

    public static /* bridge */ /* synthetic */ void W7gYL9Qg85lBpgjLGnf4oKwqAu9afNQw(Consumer<Matrix4f> etZiDUM74gfNdFhLd79YjtQ3WSfrtSXc) {
        rOoOB6CLEx77mYrO36dwZjFDcqy0Ni80.add(etZiDUM74gfNdFhLd79YjtQ3WSfrtSXc);
    }

    public static /* bridge */ /* synthetic */ void XMBz7Je8m84kugYKTdkxDDyqlOtF1Ej6(boolean ZFVARKOtwldJ7E43j4sMUsl8GafWxple, Runnable gy9YhWxzOhUSxX4tSgzPlGY9iNYHIQnw) {
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(ZFVARKOtwldJ7E43j4sMUsl8GafWxple);
        gy9YhWxzOhUSxX4tSgzPlGY9iNYHIQnw.run();
    }

    public static /* bridge */ /* synthetic */ void eRLTRbzpiTLhb7vxQv4rFSZZHm0y9LQu(d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ wFVEMu7TsQXwoj6q9Th86qKAUMggIIyW) {
        UXZrZc4gCdPmQiSW6iqQCtWZ06Zsovd9.add(wFVEMu7TsQXwoj6q9Th86qKAUMggIIyW);
    }

    public static /* bridge */ /* synthetic */ void gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(boolean bl) {
        RenderSystem.enableBlend();
        RenderSystem.setShader(class_757::method_34540);
        RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE_MINUS_SRC_ALPHA, (GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ZERO);
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableCull();
        if (bl) {
            RenderSystem.disableDepthTest();
        }
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_59() {
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.depthFunc((int)515);
    }

    public static /* bridge */ /* synthetic */ void jfrN64O2EcorL0Vn7ymH7OHSZvDtfBoZ(class_1511 class_15112, float KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, class_4587 X1thyUKf8DFukT6y6HltLOAYSt59B6gf, int miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, class_630 BeniDanYFEllZEBKiAROLA9KDiR8INnP, class_630 Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, Color gLy7VGjmp7FFXFNDn2f6xMJFcx8kIidW, boolean DUV2tJ0ryF4nQr1WrmsXSrbvwiBF5KAu, Color aJFAyj9XwgzFIvoQiFIhzcMHNTFMlfJx, Color zCqjwg0XCCmcSidQIdMyb4JiCfRgGIfk, boolean LIXxCfm25S3iBBVErXaOurgLEyJxj9if, boolean aZQJPDisrmnyFVNRrwsviSNy9OP1Og4u, Color JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb, boolean oa3HUdEwC6A4GWRJCanATehEejJ71QLY, float IgIrYy663o3O2yGFmTe9He4kKy0Y82AV, float E0JIBCM8tr7CfBLdj8i9nhsqIgg7QPGM, boolean p5b9U7IjFgjmgeYuFEZsYgwVnRTEoCkH, Color yCYg7gvNqXiXwXre2kA6Rn9r2auwId3W, kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY sABQFXdqAblZdh1e1MnwSexm6OL1juCu) {
        if (LIXxCfm25S3iBBVErXaOurgLEyJxj9if) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575), () -> {
                RenderSystem.setShaderTexture((int)0, (class_2960)hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.kHvpP7nfS9piDQ3iTmffMpDCioSQOEpS);
                RenderSystem.enableBlend();
                RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.disableDepthTest();
                RenderSystem.setShader(class_757::method_34543);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(zCqjwg0XCCmcSidQIdMyb4JiCfRgGIfk));
            }, RenderSystem::defaultBlendFunc, J76fG850s08TrtZJvqP2ZlRCu8ol9Pae -> {}, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (oa3HUdEwC6A4GWRJCanATehEejJ71QLY) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575), () -> {
                RenderSystem.setShaderTexture((int)0, (class_2960)hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.UUmjtwfH4mrGiWNMcQnHCiTBFo81CbyJ);
                RenderSystem.enableBlend();
                RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.disableDepthTest();
                RenderSystem.setShader(class_757::method_34523);
                RenderSystem.setShaderGlintAlpha((float)((float)JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb.getAlpha() / 255.0f));
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cfr_renamed_224(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb), 1.0f));
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(0.16f * IgIrYy663o3O2yGFmTe9He4kKy0Y82AV, E0JIBCM8tr7CfBLdj8i9nhsqIgg7QPGM);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc();
            }, () -> {
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cD5c5foD8g4JvEZljruDvicTFTkkVlE7();
                _1DCT2AmtvTGHRBYxhD8bXe43YKsgEaQr.kU4Q7fJwHk5kp6ZYrTeJh9y0ga76HuW7.run();
                RenderSystem.defaultBlendFunc();
                RenderSystem.resetTextureMatrix();
            }, LOo7jj5aAvxeKl1MsJCKJrgNueZ5zNIX -> {}, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (aZQJPDisrmnyFVNRrwsviSNy9OP1Og4u) {
            kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY uOGF0Xg3X4OWcTIWcwoqeHZQcARvT60y = kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY.LdvgfPZTaq52spkjsz4CAKXoEZPGlB3r();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576), () -> {
                RenderSystem.enableBlend();
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
                RenderSystem.disableDepthTest();
                uOGF0Xg3X4OWcTIWcwoqeHZQcARvT60y.cfr_renamed_225();
                uOGF0Xg3X4OWcTIWcwoqeHZQcARvT60y.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(gLy7VGjmp7FFXFNDn2f6xMJFcx8kIidW);
            }, uOGF0Xg3X4OWcTIWcwoqeHZQcARvT60y::cfr_renamed_226, P5UW5JqCpM8w6KqYq7fmYb6cJ1TT801h -> {
                if (DUV2tJ0ryF4nQr1WrmsXSrbvwiBF5KAu) {
                    qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(aJFAyj9XwgzFIvoQiFIhzcMHNTFMlfJx, P5UW5JqCpM8w6KqYq7fmYb6cJ1TT801h, X1thyUKf8DFukT6y6HltLOAYSt59B6gf);
                }
            }, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (p5b9U7IjFgjmgeYuFEZsYgwVnRTEoCkH) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576), () -> {
                RenderSystem.enableBlend();
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
                RenderSystem.disableDepthTest();
                sABQFXdqAblZdh1e1MnwSexm6OL1juCu.cfr_renamed_225();
                sABQFXdqAblZdh1e1MnwSexm6OL1juCu.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(yCYg7gvNqXiXwXre2kA6Rn9r2auwId3W);
            }, RenderSystem::defaultBlendFunc, mxH03x4ZAdxZkddt3q93jsZV0vawy00L -> {}, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
    }

    public static /* bridge */ /* synthetic */ void TERUzWX3UCysBpTEph01i0tLgw1ZiyCa(class_742 IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB, class_591<class_742> class_5913) {
        if (IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7325()) {
            class_5913.method_2805(false);
            class_5913.field_3398.field_3665 = true;
            class_5913.field_3394.field_3665 = true;
        } else {
            class_5913.method_2805(true);
            class_5913.field_3394.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7563);
            class_5913.field_3483.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7564);
            class_5913.field_3482.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7566);
            class_5913.field_3479.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7565);
            class_5913.field_3484.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7568);
            class_5913.field_3486.field_3665 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_7348(class_1664.field_7570);
            class_5913.field_3400 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_18276();
            class_572.class_573 qKQCNDsjvKixTNQ3NhfZjKxlRi7Q1lcq = class_1007.method_4210((class_742)IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB, (class_1268)class_1268.field_5808);
            class_572.class_573 OwXuSq1VZAZk7VOxyLYpSCsld6kZ5V29 = class_1007.method_4210((class_742)IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB, (class_1268)class_1268.field_5810);
            if (qKQCNDsjvKixTNQ3NhfZjKxlRi7Q1lcq.method_30156()) {
                OwXuSq1VZAZk7VOxyLYpSCsld6kZ5V29 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_6079().method_7960() ? class_572.class_573.field_3409 : class_572.class_573.field_3410;
                class_572.class_573 class_5732 = OwXuSq1VZAZk7VOxyLYpSCsld6kZ5V29;
            }
            if (IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_6068() == class_1306.field_6183) {
                class_5913.field_3395 = qKQCNDsjvKixTNQ3NhfZjKxlRi7Q1lcq;
                class_5913.field_3399 = OwXuSq1VZAZk7VOxyLYpSCsld6kZ5V29;
            } else {
                class_5913.field_3395 = OwXuSq1VZAZk7VOxyLYpSCsld6kZ5V29;
                class_5913.field_3399 = qKQCNDsjvKixTNQ3NhfZjKxlRi7Q1lcq;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void v8A1el1LQTT9lWgmzayDcQpzlU1mxkEa(ImUAvi4sOo8saNCr40FGl2MOCWqWfLW5 PVp9SMB5guQpEilf24IhHhZbnCoY7YFm, Color RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5, boolean ckM2EFZSkAVv5egA6wz41bSuQHOhtAkN, float f, Color AuCM4U2NGYeffaCsOXnVtHepQFs4OakL) {
        class_289 tTaFEizs7ndzSbqrGEIY2jr7aBVMN4W3 = class_289.method_1348();
        RenderSystem.enableBlend();
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader(class_757::method_34539);
        RenderSystem.lineWidth((float)f);
        RenderSystem.setShaderColor((float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getRed() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getGreen() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getBlue() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getAlpha() / 255.0f));
        class_287 GBrkbwiEngs9eEAOeAytSp7QIumyNhTC = tTaFEizs7ndzSbqrGEIY2jr7aBVMN4W3.method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.TERUzWX3UCysBpTEph01i0tLgw1ZiyCa(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.lhxEMxeLbC5z2CvLkikRZLPmaOdREbkm(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu());
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3447 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3400 = false;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3396 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().method_17087((class_1309)PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.lhxEMxeLbC5z2CvLkikRZLPmaOdREbkm(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().field_3654 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().field_3654 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().method_22698(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), (class_4588)GBrkbwiEngs9eEAOeAytSp7QIumyNhTC, 0, 0);
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().method_22698(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), (class_4588)GBrkbwiEngs9eEAOeAytSp7QIumyNhTC, 0, 0);
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(GBrkbwiEngs9eEAOeAytSp7QIumyNhTC);
        if (ckM2EFZSkAVv5egA6wz41bSuQHOhtAkN) {
            PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().field_3654 = 0.0f;
            PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().field_3654 = 0.0f;
            Runnable rZEXQeH2bOkV5RhsCGQPDr3etrA1SCar = () -> RenderSystem.setShader(class_757::method_34535);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(AuCM4U2NGYeffaCsOXnVtHepQFs4OakL, PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), f, rZEXQeH2bOkV5RhsCGQPDr3etrA1SCar);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(AuCM4U2NGYeffaCsOXnVtHepQFs4OakL, PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), f, rZEXQeH2bOkV5RhsCGQPDr3etrA1SCar);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ROqktk0YuTHtTMuAPVVe0RjtMO5q1WEq(true);
    }

    public static /* bridge */ /* synthetic */ void fONoP6LrzRqR4iSGagdpAO7pfZC2anF4(qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh y9slYn24ihUaoKCho6lAUqvB8kKhJKoy, List<xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE> RjFfvmOQfXDBGT40UTwDflctbYH4SrlF, float G1vzRo6oDIlZNpARNINuvKZznqLYcKUG, long iwloZLrZn3zAFosZQ28n0tdAte3A6unD, long otbfodgxhbbZobxM1xiJ6twO6RJKbYVw) {
        class_287 EeD4sZ2S0a1c9kiwr7rFf2TqDdqPw3BL = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(G1vzRo6oDIlZNpARNINuvKZznqLYcKUG, true, () -> RenderSystem.setShader(class_757::method_34535));
        Iterator<xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE> iterator = RjFfvmOQfXDBGT40UTwDflctbYH4SrlF.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(EeD4sZ2S0a1c9kiwr7rFf2TqDdqPw3BL, true);
                return;
            }
            xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw = iterator.next();
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().ro7y5SwfOdUbmCbdyXODcSDem24A1gCl(XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw.QiFogcmhC3KKIaq4OFlP2ElixOKUEpiZ);
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().ro7y5SwfOdUbmCbdyXODcSDem24A1gCl(XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw.NCEtseCiQAENeO7exePJWPIbBhmGsy98);
            if (iwloZLrZn3zAFosZQ28n0tdAte3A6unD != 0L) {
                float Q8jiSCI7QiI5LVAXWLKapcFbdAkzJ5A2 = (float)XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj.getAlpha() / 255.0f * 255.0f;
                float JV72Edbb3xbC0B9Y84FhMq7tbPvtYh0B = Q8jiSCI7QiI5LVAXWLKapcFbdAkzJ5A2 / (float)iwloZLrZn3zAFosZQ28n0tdAte3A6unD;
                float rppJEoPySB5eFk2KASfn15IpN0KV0x4f = (float)class_3532.method_15340((int)((int)(JV72Edbb3xbC0B9Y84FhMq7tbPvtYh0B * (float)(otbfodgxhbbZobxM1xiJ6twO6RJKbYVw + iwloZLrZn3zAFosZQ28n0tdAte3A6unD - System.currentTimeMillis()))), (int)0, (int)((int)Q8jiSCI7QiI5LVAXWLKapcFbdAkzJ5A2)) / 255.0f;
                Color t9jp9g66VgQiEM7cLd37YukJKsP2SBET = _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj, rppJEoPySB5eFk2KASfn15IpN0KV0x4f);
                y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.cfr_renamed_227().cfr_renamed_228(t9jp9g66VgQiEM7cLd37YukJKsP2SBET);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_229(EeD4sZ2S0a1c9kiwr7rFf2TqDdqPw3BL, y9slYn24ihUaoKCho6lAUqvB8kKhJKoy);
                continue;
            }
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.cfr_renamed_227().cfr_renamed_228(XTbwRUbavB6VWaS3tVC8zvC6Q8l8gxJw.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_229(EeD4sZ2S0a1c9kiwr7rFf2TqDdqPw3BL, y9slYn24ihUaoKCho6lAUqvB8kKhJKoy);
        }
    }

    public static /* bridge */ /* synthetic */ void btlBfaM6PaYa0D6Vknp5osohZCQ0ctBW(class_1657 dOJZtwqWbfAZQOpIYg6y4r0jl9DjRLn1, class_583<class_1657> u0J0FjBygw9eJZRy8mUA4FQTwg4DrjM4, long WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Color> wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Long> sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Boolean> xJOnewUxHXAWiCgtzeN23sVQj8iiuwdi, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Color> g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Float> LGA41xjZo7c2Gct8kfaCiF0T13ok7FhE, float gfiTkfYjGQy4QcMqCJGnYb4phBk92erD, Consumer<h051oGnfbeVHvnLJ3029aut39JqYeo9d> consumer) {
        float XDmEbFOYxga2lfitBbVY6Fzc6ilo6gIg = wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5.getValue().getAlpha();
        float I69z4rZb39wldw26bpBfcQ68fgzcevhO = g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2.getValue().getAlpha();
        float x9eVSMX8Sbj0fCBWGMfzGwfMap5CtXtb = XDmEbFOYxga2lfitBbVY6Fzc6ilo6gIg / (float)sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue().longValue();
        float ft1wXC0jLw2BvgotZHSRlRSVnpyIBVfe = I69z4rZb39wldw26bpBfcQ68fgzcevhO / (float)sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue().longValue();
        int KbV5aVy2lwFEZYt7cK5fGEATDxigJxxC = class_3532.method_15340((int)((int)(x9eVSMX8Sbj0fCBWGMfzGwfMap5CtXtb * (float)(WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b + sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue() - System.currentTimeMillis()))), (int)0, (int)((int)XDmEbFOYxga2lfitBbVY6Fzc6ilo6gIg));
        int vWrOGg0tF3vAZGYb72Q3tZaSnuQVm8S4 = class_3532.method_15340((int)((int)(ft1wXC0jLw2BvgotZHSRlRSVnpyIBVfe * (float)(WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b + sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue() - System.currentTimeMillis()))), (int)0, (int)((int)I69z4rZb39wldw26bpBfcQ68fgzcevhO));
        Color FRkadovPAEDOLabWMWgSlArelFKIP48P = _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5.getValue(), (float)KbV5aVy2lwFEZYt7cK5fGEATDxigJxxC / 255.0f);
        Color rdNtya8pKIyDgurbSX8sbjw03G2SKU5i = _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2.getValue(), (float)vWrOGg0tF3vAZGYb72Q3tZaSnuQVm8S4 / 255.0f);
        rqMpas6hBytDXGfoySMj6f99n3vu3sut SsGHY7CPUsAOvZdDNy8d1TsfJW0nPsp0 = h051oGnfbeVHvnLJ3029aut39JqYeo9d.KEDPhkzfIAD22SQKDGRt2fH4l1ts3xUn().cfr_renamed_221(u0J0FjBygw9eJZRy8mUA4FQTwg4DrjM4).ozXWsgE44AfkIAJUceDyteW4t9vTe9Qw(dOJZtwqWbfAZQOpIYg6y4r0jl9DjRLn1).l8y1amLiVL3QzoCSoZBMzvWQkGUZSl47(FRkadovPAEDOLabWMWgSlArelFKIP48P, rdNtya8pKIyDgurbSX8sbjw03G2SKU5i).SeuqqFyGHNBVZWxxWz5Ppku74hd69Uwl(gfiTkfYjGQy4QcMqCJGnYb4phBk92erD);
        if (xJOnewUxHXAWiCgtzeN23sVQj8iiuwdi.getValue().booleanValue()) {
            SsGHY7CPUsAOvZdDNy8d1TsfJW0nPsp0.KKCrRfWJm6qf5a7bkSfV78gVniuE80w9(LGA41xjZo7c2Gct8kfaCiF0T13ok7FhE.getValue().floatValue());
        }
        h051oGnfbeVHvnLJ3029aut39JqYeo9d m3Mga8MDGC0nI1JxiuSKnipVyKdAVkbJ = SsGHY7CPUsAOvZdDNy8d1TsfJW0nPsp0.cfr_renamed_222();
        consumer.accept(m3Mga8MDGC0nI1JxiuSKnipVyKdAVkbJ);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.SM4hktjyGU6QSLOTfcgH3XLwCief3aKT.add(m3Mga8MDGC0nI1JxiuSKnipVyKdAVkbJ);
    }

    public static /* bridge */ /* synthetic */ void giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_287 B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, Runnable T5XHk21VwWEKeDUzJZtEBM3kvd96OSnI, Runnable Yn5s6p2VsCcNbkHbDW6xtHF4qxuqc9BJ, Consumer<class_630> Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL, class_1511 o3sNW28O61pw0sszVGuu1f7fW001IcTg, float RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU, class_4587 jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, int pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, class_630 CnGV2lb4skyWH5PIuU2WeIqTuAiU55Se, class_630 x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK, boolean YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
        float q4RrE9h5uab2TiBpedceCBpEnxeTLlfg = hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.cfr_renamed_230;
        int BmTSHzTO7XqSmlfuxTw0PPbMn3HXZ2rm = class_4608.field_21444;
        T5XHk21VwWEKeDUzJZtEBM3kvd96OSnI.run();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22903();
        float VVW7wZ5LGAS2hqTG8P46QDKhzbB5yXyb = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_30(o3sNW28O61pw0sszVGuu1f7fW001IcTg, RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU);
        float f = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(((float)o3sNW28O61pw0sszVGuu1f7fW001IcTg.field_7034 + RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU) * 3.0f);
        float qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2 = 0.875f;
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22903();
        float f2 = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.YTtqj7VidmuGs4JuKjlLIsMLqagxU8W2();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(f2, f2, f2);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_46416(0.0f, -0.5f, 0.0f);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_46416(0.0f, 1.5f + VVW7wZ5LGAS2hqTG8P46QDKhzbB5yXyb / 2.0f, 0.0f);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg, 0.0f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, BmTSHzTO7XqSmlfuxTw0PPbMn3HXZ2rm);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2, qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2, qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg, 0.0f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, BmTSHzTO7XqSmlfuxTw0PPbMn3HXZ2rm);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2, qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2, qT6HPOXDtmTImLafW8ubUDHkaQ2NKjd2);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg, 0.0f, q4RrE9h5uab2TiBpedceCBpEnxeTLlfg));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            CnGV2lb4skyWH5PIuU2WeIqTuAiU55Se.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, BmTSHzTO7XqSmlfuxTw0PPbMn3HXZ2rm);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22909();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22909();
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(B4fBGHShE248nGrXrOHXaFMrKQgJSXu9);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        Yn5s6p2VsCcNbkHbDW6xtHF4qxuqc9BJ.run();
    }

    public static /* bridge */ /* synthetic */ String ZZfCtAa83lPIMnaGGRkxeUC3NQNXClJR(int n2) {
        return IntStream.range(0, n2).mapToObj(n -> String.valueOf((char)XL2TEtekW1xfxDN0s8JBNqCVkMmSMtUH.nextInt(97, 123))).collect(Collectors.joining());
    }

    public static /* bridge */ /* synthetic */ class_2960 cfr_renamed_231() {
        return class_2960.method_60655((String)"phoboslite", (String)("temp/" + qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.ZZfCtAa83lPIMnaGGRkxeUC3NQNXClJR(32)));
    }

    public static /* bridge */ /* synthetic */ void g8RuHPNG8npDx0KxR5cnCCH0V8yqs6Bw(class_287 Vwb5pevmGjILyTiEwGAQDal2DQie3KMC, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, double al2IW6uwJGWUuxcmC8qGvrwY5otwstut, double sDzibCAuMEeAFEWJnVcin1NHwlTkp02V, double jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin, double d, double kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7, double JpkS6939fU6Sx584eBextU5c7t6kkzQ2) {
        double KySjJwMPTLE5n6k3wekCpTvZskcrb17Z = d - al2IW6uwJGWUuxcmC8qGvrwY5otwstut;
        double d2 = kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7 - sDzibCAuMEeAFEWJnVcin1NHwlTkp02V;
        double i0YnhHBjDxyMke5oaoLM8F7jHpbnhZGz = JpkS6939fU6Sx584eBextU5c7t6kkzQ2 - jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin;
        double vBpeF9gLvpmS35eUUfm4zYD8nXiTxpty = class_3532.method_15355((float)((float)(KySjJwMPTLE5n6k3wekCpTvZskcrb17Z * KySjJwMPTLE5n6k3wekCpTvZskcrb17Z + d2 * d2 + i0YnhHBjDxyMke5oaoLM8F7jHpbnhZGz * i0YnhHBjDxyMke5oaoLM8F7jHpbnhZGz)));
        float zAJXbSAxada33NBIYeemhxGgncGW0J4P = (float)(KySjJwMPTLE5n6k3wekCpTvZskcrb17Z / vBpeF9gLvpmS35eUUfm4zYD8nXiTxpty);
        float xF3XLzcyydHYVpzWOGu1J7iirCCozugY = (float)(d2 / vBpeF9gLvpmS35eUUfm4zYD8nXiTxpty);
        float f = (float)(i0YnhHBjDxyMke5oaoLM8F7jHpbnhZGz / vBpeF9gLvpmS35eUUfm4zYD8nXiTxpty);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(Vwb5pevmGjILyTiEwGAQDal2DQie3KMC, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)al2IW6uwJGWUuxcmC8qGvrwY5otwstut, (float)sDzibCAuMEeAFEWJnVcin1NHwlTkp02V, (float)jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin, (float)d, (float)kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7, (float)JpkS6939fU6Sx584eBextU5c7t6kkzQ2, (float)zAJXbSAxada33NBIYeemhxGgncGW0J4P, (float)xF3XLzcyydHYVpzWOGu1J7iirCCozugY, (float)f);
    }

    public static /* bridge */ /* synthetic */ <T extends class_1309, M extends class_583<T>> void HrDrquSJP0Y7LXhblMaynYxgoNUKubch(class_4587 class_45872, T t, M m, List<class_3887<T, M>> list, float Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, int ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, Color XRNvqZzOjF3mE62FY13f2nOP4sSmmink, boolean I6EXOpxYCCZupagl2pW4fm2hcorUUsuO, Color jAAt7v4KL9wBaDa9LB0H8yZSugp518Vw, boolean bl, Color gnNIaXSjJtSh4cFP7XVD66MA0UlSBpy3, boolean f3SgXTDAHdz1mtAXey6EswCUZ2fmrieP, boolean liMOx1hzfCQ88twZvuPJqoo5BYqtpMbQ, boolean PRcoBSycG9b0xQyY2igXODUeXBdyxL21, boolean LQVGzm2gpwmlayXzkll7qmtfwXQ2UbKc, Color color, boolean B0nBv091vBpZdFpQ5KFWFzkoKOYY6UxE, float Zy71WovKgL7hOBeUaFgv7CTNxspshp3q, float bXIj2RoJNRIfaSMk4H9vLlYnq95G1IFX, boolean vTb0HsSxyBXYPrTDCcpUwKtORjzz5ULP, Color color2, kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN) {
        class_2350 vQ0eT7FBLZFInQO4gubBvehk0VQORcYD;
        class_1297 class_12972;
        jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa = ((ILivingEntity)t).getGhostModel();
        XRNvqZzOjF3mE62FY13f2nOP4sSmmink = xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa != null ? _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(XRNvqZzOjF3mE62FY13f2nOP4sSmmink, xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : XRNvqZzOjF3mE62FY13f2nOP4sSmmink;
        jAAt7v4KL9wBaDa9LB0H8yZSugp518Vw = xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa != null ? _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(jAAt7v4KL9wBaDa9LB0H8yZSugp518Vw, xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : jAAt7v4KL9wBaDa9LB0H8yZSugp518Vw;
        color = xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa != null ? _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(color, xNQKtjGN7tt3WDxby3Ua0Ls8XpHfqzAa.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : color;
        class_289 WzbWk0sAj6zuSSXe41olvR5PRPjTbZLK = class_289.method_1348();
        class_45872.method_22903();
        m.field_3447 = t.method_6055(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        m.field_3449 = t.method_5765();
        m.field_3448 = t.method_6109();
        float f = class_3532.method_17821((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_6220, (float)t.field_6283);
        float AWNZVuxn9QhP8xbGfb9tjJgHQfxZzrPb = class_3532.method_16439((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_6259, (float)t.field_6241);
        float yykUMJKn9Zl4gtwm66MEMKPgDUGrJums = t.method_5695(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        float BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL = AWNZVuxn9QhP8xbGfb9tjJgHQfxZzrPb - f;
        if (t.method_5765() && (class_12972 = t.method_5854()) instanceof class_1309) {
            class_1309 d7LRuNeIoLEzlDO9iqFwjo783BZLgHqB = (class_1309)class_12972;
            f = class_3532.method_17821((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)d7LRuNeIoLEzlDO9iqFwjo783BZLgHqB.field_6220, (float)d7LRuNeIoLEzlDO9iqFwjo783BZLgHqB.field_6283);
            BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL = AWNZVuxn9QhP8xbGfb9tjJgHQfxZzrPb - f;
            float H88yHe2i0u5o9nRRXEH3kRvT2pANamsE = class_3532.method_15393((float)BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL);
            if (H88yHe2i0u5o9nRRXEH3kRvT2pANamsE < -85.0f) {
                H88yHe2i0u5o9nRRXEH3kRvT2pANamsE = -85.0f;
            }
            if (H88yHe2i0u5o9nRRXEH3kRvT2pANamsE >= 85.0f) {
                H88yHe2i0u5o9nRRXEH3kRvT2pANamsE = 85.0f;
            }
            f = AWNZVuxn9QhP8xbGfb9tjJgHQfxZzrPb - H88yHe2i0u5o9nRRXEH3kRvT2pANamsE;
            if (H88yHe2i0u5o9nRRXEH3kRvT2pANamsE * H88yHe2i0u5o9nRRXEH3kRvT2pANamsE > 2500.0f) {
                f += H88yHe2i0u5o9nRRXEH3kRvT2pANamsE * 0.2f;
            }
            BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL = AWNZVuxn9QhP8xbGfb9tjJgHQfxZzrPb - f;
        }
        float YAjLAtlP5cgwZDI7MnWPAnXO44UEsyGj = class_3532.method_16439((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_5982, (float)t.method_36454());
        if (class_922.method_38563(t)) {
            YAjLAtlP5cgwZDI7MnWPAnXO44UEsyGj *= -1.0f;
            BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL *= -1.0f;
        }
        if (t.method_41328(class_4050.field_18078) && (vQ0eT7FBLZFInQO4gubBvehk0VQORcYD = t.method_18401()) != null) {
            float sQp3AOMIVCysmz63wKuOB1Iytxl355Z7 = t.method_18381(class_4050.field_18076) - 0.1f;
            class_45872.method_46416((float)(-vQ0eT7FBLZFInQO4gubBvehk0VQORcYD.method_10148()) * sQp3AOMIVCysmz63wKuOB1Iytxl355Z7, 0.0f, (float)(-vQ0eT7FBLZFInQO4gubBvehk0VQORcYD.method_10165()) * sQp3AOMIVCysmz63wKuOB1Iytxl355Z7);
        }
        float VOznuIZXmnBiuouy32bwBApGNV9iBuhY = t.method_55693();
        class_45872.method_22905(VOznuIZXmnBiuouy32bwBApGNV9iBuhY, VOznuIZXmnBiuouy32bwBApGNV9iBuhY, VOznuIZXmnBiuouy32bwBApGNV9iBuhY);
        float nDG8qFP39CbniZHbwvPbawiKVojmEHuU = (float)t.field_6012 + Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d;
        class_742 VJdhiN8raAXlIJU1o384NW0T3OTbHC8i = (class_742)t;
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.GnOWsNqrVLv58SkCiy9y0j395WKhAhgN(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, class_45872, nDG8qFP39CbniZHbwvPbawiKVojmEHuU, f, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, VOznuIZXmnBiuouy32bwBApGNV9iBuhY);
        class_45872.method_22905(-1.0f, -1.0f, 1.0f);
        class_45872.method_22905(0.9375f, 0.9375f, 0.9375f);
        class_45872.method_46416(0.0f, -1.501f, 0.0f);
        float y5ezKCyBw5Lej11zxh66Sa914SAPEghk = 0.0f;
        float uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3 = 0.0f;
        if (!t.method_5765() && t.method_5805()) {
            y5ezKCyBw5Lej11zxh66Sa914SAPEghk = t.field_42108.method_48570(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
            uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3 = t.field_42108.method_48572(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
            if (t.method_6109()) {
                uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3 *= 3.0f;
            }
            if (y5ezKCyBw5Lej11zxh66Sa914SAPEghk > 1.0f) {
                y5ezKCyBw5Lej11zxh66Sa914SAPEghk = 1.0f;
            }
        }
        m.method_2816(t, uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3, y5ezKCyBw5Lej11zxh66Sa914SAPEghk, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        m.method_2819(t, uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3, y5ezKCyBw5Lej11zxh66Sa914SAPEghk, nDG8qFP39CbniZHbwvPbawiKVojmEHuU, BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL, yykUMJKn9Zl4gtwm66MEMKPgDUGrJums);
        int fFnGo0rVjlYHpwjgqJzRP7zNkAlAGAIt = class_922.method_23622(t, (float)0.0f);
        if (f3SgXTDAHdz1mtAXey6EswCUZ2fmrieP) {
            RenderSystem.enableBlend();
            RenderSystem.setShaderTexture((int)0, (class_2960)hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.kHvpP7nfS9piDQ3iTmffMpDCioSQOEpS);
            RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader(class_757::method_34543);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, gnNIaXSjJtSh4cFP7XVD66MA0UlSBpy3)));
            class_287 kw6796rnHw6zu7YZ3HqJf6SyRFUiqp2P = WzbWk0sAj6zuSSXe41olvR5PRPjTbZLK.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            m.method_60879(class_45872, (class_4588)kw6796rnHw6zu7YZ3HqJf6SyRFUiqp2P, ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, fFnGo0rVjlYHpwjgqJzRP7zNkAlAGAIt);
            s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(kw6796rnHw6zu7YZ3HqJf6SyRFUiqp2P);
            RenderSystem.defaultBlendFunc();
            RenderSystem.resetTextureMatrix();
        }
        if (B0nBv091vBpZdFpQ5KFWFzkoKOYY6UxE) {
            RenderSystem.enableBlend();
            RenderSystem.setShaderTexture((int)0, (class_2960)hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.UUmjtwfH4mrGiWNMcQnHCiTBFo81CbyJ);
            RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader(class_757::method_34523);
            RenderSystem.setShaderGlintAlpha((float)((float)color.getAlpha() / 255.0f));
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_232(hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(color, 1.0f)));
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(0.16f * Zy71WovKgL7hOBeUaFgv7CTNxspshp3q, bXIj2RoJNRIfaSMk4H9vLlYnq95G1IFX);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc();
            class_287 EsWgALgjyuU1m8vQEWuZOyZqzhiTgm5l = WzbWk0sAj6zuSSXe41olvR5PRPjTbZLK.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            m.method_60879(class_45872, (class_4588)EsWgALgjyuU1m8vQEWuZOyZqzhiTgm5l, ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, fFnGo0rVjlYHpwjgqJzRP7zNkAlAGAIt);
            s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(EsWgALgjyuU1m8vQEWuZOyZqzhiTgm5l);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cD5c5foD8g4JvEZljruDvicTFTkkVlE7();
            _1DCT2AmtvTGHRBYxhD8bXe43YKsgEaQr.kU4Q7fJwHk5kp6ZYrTeJh9y0ga76HuW7.run();
            RenderSystem.defaultBlendFunc();
            RenderSystem.resetTextureMatrix();
        }
        if (liMOx1hzfCQ88twZvuPJqoo5BYqtpMbQ) {
            kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY nxqOj0h0c9HCWmNmFXiGChl6WEdUw7Kp = kbvCKIkhqUhDF8hsGU4leyx87nA6aBZY.LdvgfPZTaq52spkjsz4CAKXoEZPGlB3r();
            RenderSystem.enableBlend();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
            RenderSystem.disableCull();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.disableDepthTest();
            nxqOj0h0c9HCWmNmFXiGChl6WEdUw7Kp.cfr_renamed_225();
            nxqOj0h0c9HCWmNmFXiGChl6WEdUw7Kp.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, XRNvqZzOjF3mE62FY13f2nOP4sSmmink));
            class_287 Ugn9qTEHV1orQxY7ADxztI1nyLfDZIi4 = WzbWk0sAj6zuSSXe41olvR5PRPjTbZLK.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            m.method_60879(class_45872, (class_4588)Ugn9qTEHV1orQxY7ADxztI1nyLfDZIi4, 0, 0);
            s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(Ugn9qTEHV1orQxY7ADxztI1nyLfDZIi4);
            nxqOj0h0c9HCWmNmFXiGChl6WEdUw7Kp.cfr_renamed_226();
            if (I6EXOpxYCCZupagl2pW4fm2hcorUUsuO) {
                class_572 Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8 = (class_572)m;
                Color owKIcV74qhbc9eao5UsK3dWoIscYTXQg = hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, jAAt7v4KL9wBaDa9LB0H8yZSugp518Vw);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_3398, class_45872);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_3391, class_45872);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_27433, class_45872);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_3397, class_45872);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_3401, class_45872);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8.field_3392, class_45872);
                if (PRcoBSycG9b0xQyY2igXODUeXBdyxL21 && !VJdhiN8raAXlIJU1o384NW0T3OTbHC8i.method_7325() && Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8 instanceof class_591) {
                    class_591 HHtiTo1DWbtmatpyF9uMjlac1GH3gBz6 = (class_591)Q7o5csMLcIhFECFeYCc1A1nAFWfyvMV8;
                    qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.lIy7GlFgIWRMbJgZ3tTxMMQAaUcxv1iF(HHtiTo1DWbtmatpyF9uMjlac1GH3gBz6, () -> {
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3394, class_45872);
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3483, class_45872);
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3486, class_45872);
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3479, class_45872);
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3484, class_45872);
                        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(owKIcV74qhbc9eao5UsK3dWoIscYTXQg, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3482, class_45872);
                    });
                }
            }
        }
        if (vTb0HsSxyBXYPrTDCcpUwKtORjzz5ULP) {
            RenderSystem.enableBlend();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
            RenderSystem.disableCull();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.disableDepthTest();
            sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN.cfr_renamed_225();
            sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(VJdhiN8raAXlIJU1o384NW0T3OTbHC8i, color2));
            class_287 EcXokud0rK7IxKequwtD2pV1hA93Z0BR = WzbWk0sAj6zuSSXe41olvR5PRPjTbZLK.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            m.method_60879(class_45872, (class_4588)EcXokud0rK7IxKequwtD2pV1hA93Z0BR, 0, 0);
            s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(EcXokud0rK7IxKequwtD2pV1hA93Z0BR);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        if (!t.method_7325() && bl) {
            RenderSystem.disableDepthTest();
            for (class_3887<T, M> Y8Mb4clboCRNIqhu3ou3MAXVARi9wNv0 : list) {
                Y8Mb4clboCRNIqhu3ou3MAXVARi9wNv0.method_4199(class_45872, (class_4597)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22940().method_23000(), fFnGo0rVjlYHpwjgqJzRP7zNkAlAGAIt, t, uO24rbvJ8AMT5Wf7OqBU4OmmleHzbRa3, y5ezKCyBw5Lej11zxh66Sa914SAPEghk, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, nDG8qFP39CbniZHbwvPbawiKVojmEHuU, BdHhE1x4yYpEvV6XmORWU7bdt9h1gEYL, yykUMJKn9Zl4gtwm66MEMKPgDUGrJums);
            }
            RenderSystem.enableDepthTest();
        }
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_30(class_1511 V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t, float Qf2Z3DN4ZM94XeU0RwcOED76TfI31SeX) {
        float E2ulfG9PJlmnGuVtUiQ1CCC3wMFmsmOS = (float)V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t.field_7034 + Qf2Z3DN4ZM94XeU0RwcOED76TfI31SeX;
        float l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT = class_3532.method_15374((float)(E2ulfG9PJlmnGuVtUiQ1CCC3wMFmsmOS * 0.2f)) / jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.RwhidMckdx4lajUfQTr3nNv6v2XkfvTt(V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t) + 0.5f;
        l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT = (l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT * l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT + l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT) * 0.4f;
        return jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.j8sCUn4q9LdqmZM3wfHGUoSep4qFhfg6(l5ntnlws8NOK1NZJA6UOujpI6LjYoTgT) - 1.4f;
    }

    public static /* bridge */ /* synthetic */ void ndSkyUeagW5UOcaIZzeg4WqsqQC6YWgM(class_4587 XI8xW7qvJo8tLKN264IMYFgBpdP5OGYi, class_1657 mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7, class_583<class_1657> class_5832, h051oGnfbeVHvnLJ3029aut39JqYeo9d BMoLcbfcRG50IqEStVZFUeaHpXzOXCv6, float gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, Color bUNiNdAvr4AjY2UxsUi37VJtTDT2MKWw, boolean GCWs1x0UABMSVrt3DVyvh66M6b1NC5QF, Color color, float FW6VBKfASXrf5QsgRHa8c2mf9U6z90td) {
        class_243 Us6EWQe4SSqMu6NEKsnq1jGu1GIbWk0E = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19326();
        double YxvtKDkJhZutqGj3XxDo0AkQzbWVFKPi = Us6EWQe4SSqMu6NEKsnq1jGu1GIbWk0E.field_1352;
        double LsFriqVl2bpDppGzmXvgzjkU9sMe5FOa = Us6EWQe4SSqMu6NEKsnq1jGu1GIbWk0E.field_1351;
        double AhwuLvF4rc1aRZL7eqgKxKisPQFkBehs = Us6EWQe4SSqMu6NEKsnq1jGu1GIbWk0E.field_1350;
        float wIwd9AdJmOz0rLQoFczRa9JTYSJhuqEc = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false);
        double d = class_3532.method_16436((double)wIwd9AdJmOz0rLQoFczRa9JTYSJhuqEc, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_6038, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23317());
        double kpC0OzZMlYo3tjcz69jLkGZNlwzdUAEv = class_3532.method_16436((double)wIwd9AdJmOz0rLQoFczRa9JTYSJhuqEc, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5971, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23318());
        double aqafzp87qj11Qol3DMsdWBRgXGG9EaER = class_3532.method_16436((double)wIwd9AdJmOz0rLQoFczRa9JTYSJhuqEc, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5989, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23321());
        float MtN7DoqT1PR3WltZ2oH0QUSKkAdX7yHn = class_3532.method_16439((float)gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, (float)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5982, (float)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_36454());
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.ae6M1kMUmKpf3o0blyrfRcczKuaK1AxO(XI8xW7qvJo8tLKN264IMYFgBpdP5OGYi, mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7, class_5832, BMoLcbfcRG50IqEStVZFUeaHpXzOXCv6, d - YxvtKDkJhZutqGj3XxDo0AkQzbWVFKPi, kpC0OzZMlYo3tjcz69jLkGZNlwzdUAEv - LsFriqVl2bpDppGzmXvgzjkU9sMe5FOa, aqafzp87qj11Qol3DMsdWBRgXGG9EaER - AhwuLvF4rc1aRZL7eqgKxKisPQFkBehs, MtN7DoqT1PR3WltZ2oH0QUSKkAdX7yHn, gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, bUNiNdAvr4AjY2UxsUi37VJtTDT2MKWw, color, GCWs1x0UABMSVrt3DVyvh66M6b1NC5QF, FW6VBKfASXrf5QsgRHa8c2mf9U6z90td);
    }

    public static /* bridge */ /* synthetic */ void AUnoM8PGu7OjXsa0WVWoaW38ikFKSCBk(class_287 H2BDaME3FDRCV12EAc0effxJNIt7Muk0, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg) {
        Ef74dXftIbaPjXdCpaFZHA489NKIz88y.WEpNOrFWC0YajkJ8Tn2HGaRavrgUPMWq(XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.p4B7ehAlTx5ueRNHmBVHqGdwVPysxATS());
        Ef74dXftIbaPjXdCpaFZHA489NKIz88y.jT5crBqOQKokkMgPkqqYCiHLbzyXMV4K(-ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosX(), -ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosY(), -ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosZ());
        Matrix4f NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760().method_23761();
        float xQFGG6BEiI67FBUK01V8kN9fdje4HPEo = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().DWYuMlx7vDaNUBsynkUgzceREo5fafgS();
        float L2lvv2BRc07p4i1apkGv1qJ25FT122Gf = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD();
        float gu7k3cruf8cFlMfJLHXjllidecRACfZd = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy();
        float f = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().JY2LnMKCH1LUoYsm4h199XOCZsDv07wN();
        float f2 = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7();
        float f3 = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E();
        float KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp();
        float unxGCOSw81RVwpTRUT7uvVMEqRbVcArx = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233();
        float gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234();
        float CERPZDv8VTk9WSXo2OSE30HRBxRnarxU = (float)Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l();
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, gj0iIQNwyjH3VDVoUeQb6fdyPu1O34ys, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, KWQcmGhn26wUEIwWE4MtI2DArJqaZzkZ).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, unxGCOSw81RVwpTRUT7uvVMEqRbVcArx, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(NnH6nv6j2ksUgnPJ9DHlUt5foauIG6hq, f2, f3, CERPZDv8VTk9WSXo2OSE30HRBxRnarxU).method_22915(xQFGG6BEiI67FBUK01V8kN9fdje4HPEo, L2lvv2BRc07p4i1apkGv1qJ25FT122Gf, gu7k3cruf8cFlMfJLHXjllidecRACfZd, f);
    }

    public static /* bridge */ /* synthetic */ void ae6M1kMUmKpf3o0blyrfRcczKuaK1AxO(class_4587 a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, class_1657 q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, class_583<class_1657> class_5832, h051oGnfbeVHvnLJ3029aut39JqYeo9d Ya1JmDgNYAZBsglOtarNqwV6zDmecvph, double GxnfssqVhM1TCznmOPgKPLjDt9OLtXu6, double Wdscx8oZije9GsfVWsUaKs8ERfTKGPyB, double LGVxkLrteyNCXGHNYffFAkaaYZeVCYwQ, float HqBuvhzstpN0sZEkNFZkSNywkWej8p0V, float XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, Color rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE, Color DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, boolean qZtjm2TihFTk9kmacJI6fwMZxz5OoRL5, float f) {
        class_2350 VnJ95iV15doHLvWdgawxZ7an3rDId7Iv;
        class_1297 class_12972;
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22903();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22904(GxnfssqVhM1TCznmOPgKPLjDt9OLtXu6, Wdscx8oZije9GsfVWsUaKs8ERfTKGPyB, LGVxkLrteyNCXGHNYffFAkaaYZeVCYwQ);
        class_289 sfwit8vk17nNPOF3f52ZPAZXiO5qZr12 = class_289.method_1348();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.GTUwZ4tEfCj6WbmeEyABdjKep1DfIup4().run();
        RenderSystem.lineWidth((float)f);
        class_287 Tbkoc4eZ685zsi1NWQTm6rQN8Fmj3ruG = sfwit8vk17nNPOF3f52ZPAZXiO5qZr12.method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22903();
        RenderSystem.setShaderColor((float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getRed() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getGreen() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getBlue() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getAlpha() / 255.0f));
        class_5832.field_3447 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6055(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        class_5832.field_3449 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765();
        class_5832.field_3448 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6109();
        float P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9 = class_3532.method_17821((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6220, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6283);
        float f2 = class_3532.method_16439((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6259, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6241);
        float zwbuKF2PQswM7rwFfs1xrwB0zsqTcUJP = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5695(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        float f3 = f2 - P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9;
        if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765() && (class_12972 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5854()) instanceof class_1309) {
            class_1309 hQ5ufFTGmGKoUz4eWa6v7Lv09fDssmYP = (class_1309)class_12972;
            P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9 = class_3532.method_17821((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)hQ5ufFTGmGKoUz4eWa6v7Lv09fDssmYP.field_6220, (float)hQ5ufFTGmGKoUz4eWa6v7Lv09fDssmYP.field_6283);
            f3 = f2 - P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9;
            float SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv = class_3532.method_15393((float)f3);
            if (SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv < -85.0f) {
                SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv = -85.0f;
            }
            if (SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv >= 85.0f) {
                SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv = 85.0f;
            }
            P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9 = f2 - SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv;
            if (SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv * SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv > 2500.0f) {
                P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9 += SlmHR2BNSJHYU6gh1TrEznV48n3f8lDv * 0.2f;
            }
            f3 = f2 - P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9;
        }
        float LEK4wt2o7jDtQy1FSwgNsudyYx6nnirj = class_3532.method_16439((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_5982, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_36454());
        if (class_922.method_38563((class_1309)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS)) {
            LEK4wt2o7jDtQy1FSwgNsudyYx6nnirj *= -1.0f;
            f3 *= -1.0f;
        }
        if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_41328(class_4050.field_18078) && (VnJ95iV15doHLvWdgawxZ7an3rDId7Iv = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_18401()) != null) {
            float jZhfBjtJB1uZuJlcEAGGKFoINpir6q2G = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_18381(class_4050.field_18076) - 0.1f;
            a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_46416((float)(-VnJ95iV15doHLvWdgawxZ7an3rDId7Iv.method_10148()) * jZhfBjtJB1uZuJlcEAGGKFoINpir6q2G, 0.0f, (float)(-VnJ95iV15doHLvWdgawxZ7an3rDId7Iv.method_10165()) * jZhfBjtJB1uZuJlcEAGGKFoINpir6q2G);
        }
        float qPuBAnB75tzEUHDyuzn4IyqrIgQp5TNT = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_55693();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(qPuBAnB75tzEUHDyuzn4IyqrIgQp5TNT, qPuBAnB75tzEUHDyuzn4IyqrIgQp5TNT, qPuBAnB75tzEUHDyuzn4IyqrIgQp5TNT);
        float nALXf6Z23EEyUOom3GXu3xQoDT1zXbGP = (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6012 + XcJHSlGkQf7px75BkpVE2xODQTqUCRkS;
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.UiZDT7jDJAiZJ4aW5LPEcmGokm5WdhBA(q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, nALXf6Z23EEyUOom3GXu3xQoDT1zXbGP, P6Ui3wB5KPqrjYEKzAPIBqo1WhHNNXY9, XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, qPuBAnB75tzEUHDyuzn4IyqrIgQp5TNT);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(-1.0f, -1.0f, 1.0f);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(0.9375f, 0.9375f, 0.9375f);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_46416(0.0f, -1.501f, 0.0f);
        float f4 = 0.0f;
        float UQ3sqaoSv0sPNGfM8I8cTYGTeZCnjvAr = 0.0f;
        if (!q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765() && q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5805()) {
            f4 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_42108.method_48570(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
            UQ3sqaoSv0sPNGfM8I8cTYGTeZCnjvAr = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_42108.method_48572(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
            if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6109()) {
                UQ3sqaoSv0sPNGfM8I8cTYGTeZCnjvAr *= 3.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
        }
        class_5832.method_2816((class_1297)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, UQ3sqaoSv0sPNGfM8I8cTYGTeZCnjvAr, f4, XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        class_5832.method_2819((class_1297)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, UQ3sqaoSv0sPNGfM8I8cTYGTeZCnjvAr, f4, nALXf6Z23EEyUOom3GXu3xQoDT1zXbGP, f3, zwbuKF2PQswM7rwFfs1xrwB0zsqTcUJP);
        int yQe5i9XCXCSGyqgamVAVM5Yt5CBM20St = class_922.method_23622((class_1309)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, (float)0.0f);
        class_5832.method_60879(a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, (class_4588)Tbkoc4eZ685zsi1NWQTm6rQN8Fmj3ruG, 0, yQe5i9XCXCSGyqgamVAVM5Yt5CBM20St);
        s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(Tbkoc4eZ685zsi1NWQTm6rQN8Fmj3ruG);
        if (qZtjm2TihFTk9kmacJI6fwMZxz5OoRL5 && class_5832 instanceof class_572) {
            class_572 QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4 = (class_572)class_5832;
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_3391, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_27433, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_3397, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_3401, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_3392, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, QWWHZCIRoVW3LW4mZZaD1zWrFQ1yqcc4.field_3398, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22909();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22909();
    }

    public static /* bridge */ /* synthetic */ void MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(float LtvEnPLKyHE7A5pyZRurfXuVzLyIUr2e, double d) {
        long b9GLSfz328jUc5NnR0YE8P2nb3iaMmxB = (long)((double)class_156.method_658() * d * 8.0);
        float XrzzQxd43rUTIAQmL00ZFZGoOj1V4NGH = (float)(b9GLSfz328jUc5NnR0YE8P2nb3iaMmxB % 110000L) / 110000.0f;
        float cmaXpEOv8gAiPrkG9p6LO6cGkR3VOgIG = (float)(b9GLSfz328jUc5NnR0YE8P2nb3iaMmxB % 30000L) / 30000.0f;
        Matrix4f ObrikztcTZUk7IdoONmYDzF9QgcuCt6N = new Matrix4f().translation(-XrzzQxd43rUTIAQmL00ZFZGoOj1V4NGH, cmaXpEOv8gAiPrkG9p6LO6cGkR3VOgIG, 0.0f);
        ObrikztcTZUk7IdoONmYDzF9QgcuCt6N.rotateZ(0.17453292f).scale(LtvEnPLKyHE7A5pyZRurfXuVzLyIUr2e);
        RenderSystem.setTextureMatrix((Matrix4f)ObrikztcTZUk7IdoONmYDzF9QgcuCt6N);
    }

    public static /* bridge */ /* synthetic */ void wyZCAkZkf114bSyhZRlqPrH7JHlnIHSe(@NonNull class_2960 EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, @NonNull BufferedImage hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd) {
        if (EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx == null) {
            throw new NullPointerException("i is marked non-null but is null");
        }
        if (hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd == null) {
            throw new NullPointerException("bi is marked non-null but is null");
        }
        try {
            int rf7ytaQ2WMk4IeKQAZAAyapAusiciNfJ = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getWidth();
            int DCDQuKmd1rziJf0INVfcZ6IFM87NDn2b = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getHeight();
            class_1011 TTtOBOHbVk2P20qqApFSgYX2fc0pkBtg = new class_1011(class_1011.class_1012.field_4997, rf7ytaQ2WMk4IeKQAZAAyapAusiciNfJ, DCDQuKmd1rziJf0INVfcZ6IFM87NDn2b, false);
            long kAhXLLzshOWRKyWzUGeqyXtbRLejbnM0 = ((INativeImage)TTtOBOHbVk2P20qqApFSgYX2fc0pkBtg).getPointer();
            IntBuffer lwEBCyrP4ozkEmTuzdHpdsWqre0WLmBZ = MemoryUtil.memIntBuffer(kAhXLLzshOWRKyWzUGeqyXtbRLejbnM0, TTtOBOHbVk2P20qqApFSgYX2fc0pkBtg.method_4307() * TTtOBOHbVk2P20qqApFSgYX2fc0pkBtg.method_4323());
            WritableRaster ZLEJ6pN4CHBaREV2ypgZpKNGXA4zFN1t = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getRaster();
            ColorModel DYYZxBKrEg4okDiNcpPBAWkgyneBAhhj = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getColorModel();
            int jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4 = ZLEJ6pN4CHBaREV2ypgZpKNGXA4zFN1t.getNumBands();
            int OpTEXAKv5T4QDE8F62raoAGYLGHgxHkP = ZLEJ6pN4CHBaREV2ypgZpKNGXA4zFN1t.getDataBuffer().getDataType();
            Object[] ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l = switch (OpTEXAKv5T4QDE8F62raoAGYLGHgxHkP) {
                case 0 -> new byte[jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4];
                case 1 -> (Object[])new short[jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4];
                case 3 -> (Object[])new int[jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4];
                case 4 -> (Object[])new float[jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4];
                case 5 -> (Object[])new double[jJkdTaSRT2XVDRLGWsgudPwOGOy0QZI4];
                default -> throw new IllegalArgumentException("Unknown data buffer type: " + OpTEXAKv5T4QDE8F62raoAGYLGHgxHkP);
            };
            for (int yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF = 0; yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF < DCDQuKmd1rziJf0INVfcZ6IFM87NDn2b; ++yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF) {
                for (int DMi8OZE80Gl1mBQPVI0selSWjluzcg9l = 0; DMi8OZE80Gl1mBQPVI0selSWjluzcg9l < rf7ytaQ2WMk4IeKQAZAAyapAusiciNfJ; ++DMi8OZE80Gl1mBQPVI0selSWjluzcg9l) {
                    ZLEJ6pN4CHBaREV2ypgZpKNGXA4zFN1t.getDataElements(DMi8OZE80Gl1mBQPVI0selSWjluzcg9l, yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF, ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l);
                    int hs3cKof1KcMz73wRhipy87DzJV3nZNQ9 = DYYZxBKrEg4okDiNcpPBAWkgyneBAhhj.getAlpha(ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l);
                    int W3cGBb97VMhQzNIkVBUZeCgArfusFfr3 = DYYZxBKrEg4okDiNcpPBAWkgyneBAhhj.getRed(ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l);
                    int ff8LLbtKy6JVfeBNIm8k7wjhkVyxmAzz = DYYZxBKrEg4okDiNcpPBAWkgyneBAhhj.getGreen(ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l);
                    int GVygvkzWPTWNgLLf2LzEFCaCtrTnMyh9 = DYYZxBKrEg4okDiNcpPBAWkgyneBAhhj.getBlue(ZPDXF8mMQ0ayEcM0O8fXn56SBNjEdq5l);
                    int u5BXnN6OLQspcISVZsBbRUeyhosG0kv3 = hs3cKof1KcMz73wRhipy87DzJV3nZNQ9 << 24 | GVygvkzWPTWNgLLf2LzEFCaCtrTnMyh9 << 16 | ff8LLbtKy6JVfeBNIm8k7wjhkVyxmAzz << 8 | W3cGBb97VMhQzNIkVBUZeCgArfusFfr3;
                    lwEBCyrP4ozkEmTuzdHpdsWqre0WLmBZ.put(u5BXnN6OLQspcISVZsBbRUeyhosG0kv3);
                }
            }
            class_1043 HrfYo9EoyITd8mrEx0M8bakSILFjxqDv = new class_1043(TTtOBOHbVk2P20qqApFSgYX2fc0pkBtg);
            HrfYo9EoyITd8mrEx0M8bakSILFjxqDv.method_4524();
            if (RenderSystem.isOnRenderThread()) {
                class_310.method_1551().method_1531().method_4616(EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, (class_1044)HrfYo9EoyITd8mrEx0M8bakSILFjxqDv);
            } else {
                RenderSystem.recordRenderCall(() -> class_310.method_1551().method_1531().method_4616(EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, (class_1044)HrfYo9EoyITd8mrEx0M8bakSILFjxqDv));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_229(class_287 kz7myw2zwrpzpIHDCYh32l9FE8t3SOTt, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj) {
        double d = ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosX();
        double pn4tMLKMOHyArwydKEI2pLEGhrWptCSx = ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosY();
        double d2 = ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosZ();
        double c83n2pGiLFfx8GARbEsMsA3jJLHbtt0G = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().E2JwVcGQXFPR75wmLRqiwquhfytFPzE0() - d;
        double d3 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().zllUUE8Sv3ld1VsWnm7uCC5sHdYVauWE() - pn4tMLKMOHyArwydKEI2pLEGhrWptCSx;
        double oPv3JRPoSjmLtPCcYwjJ5kZp6NZsViPj = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().vJvL9HpUXgAicgNZThxxAaFttWkHlAcT() - d2;
        double cD7T9pOQa2acKerboslwCEo9cvtWPiF5 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().E2JwVcGQXFPR75wmLRqiwquhfytFPzE0() - d;
        double miEFjE8FiuMjPueIKNUZs84zEfuNgwF5 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().zllUUE8Sv3ld1VsWnm7uCC5sHdYVauWE() - pn4tMLKMOHyArwydKEI2pLEGhrWptCSx;
        double EAKKH7nrBDSvYIGUq3S0fPARmz2BW5mF = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().vJvL9HpUXgAicgNZThxxAaFttWkHlAcT() - d2;
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.g8RuHPNG8npDx0KxR5cnCCH0V8yqs6Bw(kz7myw2zwrpzpIHDCYh32l9FE8t3SOTt, QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj, c83n2pGiLFfx8GARbEsMsA3jJLHbtt0G, d3, oPv3JRPoSjmLtPCcYwjJ5kZp6NZsViPj, cD7T9pOQa2acKerboslwCEo9cvtWPiF5, miEFjE8FiuMjPueIKNUZs84zEfuNgwF5, EAKKH7nrBDSvYIGUq3S0fPARmz2BW5mF);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ class_1043 CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(@NotNull BufferedImage cFVibef4ejetSXbIg6qBscGsUSh2cF1g) {
        int wR3bGIqtxtHP20vyV3EKDUMcVrVaUavW = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getWidth();
        int y8eMOX8LitY5DomykY0gjV6crXad4BoL = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getHeight();
        class_1011 sRkrUonCbaxAQlWzXicn2EaPJ9zVJViD = new class_1011(class_1011.class_1012.field_4997, wR3bGIqtxtHP20vyV3EKDUMcVrVaUavW, y8eMOX8LitY5DomykY0gjV6crXad4BoL, false);
        long A3CbVKu4Ze8m95p6FENRyKyFqMOLK0oN = ((INativeImage)sRkrUonCbaxAQlWzXicn2EaPJ9zVJViD).getPointer();
        IntBuffer B2m6ZBOZVmYnKxdHqLaJxUOa3TlEsVqK = MemoryUtil.memIntBuffer(A3CbVKu4Ze8m95p6FENRyKyFqMOLK0oN, sRkrUonCbaxAQlWzXicn2EaPJ9zVJViD.method_4307() * sRkrUonCbaxAQlWzXicn2EaPJ9zVJViD.method_4323());
        WritableRaster yUFRf63BpGGtFTTEN16t9PI88o42KW8i = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getRaster();
        ColorModel itG4tBPwnOlRrPl3OdMP3OwTipM5qhlP = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getColorModel();
        int SMi91DUm1vgOKSGru4D37AmqB9NMQiAt = yUFRf63BpGGtFTTEN16t9PI88o42KW8i.getNumBands();
        int Evz5H9Zthvy2MGsjX1AsS3Sw3HJRsIiH = yUFRf63BpGGtFTTEN16t9PI88o42KW8i.getDataBuffer().getDataType();
        Object[] hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn = switch (Evz5H9Zthvy2MGsjX1AsS3Sw3HJRsIiH) {
            case 0 -> new byte[SMi91DUm1vgOKSGru4D37AmqB9NMQiAt];
            case 1 -> (Object[])new short[SMi91DUm1vgOKSGru4D37AmqB9NMQiAt];
            case 3 -> (Object[])new int[SMi91DUm1vgOKSGru4D37AmqB9NMQiAt];
            case 4 -> (Object[])new float[SMi91DUm1vgOKSGru4D37AmqB9NMQiAt];
            case 5 -> (Object[])new double[SMi91DUm1vgOKSGru4D37AmqB9NMQiAt];
            default -> throw new IllegalArgumentException("Unknown data buffer type: " + Evz5H9Zthvy2MGsjX1AsS3Sw3HJRsIiH);
        };
        int cwfr3n1R3p0QuevYi688GE6Qn78GTsud = 0;
        while (true) {
            if (cwfr3n1R3p0QuevYi688GE6Qn78GTsud >= y8eMOX8LitY5DomykY0gjV6crXad4BoL) {
                class_1043 Hm246fRFVn4CRTUmHNig3FAJ3CGn1Huv = new class_1043(sRkrUonCbaxAQlWzXicn2EaPJ9zVJViD);
                P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> ((class_1043)Hm246fRFVn4CRTUmHNig3FAJ3CGn1Huv).method_4524());
                return Hm246fRFVn4CRTUmHNig3FAJ3CGn1Huv;
            }
            for (int b1AdendDToSRZUyBpCxGbemTbqBnda5k = 0; b1AdendDToSRZUyBpCxGbemTbqBnda5k < wR3bGIqtxtHP20vyV3EKDUMcVrVaUavW; ++b1AdendDToSRZUyBpCxGbemTbqBnda5k) {
                yUFRf63BpGGtFTTEN16t9PI88o42KW8i.getDataElements(b1AdendDToSRZUyBpCxGbemTbqBnda5k, cwfr3n1R3p0QuevYi688GE6Qn78GTsud, hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn);
                int XokEOis79G9Os23LcUdoQzFeoHuhHew8 = itG4tBPwnOlRrPl3OdMP3OwTipM5qhlP.getAlpha(hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn);
                int Yp6OvVPaGsky5BbKmrgauWCQNJGXFC0j = itG4tBPwnOlRrPl3OdMP3OwTipM5qhlP.getRed(hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn);
                int ZaXf6BeC1FDGMbpppEkgtE66FRZ8lXLY = itG4tBPwnOlRrPl3OdMP3OwTipM5qhlP.getGreen(hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn);
                int wS4NZ49bd6tsc3aNrbhuI0ICDne2lyMJ = itG4tBPwnOlRrPl3OdMP3OwTipM5qhlP.getBlue(hSeFBzaXK1MHqliXkG50xnEWt6KUcYOn);
                int FPl8OCpZpq7Qwzj3Bc8SMGOCaRTQmFDN = XokEOis79G9Os23LcUdoQzFeoHuhHew8 << 24 | wS4NZ49bd6tsc3aNrbhuI0ICDne2lyMJ << 16 | ZaXf6BeC1FDGMbpppEkgtE66FRZ8lXLY << 8 | Yp6OvVPaGsky5BbKmrgauWCQNJGXFC0j;
                B2m6ZBOZVmYnKxdHqLaJxUOa3TlEsVqK.put(FPl8OCpZpq7Qwzj3Bc8SMGOCaRTQmFDN);
            }
            ++cwfr3n1R3p0QuevYi688GE6Qn78GTsud;
        }
    }

    public static /* bridge */ /* synthetic */ void CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk() {
        if (hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.czSmuZyGzIuiaEGi9SNqZN5DCDiKhBuv()) {
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            return;
        }
        RenderSystem.defaultBlendFunc();
    }

    public static /* bridge */ /* synthetic */ class_287 K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(float mWMgTKWnoFdpVUUq2aQtwcDZ507vKPug, boolean CyFngZpQQM0XuE7shLo57QxxiLGrdpif, Runnable C3lwhvy2S9baMQ79JYpCjdEDB52Xc4hx) {
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(CyFngZpQQM0XuE7shLo57QxxiLGrdpif);
        RenderSystem.lineWidth((float)mWMgTKWnoFdpVUUq2aQtwcDZ507vKPug);
        C3lwhvy2S9baMQ79JYpCjdEDB52Xc4hx.run();
        return class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
    }

    public static /* bridge */ /* synthetic */ class_243 QJbiOwJE1QrJzYjfzCIDPyOBAKgNU9h1(class_243 Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto) {
        class_310 Idx4H9sh68vkp3Mok9CVyqsIqljm7LZO = class_310.method_1551();
        return new class_243(Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1352 - Idx4H9sh68vkp3Mok9CVyqsIqljm7LZO.method_1561().field_4686.method_19326().field_1352, Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1351 - Idx4H9sh68vkp3Mok9CVyqsIqljm7LZO.method_1561().field_4686.method_19326().field_1351, Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1350 - Idx4H9sh68vkp3Mok9CVyqsIqljm7LZO.method_1561().field_4686.method_19326().field_1350);
    }

    public static /* bridge */ /* synthetic */ void qkMJQNOT8cM7wI8Z9OuJoO5FaK3yOY2G(qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh hLhajrVwqrdYhZynlE1knWTyy6kUImz6, float dj3MKOYrzGN6vVpXTRj3qdCz6uTxev9G, boolean iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, Runnable fOqJGh2otogeURguRcU1AtVEWc6mHFTK, Runnable mwggocMN0t7PqS9z0S1CCIWZT1pXIcbV) {
        class_287 VmRuPmDLEwCDWO3doptLRjurGHjT38x5 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.XMBz7Je8m84kugYKTdkxDDyqlOtF1Ej6(iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, fOqJGh2otogeURguRcU1AtVEWc6mHFTK);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AUnoM8PGu7OjXsa0WVWoaW38ikFKSCBk(VmRuPmDLEwCDWO3doptLRjurGHjT38x5, hLhajrVwqrdYhZynlE1knWTyy6kUImz6);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(VmRuPmDLEwCDWO3doptLRjurGHjT38x5, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg);
        class_287 class_2872 = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(dj3MKOYrzGN6vVpXTRj3qdCz6uTxev9G, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, mwggocMN0t7PqS9z0S1CCIWZT1pXIcbV);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.hmvK18M1orqJQfc1QymJWOXnK6NZ4pA0(class_2872, hLhajrVwqrdYhZynlE1knWTyy6kUImz6);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(class_2872, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg);
    }

    public static /* bridge */ /* synthetic */ int GfFBIl2t0j8LzgUo6Zum98PmsiJ9UVvx() {
        return (int)class_310.method_1551().method_22683().method_4495();
    }

    public static /* bridge */ /* synthetic */ void hmvK18M1orqJQfc1QymJWOXnK6NZ4pA0(class_287 JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2) {
        Ef74dXftIbaPjXdCpaFZHA489NKIz88y.WEpNOrFWC0YajkJ8Tn2HGaRavrgUPMWq(qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2.p4B7ehAlTx5ueRNHmBVHqGdwVPysxATS());
        Ef74dXftIbaPjXdCpaFZHA489NKIz88y.jT5crBqOQKokkMgPkqqYCiHLbzyXMV4K(-ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosX(), -ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosY(), -ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD.renderPosZ());
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)1.0, (float)0.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)0.0, (float)1.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)-1.0, (float)0.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)0.0, (float)-1.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)1.0, (float)0.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)0.0, (float)1.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)-1.0, (float)0.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)0.0, (float)-1.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)1.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)1.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_233(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)1.0, (float)0.0);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.cfr_renamed_234(), (float)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Ef74dXftIbaPjXdCpaFZHA489NKIz88y.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)1.0, (float)0.0);
    }

    public static /* bridge */ /* synthetic */ void AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(class_287 aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh SNX3NzbBYky01CZkcqviAvrwNcYHRcT4, float pOIyV8t9O3mAUgW1msNh42uMnbPSPGxQ, float lfX5OLUBf5YdmX9FUuWT6sSYmQAiXyRX, float R4sTSnHsnW0NBAwe1Kg5kdpW1WOcF4G2, float L4KlsvgacgIPGbWO8AibJGAPItRE8kPP, float D2T8HWyEWtbWwxBjm1LyJe9r0nd2NcVm, float aAO5PSipod7lDN2ANxtipkyEfZU815ht, float f, float u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, float LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as) {
        Matrix4f matrix4f = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760().method_23761();
        class_4587.class_4665 nZPVwVPU2S2VIKXdF89utbjHHEfuofab = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760();
        _6i8e3IhOe6nYF4Y9oJF9j6PVoUsPCV2W qjTm3NPhfDOvrYjDXFehms8FRewSxMFf = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.cfr_renamed_227();
        aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5.method_22918(matrix4f, pOIyV8t9O3mAUgW1msNh42uMnbPSPGxQ, lfX5OLUBf5YdmX9FUuWT6sSYmQAiXyRX, R4sTSnHsnW0NBAwe1Kg5kdpW1WOcF4G2).method_22915(qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.DWYuMlx7vDaNUBsynkUgzceREo5fafgS(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.JY2LnMKCH1LUoYsm4h199XOCZsDv07wN()).method_60831(nZPVwVPU2S2VIKXdF89utbjHHEfuofab, f, u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as);
        aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5.method_22918(matrix4f, L4KlsvgacgIPGbWO8AibJGAPItRE8kPP, D2T8HWyEWtbWwxBjm1LyJe9r0nd2NcVm, aAO5PSipod7lDN2ANxtipkyEfZU815ht).method_22915(qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.DWYuMlx7vDaNUBsynkUgzceREo5fafgS(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy(), qjTm3NPhfDOvrYjDXFehms8FRewSxMFf.JY2LnMKCH1LUoYsm4h199XOCZsDv07wN()).method_60831(nZPVwVPU2S2VIKXdF89utbjHHEfuofab, f, u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_232(Color x2qzbOihsv9uJCIKRqQviA6YoKPbFb27) {
        float[] TiFwgSDujEPuM8bnxrcSCqYWAfu9fMCk = _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(x2qzbOihsv9uJCIKRqQviA6YoKPbFb27);
        RenderSystem.setShaderColor((float)TiFwgSDujEPuM8bnxrcSCqYWAfu9fMCk[0], (float)TiFwgSDujEPuM8bnxrcSCqYWAfu9fMCk[1], (float)TiFwgSDujEPuM8bnxrcSCqYWAfu9fMCk[2], (float)TiFwgSDujEPuM8bnxrcSCqYWAfu9fMCk[3]);
    }

    public static /* bridge */ /* synthetic */ void n7d67iQbdtKkOQyH9Lgk3PZTxMNHFXds(Color color, class_630.class_628 class_6282, class_4587 sGyVNiOnK7jOVvosTmRE3dYTN8rGdqCQ) {
        Matrix4f e9xRYorY3pxiVENESPcJzcsySjtLNICt = sGyVNiOnK7jOVvosTmRE3dYTN8rGdqCQ.method_23760().method_23761();
        Vector4f vector4f = new Vector4f();
        Vector4f RbDzjgd1CQvdlhiT8GV11xDYIg213RJW = new Vector4f();
        Vector4f qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g = new Vector4f();
        Vector4f C5dsy3WkClUEMgco33TvSi6qqMgACA1y = new Vector4f();
        class_630.class_593[] class_593Array = class_6282.field_3649;
        int n = class_593Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_630.class_593 yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8 = class_593Array[n2];
            vector4f.set(yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[0].field_3605.x / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[0].field_3605.y / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[0].field_3605.z / 16.0f, 1.0f);
            vector4f.mul((Matrix4fc)e9xRYorY3pxiVENESPcJzcsySjtLNICt);
            RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.set(yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[1].field_3605.x / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[1].field_3605.y / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[1].field_3605.z / 16.0f, 1.0f);
            RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.mul((Matrix4fc)e9xRYorY3pxiVENESPcJzcsySjtLNICt);
            qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.set(yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[2].field_3605.x / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[2].field_3605.y / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[2].field_3605.z / 16.0f, 1.0f);
            qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.mul((Matrix4fc)e9xRYorY3pxiVENESPcJzcsySjtLNICt);
            C5dsy3WkClUEMgco33TvSi6qqMgACA1y.set(yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[3].field_3605.x / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[3].field_3605.y / 16.0f, yPhGgAAOdMKnIDfkMypAEYAdDELvzpj8.field_3502[3].field_3605.z / 16.0f, 1.0f);
            C5dsy3WkClUEMgco33TvSi6qqMgACA1y.mul((Matrix4fc)e9xRYorY3pxiVENESPcJzcsySjtLNICt);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(vector4f.x, vector4f.y, vector4f.z, RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.x, RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.y, RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.z, color));
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.x, RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.y, RbDzjgd1CQvdlhiT8GV11xDYIg213RJW.z, qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.x, qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.y, qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.z, color));
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.x, qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.y, qMWvtxxj68JEojQMgkgCw0ebsZTJRn2g.z, C5dsy3WkClUEMgco33TvSi6qqMgACA1y.x, C5dsy3WkClUEMgco33TvSi6qqMgACA1y.y, C5dsy3WkClUEMgco33TvSi6qqMgACA1y.z, color));
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(vector4f.x, vector4f.y, vector4f.z, vector4f.x, vector4f.y, vector4f.z, color));
            ++n2;
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_236(Color KuoA2Y6HWVfxqgEb9NdUah2xPKRYM3HO, Runnable pSHZatbegaT9nf5knddpCMxofl8MPz9X) {
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_232(KuoA2Y6HWVfxqgEb9NdUah2xPKRYM3HO);
        pSHZatbegaT9nf5knddpCMxofl8MPz9X.run();
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.hucX855ESx7e1rO9eVmBacwzcWS9e8ee();
    }

    public static /* bridge */ /* synthetic */ void GnOWsNqrVLv58SkCiy9y0j395WKhAhgN(class_742 wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_4587 class_45872, float j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, float YpOtHDASHYz99TMtOfO9QwsO136sQCpc, float f, float YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU) {
        float j5gacLCkTQ8cYZrDibAn7XYKAzUGEF1c = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6024(f);
        float f2 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5695(f);
        if (w5cqX2CNLLKfxdduQy4pRn4iy077Ql1d.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG)) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
            float Zp5gkpyS8i8KV9RVb7FdrrsUbXi4Psl1 = (float)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6003() + f;
            float f3 = class_3532.method_15363((float)(Zp5gkpyS8i8KV9RVb7FdrrsUbXi4Psl1 * Zp5gkpyS8i8KV9RVb7FdrrsUbXi4Psl1 / 100.0f), (float)0.0f, (float)1.0f);
            if (!wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6123()) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f3 * (-90.0f - f2)));
            }
            class_243 ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5828(f);
            class_243 zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_49339(f);
            double ck0oEiPiCcG0IxhgPYzGmT2ZeG3jCgmV = zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY.method_37268();
            double d = ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka.method_37268();
            if (ck0oEiPiCcG0IxhgPYzGmT2ZeG3jCgmV > 0.0 && d > 0.0) {
                double iyIsPp3WxfZWxI7ZKMbzoDFnGKnzxbQX = (zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY.field_1352 * ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka.field_1352 + zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY.field_1350 * ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka.field_1350) / Math.sqrt(ck0oEiPiCcG0IxhgPYzGmT2ZeG3jCgmV * d);
                double WEQlFnBIhaN5zMAnDIuJ9W6TBoXgWNrQ = zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY.field_1352 * ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka.field_1350 - zSa2l8EbdmH8zme1DROUrPPtiGiaQ8iY.field_1350 * ZcF2hx1oZYhIaOo0c63lzYIQL3tfLvka.field_1352;
                class_45872.method_22907(class_7833.field_40716.rotation((float)(Math.signum(WEQlFnBIhaN5zMAnDIuJ9W6TBoXgWNrQ) * Math.acos(iyIsPp3WxfZWxI7ZKMbzoDFnGKnzxbQX))));
            }
        } else if (j5gacLCkTQ8cYZrDibAn7XYKAzUGEF1c > 0.0f) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
            float aTRvYCYgc3tT0UHF4Gpt2E0enYfzdx7u = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5799() ? -90.0f - f2 : -90.0f;
            float FX2KdFcZsCdg6UwrJN3hGlBVZhG1WM5N = class_3532.method_16439((float)j5gacLCkTQ8cYZrDibAn7XYKAzUGEF1c, (float)0.0f, (float)aTRvYCYgc3tT0UHF4Gpt2E0enYfzdx7u);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(FX2KdFcZsCdg6UwrJN3hGlBVZhG1WM5N));
            if (wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_20232()) {
                class_45872.method_46416(0.0f, -1.0f, 0.3f);
            }
        } else {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
        }
    }

    public static /* bridge */ /* synthetic */ void nvvk7rctAIw6lyreWeHyT2vPyFBrINsd(String string, float fSNgoXeBBUWBz213bIvDI2HGTstYwCZc, double yaAKPIwxhHAvNGrsxetOdwAa8fvqFqzv, double M6pXvGxaivYkrREbJFUF3kPJw0XrHd4p, double PUNZenYM7fXA1gut4gEScaw12HFmS6NJ, class_4184 Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd, Color color, float V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, boolean TmhJYfDISCj4F4VDBqlMR2zlSgG7OsuH, boolean cqclVOwbl6ju0INO60fTSOoMtmzRILaV) {
        float E9I0L4rdRONyc0XY0NXvhMGUVySXlxEB = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19330();
        float su48MMpTqVS3FeM5tYVhfnJzsGoowQfy = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19329();
        class_243 l1IFU6sNpusC4RDWev7XLb9ytyeUHfSi = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19326();
        class_4587 class_45872 = new class_4587();
        class_45872.method_22903();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19330() + 180.0f));
        class_45872.method_22904(yaAKPIwxhHAvNGrsxetOdwAa8fvqFqzv - l1IFU6sNpusC4RDWev7XLb9ytyeUHfSi.field_1352, M6pXvGxaivYkrREbJFUF3kPJw0XrHd4p - l1IFU6sNpusC4RDWev7XLb9ytyeUHfSi.field_1351, PUNZenYM7fXA1gut4gEScaw12HFmS6NJ - l1IFU6sNpusC4RDWev7XLb9ytyeUHfSi.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-E9I0L4rdRONyc0XY0NXvhMGUVySXlxEB));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(su48MMpTqVS3FeM5tYVhfnJzsGoowQfy));
        GL11.glDepthFunc((int)519);
        class_45872.method_22905(-V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, -V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, -1.0f);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.QuoCPDBawo6keYH1fO1BWQ8Yw66cfAmg(class_45872, string, -fSNgoXeBBUWBz213bIvDI2HGTstYwCZc, color, TmhJYfDISCj4F4VDBqlMR2zlSgG7OsuH, cqclVOwbl6ju0INO60fTSOoMtmzRILaV);
        GL11.glDepthFunc((int)515);
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ Vector3f CiY8bXeYrM3FvNpvMBF5bCU5NMnTNJ8Z(float xN09KaAqQZXit1n3CaprjNz0QkssFMuN, float gWlpvQt4ayTXXZ45QsTB7Ocqq5jAQebw, float pRLeMs1CW5rjGQf7HfrgNUcSMAmMcyzd, float xx4R6Ydrc69fK5BRjUv99nsuWZlvzNDc, float f, float SZHttbJNgsWfCEdaAxCXNFzkNmSPhrSi) {
        float M8yvifW8rYJBv9dQi0GxuDyBFeH8NeF2 = xx4R6Ydrc69fK5BRjUv99nsuWZlvzNDc - xN09KaAqQZXit1n3CaprjNz0QkssFMuN;
        float sWziO9FFWBHiB0AwipJbtIc8tXHsWpIc = f - gWlpvQt4ayTXXZ45QsTB7Ocqq5jAQebw;
        float S5235n5biRIrQoy6tImfbUhnlXXF0Eee = SZHttbJNgsWfCEdaAxCXNFzkNmSPhrSi - pRLeMs1CW5rjGQf7HfrgNUcSMAmMcyzd;
        float hjRCViE7OPgh1DRO3sKxKzsFWhWegVcW = class_3532.method_15355((float)(M8yvifW8rYJBv9dQi0GxuDyBFeH8NeF2 * M8yvifW8rYJBv9dQi0GxuDyBFeH8NeF2 + sWziO9FFWBHiB0AwipJbtIc8tXHsWpIc * sWziO9FFWBHiB0AwipJbtIc8tXHsWpIc + S5235n5biRIrQoy6tImfbUhnlXXF0Eee * S5235n5biRIrQoy6tImfbUhnlXXF0Eee));
        return new Vector3f(M8yvifW8rYJBv9dQi0GxuDyBFeH8NeF2 / hjRCViE7OPgh1DRO3sKxKzsFWhWegVcW, sWziO9FFWBHiB0AwipJbtIc8tXHsWpIc / hjRCViE7OPgh1DRO3sKxKzsFWhWegVcW, S5235n5biRIrQoy6tImfbUhnlXXF0Eee / hjRCViE7OPgh1DRO3sKxKzsFWhWegVcW);
    }

    public static /* bridge */ /* synthetic */ void fqRIVjus4ODLtGHcoxwIJCZCGxKyWut8(class_238 YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm, Matrix4f nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, Color rooW3JsofVflmFMvCNgJjiFr5fgWVLCT, Color EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ) {
        float J9GDnpxhtfOqmRIybc715IpN2GFUDfVn = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1323 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10216());
        float ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1322 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10214());
        float I8D7poZmL6eWXAKEirfz3PGe1tnafXI1 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1321 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10215());
        float QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1320 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10216());
        float F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1325 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10214());
        float f = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1324 - qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10215());
        class_287 SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(true);
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, ReYLLsMjRk6lMNWyGaEKXKV96AGIwKNr, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, J9GDnpxhtfOqmRIybc715IpN2GFUDfVn, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, QoM2sypRdTs5hI6lqf9pqYdsVvnhaGgk, F26LNBsvrv9KgGHvPOfl8y2xVfKIayPg, I8D7poZmL6eWXAKEirfz3PGe1tnafXI1).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(SspDSyfcBJXBAC9QQJm8WV2dS2Tq8Xmu, true);
    }

    public static /* bridge */ /* synthetic */ void kA5LT7z26p16HYt654P9BTHmLTp6zWki(class_1309 RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh, class_4587 wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF, float GGjCk9H1ivzmKdMfkO4Cx9Pw60H1VGc7, float hGCZEZtcLUJhOatGne0b96nwN76rxZfm, float f, float f2) {
        if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_32314()) {
            hGCZEZtcLUJhOatGne0b96nwN76rxZfm += (float)(Math.cos((double)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6012 * 3.25) * Math.PI * (double)0.4f);
        }
        if (!RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_41328(class_4050.field_18078)) {
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(180.0f - hGCZEZtcLUJhOatGne0b96nwN76rxZfm));
        }
        if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6213 > 0 && !jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.cfr_renamed_35()) {
            float JlJZfiELijQxEjcSVtouFWNtiLlmPwTs = ((float)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6213 + f - 1.0f) / 20.0f * 1.6f;
            if ((JlJZfiELijQxEjcSVtouFWNtiLlmPwTs = class_3532.method_15355((float)JlJZfiELijQxEjcSVtouFWNtiLlmPwTs)) > 1.0f) {
                JlJZfiELijQxEjcSVtouFWNtiLlmPwTs = 1.0f;
            }
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40718.rotationDegrees(JlJZfiELijQxEjcSVtouFWNtiLlmPwTs * 90.0f));
        } else if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_6123()) {
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_36455()));
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(((float)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6012 + f) * -75.0f));
        } else if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_41328(class_4050.field_18078)) {
            class_2350 my0YCWutJGwyy9WfWcj8yIsyvcQTDPKh = RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_18401();
            float U2GVSnAJm8j9NP3fDGPLrO8caV0FIyi8 = my0YCWutJGwyy9WfWcj8yIsyvcQTDPKh != null ? qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_237(my0YCWutJGwyy9WfWcj8yIsyvcQTDPKh) : hGCZEZtcLUJhOatGne0b96nwN76rxZfm;
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(U2GVSnAJm8j9NP3fDGPLrO8caV0FIyi8));
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40718.rotationDegrees(90.0f));
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(270.0f));
        } else if (class_922.method_38563((class_1309)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh)) {
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_46416(0.0f, (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_17682() + 0.1f) / f2, 0.0f);
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40718.rotationDegrees(180.0f));
        }
    }

    public static /* bridge */ /* synthetic */ void FONkiTQzv9Tt0FkSooZCWDW6jOkM7yZY(Queue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd> MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV) {
        if (MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV.isEmpty()) {
            return;
        }
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(true);
        class_287 zxnKEEcWsQdoiSWdkkxNkHNfaodMYIyX = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        RenderSystem.lineWidth((float)hsAYsXE9vx1rNSFxGiedRN8g8Scu3qYN.KhbvhvFXArnWMIHcrICNBFGgmM7PdJir());
        Iterator<E> iterator = MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                RenderSystem.setShader(class_757::method_34535);
                qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(zxnKEEcWsQdoiSWdkkxNkHNfaodMYIyX, true);
                MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV.clear();
                return;
            }
            KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd = (KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd)iterator.next();
            Color color = kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.xeOYdBBCYOR2F4QW2UhPRnSwS0OpDOxd;
            class_4587 b8nk6CLnXT7v5F8DaibDGUPy93iOdhCr = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.M0Zr3SngdKOPfx7P0kxyYIzVWL2pjcGM(kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.mmhxxczZVwNW3pWK5sWpjB41RA8iGKhn, kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.MRVguI1GwwCzxmGK1gDg0iDh6f1lG4BV, kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.Ak7YqPPXXuGdPMDWzmTR1zBMFb9Ej95f);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.Q3xdqcL3Ggk0v6fyRTzvyLd0RKCIiZRe(zxnKEEcWsQdoiSWdkkxNkHNfaodMYIyX, b8nk6CLnXT7v5F8DaibDGUPy93iOdhCr, 0.0f, 0.0f, 0.0f, (float)(kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.eWGZ4m9sLHAtfQFxChbMIVJQNl9OGGQA - kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.mmhxxczZVwNW3pWK5sWpjB41RA8iGKhn), (float)(kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.ZrAF5xhdIyZpQC59SotwqoxbLhW2fc4U - kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.MRVguI1GwwCzxmGK1gDg0iDh6f1lG4BV), (float)(kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.s3FUvBbsU8XOibBGVsf4zVDumjNc1BKg - kfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd.Ak7YqPPXXuGdPMDWzmTR1zBMFb9Ej95f), color);
        }
    }

    public static /* bridge */ /* synthetic */ float fPR592smSjSMyQC0vpQyLublCiSAxHZF(class_1297 class_12972) {
        if (jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.uhUEorvwOnJawr2vLhH867pno0MJBfz8()) {
            return 0.43f - class_3532.method_16439((float)((ILivingEntity)class_12972).getGlobalAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY(), (float)0.0f, (float)0.3f);
        }
        return class_12972.method_5715() ? 0.4f : 0.43f;
    }

    public static /* bridge */ /* synthetic */ class_4587 M0Zr3SngdKOPfx7P0kxyYIzVWL2pjcGM(double JPjAAHCrFwwEgxgqPoV4KGxVrdGhPrFl, double ilf6IXUIsAufFn5G9EnUY8dszbyRqhqA, double eulp4P670hLG1g5xWQ05FO0kbYS6UYND) {
        class_4587 MyM1kSRYC7qGXFVR8JLA50qri2NBvp4V = new class_4587();
        class_4184 DpubVoCzlrHohpmGwzoRTZRj19Le6pae = class_310.method_1551().field_1773.method_19418();
        MyM1kSRYC7qGXFVR8JLA50qri2NBvp4V.method_22907(class_7833.field_40714.rotationDegrees(DpubVoCzlrHohpmGwzoRTZRj19Le6pae.method_19329()));
        MyM1kSRYC7qGXFVR8JLA50qri2NBvp4V.method_22907(class_7833.field_40716.rotationDegrees(DpubVoCzlrHohpmGwzoRTZRj19Le6pae.method_19330() + 180.0f));
        MyM1kSRYC7qGXFVR8JLA50qri2NBvp4V.method_22904(JPjAAHCrFwwEgxgqPoV4KGxVrdGhPrFl, ilf6IXUIsAufFn5G9EnUY8dszbyRqhqA, eulp4P670hLG1g5xWQ05FO0kbYS6UYND);
        return MyM1kSRYC7qGXFVR8JLA50qri2NBvp4V;
    }

    public static /* bridge */ /* synthetic */ void UiZDT7jDJAiZJ4aW5LPEcmGokm5WdhBA(class_1657 class_16572, class_4587 class_45872, float kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, float yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, float mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, float BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR) {
        float zAbzLl9moSZxFM8g48aOLuBm56LJVKo3 = class_16572.method_6024(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
        float P1cnXjJ7fdiQ8X9I88RpgxJ4fyPxGVab = class_16572.method_5695(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
        if (w5cqX2CNLLKfxdduQy4pRn4iy077Ql1d.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)class_16572)) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
            float f = (float)class_16572.method_6003() + mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu;
            float oUrsHlGbh4IXkgZIWymtvz2OURQmAInr = class_3532.method_15363((float)(f * f / 100.0f), (float)0.0f, (float)1.0f);
            if (!class_16572.method_6123()) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(oUrsHlGbh4IXkgZIWymtvz2OURQmAInr * (-90.0f - P1cnXjJ7fdiQ8X9I88RpgxJ4fyPxGVab)));
            }
            class_243 JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h = class_16572.method_5828(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
            class_243 class_2432 = class_16572.method_18798();
            double Ka5e3TXCgXOR6GkojzqqksHQ3uN18zG5 = class_2432.method_37268();
            double dvwrkcYi3ABcGWrNYFqFICfXHujaIlaq = JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h.method_37268();
            if (Ka5e3TXCgXOR6GkojzqqksHQ3uN18zG5 > 0.0 && dvwrkcYi3ABcGWrNYFqFICfXHujaIlaq > 0.0) {
                double eDuJ9Pgm4DEihkUf9kLfRaYUOlItkvqy = (class_2432.field_1352 * JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h.field_1352 + class_2432.field_1350 * JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h.field_1350) / Math.sqrt(Ka5e3TXCgXOR6GkojzqqksHQ3uN18zG5 * dvwrkcYi3ABcGWrNYFqFICfXHujaIlaq);
                double lkTzn8eHQKxo9jBftIjwMgZFucE0DfYJ = class_2432.field_1352 * JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h.field_1350 - class_2432.field_1350 * JP0kx1uGzy3HIGciyq54VdJTwWZ5Zf7h.field_1352;
                class_45872.method_22907(class_7833.field_40716.rotation((float)(Math.signum(lkTzn8eHQKxo9jBftIjwMgZFucE0DfYJ) * Math.acos(eDuJ9Pgm4DEihkUf9kLfRaYUOlItkvqy))));
            }
        } else if (zAbzLl9moSZxFM8g48aOLuBm56LJVKo3 > 0.0f) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
            float f = class_16572.method_5799() ? -90.0f - P1cnXjJ7fdiQ8X9I88RpgxJ4fyPxGVab : -90.0f;
            float yskwNet2eqEflPx93KxRPx0yut1503hH = class_3532.method_16439((float)zAbzLl9moSZxFM8g48aOLuBm56LJVKo3, (float)0.0f, (float)f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(yskwNet2eqEflPx93KxRPx0yut1503hH));
            if (class_16572.method_20232()) {
                class_45872.method_46416(0.0f, -1.0f, 0.3f);
            }
        } else {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
        }
    }

    public static /* bridge */ /* synthetic */ float awVglyn4JhiDQu1STfW4cWKJpiJO92pO(double QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq) {
        float iBogDnpfK8jcVQRtKOHtHUU8cQDYURea = 0.0018f + 0.003f * (float)QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq;
        if (QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq <= 8.0) {
            iBogDnpfK8jcVQRtKOHtHUU8cQDYURea = 0.0245f;
        }
        return iBogDnpfK8jcVQRtKOHtHUU8cQDYURea;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_238(double d, double iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT, double d2, double yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY, double SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT, double rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9, Color color, float tODiO5lYOErMAa3qyGEf8LGarub5eDhY, Runnable RlXh0BZCpBduUyE8taLPUKt5iySzzxZC) {
        class_287 Ylj1hPd3d2CalsLIsIEQtpshmuH41nY1 = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(tODiO5lYOErMAa3qyGEf8LGarub5eDhY, true, () -> RenderSystem.setShader(class_757::method_34535));
        RlXh0BZCpBduUyE8taLPUKt5iySzzxZC.run();
        RenderSystem.setShaderColor((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        double R9eOguRvAFapVfz49mjGZfZdhBysRIzM = yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY - d;
        double d3 = SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT - iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT;
        double kD8p5JHU4tHZr5V6u5nEmMdALboJig0b = rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9 - d2;
        double H1xnmqx00byBelAgSb0pAirVIS9Wqoso = class_3532.method_15355((float)((float)(R9eOguRvAFapVfz49mjGZfZdhBysRIzM * R9eOguRvAFapVfz49mjGZfZdhBysRIzM + d3 * d3 + kD8p5JHU4tHZr5V6u5nEmMdALboJig0b * kD8p5JHU4tHZr5V6u5nEmMdALboJig0b)));
        float f = (float)(R9eOguRvAFapVfz49mjGZfZdhBysRIzM / H1xnmqx00byBelAgSb0pAirVIS9Wqoso);
        float Rhw4YR5vomOVr8sClLuEhu6nGfIqNWna = (float)(d3 / H1xnmqx00byBelAgSb0pAirVIS9Wqoso);
        float khYu5Xtb6xtkHVMJIkRNbQRgbaNKoZ32 = (float)(kD8p5JHU4tHZr5V6u5nEmMdALboJig0b / H1xnmqx00byBelAgSb0pAirVIS9Wqoso);
        Ylj1hPd3d2CalsLIsIEQtpshmuH41nY1.method_22918(gLxEFteOSvzsBkMo91QHS0sZfUrlnldU, (float)d, (float)iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT, (float)d2).method_22914(f, Rhw4YR5vomOVr8sClLuEhu6nGfIqNWna, khYu5Xtb6xtkHVMJIkRNbQRgbaNKoZ32).method_22915((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        Ylj1hPd3d2CalsLIsIEQtpshmuH41nY1.method_22918(gLxEFteOSvzsBkMo91QHS0sZfUrlnldU, (float)yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY, (float)SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT, (float)rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9).method_22914(f, Rhw4YR5vomOVr8sClLuEhu6nGfIqNWna, khYu5Xtb6xtkHVMJIkRNbQRgbaNKoZ32).method_22915((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(Ylj1hPd3d2CalsLIsIEQtpshmuH41nY1, true);
    }

    public static /* bridge */ /* synthetic */ void gTNJiLlEpxz4hpLufTUXo0WmTliOtMr0(Color s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, class_630.class_628 class_6282, class_4587 lrHzT5dBIn1yPAapVtRXTrP7vMaFBDXg, float ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, Runnable sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr) {
        Matrix4f FMGD07nL84QzyzD6B0SzyDyTiuzCOluU = lrHzT5dBIn1yPAapVtRXTrP7vMaFBDXg.method_23760().method_23761();
        Vector4f vector4f = new Vector4f();
        Vector4f h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB = new Vector4f();
        Vector4f AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl = new Vector4f();
        Vector4f InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70 = new Vector4f();
        class_630.class_593[] class_593Array = class_6282.field_3649;
        int n = class_593Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_630.class_593 kMpZmyCTfn7gt90fk9LG74YONbuleqpt = class_593Array[n2];
            vector4f.set(kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[0].field_3605.x / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[0].field_3605.y / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[0].field_3605.z / 16.0f, 1.0f);
            vector4f.mul((Matrix4fc)FMGD07nL84QzyzD6B0SzyDyTiuzCOluU);
            h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.set(kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[1].field_3605.x / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[1].field_3605.y / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[1].field_3605.z / 16.0f, 1.0f);
            h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.mul((Matrix4fc)FMGD07nL84QzyzD6B0SzyDyTiuzCOluU);
            AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.set(kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[2].field_3605.x / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[2].field_3605.y / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[2].field_3605.z / 16.0f, 1.0f);
            AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.mul((Matrix4fc)FMGD07nL84QzyzD6B0SzyDyTiuzCOluU);
            InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.set(kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[3].field_3605.x / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[3].field_3605.y / 16.0f, kMpZmyCTfn7gt90fk9LG74YONbuleqpt.field_3502[3].field_3605.z / 16.0f, 1.0f);
            InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.mul((Matrix4fc)FMGD07nL84QzyzD6B0SzyDyTiuzCOluU);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_238(vector4f.x, vector4f.y, vector4f.z, h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.x, h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.y, h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_238(h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.x, h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.y, h3mQdvnkwsiQMnuA5jZxR67WbnTZZChB.z, AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.x, AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.y, AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_238(AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.x, AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.y, AvKXZdLtFqTbgAfX2dlHSCH9qkFvlZDl.z, InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.x, InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.y, InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.cfr_renamed_238(InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.x, InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.y, InSSYYm8lTsRSmGvnUjQxGMGN3fBYn70.z, vector4f.x, vector4f.y, vector4f.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            ++n2;
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void Q3xdqcL3Ggk0v6fyRTzvyLd0RKCIiZRe(class_287 i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV, class_4587 DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL, float mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, float UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, float QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2, float uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, float W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, float t3gJ0IokPEIygVLuhMI028XZoQJAIef9, Color q0SMSTMxgwEtMGramypS7gyOpKbH5O9I) {
        Matrix4f rHhkiMyNcTaTdXbEQILTbyjGe3h8qUDs = DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL.method_23760().method_23761();
        class_4587.class_4665 fy4h7ZYwnSSzUy5VcdznpTMLjPhy6YYA = DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL.method_23760();
        Vector3f z0UvsF37WTpHYGsX4s5seR21rowuRj0u = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CiY8bXeYrM3FvNpvMBF5bCU5NMnTNJ8Z(mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2, uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, t3gJ0IokPEIygVLuhMI028XZoQJAIef9);
        i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV.method_22918(rHhkiMyNcTaTdXbEQILTbyjGe3h8qUDs, mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2).method_1336(q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getRed(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getGreen(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getBlue(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getAlpha()).method_60831(fy4h7ZYwnSSzUy5VcdznpTMLjPhy6YYA, z0UvsF37WTpHYGsX4s5seR21rowuRj0u.x(), z0UvsF37WTpHYGsX4s5seR21rowuRj0u.y(), z0UvsF37WTpHYGsX4s5seR21rowuRj0u.z());
        i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV.method_22918(rHhkiMyNcTaTdXbEQILTbyjGe3h8qUDs, uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, t3gJ0IokPEIygVLuhMI028XZoQJAIef9).method_1336(q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getRed(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getGreen(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getBlue(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getAlpha()).method_60831(fy4h7ZYwnSSzUy5VcdznpTMLjPhy6YYA, z0UvsF37WTpHYGsX4s5seR21rowuRj0u.x(), z0UvsF37WTpHYGsX4s5seR21rowuRj0u.y(), z0UvsF37WTpHYGsX4s5seR21rowuRj0u.z());
    }

    public static /* bridge */ /* synthetic */ void FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(Color RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, class_630 u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4, class_4587 Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, float PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, Runnable mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2) {
        if (!u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3665 || u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3663.isEmpty() && u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3661.isEmpty()) {
            return;
        }
        Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7.method_22903();
        u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.method_22703(Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7);
        for (class_630.class_628 class_6282 : u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3663) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gTNJiLlEpxz4hpLufTUXo0WmTliOtMr0(RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, class_6282, Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2);
        }
        Iterator<Object> iterator = u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3661.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7.method_22909();
                return;
            }
            class_630 eRdcaUc9fjdvaEUlQZyKKZYmr2ZlH3fD = (class_630)iterator.next();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, eRdcaUc9fjdvaEUlQZyKKZYmr2ZlH3fD, Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2);
        }
    }

    public static /* bridge */ /* synthetic */ void LzwTiArp4VVA0VOqRwxjYUsuUQuT31sZ(boolean htkanMNKPKVxWC5H52ZzePkKxcZXqZNt) {
        cfr_renamed_216 = htkanMNKPKVxWC5H52ZzePkKxcZXqZNt;
    }

    public /* synthetic */ qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_237(class_2350 Er47gDOWq8R3loT8hujFK31AYEzXQJ6d) {
        return switch (Er47gDOWq8R3loT8hujFK31AYEzXQJ6d) {
            case class_2350.field_11035 -> 90.0f;
            case class_2350.field_11043 -> 270.0f;
            case class_2350.field_11034 -> 180.0f;
            default -> 0.0f;
        };
    }

    public static /* bridge */ /* synthetic */ void hucX855ESx7e1rO9eVmBacwzcWS9e8ee() {
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static /* bridge */ /* synthetic */ void s10J4qg8wdqjjlYjG2sUrsgzYl6fGu3N(String string, class_746 EMZ764GfGMhk4XkaSbsmsn8WutZS54wu, class_1297 sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB, float y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo, float RvIJlBsEiXEZ9MIgbLxvJduu4fLxhPT9, Color KfJsCBGiav1qgMTHz0R9CvAvfVS4IorN, boolean pgINTJVrANObJtuDqA1dRjFLyVBHJW5A, boolean zcRIZRImNUEeVh1361QGQ2SrOykWkim8) {
        double NKQxz8iSud9VTytVVGMoriG7AQ30VpNi;
        if (P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560() == null) {
            return;
        }
        class_243 eilrovH1iLFCcq3tRyTFSTjNu7nNMEBe = TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().cfr_renamed_239() : AxU9DkyZzgnznGwLiuhtNhvn78Ii8Kbm.VWBTslLvmQ8H6ObUath0nNrWhJyMJMCe(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560(), y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        double bWh5530yeR0nWYv18aHBMLkQRTdEueKa = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23317();
        double d = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23318();
        double d2 = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23321();
        class_4184 vgdpqR18oZ79GOBoOtXa76KJIp2Olbgs = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418();
        class_243 Dr8BBGStTuotbrPtyqoQgm9awGDtNlio = AxU9DkyZzgnznGwLiuhtNhvn78Ii8Kbm.VWBTslLvmQ8H6ObUath0nNrWhJyMJMCe(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB, y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        class_243 nHAAsLunabEFAHb4CS4PZKcsRHtqAQAV = AxU9DkyZzgnznGwLiuhtNhvn78Ii8Kbm.cfr_renamed_240(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB, y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        double dl6SjM1rxep3DYLMlEzMeuTZM42a3INH = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23317() - Dr8BBGStTuotbrPtyqoQgm9awGDtNlio.method_10216();
        double d3 = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23318() + (double)sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_17682() + (double)qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.fPR592smSjSMyQC0vpQyLublCiSAxHZF(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB) - Dr8BBGStTuotbrPtyqoQgm9awGDtNlio.method_10214();
        double cFmjtUvB9qKiZA5nHlLD0NnSwrTck1dG = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23321() - Dr8BBGStTuotbrPtyqoQgm9awGDtNlio.method_10215();
        int o0mDhEj2v90DMCRgSkxk2TwWGtj27rWG = pgINTJVrANObJtuDqA1dRjFLyVBHJW5A ? (int)_5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().Sjl1Y1LO5U1gIsVyUJ1TIuKWVUrlwdX8(string) : qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772.method_1727(string);
        float YiwL9ZOXERJHJ07JaHjZ7bWA50o9JE6l = (float)o0mDhEj2v90DMCRgSkxk2TwWGtj27rWG / 2.0f;
        double O4b5JSfCGNODOnlrPVPmfTD30OCF0XcC = bWh5530yeR0nWYv18aHBMLkQRTdEueKa - eilrovH1iLFCcq3tRyTFSTjNu7nNMEBe.method_10216() - dl6SjM1rxep3DYLMlEzMeuTZM42a3INH;
        double vFdlvypLLk2gC7wH9nMZPXHxhv85YmOd = d - eilrovH1iLFCcq3tRyTFSTjNu7nNMEBe.method_10214() - d3;
        double yzMhuCf9spuBbTvfhPyl4iaSt9M0A5qb = d2 - eilrovH1iLFCcq3tRyTFSTjNu7nNMEBe.method_10215() - cFmjtUvB9qKiZA5nHlLD0NnSwrTck1dG;
        double d4 = NKQxz8iSud9VTytVVGMoriG7AQ30VpNi = TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? eilrovH1iLFCcq3tRyTFSTjNu7nNMEBe.method_1022(nHAAsLunabEFAHb4CS4PZKcsRHtqAQAV.method_1031(0.0, (double)sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_17682(), 0.0)) : Math.sqrt(O4b5JSfCGNODOnlrPVPmfTD30OCF0XcC * O4b5JSfCGNODOnlrPVPmfTD30OCF0XcC + vFdlvypLLk2gC7wH9nMZPXHxhv85YmOd * vFdlvypLLk2gC7wH9nMZPXHxhv85YmOd + yzMhuCf9spuBbTvfhPyl4iaSt9M0A5qb * yzMhuCf9spuBbTvfhPyl4iaSt9M0A5qb);
        if (NKQxz8iSud9VTytVVGMoriG7AQ30VpNi > 4096.0) {
            return;
        }
        float DyEpfLvMIsb8TygdPqV9eTk8Fpz9m07O = 0.0018f + 0.003f * (float)NKQxz8iSud9VTytVVGMoriG7AQ30VpNi;
        if (NKQxz8iSud9VTytVVGMoriG7AQ30VpNi <= 8.0) {
            DyEpfLvMIsb8TygdPqV9eTk8Fpz9m07O = 0.0245f;
        }
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.nvvk7rctAIw6lyreWeHyT2vPyFBrINsd(string, YiwL9ZOXERJHJ07JaHjZ7bWA50o9JE6l, dl6SjM1rxep3DYLMlEzMeuTZM42a3INH, d3, cFmjtUvB9qKiZA5nHlLD0NnSwrTck1dG, vgdpqR18oZ79GOBoOtXa76KJIp2Olbgs, KfJsCBGiav1qgMTHz0R9CvAvfVS4IorN, DyEpfLvMIsb8TygdPqV9eTk8Fpz9m07O * RvIJlBsEiXEZ9MIgbLxvJduu4fLxhPT9, pgINTJVrANObJtuDqA1dRjFLyVBHJW5A, zcRIZRImNUEeVh1361QGQ2SrOykWkim8);
    }

    public static /* bridge */ /* synthetic */ void byvGGwYNlqTStewXwM0sAiU9YjR26Bas(float[] cTb5zpWiPFrrtNA1GKYF4J5Ww4Z8ZCRU) {
        RenderSystem.setShaderColor((float)cTb5zpWiPFrrtNA1GKYF4J5Ww4Z8ZCRU[0], (float)cTb5zpWiPFrrtNA1GKYF4J5Ww4Z8ZCRU[1], (float)cTb5zpWiPFrrtNA1GKYF4J5Ww4Z8ZCRU[2], (float)cTb5zpWiPFrrtNA1GKYF4J5Ww4Z8ZCRU[3]);
    }

    public static /* bridge */ /* synthetic */ void pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(Color bQcvzIIK3UgVtYT35o8jyo5Sc8uxIa7R, class_630 o2CKESTTXpuN7kesb5LzAPlVU8x50EAM, class_4587 daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K) {
        if (!o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3665 || o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3663.isEmpty() && o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3661.isEmpty()) {
            return;
        }
        daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K.method_22903();
        o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.method_22703(daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K);
        for (class_630.class_628 class_6282 : o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3663) {
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.n7d67iQbdtKkOQyH9Lgk3PZTxMNHFXds(bQcvzIIK3UgVtYT35o8jyo5Sc8uxIa7R, class_6282, daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K);
        }
        Iterator<Object> iterator = o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3661.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K.method_22909();
                return;
            }
            class_630 izi9luEDmsTboQPoRyoikZINpfT1Oer0 = (class_630)iterator.next();
            qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(bQcvzIIK3UgVtYT35o8jyo5Sc8uxIa7R, izi9luEDmsTboQPoRyoikZINpfT1Oer0, daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K);
        }
    }

    public static /* bridge */ /* synthetic */ void QuoCPDBawo6keYH1fO1BWQ8Yw66cfAmg(class_4587 class_45872, String VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, float tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, Color eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT, boolean Whs3CljLlNCpGLffN4R0kWjVniYnA1IA, boolean DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx) {
        _5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O SOkMJtnxpWPYa8kQPfBcggUyI7EbCHuC = _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg();
        if (Whs3CljLlNCpGLffN4R0kWjVniYnA1IA) {
            SOkMJtnxpWPYa8kQPfBcggUyI7EbCHuC.yaLwDYlVBLunivy9yv5cFxAcUl5gyVMr(class_45872, VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, 0.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getRed() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getGreen() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getBlue() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getAlpha() / 255.0f, DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx);
        } else {
            SOkMJtnxpWPYa8kQPfBcggUyI7EbCHuC.PCc1rb00Ikiy6tXw3XpC263pIUdPkV8c().bT3e5EmAFaGfxe2chKiELIHJe2Lzj2WT(class_45872, VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, 0.0f, eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.hashCode(), DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx);
        }
    }

    public static /* bridge */ /* synthetic */ Queue<Consumer<Matrix4f>> JmnjZql5Q72F3EFqBNX5Jf3BrJSInZTL() {
        return rOoOB6CLEx77mYrO36dwZjFDcqy0Ni80;
    }

    public static /* bridge */ /* synthetic */ boolean uVT9h0cO2fYh55VJRXy6dzqLFnu35t05() {
        return cfr_renamed_216;
    }

    public static /* bridge */ /* synthetic */ Queue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW> NM2kqxZ4BkeRcuift8SdqQnkIjV4EFUf() {
        return Wuq5yW9hWE212BFvBBHfevPNpg6JVW57;
    }

    public static /* bridge */ /* synthetic */ Queue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd> heqbMpuFGKCzdTL0oVa43eMjwh6AQGkx() {
        return PeeIhRw5PrZNMACbxjJxC2xIawoOMu5j;
    }

    public static /* bridge */ /* synthetic */ Queue<h051oGnfbeVHvnLJ3029aut39JqYeo9d> cfr_renamed_241() {
        return SM4hktjyGU6QSLOTfcgH3XLwCief3aKT;
    }

    public static /* bridge */ /* synthetic */ Queue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ> KcSp38mKsB13619YqusRQ3jPa3sSCjVr() {
        return UXZrZc4gCdPmQiSW6iqQCtWZ06Zsovd9;
    }

    public static /* bridge */ /* synthetic */ Queue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u> cfr_renamed_242() {
        return cHvVsOX1JUMrGnASZAqiFfe6IBwl0gpK;
    }

    public static /* bridge */ /* synthetic */ Queue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk> T4i8kT9hxamffn3r71iJTXVDmTJSUAod() {
        return b9vuAz9W9KX11lJ4Rm8D30K8cSzaaqsL;
    }

    static {
        nC5Ln5Xz2SD9FhWpcyQE9ejK2b4ZmO99 = LoggerFactory.getLogger(qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.class);
        ugagmK4TGSZwvLJXEpBRXW4AClaLhEWD = (IEntityRenderDispatcher)Objects.requireNonNull(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561());
        Ef74dXftIbaPjXdCpaFZHA489NKIz88y = new zQu1yDaMR6k8bwk4q0Us08SbW4dDH4R3();
        jrUNjljFx8cvUow5IRs07XpZ5AtWNv20 = new Matrix4f();
        feagZTJV0b1ETKgfUthTwp5BU9EvyLrf = new Matrix4f();
        gLxEFteOSvzsBkMo91QHS0sZfUrlnldU = new Matrix4f();
        cfr_renamed_215 = 0L;
        cfr_renamed_216 = false;
        Wuq5yW9hWE212BFvBBHfevPNpg6JVW57 = new ConcurrentLinkedQueue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW>();
        b9vuAz9W9KX11lJ4Rm8D30K8cSzaaqsL = new ConcurrentLinkedQueue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk>();
        UXZrZc4gCdPmQiSW6iqQCtWZ06Zsovd9 = new ConcurrentLinkedQueue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ>();
        SM4hktjyGU6QSLOTfcgH3XLwCief3aKT = new ConcurrentLinkedQueue<h051oGnfbeVHvnLJ3029aut39JqYeo9d>();
        PeeIhRw5PrZNMACbxjJxC2xIawoOMu5j = new ConcurrentLinkedQueue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd>();
        rOoOB6CLEx77mYrO36dwZjFDcqy0Ni80 = new ConcurrentLinkedQueue<Consumer<Matrix4f>>();
        cHvVsOX1JUMrGnASZAqiFfe6IBwl0gpK = new ConcurrentLinkedQueue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u>();
        XL2TEtekW1xfxDN0s8JBNqCVkMmSMtUH = new Random();
    }
}

