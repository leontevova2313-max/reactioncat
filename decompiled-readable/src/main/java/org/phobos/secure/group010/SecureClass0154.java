/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group010;

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
import org.phobos.secure.group002.SecureClass0016;
import org.phobos.secure.group003.SecureClass0039;
import org.phobos.secure.group003.SecureClass0040;
import org.phobos.secure.group005.SecureClass0065;
import org.phobos.secure.group005.SecureClass0075;
import org.phobos.secure.group005.tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u;
import org.phobos.secure.group007.o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a;
import org.phobos.secure.group010.SecureClass0158;
import org.phobos.secure.group013.SecureClass0195;
import org.phobos.secure.group013.SecureClass0208;
import org.phobos.secure.group014.SecureClass0229;
import org.phobos.secure.group014.NoBobModule;
import org.phobos.secure.group018.SecureClass0300;
import org.phobos.secure.group018.SecureInterface0042;
import org.phobos.secure.group024.rqMpas6hBytDXGfoySMj6f99n3vu3sut;
import org.phobos.secure.group025.SecureClass0428;
import org.phobos.secure.group029.FreecamModule;
import org.phobos.secure.group029.SecureClass0506;
import org.phobos.secure.group032._2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW;
import org.phobos.secure.group032.d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ;
import org.phobos.secure.group033.SecureClass0588;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0655;
import org.phobos.secure.group038.SecureClass0668;
import org.phobos.secure.group039.SecureClass0681;
import org.phobos.secure.group047.SecureClass0839;
import org.phobos.secure.group048.SecureClass0863;
import org.phobos.secure.group058.KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd;
import org.phobos.secure.group058.h051oGnfbeVHvnLJ3029aut39JqYeo9d;
import org.phobos.secure.group060.SecureClass1098;
import org.phobos.secure.group063.SecureClass1147;
import org.phobos.secure.group063.SecureClass1156;
import org.phobos.secure.group061.SecureClass1104;
import org.phobos.secure.group020.SecureClass0327;
import org.phobos.secure.group022.SecureClass0358;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group023.SecureClass0397;
import org.phobos.secure.group023.ChamsModule;
import org.phobos.secure.group023.SecureClass0398;
import org.phobos.secure.group031.AnimationsModule;
import org.phobos.secure.group031.SecureClass0556;
import org.phobos.secure.group036.SecureInterface0093;
import org.phobos.secure.group037._9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk;
import org.phobos.secure.group040.xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE;
import org.phobos.secure.group045.SecureClass0792;
import org.phobos.secure.group045.SecureInterface0112;
import org.phobos.secure.group046.SecureClass0820;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group054.SecureInterface0134;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SecureClass0154
implements SecureInterface0134 {
    public static /* synthetic */ SecureClass0655 field001;
    public static /* synthetic */ SecureClass0075 field002;
    public static /* synthetic */ SecureClass0863 field003;
    public static /* synthetic */ SecureClass0208 field004;
    public static /* synthetic */ SecureClass1147 field005;
    public static /* synthetic */ SecureClass0397 field006;
    public static /* synthetic */ SecureClass0065 field007;
    public static /* synthetic */ SecureClass0327 field008;
    public static /* synthetic */ SecureClass0668 field009;
    public static final /* synthetic */ Matrix4f field010;
    public static /* synthetic */ SecureClass0300 field011;
    public static /* synthetic */ SecureClass0398 field012;
    public static final /* synthetic */ IEntityRenderDispatcher field013;
    public static final /* synthetic */ Logger field014;
    public static /* synthetic */ SecureClass0358 field015;
    public static /* synthetic */ SecureClass0195 field016;
    public static /* synthetic */ SecureClass0229 field017;
    public static /* synthetic */ SecureClass1104 field018;
    public static final /* synthetic */ SecureClass1156 field019;
    public static /* synthetic */ SecureClass0040 field020;
    public static /* synthetic */ SecureClass0820 field021;
    public static final /* synthetic */ Queue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW> field022;
    public static /* synthetic */ class_6854 field023;
    public static final /* synthetic */ Queue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ> field024;
    public static final /* synthetic */ char field025 = 'z';
    public static /* synthetic */ float field026;
    public static final /* synthetic */ char field027 = 'a';
    public static /* synthetic */ long field028;
    public static /* synthetic */ float field029;
    public static final /* synthetic */ Queue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd> field030;
    public static /* synthetic */ boolean field031;
    public static final /* synthetic */ Random field032;
    public static final /* synthetic */ Queue<Consumer<Matrix4f>> field033;
    public static final /* synthetic */ Queue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u> field034;
    public static /* synthetic */ class_6854 field035;
    public static /* synthetic */ class_243 field036;
    public static /* synthetic */ float field037;
    public static final /* synthetic */ Matrix4f field038;
    public static final /* synthetic */ Queue<h051oGnfbeVHvnLJ3029aut39JqYeo9d> field039;
    public static final /* synthetic */ Matrix4f field040;
    public static final /* synthetic */ Queue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk> field041;
    public static /* synthetic */ float field042;

    public static /* bridge */ /* synthetic */ void vpeU25mfWRrcKmT6bWYY1oXfE8E6TLDm() {
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
    }

    public static /* bridge */ /* synthetic */ void lIy7GlFgIWRMbJgZ3tTxMMQAaUcxv1iF(class_591<?> eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw, Runnable YYON81xgcpD14bWRIAkuaJi4NaIE0rWG) {
        boolean field043 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3482.field_3665;
        boolean field044 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3479.field_3665;
        boolean field045 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3484.field_3665;
        boolean field046 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3486.field_3665;
        boolean field047 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3483.field_3665;
        boolean field048 = eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw.field_3394.field_3665;
        SecureClass0154.ni5HvReAZONTEojCfYBR4Vz2IgksRENT(eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw);
        YYON81xgcpD14bWRIAkuaJi4NaIE0rWG.run();
        SecureClass0154.cfr_renamed_217(eZ2bXPpjT4fRRzOCKzNuq1Qbyyatw2xw, field043, field044, field045, field046, field047, field048);
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
        field022.add(B0SuxJOwWzpYKG1wXcyeKxo8nbhRnSx3);
    }

    public static /* bridge */ /* synthetic */ void QkWoT9BuZdRo5S1p61T4KympgR0canKf(class_1657 w7KHu1iK1rlu0tRF92R4vBRzb8REV0pt, class_583<class_1657> class_5832, long tJlh4HPvoevbt2frRAXOENvFmFFMdgzD, SecureClass0603<Color> xvbzzNlohNMjZPZCkDwVKBlgKpdNbPA1, SecureClass0603<Long> AGpE6ckHwMKMXGTLsq6S22csNNekRzGd, SecureClass0603<Boolean> g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, SecureClass0603<Color> mAH2F9ayh75qkUJz8QkgU2aUMSGulVJd, SecureClass0603<Float> mTTOBzB2uInezJuui4Nb6S8heDe6AEI8, float aaWrh2TOkjlJsdhATaDGLhqBwWVg4MvI) {
        SecureClass0154.btlBfaM6PaYa0D6Vknp5osohZCQ0ctBW(w7KHu1iK1rlu0tRF92R4vBRzb8REV0pt, class_5832, tJlh4HPvoevbt2frRAXOENvFmFFMdgzD, xvbzzNlohNMjZPZCkDwVKBlgKpdNbPA1, AGpE6ckHwMKMXGTLsq6S22csNNekRzGd, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, mAH2F9ayh75qkUJz8QkgU2aUMSGulVJd, mTTOBzB2uInezJuui4Nb6S8heDe6AEI8, aaWrh2TOkjlJsdhATaDGLhqBwWVg4MvI, n2kYTjBX4WzFmrgid17ZdrSGIqJI6hB8 -> {});
    }

    public static /* bridge */ /* synthetic */ void qPqPivisjxa5HHSZm4Wpz1jwwx7kQqGu(class_4587 class_45872) {
        class_1297 field049 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560();
        if (field049 instanceof class_1657) {
            class_1657 field050 = (class_1657)field049;
            float field051 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false);
            if (NoBobModule.lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL()) {
                return;
            }
            float field052 = field050.field_5973 - field050.field_6039;
            float field053 = -(field050.field_5973 + field052 * field051);
            float field054 = class_3532.method_16439((float)field051, (float)field050.field_7505, (float)field050.field_7483);
            class_45872.method_22904(-((double)(class_3532.method_15374((float)(field053 * (float)Math.PI)) * field054) * 0.5), (double)Math.abs(class_3532.method_15362((float)(field053 * (float)Math.PI)) * field054), 0.0);
            class_45872.method_22907(class_7833.field_40718.rotationDegrees(class_3532.method_15374((float)(field053 * (float)Math.PI)) * field054 * 3.0f));
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(Math.abs(class_3532.method_15362((float)(field053 * (float)Math.PI - 0.2f)) * field054) * 5.0f));
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
        if (SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740 == null) {
            return true;
        }
        class_238 field055 = SecureClass0839.cfr_renamed_218(ZNcO77slJbpm4vSxpXP5Rq6LssIObJZT, SecureClass0681.e6Tkz7Cm0hf6OzPOvqO84J4IPWfscfUr());
        if (!field055.method_1013() && field055.method_995() != 0.0) {
            return SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740.method_23093(field055);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void Zu4jswg7DsNVTNTC6VwbpYIhnyqSyA6Y() {
        Vector3f field056 = new Vector3f(0.0f, 0.0f, 1.0f);
        o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a field057 = new o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a();
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(field057);
        if (((Boolean)SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.method_42448().method_41753()).booleanValue() && (!field057.isCancelled() || NoBobModule.lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL())) {
            class_4587 field058 = new class_4587();
            SecureClass0154.qPqPivisjxa5HHSZm4Wpz1jwwx7kQqGu(field058);
            field056.mulPosition((Matrix4fc)field058.method_23760().method_23761().invert());
        }
        field036 = new class_243((double)field056.x, (double)(-field056.y), (double)field056.z).method_1037(-((float)Math.toRadians(SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19329()))).method_1024(-((float)Math.toRadians(SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19330()))).method_1019(SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19326());
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_219() {
        SecureInterface0093 field059 = SecureInterface0042.fkZ5wWCQFzjLQ1OEv2mHi4zDV4tyDvjy();
        field011 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0300::new, "dissolve_shader");
        field017 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0229::new, "dissolve_lines_shader");
        field009 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0668::new, "multicolor");
        field008 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0327::new, "multicolor_lines");
        field016 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0195::new, "circle");
        field007 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0065::new, "circle_lines");
        field018 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass1104::new, "plasma");
        field001 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0655::new, "plasma_lines");
        field012 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0398::new, "skybox");
        field003 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0863::new, "fluid");
        field015 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0358::new, "fluid_lines");
        field005 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass1147::new, "silk");
        field004 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0208::new, "silk_lines");
        field002 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0075::new, "noise");
        field021 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0820::new, "noise_lines");
        field006 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0397::new, "flux");
        field020 = field059.BJRD1tvXeqvbcQubcohc1L2p1S5XzuF5(SecureClass0040::new, "flux_lines");
        if (field059 instanceof SecureClass0588) {
            SecureClass0588 field060 = (SecureClass0588)field059;
            for (Map.Entry<String, Throwable> cSVRohQDPSWdpxKEpklDjHYdHppES0Nv : field060.DgtMfb1DHYgjCGc5goPKLOZDXz41jkLC().entrySet()) {
                SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Renderer", "Failed to create a shader for " + cSVRohQDPSWdpxKEpklDjHYdHppES0Nv.getKey() + ", Error: " + cSVRohQDPSWdpxKEpklDjHYdHppES0Nv.getValue().getMessage());
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
        rqMpas6hBytDXGfoySMj6f99n3vu3sut field061 = h051oGnfbeVHvnLJ3029aut39JqYeo9d.KEDPhkzfIAD22SQKDGRt2fH4l1ts3xUn().cfr_renamed_221(fNjCZ2suOoFHQyBDpgvYxaJQRgRgzVuU).ozXWsgE44AfkIAJUceDyteW4t9vTe9Qw(UrFtrklPEQRtbaS3zQjLKvUvkOqu0DYZ).l8y1amLiVL3QzoCSoZBMzvWQkGUZSl47(rnr3L6AmgwV937onBcRjFRBd5JYE8UBT, MnU8I0y6TDRdzfkdbdPpzwdgAYbbFhdn).SeuqqFyGHNBVZWxxWz5Ppku74hd69Uwl(DIaOjR4gPk2xHj0Lb7YEDDTdA9cFsfYV);
        if (y6zZepZKsRl73zsigzfIhxyi7uziDzc1) {
            field061.KKCrRfWJm6qf5a7bkSfV78gVniuE80w9(PjQuuaH84aXr2Cz8aQ6GcmgOmvQgrY7z);
        }
        SecureClass0154.field039.add(field061.cfr_renamed_222());
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_223(tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u AlIa5DuoJYLR4H4prFi9TbEQ3azZfUBF) {
        field034.add(AlIa5DuoJYLR4H4prFi9TbEQ3azZfUBF);
    }

    public static /* bridge */ /* synthetic */ void BsJf3bUXteMpYpejOu9Xs7Yp0d2UhSfD() {
        RenderSystem.depthMask((boolean)false);
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate((int)770, (int)771, (int)0, (int)1);
    }

    public static /* bridge */ /* synthetic */ void XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc() {
        if (field023 == null) {
            return;
        }
        field042 = RenderSystem.getShaderFogStart();
        field029 = RenderSystem.getShaderFogEnd();
        field035 = RenderSystem.getShaderFogShape();
        RenderSystem.setShaderFogStart((float)field026);
        RenderSystem.setShaderFogEnd((float)field037);
        RenderSystem.setShaderFogShape((class_6854)field023);
    }

    public static /* bridge */ /* synthetic */ void cD5c5foD8g4JvEZljruDvicTFTkkVlE7() {
        if (field035 == null) {
            return;
        }
        RenderSystem.setShaderFogStart((float)field042);
        RenderSystem.setShaderFogEnd((float)field029);
        RenderSystem.setShaderFogShape((class_6854)field035);
    }

    public static /* bridge */ /* synthetic */ boolean w0gcYsV2P9GTHlFoHZq06pgYpbD2meZq(class_238 lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW) {
        if (SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740 == null) {
            return true;
        }
        if (!lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW.method_1013() && lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW.method_995() != 0.0) {
            return SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.field_27740.method_23093(lIUGBH2Cr5GnGzmWmdrFV1hNtRI6fVsW);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ void qOuqOJQ1FWCWu6GjpcxHus086TfoZj2y(_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk MFNA9ohBPgngnwwHxSDrtMTmsu5o0SWZ) {
        field041.add(MFNA9ohBPgngnwwHxSDrtMTmsu5o0SWZ);
    }

    public static /* bridge */ /* synthetic */ void W7gYL9Qg85lBpgjLGnf4oKwqAu9afNQw(Consumer<Matrix4f> etZiDUM74gfNdFhLd79YjtQ3WSfrtSXc) {
        field033.add(etZiDUM74gfNdFhLd79YjtQ3WSfrtSXc);
    }

    public static /* bridge */ /* synthetic */ void XMBz7Je8m84kugYKTdkxDDyqlOtF1Ej6(boolean ZFVARKOtwldJ7E43j4sMUsl8GafWxple, Runnable gy9YhWxzOhUSxX4tSgzPlGY9iNYHIQnw) {
        SecureClass0154.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(ZFVARKOtwldJ7E43j4sMUsl8GafWxple);
        gy9YhWxzOhUSxX4tSgzPlGY9iNYHIQnw.run();
    }

    public static /* bridge */ /* synthetic */ void eRLTRbzpiTLhb7vxQv4rFSZZHm0y9LQu(d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ wFVEMu7TsQXwoj6q9Th86qKAUMggIIyW) {
        field024.add(wFVEMu7TsQXwoj6q9Th86qKAUMggIIyW);
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

    public static /* bridge */ /* synthetic */ void jfrN64O2EcorL0Vn7ymH7OHSZvDtfBoZ(class_1511 class_15112, float KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, class_4587 X1thyUKf8DFukT6y6HltLOAYSt59B6gf, int miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, class_630 BeniDanYFEllZEBKiAROLA9KDiR8INnP, class_630 Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, Color gLy7VGjmp7FFXFNDn2f6xMJFcx8kIidW, boolean DUV2tJ0ryF4nQr1WrmsXSrbvwiBF5KAu, Color aJFAyj9XwgzFIvoQiFIhzcMHNTFMlfJx, Color zCqjwg0XCCmcSidQIdMyb4JiCfRgGIfk, boolean LIXxCfm25S3iBBVErXaOurgLEyJxj9if, boolean aZQJPDisrmnyFVNRrwsviSNy9OP1Og4u, Color JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb, boolean oa3HUdEwC6A4GWRJCanATehEejJ71QLY, float IgIrYy663o3O2yGFmTe9He4kKy0Y82AV, float E0JIBCM8tr7CfBLdj8i9nhsqIgg7QPGM, boolean p5b9U7IjFgjmgeYuFEZsYgwVnRTEoCkH, Color yCYg7gvNqXiXwXre2kA6Rn9r2auwId3W, SecureInterface0112 sABQFXdqAblZdh1e1MnwSexm6OL1juCu) {
        if (LIXxCfm25S3iBBVErXaOurgLEyJxj9if) {
            SecureClass0154.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575), () -> {
                RenderSystem.setShaderTexture((int)0, (class_2960)ChamsModule.kHvpP7nfS9piDQ3iTmffMpDCioSQOEpS);
                RenderSystem.enableBlend();
                RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.disableDepthTest();
                RenderSystem.setShader(class_757::method_34543);
                SecureClass0154.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(SecureClass0898.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(zCqjwg0XCCmcSidQIdMyb4JiCfRgGIfk));
            }, RenderSystem::defaultBlendFunc, J76fG850s08TrtZJvqP2ZlRCu8ol9Pae -> {}, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (oa3HUdEwC6A4GWRJCanATehEejJ71QLY) {
            SecureClass0154.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1575), () -> {
                RenderSystem.setShaderTexture((int)0, (class_2960)ChamsModule.UUmjtwfH4mrGiWNMcQnHCiTBFo81CbyJ);
                RenderSystem.enableBlend();
                RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
                RenderSystem.disableDepthTest();
                RenderSystem.setShader(class_757::method_34523);
                RenderSystem.setShaderGlintAlpha((float)((float)JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb.getAlpha() / 255.0f));
                SecureClass0154.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(SecureClass0898.cfr_renamed_224(SecureClass0898.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(JaKIpAghAkg7EjYqucEjrZ63wt1HqCGb), 1.0f));
                SecureClass0154.MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(0.16f * IgIrYy663o3O2yGFmTe9He4kKy0Y82AV, E0JIBCM8tr7CfBLdj8i9nhsqIgg7QPGM);
                SecureClass0154.XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc();
            }, () -> {
                SecureClass0154.cD5c5foD8g4JvEZljruDvicTFTkkVlE7();
                SecureClass0792.kU4Q7fJwHk5kp6ZYrTeJh9y0ga76HuW7.run();
                RenderSystem.defaultBlendFunc();
                RenderSystem.resetTextureMatrix();
            }, LOo7jj5aAvxeKl1MsJCKJrgNueZ5zNIX -> {}, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (aZQJPDisrmnyFVNRrwsviSNy9OP1Og4u) {
            SecureInterface0112 field062 = SecureInterface0112.LdvgfPZTaq52spkjsz4CAKXoEZPGlB3r();
            SecureClass0154.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576), () -> {
                RenderSystem.enableBlend();
                SecureClass0154.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
                RenderSystem.disableDepthTest();
                field062.cfr_renamed_225();
                field062.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(gLy7VGjmp7FFXFNDn2f6xMJFcx8kIidW);
            }, field062::cfr_renamed_226, P5UW5JqCpM8w6KqYq7fmYb6cJ1TT801h -> {
                if (DUV2tJ0ryF4nQr1WrmsXSrbvwiBF5KAu) {
                    SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(aJFAyj9XwgzFIvoQiFIhzcMHNTFMlfJx, P5UW5JqCpM8w6KqYq7fmYb6cJ1TT801h, X1thyUKf8DFukT6y6HltLOAYSt59B6gf);
                }
            }, class_15112, KJRnjQ6AAQQsSM1M0KviQGxJHfLBcdnG, X1thyUKf8DFukT6y6HltLOAYSt59B6gf, miV8yXuJOZ3N6vRLuTclZPA5J0O07sPY, BeniDanYFEllZEBKiAROLA9KDiR8INnP, Qi42aOAlCfSMRABSfDW4JwLGyhaxzJbC, true);
        }
        if (p5b9U7IjFgjmgeYuFEZsYgwVnRTEoCkH) {
            SecureClass0154.giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576), () -> {
                RenderSystem.enableBlend();
                SecureClass0154.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
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
            class_572.class_573 field063 = class_1007.method_4210((class_742)IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB, (class_1268)class_1268.field_5808);
            class_572.class_573 field064 = class_1007.method_4210((class_742)IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB, (class_1268)class_1268.field_5810);
            if (field063.method_30156()) {
                field064 = IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_6079().method_7960() ? class_572.class_573.field_3409 : class_572.class_573.field_3410;
                class_572.class_573 class_5732 = field064;
            }
            if (IhJ3eY5lTA9ncv1gju1FONyoGk8vwosB.method_6068() == class_1306.field_6183) {
                class_5913.field_3395 = field063;
                class_5913.field_3399 = field064;
            } else {
                class_5913.field_3395 = field064;
                class_5913.field_3399 = field063;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void v8A1el1LQTT9lWgmzayDcQpzlU1mxkEa(SecureClass0039 PVp9SMB5guQpEilf24IhHhZbnCoY7YFm, Color RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5, boolean ckM2EFZSkAVv5egA6wz41bSuQHOhtAkN, float f, Color AuCM4U2NGYeffaCsOXnVtHepQFs4OakL) {
        class_289 field065 = class_289.method_1348();
        RenderSystem.enableBlend();
        SecureClass0154.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.setShader(class_757::method_34539);
        RenderSystem.lineWidth((float)f);
        RenderSystem.setShaderColor((float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getRed() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getGreen() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getBlue() / 255.0f), (float)((float)RrDE4c5yDZZf2UiWLYOUsTCDZHnpjca5.getAlpha() / 255.0f));
        class_287 field066 = field065.method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        SecureClass0154.TERUzWX3UCysBpTEph01i0tLgw1ZiyCa(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.lhxEMxeLbC5z2CvLkikRZLPmaOdREbkm(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu());
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3447 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3400 = false;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().field_3396 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.YrztE7xrdGjEL0PXPH333dLS30NTHKYu().method_17087((class_1309)PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.lhxEMxeLbC5z2CvLkikRZLPmaOdREbkm(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().field_3654 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().field_3654 = 0.0f;
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().method_22698(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), (class_4588)field066, 0, 0);
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().method_22698(PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), (class_4588)field066, 0, 0);
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field066);
        if (ckM2EFZSkAVv5egA6wz41bSuQHOhtAkN) {
            PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ().field_3654 = 0.0f;
            PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza().field_3654 = 0.0f;
            Runnable field067 = () -> RenderSystem.setShader(class_757::method_34535);
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(AuCM4U2NGYeffaCsOXnVtHepQFs4OakL, PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ER90JCfjyR6GJmFZTXZaxxGBtFyhHPEJ(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), f, field067);
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(AuCM4U2NGYeffaCsOXnVtHepQFs4OakL, PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ApasSAmAaKopJXFHk4xEQs98WeIfmYza(), PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.UHsBf0gZmOYhOGo5AkTqRWxER7GsgCkX(), f, field067);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        PVp9SMB5guQpEilf24IhHhZbnCoY7YFm.ROqktk0YuTHtTMuAPVVe0RjtMO5q1WEq(true);
    }

    public static /* bridge */ /* synthetic */ void fONoP6LrzRqR4iSGagdpAO7pfZC2anF4(SecureClass1098 y9slYn24ihUaoKCho6lAUqvB8kKhJKoy, List<xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE> RjFfvmOQfXDBGT40UTwDflctbYH4SrlF, float G1vzRo6oDIlZNpARNINuvKZznqLYcKUG, long iwloZLrZn3zAFosZQ28n0tdAte3A6unD, long otbfodgxhbbZobxM1xiJ6twO6RJKbYVw) {
        class_287 field068 = SecureClass0154.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(G1vzRo6oDIlZNpARNINuvKZznqLYcKUG, true, () -> RenderSystem.setShader(class_757::method_34535));
        Iterator<xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE> iterator = RjFfvmOQfXDBGT40UTwDflctbYH4SrlF.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(field068, true);
                return;
            }
            xxfmotcmJnTa2DnqsmA8e8AEMvDxmQgE field069 = iterator.next();
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().ro7y5SwfOdUbmCbdyXODcSDem24A1gCl(field069.QiFogcmhC3KKIaq4OFlP2ElixOKUEpiZ);
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().ro7y5SwfOdUbmCbdyXODcSDem24A1gCl(field069.NCEtseCiQAENeO7exePJWPIbBhmGsy98);
            if (iwloZLrZn3zAFosZQ28n0tdAte3A6unD != 0L) {
                float field070 = (float)field069.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj.getAlpha() / 255.0f * 255.0f;
                float field071 = field070 / (float)iwloZLrZn3zAFosZQ28n0tdAte3A6unD;
                float field072 = (float)class_3532.method_15340((int)((int)(field071 * (float)(otbfodgxhbbZobxM1xiJ6twO6RJKbYVw + iwloZLrZn3zAFosZQ28n0tdAte3A6unD - System.currentTimeMillis()))), (int)0, (int)((int)field070)) / 255.0f;
                Color field073 = SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(field069.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj, field072);
                y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.cfr_renamed_227().cfr_renamed_228(field073);
                SecureClass0154.cfr_renamed_229(field068, y9slYn24ihUaoKCho6lAUqvB8kKhJKoy);
                continue;
            }
            y9slYn24ihUaoKCho6lAUqvB8kKhJKoy.cfr_renamed_227().cfr_renamed_228(field069.CUZI6SbYZe4idhTmXrASySuOVSAJKuvj);
            SecureClass0154.cfr_renamed_229(field068, y9slYn24ihUaoKCho6lAUqvB8kKhJKoy);
        }
    }

    public static /* bridge */ /* synthetic */ void btlBfaM6PaYa0D6Vknp5osohZCQ0ctBW(class_1657 dOJZtwqWbfAZQOpIYg6y4r0jl9DjRLn1, class_583<class_1657> u0J0FjBygw9eJZRy8mUA4FQTwg4DrjM4, long WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b, SecureClass0603<Color> wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5, SecureClass0603<Long> sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN, SecureClass0603<Boolean> xJOnewUxHXAWiCgtzeN23sVQj8iiuwdi, SecureClass0603<Color> g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2, SecureClass0603<Float> LGA41xjZo7c2Gct8kfaCiF0T13ok7FhE, float gfiTkfYjGQy4QcMqCJGnYb4phBk92erD, Consumer<h051oGnfbeVHvnLJ3029aut39JqYeo9d> consumer) {
        float field074 = wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5.getValue().getAlpha();
        float field075 = g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2.getValue().getAlpha();
        float field076 = field074 / (float)sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue().longValue();
        float field077 = field075 / (float)sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue().longValue();
        int field078 = class_3532.method_15340((int)((int)(field076 * (float)(WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b + sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue() - System.currentTimeMillis()))), (int)0, (int)((int)field074));
        int field079 = class_3532.method_15340((int)((int)(field077 * (float)(WWtuA6Vw3d1VrlEa711uwuqcoTlpih4b + sRVoCpE7zLxNXsLiha8DylBlEG4Cb3YN.getValue() - System.currentTimeMillis()))), (int)0, (int)((int)field075));
        Color field080 = SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(wgPSDcLyKPY2JNAAYa6shlB48VL1fpq5.getValue(), (float)field078 / 255.0f);
        Color field081 = SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs2.getValue(), (float)field079 / 255.0f);
        rqMpas6hBytDXGfoySMj6f99n3vu3sut field082 = h051oGnfbeVHvnLJ3029aut39JqYeo9d.KEDPhkzfIAD22SQKDGRt2fH4l1ts3xUn().cfr_renamed_221(u0J0FjBygw9eJZRy8mUA4FQTwg4DrjM4).ozXWsgE44AfkIAJUceDyteW4t9vTe9Qw(dOJZtwqWbfAZQOpIYg6y4r0jl9DjRLn1).l8y1amLiVL3QzoCSoZBMzvWQkGUZSl47(field080, field081).SeuqqFyGHNBVZWxxWz5Ppku74hd69Uwl(gfiTkfYjGQy4QcMqCJGnYb4phBk92erD);
        if (xJOnewUxHXAWiCgtzeN23sVQj8iiuwdi.getValue().booleanValue()) {
            field082.KKCrRfWJm6qf5a7bkSfV78gVniuE80w9(LGA41xjZo7c2Gct8kfaCiF0T13ok7FhE.getValue().floatValue());
        }
        h051oGnfbeVHvnLJ3029aut39JqYeo9d field083 = field082.cfr_renamed_222();
        consumer.accept(field083);
        SecureClass0154.field039.add(field083);
    }

    public static /* bridge */ /* synthetic */ void giwm2kWWpZQqhJ0JU1qv2iojj3q1e1Oa(class_287 B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, Runnable T5XHk21VwWEKeDUzJZtEBM3kvd96OSnI, Runnable Yn5s6p2VsCcNbkHbDW6xtHF4qxuqc9BJ, Consumer<class_630> Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL, class_1511 o3sNW28O61pw0sszVGuu1f7fW001IcTg, float RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU, class_4587 jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, int pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, class_630 CnGV2lb4skyWH5PIuU2WeIqTuAiU55Se, class_630 x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK, boolean YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
        float field084 = ChamsModule.cfr_renamed_230;
        int field085 = class_4608.field_21444;
        T5XHk21VwWEKeDUzJZtEBM3kvd96OSnI.run();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22903();
        float field086 = SecureClass0154.cfr_renamed_30(o3sNW28O61pw0sszVGuu1f7fW001IcTg, RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU);
        float f = AnimationsModule.QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(((float)o3sNW28O61pw0sszVGuu1f7fW001IcTg.field_7034 + RqkwyCmPyQSjgF9iCTnG1DdYSC717BzU) * 3.0f);
        float field087 = 0.875f;
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22903();
        float f2 = AnimationsModule.YTtqj7VidmuGs4JuKjlLIsMLqagxU8W2();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(f2, f2, f2);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_46416(0.0f, -0.5f, 0.0f);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_46416(0.0f, 1.5f + field086 / 2.0f, 0.0f);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field084, 0.0f, field084));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, field085);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(field087, field087, field087);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field084, 0.0f, field084));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, field085);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22905(field087, field087, field087);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(new Quaternionf().setAngleAxis(1.0471976f, field084, 0.0f, field084));
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22907(class_7833.field_40716.rotationDegrees(f));
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            CnGV2lb4skyWH5PIuU2WeIqTuAiU55Se.method_22698(jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv, (class_4588)B4fBGHShE248nGrXrOHXaFMrKQgJSXu9, pv1FTduVdfkaYCZ7pjX2IRAL7IDqtqNO, field085);
        }
        Tv8ZaKAjOC7Z0mYauwx5hnPvt57DHoFL.accept(x8TNfLFXv6vVCqBvQ3rpz5iuGntA3KyK);
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22909();
        jqqXotdjVcbs0G8TugTTsIVEAIUmVmJv.method_22909();
        if (YWe4kXZr4mUvJUkUpiTzwkHtCvBFMO3Y) {
            SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(B4fBGHShE248nGrXrOHXaFMrKQgJSXu9);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
        Yn5s6p2VsCcNbkHbDW6xtHF4qxuqc9BJ.run();
    }

    public static /* bridge */ /* synthetic */ String ZZfCtAa83lPIMnaGGRkxeUC3NQNXClJR(int n2) {
        return IntStream.range(0, n2).mapToObj(n -> String.valueOf((char)field032.nextInt(97, 123))).collect(Collectors.joining());
    }

    public static /* bridge */ /* synthetic */ class_2960 cfr_renamed_231() {
        return class_2960.method_60655((String)"phoboslite", (String)("temp/" + SecureClass0154.ZZfCtAa83lPIMnaGGRkxeUC3NQNXClJR(32)));
    }

    public static /* bridge */ /* synthetic */ void g8RuHPNG8npDx0KxR5cnCCH0V8yqs6Bw(class_287 Vwb5pevmGjILyTiEwGAQDal2DQie3KMC, SecureClass1098 qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, double al2IW6uwJGWUuxcmC8qGvrwY5otwstut, double sDzibCAuMEeAFEWJnVcin1NHwlTkp02V, double jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin, double d, double kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7, double JpkS6939fU6Sx584eBextU5c7t6kkzQ2) {
        double field088 = d - al2IW6uwJGWUuxcmC8qGvrwY5otwstut;
        double d2 = kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7 - sDzibCAuMEeAFEWJnVcin1NHwlTkp02V;
        double field089 = JpkS6939fU6Sx584eBextU5c7t6kkzQ2 - jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin;
        double field090 = class_3532.method_15355((float)((float)(field088 * field088 + d2 * d2 + field089 * field089)));
        float field091 = (float)(field088 / field090);
        float field092 = (float)(d2 / field090);
        float f = (float)(field089 / field090);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(Vwb5pevmGjILyTiEwGAQDal2DQie3KMC, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)al2IW6uwJGWUuxcmC8qGvrwY5otwstut, (float)sDzibCAuMEeAFEWJnVcin1NHwlTkp02V, (float)jVArlPugZNEGtpRaUbCNmJdJzdGo1Iin, (float)d, (float)kCuB9BqiDlMKG2cUjJ2uDivYCBxVUrd7, (float)JpkS6939fU6Sx584eBextU5c7t6kkzQ2, (float)field091, (float)field092, (float)f);
    }

    public static /* bridge */ /* synthetic */ <T extends class_1309, M extends class_583<T>> void HrDrquSJP0Y7LXhblMaynYxgoNUKubch(class_4587 class_45872, T t, M m, List<class_3887<T, M>> list, float Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, int ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, Color field095, boolean I6EXOpxYCCZupagl2pW4fm2hcorUUsuO, Color field096, boolean bl, Color gnNIaXSjJtSh4cFP7XVD66MA0UlSBpy3, boolean f3SgXTDAHdz1mtAXey6EswCUZ2fmrieP, boolean liMOx1hzfCQ88twZvuPJqoo5BYqtpMbQ, boolean PRcoBSycG9b0xQyY2igXODUeXBdyxL21, boolean LQVGzm2gpwmlayXzkll7qmtfwXQ2UbKc, Color color, boolean B0nBv091vBpZdFpQ5KFWFzkoKOYY6UxE, float Zy71WovKgL7hOBeUaFgv7CTNxspshp3q, float bXIj2RoJNRIfaSMk4H9vLlYnq95G1IFX, boolean vTb0HsSxyBXYPrTDCcpUwKtORjzz5ULP, Color color2, SecureInterface0112 sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN) {
        class_2350 field093;
        class_1297 class_12972;
        SecureClass0506 field094 = ((ILivingEntity)t).getGhostModel();
        field095 = field094 != null ? SecureClass0898.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(field095, field094.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : field095;
        field096 = field094 != null ? SecureClass0898.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(field096, field094.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : field096;
        color = field094 != null ? SecureClass0898.OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(color, field094.pKYundlKgFLWay2xXx0c8IRBrJNupsBZ()) : color;
        class_289 field097 = class_289.method_1348();
        class_45872.method_22903();
        m.field_3447 = t.method_6055(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        m.field_3449 = t.method_5765();
        m.field_3448 = t.method_6109();
        float f = class_3532.method_17821((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_6220, (float)t.field_6283);
        float field098 = class_3532.method_16439((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_6259, (float)t.field_6241);
        float field099 = t.method_5695(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        float field100 = field098 - f;
        if (t.method_5765() && (class_12972 = t.method_5854()) instanceof class_1309) {
            class_1309 field101 = (class_1309)class_12972;
            f = class_3532.method_17821((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)field101.field_6220, (float)field101.field_6283);
            field100 = field098 - f;
            float field102 = class_3532.method_15393((float)field100);
            if (field102 < -85.0f) {
                field102 = -85.0f;
            }
            if (field102 >= 85.0f) {
                field102 = 85.0f;
            }
            f = field098 - field102;
            if (field102 * field102 > 2500.0f) {
                f += field102 * 0.2f;
            }
            field100 = field098 - f;
        }
        float field103 = class_3532.method_16439((float)Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, (float)t.field_5982, (float)t.method_36454());
        if (class_922.method_38563(t)) {
            field103 *= -1.0f;
            field100 *= -1.0f;
        }
        if (t.method_41328(class_4050.field_18078) && (field093 = t.method_18401()) != null) {
            float field104 = t.method_18381(class_4050.field_18076) - 0.1f;
            class_45872.method_46416((float)(-field093.method_10148()) * field104, 0.0f, (float)(-field093.method_10165()) * field104);
        }
        float field105 = t.method_55693();
        class_45872.method_22905(field105, field105, field105);
        float field106 = (float)t.field_6012 + Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d;
        class_742 field107 = (class_742)t;
        SecureClass0154.GnOWsNqrVLv58SkCiy9y0j395WKhAhgN(field107, class_45872, field106, f, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, field105);
        class_45872.method_22905(-1.0f, -1.0f, 1.0f);
        class_45872.method_22905(0.9375f, 0.9375f, 0.9375f);
        class_45872.method_46416(0.0f, -1.501f, 0.0f);
        float field108 = 0.0f;
        float field109 = 0.0f;
        if (!t.method_5765() && t.method_5805()) {
            field108 = t.field_42108.method_48570(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
            field109 = t.field_42108.method_48572(Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
            if (t.method_6109()) {
                field109 *= 3.0f;
            }
            if (field108 > 1.0f) {
                field108 = 1.0f;
            }
        }
        m.method_2816(t, field109, field108, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d);
        m.method_2819(t, field109, field108, field106, field100, field099);
        int field110 = class_922.method_23622(t, (float)0.0f);
        if (f3SgXTDAHdz1mtAXey6EswCUZ2fmrieP) {
            RenderSystem.enableBlend();
            RenderSystem.setShaderTexture((int)0, (class_2960)ChamsModule.kHvpP7nfS9piDQ3iTmffMpDCioSQOEpS);
            RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader(class_757::method_34543);
            SecureClass0154.byvGGwYNlqTStewXwM0sAiU9YjR26Bas(SecureClass0898.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(ChamsModule.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(field107, gnNIaXSjJtSh4cFP7XVD66MA0UlSBpy3)));
            class_287 field111 = field097.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            m.method_60879(class_45872, (class_4588)field111, ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, field110);
            SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field111);
            RenderSystem.defaultBlendFunc();
            RenderSystem.resetTextureMatrix();
        }
        if (B0nBv091vBpZdFpQ5KFWFzkoKOYY6UxE) {
            RenderSystem.enableBlend();
            RenderSystem.setShaderTexture((int)0, (class_2960)ChamsModule.UUmjtwfH4mrGiWNMcQnHCiTBFo81CbyJ);
            RenderSystem.blendFuncSeparate((GlStateManager.class_4535)GlStateManager.class_4535.SRC_COLOR, (GlStateManager.class_4534)GlStateManager.class_4534.ONE, (GlStateManager.class_4535)GlStateManager.class_4535.ZERO, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.ONE, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            RenderSystem.disableCull();
            RenderSystem.disableDepthTest();
            RenderSystem.setShader(class_757::method_34523);
            RenderSystem.setShaderGlintAlpha((float)((float)color.getAlpha() / 255.0f));
            SecureClass0154.cfr_renamed_232(ChamsModule.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(field107, SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(color, 1.0f)));
            SecureClass0154.MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(0.16f * Zy71WovKgL7hOBeUaFgv7CTNxspshp3q, bXIj2RoJNRIfaSMk4H9vLlYnq95G1IFX);
            SecureClass0154.XaEJpZcGvJBwrhSFyb3PXdiH9qBTaalc();
            class_287 field112 = field097.method_60827(class_293.class_5596.field_27382, class_290.field_1575);
            m.method_60879(class_45872, (class_4588)field112, ieG1Jnto4hcn2juDSQSO2SYNI0h5eL9p, field110);
            SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field112);
            SecureClass0154.cD5c5foD8g4JvEZljruDvicTFTkkVlE7();
            SecureClass0792.kU4Q7fJwHk5kp6ZYrTeJh9y0ga76HuW7.run();
            RenderSystem.defaultBlendFunc();
            RenderSystem.resetTextureMatrix();
        }
        if (liMOx1hzfCQ88twZvuPJqoo5BYqtpMbQ) {
            SecureInterface0112 field113 = SecureInterface0112.LdvgfPZTaq52spkjsz4CAKXoEZPGlB3r();
            RenderSystem.enableBlend();
            SecureClass0154.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
            RenderSystem.disableCull();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.disableDepthTest();
            field113.cfr_renamed_225();
            field113.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(ChamsModule.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(field107, field095));
            class_287 field114 = field097.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            m.method_60879(class_45872, (class_4588)field114, 0, 0);
            SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field114);
            field113.cfr_renamed_226();
            if (I6EXOpxYCCZupagl2pW4fm2hcorUUsuO) {
                class_572 field115 = (class_572)m;
                Color field116 = ChamsModule.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(field107, field096);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_3398, class_45872);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_3391, class_45872);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_27433, class_45872);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_3397, class_45872);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_3401, class_45872);
                SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, field115.field_3392, class_45872);
                if (PRcoBSycG9b0xQyY2igXODUeXBdyxL21 && !field107.method_7325() && field115 instanceof class_591) {
                    class_591 field117 = (class_591)field115;
                    SecureClass0154.lIy7GlFgIWRMbJgZ3tTxMMQAaUcxv1iF(field117, () -> {
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3394, class_45872);
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3483, class_45872);
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3486, class_45872);
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3479, class_45872);
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3484, class_45872);
                        SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(field116, dZXcvm8qncnIy3oKu8DxNatERerhopL7.field_3482, class_45872);
                    });
                }
            }
        }
        if (vTb0HsSxyBXYPrTDCcpUwKtORjzz5ULP) {
            RenderSystem.enableBlend();
            SecureClass0154.CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk();
            RenderSystem.disableCull();
            RenderSystem.depthMask((boolean)false);
            RenderSystem.disableDepthTest();
            sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN.cfr_renamed_225();
            sMcBed2wkK3DDPzxCeKVuAbvjbFnh9yN.QhrjVbpyD6RovkGQMxcW0ZQwTdMB8t5M(ChamsModule.qPnSBy9Ri8REOsgo4ClygnwlHUUqL654(field107, color2));
            class_287 field118 = field097.method_60827(class_293.class_5596.field_27382, class_290.field_1576);
            m.method_60879(class_45872, (class_4588)field118, 0, 0);
            SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field118);
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        RenderSystem.depthMask((boolean)true);
        if (!t.method_7325() && bl) {
            RenderSystem.disableDepthTest();
            for (class_3887<T, M> Y8Mb4clboCRNIqhu3ou3MAXVARi9wNv0 : list) {
                Y8Mb4clboCRNIqhu3ou3MAXVARi9wNv0.method_4199(class_45872, (class_4597)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22940().method_23000(), field110, t, field109, field108, Hur1CUbSklFnTIQjvcv1pV4WEz7Qga8d, field106, field100, field099);
            }
            RenderSystem.enableDepthTest();
        }
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_30(class_1511 V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t, float Qf2Z3DN4ZM94XeU0RwcOED76TfI31SeX) {
        float field119 = (float)V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t.field_7034 + Qf2Z3DN4ZM94XeU0RwcOED76TfI31SeX;
        float field120 = class_3532.method_15374((float)(field119 * 0.2f)) / AnimationsModule.RwhidMckdx4lajUfQTr3nNv6v2XkfvTt(V9J2Nx9tDxhWjwIdJ5Lp6i5JhACSOl6t) + 0.5f;
        field120 = (field120 * field120 + field120) * 0.4f;
        return AnimationsModule.j8sCUn4q9LdqmZM3wfHGUoSep4qFhfg6(field120) - 1.4f;
    }

    public static /* bridge */ /* synthetic */ void ndSkyUeagW5UOcaIZzeg4WqsqQC6YWgM(class_4587 XI8xW7qvJo8tLKN264IMYFgBpdP5OGYi, class_1657 mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7, class_583<class_1657> class_5832, h051oGnfbeVHvnLJ3029aut39JqYeo9d BMoLcbfcRG50IqEStVZFUeaHpXzOXCv6, float gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, Color bUNiNdAvr4AjY2UxsUi37VJtTDT2MKWw, boolean GCWs1x0UABMSVrt3DVyvh66M6b1NC5QF, Color color, float FW6VBKfASXrf5QsgRHa8c2mf9U6z90td) {
        class_243 field121 = SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19326();
        double field122 = field121.field_1352;
        double field123 = field121.field_1351;
        double field124 = field121.field_1350;
        float field125 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false);
        double d = class_3532.method_16436((double)field125, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_6038, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23317());
        double field126 = class_3532.method_16436((double)field125, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5971, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23318());
        double field127 = class_3532.method_16436((double)field125, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5989, (double)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_23321());
        float field128 = class_3532.method_16439((float)gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, (float)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.field_5982, (float)mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7.method_36454());
        SecureClass0154.ae6M1kMUmKpf3o0blyrfRcczKuaK1AxO(XI8xW7qvJo8tLKN264IMYFgBpdP5OGYi, mf28gPnkEWYRoZOOKIyLyY4ZQ68x9Ks7, class_5832, BMoLcbfcRG50IqEStVZFUeaHpXzOXCv6, d - field122, field126 - field123, field127 - field124, field128, gSltJ7zoFeVyEvYADMW9frezCvzy6XBq, bUNiNdAvr4AjY2UxsUi37VJtTDT2MKWw, color, GCWs1x0UABMSVrt3DVyvh66M6b1NC5QF, FW6VBKfASXrf5QsgRHa8c2mf9U6z90td);
    }

    public static /* bridge */ /* synthetic */ void AUnoM8PGu7OjXsa0WVWoaW38ikFKSCBk(class_287 H2BDaME3FDRCV12EAc0effxJNIt7Muk0, SecureClass1098 XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg) {
        field019.WEpNOrFWC0YajkJ8Tn2HGaRavrgUPMWq(XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.p4B7ehAlTx5ueRNHmBVHqGdwVPysxATS());
        field019.jT5crBqOQKokkMgPkqqYCiHLbzyXMV4K(-field013.renderPosX(), -field013.renderPosY(), -field013.renderPosZ());
        Matrix4f field129 = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760().method_23761();
        float field130 = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().DWYuMlx7vDaNUBsynkUgzceREo5fafgS();
        float field131 = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD();
        float field132 = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy();
        float f = XaDQ1QY53dLxvukDR6IIF8VCNwywxvwg.IpqZglxBhjVMCEpYDMsD30bHhL4VOQ0W().JY2LnMKCH1LUoYsm4h199XOCZsDv07wN();
        float f2 = (float)field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7();
        float f3 = (float)field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E();
        float field133 = (float)field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp();
        float field134 = (float)field019.cfr_renamed_233();
        float field135 = (float)field019.cfr_renamed_234();
        float field136 = (float)field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l();
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, field135, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field133).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, field134, f3, field136).method_22915(field130, field131, field132, f);
        H2BDaME3FDRCV12EAc0effxJNIt7Muk0.method_22918(field129, f2, f3, field136).method_22915(field130, field131, field132, f);
    }

    public static /* bridge */ /* synthetic */ void ae6M1kMUmKpf3o0blyrfRcczKuaK1AxO(class_4587 a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, class_1657 q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, class_583<class_1657> class_5832, h051oGnfbeVHvnLJ3029aut39JqYeo9d Ya1JmDgNYAZBsglOtarNqwV6zDmecvph, double GxnfssqVhM1TCznmOPgKPLjDt9OLtXu6, double Wdscx8oZije9GsfVWsUaKs8ERfTKGPyB, double LGVxkLrteyNCXGHNYffFAkaaYZeVCYwQ, float HqBuvhzstpN0sZEkNFZkSNywkWej8p0V, float XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, Color rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE, Color DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, boolean qZtjm2TihFTk9kmacJI6fwMZxz5OoRL5, float f) {
        class_2350 field137;
        class_1297 class_12972;
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22903();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22904(GxnfssqVhM1TCznmOPgKPLjDt9OLtXu6, Wdscx8oZije9GsfVWsUaKs8ERfTKGPyB, LGVxkLrteyNCXGHNYffFAkaaYZeVCYwQ);
        class_289 field138 = class_289.method_1348();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.disableCull();
        RenderSystem.disableDepthTest();
        Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.GTUwZ4tEfCj6WbmeEyABdjKep1DfIup4().run();
        RenderSystem.lineWidth((float)f);
        class_287 field139 = field138.method_60827(class_293.class_5596.field_27382, class_290.field_1592);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22903();
        RenderSystem.setShaderColor((float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getRed() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getGreen() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getBlue() / 255.0f), (float)((float)rkQvYRcUNeaRe7M0TGVznexIJbO9RXcE.getAlpha() / 255.0f));
        class_5832.field_3447 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6055(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        class_5832.field_3449 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765();
        class_5832.field_3448 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6109();
        float field140 = class_3532.method_17821((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6220, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6283);
        float f2 = class_3532.method_16439((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6259, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6241);
        float field141 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5695(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        float f3 = f2 - field140;
        if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765() && (class_12972 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5854()) instanceof class_1309) {
            class_1309 field142 = (class_1309)class_12972;
            field140 = class_3532.method_17821((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)field142.field_6220, (float)field142.field_6283);
            f3 = f2 - field140;
            float field143 = class_3532.method_15393((float)f3);
            if (field143 < -85.0f) {
                field143 = -85.0f;
            }
            if (field143 >= 85.0f) {
                field143 = 85.0f;
            }
            field140 = f2 - field143;
            if (field143 * field143 > 2500.0f) {
                field140 += field143 * 0.2f;
            }
            f3 = f2 - field140;
        }
        float field144 = class_3532.method_16439((float)XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_5982, (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_36454());
        if (class_922.method_38563((class_1309)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS)) {
            field144 *= -1.0f;
            f3 *= -1.0f;
        }
        if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_41328(class_4050.field_18078) && (field137 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_18401()) != null) {
            float field145 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_18381(class_4050.field_18076) - 0.1f;
            a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_46416((float)(-field137.method_10148()) * field145, 0.0f, (float)(-field137.method_10165()) * field145);
        }
        float field146 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_55693();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(field146, field146, field146);
        float field147 = (float)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_6012 + XcJHSlGkQf7px75BkpVE2xODQTqUCRkS;
        SecureClass0154.UiZDT7jDJAiZJ4aW5LPEcmGokm5WdhBA(q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, field147, field140, XcJHSlGkQf7px75BkpVE2xODQTqUCRkS, field146);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(-1.0f, -1.0f, 1.0f);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22905(0.9375f, 0.9375f, 0.9375f);
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_46416(0.0f, -1.501f, 0.0f);
        float f4 = 0.0f;
        float field148 = 0.0f;
        if (!q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5765() && q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_5805()) {
            f4 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_42108.method_48570(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
            field148 = q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.field_42108.method_48572(XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
            if (q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS.method_6109()) {
                field148 *= 3.0f;
            }
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
        }
        class_5832.method_2816((class_1297)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, field148, f4, XcJHSlGkQf7px75BkpVE2xODQTqUCRkS);
        class_5832.method_2819((class_1297)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, field148, f4, field147, f3, field141);
        int field149 = class_922.method_23622((class_1309)q9mJwrBveb6NXm9gXLBLCJ0pVZcArLCS, (float)0.0f);
        class_5832.method_60879(a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, (class_4588)field139, 0, field149);
        SecureClass0158.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(field139);
        if (qZtjm2TihFTk9kmacJI6fwMZxz5OoRL5 && class_5832 instanceof class_572) {
            class_572 field150 = (class_572)class_5832;
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_3391, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_27433, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_3397, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_3401, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_3392, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(DkfBgrLN7chVumWH5BkbfO2NRjFP14Vx, field150.field_3398, a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR, f, Ya1JmDgNYAZBsglOtarNqwV6zDmecvph.Q7KlQZWwhCayPytWAHLNURRUQ3C7tCRZ());
        }
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        RenderSystem.disableBlend();
        RenderSystem.enableCull();
        RenderSystem.enableDepthTest();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22909();
        a92NtWgOh5xB8fOSw5bX9UMWdBW5bnTR.method_22909();
    }

    public static /* bridge */ /* synthetic */ void MyeeIo7L6oIR8Ml7lXhlVkxeCDFtPCDV(float LtvEnPLKyHE7A5pyZRurfXuVzLyIUr2e, double d) {
        long field151 = (long)((double)class_156.method_658() * d * 8.0);
        float field152 = (float)(field151 % 110000L) / 110000.0f;
        float field153 = (float)(field151 % 30000L) / 30000.0f;
        Matrix4f field154 = new Matrix4f().translation(-field152, field153, 0.0f);
        field154.rotateZ(0.17453292f).scale(LtvEnPLKyHE7A5pyZRurfXuVzLyIUr2e);
        RenderSystem.setTextureMatrix((Matrix4f)field154);
    }

    public static /* bridge */ /* synthetic */ void wyZCAkZkf114bSyhZRlqPrH7JHlnIHSe(@NonNull class_2960 EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, @NonNull BufferedImage hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd) {
        if (EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx == null) {
            throw new NullPointerException("i is marked non-null but is null");
        }
        if (hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd == null) {
            throw new NullPointerException("bi is marked non-null but is null");
        }
        try {
            int field155 = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getWidth();
            int field156 = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getHeight();
            class_1011 field157 = new class_1011(class_1011.class_1012.field_4997, field155, field156, false);
            long field158 = ((INativeImage)field157).getPointer();
            IntBuffer field159 = MemoryUtil.memIntBuffer(field158, field157.method_4307() * field157.method_4323());
            WritableRaster field160 = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getRaster();
            ColorModel field161 = hJNznMfGv8IOhQ0phYH3q7dS5ur8ihEd.getColorModel();
            int field162 = field160.getNumBands();
            int field163 = field160.getDataBuffer().getDataType();
            Object[] field164 = switch (field163) {
                case 0 -> new byte[field162];
                case 1 -> (Object[])new short[field162];
                case 3 -> (Object[])new int[field162];
                case 4 -> (Object[])new float[field162];
                case 5 -> (Object[])new double[field162];
                default -> throw new IllegalArgumentException("Unknown data buffer type: " + field163);
            };
            for (int yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF = 0; yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF < field156; ++yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF) {
                for (int DMi8OZE80Gl1mBQPVI0selSWjluzcg9l = 0; DMi8OZE80Gl1mBQPVI0selSWjluzcg9l < field155; ++DMi8OZE80Gl1mBQPVI0selSWjluzcg9l) {
                    field160.getDataElements(DMi8OZE80Gl1mBQPVI0selSWjluzcg9l, yNmuqrnvZcJeBQg6QZcpJJ9114LTTqZF, field164);
                    int field165 = field161.getAlpha(field164);
                    int field166 = field161.getRed(field164);
                    int field167 = field161.getGreen(field164);
                    int field168 = field161.getBlue(field164);
                    int field169 = field165 << 24 | field168 << 16 | field167 << 8 | field166;
                    field159.put(field169);
                }
            }
            class_1043 field170 = new class_1043(field157);
            field170.method_4524();
            if (RenderSystem.isOnRenderThread()) {
                class_310.method_1551().method_1531().method_4616(EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, (class_1044)field170);
            } else {
                RenderSystem.recordRenderCall(() -> class_310.method_1551().method_1531().method_4616(EAoBVGhs7Uv9gG7uhdRhmvFiQJOeyMsx, (class_1044)field170));
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_229(class_287 kz7myw2zwrpzpIHDCYh32l9FE8t3SOTt, SecureClass1098 QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj) {
        double d = field013.renderPosX();
        double field171 = field013.renderPosY();
        double d2 = field013.renderPosZ();
        double field172 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().E2JwVcGQXFPR75wmLRqiwquhfytFPzE0() - d;
        double d3 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().zllUUE8Sv3ld1VsWnm7uCC5sHdYVauWE() - field171;
        double field173 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.mI1pm1r2QMRu5daZe3t91D2k489Zu6JF().vJvL9HpUXgAicgNZThxxAaFttWkHlAcT() - d2;
        double field174 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().E2JwVcGQXFPR75wmLRqiwquhfytFPzE0() - d;
        double field175 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().zllUUE8Sv3ld1VsWnm7uCC5sHdYVauWE() - field171;
        double field176 = QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj.vRwPfKMEjVAECERY67AEGlmcOAgDhJt3().vJvL9HpUXgAicgNZThxxAaFttWkHlAcT() - d2;
        SecureClass0154.g8RuHPNG8npDx0KxR5cnCCH0V8yqs6Bw(kz7myw2zwrpzpIHDCYh32l9FE8t3SOTt, QBF7zjkiFbMeK4B9EmyM2FpvOshoSvyj, field172, d3, field173, field174, field175, field176);
    }

    @NotNull
    public static /* bridge */ /* synthetic */ class_1043 CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(@NotNull BufferedImage cFVibef4ejetSXbIg6qBscGsUSh2cF1g) {
        int field177 = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getWidth();
        int field178 = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getHeight();
        class_1011 field179 = new class_1011(class_1011.class_1012.field_4997, field177, field178, false);
        long field180 = ((INativeImage)field179).getPointer();
        IntBuffer field181 = MemoryUtil.memIntBuffer(field180, field179.method_4307() * field179.method_4323());
        WritableRaster field182 = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getRaster();
        ColorModel field183 = cFVibef4ejetSXbIg6qBscGsUSh2cF1g.getColorModel();
        int field184 = field182.getNumBands();
        int field185 = field182.getDataBuffer().getDataType();
        Object[] field186 = switch (field185) {
            case 0 -> new byte[field184];
            case 1 -> (Object[])new short[field184];
            case 3 -> (Object[])new int[field184];
            case 4 -> (Object[])new float[field184];
            case 5 -> (Object[])new double[field184];
            default -> throw new IllegalArgumentException("Unknown data buffer type: " + field185);
        };
        int field187 = 0;
        while (true) {
            if (field187 >= field178) {
                class_1043 field188 = new class_1043(field179);
                P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> ((class_1043)field188).method_4524());
                return field188;
            }
            for (int b1AdendDToSRZUyBpCxGbemTbqBnda5k = 0; b1AdendDToSRZUyBpCxGbemTbqBnda5k < field177; ++b1AdendDToSRZUyBpCxGbemTbqBnda5k) {
                field182.getDataElements(b1AdendDToSRZUyBpCxGbemTbqBnda5k, field187, field186);
                int field189 = field183.getAlpha(field186);
                int field190 = field183.getRed(field186);
                int field191 = field183.getGreen(field186);
                int field192 = field183.getBlue(field186);
                int field193 = field189 << 24 | field192 << 16 | field191 << 8 | field190;
                field181.put(field193);
            }
            ++field187;
        }
    }

    public static /* bridge */ /* synthetic */ void CqpHJmtvxcgCv74YtZiSbqjdBvSmDdXk() {
        if (ChamsModule.czSmuZyGzIuiaEGi9SNqZN5DCDiKhBuv()) {
            RenderSystem.blendFunc((GlStateManager.class_4535)GlStateManager.class_4535.SRC_ALPHA, (GlStateManager.class_4534)GlStateManager.class_4534.ONE);
            return;
        }
        RenderSystem.defaultBlendFunc();
    }

    public static /* bridge */ /* synthetic */ class_287 K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(float mWMgTKWnoFdpVUUq2aQtwcDZ507vKPug, boolean CyFngZpQQM0XuE7shLo57QxxiLGrdpif, Runnable C3lwhvy2S9baMQ79JYpCjdEDB52Xc4hx) {
        SecureClass0154.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(CyFngZpQQM0XuE7shLo57QxxiLGrdpif);
        RenderSystem.lineWidth((float)mWMgTKWnoFdpVUUq2aQtwcDZ507vKPug);
        C3lwhvy2S9baMQ79JYpCjdEDB52Xc4hx.run();
        return class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
    }

    public static /* bridge */ /* synthetic */ class_243 QJbiOwJE1QrJzYjfzCIDPyOBAKgNU9h1(class_243 Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto) {
        class_310 field194 = class_310.method_1551();
        return new class_243(Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1352 - field194.method_1561().field_4686.method_19326().field_1352, Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1351 - field194.method_1561().field_4686.method_19326().field_1351, Mzhmk1HKbCL9aZhKsTwuFBAGiINzPbto.field_1350 - field194.method_1561().field_4686.method_19326().field_1350);
    }

    public static /* bridge */ /* synthetic */ void qkMJQNOT8cM7wI8Z9OuJoO5FaK3yOY2G(SecureClass1098 hLhajrVwqrdYhZynlE1knWTyy6kUImz6, float dj3MKOYrzGN6vVpXTRj3qdCz6uTxev9G, boolean iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, Runnable fOqJGh2otogeURguRcU1AtVEWc6mHFTK, Runnable mwggocMN0t7PqS9z0S1CCIWZT1pXIcbV) {
        class_287 field195 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        SecureClass0154.XMBz7Je8m84kugYKTdkxDDyqlOtF1Ej6(iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, fOqJGh2otogeURguRcU1AtVEWc6mHFTK);
        SecureClass0154.AUnoM8PGu7OjXsa0WVWoaW38ikFKSCBk(field195, hLhajrVwqrdYhZynlE1knWTyy6kUImz6);
        SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(field195, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg);
        class_287 class_2872 = SecureClass0154.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(dj3MKOYrzGN6vVpXTRj3qdCz6uTxev9G, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg, mwggocMN0t7PqS9z0S1CCIWZT1pXIcbV);
        SecureClass0154.hmvK18M1orqJQfc1QymJWOXnK6NZ4pA0(class_2872, hLhajrVwqrdYhZynlE1knWTyy6kUImz6);
        SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(class_2872, iQUWQyqcXwlhci26mYqglFDYvKJUxgxg);
    }

    public static /* bridge */ /* synthetic */ int GfFBIl2t0j8LzgUo6Zum98PmsiJ9UVvx() {
        return (int)class_310.method_1551().method_22683().method_4495();
    }

    public static /* bridge */ /* synthetic */ void hmvK18M1orqJQfc1QymJWOXnK6NZ4pA0(class_287 JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, SecureClass1098 qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2) {
        field019.WEpNOrFWC0YajkJ8Tn2HGaRavrgUPMWq(qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2.p4B7ehAlTx5ueRNHmBVHqGdwVPysxATS());
        field019.jT5crBqOQKokkMgPkqqYCiHLbzyXMV4K(-field013.renderPosX(), -field013.renderPosY(), -field013.renderPosZ());
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)1.0, (float)0.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)0.0, (float)1.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)-1.0, (float)0.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)0.0, (float)-1.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)1.0, (float)0.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)0.0, (float)1.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)-1.0, (float)0.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)0.0, (float)-1.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)1.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.KyZIxkWbGG4ktIvcDX7cb5Ehqz7Bwijp(), (float)0.0, (float)1.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.cfr_renamed_233(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)1.0, (float)0.0);
        SecureClass0154.AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(JpllOrhXf7vtJB7Mp7qTPcAjyyjiEn3S, qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh2, (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.W7JCZj7q3b3wtG9utb3gEDwPubPhOH3E(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)SecureClass0154.field019.a6ca5qUd0QBg7KewojALglZMSZ9G1iL7(), (float)SecureClass0154.field019.cfr_renamed_234(), (float)SecureClass0154.field019.quxaHl6ZEDQ4jLKutS1DcyDNomTEm00l(), (float)0.0, (float)1.0, (float)0.0);
    }

    public static /* bridge */ /* synthetic */ void AmnVOiOe5qiF13qDn7uTctmgJLQT36Y9(class_287 aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5, SecureClass1098 SNX3NzbBYky01CZkcqviAvrwNcYHRcT4, float pOIyV8t9O3mAUgW1msNh42uMnbPSPGxQ, float lfX5OLUBf5YdmX9FUuWT6sSYmQAiXyRX, float R4sTSnHsnW0NBAwe1Kg5kdpW1WOcF4G2, float L4KlsvgacgIPGbWO8AibJGAPItRE8kPP, float D2T8HWyEWtbWwxBjm1LyJe9r0nd2NcVm, float aAO5PSipod7lDN2ANxtipkyEfZU815ht, float f, float u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, float LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as) {
        Matrix4f matrix4f = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760().method_23761();
        class_4587.class_4665 field196 = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.F8BorozPPEYSm4NfINDxdL01DaveJ6Sa().method_23760();
        SecureClass0428 field197 = SNX3NzbBYky01CZkcqviAvrwNcYHRcT4.cfr_renamed_227();
        aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5.method_22918(matrix4f, pOIyV8t9O3mAUgW1msNh42uMnbPSPGxQ, lfX5OLUBf5YdmX9FUuWT6sSYmQAiXyRX, R4sTSnHsnW0NBAwe1Kg5kdpW1WOcF4G2).method_22915(field197.DWYuMlx7vDaNUBsynkUgzceREo5fafgS(), field197.SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD(), field197.eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy(), field197.JY2LnMKCH1LUoYsm4h199XOCZsDv07wN()).method_60831(field196, f, u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as);
        aUCrUbG90ptoqhiZXxXqS9dxYtG5CeT5.method_22918(matrix4f, L4KlsvgacgIPGbWO8AibJGAPItRE8kPP, D2T8HWyEWtbWwxBjm1LyJe9r0nd2NcVm, aAO5PSipod7lDN2ANxtipkyEfZU815ht).method_22915(field197.DWYuMlx7vDaNUBsynkUgzceREo5fafgS(), field197.SSTHlqpVIEBLfxUSw32O5ro1oGZMVSAD(), field197.eVdZke0Qhmw00nLcEX5GNsZCmQhzluJy(), field197.JY2LnMKCH1LUoYsm4h199XOCZsDv07wN()).method_60831(field196, f, u1A5tTFTE3YxC4dZnAvPMBqTw9e1U5GE, LbvrJpVEhHSGBMCBl04OjQRi0XVTK1as);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_232(Color x2qzbOihsv9uJCIKRqQviA6YoKPbFb27) {
        float[] field198 = SecureClass0898.lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(x2qzbOihsv9uJCIKRqQviA6YoKPbFb27);
        RenderSystem.setShaderColor((float)field198[0], (float)field198[1], (float)field198[2], (float)field198[3]);
    }

    public static /* bridge */ /* synthetic */ void n7d67iQbdtKkOQyH9Lgk3PZTxMNHFXds(Color color, class_630.class_628 class_6282, class_4587 sGyVNiOnK7jOVvosTmRE3dYTN8rGdqCQ) {
        Matrix4f field199 = sGyVNiOnK7jOVvosTmRE3dYTN8rGdqCQ.method_23760().method_23761();
        Vector4f vector4f = new Vector4f();
        Vector4f field200 = new Vector4f();
        Vector4f field201 = new Vector4f();
        Vector4f field202 = new Vector4f();
        class_630.class_593[] class_593Array = class_6282.field_3649;
        int n = class_593Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_630.class_593 field203 = class_593Array[n2];
            vector4f.set(field203.field_3502[0].field_3605.x / 16.0f, field203.field_3502[0].field_3605.y / 16.0f, field203.field_3502[0].field_3605.z / 16.0f, 1.0f);
            vector4f.mul((Matrix4fc)field199);
            field200.set(field203.field_3502[1].field_3605.x / 16.0f, field203.field_3502[1].field_3605.y / 16.0f, field203.field_3502[1].field_3605.z / 16.0f, 1.0f);
            field200.mul((Matrix4fc)field199);
            field201.set(field203.field_3502[2].field_3605.x / 16.0f, field203.field_3502[2].field_3605.y / 16.0f, field203.field_3502[2].field_3605.z / 16.0f, 1.0f);
            field201.mul((Matrix4fc)field199);
            field202.set(field203.field_3502[3].field_3605.x / 16.0f, field203.field_3502[3].field_3605.y / 16.0f, field203.field_3502[3].field_3605.z / 16.0f, 1.0f);
            field202.mul((Matrix4fc)field199);
            SecureClass0154.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(vector4f.x, vector4f.y, vector4f.z, field200.x, field200.y, field200.z, color));
            SecureClass0154.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(field200.x, field200.y, field200.z, field201.x, field201.y, field201.z, color));
            SecureClass0154.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(field201.x, field201.y, field201.z, field202.x, field202.y, field202.z, color));
            SecureClass0154.cfr_renamed_235(new KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd(vector4f.x, vector4f.y, vector4f.z, vector4f.x, vector4f.y, vector4f.z, color));
            ++n2;
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_236(Color KuoA2Y6HWVfxqgEb9NdUah2xPKRYM3HO, Runnable pSHZatbegaT9nf5knddpCMxofl8MPz9X) {
        SecureClass0154.cfr_renamed_232(KuoA2Y6HWVfxqgEb9NdUah2xPKRYM3HO);
        pSHZatbegaT9nf5knddpCMxofl8MPz9X.run();
        SecureClass0154.hucX855ESx7e1rO9eVmBacwzcWS9e8ee();
    }

    public static /* bridge */ /* synthetic */ void GnOWsNqrVLv58SkCiy9y0j395WKhAhgN(class_742 wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_4587 class_45872, float j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, float YpOtHDASHYz99TMtOfO9QwsO136sQCpc, float f, float YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU) {
        float field204 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6024(f);
        float f2 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5695(f);
        if (SecureClass0556.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG)) {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
            float field205 = (float)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6003() + f;
            float f3 = class_3532.method_15363((float)(field205 * field205 / 100.0f), (float)0.0f, (float)1.0f);
            if (!wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_6123()) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(f3 * (-90.0f - f2)));
            }
            class_243 field206 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5828(f);
            class_243 field207 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_49339(f);
            double field208 = field207.method_37268();
            double d = field206.method_37268();
            if (field208 > 0.0 && d > 0.0) {
                double field209 = (field207.field_1352 * field206.field_1352 + field207.field_1350 * field206.field_1350) / Math.sqrt(field208 * d);
                double field210 = field207.field_1352 * field206.field_1350 - field207.field_1350 * field206.field_1352;
                class_45872.method_22907(class_7833.field_40716.rotation((float)(Math.signum(field210) * Math.acos(field209))));
            }
        } else if (field204 > 0.0f) {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
            float field211 = wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_5799() ? -90.0f - f2 : -90.0f;
            float field212 = class_3532.method_16439((float)field204, (float)0.0f, (float)field211);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(field212));
            if (wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG.method_20232()) {
                class_45872.method_46416(0.0f, -1.0f, 0.3f);
            }
        } else {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)wrrSKLQ51YPQcRGPiBBHKR97yYw5lHHG, class_45872, j6Pt7zYkMnMZzhlgGlMkOAuiVOE9IzCf, YpOtHDASHYz99TMtOfO9QwsO136sQCpc, f, YAOkCU4H7rFJu4JYfE7G08hW6a1AC8mU);
        }
    }

    public static /* bridge */ /* synthetic */ void nvvk7rctAIw6lyreWeHyT2vPyFBrINsd(String string, float fSNgoXeBBUWBz213bIvDI2HGTstYwCZc, double yaAKPIwxhHAvNGrsxetOdwAa8fvqFqzv, double M6pXvGxaivYkrREbJFUF3kPJw0XrHd4p, double PUNZenYM7fXA1gut4gEScaw12HFmS6NJ, class_4184 Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd, Color color, float V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, boolean TmhJYfDISCj4F4VDBqlMR2zlSgG7OsuH, boolean cqclVOwbl6ju0INO60fTSOoMtmzRILaV) {
        float field213 = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19330();
        float field214 = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19329();
        class_243 field215 = Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19326();
        class_4587 class_45872 = new class_4587();
        class_45872.method_22903();
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19329()));
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(Hk8Oz5JW1Hoop3apA9aJLPVktLaxOYBd.method_19330() + 180.0f));
        class_45872.method_22904(yaAKPIwxhHAvNGrsxetOdwAa8fvqFqzv - field215.field_1352, M6pXvGxaivYkrREbJFUF3kPJw0XrHd4p - field215.field_1351, PUNZenYM7fXA1gut4gEScaw12HFmS6NJ - field215.field_1350);
        class_45872.method_22907(class_7833.field_40716.rotationDegrees(-field213));
        class_45872.method_22907(class_7833.field_40714.rotationDegrees(field214));
        GL11.glDepthFunc((int)519);
        class_45872.method_22905(-V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, -V4bIctSvgHzA6LqNjlPuCZDsAEdTd5Ar, -1.0f);
        SecureClass0154.QuoCPDBawo6keYH1fO1BWQ8Yw66cfAmg(class_45872, string, -fSNgoXeBBUWBz213bIvDI2HGTstYwCZc, color, TmhJYfDISCj4F4VDBqlMR2zlSgG7OsuH, cqclVOwbl6ju0INO60fTSOoMtmzRILaV);
        GL11.glDepthFunc((int)515);
        class_45872.method_22909();
    }

    public static /* bridge */ /* synthetic */ Vector3f CiY8bXeYrM3FvNpvMBF5bCU5NMnTNJ8Z(float xN09KaAqQZXit1n3CaprjNz0QkssFMuN, float gWlpvQt4ayTXXZ45QsTB7Ocqq5jAQebw, float pRLeMs1CW5rjGQf7HfrgNUcSMAmMcyzd, float xx4R6Ydrc69fK5BRjUv99nsuWZlvzNDc, float f, float SZHttbJNgsWfCEdaAxCXNFzkNmSPhrSi) {
        float field216 = xx4R6Ydrc69fK5BRjUv99nsuWZlvzNDc - xN09KaAqQZXit1n3CaprjNz0QkssFMuN;
        float field217 = f - gWlpvQt4ayTXXZ45QsTB7Ocqq5jAQebw;
        float field218 = SZHttbJNgsWfCEdaAxCXNFzkNmSPhrSi - pRLeMs1CW5rjGQf7HfrgNUcSMAmMcyzd;
        float field219 = class_3532.method_15355((float)(field216 * field216 + field217 * field217 + field218 * field218));
        return new Vector3f(field216 / field219, field217 / field219, field218 / field219);
    }

    public static /* bridge */ /* synthetic */ void fqRIVjus4ODLtGHcoxwIJCZCGxKyWut8(class_238 YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm, Matrix4f nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, Color rooW3JsofVflmFMvCNgJjiFr5fgWVLCT, Color EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ) {
        float field220 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1323 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10216());
        float field221 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1322 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10214());
        float field222 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1321 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10215());
        float field223 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1320 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10216());
        float field224 = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1325 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10214());
        float f = (float)(YnrjeKt7XO9sQO1tifESOqWvqlbyxLwm.field_1324 - SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().field_4686.method_19326().method_10215());
        class_287 field225 = class_289.method_1348().method_60827(class_293.class_5596.field_27382, class_290.field_1576);
        SecureClass0154.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(true);
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field221, field222).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field221, field222).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field221, field222).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field221, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field221, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field221, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field221, field222).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field221, f).method_39415(rooW3JsofVflmFMvCNgJjiFr5fgWVLCT.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field220, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, f).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        field225.method_22918(nP15MikwVMJGtJl7Ax8rc9pLlBg1Bt4V, field223, field224, field222).method_39415(EH3PTVjdVLuTJ3OP2IdaKnKmQMZZEJWJ.getRGB());
        SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(field225, true);
    }

    public static /* bridge */ /* synthetic */ void kA5LT7z26p16HYt654P9BTHmLTp6zWki(class_1309 RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh, class_4587 wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF, float GGjCk9H1ivzmKdMfkO4Cx9Pw60H1VGc7, float hGCZEZtcLUJhOatGne0b96nwN76rxZfm, float f, float f2) {
        if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_32314()) {
            hGCZEZtcLUJhOatGne0b96nwN76rxZfm += (float)(Math.cos((double)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6012 * 3.25) * Math.PI * (double)0.4f);
        }
        if (!RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_41328(class_4050.field_18078)) {
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(180.0f - hGCZEZtcLUJhOatGne0b96nwN76rxZfm));
        }
        if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6213 > 0 && !AnimationsModule.cfr_renamed_35()) {
            float field226 = ((float)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6213 + f - 1.0f) / 20.0f * 1.6f;
            if ((field226 = class_3532.method_15355((float)field226)) > 1.0f) {
                field226 = 1.0f;
            }
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40718.rotationDegrees(field226 * 90.0f));
        } else if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_6123()) {
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40714.rotationDegrees(-90.0f - RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_36455()));
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(((float)RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.field_6012 + f) * -75.0f));
        } else if (RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_41328(class_4050.field_18078)) {
            class_2350 field227 = RS7JUvteDbX9gU6XfwNyPTD1oIsOaDjh.method_18401();
            float field228 = field227 != null ? SecureClass0154.cfr_renamed_237(field227) : hGCZEZtcLUJhOatGne0b96nwN76rxZfm;
            wmVbit0ntURjR0Np0iGFFYRKcsrNsuTF.method_22907(class_7833.field_40716.rotationDegrees(field228));
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
        SecureClass0154.gZK5EXxeGnTmdQU6EuwSksHmOzahbJk2(true);
        class_287 field229 = class_289.method_1348().method_60827(class_293.class_5596.field_27377, class_290.field_29337);
        RenderSystem.lineWidth((float)ChamsModule.KhbvhvFXArnWMIHcrICNBFGgmM7PdJir());
        Iterator<E> iterator = MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                RenderSystem.setShader(class_757::method_34535);
                SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(field229, true);
                MpEh2tjZCzYG48tH8y1Riz7IBXPq5qQV.clear();
                return;
            }
            KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd field230 = (KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd)iterator.next();
            Color color = field230.xeOYdBBCYOR2F4QW2UhPRnSwS0OpDOxd;
            class_4587 field231 = SecureClass0154.M0Zr3SngdKOPfx7P0kxyYIzVWL2pjcGM(field230.mmhxxczZVwNW3pWK5sWpjB41RA8iGKhn, field230.MRVguI1GwwCzxmGK1gDg0iDh6f1lG4BV, field230.Ak7YqPPXXuGdPMDWzmTR1zBMFb9Ej95f);
            SecureClass0154.Q3xdqcL3Ggk0v6fyRTzvyLd0RKCIiZRe(field229, field231, 0.0f, 0.0f, 0.0f, (float)(field230.eWGZ4m9sLHAtfQFxChbMIVJQNl9OGGQA - field230.mmhxxczZVwNW3pWK5sWpjB41RA8iGKhn), (float)(field230.ZrAF5xhdIyZpQC59SotwqoxbLhW2fc4U - field230.MRVguI1GwwCzxmGK1gDg0iDh6f1lG4BV), (float)(field230.s3FUvBbsU8XOibBGVsf4zVDumjNc1BKg - field230.Ak7YqPPXXuGdPMDWzmTR1zBMFb9Ej95f), color);
        }
    }

    public static /* bridge */ /* synthetic */ float fPR592smSjSMyQC0vpQyLublCiSAxHZF(class_1297 class_12972) {
        if (AnimationsModule.uhUEorvwOnJawr2vLhH867pno0MJBfz8()) {
            return 0.43f - class_3532.method_16439((float)((ILivingEntity)class_12972).getGlobalAnimation().HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY(), (float)0.0f, (float)0.3f);
        }
        return class_12972.method_5715() ? 0.4f : 0.43f;
    }

    public static /* bridge */ /* synthetic */ class_4587 M0Zr3SngdKOPfx7P0kxyYIzVWL2pjcGM(double JPjAAHCrFwwEgxgqPoV4KGxVrdGhPrFl, double ilf6IXUIsAufFn5G9EnUY8dszbyRqhqA, double eulp4P670hLG1g5xWQ05FO0kbYS6UYND) {
        class_4587 field232 = new class_4587();
        class_4184 field233 = class_310.method_1551().field_1773.method_19418();
        field232.method_22907(class_7833.field_40714.rotationDegrees(field233.method_19329()));
        field232.method_22907(class_7833.field_40716.rotationDegrees(field233.method_19330() + 180.0f));
        field232.method_22904(JPjAAHCrFwwEgxgqPoV4KGxVrdGhPrFl, ilf6IXUIsAufFn5G9EnUY8dszbyRqhqA, eulp4P670hLG1g5xWQ05FO0kbYS6UYND);
        return field232;
    }

    public static /* bridge */ /* synthetic */ void UiZDT7jDJAiZJ4aW5LPEcmGokm5WdhBA(class_1657 class_16572, class_4587 class_45872, float kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, float yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, float mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, float BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR) {
        float field234 = class_16572.method_6024(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
        float field235 = class_16572.method_5695(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
        if (SecureClass0556.E7kSCaebikDmzJp1JUS5jlvZYiY7kg89((class_1309)class_16572)) {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
            float f = (float)class_16572.method_6003() + mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu;
            float field236 = class_3532.method_15363((float)(f * f / 100.0f), (float)0.0f, (float)1.0f);
            if (!class_16572.method_6123()) {
                class_45872.method_22907(class_7833.field_40714.rotationDegrees(field236 * (-90.0f - field235)));
            }
            class_243 field237 = class_16572.method_5828(mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu);
            class_243 class_2432 = class_16572.method_18798();
            double field238 = class_2432.method_37268();
            double field239 = field237.method_37268();
            if (field238 > 0.0 && field239 > 0.0) {
                double field240 = (class_2432.field_1352 * field237.field_1352 + class_2432.field_1350 * field237.field_1350) / Math.sqrt(field238 * field239);
                double field241 = class_2432.field_1352 * field237.field_1350 - class_2432.field_1350 * field237.field_1352;
                class_45872.method_22907(class_7833.field_40716.rotation((float)(Math.signum(field241) * Math.acos(field240))));
            }
        } else if (field234 > 0.0f) {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
            float f = class_16572.method_5799() ? -90.0f - field235 : -90.0f;
            float field242 = class_3532.method_16439((float)field234, (float)0.0f, (float)f);
            class_45872.method_22907(class_7833.field_40714.rotationDegrees(field242));
            if (class_16572.method_20232()) {
                class_45872.method_46416(0.0f, -1.0f, 0.3f);
            }
        } else {
            SecureClass0154.kA5LT7z26p16HYt654P9BTHmLTp6zWki((class_1309)class_16572, class_45872, kfbLpUxpUQwWfO5G2mE0dte4ANgSwu4q, yFDdcWE2PGpaS2mslnurzaOHAB5M4LUa, mcjunkH1TjKLsdQ9oG0NBquzxoVZFAqu, BPqfQXGdt9iNg8QYBtdEUsNRt6JbSpOR);
        }
    }

    public static /* bridge */ /* synthetic */ float awVglyn4JhiDQu1STfW4cWKJpiJO92pO(double QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq) {
        float field243 = 0.0018f + 0.003f * (float)QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq;
        if (QNXQEG8RPVnCJKnlmR7XETE2oMrsMHuq <= 8.0) {
            field243 = 0.0245f;
        }
        return field243;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_238(double d, double iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT, double d2, double yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY, double SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT, double rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9, Color color, float tODiO5lYOErMAa3qyGEf8LGarub5eDhY, Runnable RlXh0BZCpBduUyE8taLPUKt5iySzzxZC) {
        class_287 field244 = SecureClass0154.K1ntK2Xi4Hh71uXoL6voBkMY5CnXwBQ2(tODiO5lYOErMAa3qyGEf8LGarub5eDhY, true, () -> RenderSystem.setShader(class_757::method_34535));
        RlXh0BZCpBduUyE8taLPUKt5iySzzxZC.run();
        RenderSystem.setShaderColor((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        double field245 = yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY - d;
        double d3 = SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT - iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT;
        double field246 = rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9 - d2;
        double field247 = class_3532.method_15355((float)((float)(field245 * field245 + d3 * d3 + field246 * field246)));
        float f = (float)(field245 / field247);
        float field248 = (float)(d3 / field247);
        float field249 = (float)(field246 / field247);
        field244.method_22918(field038, (float)d, (float)iqNiQWrBK991k1iUkSVyfJIq2zUvuHGT, (float)d2).method_22914(f, field248, field249).method_22915((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        field244.method_22918(field038, (float)yKx69R679GOIxP0Ga0RzEdOWeJx3gyzY, (float)SApZbpk7gGogFfyP3WKGmt2ihHdBzYUT, (float)rsZzdPDPmLk5TcImLjtyY7BCapTRv6s9).method_22914(f, field248, field249).method_22915((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        SecureClass0154.krfnl6nCGqLvo9yBuQLwfIA4CxrB0XYz(field244, true);
    }

    public static /* bridge */ /* synthetic */ void gTNJiLlEpxz4hpLufTUXo0WmTliOtMr0(Color s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, class_630.class_628 class_6282, class_4587 lrHzT5dBIn1yPAapVtRXTrP7vMaFBDXg, float ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, Runnable sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr) {
        Matrix4f field250 = lrHzT5dBIn1yPAapVtRXTrP7vMaFBDXg.method_23760().method_23761();
        Vector4f vector4f = new Vector4f();
        Vector4f field251 = new Vector4f();
        Vector4f field252 = new Vector4f();
        Vector4f field253 = new Vector4f();
        class_630.class_593[] class_593Array = class_6282.field_3649;
        int n = class_593Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_630.class_593 field254 = class_593Array[n2];
            vector4f.set(field254.field_3502[0].field_3605.x / 16.0f, field254.field_3502[0].field_3605.y / 16.0f, field254.field_3502[0].field_3605.z / 16.0f, 1.0f);
            vector4f.mul((Matrix4fc)field250);
            field251.set(field254.field_3502[1].field_3605.x / 16.0f, field254.field_3502[1].field_3605.y / 16.0f, field254.field_3502[1].field_3605.z / 16.0f, 1.0f);
            field251.mul((Matrix4fc)field250);
            field252.set(field254.field_3502[2].field_3605.x / 16.0f, field254.field_3502[2].field_3605.y / 16.0f, field254.field_3502[2].field_3605.z / 16.0f, 1.0f);
            field252.mul((Matrix4fc)field250);
            field253.set(field254.field_3502[3].field_3605.x / 16.0f, field254.field_3502[3].field_3605.y / 16.0f, field254.field_3502[3].field_3605.z / 16.0f, 1.0f);
            field253.mul((Matrix4fc)field250);
            SecureClass0154.cfr_renamed_238(vector4f.x, vector4f.y, vector4f.z, field251.x, field251.y, field251.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            SecureClass0154.cfr_renamed_238(field251.x, field251.y, field251.z, field252.x, field252.y, field252.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            SecureClass0154.cfr_renamed_238(field252.x, field252.y, field252.z, field253.x, field253.y, field253.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            SecureClass0154.cfr_renamed_238(field253.x, field253.y, field253.z, vector4f.x, vector4f.y, vector4f.z, s3UYBC1lCuq8nQ4dPPa59Q7Ybr1TUSAw, ujF6rvsIUn0C4q1JZCSfXuG534QPJAJd, sL4Qa4PhL6tYxABx7ELyD8gt9cfr2Hxr);
            ++n2;
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void Q3xdqcL3Ggk0v6fyRTzvyLd0RKCIiZRe(class_287 i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV, class_4587 DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL, float mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, float UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, float QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2, float uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, float W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, float t3gJ0IokPEIygVLuhMI028XZoQJAIef9, Color q0SMSTMxgwEtMGramypS7gyOpKbH5O9I) {
        Matrix4f field255 = DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL.method_23760().method_23761();
        class_4587.class_4665 field256 = DPdh6ZTUurI6eEQUf4UqzWg86iyZxrAL.method_23760();
        Vector3f field257 = SecureClass0154.CiY8bXeYrM3FvNpvMBF5bCU5NMnTNJ8Z(mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2, uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, t3gJ0IokPEIygVLuhMI028XZoQJAIef9);
        i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV.method_22918(field255, mvdEi6ecY8Kk67ikG5cGWklgAjkcJfPK, UJMzDqnmyBqfpNi4689v6EFATfnU2LAL, QJRUsxTd1gKRaNy6eyfbLDmxo6Dkf2M2).method_1336(q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getRed(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getGreen(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getBlue(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getAlpha()).method_60831(field256, field257.x(), field257.y(), field257.z());
        i6JIcuPwCBGSxE1Zg4WZdS81ChoYLPZV.method_22918(field255, uyjk5Ig9SryR7mokS9eOHSNMgSwReYsz, W07dAJHKDvRDqdwy5fTjIXaQ1mvgb9g1, t3gJ0IokPEIygVLuhMI028XZoQJAIef9).method_1336(q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getRed(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getGreen(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getBlue(), q0SMSTMxgwEtMGramypS7gyOpKbH5O9I.getAlpha()).method_60831(field256, field257.x(), field257.y(), field257.z());
    }

    public static /* bridge */ /* synthetic */ void FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(Color RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, class_630 u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4, class_4587 Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, float PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, Runnable mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2) {
        if (!u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3665 || u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3663.isEmpty() && u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3661.isEmpty()) {
            return;
        }
        Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7.method_22903();
        u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.method_22703(Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7);
        for (class_630.class_628 class_6282 : u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3663) {
            SecureClass0154.gTNJiLlEpxz4hpLufTUXo0WmTliOtMr0(RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, class_6282, Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2);
        }
        Iterator<Object> iterator = u5RV5DEFRXQOVZrMDx7aP7M5OTRXFOQ4.field_3661.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7.method_22909();
                return;
            }
            class_630 field258 = (class_630)iterator.next();
            SecureClass0154.FEj2pLyPGjwah1lsbRCMECf2boRWeT6d(RsRJjbtLR0Zj0lqqqlZSJXuAO4ldWWK8, field258, Wxnb0dtzfrTsvY2TTbHroxm9a4xbVnE7, PE0NNLoaCz62IclqeZXtQ92CxJKkfrs2, mv7Os0Ydoi6X75ZYPtquWz8Fwkp84BZ2);
        }
    }

    public static /* bridge */ /* synthetic */ void LzwTiArp4VVA0VOqRwxjYUsuUQuT31sZ(boolean htkanMNKPKVxWC5H52ZzePkKxcZXqZNt) {
        field031 = htkanMNKPKVxWC5H52ZzePkKxcZXqZNt;
    }

    public /* synthetic */ SecureClass0154() {
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
        double field259;
        if (P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560() == null) {
            return;
        }
        class_243 field260 = FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().cfr_renamed_239() : SecureClass0839.VWBTslLvmQ8H6ObUath0nNrWhJyMJMCe(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1560(), y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        double field261 = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23317();
        double d = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23318();
        double d2 = EMZ764GfGMhk4XkaSbsmsn8WutZS54wu.method_23321();
        class_4184 field262 = SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418();
        class_243 field263 = SecureClass0839.VWBTslLvmQ8H6ObUath0nNrWhJyMJMCe(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB, y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        class_243 field264 = SecureClass0839.cfr_renamed_240(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB, y6KiHiHhbbyBunOgMdDtxbPxVkUTFuTo);
        double field265 = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23317() - field263.method_10216();
        double d3 = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23318() + (double)sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_17682() + (double)SecureClass0154.fPR592smSjSMyQC0vpQyLublCiSAxHZF(sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB) - field263.method_10214();
        double field266 = sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_23321() - field263.method_10215();
        int field267 = pgINTJVrANObJtuDqA1dRjFLyVBHJW5A ? (int)SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().Sjl1Y1LO5U1gIsVyUJ1TIuKWVUrlwdX8(string) : SecureClass0154.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772.method_1727(string);
        float field268 = (float)field267 / 2.0f;
        double field269 = field261 - field260.method_10216() - field265;
        double field270 = d - field260.method_10214() - d3;
        double field271 = d2 - field260.method_10215() - field266;
        double d4 = field259 = FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? field260.method_1022(field264.method_1031(0.0, (double)sIhuQ2glE239pJpgcqcHIcxKOu9m6xEB.method_17682(), 0.0)) : Math.sqrt(field269 * field269 + field270 * field270 + field271 * field271);
        if (field259 > 4096.0) {
            return;
        }
        float field272 = 0.0018f + 0.003f * (float)field259;
        if (field259 <= 8.0) {
            field272 = 0.0245f;
        }
        SecureClass0154.nvvk7rctAIw6lyreWeHyT2vPyFBrINsd(string, field268, field265, d3, field266, field262, KfJsCBGiav1qgMTHz0R9CvAvfVS4IorN, field272 * RvIJlBsEiXEZ9MIgbLxvJduu4fLxhPT9, pgINTJVrANObJtuDqA1dRjFLyVBHJW5A, zcRIZRImNUEeVh1361QGQ2SrOykWkim8);
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
            SecureClass0154.n7d67iQbdtKkOQyH9Lgk3PZTxMNHFXds(bQcvzIIK3UgVtYT35o8jyo5Sc8uxIa7R, class_6282, daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K);
        }
        Iterator<Object> iterator = o2CKESTTXpuN7kesb5LzAPlVU8x50EAM.field_3661.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K.method_22909();
                return;
            }
            class_630 field273 = (class_630)iterator.next();
            SecureClass0154.pBp7jR3A8d3mA8TQqcck3sftg3sNOYlj(bQcvzIIK3UgVtYT35o8jyo5Sc8uxIa7R, field273, daQXJ4QKGUtIC4jiYd7ZbrGUjSIu7G9K);
        }
    }

    public static /* bridge */ /* synthetic */ void QuoCPDBawo6keYH1fO1BWQ8Yw66cfAmg(class_4587 class_45872, String VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, float tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, Color eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT, boolean Whs3CljLlNCpGLffN4R0kWjVniYnA1IA, boolean DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx) {
        SecureClass0016 field274 = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg();
        if (Whs3CljLlNCpGLffN4R0kWjVniYnA1IA) {
            field274.yaLwDYlVBLunivy9yv5cFxAcUl5gyVMr(class_45872, VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, 0.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getRed() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getGreen() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getBlue() / 255.0f, (float)eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.getAlpha() / 255.0f, DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx);
        } else {
            field274.PCc1rb00Ikiy6tXw3XpC263pIUdPkV8c().bT3e5EmAFaGfxe2chKiELIHJe2Lzj2WT(class_45872, VBpR7aCs9aF2c97u1rKVHdZjzaWBioqR, tRss9pI1hPONrzl2vz6DVHgA6ON7HlTB, 0.0f, eoJ6FtObyXtNlhWjRBYV2XaIvZ6fkGaT.hashCode(), DIwrqrY00oRmCQgyzVc0meYmCvfHcUxx);
        }
    }

    public static /* bridge */ /* synthetic */ Queue<Consumer<Matrix4f>> JmnjZql5Q72F3EFqBNX5Jf3BrJSInZTL() {
        return field033;
    }

    public static /* bridge */ /* synthetic */ boolean uVT9h0cO2fYh55VJRXy6dzqLFnu35t05() {
        return field031;
    }

    public static /* bridge */ /* synthetic */ Queue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW> NM2kqxZ4BkeRcuift8SdqQnkIjV4EFUf() {
        return field022;
    }

    public static /* bridge */ /* synthetic */ Queue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd> heqbMpuFGKCzdTL0oVa43eMjwh6AQGkx() {
        return field030;
    }

    public static /* bridge */ /* synthetic */ Queue<h051oGnfbeVHvnLJ3029aut39JqYeo9d> cfr_renamed_241() {
        return field039;
    }

    public static /* bridge */ /* synthetic */ Queue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ> KcSp38mKsB13619YqusRQ3jPa3sSCjVr() {
        return field024;
    }

    public static /* bridge */ /* synthetic */ Queue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u> cfr_renamed_242() {
        return field034;
    }

    public static /* bridge */ /* synthetic */ Queue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk> T4i8kT9hxamffn3r71iJTXVDmTJSUAod() {
        return field041;
    }

    static {
        field014 = LoggerFactory.getLogger(SecureClass0154.class);
        field013 = (IEntityRenderDispatcher)Objects.requireNonNull(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561());
        field019 = new SecureClass1156();
        field010 = new Matrix4f();
        field040 = new Matrix4f();
        field038 = new Matrix4f();
        field028 = 0L;
        field031 = false;
        field022 = new ConcurrentLinkedQueue<_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW>();
        field041 = new ConcurrentLinkedQueue<_9fbO2fkad0m2DZQQsSg8eL1V67XdLzIk>();
        field024 = new ConcurrentLinkedQueue<d5aPZfbs09ZhuptGBiLOLGkglUbSHkvJ>();
        field039 = new ConcurrentLinkedQueue<h051oGnfbeVHvnLJ3029aut39JqYeo9d>();
        field030 = new ConcurrentLinkedQueue<KfyGZn5SdhKObpsbGAsXmk5QRfyAc7Bd>();
        field033 = new ConcurrentLinkedQueue<Consumer<Matrix4f>>();
        field034 = new ConcurrentLinkedQueue<tK4teYhXP32Kwa7BmaV6nl4rtrf3ts6u>();
        field032 = new Random();
    }
}

