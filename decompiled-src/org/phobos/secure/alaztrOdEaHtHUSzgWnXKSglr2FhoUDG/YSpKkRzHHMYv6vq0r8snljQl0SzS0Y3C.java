/*
 * Decompiled with CFR.
 */
package org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG;

import java.awt.Color;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B._2XeVtM6sy0iYN7SyAV5Dm8sUbKXe4qkd;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb._9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2;

public final class YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C {
    public static /* bridge */ /* synthetic */ int KOJVC19Lmj3A9IEq6TzCIJwCHAM9m9OL(double d, double d2) {
        return (int)(((double)System.currentTimeMillis() / d + d2) % 360.0);
    }

    public static /* bridge */ /* synthetic */ Color JbnPKVp8U30KoZlCyQbB5jW3FShEge1Z(double aaZuSZqzf56nxWz3o7hjoMj7MV1hyXPL, double in5jxlAIncPFk8teyMfqd7F6ffb713bx, Color color, Color sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, Color color2, Color DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5) {
        int Rr2iShibxk062Os5NckYWyae9bmdt2wI = (int)(((double)System.currentTimeMillis() / aaZuSZqzf56nxWz3o7hjoMj7MV1hyXPL + in5jxlAIncPFk8teyMfqd7F6ffb713bx) % 360.0);
        float Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J = (float)Rr2iShibxk062Os5NckYWyae9bmdt2wI / 360.0f;
        if (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J < 0.25f) {
            return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(color, sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J * 4.0f);
        }
        if (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J < 0.5f) {
            return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(sCYd612eWgV6BDFFGQHhTD8CazAFiPQz, color2, (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J - 0.25f) * 4.0f);
        }
        if (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J < 0.75f) {
            return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(color2, DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5, (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J - 0.5f) * 4.0f);
        }
        return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(DsNWcoeT8tu4Kqs4CJMGKOd81yGLEtG5, color, (Fh6OLsi0UBzvn382LszQvqbJvfpwKv7J - 0.75f) * 4.0f);
    }

    @_2XeVtM6sy0iYN7SyAV5Dm8sUbKXe4qkd(value="colors.length = 2...4")
    public static /* bridge */ /* synthetic */ Color pz4pqnOFH7ipeh0Vjup1mlOWSArfYYaC(double sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, double d, Color ... Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV) {
        if (Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV == null) {
            throw new IllegalArgumentException();
        }
        return switch (Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV.length) {
            case 2 -> YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.or8tbVjlw7n1ZSzdhaRHNZ6JKnZQMdY7(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1]);
            case 3 -> YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.pp0nit3cf2RH2fuDxoljuSMRdC6yMZlU(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[2]);
            case 4 -> YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.JbnPKVp8U30KoZlCyQbB5jW3FShEge1Z(sfDm64zwRFKZjZOoTC5zlmOBhB5FUmAL, d, Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[0], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[1], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[2], Ui1ehuIpgBfaQnU0dyAV3BAKym0NQKtV[3]);
            default -> throw new IllegalArgumentException();
        };
    }

    public static /* bridge */ /* synthetic */ Color pp0nit3cf2RH2fuDxoljuSMRdC6yMZlU(double d, double kgQznQ5VUc95HPENmHRfu24KotTXc6Xx, Color Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, Color PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, Color qXQGDSbJjdB6670tJalgqVIOUyPvcNot) {
        int eIsCuPjigB0hnOzik3CWpLCpdsFGKiVc = (int)(((double)System.currentTimeMillis() / d + kgQznQ5VUc95HPENmHRfu24KotTXc6Xx) % 360.0);
        float gxWTZVRYwr65w0NagLeTpMFrenNuAIzq = (float)eIsCuPjigB0hnOzik3CWpLCpdsFGKiVc / 360.0f;
        if (gxWTZVRYwr65w0NagLeTpMFrenNuAIzq < 0.33333334f) {
            return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, gxWTZVRYwr65w0NagLeTpMFrenNuAIzq * 3.0f);
        }
        if (gxWTZVRYwr65w0NagLeTpMFrenNuAIzq < 0.6666667f) {
            return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(PRbuTpkGzuF6S4l3Ocywf55R7dyMP8ER, qXQGDSbJjdB6670tJalgqVIOUyPvcNot, (gxWTZVRYwr65w0NagLeTpMFrenNuAIzq - 0.33333334f) * 3.0f);
        }
        return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(qXQGDSbJjdB6670tJalgqVIOUyPvcNot, Z8r83DZc8ToifjlnpakHLgSrlrCZ3Zpb, (gxWTZVRYwr65w0NagLeTpMFrenNuAIzq - 0.6666667f) * 3.0f);
    }

    public /* synthetic */ YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ Color MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(Color qy08M8VMjJHYaNVMGwdHYXPKQXbqI1Fh, Color TsWwJJy1FE020lxpa5ZmTJ5WnO6xPyrY, float xhLCGK0UEWTzrrgY1kDcq3SyWZP4acHT) {
        return _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.PixjPDDantYECOvNCr76PWCE8WxLvxwX(qy08M8VMjJHYaNVMGwdHYXPKQXbqI1Fh, TsWwJJy1FE020lxpa5ZmTJ5WnO6xPyrY, RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(xhLCGK0UEWTzrrgY1kDcq3SyWZP4acHT, 0.0f, 1.0f));
    }

    public static /* bridge */ /* synthetic */ Color or8tbVjlw7n1ZSzdhaRHNZ6JKnZQMdY7(double X3PnBkRAvQGuyQ41f3AVWvS2wDuh82tR, double pGHLTJqKi9AfP06bztS7rW5eFfLzOsn4, Color dD1RZr6KiwxMQ77fTUqPFs9DV6D8JjWJ, Color dl03OVAjZr3OJvjhEfuxYxQK4zOwbFrq) {
        int EZoE3nfiggXpMSMRCC9fiiTbwo6Kwdfj = YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.KOJVC19Lmj3A9IEq6TzCIJwCHAM9m9OL(X3PnBkRAvQGuyQ41f3AVWvS2wDuh82tR, pGHLTJqKi9AfP06bztS7rW5eFfLzOsn4);
        int xaXSyl4u0TrFVYSoJYjQ66QR5U5ni0en = (EZoE3nfiggXpMSMRCC9fiiTbwo6Kwdfj >= 180 ? 360 - EZoE3nfiggXpMSMRCC9fiiTbwo6Kwdfj : EZoE3nfiggXpMSMRCC9fiiTbwo6Kwdfj) * 2;
        return YSpKkRzHHMYv6vq0r8snljQl0SzS0Y3C.MeuIwubxt4LnxWhYpB93lEbG27ZimnEA(dD1RZr6KiwxMQ77fTUqPFs9DV6D8JjWJ, dl03OVAjZr3OJvjhEfuxYxQK4zOwbFrq, (float)xaXSyl4u0TrFVYSoJYjQ66QR5U5ni0en / 360.0f);
    }
}

