/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group016;

import java.awt.Color;
import org.phobos.secure.group061.SecureAnnotation0009;
import org.phobos.secure.group042.SecureClass0754;
import org.phobos.secure.group050.SecureClass0898;

public final class SecureClass0271 {
    public static /* bridge */ /* synthetic */ int KOJVC19Lmj3A9IEq6TzCIJwCHAM9m9OL(double d, double d2) {
        return (int)(((double)System.currentTimeMillis() / d + d2) % 360.0);
    }

    public static /* bridge */ /* synthetic */ Color JbnPKVp8U30KoZlCyQbB5jW3FShEge1Z(double aaZuSZqzf56nxWz3o7hjoMj7MV1hyXPL, double in5jxlAIncPFk8teyMfqd7F6ffb713bx, Color color, Color sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, Color color2, Color DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5) {
        int field001 = (int)(((double)System.currentTimeMillis() / aaZuSZqzf56nxWz3o7hjoMj7MV1hyXPL + in5jxlAIncPFk8teyMfqd7F6ffb713bx) % 360.0);
        float field002 = (float)field001 / 360.0f;
        if (field002 < 0.25f) {
            return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(color, sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, field002 * 4.0f);
        }
        if (field002 < 0.5f) {
            return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, color2, (field002 - 0.25f) * 4.0f);
        }
        if (field002 < 0.75f) {
            return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(color2, DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5, (field002 - 0.5f) * 4.0f);
        }
        return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5, color, (field002 - 0.75f) * 4.0f);
    }

    @SecureAnnotation0009(value="colors.length = 2...4")
    public static /* bridge */ /* synthetic */ Color pz4pqnOFH7ipeh0Vjup1mlOWSArfYYaC(double sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, double d, Color ... Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV) {
        if (Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV == null) {
            throw new IllegalArgumentException();
        }
        return switch (Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV.length) {
            case 2 -> SecureClass0271.or8tbVjlw7n1ZSzdhaRHNZ6JKnZQMdY7(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1]);
            case 3 -> SecureClass0271.pp0nit3cf2RH2fuDxoljuSMRdC6yMZlU(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[2]);
            case 4 -> SecureClass0271.JbnPKVp8U30KoZlCyQbB5jW3FShEge1Z(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[2], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[3]);
            default -> throw new IllegalArgumentException();
        };
    }

    public static /* bridge */ /* synthetic */ Color pp0nit3cf2RH2fuDxoljuSMRdC6yMZlU(double d, double kgQznQ5VUc95HPENmHRfu24KotTXc6Xx, Color Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, Color PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, Color qXQGDSbJjdB6670tJalgqVIOUyPvcNot) {
        int field003 = (int)(((double)System.currentTimeMillis() / d + kgQznQ5VUc95HPENmHRfu24KotTXc6Xx) % 360.0);
        float field004 = (float)field003 / 360.0f;
        if (field004 < 0.33333334f) {
            return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, field004 * 3.0f);
        }
        if (field004 < 0.6666667f) {
            return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, qXQGDSbJjdB6670tJalgqVIOUyPvcNot, (field004 - 0.33333334f) * 3.0f);
        }
        return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(qXQGDSbJjdB6670tJalgqVIOUyPvcNot, Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, (field004 - 0.6666667f) * 3.0f);
    }

    public /* synthetic */ SecureClass0271() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ Color MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(Color qy08M8VMjJHYaNVMGwdHYXPKQXbqI1Fh, Color TsWwJJy1FE020lxpa5ZmTJ5WnO6xPyrY, float xhLCGK0UEWTzrrgY1kDcq3SyWZP4acHT) {
        return SecureClass0898.PixjPDDantYECOvNCr76PWCE8WxLvxwX(qy08M8VMjJHYaNVMGwdHYXPKQXbqI1Fh, TsWwJJy1FE020lxpa5ZmTJ5WnO6xPyrY, SecureClass0754.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(xhLCGK0UEWTzrrgY1kDcq3SyWZP4acHT, 0.0f, 1.0f));
    }

    public static /* bridge */ /* synthetic */ Color or8tbVjlw7n1ZSzdhaRHNZ6JKnZQMdY7(double X3PnBkRAvQGuyQ41f3AVWvS2wDuh82tR, double pGHLTJqKi9AfP06bztS7rW5eFfLzOsn4, Color dD1RZr6KiwxMQ77fTUqPFs9DV6D8JjWJ, Color dl03OVAjZr3OJvjhEfuxYxQK4zOwbFrq) {
        int field005 = SecureClass0271.KOJVC19Lmj3A9IEq6TzCIJwCHAM9m9OL(X3PnBkRAvQGuyQ41f3AVWvS2wDuh82tR, pGHLTJqKi9AfP06bztS7rW5eFfLzOsn4);
        int field006 = (field005 >= 180 ? 360 - field005 : field005) * 2;
        return SecureClass0271.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(dD1RZr6KiwxMQ77fTUqPFs9DV6D8JjWJ, dl03OVAjZr3OJvjhEfuxYxQK4zOwbFrq, (float)field006 / 360.0f);
    }
}

