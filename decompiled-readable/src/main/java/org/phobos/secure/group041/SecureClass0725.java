/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group041;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1922;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_247;
import net.minecraft.class_259;
import net.minecraft.class_2596;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_3619;
import net.minecraft.class_3726;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group006.AutoCrystalModule;
import org.phobos.secure.group032.SecureClass0566;
import org.phobos.secure.group058.SecureClass1057;
import org.phobos.secure.group022.SecureClass0367;
import org.phobos.secure.group022.SecureClass0357;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group023.AntiCheatModule;
import org.phobos.secure.group031.SecureClass0556;
import org.phobos.secure.group040.SecureClass0706;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0725
implements SecureInterface0134 {
    public static final /* synthetic */ Set<class_2248> field001;
    public static final /* synthetic */ List<class_2248> field002;
    public static final /* synthetic */ List<class_2248> field003;
    public static final /* synthetic */ class_2382[] field004;

    public static /* bridge */ /* synthetic */ boolean UmJPCe35eMYFXzoS2CGRkoYYmJbb034V(class_746 class_7462, class_638 class_6382, class_2338 lIIwns2ntE1yn7OMqX21N6WmnuFndUuN, class_2248 class_22482) {
        class_238 field005 = class_7462.method_5829();
        class_265 field006 = class_259.method_1078((class_238)SecureClass1057.a89HQ3YDopaBXrlJiBqao1zH7HIB0u4d(field005));
        class_2680 class_26802 = class_22482.method_9564();
        class_265 field007 = class_26802.method_26218((class_1922)class_6382, lIIwns2ntE1yn7OMqX21N6WmnuFndUuN);
        field007 = field007.method_1096((double)lIIwns2ntE1yn7OMqX21N6WmnuFndUuN.method_10263(), (double)lIIwns2ntE1yn7OMqX21N6WmnuFndUuN.method_10264(), (double)lIIwns2ntE1yn7OMqX21N6WmnuFndUuN.method_10260());
        return class_259.method_1074((class_265)field006, (class_265)field007, (class_247)class_247.field_16896);
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_538(class_638 DiXdiStdOhlFtfjhbnLISeM4yQvGzHlo, class_1657 oefTHXxy5fv77su3Hpcg7YOhJCtaPxfO, BiPredicate<class_2338, class_2680> OqzXlOYLj6zxz8ZqnHGLlVAh63hKmo0z) {
        class_238 field008 = oefTHXxy5fv77su3Hpcg7YOhJCtaPxfO.method_5829();
        class_2338 class_23382 = class_2338.method_49638((class_2374)oefTHXxy5fv77su3Hpcg7YOhJCtaPxfO.method_19538());
        int field009 = class_23382.method_10263() - 2;
        block0: while (field009 <= class_23382.method_10263() + 2) {
            int field010 = class_23382.method_10264() - 1;
            while (true) {
                if (field010 <= class_23382.method_10264() + 4) {
                } else {
                    ++field009;
                    continue block0;
                }
                for (int VNRHf1q7K9FvYwEHJ64OCgOG2FlOP2To = class_23382.method_10260() - 2; VNRHf1q7K9FvYwEHJ64OCgOG2FlOP2To <= class_23382.method_10260() + 2; ++VNRHf1q7K9FvYwEHJ64OCgOG2FlOP2To) {
                    class_2338 field011 = new class_2338(field009, field010, VNRHf1q7K9FvYwEHJ64OCgOG2FlOP2To);
                    class_2680 class_26802 = DiXdiStdOhlFtfjhbnLISeM4yQvGzHlo.method_8320(field011);
                    if (!OqzXlOYLj6zxz8ZqnHGLlVAh63hKmo0z.test(field011, class_26802) || !field008.method_994(new class_238(field011))) continue;
                    return true;
                }
                ++field010;
            }
            break;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean N4hKgFOg6COxNloOkijoXlnDiWkwy5CI(class_2680 KC2UOjlk9lh9Wk5TTXnvf3br2tqD8R0N) {
        return !KC2UOjlk9lh9Wk5TTXnvf3br2tqD8R0N.method_26215() && !KC2UOjlk9lh9Wk5TTXnvf3br2tqD8R0N.method_45474();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ class_2338 MXf988JGA5EAPK7VeFyscmTK28Q8SCfv(class_2338 NLS3sSwaXsYQS6o03Fu8aLopQctmdPm3, class_2338 o6VyMsIoMDbrkNfRad9TMIUGWoTV2pql, class_746 vFIDLaRMtWQsllROqPMh2hswB3ywrLyd) {
        ArrayList<class_2338> field012 = new ArrayList<class_2338>();
        for (class_2350 GPUmk1FykjFEDD0fLAyUUi3OMB21wy0k : SecureClass0566.TLP0yR0h4cQPSBVKp7xUuRCBULTGnDqz) {
            class_2338 class_23383 = NLS3sSwaXsYQS6o03Fu8aLopQctmdPm3.method_10093(GPUmk1FykjFEDD0fLAyUUi3OMB21wy0k);
            for (class_2350 dXrkvh5Qds4IQHxXWzZ4GlxVyOqFsw9u : SecureClass0566.TLP0yR0h4cQPSBVKp7xUuRCBULTGnDqz) {
                class_2338 field013 = o6VyMsIoMDbrkNfRad9TMIUGWoTV2pql.method_10093(dXrkvh5Qds4IQHxXWzZ4GlxVyOqFsw9u);
                if (!class_23383.equals((Object)field013)) continue;
                field012.add(class_23383);
            }
        }
        if (!field012.isEmpty()) {
            return field012.stream().max(Comparator.comparingDouble(class_23382 -> class_23382.method_19770((class_2374)vFIDLaRMtWQsllROqPMh2hswB3ywrLyd.method_19538()))).orElse(null);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ boolean fowQDMEDTQbYONKNvvenKRrX8kkVufaI(class_2338 ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY, class_638 class_6382, boolean Th4KKPvwVIMYUHe5skMfnFLlv8pKnkEj, boolean NfI1Jdg4EVS23yTC03s1HZcIPphAgWIG) {
        class_2680 field014 = class_6382.method_8320(ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY);
        class_2248 field015 = field014.method_26204();
        class_2680 field016 = class_6382.method_8320(ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY.method_10084());
        return (NfI1Jdg4EVS23yTC03s1HZcIPphAgWIG && field014.method_45474() || field015.equals(class_2246.field_9987) || field015.equals(class_2246.field_10540)) && field016.method_45474() && !SecureClass0725.hstuU9kS217WQAqxAIF5fNlUUKNkN2BA(ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY.method_10084(), class_6382.method_8320(ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY).method_26194((class_1922)class_6382, ZOn1MkLWexxtrBBHwRVeqM6Ze7wqsOpY, class_3726.method_16194()), (class_1937)class_6382, !Th4KKPvwVIMYUHe5skMfnFLlv8pKnkEj);
    }

    @Nullable
    public static /* bridge */ /* synthetic */ class_2350 cfr_renamed_539(class_2338 ZccXfuitMFLVc3diKJQajB81mFXXqxkk, class_2338 YaXU9YoB91ceCySIO7E1EexcsFyeqxei) {
        class_2350[] class_2350Array = class_2350.values();
        int n = class_2350Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_2350 field017 = class_2350Array[n2];
            if (ZccXfuitMFLVc3diKJQajB81mFXXqxkk.method_10093(field017).equals((Object)YaXU9YoB91ceCySIO7E1EexcsFyeqxei) || YaXU9YoB91ceCySIO7E1EexcsFyeqxei.method_10093(field017).equals((Object)ZccXfuitMFLVc3diKJQajB81mFXXqxkk)) {
                return field017;
            }
            ++n2;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static /* bridge */ /* synthetic */ boolean vpktDl7TbvBdtvM0luNj3ncxwlZxgcU4(class_1792 XpFaQorbX4j3rUXy7hGnXE08feecHGHC) {
        void field018;
        block5: {
            block4: {
                if (!(XpFaQorbX4j3rUXy7hGnXE08feecHGHC instanceof class_1747)) break block4;
                class_1747 field019 = (class_1747)XpFaQorbX4j3rUXy7hGnXE08feecHGHC;
                if (SecureClass0725.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null) break block5;
            }
            return false;
        }
        class_2248 field020 = field018.method_7711();
        if (field020 instanceof class_2346) {
            return false;
        }
        return SecureClass0725.o41mRYLtb1nU45t8xp37JIpnieWm1Dg6(SecureClass0725.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, field020);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_219() {
        Iterator iterator = class_7923.field_41175.iterator();
        while (iterator.hasNext()) {
            class_2248 field021 = (class_2248)iterator.next();
            field003.add(field021);
        }
        return;
    }

    @NotNull
    public static /* bridge */ /* synthetic */ class_2338 ILvTJWE4AWaQX6pSSG5c4fFYDhBwzzYe(class_243 t7LhKjbM9AimQAEK748s4MmXQhdXjTti, class_243 S9eV75VSqI9hJ5G9k2GrbAGtOVyrg0v0) {
        class_243 field022 = new class_243(t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10216() + (S9eV75VSqI9hJ5G9k2GrbAGtOVyrg0v0.method_10216() - t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10216()) / 2.0, t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10214() + (S9eV75VSqI9hJ5G9k2GrbAGtOVyrg0v0.method_10214() - t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10214()) / 2.0, t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10215() + (S9eV75VSqI9hJ5G9k2GrbAGtOVyrg0v0.method_10215() - t7LhKjbM9AimQAEK748s4MmXQhdXjTti.method_10215()) / 2.0);
        return class_2338.method_49638((class_2374)field022);
    }

    public static /* bridge */ /* synthetic */ boolean vphIZc6xP93N2cLkZFVNFUDxw3FY0FrH(class_238 class_2383, class_1937 hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v, class_2338 ... class_2338Array) {
        boolean field023 = SecureClass0725.QC59Q5qOdZIiZjLbWF3PXaHb8BAkGuE2(hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v, class_2383);
        Set<class_2338> field024 = SecureClass0367.bqBdADVhcuTxTwTo5ooKaew3oX1ABrg8(class_2383, class_2383.field_1322 + 0.25);
        Set<class_2338> field025 = SecureClass0367.bqBdADVhcuTxTwTo5ooKaew3oX1ABrg8(class_2383, class_2383.field_1322 + 1.25);
        boolean field026 = !field024.stream().filter(wN7GQDCUdyj4ozwLoGar7TynFyjH6S7y -> SecureClass0725.cfr_renamed_541(wN7GQDCUdyj4ozwLoGar7TynFyjH6S7y, class_2338Array) && !hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v.method_8320(wN7GQDCUdyj4ozwLoGar7TynFyjH6S7y).method_26220((class_1922)hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v, wN7GQDCUdyj4ozwLoGar7TynFyjH6S7y).method_1110()).toList().isEmpty() || !field025.stream().filter(TF8BFIMOycq27Dxz1cqzITILeOpedkmN -> SecureClass0725.cfr_renamed_541(TF8BFIMOycq27Dxz1cqzITILeOpedkmN, class_2338Array) && !hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v.method_8320(TF8BFIMOycq27Dxz1cqzITILeOpedkmN).method_26220((class_1922)hjIs8g2D9VKDKyKG7mLDbpwSr88bip9v, TF8BFIMOycq27Dxz1cqzITILeOpedkmN).method_1110()).toList().isEmpty();
        return field026 && field023;
    }

    public static /* bridge */ /* synthetic */ boolean LaLvzPVVmdGH2dFO7dbYVty8qqoLdoCu(class_2680 class_26802) {
        if (class_26802.method_27852(class_2246.field_10540) || class_26802.method_27852(class_2246.field_22423) || class_26802.method_27852(class_2246.field_23152) || class_26802.method_27852(class_2246.field_38420)) {
            return false;
        }
        return class_26802.method_26223() != class_3619.field_15972;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_541(class_2338 QnzaQKb1yFwZ8EMGIMbYFKWKgOy9w5Ww, class_2338[] uqFMosRd94JN6mc8Jk2UN7utRE5xDh8l) {
        if (uqFMosRd94JN6mc8Jk2UN7utRE5xDh8l.length == 0) {
            return true;
        }
        return List.of(uqFMosRd94JN6mc8Jk2UN7utRE5xDh8l).contains(QnzaQKb1yFwZ8EMGIMbYFKWKgOy9w5Ww);
    }

    public static /* bridge */ /* synthetic */ class_265 cFVS8Cap9iP7SbOHNuigZh1WAUFLz7q5(class_638 meJgFfXOeMsT1J3n2uHx4QQWpYgOX2J2, class_2338 B6hBIEy3YKgMwfaJjxMnF6lgpSBpcSGS) {
        return class_2246.field_10340.method_9564().method_26220((class_1922)meJgFfXOeMsT1J3n2uHx4QQWpYgOX2J2, B6hBIEy3YKgMwfaJjxMnF6lgpSBpcSGS);
    }

    public static /* bridge */ /* synthetic */ boolean o41mRYLtb1nU45t8xp37JIpnieWm1Dg6(class_638 WYCo69RWsPwTqU6pFXA43heDO3y0OFo3, class_2248 KCQuuDxOAi1zCQxY68swUjzHAmJOe7AN) {
        class_265 field027 = KCQuuDxOAi1zCQxY68swUjzHAmJOe7AN.method_9564().method_26220((class_1922)WYCo69RWsPwTqU6pFXA43heDO3y0OFo3, class_2338.field_10980);
        return !field027.method_1110() && class_2246.field_10340.method_9564().method_26220((class_1922)WYCo69RWsPwTqU6pFXA43heDO3y0OFo3, class_2338.field_10980).equals(field027);
    }

    public static /* bridge */ /* synthetic */ int SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(double XyQA2PV1PHi1G0vxXOkLRTJeV9Lq9VOn) {
        int field028 = (int)XyQA2PV1PHi1G0vxXOkLRTJeV9Lq9VOn;
        return XyQA2PV1PHi1G0vxXOkLRTJeV9Lq9VOn < (double)field028 ? field028 - 1 : field028;
    }

    public static /* bridge */ /* synthetic */ boolean kJKrEOnLkaBfojrNxjbNJsRlbXUmdOxJ(class_1937 YfsSmxSablysCraJL4y7V5LbHPSFnAml, class_1657 It70cBoB1u0CE2CwXElgQ5zmRy6BOFOH) {
        if (It70cBoB1u0CE2CwXElgQ5zmRy6BOFOH == null) {
            return false;
        }
        class_238 field029 = It70cBoB1u0CE2CwXElgQ5zmRy6BOFOH.method_5829();
        int field030 = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1323);
        block0: while (field030 < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1320) + 1) {
            int field031 = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1322);
            while (true) {
                if (field031 < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1325) + 1) {
                } else {
                    ++field030;
                    continue block0;
                }
                for (int TMVJewUoN917n1K3xdR1i4pYzsqrPadw = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1321); TMVJewUoN917n1K3xdR1i4pYzsqrPadw < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(field029.field_1324) + 1; ++TMVJewUoN917n1K3xdR1i4pYzsqrPadw) {
                    class_265 field032;
                    class_2338 class_23382 = new class_2338(field030, field031, TMVJewUoN917n1K3xdR1i4pYzsqrPadw);
                    class_2680 field033 = YfsSmxSablysCraJL4y7V5LbHPSFnAml.method_8320(class_23382);
                    class_265 field034 = field033.method_26218((class_1922)YfsSmxSablysCraJL4y7V5LbHPSFnAml, class_23382);
                    if (field034.method_1110() || !field033.method_51366() || !class_259.method_1074((class_265)(field032 = field034.method_1096((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260())), (class_265)class_259.method_1078((class_238)field029), (class_247)class_247.field_16896)) continue;
                    return true;
                }
                ++field031;
            }
            break;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_542(class_2338 class_23382, class_746 gLkUS0N4FZcX2z3dx2Zy4mo8YzAtDB0P) {
        return field002.contains(gLkUS0N4FZcX2z3dx2Zy4mo8YzAtDB0P.field_17892.method_8320(class_23382).method_26204());
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_543(class_746 class_7462, class_2338 class_23382, class_2350 NTgnFZpdQpGXxXi3NkZYsqnH9uxcVVOO) {
        SecureClass0706.djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(ERhrG6EcMurkrwyd57DEtF8cge6MvBIc -> TE0ButXHaiMizisartHipQWEs2hgbA9W.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12968, class_23382, NTgnFZpdQpGXxXi3NkZYsqnH9uxcVVOO, ERhrG6EcMurkrwyd57DEtF8cge6MvBIc.intValue())));
        SecureClass0706.djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(tRnNUGk0IS1KBCm5CpIf7wrjvdvz3vK9 -> class_7462.field_3944.method_52787((class_2596)new class_2846(class_2846.class_2847.field_12973, class_23382, NTgnFZpdQpGXxXi3NkZYsqnH9uxcVVOO, tRnNUGk0IS1KBCm5CpIf7wrjvdvz3vK9.intValue())));
    }

    public static /* bridge */ /* synthetic */ boolean zU9h7uhPoevOpJ6C21Y4fUTlAiXUVbtZ(class_2338 class_23382, class_638 DuO4tpF7nFyCNlHK82nH9mXvxVX7h4Nb) {
        return SecureClass0725.fowQDMEDTQbYONKNvvenKRrX8kkVufaI(class_23382, DuO4tpF7nFyCNlHK82nH9mXvxVX7h4Nb, true, false);
    }

    public static /* bridge */ /* synthetic */ boolean hBsB2ZxcHtoOEbY2eGhf3wXde5Szm5Rp(class_1657 ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB, class_1937 AoDz7xCmacJB12u76MEooRF9E05znt31) {
        boolean bl = SecureClass0725.kJKrEOnLkaBfojrNxjbNJsRlbXUmdOxJ(AoDz7xCmacJB12u76MEooRF9E05znt31, ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB);
        Set<class_2338> field035 = SecureClass0367.ACtbNEFJTNkKw3qQ9wRtuqp05yypLIyD((class_1297)ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB, ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB.method_5829().field_1322 + 0.25);
        Set<class_2338> set = SecureClass0367.ACtbNEFJTNkKw3qQ9wRtuqp05yypLIyD((class_1297)ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB, ki6QT7BVonWy2ZJueg4IQ2SjGRA9FlWB.method_5829().field_1322 + 1.25);
        boolean bl2 = !field035.stream().filter(Uu8mjDOqv5C1Te96NEFY07WkG5FCHWym -> !AoDz7xCmacJB12u76MEooRF9E05znt31.method_8320(Uu8mjDOqv5C1Te96NEFY07WkG5FCHWym).method_26220((class_1922)AoDz7xCmacJB12u76MEooRF9E05znt31, Uu8mjDOqv5C1Te96NEFY07WkG5FCHWym).method_1110()).toList().isEmpty() || !set.stream().filter(MzFrYwAWwbXV5XD9CbLAOAxJ8m4hpBNb -> !AoDz7xCmacJB12u76MEooRF9E05znt31.method_8320(MzFrYwAWwbXV5XD9CbLAOAxJ8m4hpBNb).method_26220((class_1922)AoDz7xCmacJB12u76MEooRF9E05znt31, MzFrYwAWwbXV5XD9CbLAOAxJ8m4hpBNb).method_1110()).toList().isEmpty();
        return bl2 && bl;
    }

    public static /* bridge */ /* synthetic */ boolean uINE8zjOmjTm0HgULan2naWxmoKC0Kw5(class_2338 iP3W4rMn1PEXDpfYaOzCNuyW6p64p5iB, class_265 Z4IZYxJ8VDpq6nsk8Tskufp5PnDxHvWu, class_638 xMexgZm9lmCRbUt9atpUnTehXz8AH9Eb, boolean bl) {
        class_1297 field036;
        if (Z4IZYxJ8VDpq6nsk8Tskufp5PnDxHvWu.method_1110()) {
            return false;
        }
        class_265 field037 = Z4IZYxJ8VDpq6nsk8Tskufp5PnDxHvWu.method_1096((double)iP3W4rMn1PEXDpfYaOzCNuyW6p64p5iB.method_10263(), (double)iP3W4rMn1PEXDpfYaOzCNuyW6p64p5iB.method_10264(), (double)iP3W4rMn1PEXDpfYaOzCNuyW6p64p5iB.method_10260());
        Iterator<E> iterator = xMexgZm9lmCRbUt9atpUnTehXz8AH9Eb.method_8335(null, field037.method_1107()).iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            field036 = (class_1297)iterator.next();
        } while (!field036.field_23807 || field036.method_31481() || !class_259.method_1074((class_265)field037, (class_265)class_259.method_1078((class_238)SecureClass1057.a89HQ3YDopaBXrlJiBqao1zH7HIB0u4d(SecureClass0556.psV1BXOWMiipfk7whMmga2PnCUnmNGnV(field036))), (class_247)class_247.field_16896));
        if (bl && field036 instanceof class_1511) {
            class_1511 field038 = (class_1511)field036;
            if (AntiCheatModule.BsDYPJIRoBEmfyLUYlfVDDSKE9KHe7Rd()) {
                AutoCrystalModule.cfr_renamed_149(field038, false);
            }
            return true;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean QC59Q5qOdZIiZjLbWF3PXaHb8BAkGuE2(class_1937 b8hNHnQeFsvjuAbXopUdMLihWuYGBm5Y, class_238 class_2383) {
        int field039 = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1323);
        block0: while (field039 < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1320) + 1) {
            int n = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1322);
            while (true) {
                if (n < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1325) + 1) {
                } else {
                    ++field039;
                    continue block0;
                }
                for (int i = SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1321); i < SecureClass0725.SrlNEcoZYkLDoK45gz3vB2iz6V6C85BW(class_2383.field_1324) + 1; ++i) {
                    class_265 field040;
                    class_2338 field041 = new class_2338(field039, n, i);
                    class_2680 field042 = b8hNHnQeFsvjuAbXopUdMLihWuYGBm5Y.method_8320(field041);
                    class_265 field043 = field042.method_26218((class_1922)b8hNHnQeFsvjuAbXopUdMLihWuYGBm5Y, field041);
                    if (field043.method_1110() || !field042.method_51366() || !class_259.method_1074((class_265)(field040 = field043.method_1096((double)field041.method_10263(), (double)field041.method_10264(), (double)field041.method_10260())), (class_265)class_259.method_1078((class_238)class_2383), (class_247)class_247.field_16896)) continue;
                    return true;
                }
                ++n;
            }
            break;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean O5nVAdzxVkOWXKHdgZNpgQV1UiwgALpn(class_2338 j3k6CoZswU8hWi9egLhMhFVUiPWyscK8, class_1937 X0QRgwp0UKx8KlTDCfL4uEGqPl1fmwH3) {
        if (X0QRgwp0UKx8KlTDCfL4uEGqPl1fmwH3 == null) {
            return true;
        }
        class_2680 field044 = X0QRgwp0UKx8KlTDCfL4uEGqPl1fmwH3.method_8320(j3k6CoZswU8hWi9egLhMhFVUiPWyscK8);
        return !field044.method_26215() && !field044.method_45474();
    }

    public static /* bridge */ /* synthetic */ boolean eW8dHyMZtZEzB5KqtkJdSUVrEC3IZd8k(class_2338 class_23382, class_265 IYGBmnpHu02NWpPTflJwnsQnlopjyAGq, class_1657 SmMJa2gx8xmgm3LhRJnR9BEN6dIm3ilO, class_638 zaX1fKNAb4gBILmGe6RvP0FpPHt8AH6N, Predicate<class_1297> ZvRP3pfayYO3r7vRMDtJdXJCfBLURmv9, Consumer<class_1511> CDQSeumaPo0kXWYrXZvoYuaWSzCqYYNc, double eBTOYGKsZlQrvMxEGHYc6KHid7INUjUh) {
        if (IYGBmnpHu02NWpPTflJwnsQnlopjyAGq.method_1110()) {
            return false;
        }
        class_265 field045 = IYGBmnpHu02NWpPTflJwnsQnlopjyAGq.method_1096((double)class_23382.method_10263(), (double)class_23382.method_10264(), (double)class_23382.method_10260());
        boolean field046 = false;
        for (class_1297 CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc : zaX1fKNAb4gBILmGe6RvP0FpPHt8AH6N.method_8335(null, field045.method_1107())) {
            if (!CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc.field_23807 || CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc.method_31481() || !class_259.method_1074((class_265)field045, (class_265)class_259.method_1078((class_238)SecureClass1057.a89HQ3YDopaBXrlJiBqao1zH7HIB0u4d(SecureClass0556.psV1BXOWMiipfk7whMmga2PnCUnmNGnV(CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc))), (class_247)class_247.field_16896) || ZvRP3pfayYO3r7vRMDtJdXJCfBLURmv9.test(CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc)) continue;
            if (!(CbTuu9v7YgdEtIXiZ9e1ExcvCEasrWxc instanceof class_1511)) {
                return true;
            }
            field046 = true;
        }
        if (field046) {
            float field047 = Float.MAX_VALUE;
            class_1511 field048 = null;
            for (class_1511 vh9ovvrjlDvlZ5R6XHZrC9NMpWlMr8sK : SecureClass0556.aTRF6jYJIReDNgpsQ4dfgzi5x6RRqEbG(SmMJa2gx8xmgm3LhRJnR9BEN6dIm3ilO, zaX1fKNAb4gBILmGe6RvP0FpPHt8AH6N, eBTOYGKsZlQrvMxEGHYc6KHid7INUjUh)) {
                float field049 = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().LjCgBhocYl9uQcio5n6Lvzyr6tIzACD6().sy45TdlCiiCYhA5X5vg3QegzJCGX4sTz((class_1297)SmMJa2gx8xmgm3LhRJnR9BEN6dIm3ilO, (class_1937)zaX1fKNAb4gBILmGe6RvP0FpPHt8AH6N, (class_1297)vh9ovvrjlDvlZ5R6XHZrC9NMpWlMr8sK);
                if (!SecureClass0725.cfr_renamed_544(SmMJa2gx8xmgm3LhRJnR9BEN6dIm3ilO, field049) || !(field049 < field047)) continue;
                field047 = field049;
                field048 = vh9ovvrjlDvlZ5R6XHZrC9NMpWlMr8sK;
            }
            if (field048 == null) {
                return true;
            }
            CDQSeumaPo0kXWYrXZvoYuaWSzCqYYNc.accept(field048);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ String cfr_renamed_545(String Lp1ZNYZMDUVrsW37kGzwXX2DNNLnuGGO) {
        ArrayList<String> field050 = new ArrayList<String>();
        for (class_2248 class_22482 : field003) {
            String field051 = class_22482.method_9518().getString();
            if (!field051.toLowerCase().startsWith(Lp1ZNYZMDUVrsW37kGzwXX2DNNLnuGGO.toLowerCase())) continue;
            field050.add(field051);
        }
        if (field050.isEmpty()) {
            return null;
        }
        if (field050.size() == 1) {
            return (String)field050.getFirst();
        }
        return SecureClass0357.F9qYmBYAiQoGrbQkZMAH0Nhs3fwOgSPj(field050);
    }

    public static /* bridge */ /* synthetic */ boolean VV0scOfwYhBCh1PKGEg8oT8nI6wmmJJF(class_2338 H8RBVmu8ZwHnNh78xplpz4VT9qYetErE, class_1937 class_19372) {
        return class_19372.method_8320(H8RBVmu8ZwHnNh78xplpz4VT9qYetErE).method_26204().method_9520() < 35.0f;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_546(class_638 X5vo47fBWPGB1IYGpV5mbqmcuT82pJey, class_2338 class_23382) {
        return field001.contains(X5vo47fBWPGB1IYGpV5mbqmcuT82pJey.method_8320(class_23382).method_26204());
    }

    public static /* bridge */ /* synthetic */ long cfr_renamed_547(Object E8SoOcPi9YQsDGYEbPDeDIzqobP2iteO, class_2338 MpQBMkZ273njTg6o3xx8c0gBQFW6LWfT) {
        return Objects.hash(E8SoOcPi9YQsDGYEbPDeDIzqobP2iteO, MpQBMkZ273njTg6o3xx8c0gBQFW6LWfT);
    }

    public static /* bridge */ /* synthetic */ class_2338 jvpcrBluIsnNOsAHsBWpyDefoOYSEEWz(class_1937 class_19372, class_2338 field052) {
        if (class_19372.method_8320(field052).method_45474()) {
            return field052.method_10074();
        }
        return field052;
    }

    public static /* bridge */ /* synthetic */ class_2248 k6mAMgZcmNvBJg2AIP1WqwshFNGFFqe7(String Oy9pOBiOZxFKl7S91Q7QceDFD8BAiADC) {
        class_2248 field053;
        Iterator<class_2248> iterator = field003.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field053 = iterator.next()).method_9518().getString().equalsIgnoreCase(Oy9pOBiOZxFKl7S91Q7QceDFD8BAiADC));
        return field053;
    }

    public static /* bridge */ /* synthetic */ boolean vs7HbSYG1J1bUDCVyKEWav0wJLVolFn4(class_2338 Mj66S7jK5jbcy8yV4UWXvHhHmqLbnF6K, class_2338 okvfUmq4peQh24tmR8k2VqhXSTLcJngB) {
        class_2382[] class_2382Array = field004;
        int n = class_2382Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_2382 field054 = class_2382Array[n2];
            if (Mj66S7jK5jbcy8yV4UWXvHhHmqLbnF6K.method_10081(field054).equals((Object)okvfUmq4peQh24tmR8k2VqhXSTLcJngB)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ List<class_2248> UbZCPB1DIAp9LBejOGNF477VYWGTUgZz() {
        return field003;
    }

    public static /* bridge */ /* synthetic */ void LsWntEfNpXxes1JECEhaCidX8GaV04Gt(String sLXxfy6DORIWGf9hTRf59Ed0K4aJNcV1, Consumer<class_2248> VJhFGqAY7Ki3EH0gogkf2V0FwglP4pgU) {
        class_2248 field055;
        Iterator<class_2248> iterator = field003.iterator();
        do {
            if (iterator.hasNext()) continue;
            return;
        } while (!(field055 = iterator.next()).method_9518().getString().equalsIgnoreCase(sLXxfy6DORIWGf9hTRf59Ed0K4aJNcV1));
        VJhFGqAY7Ki3EH0gogkf2V0FwglP4pgU.accept(field055);
    }

    public static /* bridge */ /* synthetic */ class_2350 AYQ7YLfMq06zGl08DzLkm0Xgw3E0cHaS(class_2338 U6eGle4uImjDSIkVah37I83OSTT1qEK6, class_2338 MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx) {
        if (U6eGle4uImjDSIkVah37I83OSTT1qEK6.method_10264() > MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx.method_10264()) {
            return class_2350.field_11036;
        }
        if (U6eGle4uImjDSIkVah37I83OSTT1qEK6.method_10264() < MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx.method_10264()) {
            return class_2350.field_11033;
        }
        if (U6eGle4uImjDSIkVah37I83OSTT1qEK6.method_10263() > MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx.method_10263()) {
            return class_2350.field_11034;
        }
        if (U6eGle4uImjDSIkVah37I83OSTT1qEK6.method_10263() < MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx.method_10263()) {
            return class_2350.field_11039;
        }
        if (U6eGle4uImjDSIkVah37I83OSTT1qEK6.method_10260() > MBEx1CgkDQIm3AT619yJ5lJvVHPvWRMx.method_10260()) {
            return class_2350.field_11035;
        }
        return class_2350.field_11043;
    }

    public static /* bridge */ /* synthetic */ boolean hstuU9kS217WQAqxAIF5fNlUUKNkN2BA(class_2338 zkNIPEUUy0v18wxTxoOhbBZ303mLCEYS, class_265 pofXkCnYbkKFWakF4vrDkAFfOj8VNkC7, class_1937 QkutnVNG9gX1IK9ksE9h5XCKoeJ5iPRL, boolean UK9hq3BWt8HafpICSdCz6BVhj0XypE4W) {
        class_1297 field056;
        if (pofXkCnYbkKFWakF4vrDkAFfOj8VNkC7.method_1110()) {
            return false;
        }
        class_265 field057 = pofXkCnYbkKFWakF4vrDkAFfOj8VNkC7.method_1096((double)zkNIPEUUy0v18wxTxoOhbBZ303mLCEYS.method_10263(), (double)zkNIPEUUy0v18wxTxoOhbBZ303mLCEYS.method_10264(), (double)zkNIPEUUy0v18wxTxoOhbBZ303mLCEYS.method_10260());
        Iterator<E> iterator = QkutnVNG9gX1IK9ksE9h5XCKoeJ5iPRL.method_8335(null, field057.method_1107()).iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            field056 = (class_1297)iterator.next();
        } while (!field056.field_23807 || field056.method_31481() || !class_259.method_1074((class_265)field057, (class_265)class_259.method_1078((class_238)SecureClass1057.a89HQ3YDopaBXrlJiBqao1zH7HIB0u4d(SecureClass0556.psV1BXOWMiipfk7whMmga2PnCUnmNGnV(field056))), (class_247)class_247.field_16896) || UK9hq3BWt8HafpICSdCz6BVhj0XypE4W && field056 instanceof class_1511);
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean WGeilZcSF5edJoz6tvTMrm4tCgvlUAQf(class_2338 dD0kWj1vY7hflVTBsLFpEKLR7RRVBi8q, class_2338 DYzRNte1BNvn53aHwISgEzEGWehdhR3X) {
        class_2350[] class_2350Array = class_2350.values();
        int n = class_2350Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_2350 field058 = class_2350Array[n2];
            if (dD0kWj1vY7hflVTBsLFpEKLR7RRVBi8q.method_10093(field058).equals((Object)DYzRNte1BNvn53aHwISgEzEGWehdhR3X)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public /* synthetic */ SecureClass0725() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_544(class_1657 class_16572, float yhOYz9kA7jpo8drOr6tcn2DeWAgKE5Hh) {
        return yhOYz9kA7jpo8drOr6tcn2DeWAgKE5Hh < SecureClass0556.yEz6AFzBnNdMGz3Y66OFIwD2OhMDCPwO((class_1309)class_16572);
    }

    static {
        field003 = new ArrayList<class_2248>();
        field002 = new ArrayList<class_2248>(List.of(class_2246.field_10540, class_2246.field_9987, class_2246.field_22423, class_2246.field_22108, class_2246.field_10443));
        field001 = Set.of(class_2246.field_9987, class_2246.field_10525, class_2246.field_10395, class_2246.field_10398, class_2246.field_10499);
        field004 = new class_2382[]{new class_2382(1, 0, 1), new class_2382(1, 0, -1), new class_2382(-1, 0, 1), new class_2382(-1, 0, -1)};
    }
}

