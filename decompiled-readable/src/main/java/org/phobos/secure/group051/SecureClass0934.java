/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import java.util.concurrent.atomic.AtomicReference;
import net.minecraft.class_247;
import net.minecraft.class_259;
import net.minecraft.class_265;

public final class SecureClass0934 {
    public static /* bridge */ /* synthetic */ class_265 cfr_renamed_451(class_265 CWlHz3lujNaj0xEQ7iTKXsa8fKCnJEUk, double tYEmrxQucdL99FwwhQ85aT2xShRnuVS9, double lcvrycrEIovD17XJNeG0Y3XrWVYSpwox, double kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX) {
        if (CWlHz3lujNaj0xEQ7iTKXsa8fKCnJEUk.method_1110()) {
            return class_259.method_1073();
        }
        if (CWlHz3lujNaj0xEQ7iTKXsa8fKCnJEUk == class_259.method_1077()) {
            return class_259.method_1081((double)tYEmrxQucdL99FwwhQ85aT2xShRnuVS9, (double)lcvrycrEIovD17XJNeG0Y3XrWVYSpwox, (double)kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX, (double)(1.0 - tYEmrxQucdL99FwwhQ85aT2xShRnuVS9), (double)(1.0 - lcvrycrEIovD17XJNeG0Y3XrWVYSpwox), (double)(1.0 - kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX));
        }
        AtomicReference<class_265> field001 = new AtomicReference<class_265>(class_259.method_1073());
        CWlHz3lujNaj0xEQ7iTKXsa8fKCnJEUk.method_1089((BjZn1c0FSKxjBYJiCxhskhNfgDfYbM53, Tm3fbMXzOL4NTBBvM3GFilKudNIibhif, EkR6NXgzdlFa3Xb7up3Q7UcuzDbu4Bxy, dI8gU2Bju8AM35bKO27FXfRffyhccHrP, d, EGpBHinSWdTh5zFrLU5lR7tGnwN2vrCk) -> {
            boolean field002;
            double d2 = dI8gU2Bju8AM35bKO27FXfRffyhccHrP - BjZn1c0FSKxjBYJiCxhskhNfgDfYbM53;
            double d3 = d - Tm3fbMXzOL4NTBBvM3GFilKudNIibhif;
            double field003 = EGpBHinSWdTh5zFrLU5lR7tGnwN2vrCk - EkR6NXgzdlFa3Xb7up3Q7UcuzDbu4Bxy;
            boolean field004 = tYEmrxQucdL99FwwhQ85aT2xShRnuVS9 == 0.0 || d2 > tYEmrxQucdL99FwwhQ85aT2xShRnuVS9 * 2.0;
            boolean bl = lcvrycrEIovD17XJNeG0Y3XrWVYSpwox == 0.0 || d3 > lcvrycrEIovD17XJNeG0Y3XrWVYSpwox * 2.0;
            boolean bl2 = field002 = kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX == 0.0 || field003 > kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX * 2.0;
            if (field004 && bl && field002) {
                double field005 = Math.max(tYEmrxQucdL99FwwhQ85aT2xShRnuVS9, 0.0);
                double d4 = Math.max(lcvrycrEIovD17XJNeG0Y3XrWVYSpwox, 0.0);
                double field006 = Math.max(kAPYSRTOXwEA5lwHsnqRnGQQWwNSNcwX, 0.0);
                class_265 field007 = class_259.method_1081((double)(BjZn1c0FSKxjBYJiCxhskhNfgDfYbM53 + field005), (double)(Tm3fbMXzOL4NTBBvM3GFilKudNIibhif + d4), (double)(EkR6NXgzdlFa3Xb7up3Q7UcuzDbu4Bxy + field006), (double)(dI8gU2Bju8AM35bKO27FXfRffyhccHrP - field005), (double)(d - d4), (double)(EGpBHinSWdTh5zFrLU5lR7tGnwN2vrCk - field006));
                field001.set(class_259.method_1082((class_265)((class_265)field001.get()), (class_265)field007, (class_247)class_247.field_1366));
            }
        });
        return field001.get();
    }

    public /* synthetic */ SecureClass0934() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

