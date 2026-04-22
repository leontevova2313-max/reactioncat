/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group025;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import java.util.Map;
import java.util.function.Function;
import net.minecraft.class_1059;
import net.minecraft.class_1087;
import net.minecraft.class_1091;
import net.minecraft.class_156;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1921;
import net.minecraft.class_1937;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_4668;
import net.minecraft.class_757;
import net.minecraft.class_7837;
import net.minecraft.class_811;
import net.minecraft.class_918;
import org.joml.Matrix4f;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group029.SecureClass0503;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.uxWhZjpVbrcwpcP0uv2nFLHXMrCqTBHz;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group059._3HqSrOpQ5FAQEntOX5yHmUwb24nrIksD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NametagsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<_3HqSrOpQ5FAQEntOX5yHmUwb24nrIksD> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public static final /* synthetic */ Logger field006;
    public final /* synthetic */ SecureClass0603<Boolean> field007;
    public static final /* synthetic */ Function<class_2960, class_1921> field008;
    public final /* synthetic */ SecureClass0603<Boolean> field009;
    public final /* synthetic */ SecureClass0603<Boolean> field010;
    public final /* synthetic */ SecureClass0603<Boolean> field011;
    public final /* synthetic */ SecureClass0603<Boolean> field012;
    public static /* synthetic */ NametagsModule field013;
    public final /* synthetic */ SecureClass0603<Boolean> field014;
    public final /* synthetic */ SecureClass0603<Boolean> field015;
    public final /* synthetic */ SecureClass0603<Boolean> field016;
    public static final /* synthetic */ class_4668.class_5942 field017;
    public final /* synthetic */ SecureClass0603<Boolean> field018;
    public final /* synthetic */ SecureClass0603<Boolean> field019;
    public final /* synthetic */ SecureClass0603<Boolean> field020;
    public final /* synthetic */ SecureClass0603<Boolean> field021;
    public final /* synthetic */ SecureClass0603<Color> field022;
    public final /* synthetic */ Map<uxWhZjpVbrcwpcP0uv2nFLHXMrCqTBHz, Long> field023;
    public final /* synthetic */ SecureClass0603<Float> field024;
    public final /* synthetic */ SecureClass0603<Boolean> field025;
    public final /* synthetic */ SecureClass0603<Color> field026;
    public final /* synthetic */ SecureClass0603<Color> field027;
    public final /* synthetic */ SecureClass0603<Boolean> field028;
    public final /* synthetic */ SecureClass0603<Boolean> field029;
    public final /* synthetic */ SecureClass0603<Boolean> field030;
    public final /* synthetic */ SecureClass0603<Float> field031;
    public final /* synthetic */ SecureClass0603<Color> field032;
    public final /* synthetic */ SecureClass0603<Boolean> field033;

    public static /* bridge */ /* synthetic */ void WCb1H1cIkwiGWFaRAQgCzvCRZXssY88O(class_1799 Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ, float hPAP5v91O044OvJ639OG22tGLVikxWhm, float AFQJpmNMPi3R2nX4ly30yA4ReSpRzi6r, float ZlwxED79suleJDVUl0KKAR9x0unX7lvG, class_4587 TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK, class_4597 MjG6P9GTJEPQ2aQ4Xx83PxrXNeEpit2T, class_1937 ojwkExBETnR4NKxt9J5WZitnF5JGiusU) {
        class_1087 field034 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4019(Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ, ojwkExBETnR4NKxt9J5WZitnF5JGiusU, null, 0);
        if (Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ.method_7960()) {
            return;
        }
        TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK.method_22903();
        if (Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ.method_31574(class_1802.field_8547)) {
            field034 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_1091.method_45910((String)"trident", (String)"inventory"));
        } else if (Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ.method_31574(class_1802.field_27070)) {
            field034 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_1091.method_45910((String)"spyglass", (String)"inventory"));
        }
        field034.method_4709().method_3503(class_811.field_4317).method_23075(false, TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK);
        TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK.method_46416(-0.5f + hPAP5v91O044OvJ639OG22tGLVikxWhm, -0.5f + AFQJpmNMPi3R2nX4ly30yA4ReSpRzi6r, -0.5f + ZlwxED79suleJDVUl0KKAR9x0unX7lvG);
        if (!field034.method_4713()) {
            class_4588 field035;
            class_1921 class_19212 = NametagsModule.field008.apply(class_1059.field_5275);
            if (class_918.method_51795((class_1799)Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ) && Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ.method_7958()) {
                class_4587.class_4665 field036 = TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK.method_23760().method_56822();
                class_7837.method_46414((Matrix4f)field036.method_23761(), (float)0.5f);
                class_4588 field037 = class_918.method_30114((class_4597)MjG6P9GTJEPQ2aQ4Xx83PxrXNeEpit2T, (class_1921)class_19212, (class_4587.class_4665)field036);
            } else {
                field035 = class_918.method_29711((class_4597)MjG6P9GTJEPQ2aQ4Xx83PxrXNeEpit2T, (class_1921)class_19212, (boolean)true, (boolean)Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ.method_7958());
            }
            P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_23182(field034, Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ, 0xF000F0, class_4608.field_21444, TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK, field035);
        } else {
            SecureClass0503.BLgFIR4WK4Y0j4OUZK0SlKZxCbDbRUs8();
            NametagsModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().field_27770.method_3166(Zjq3CifDSvcbIVqG1mGknFrfCuYTeuUJ, class_811.field_4317, TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK, MjG6P9GTJEPQ2aQ4Xx83PxrXNeEpit2T, 0xF000F0, class_4608.field_21444);
        }
        TGjB8BAGKdxuV5xVeaOizbKvR93VGVuK.method_22909();
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_31() {
        return field013.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ void MMBOvKNXXO1GmAm49zpJs2nn8srWIYo4(class_1799 SUkELcjSJw3AkvQSl2I2uglHaod3YDaP, float aNIWVnU5HVD00CUzab1c0G3UYnzJX3UD, float MTJSj0oTUPcP9ELR4Kdm2hfe8txQBYNj, float CUzO0gAonJvL7a58NoD6W2y6rZrWLZiM, class_4587 I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6, class_4597 class_45972, class_1937 YlWuc6PUZ3r26HIIaXLdQPMU2FX6QeIm) {
        class_1087 field038 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4019(SUkELcjSJw3AkvQSl2I2uglHaod3YDaP, YlWuc6PUZ3r26HIIaXLdQPMU2FX6QeIm, null, 0);
        if (SUkELcjSJw3AkvQSl2I2uglHaod3YDaP.method_7960()) {
            return;
        }
        I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6.method_22903();
        if (SUkELcjSJw3AkvQSl2I2uglHaod3YDaP.method_31574(class_1802.field_8547)) {
            field038 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_1091.method_45910((String)"trident", (String)"inventory"));
        } else if (SUkELcjSJw3AkvQSl2I2uglHaod3YDaP.method_31574(class_1802.field_27070)) {
            field038 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_4012().method_3303().method_4742(class_1091.method_45910((String)"spyglass", (String)"inventory"));
        }
        field038.method_4709().method_3503(class_811.field_4317).method_23075(false, I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6);
        I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6.method_46416(-0.5f + aNIWVnU5HVD00CUzab1c0G3UYnzJX3UD, -0.5f + MTJSj0oTUPcP9ELR4Kdm2hfe8txQBYNj, -0.5f + CUzO0gAonJvL7a58NoD6W2y6rZrWLZiM);
        if (!field038.method_4713()) {
            class_1921 field039 = NametagsModule.field008.apply(class_1059.field_5275);
            class_4588 field040 = class_918.method_29711((class_4597)class_45972, (class_1921)field039, (boolean)true, (boolean)false);
            P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().method_23182(field038, SUkELcjSJw3AkvQSl2I2uglHaod3YDaP, 0xF000F0, class_4608.field_21444, I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6, field040);
        } else {
            SecureClass0503.BLgFIR4WK4Y0j4OUZK0SlKZxCbDbRUs8();
            NametagsModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480().field_27770.method_3166(SUkELcjSJw3AkvQSl2I2uglHaod3YDaP, class_811.field_4317, I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6, class_45972, 0xF000F0, class_4608.field_21444);
        }
        I9EdXtYqCl75zWFg3HgN5fn8s5aTsCq6.method_22909();
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ NametagsModule(SecureClass0242 xI2oxDhVlHh4NivpLAIJLfXDZEAJZfXB) {
        super((SecureClass0242)var1_1, "Nametags", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Displays additional information", new int[0]);
        void var1_1;
        this.__init__org_phobos_secure_E7qwU8abcwz3brAbulptWa86RqdgSg2V_d7W7jZbVsEqJ36YmyV5GdJRuAqG5Z0Ds((SecureClass0242)var1_1);
    }

    public native /* synthetic */ void __init__org_phobos_secure_E7qwU8abcwz3brAbulptWa86RqdgSg2V_d7W7jZbVsEqJ36YmyV5GdJRuAqG5Z0Ds(SecureClass0242 var1);

    static {
        NativeMethodHandler.registerNativeCallbacks(100);
        field006 = LoggerFactory.getLogger(NametagsModule.class);
        field017 = new class_4668.class_5942(class_757::method_34543);
        field008 = class_156.method_34866(TRZngTssiYiQFxDiXX3x3EtxLSgiW2mU -> class_1921.method_24048((String)"gui_textured", (class_293)class_290.field_1575, (class_293.class_5596)class_293.class_5596.field_27382, (int)786432, (class_1921.class_4688)class_1921.class_4688.method_23598().method_34577((class_4668.class_5939)new class_4668.class_4683(TRZngTssiYiQFxDiXX3x3EtxLSgiW2mU, false, false)).method_34578(field017).method_23615(class_4668.field_21370).method_23604(class_4668.field_21348).method_23617(false)));
    }
}

