/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group031;

import com.google.common.base.Predicates;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1935;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2744;
import net.minecraft.class_3532;
import net.minecraft.class_5575;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import org.apache.commons.lang3.mutable.MutableObject;
import org.earthhack.ducks.IEntity;
import org.phobos.secure.group004.AntiBotModule;
import org.phobos.secure.group008.XL5lf4UaREAh9Ieo37uVgvuLPCam1sHq;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group041.SecureClass0722;
import org.phobos.secure.group022.SecureClass0367;
import org.phobos.secure.group022.SecureClass0357;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group042.SecureClass0754;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0556
implements SecureInterface0134 {
    public static final /* synthetic */ List<class_1299<?>> field001;

    @SafeVarargs
    public static /* bridge */ /* synthetic */ class_1657 cfr_renamed_835(class_638 XCw28cbrL7Zp7Ps32VAICUOWQgS25bDF, class_746 class_7462, SecureClass0242 MsuU93VSFPiUgWhuZr5pM2rs3rcndAqw, double PYN4FOCEQWjwgnt1KeNbzmF3zu7b0HRA, Predicate<class_1657> ... X5Z3PpSkc7jS1YCWmu9FFALPFZxVHpfl) {
        if (XCw28cbrL7Zp7Ps32VAICUOWQgS25bDF == null || class_7462 == null) {
            return null;
        }
        ArrayList<class_1657> field002 = new ArrayList<class_1657>();
        com.google.common.base.Predicate field003 = X5Z3PpSkc7jS1YCWmu9FFALPFZxVHpfl.length == 1 ? X5Z3PpSkc7jS1YCWmu9FFALPFZxVHpfl[0] : Predicates.alwaysTrue();
        Iterator<E> iterator = XCw28cbrL7Zp7Ps32VAICUOWQgS25bDF.method_18456().iterator();
        while (iterator.hasNext()) {
            class_1657 field004 = (class_1657)iterator.next();
            if (field004 == class_7462 || MsuU93VSFPiUgWhuZr5pM2rs3rcndAqw.CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(field004.method_5667()) || field004.method_7337() || field004.method_7325() || !field004.method_5805() || (double)class_7462.method_5739((class_1297)field004) > PYN4FOCEQWjwgnt1KeNbzmF3zu7b0HRA || !field003.test(field004)) continue;
            field002.add(field004);
        }
        return field002.stream().min(Comparator.comparingDouble(arg_0 -> ((class_746)class_7462).method_5739(arg_0))).orElse(null);
    }

    public static /* bridge */ /* synthetic */ Iterable<class_1511> aTRF6jYJIReDNgpsQ4dfgzi5x6RRqEbG(class_1657 XycsZiI8koEG20GU7eLn0swu9lkBsGLa, class_638 QMDEXlgWyLKF57mOEwb00iCvhAjE8Vrg, double d) {
        return QMDEXlgWyLKF57mOEwb00iCvhAjE8Vrg.method_18023((class_5575)class_1299.field_6110, SecureClass0367.f3KnkM2iJIbQhUer41UCsw7UrZxj77OU((class_1297)XycsZiI8koEG20GU7eLn0swu9lkBsGLa, 8.0), IoPtAtCwrYGiMvUYifiUb11vRRxeXiT5 -> IoPtAtCwrYGiMvUYifiUb11vRRxeXiT5.method_5805() && SecureClass0556.ppnoA6lgHTCBfxsJnkjWtLsVg5OB4kPI(XycsZiI8koEG20GU7eLn0swu9lkBsGLa, (class_1297)IoPtAtCwrYGiMvUYifiUb11vRRxeXiT5, d) && QMDEXlgWyLKF57mOEwb00iCvhAjE8Vrg.method_8621().method_11952(IoPtAtCwrYGiMvUYifiUb11vRRxeXiT5.method_24515()));
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_219() {
        Iterator iterator = class_7923.field_41177.iterator();
        while (iterator.hasNext()) {
            class_1299 field005 = (class_1299)iterator.next();
            field001.add(field005);
        }
        return;
    }

    public static /* bridge */ /* synthetic */ <T extends class_1297> List<T> HhEalSwU3aLw7cy8fMW3RvvcT4jDDyFA(class_638 U9oldohEXn23ky1p4UPZjY8Ca7YFwMm9, Class<T> ztgbwF1Z8gZ8EGVqVyZXG2g2rJvPjwrV, class_238 PtQx9DLdwiIQCnqqqXCL8zA5hQAd5SgA, Predicate<T> LNQejShMgX0mkSLrciYj9eXsPuc4qnUo) {
        return U9oldohEXn23ky1p4UPZjY8Ca7YFwMm9.method_8335(null, PtQx9DLdwiIQCnqqqXCL8zA5hQAd5SgA).stream().filter(vwA80RITGRkgbXJAWeuCU5khPSp4vRcK -> {
            if (ztgbwF1Z8gZ8EGVqVyZXG2g2rJvPjwrV.isInstance(vwA80RITGRkgbXJAWeuCU5khPSp4vRcK)) {
                class_1297 field006 = vwA80RITGRkgbXJAWeuCU5khPSp4vRcK;
                return LNQejShMgX0mkSLrciYj9eXsPuc4qnUo.test(field006);
            }
            return false;
        }).map(FHSeC1CnUmnTL6LFKwtNg40bdkMlUG4J -> FHSeC1CnUmnTL6LFKwtNg40bdkMlUG4J).toList();
    }

    public static /* bridge */ /* synthetic */ float yEz6AFzBnNdMGz3Y66OFIwD2OhMDCPwO(class_1309 wq72mZlEpzbKaMRrxwCJLCLOxUc2cdrj) {
        return wq72mZlEpzbKaMRrxwCJLCLOxUc2cdrj.method_6032() + wq72mZlEpzbKaMRrxwCJLCLOxUc2cdrj.method_6067();
    }

    public static /* bridge */ /* synthetic */ boolean rppUgVxmjKR0vuTI6ASehF5RLha8Ey63(class_746 BOPIEvH5kRfIlMt5PbxvuVLORIxQCnPf, class_1297 qSE6CSMGWhplWBRxhreeRF7GR9GjvkKd) {
        class_243 class_2432 = BOPIEvH5kRfIlMt5PbxvuVLORIxQCnPf.method_33571();
        class_243 class_2433 = qSE6CSMGWhplWBRxhreeRF7GR9GjvkKd.method_5631(0.0f, qSE6CSMGWhplWBRxhreeRF7GR9GjvkKd.method_5791());
        class_243 field007 = class_2432.method_1035(qSE6CSMGWhplWBRxhreeRF7GR9GjvkKd.method_19538());
        field007 = new class_243(field007.field_1352, 0.0, field007.field_1350).method_1029();
        return field007.method_1026(class_2433) < 0.0;
    }

    public static /* bridge */ /* synthetic */ boolean LnLUau7Eep800ke47D72i86aMK0IGrKi(SecureClass0242 NgLHPpR0xSOZFCyQrTJGhR5ctmisqQ9H, class_1657 IrUkkhbxp2c7burdNImGLZyWIcU7bYgA, class_1657 class_16572, double d) {
        return SecureClass0556.cfr_renamed_836(NgLHPpR0xSOZFCyQrTJGhR5ctmisqQ9H, IrUkkhbxp2c7burdNImGLZyWIcU7bYgA, class_16572) && IrUkkhbxp2c7burdNImGLZyWIcU7bYgA.method_5858((class_1297)class_16572) <= d * d;
    }

    public static /* bridge */ /* synthetic */ boolean jRMK2hmvsQm9DfY6smLnOUYTQL7cWDJ7(class_1309 uCwxWUoODKaakLp3R5ZEXIXnWM89kCYp) {
        return !uCwxWUoODKaakLp3R5ZEXIXnWM89kCYp.method_5805() || uCwxWUoODKaakLp3R5ZEXIXnWM89kCYp.method_29504();
    }

    public static /* bridge */ /* synthetic */ void bl4grQpVe6ROPfyURso7LeLGuzexY0gJ(class_1297 class_12972, double Jd8GhECg2RcufUwO3fWSaXddeBnyXspB, double rlkJ71m0b8lQKlCWW9NLd5V4jmshev0p, double d) {
        class_12972.method_5814(Jd8GhECg2RcufUwO3fWSaXddeBnyXspB, rlkJ71m0b8lQKlCWW9NLd5V4jmshev0p, d);
        class_12972.field_6038 = Jd8GhECg2RcufUwO3fWSaXddeBnyXspB;
        class_12972.field_5971 = rlkJ71m0b8lQKlCWW9NLd5V4jmshev0p;
        class_12972.field_5989 = d;
        class_12972.field_6014 = Jd8GhECg2RcufUwO3fWSaXddeBnyXspB;
        class_12972.field_6036 = rlkJ71m0b8lQKlCWW9NLd5V4jmshev0p;
        class_12972.field_5969 = d;
    }

    static {
        field001 = new ArrayList<class_1299<?>>();
    }

    /*
     * WARNING - void declaration
     */
    public static /* bridge */ /* synthetic */ void cfr_renamed_837(class_2744 xFO1xFRQpXOGqiyTJNFW8zD43SuAWO5b, class_1937 oHhPKeFUaRZDMD626zwoCjgPQfkBERkv, XL5lf4UaREAh9Ieo37uVgvuLPCam1sHq LQwmsbJw97cxGqTl0WDcEoMnnjypxxr9) {
        void field008;
        List field009 = xFO1xFRQpXOGqiyTJNFW8zD43SuAWO5b.method_30145();
        class_1297 field010 = oHhPKeFUaRZDMD626zwoCjgPQfkBERkv.method_8469(xFO1xFRQpXOGqiyTJNFW8zD43SuAWO5b.method_11820());
        if (!(field010 instanceof class_1309)) {
            return;
        }
        class_1309 field011 = (class_1309)field010;
        class_1799 field012 = field008.method_6047();
        class_1799 field013 = field008.method_6079();
        MutableObject field014 = new MutableObject((Object)class_1799.field_8037);
        MutableObject field015 = new MutableObject((Object)class_1799.field_8037);
        Iterator<E> iterator = field009.iterator();
        block4: while (true) {
            if (!iterator.hasNext()) {
                LQwmsbJw97cxGqTl0WDcEoMnnjypxxr9.cfr_renamed_838(field012, (class_1799)field014.getValue(), field013, (class_1799)field015.getValue());
                return;
            }
            Pair field016 = (Pair)iterator.next();
            class_1304 class_13042 = (class_1304)field016.getFirst();
            class_1799 field017 = (class_1799)field016.getSecond();
            if (class_13042.method_46643()) continue;
            switch (class_13042) {
                case field_6173: {
                    field014.setValue((Object)new class_1799((class_1935)field012.method_7909(), field017.method_7947()));
                    break;
                }
                case field_6171: {
                    field015.setValue((Object)new class_1799((class_1935)field013.method_7909(), field017.method_7947()));
                    continue block4;
                }
            }
        }
    }

    public static /* bridge */ /* synthetic */ double lNnAUMAWoe4GIGRnNEkfPW1rJeZKzaT1(class_1297 wCvbPgqzY8AQ5wvRNomvujLJrj9r0Ynp) {
        double field018 = wCvbPgqzY8AQ5wvRNomvujLJrj9r0Ynp.method_23317() - wCvbPgqzY8AQ5wvRNomvujLJrj9r0Ynp.field_6014;
        double field019 = wCvbPgqzY8AQ5wvRNomvujLJrj9r0Ynp.method_23321() - wCvbPgqzY8AQ5wvRNomvujLJrj9r0Ynp.field_5969;
        double field020 = Math.sqrt(field018 * field018 + field019 * field019) / 1000.0;
        double field021 = 1.388888888888889E-5;
        return SecureClass0754.j3fRBLoZcKzfRTRtKjnxUy6YYPbmfo8U(field020 / field021, 2);
    }

    public static /* bridge */ /* synthetic */ boolean fCUev7dtJpWCMCfvfiNWKAXEd53FVwbI(class_1309 kbPIqDemhE8mhYw4VJOZ2n4qsGnb18fg) {
        if (kbPIqDemhE8mhYw4VJOZ2n4qsGnb18fg instanceof class_746) {
            class_746 field022 = (class_746)kbPIqDemhE8mhYw4VJOZ2n4qsGnb18fg;
            return SecureClass0722.NSlM0s5P2OtWgxzkW0kXhBLW6JKg36Ng(field022);
        }
        return kbPIqDemhE8mhYw4VJOZ2n4qsGnb18fg.method_6128();
    }

    public static /* bridge */ /* synthetic */ boolean E7kSCaebikDmzJp1JUS5jlvZYiY7kg89(class_1309 C1kRG4lZsa0cz4xQiWCBZVLnh0SDdbHy) {
        if (C1kRG4lZsa0cz4xQiWCBZVLnh0SDdbHy instanceof class_746) {
            class_746 field023 = (class_746)C1kRG4lZsa0cz4xQiWCBZVLnh0SDdbHy;
            return SecureClass0722.cfr_renamed_531(field023);
        }
        return C1kRG4lZsa0cz4xQiWCBZVLnh0SDdbHy.method_6128();
    }

    public static /* bridge */ /* synthetic */ boolean VVWrzbxqzPbZj3HgMSjzEE8ij6hH4kLp(class_1657 iswEqspjJVx7WhjnNKtbfBuTktHIqsS4) {
        class_1799 field024;
        Iterator<T> iterator = iswEqspjJVx7WhjnNKtbfBuTktHIqsS4.method_5661().iterator();
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while ((field024 = (class_1799)iterator.next()).method_7960());
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean ppnoA6lgHTCBfxsJnkjWtLsVg5OB4kPI(class_1657 tK00HZDYEKwWOp7JwRjxWnhktjAfpGlv, class_1297 UK0rHUrtxKBnHKhzNh3bIlRzRmZN33V8, double HKz8LGMLAQ9WEuaGlobpWW7sypSl21mZ) {
        return UK0rHUrtxKBnHKhzNh3bIlRzRmZN33V8.method_5829().method_49271(tK00HZDYEKwWOp7JwRjxWnhktjAfpGlv.method_33571()) < class_3532.method_33723((double)HKz8LGMLAQ9WEuaGlobpWW7sypSl21mZ);
    }

    public static /* bridge */ /* synthetic */ class_238 psV1BXOWMiipfk7whMmga2PnCUnmNGnV(class_1297 MZqs41fAgh6Ji0tcZRuIQ28gD0xbgaNa) {
        SecureClass0242 field025 = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ();
        return field025.JWVpSoXOfKd84tNqqiKiHGg4TwnxZMGL().bPpNPOr8swLX2Ec0TgDS1JbA9xWBFEMj(MZqs41fAgh6Ji0tcZRuIQ28gD0xbgaNa, field025.JWVpSoXOfKd84tNqqiKiHGg4TwnxZMGL().b8PvYeotfYdSAqlwNJxbfhWhTkDj3VT9(MZqs41fAgh6Ji0tcZRuIQ28gD0xbgaNa));
    }

    public static /* bridge */ /* synthetic */ double bVHjwK6CKodhon1UDB2npkjD2sLcpa4E(class_1297 bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo) {
        double field026 = bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.method_23317() - bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.field_6014;
        double field027 = bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.method_23318() - bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.field_6036;
        double field028 = bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.method_23321() - bsEEJHvgozgSMTLSwRymY4jv3sBcX2mo.field_5969;
        return new class_243(field026 *= 20.0, field027 *= 20.0, field028 *= 20.0).method_37267();
    }

    public static /* bridge */ /* synthetic */ String cfr_renamed_545(String fLukOepLH5qt22eh7DGakNdodX0Pb9Vt) {
        ArrayList<String> field029 = new ArrayList<String>();
        for (class_1299<?> pNz2AvZLhUy0LRlOabExL21q87zASQDJ : field001) {
            String field030 = pNz2AvZLhUy0LRlOabExL21q87zASQDJ.method_5897().getString();
            if (!field030.toLowerCase().startsWith(fLukOepLH5qt22eh7DGakNdodX0Pb9Vt.toLowerCase())) continue;
            field029.add(field030);
        }
        if (field029.isEmpty()) {
            return null;
        }
        if (field029.size() == 1) {
            return (String)field029.getFirst();
        }
        return SecureClass0357.F9qYmBYAiQoGrbQkZMAH0Nhs3fwOgSPj(field029);
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_836(SecureClass0242 t5LX8F57EQaEaU4cyIBv44FAl802xilM, class_1657 M6u8vzTgVEHUECWnK6wjmRZ3QZu6t4PC, class_1657 ppd1rZXNPDHOnJjpH728L8fIqkw0F21M) {
        IEntity field031;
        if (ppd1rZXNPDHOnJjpH728L8fIqkw0F21M instanceof IEntity && (field031 = (IEntity)ppd1rZXNPDHOnJjpH728L8fIqkw0F21M).isClientSide()) {
            return false;
        }
        return M6u8vzTgVEHUECWnK6wjmRZ3QZu6t4PC != null && ppd1rZXNPDHOnJjpH728L8fIqkw0F21M != null && !SecureClass0556.jRMK2hmvsQm9DfY6smLnOUYTQL7cWDJ7((class_1309)ppd1rZXNPDHOnJjpH728L8fIqkw0F21M) && !M6u8vzTgVEHUECWnK6wjmRZ3QZu6t4PC.equals((Object)ppd1rZXNPDHOnJjpH728L8fIqkw0F21M) && !t5LX8F57EQaEaU4cyIBv44FAl802xilM.CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(ppd1rZXNPDHOnJjpH728L8fIqkw0F21M.method_5667()) && !ppd1rZXNPDHOnJjpH728L8fIqkw0F21M.method_7337() && !ppd1rZXNPDHOnJjpH728L8fIqkw0F21M.method_7325() && !AntiBotModule.oUmImCJmnh8lEelrq6ryD0RIKWVbO86w((class_1297)ppd1rZXNPDHOnJjpH728L8fIqkw0F21M);
    }

    public static /* bridge */ /* synthetic */ class_1299<?> tvAPKPj0oMr4AqdS3GTt2dYi5mxniKL1(String fDhMaFJiuPX7nRXRLcBS5G0uY1qRNODx) {
        class_1299<?> field032;
        Iterator<class_1299<?>> iterator = field001.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field032 = iterator.next()).method_5897().getString().equalsIgnoreCase(fDhMaFJiuPX7nRXRLcBS5G0uY1qRNODx));
        return field032;
    }

    public /* synthetic */ SecureClass0556() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ Optional<class_640> MwbMcenN38vp6VCshzannxd3FvySoKAs(String mWHCcQ7mUHQ6DVUACCHYVYrZfNlP9Sg5) {
        if (P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1562() == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1562().method_2874(mWHCcQ7mUHQ6DVUACCHYVYrZfNlP9Sg5));
    }

    public static /* bridge */ /* synthetic */ class_1657 cfr_renamed_839(class_638 lY1t3nkxDJqq9RQ3lSuaA2lDPjoEn3x3, class_746 class_7462, SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        if (lY1t3nkxDJqq9RQ3lSuaA2lDPjoEn3x3 == null || class_7462 == null) {
            return null;
        }
        ArrayList<class_1657> field033 = new ArrayList<class_1657>();
        Iterator<E> iterator = lY1t3nkxDJqq9RQ3lSuaA2lDPjoEn3x3.method_18456().iterator();
        while (iterator.hasNext()) {
            class_1657 field034 = (class_1657)iterator.next();
            if (field034 == class_7462 || ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(field034.method_5667()) || field034.method_7337() || field034.method_7325() || !field034.method_5805()) continue;
            field033.add(field034);
        }
        return field033.stream().min(Comparator.comparingDouble(arg_0 -> ((class_746)class_7462).method_5739(arg_0))).orElse(null);
    }
}

