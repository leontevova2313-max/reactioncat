/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import net.minecraft.class_3532;
import net.minecraft.class_3883;
import net.minecraft.class_3887;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_591;
import net.minecraft.class_630;
import net.minecraft.class_742;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.phobos.secure.group001.CapesModule;
import org.phobos.secure.group025.SecureClass0442;
import org.phobos.secure.group029.SecureClass0520;
import org.phobos.secure.group021.SecureClass0348;
import org.phobos.secure.group045.SecureClass0795;

public class SecureClass0994
extends class_3887<class_742, class_591<class_742>> {
    public final /* synthetic */ class_630[] field001;
    public static final /* synthetic */ SecureClass0520 field002;
    public static final /* synthetic */ int field003 = 16;

    public static /* bridge */ /* synthetic */ void epI3FsGSPL5aaHPaChNgqEi7de2oXh2k(class_4588 clffyebGUKxqOXkgt4ETKDCwZgMvNS0v, Matrix4f BqotqEWPPgWBHi54ZAZ2WaoDkaWfqNiE, Matrix4f field006, float BknlQwKIm2BthADEWQPwXt6giMdwzHEv, float oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx, float LBbOyh727ooFjPfuRWQ9PQcUiEM7W90K, float field004, float field005, float EF2KsQHurLj9OFpXjBRDz7IzgbmxFT31, int jEXilfbvOFa8N5kTfShezJpMNqlVoexg, int n) {
        if (BknlQwKIm2BthADEWQPwXt6giMdwzHEv < field004) {
            field004 = BknlQwKIm2BthADEWQPwXt6giMdwzHEv = field004;
        }
        if (oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx < field005) {
            field005 = oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx = field005;
            field006 = BqotqEWPPgWBHi54ZAZ2WaoDkaWfqNiE = field006;
        }
        float field007 = 0.5f;
        float field008 = field007 / 16.0f;
        float field009 = 0.03125f + field008 * (float)(jEXilfbvOFa8N5kTfShezJpMNqlVoexg + 1);
        float field010 = 0.03125f + field008 * (float)jEXilfbvOFa8N5kTfShezJpMNqlVoexg;
        SecureClass0795 field011 = SecureClass0994.cfr_renamed_1004(field006, field006, BqotqEWPPgWBHi54ZAZ2WaoDkaWfqNiE, new SecureClass0795(BknlQwKIm2BthADEWQPwXt6giMdwzHEv, oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx, LBbOyh727ooFjPfuRWQ9PQcUiEM7W90K), new SecureClass0795(field004, oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx, LBbOyh727ooFjPfuRWQ9PQcUiEM7W90K), new SecureClass0795(BknlQwKIm2BthADEWQPwXt6giMdwzHEv, field005, EF2KsQHurLj9OFpXjBRDz7IzgbmxFT31), n == 0xF000F0);
        SecureClass0348.cfr_renamed_739(clffyebGUKxqOXkgt4ETKDCwZgMvNS0v, field006, BknlQwKIm2BthADEWQPwXt6giMdwzHEv, oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx, LBbOyh727ooFjPfuRWQ9PQcUiEM7W90K, 0.1875f, field009, class_4608.field_21444, n, field011.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field011.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field011.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(clffyebGUKxqOXkgt4ETKDCwZgMvNS0v, field006, field004, oyzNwemsfEvIuI35W8dwOpB3gUOM3LUx, LBbOyh727ooFjPfuRWQ9PQcUiEM7W90K, 0.34375f, field009, class_4608.field_21444, n, field011.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field011.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field011.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(clffyebGUKxqOXkgt4ETKDCwZgMvNS0v, BqotqEWPPgWBHi54ZAZ2WaoDkaWfqNiE, field004, field005, EF2KsQHurLj9OFpXjBRDz7IzgbmxFT31, 0.34375f, field010, class_4608.field_21444, n, field011.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field011.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field011.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(clffyebGUKxqOXkgt4ETKDCwZgMvNS0v, BqotqEWPPgWBHi54ZAZ2WaoDkaWfqNiE, BknlQwKIm2BthADEWQPwXt6giMdwzHEv, field005, EF2KsQHurLj9OFpXjBRDz7IzgbmxFT31, 0.1875f, field010, class_4608.field_21444, n, field011.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field011.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field011.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ void xtkRY7HVbSBvJHnkuM4w0YohJEzgd0Yk(class_4588 PSSbHWBeFcd6OOoZl7YvkhPEMyxbvRSE, Matrix4f Hjkwcta2EFnn3W1Un1WNyJ7Vl8s4AwhU, Matrix4f matrix4f, float BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8, float f, float u0j4tIAOUTNHuPyTneFZ7k56qTWIELMz, float f2, float field012, float LaaCU46RjbOutB8TMVOmRQcpvFSj0Vbh, int rwXvSlENuTOaUcWwQD4IxKeLR3pCY90y, int MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy) {
        if (BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8 < f2) {
            f2 = BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8 = f2;
        }
        if (f < field012) {
            field012 = f = field012;
            matrix4f = Hjkwcta2EFnn3W1Un1WNyJ7Vl8s4AwhU = matrix4f;
        }
        float field013 = 0.5f;
        float field014 = field013 / 16.0f;
        float field015 = 0.03125f + field014 * (float)(rwXvSlENuTOaUcWwQD4IxKeLR3pCY90y + 1);
        float field016 = 0.03125f + field014 * (float)rwXvSlENuTOaUcWwQD4IxKeLR3pCY90y;
        SecureClass0795 field017 = SecureClass0994.cfr_renamed_1004(matrix4f, matrix4f, Hjkwcta2EFnn3W1Un1WNyJ7Vl8s4AwhU, new SecureClass0795(BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8, field012, u0j4tIAOUTNHuPyTneFZ7k56qTWIELMz), new SecureClass0795(f2, field012, u0j4tIAOUTNHuPyTneFZ7k56qTWIELMz), new SecureClass0795(BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8, f, LaaCU46RjbOutB8TMVOmRQcpvFSj0Vbh), MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy == 0xF000F0);
        SecureClass0348.cfr_renamed_739(PSSbHWBeFcd6OOoZl7YvkhPEMyxbvRSE, matrix4f, BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8, field012, u0j4tIAOUTNHuPyTneFZ7k56qTWIELMz, 0.171875f, field016, class_4608.field_21444, MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy, field017.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field017.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field017.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(PSSbHWBeFcd6OOoZl7YvkhPEMyxbvRSE, matrix4f, f2, field012, u0j4tIAOUTNHuPyTneFZ7k56qTWIELMz, 0.015625f, field016, class_4608.field_21444, MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy, field017.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field017.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field017.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(PSSbHWBeFcd6OOoZl7YvkhPEMyxbvRSE, Hjkwcta2EFnn3W1Un1WNyJ7Vl8s4AwhU, f2, f, LaaCU46RjbOutB8TMVOmRQcpvFSj0Vbh, 0.015625f, field015, class_4608.field_21444, MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy, field017.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field017.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field017.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(PSSbHWBeFcd6OOoZl7YvkhPEMyxbvRSE, Hjkwcta2EFnn3W1Un1WNyJ7Vl8s4AwhU, BU94B7ytCVIgKPyeWpf98rd1ZqdV6OD8, f, LaaCU46RjbOutB8TMVOmRQcpvFSj0Vbh, 0.171875f, field015, class_4608.field_21444, MVFo4THoICn5Sj3UlQ3tDTN0LmSDxbTy, field017.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field017.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field017.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ float guPHO18FUv7d1OKvQXf8tMJDlXOFvFsU(float IkkacN3vBD7vR0aGtYDhoHa5hzz6e5IB) {
        return class_3532.method_15374((float)((float)((double)IkkacN3vBD7vR0aGtYDhoHa5hzz6e5IB * Math.PI / 2.0)));
    }

    public static /* bridge */ /* synthetic */ void RA0dDOIWw8ry8keFpVWS5Ex3jOVUEFMj(class_4588 hCFHJtnj08W4lIK1wcAVbkx0iGBL1hy5, Matrix4f lQNDzwGvs3NMKEzM4QQuKtGEoUHSWLgM, Matrix4f matrix4f, float tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS, float MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i, float IH8AFuapS8pUHSylt9fL8r3By89f4dqT, float f, float field018, float FyDftuiJsVXNRSt6xqiRXuTmapw6ahNS, int mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf) {
        if (tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS < f) {
            f = tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS = f;
        }
        if (MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i < field018) {
            field018 = MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i = field018;
        }
        SecureClass0795 field019 = SecureClass0994.cfr_renamed_1004(matrix4f, matrix4f, lQNDzwGvs3NMKEzM4QQuKtGEoUHSWLgM, new SecureClass0795(tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS, field018, IH8AFuapS8pUHSylt9fL8r3By89f4dqT), new SecureClass0795(f, field018, IH8AFuapS8pUHSylt9fL8r3By89f4dqT), new SecureClass0795(tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS, MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i, FyDftuiJsVXNRSt6xqiRXuTmapw6ahNS), mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf == 0xF000F0);
        SecureClass0348.cfr_renamed_739(hCFHJtnj08W4lIK1wcAVbkx0iGBL1hy5, matrix4f, tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS, field018, IH8AFuapS8pUHSylt9fL8r3By89f4dqT, 0.171875f, 0.03125f, class_4608.field_21444, mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf, field019.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field019.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field019.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(hCFHJtnj08W4lIK1wcAVbkx0iGBL1hy5, matrix4f, f, field018, IH8AFuapS8pUHSylt9fL8r3By89f4dqT, 0.015625f, 0.03125f, class_4608.field_21444, mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf, field019.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field019.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field019.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(hCFHJtnj08W4lIK1wcAVbkx0iGBL1hy5, lQNDzwGvs3NMKEzM4QQuKtGEoUHSWLgM, f, MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i, FyDftuiJsVXNRSt6xqiRXuTmapw6ahNS, 0.015625f, 0.0f, class_4608.field_21444, mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf, field019.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field019.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field019.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(hCFHJtnj08W4lIK1wcAVbkx0iGBL1hy5, lQNDzwGvs3NMKEzM4QQuKtGEoUHSWLgM, tUgACMQIzXWq8i0xrgGAYWwyaAKwEhSS, MqBpBKY0Yy38Jx6yWz5fvnGWrBV3jx6i, FyDftuiJsVXNRSt6xqiRXuTmapw6ahNS, 0.171875f, 0.0f, class_4608.field_21444, mRpw7HpLtUJ7MjoqaNooUAGR2HYYDsHf, field019.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field019.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field019.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ void gI0ir8iWgH35kppbFwpPc3pfv32CwXzQ(class_4588 kLySw9teeTdrTHHyoWDpVyduNVxSxZcs, Matrix4f SAL9xButr6e5BRxXIgwqQLAYkhGKxJsu, Matrix4f IJXLYMDqPJyczsz9vFRLIpnsRkD6vjKg, float nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O, float Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv, float mjCS3jVhJ9Y1z1obb3aWwBvA46Jf73MX, float field020, float field021, float azSrUXV7wSbuVLEMjkzkpJHR9QvcyOUw, int n) {
        if (nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O < field020) {
            field020 = nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O = field020;
        }
        if (Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv < field021) {
            field021 = Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv = field021;
        }
        SecureClass0795 field022 = SecureClass0994.cfr_renamed_1004(IJXLYMDqPJyczsz9vFRLIpnsRkD6vjKg, IJXLYMDqPJyczsz9vFRLIpnsRkD6vjKg, SAL9xButr6e5BRxXIgwqQLAYkhGKxJsu, new SecureClass0795(nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O, field021, azSrUXV7wSbuVLEMjkzkpJHR9QvcyOUw), new SecureClass0795(field020, field021, azSrUXV7wSbuVLEMjkzkpJHR9QvcyOUw), new SecureClass0795(nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O, Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv, mjCS3jVhJ9Y1z1obb3aWwBvA46Jf73MX), n == 0xF000F0);
        SecureClass0348.cfr_renamed_739(kLySw9teeTdrTHHyoWDpVyduNVxSxZcs, IJXLYMDqPJyczsz9vFRLIpnsRkD6vjKg, nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O, field021, azSrUXV7wSbuVLEMjkzkpJHR9QvcyOUw, 0.328125f, 0.0f, class_4608.field_21444, n, field022.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field022.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field022.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(kLySw9teeTdrTHHyoWDpVyduNVxSxZcs, IJXLYMDqPJyczsz9vFRLIpnsRkD6vjKg, field020, field021, azSrUXV7wSbuVLEMjkzkpJHR9QvcyOUw, 0.171875f, 0.0f, class_4608.field_21444, n, field022.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field022.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field022.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(kLySw9teeTdrTHHyoWDpVyduNVxSxZcs, SAL9xButr6e5BRxXIgwqQLAYkhGKxJsu, field020, Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv, mjCS3jVhJ9Y1z1obb3aWwBvA46Jf73MX, 0.171875f, 0.03125f, class_4608.field_21444, n, field022.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field022.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field022.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(kLySw9teeTdrTHHyoWDpVyduNVxSxZcs, SAL9xButr6e5BRxXIgwqQLAYkhGKxJsu, nMjH0RkLWdmF8eUW30IFfM7XUoC6sa3O, Hk2ubJKj0FpnYXFeHyLpbO6L43m6afuv, mjCS3jVhJ9Y1z1obb3aWwBvA46Jf73MX, 0.328125f, 0.03125f, class_4608.field_21444, n, field022.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field022.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field022.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ void CwBSruhjG20DQh3M8GPfAMl8TtReD1K3(class_4588 x5Ykx4BxD6EfS26KUZsbRiUxvPoXALRe, Matrix4f eh1lz56ulzNk6647D1jMlptvLFFLx99w, Matrix4f bpuV5dSh35yFLlWNj2CMrsHW9oQfOc91, float nIknY8fzyHgT9XkjTekdxhnaZRhVzauq, float f, float sTjp3xnq5dCwgASOIQSt36naw1qtpu4Q, float field023, float field024, float HZePpAoEyfY0NgefcmEyDR7KiXYpFogY, int egG9jBUiZynvbhw3zcDNlKUaSXrhLppQ, int swFIToquTvEhVeaaVKuPWasWuMGrOAez) {
        if (nIknY8fzyHgT9XkjTekdxhnaZRhVzauq < field023) {
            field023 = nIknY8fzyHgT9XkjTekdxhnaZRhVzauq;
        }
        if (f < field024) {
            field024 = f = field024;
        }
        float field025 = 0.5f;
        float field026 = field025 / 16.0f;
        float field027 = 0.03125f + field026 * (float)(egG9jBUiZynvbhw3zcDNlKUaSXrhLppQ + 1);
        float field028 = 0.03125f + field026 * (float)egG9jBUiZynvbhw3zcDNlKUaSXrhLppQ;
        SecureClass0795 field029 = SecureClass0994.cfr_renamed_1004(eh1lz56ulzNk6647D1jMlptvLFFLx99w, eh1lz56ulzNk6647D1jMlptvLFFLx99w, bpuV5dSh35yFLlWNj2CMrsHW9oQfOc91, new SecureClass0795(field023, f, sTjp3xnq5dCwgASOIQSt36naw1qtpu4Q), new SecureClass0795(field023, f, HZePpAoEyfY0NgefcmEyDR7KiXYpFogY), new SecureClass0795(field023, field024, sTjp3xnq5dCwgASOIQSt36naw1qtpu4Q), swFIToquTvEhVeaaVKuPWasWuMGrOAez == 0xF000F0);
        SecureClass0348.cfr_renamed_739(x5Ykx4BxD6EfS26KUZsbRiUxvPoXALRe, eh1lz56ulzNk6647D1jMlptvLFFLx99w, field023, f, sTjp3xnq5dCwgASOIQSt36naw1qtpu4Q, 0.0f, field027, class_4608.field_21444, swFIToquTvEhVeaaVKuPWasWuMGrOAez, field029.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field029.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field029.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(x5Ykx4BxD6EfS26KUZsbRiUxvPoXALRe, eh1lz56ulzNk6647D1jMlptvLFFLx99w, field023, f, HZePpAoEyfY0NgefcmEyDR7KiXYpFogY, 0.015625f, field027, class_4608.field_21444, swFIToquTvEhVeaaVKuPWasWuMGrOAez, field029.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field029.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field029.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(x5Ykx4BxD6EfS26KUZsbRiUxvPoXALRe, bpuV5dSh35yFLlWNj2CMrsHW9oQfOc91, field023, field024, HZePpAoEyfY0NgefcmEyDR7KiXYpFogY, 0.015625f, field028, class_4608.field_21444, swFIToquTvEhVeaaVKuPWasWuMGrOAez, field029.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field029.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field029.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(x5Ykx4BxD6EfS26KUZsbRiUxvPoXALRe, bpuV5dSh35yFLlWNj2CMrsHW9oQfOc91, field023, field024, sTjp3xnq5dCwgASOIQSt36naw1qtpu4Q, 0.0f, field028, class_4608.field_21444, swFIToquTvEhVeaaVKuPWasWuMGrOAez, field029.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field029.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field029.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ void myh13MkecTkOjG5eIRseunpovrw6pMep(class_4588 cNfgKoL5lZtQlQM3iu34NIz62v0RLubZ, Matrix4f FafbBgpAxTmTgacAysUbFX858ofc7w6q, Matrix4f nhpzRYSqlOEJ3F66YIbx6K2AxzZuea7Q, float WRoverJ0rHZPEIFZX0DD88fXmAlaqCpi, float Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ, float amW2dD2VMrdZYi7VMlTkMYAXbldMiDQK, float field030, float field031, float vSCmVoseS6hrKAVrIjCEWouf6tZe4leE, int kp9rm6ZMpdRsYMqAPZGYbNYRE3cU1czA, int HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3) {
        if (WRoverJ0rHZPEIFZX0DD88fXmAlaqCpi < field030) {
            field030 = WRoverJ0rHZPEIFZX0DD88fXmAlaqCpi;
        }
        if (Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ < field031) {
            field031 = Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ = field031;
        }
        float field032 = 0.5f;
        float field033 = field032 / 16.0f;
        float field034 = 0.03125f + field033 * (float)(kp9rm6ZMpdRsYMqAPZGYbNYRE3cU1czA + 1);
        float field035 = 0.03125f + field033 * (float)kp9rm6ZMpdRsYMqAPZGYbNYRE3cU1czA;
        SecureClass0795 field036 = SecureClass0994.cfr_renamed_1004(FafbBgpAxTmTgacAysUbFX858ofc7w6q, FafbBgpAxTmTgacAysUbFX858ofc7w6q, nhpzRYSqlOEJ3F66YIbx6K2AxzZuea7Q, new SecureClass0795(field030, Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ, vSCmVoseS6hrKAVrIjCEWouf6tZe4leE), new SecureClass0795(field030, Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ, amW2dD2VMrdZYi7VMlTkMYAXbldMiDQK), new SecureClass0795(field030, field031, vSCmVoseS6hrKAVrIjCEWouf6tZe4leE), HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3 == 0xF000F0);
        SecureClass0348.cfr_renamed_739(cNfgKoL5lZtQlQM3iu34NIz62v0RLubZ, FafbBgpAxTmTgacAysUbFX858ofc7w6q, field030, Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ, vSCmVoseS6hrKAVrIjCEWouf6tZe4leE, 0.171875f, field034, class_4608.field_21444, HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3, field036.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field036.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field036.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(cNfgKoL5lZtQlQM3iu34NIz62v0RLubZ, FafbBgpAxTmTgacAysUbFX858ofc7w6q, field030, Ni6bAYUgdT8sU6pTe88sq5zzlBznnKRJ, amW2dD2VMrdZYi7VMlTkMYAXbldMiDQK, 0.1875f, field034, class_4608.field_21444, HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3, field036.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field036.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field036.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(cNfgKoL5lZtQlQM3iu34NIz62v0RLubZ, nhpzRYSqlOEJ3F66YIbx6K2AxzZuea7Q, field030, field031, amW2dD2VMrdZYi7VMlTkMYAXbldMiDQK, 0.1875f, field035, class_4608.field_21444, HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3, field036.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field036.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field036.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
        SecureClass0348.cfr_renamed_739(cNfgKoL5lZtQlQM3iu34NIz62v0RLubZ, nhpzRYSqlOEJ3F66YIbx6K2AxzZuea7Q, field030, field031, vSCmVoseS6hrKAVrIjCEWouf6tZe4leE, 0.171875f, field035, class_4608.field_21444, HpaQvYzTQrKUnZYtW3NNHmPEISG1twI3, field036.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field036.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field036.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4);
    }

    public static /* bridge */ /* synthetic */ SecureClass0795 cfr_renamed_1004(Matrix4f yCzPOllPSDZelq12B1o9OZhhjOboNphE, Matrix4f matrix4f, Matrix4f sXsYCZPrAbgTcuNPU1nz8ngdVHHB3hku, SecureClass0795 field036, SecureClass0795 gzg5d2zD6QJWk4Uywtaiq3klbaBOyVK7, SecureClass0795 WJKpmuVvThTOkCVWN7S4h4pqRyAkT19r, boolean IKDA54FwgFa3hBHRmf0rz5eyL6iTVsIo) {
        SecureClass0795 field037 = SecureClass0994.cfr_renamed_1005(yCzPOllPSDZelq12B1o9OZhhjOboNphE, new SecureClass0442(field036.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, field036.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, field036.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4, 1.0f)).BdF7OqdhKzFKFWLPBAVOA5u4kzmsGHHf();
        SecureClass0795 field038 = SecureClass0994.cfr_renamed_1005(matrix4f, new SecureClass0442(gzg5d2zD6QJWk4Uywtaiq3klbaBOyVK7.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, gzg5d2zD6QJWk4Uywtaiq3klbaBOyVK7.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, gzg5d2zD6QJWk4Uywtaiq3klbaBOyVK7.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4, 1.0f)).BdF7OqdhKzFKFWLPBAVOA5u4kzmsGHHf();
        SecureClass0795 field039 = SecureClass0994.cfr_renamed_1005(sXsYCZPrAbgTcuNPU1nz8ngdVHHB3hku, new SecureClass0442(WJKpmuVvThTOkCVWN7S4h4pqRyAkT19r.DsL9zoPU3dCWUF2Zx9sqMMvMEsFaYGK9, WJKpmuVvThTOkCVWN7S4h4pqRyAkT19r.Q0v6f83s8qbN5KDEoaL893wXZOxyRcRN, WJKpmuVvThTOkCVWN7S4h4pqRyAkT19r.NaWTMRUqq0hJA1z3WtQDZoRswVoGR3v4, 1.0f)).BdF7OqdhKzFKFWLPBAVOA5u4kzmsGHHf();
        field038.cfr_renamed_1006(field037);
        field039.cfr_renamed_1006(field037);
        field038.cfr_renamed_1007(field039);
        field038.GzUcw4foxxKv6qHq3pSKi2wlfcZKBn0g();
        return IKDA54FwgFa3hBHRmf0rz5eyL6iTVsIo ? field038.NwWnEsvXmzBuynALcRDzhya9akm3dHtR(-1.0f) : field038;
    }

    public static /* bridge */ /* synthetic */ SecureClass0442 cfr_renamed_1005(Matrix4f matrix4f, SecureClass0442 hPT5LnZ39HwFOBm3aZx9pSedf9XoynDg) {
        Vector4f field040 = matrix4f.transform(new Vector4f(hPT5LnZ39HwFOBm3aZx9pSedf9XoynDg.cfr_renamed_435, hPT5LnZ39HwFOBm3aZx9pSedf9XoynDg.l12Cbzu2L6W4R8kXglLIElbptIVQcUCI, hPT5LnZ39HwFOBm3aZx9pSedf9XoynDg.RWRgjScXAHD9acnW99eMUFjao5uImGtc, hPT5LnZ39HwFOBm3aZx9pSedf9XoynDg.cfr_renamed_434));
        return new SecureClass0442(field040.x, field040.y, field040.z, field040.w);
    }

    public /* synthetic */ SecureClass0994(class_3883<class_742, class_591<class_742>> CozYpZiyA4wHcsr6aZaNvVcZIHhEzAjH) {
        super(CozYpZiyA4wHcsr6aZaNvVcZIHhEzAjH);
        this.field001 = CapesModule.OpG4UJ3X4Zo4PsmsPwo7oewmAdIhe46a(64, 64, IqvYeIDLqFNNL7bmx2JywbHxJhuUQaL8 -> 0, n -> n);
    }

    static {
        field002 = new SecureClass0520();
    }
}

