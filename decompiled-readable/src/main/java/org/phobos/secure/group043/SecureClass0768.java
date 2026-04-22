/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group043;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import net.minecraft.class_1293;
import net.minecraft.class_1309;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1733;
import net.minecraft.class_1735;
import net.minecraft.class_1743;
import net.minecraft.class_1747;
import net.minecraft.class_1767;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_1935;
import net.minecraft.class_2248;
import net.minecraft.class_2371;
import net.minecraft.class_2480;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_3532;
import net.minecraft.class_4174;
import net.minecraft.class_5321;
import net.minecraft.class_7225;
import net.minecraft.class_7923;
import net.minecraft.class_9279;
import net.minecraft.class_9323;
import net.minecraft.class_9326;
import net.minecraft.class_9334;
import net.minecraft.class_9335;
import net.minecraft.class_9362;
import org.apache.commons.lang3.mutable.MutableInt;
import org.jetbrains.annotations.NotNull;
import org.phobos.mixin.game.ui.IContainerComponent;
import org.phobos.secure.group024.IlBryHj4wWJ4muTtK9wuc58G27yTww7z;
import org.phobos.secure.group022.SecureClass0357;
import org.phobos.secure.group031.SecureClass0544;
import org.phobos.secure.group031.j28ApMKtkVInnLaBQFfa69ZZze8ajbyh;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0768
implements SecureInterface0134 {
    public static final /* synthetic */ List<class_1792> field001;
    public static final /* synthetic */ List<class_1792> field002;
    public static final /* synthetic */ List<class_1792> field003;

    public static /* bridge */ /* synthetic */ void cfr_renamed_52(class_1799 tdLIsiLWO8ltqvqY1dCCbDPJ1UH2aABM, class_1799[] CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA) {
        block3: {
            class_9279 field004;
            class_9323 field005;
            block2: {
                Arrays.fill(CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA, class_1799.field_8037);
                field005 = tdLIsiLWO8ltqvqY1dCCbDPJ1UH2aABM.method_57353();
                if (!field005.method_57832(class_9334.field_49622)) break block2;
                IContainerComponent field006 = (IContainerComponent)field005.method_57829(class_9334.field_49622);
                class_2371<class_1799> class_23712 = field006.getStacks();
                for (int i = 0; i < class_23712.size(); ++i) {
                    if (i >= CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA.length) continue;
                    CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA[i] = (class_1799)class_23712.get(i);
                }
                break block3;
            }
            if (!field005.method_57832(class_9334.field_49611) || !(field004 = (class_9279)field005.method_57829(class_9334.field_49611)).method_57450("Items")) break block3;
            class_2499 field007 = (class_2499)field004.method_57463().method_10580("Items");
            for (int bYSUcoY8RujfC7P3rRJBRj7qzxisYl6Q = 0; bYSUcoY8RujfC7P3rRJBRj7qzxisYl6Q < field007.size(); ++bYSUcoY8RujfC7P3rRJBRj7qzxisYl6Q) {
                byte field008 = field007.method_10602(bYSUcoY8RujfC7P3rRJBRj7qzxisYl6Q).method_10571("Slot");
                if (field008 < 0 || field008 >= CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA.length) continue;
                CD1tIu1vwHX4B90tDC3gmpMP3QuDCiGA[field008] = class_1799.method_57359((class_7225.class_7874)SecureClass0768.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_56673(), (class_2487)field007.method_10602(bYSUcoY8RujfC7P3rRJBRj7qzxisYl6Q));
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean bPI8u8yLsYvaD9weBCvZvNg8ICdsQJUH(class_1799 vhhD1iyAcN6BYUPDHRo5lMI69MlcQ4RW) {
        return SecureClass0544.eI5BWOZocV6c6bHny27km2xjpFpXKqym(vhhD1iyAcN6BYUPDHRo5lMI69MlcQ4RW, (class_5321<class_1887>)class_1893.field_9118) >= 50;
    }

    public static /* bridge */ /* synthetic */ class_1792 tahYHnAa5NugoOAVgB4fbLjlco2vBSTH(String RIFba9QuG01vsd0G1d3BNR7uMn06D0iL) {
        class_1792 class_17922;
        Iterator<class_1792> iterator = field002.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(class_17922 = iterator.next()).method_7848().getString().equalsIgnoreCase(RIFba9QuG01vsd0G1d3BNR7uMn06D0iL));
        return class_17922;
    }

    @NotNull
    public static /* bridge */ /* synthetic */ String gBrQ8u0zRBTMRzEsODeqIsBJvkvQiJvj(String BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ, int aStM58EX85wtDyCbzck7nrw2mMwC4p87) {
        return switch (BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ = BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ.replaceAll("minecraft:", "")) {
            case "mending", "aqua_affinity", "channeling", "silk_touch", "flame", "infinity", "multishot", "vanishing_curse", "binding_curse" -> {
                char field009 = BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ.charAt(0);
                yield (Character.toUpperCase(field009) + BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ.substring(1)).substring(0, 3);
            }
            default -> {
                char field010 = BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ.charAt(0);
                yield (Character.toUpperCase(field010) + BqFApF7MfrwcKpJYsgPbqlApiBRkTZSZ.substring(1)).substring(0, 2) + aStM58EX85wtDyCbzck7nrw2mMwC4p87;
            }
        };
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_264(class_1799 mzVvCSRl7A58jqEAw9pHjRgn0ZiwsRNa) {
        class_1743 field011;
        class_1792 class_17922;
        return mzVvCSRl7A58jqEAw9pHjRgn0ZiwsRNa.method_7909() instanceof class_9362 || (class_17922 = mzVvCSRl7A58jqEAw9pHjRgn0ZiwsRNa.method_7909()) instanceof class_1743 && (field011 = (class_1743)class_17922).method_7848() != null && (field011.method_7848().getString().contains("1.21 Mace") || mzVvCSRl7A58jqEAw9pHjRgn0ZiwsRNa.method_57824(class_9334.field_49631) != null);
    }

    public static /* bridge */ /* synthetic */ List<class_1735> hB1TEpRfnNZ6KwQr7yuILe7pKM5T4ZNb(class_1703 KH1N3fa5B8RGBdVM5wTDVTewEKx1Yl3E) {
        ArrayList<class_1735> arrayList = new ArrayList<class_1735>();
        int n = 0;
        while (n < KH1N3fa5B8RGBdVM5wTDVTewEKx1Yl3E.field_7761.size()) {
            arrayList.add(KH1N3fa5B8RGBdVM5wTDVTewEKx1Yl3E.method_7611(n));
            ++n;
        }
        return arrayList;
    }

    public /* synthetic */ SecureClass0768() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_905(class_1792 md7i0NZtx9Gfd74PmN6gKdZ0yymBAPOw) {
        return field003.contains(md7i0NZtx9Gfd74PmN6gKdZ0yymBAPOw);
    }

    public static /* bridge */ /* synthetic */ List<class_1735> gBgFmVt9OQzrcB6nOvyBqFrdVGLzMpWo(class_1707 hUtBCmJX9sorTI6zdExDcOSW3sFdVq5k) {
        ArrayList<class_1735> field012 = new ArrayList<class_1735>();
        int field013 = 0;
        while (field013 < hUtBCmJX9sorTI6zdExDcOSW3sFdVq5k.method_7629().method_5439()) {
            field012.add(hUtBCmJX9sorTI6zdExDcOSW3sFdVq5k.method_7611(field013));
            ++field013;
        }
        return field012;
    }

    public static /* bridge */ /* synthetic */ class_1799 EOEXm0euh1q4ZVHc9tS1lvsDDceBl6T7(class_1792 iCNU4jSgZrRUeb80MFwdP9cF0kfxS6au, int JwnVXDUMn3tgtUCdNt9OKmKGg8M0zjtw, Consumer<class_9323.class_9324> C5muTQrRtms5BLKLSWr4LQGtqfEDvvvv) {
        class_9323.class_9324 field014 = j28ApMKtkVInnLaBQFfa69ZZze8ajbyh.bFo9KKOwccOfrKpXe8Er2vjQs368XEZT(C5muTQrRtms5BLKLSWr4LQGtqfEDvvvv, class_9323.method_57827());
        class_9326 field015 = class_9326.field_49588;
        class_9335 class_93352 = class_9335.method_57935((class_9323)field014.method_57838(), (class_9326)field015);
        return new class_1799((class_1935)iCNU4jSgZrRUeb80MFwdP9cF0kfxS6au, JwnVXDUMn3tgtUCdNt9OKmKGg8M0zjtw, class_93352);
    }

    public static /* bridge */ /* synthetic */ boolean n57n7ABz3KhUHvNIaXHAd5f4bV6lvEOa(class_1309 ZThU6VvJd0PWobLWzXAfEnaWIz2aFuUV, class_1792 yTJwoRbh5V29AL9zqHRVMcLYkRMzV7YG) {
        return ZThU6VvJd0PWobLWzXAfEnaWIz2aFuUV.method_6047().method_31574(yTJwoRbh5V29AL9zqHRVMcLYkRMzV7YG) || ZThU6VvJd0PWobLWzXAfEnaWIz2aFuUV.method_6079().method_31574(yTJwoRbh5V29AL9zqHRVMcLYkRMzV7YG);
    }

    public static /* bridge */ /* synthetic */ float fbtcN1DXi95CKF8pN9NVJJyktwdMxmgA(class_1799 kQMM1tYMMiBbu7bV5G76sDjyIriWdD1D) {
        return (float)(kQMM1tYMMiBbu7bV5G76sDjyIriWdD1D.method_7936() - kQMM1tYMMiBbu7bV5G76sDjyIriWdD1D.method_7919()) / (float)kQMM1tYMMiBbu7bV5G76sDjyIriWdD1D.method_7936() * 100.0f;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_51(class_1799 kWG2vlzSnJDDHK0ZNO9rrugR5JmeueCS) {
        IContainerComponent field016 = (IContainerComponent)kWG2vlzSnJDDHK0ZNO9rrugR5JmeueCS.method_57824(class_9334.field_49622);
        if (field016 != null && !field016.getStacks().isEmpty()) {
            return true;
        }
        class_2487 field017 = ((class_9279)kWG2vlzSnJDDHK0ZNO9rrugR5JmeueCS.method_57825(class_9334.field_49611, (Object)class_9279.field_49302)).method_57463();
        return field017 != null && field017.method_10573("Items", 9);
    }

    static {
        field002 = new ArrayList<class_1792>();
        field003 = List.of(class_1802.field_8279, class_1802.field_8512, class_1802.field_8046, class_1802.field_8186, class_1802.field_8515, class_1802.field_8229, class_1802.field_8179, class_1802.field_8726, class_1802.field_8233, class_1802.field_8429, class_1802.field_8176, class_1802.field_8544, class_1802.field_8373, class_1802.field_8347, class_1802.field_8261, class_1802.field_8752, class_1802.field_8509, class_1802.field_8423, class_1802.field_8551, class_1802.field_8367, class_1802.field_8463, class_1802.field_8071, class_1802.field_20417, class_1802.field_8497, class_1802.field_8208, class_1802.field_8748, class_1802.field_8635, class_1802.field_8389, class_1802.field_8567, class_1802.field_8323, class_1802.field_8741, class_1802.field_8504, class_1802.field_8308, class_1802.field_8511, class_1802.field_8209, class_1802.field_8680, class_1802.field_8766, class_1802.field_16998, class_1802.field_28659, class_1802.field_8846, class_1802.field_50140, class_1802.field_8255, class_1802.field_8574, class_1802.field_8103);
        field001 = List.of(class_1802.field_8279, class_1802.field_8512, class_1802.field_8046, class_1802.field_8186, class_1802.field_8515, class_1802.field_8229, class_1802.field_8179, class_1802.field_8726, class_1802.field_8233, class_1802.field_8429, class_1802.field_8176, class_1802.field_8544, class_1802.field_8373, class_1802.field_8347, class_1802.field_8261, class_1802.field_8752, class_1802.field_8509, class_1802.field_8423, class_1802.field_8551, class_1802.field_8367, class_1802.field_8463, class_1802.field_8071, class_1802.field_20417, class_1802.field_8497, class_1802.field_8208, class_1802.field_8748, class_1802.field_8635, class_1802.field_8389, class_1802.field_8567, class_1802.field_8323, class_1802.field_8741, class_1802.field_8504, class_1802.field_8308, class_1802.field_8511, class_1802.field_8209, class_1802.field_8680, class_1802.field_8766, class_1802.field_16998, class_1802.field_28659, class_1802.field_8846, class_1802.field_50140);
    }

    public static /* bridge */ /* synthetic */ List<class_1735> TqKEgZuUxgHka4VneQ7gmJieeCYhJGNa(class_1733 Ht0yAfaGhdxqEjsIU3n7PbhauG0NB13a) {
        ArrayList<class_1735> field018 = new ArrayList<class_1735>();
        int field019 = 0;
        while (field019 < 27) {
            field018.add(Ht0yAfaGhdxqEjsIU3n7PbhauG0NB13a.method_7611(field019));
            ++field019;
        }
        return field018;
    }

    public static /* bridge */ /* synthetic */ void LsWntEfNpXxes1JECEhaCidX8GaV04Gt(String IgOcLYaDh8AWrGFEirPSC4TcG90pmbRC, Consumer<class_1792> p1wJZr1QCc2VH1KQPzU5zKi9mLgtA0wI) {
        class_1792 field020;
        Iterator<class_1792> iterator = field002.iterator();
        do {
            if (iterator.hasNext()) continue;
            return;
        } while (!(field020 = iterator.next()).method_7848().getString().equalsIgnoreCase(IgOcLYaDh8AWrGFEirPSC4TcG90pmbRC));
        p1wJZr1QCc2VH1KQPzU5zKi9mLgtA0wI.accept(field020);
    }

    public static /* bridge */ /* synthetic */ String cfr_renamed_545(String V2TwsJxP0b0wMvV93yA6Nb6NVpvVbRdR) {
        ArrayList<String> field021 = new ArrayList<String>();
        for (class_1792 ujjJnCIG0CtnkQtXZmF60DnaCbcNWBDV : field002) {
            String field022 = ujjJnCIG0CtnkQtXZmF60DnaCbcNWBDV.method_7848().getString();
            if (!field022.toLowerCase().startsWith(V2TwsJxP0b0wMvV93yA6Nb6NVpvVbRdR.toLowerCase())) continue;
            field021.add(field022);
        }
        if (field021.isEmpty()) {
            return null;
        }
        if (field021.size() == 1) {
            return (String)field021.getFirst();
        }
        return SecureClass0357.F9qYmBYAiQoGrbQkZMAH0Nhs3fwOgSPj(field021);
    }

    public static /* bridge */ /* synthetic */ boolean sitxd7zhZre5KKvAnSWfrd4JcUBxuNDd(class_1792 JP3Q3vEUrkJpAnFFXGdC6lMtIOXrxt7I) {
        return field003.contains(JP3Q3vEUrkJpAnFFXGdC6lMtIOXrxt7I);
    }

    public static /* bridge */ /* synthetic */ boolean fMOtnuH4xJrlDampUpX0b2vtXCYWybY5(class_1792 O2PoBJZciwK9w1FPeawfnOFIzjcrmQ3B) {
        return field001.contains(O2PoBJZciwK9w1FPeawfnOFIzjcrmQ3B);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_219() {
        for (class_1792 keprWzZiA9gUMeKgptLSj5rQfMjqwcD1 : class_7923.field_41178) {
            field002.add(keprWzZiA9gUMeKgptLSj5rQfMjqwcD1);
        }
        Iterator iterator = class_7923.field_41175.iterator();
        while (iterator.hasNext()) {
            class_2248 field023 = (class_2248)iterator.next();
            field002.add(field023.method_8389());
        }
        return;
    }

    public static /* bridge */ /* synthetic */ boolean qu8twzxs8eY4IgI2T0wBFk8e6GWtXmby(class_1792 tcyxD0yPDcap3ZhSV68PNTnkZjNuSqUZ) {
        return tcyxD0yPDcap3ZhSV68PNTnkZjNuSqUZ instanceof class_1829 || tcyxD0yPDcap3ZhSV68PNTnkZjNuSqUZ instanceof class_1743 || tcyxD0yPDcap3ZhSV68PNTnkZjNuSqUZ instanceof class_9362;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_906(class_1799 WP6RgSvqCOjqAC9lsTEdBgwAGmVwR0X9) {
        class_1799[] class_1799Array = new class_1799[27];
        SecureClass0768.cfr_renamed_52(WP6RgSvqCOjqAC9lsTEdBgwAGmVwR0X9, class_1799Array);
        class_1799[] class_1799Array2 = class_1799Array;
        int n = class_1799Array2.length;
        int n2 = 0;
        while (n2 < n) {
            class_1799 field024 = class_1799Array2[n2];
            if (!field024.method_7960() && field024.method_7909() instanceof class_1829 && SecureClass0544.vmxDZ3mWnSBgDotif4kjfXb0c9TNm6nc(field024, (class_5321<class_1887>)class_1893.field_9118) && SecureClass0768.bPI8u8yLsYvaD9weBCvZvNg8ICdsQJUH(field024)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ double cfr_renamed_907(class_1799 YmFSch0I13VulPlSrH11bAnnsNuneeKa) {
        return (double)YmFSch0I13VulPlSrH11bAnnsNuneeKa.method_7947() / (double)YmFSch0I13VulPlSrH11bAnnsNuneeKa.method_7914() * 100.0;
    }

    public static /* bridge */ /* synthetic */ int cbubvljpu3ZbkCqIZXgUbTLN2Bc10Ysh(class_4174 fPXpYLfRXsMdn1ThRz5OqoIMztGWNZP0) {
        MutableInt field025 = new MutableInt(0);
        field025.add((Number)Float.valueOf((float)fPXpYLfRXsMdn1ThRz5OqoIMztGWNZP0.comp_2491() * fPXpYLfRXsMdn1ThRz5OqoIMztGWNZP0.comp_2492()));
        Iterator<E> iterator = fPXpYLfRXsMdn1ThRz5OqoIMztGWNZP0.comp_2495().iterator();
        while (iterator.hasNext()) {
            class_4174.class_9423 class_94232 = (class_4174.class_9423)iterator.next();
            if (class_94232.comp_2497() < 1.0f) continue;
            class_1293 field026 = class_94232.comp_2496();
            if (IlBryHj4wWJ4muTtK9wuc58G27yTww7z.dIGMjoDknoeowRZBwmgQwggV28m4MX8E(field026)) {
                field025.add(-(100 * field026.method_5578()));
                continue;
            }
            if (!IlBryHj4wWJ4muTtK9wuc58G27yTww7z.g9M6G2neQQVnHMS8XqtsgmuHNCPwuSJQ(field026)) continue;
            field025.add(100 * field026.method_5578());
        }
        return field025.getValue();
    }

    public static /* bridge */ /* synthetic */ Color sHGh8LZZRl3q7NB6fA6rV8DcvwlbYVVx(class_1799 vDwCFGEI0HRWEk6kanuGTwfFS25unwMJ) {
        class_1747 field027;
        class_2248 field028;
        class_1792 class_17922 = vDwCFGEI0HRWEk6kanuGTwfFS25unwMJ.method_7909();
        if (class_17922 instanceof class_1747 && (field028 = (field027 = (class_1747)class_17922).method_7711()) instanceof class_2480) {
            class_2480 field029 = (class_2480)field028;
            class_1767 field030 = field029.method_10528();
            if (field030 == null) {
                return Color.WHITE;
            }
            int field031 = field030.method_7787();
            float field032 = field031 >> 16 & 0xFF;
            float field033 = field031 >> 8 & 0xFF;
            float field034 = field031 & 0xFF;
            return new Color(class_3532.method_15363((float)field032, (float)0.0f, (float)1.0f), class_3532.method_15363((float)field033, (float)0.0f, (float)1.0f), class_3532.method_15363((float)field034, (float)0.0f, (float)1.0f), 1.0f);
        }
        return Color.WHITE;
    }

    public static /* bridge */ /* synthetic */ boolean uaQdA1SjKNF2uFy7m5GkOcvnLQU6ZJhs(class_1799 class_17992) {
        return class_17992.method_57824(class_9334.field_50075) != null;
    }
}

