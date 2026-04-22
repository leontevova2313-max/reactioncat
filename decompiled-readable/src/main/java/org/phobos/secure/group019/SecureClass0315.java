/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_315;
import net.minecraft.class_3532;
import net.minecraft.class_743;
import net.minecraft.class_746;
import org.earthhack.ducks.IClientPlayerEntity;
import org.phobos.secure.group029.FreecamModule;
import org.phobos.secure.group063.TargetStrafeModule;
import org.phobos.secure.group022.SecureClass0376;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group037.FreeLookModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1025;

public final class SecureClass0315
implements SecureInterface0134 {
    public static /* synthetic */ boolean field001;
    public static /* synthetic */ boolean field002;
    public static /* synthetic */ boolean field003;
    public static /* synthetic */ boolean field004;
    public static /* synthetic */ boolean field005;

    public static /* bridge */ /* synthetic */ boolean TmjDtUDpl2ZcsEVIvVEmgr2UMUYa5X0A(class_1309 class_13092) {
        return class_13092.method_18798().method_1027() > 0.03;
    }

    public static /* bridge */ /* synthetic */ int pz9sl9fHik0jHWYsCgCHPtaWi5Aa8TOZ(class_746 oQrH2ivuLpDmVzpccYMElwPX7MoBgG6a) {
        return SecureClass1025.cfr_renamed_377(IClientPlayerEntity.class, oQrH2ivuLpDmVzpccYMElwPX7MoBgG6a).getGroundTicks();
    }

    public static /* bridge */ /* synthetic */ float VPlFoYpUKKX5Qu2qWie79onCJZxeInRP() {
        boolean field006 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1894.method_1434();
        boolean field007 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1881.method_1434();
        if (field006 && field007 || !field006 && !field007) {
            return 0.0f;
        }
        return field006 ? 1.0f : -1.0f;
    }

    public static /* bridge */ /* synthetic */ double[] PAYonbYqMlSYOW6QkViMtkhkgvaVcXuw(double Zq1xkLVDQGl936kTkBzJfoQzfi4HNIlr, float HdHoWJdUXOKSTZZekq2fyeFQ3CjZ5QqE) {
        float field008 = 1.0f;
        float field009 = 0.0f;
        double field010 = Math.sin(Math.toRadians(HdHoWJdUXOKSTZZekq2fyeFQ3CjZ5QqE + 90.0f));
        double field011 = Math.cos(Math.toRadians(HdHoWJdUXOKSTZZekq2fyeFQ3CjZ5QqE + 90.0f));
        double field012 = (double)field008 * Zq1xkLVDQGl936kTkBzJfoQzfi4HNIlr * field011 + (double)field009 * Zq1xkLVDQGl936kTkBzJfoQzfi4HNIlr * field010;
        double field013 = (double)field008 * Zq1xkLVDQGl936kTkBzJfoQzfi4HNIlr * field010 - (double)field009 * Zq1xkLVDQGl936kTkBzJfoQzfi4HNIlr * field011;
        return new double[]{field012, field013};
    }

    public static /* bridge */ /* synthetic */ int L9osqBT76uozhKJw1L3sPv42zkAOlwGl(boolean TPvs657V1cIz4dLHXZOFMDDbvMtwRgsF, boolean bl) {
        if (TPvs657V1cIz4dLHXZOFMDDbvMtwRgsF && bl || !TPvs657V1cIz4dLHXZOFMDDbvMtwRgsF && !bl) {
            return 0;
        }
        return TPvs657V1cIz4dLHXZOFMDDbvMtwRgsF ? 1 : -1;
    }

    public static /* bridge */ /* synthetic */ boolean DsUfY9n6nDcQkG6b0vsUKmO7GELppIyV() {
        class_315 field014 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690;
        return (field014.field_1881.method_1434() || field014.field_1894.method_1434() || field014.field_1849.method_1434() || field014.field_1913.method_1434()) && !FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ boolean GQJEtCbEdyLB9Z6MMeCl9ujOSKI3of5S() {
        if (SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return false;
        }
        return SecureClass0315.RUdScnIwiZe1aynWnVMULaiqy5pb8NzL(SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724);
    }

    public static /* bridge */ /* synthetic */ boolean w7V6tsBYq020nMpS2tKwLqpqqhG7WFKp() {
        return SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1832.method_1434();
    }

    public static /* bridge */ /* synthetic */ double[] ZscC6NpHKopXcjf854i4uWQCrPvoaPHO(class_746 oFuP53OyehuvMG4x87eLnIwucHCYvA9l, double aWqk8U37GjYmGS0Cswr9tWScEisGiSkO) {
        return SecureClass0315.grU999Vr2DAehhTH0lI0dH5flpcyUBis(oFuP53OyehuvMG4x87eLnIwucHCYvA9l, aWqk8U37GjYmGS0Cswr9tWScEisGiSkO, TargetStrafeModule.cfr_renamed_378(FreeLookModule.Mbr99cqw4vAGnf6i5J5WRjB7XMOlb0nh(oFuP53OyehuvMG4x87eLnIwucHCYvA9l)));
    }

    public static /* bridge */ /* synthetic */ double iOqSG8ji5SicVyq30KQucy0efDyvIa36(class_746 YrU2MYF889jxMw8uJhDNaDVF81170WNa) {
        return Math.hypot(YrU2MYF889jxMw8uJhDNaDVF81170WNa.method_18798().method_10216(), YrU2MYF889jxMw8uJhDNaDVF81170WNa.method_18798().method_10215());
    }

    public static /* bridge */ /* synthetic */ float[] obnIhXFuQiNHr4eN5OWAgvg307cbSYXb(class_746 qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ, float f) {
        float field015 = qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ.field_3913.field_3905;
        float field016 = qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ.field_3913.field_3907;
        float field017 = TargetStrafeModule.cfr_renamed_378(qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ.field_5982 + (qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ.method_36454() - qYm01lUxXeDfdlTEjdAxaU8JrSRfziKQ.field_5982) * P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false));
        if (field015 == 0.0f && field016 == 0.0f) {
            return new float[]{0.0f, 0.0f};
        }
        if (field015 != 0.0f) {
            if (field016 >= 1.0f) {
                field017 += field015 > 0.0f ? -45.0f : 45.0f;
                field016 = 0.0f;
            } else if (field016 <= -1.0f) {
                field017 += field015 > 0.0f ? 45.0f : -45.0f;
                field016 = 0.0f;
            }
            if (field015 > 0.0f) {
                field015 = 1.0f;
            } else if (field015 < 0.0f) {
                field015 = -1.0f;
            }
        }
        float field018 = (float)Math.cos(Math.toRadians(field017));
        float field019 = (float)(-Math.sin(Math.toRadians(field017)));
        return new float[]{field015 * f * field019 + field016 * f * field018, field015 * f * field018 - field016 * f * field019};
    }

    public static /* bridge */ /* synthetic */ float KoJgz6UfjLeQ5DyBfoyPyoc3QysTCpI7() {
        boolean field020 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1913.method_1434();
        boolean field021 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1849.method_1434();
        if (field020 && field021 || !field020 && !field021) {
            return 0.0f;
        }
        return field020 ? 1.0f : -1.0f;
    }

    public static /* bridge */ /* synthetic */ float mkTFy964orfPHxzj8aYu2LMgGoYyBmBf(boolean e04oBuJn71ZYNdyORumG6HDFrVfr6EhA) {
        boolean field022 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1903.method_1434();
        boolean field023 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1832.method_1434();
        if (!e04oBuJn71ZYNdyORumG6HDFrVfr6EhA) {
            return field022 && field023 || !field022 && !field023 ? 0.0f : (field022 ? -90.0f : 90.0f);
        }
        boolean field024 = SecureClass0315.DsUfY9n6nDcQkG6b0vsUKmO7GELppIyV();
        return field022 && field023 || !field022 && !field023 ? 0.0f : (field022 ? (field024 ? -45.0f : -90.0f) : (field024 ? 45.0f : 90.0f));
    }

    public static /* bridge */ /* synthetic */ int lXwffJKP0AegXmVPhu7muyuqUm9KJsf2(class_746 class_7462) {
        return SecureClass1025.cfr_renamed_377(IClientPlayerEntity.class, class_7462).GFohAU5AwqrYRLuq9JMja2RxLpEAy3Lo();
    }

    public static /* bridge */ /* synthetic */ double[] grU999Vr2DAehhTH0lI0dH5flpcyUBis(class_746 edqv6awsAPNZlZ53qvR5r9FNUA6HZgpX, double PiJeP9vlPQAMrpg50C8EEgwnkQdbf2U6, float B0qZ5IJRda58Xli8y2x2ZmxvYWXbmtLj) {
        float field025 = edqv6awsAPNZlZ53qvR5r9FNUA6HZgpX.field_3913.field_3905;
        float field026 = edqv6awsAPNZlZ53qvR5r9FNUA6HZgpX.field_3913.field_3907;
        if (field025 != 0.0f) {
            if (field026 > 0.0f) {
                B0qZ5IJRda58Xli8y2x2ZmxvYWXbmtLj += (float)(field025 > 0.0f ? -45 : 45);
            } else if (field026 < 0.0f) {
                B0qZ5IJRda58Xli8y2x2ZmxvYWXbmtLj += (float)(field025 > 0.0f ? 45 : -45);
            }
            field026 = 0.0f;
            if (field025 > 0.0f) {
                field025 = 1.0f;
            } else if (field025 < 0.0f) {
                field025 = -1.0f;
            }
        }
        double field027 = Math.sin(Math.toRadians(B0qZ5IJRda58Xli8y2x2ZmxvYWXbmtLj + 90.0f));
        double field028 = Math.cos(Math.toRadians(B0qZ5IJRda58Xli8y2x2ZmxvYWXbmtLj + 90.0f));
        double field029 = (double)field025 * PiJeP9vlPQAMrpg50C8EEgwnkQdbf2U6 * field028 + (double)field026 * PiJeP9vlPQAMrpg50C8EEgwnkQdbf2U6 * field027;
        double field030 = (double)field025 * PiJeP9vlPQAMrpg50C8EEgwnkQdbf2U6 * field027 - (double)field026 * PiJeP9vlPQAMrpg50C8EEgwnkQdbf2U6 * field028;
        return new double[]{field029, field030};
    }

    public /* synthetic */ SecureClass0315() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean RUdScnIwiZe1aynWnVMULaiqy5pb8NzL(class_746 BsG9DzqCrFMykORjBZb6J4nsloyfuMRo) {
        return BsG9DzqCrFMykORjBZb6J4nsloyfuMRo.field_3913.field_3905 != 0.0f || BsG9DzqCrFMykORjBZb6J4nsloyfuMRo.field_3913.field_3907 != 0.0f;
    }

    public static /* bridge */ /* synthetic */ double[] EeY50Ara3G6cXJKsh7nPPI7fvbwySr6A(double nqIvVqF0tcUg7wdebQLw9288O6msin9v) {
        if (SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return new double[]{0.0, 0.0};
        }
        float field031 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_36454();
        return SecureClass0315.cfr_renamed_379(nqIvVqF0tcUg7wdebQLw9288O6msin9v, field031);
    }

    public static /* bridge */ /* synthetic */ class_243 cfr_renamed_380(class_746 E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx) {
        double field032 = SecureClass0315.VPlFoYpUKKX5Qu2qWie79onCJZxeInRP();
        double field033 = SecureClass0315.KoJgz6UfjLeQ5DyBfoyPyoc3QysTCpI7();
        float field034 = TargetStrafeModule.cfr_renamed_378(E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx.field_5982 + (E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx.method_36454() - E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx.field_5982) * P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false));
        if (field032 == 0.0 && field033 == 0.0) {
            return new class_243(0.0, E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx.method_18798().field_1351, 0.0);
        }
        if (field032 != 0.0) {
            if (field033 > 0.0) {
                field034 += (float)(field032 > 0.0 ? -45 : 45);
            } else if (field033 < 0.0) {
                field034 += (float)(field032 > 0.0 ? 45 : -45);
            }
            field033 = 0.0;
            if (field032 > 0.0) {
                field032 = 1.0;
            } else if (field032 < 0.0) {
                field032 = -1.0;
            }
        }
        return new class_243(field032 * -Math.sin(Math.toRadians(field034)) + field033 * Math.cos(Math.toRadians(field034)), E1UPHWz6nAR8Z9xqWZWuF9aQL0G44Tjx.method_18798().field_1351, field032 * Math.cos(Math.toRadians(field034)) - field033 * -Math.sin(Math.toRadians(field034)));
    }

    public static /* bridge */ /* synthetic */ double cfr_renamed_381(class_746 class_7462) {
        double d = 1.0;
        double field035 = 1.0;
        if (class_7462.method_6059(class_1294.field_5904)) {
            double field036 = class_7462.method_6112(class_1294.field_5904).method_5578();
            d = 1.0 + 0.2 * (field036 + 1.0);
        }
        if (class_7462.method_6059(class_1294.field_5909)) {
            double field037 = class_7462.method_6112(class_1294.field_5909).method_5578();
            field035 = 1.0 + 0.2 * (field037 + 1.0);
        }
        return (double)0.2873f * d / field035;
    }

    public static /* bridge */ /* synthetic */ double vXbRjVu3XLvxXb816QfJl7LQV33KrWX8(class_746 k4UIS1j5eQvbxg2zbmxc6Gu1UO1XDiv5) {
        class_243 field038 = k4UIS1j5eQvbxg2zbmxc6Gu1UO1XDiv5.method_18798();
        return Math.sqrt(field038.method_10216() * field038.method_10216() + field038.method_10214() * field038.method_10214());
    }

    public static /* bridge */ /* synthetic */ void CNKuGsE015fAens6k4RBw9ygA1KIQkuL(SecureClass0376 ruh7fvwOKcMTO15Be5ifCLYUbGIFnGlU, class_746 class_7462, double JBflKMjqxeog3ejXErkHA6lPTtz08BT8) {
        double field039 = class_7462.field_3913.field_3905;
        double field040 = class_7462.field_3913.field_3907;
        float f = class_7462.method_36454();
        if (field039 == 0.0 && field040 == 0.0) {
            ruh7fvwOKcMTO15Be5ifCLYUbGIFnGlU.wvWB56dL61HqyhXFZLcVnN5uVvl3ZNmI(0.0);
            ruh7fvwOKcMTO15Be5ifCLYUbGIFnGlU.nHU70cDbWjwCYMKxwQDNvmvgRIkLd7hm(0.0);
        } else {
            if (field039 != 0.0) {
                if (field040 > 0.0) {
                    f += (float)(field039 > 0.0 ? -45 : 45);
                } else if (field040 < 0.0) {
                    f += (float)(field039 > 0.0 ? 45 : -45);
                }
                field040 = 0.0;
                if (field039 > 0.0) {
                    field039 = 1.0;
                } else if (field039 < 0.0) {
                    field039 = -1.0;
                }
            }
            double d = Math.sin(Math.toRadians(f + 90.0f));
            double d2 = Math.cos(Math.toRadians(f + 90.0f));
            ruh7fvwOKcMTO15Be5ifCLYUbGIFnGlU.wvWB56dL61HqyhXFZLcVnN5uVvl3ZNmI(field039 * JBflKMjqxeog3ejXErkHA6lPTtz08BT8 * d2 + field040 * JBflKMjqxeog3ejXErkHA6lPTtz08BT8 * d);
            ruh7fvwOKcMTO15Be5ifCLYUbGIFnGlU.nHU70cDbWjwCYMKxwQDNvmvgRIkLd7hm(field039 * JBflKMjqxeog3ejXErkHA6lPTtz08BT8 * d - field040 * JBflKMjqxeog3ejXErkHA6lPTtz08BT8 * d2);
        }
    }

    public static /* bridge */ /* synthetic */ boolean utM0K0xpNdRJGRG444XfgscAi4eLT2ot() {
        class_315 field041 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690;
        return (SecureClass0315.DsUfY9n6nDcQkG6b0vsUKmO7GELppIyV() || field041.field_1903.method_1434() || field041.field_1832.method_1434()) && !FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ void olsxdAB7C5JZuS8AMGaKVlB9G7MbMJza(class_746 fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm, float ZQZWZm8IWMZqYYZnR1mEsECDFK2NvDX3, boolean xK1ScjZEteuWDer9ThSkEEUGjyKVscmG) {
        double field042 = 1.0E-7;
        double field043 = Math.cos(Math.toRadians(ZQZWZm8IWMZqYYZnR1mEsECDFK2NvDX3 + 90.0f));
        double field044 = Math.sin(Math.toRadians(ZQZWZm8IWMZqYYZnR1mEsECDFK2NvDX3 + 90.0f));
        double field045 = fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm.method_23317() + field042 * field043;
        double field046 = fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm.method_23321() + field042 * field044;
        fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm.method_5814(field045, fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm.method_23318(), field046);
        if (xK1ScjZEteuWDer9ThSkEEUGjyKVscmG) {
            class_1657 field047 = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().wNPv83yyE4IngruIkAlIkRzROt17XsYe().ckroPckkfuUtLz3HqseAKqv7iLIBM0A7((class_1657)fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm);
            fyYJO4kUlOKmtCO6W6tIwIySK7yVjBvm.field_3944.method_52787((class_2596)new class_2828.class_2830(field045, field047.method_23318(), field046, field047.method_36454(), field047.method_36455(), field047.method_24828()));
        }
    }

    public static /* bridge */ /* synthetic */ float iL3G44T8XZZ2F1Aq6QzZzYqhQeug9uNA(class_746 BF5kadCeGSbRmEXl26sox4r8DyaWvGom) {
        return SecureClass0315.eJjQtLJElcRp3xHK7vUNZQwKGbK7YfCi(FreeLookModule.Mbr99cqw4vAGnf6i5J5WRjB7XMOlb0nh(BF5kadCeGSbRmEXl26sox4r8DyaWvGom), SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1894.method_1434(), SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1881.method_1434(), SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1849.method_1434(), SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.field_1913.method_1434());
    }

    public static /* bridge */ /* synthetic */ void RYuvGTgOp7SCXBBqC4P050wt9P8xf6EK(class_743 rNzfl7MJC2vo1ySnXJaBGzl04Q1yr844, float wOeHWjHqNIHrULtdSs2rBJh11oRlmhPT, float SqSLdmhwQQKTkbNMtSsT3vCZkzfHdAy8) {
        float field048 = rNzfl7MJC2vo1ySnXJaBGzl04Q1yr844.field_3905;
        float field049 = rNzfl7MJC2vo1ySnXJaBGzl04Q1yr844.field_3907;
        float f = (wOeHWjHqNIHrULtdSs2rBJh11oRlmhPT - SqSLdmhwQQKTkbNMtSsT3vCZkzfHdAy8) * ((float)Math.PI / 180);
        float field050 = class_3532.method_15362((float)f);
        float f2 = class_3532.method_15374((float)f);
        rNzfl7MJC2vo1ySnXJaBGzl04Q1yr844.field_3907 = Math.round(field049 * field050 - field048 * f2);
        rNzfl7MJC2vo1ySnXJaBGzl04Q1yr844.field_3905 = Math.round(field048 * field050 + field049 * f2);
    }

    public static /* bridge */ /* synthetic */ float eJjQtLJElcRp3xHK7vUNZQwKGbK7YfCi(float Mop0Sz1Nd2khRnRx7RZYKZKWlCU2znNc, boolean JJkW5XNqdZ9dKrSEd1OedpYh2mfCSunM, boolean wlOSR4Me0cK06iXL4gQHZcijQZ2PEmsI, boolean saM4VIfVU1EAYtAZAO7ZpsmkrolaczP4, boolean ylGjfdd6A7naJ2orTOxxyIPHs3xNk4VC) {
        float field051 = 0.0f;
        if (JJkW5XNqdZ9dKrSEd1OedpYh2mfCSunM) {
            if (saM4VIfVU1EAYtAZAO7ZpsmkrolaczP4) {
                field051 = 45.0f;
            } else if (ylGjfdd6A7naJ2orTOxxyIPHs3xNk4VC) {
                field051 = -45.0f;
            }
        } else if (wlOSR4Me0cK06iXL4gQHZcijQZ2PEmsI) {
            field051 = saM4VIfVU1EAYtAZAO7ZpsmkrolaczP4 ? 135.0f : (ylGjfdd6A7naJ2orTOxxyIPHs3xNk4VC ? -135.0f : 180.0f);
        } else if (saM4VIfVU1EAYtAZAO7ZpsmkrolaczP4) {
            field051 = 90.0f;
        } else if (ylGjfdd6A7naJ2orTOxxyIPHs3xNk4VC) {
            field051 = -90.0f;
        }
        return Mop0Sz1Nd2khRnRx7RZYKZKWlCU2znNc + field051;
    }

    public static /* bridge */ /* synthetic */ class_243 al7Mm2Z76H2h6cYVIejph69qwKSdv33O(class_746 OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA) {
        double field052 = OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.field_3913.field_3905;
        double field053 = OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.field_3913.field_3907;
        float field054 = TargetStrafeModule.cfr_renamed_378(OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.field_5982 + (OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.method_36454() - OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.field_5982) * P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false));
        if (field052 == 0.0 && field053 == 0.0) {
            return new class_243(0.0, OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.method_18798().field_1351, 0.0);
        }
        if (field052 != 0.0) {
            if (field053 > 0.0) {
                field054 += (float)(field052 > 0.0 ? -45 : 45);
            } else if (field053 < 0.0) {
                field054 += (float)(field052 > 0.0 ? 45 : -45);
            }
            field053 = 0.0;
            if (field052 > 0.0) {
                field052 = 1.0;
            } else if (field052 < 0.0) {
                field052 = -1.0;
            }
        }
        return new class_243(field052 * -Math.sin(Math.toRadians(field054)) + field053 * Math.cos(Math.toRadians(field054)), OR9qYMsRwR1akgmnfEN1L6aKxjxuSyXA.method_18798().field_1351, field052 * Math.cos(Math.toRadians(field054)) - field053 * -Math.sin(Math.toRadians(field054)));
    }

    public static /* bridge */ /* synthetic */ boolean URjhNIXKTeK0KkSNRwbCjnc19Gt5NEzR() {
        class_315 field055 = SecureClass0315.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690;
        return (SecureClass0315.DsUfY9n6nDcQkG6b0vsUKmO7GELppIyV() || field055.field_1903.method_1434()) && !FreecamModule.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ double[] cfr_renamed_379(double d, float irVbBJC4HHJ8ddc753K28fjOc1mfgxve) {
        double d2 = d * Math.sin(Math.toRadians(irVbBJC4HHJ8ddc753K28fjOc1mfgxve + 90.0f));
        double d3 = d * Math.cos(Math.toRadians(irVbBJC4HHJ8ddc753K28fjOc1mfgxve + 90.0f));
        return new double[]{d3, d2};
    }

    public static /* bridge */ /* synthetic */ boolean RriUVNHEJ5YAGtsR2MVXJzhemandiNXS(class_1657 haMzv2rFaYeEsEFHRM7URZdcrjS0wiwH, class_1937 class_19372) {
        class_238 field056 = haMzv2rFaYeEsEFHRM7URZdcrjS0wiwH.method_5829().method_1009((double)-0.3f, 0.0, (double)-0.3f);
        class_238 class_2383 = new class_238(field056.field_1323, field056.field_1322 - 0.5, field056.field_1321, field056.field_1320, field056.field_1322 - 0.25, field056.field_1324);
        return class_19372.method_20812((class_1297)haMzv2rFaYeEsEFHRM7URZdcrjS0wiwH, class_2383).iterator().hasNext();
    }
}

