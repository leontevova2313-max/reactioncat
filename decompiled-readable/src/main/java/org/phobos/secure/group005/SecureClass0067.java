/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_742;

public final class SecureClass0067 {
    public static /* bridge */ /* synthetic */ double cfr_renamed_125(class_243 class_2432, class_243 IYvxXxnixoZAgQ5IQeX7njsD3XoPl0ae) {
        return SecureClass0067.rLpN2aoFzpuXRg8hu83HAVh8zmAqvhav(class_2432, IYvxXxnixoZAgQ5IQeX7njsD3XoPl0ae) * 20.0;
    }

    public static /* bridge */ /* synthetic */ List<class_243> AnXXykhXy91g0cpHK9Dwj3FyHJwiCdBp(List<class_243> tyiD6fF6Nxs4e1crNdOLx1IaCG28axUw) {
        ArrayList<class_243> arrayList = new ArrayList<class_243>(tyiD6fF6Nxs4e1crNdOLx1IaCG28axUw.size() - 1);
        int field001 = 0;
        while (field001 < tyiD6fF6Nxs4e1crNdOLx1IaCG28axUw.size() - 1) {
            arrayList.add(tyiD6fF6Nxs4e1crNdOLx1IaCG28axUw.get(field001 + 1).method_1020(tyiD6fF6Nxs4e1crNdOLx1IaCG28axUw.get(field001)));
            ++field001;
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ double cfr_renamed_126(float h9JTLrAEK89za86pNcj7MY2hs3SX7mEk, float nUPGUyIz7JgRJhO0vwEvKRZbTRnk5nmy, float Q2asJs0wt3bde3pXWPRNTgMVn5vpHeGD) {
        if (h9JTLrAEK89za86pNcj7MY2hs3SX7mEk < 0.0f) {
            Q2asJs0wt3bde3pXWPRNTgMVn5vpHeGD += 180.0f;
        }
        float field002 = 1.0f;
        if (h9JTLrAEK89za86pNcj7MY2hs3SX7mEk < 0.0f) {
            field002 = -0.5f;
        } else if (h9JTLrAEK89za86pNcj7MY2hs3SX7mEk > 0.0f) {
            field002 = 0.5f;
        }
        if (nUPGUyIz7JgRJhO0vwEvKRZbTRnk5nmy > 0.0f) {
            Q2asJs0wt3bde3pXWPRNTgMVn5vpHeGD -= 70.0f * field002;
        }
        if (nUPGUyIz7JgRJhO0vwEvKRZbTRnk5nmy < 0.0f) {
            Q2asJs0wt3bde3pXWPRNTgMVn5vpHeGD += 70.0f * field002;
        }
        return Math.toRadians(Q2asJs0wt3bde3pXWPRNTgMVn5vpHeGD);
    }

    public static /* bridge */ /* synthetic */ boolean vAmw4cgUaBClnwjJdu7epxAWj1nZxKgM(class_243 dZQMj9tjeUPTVwpnvAEkVMyKBuNawkSW) {
        return dZQMj9tjeUPTVwpnvAEkVMyKBuNawkSW.field_1352 != 0.0 || dZQMj9tjeUPTVwpnvAEkVMyKBuNawkSW.field_1350 != 0.0;
    }

    public /* synthetic */ SecureClass0067() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ double Bce4NqpO1LcQhIUIrfrWrjfufKyf8UyW(class_243 z6dJOsU7D5mLs6alzzKsCrwqirCjjmli, class_243 gRqB1ZsFVKtNPB9qbKCTRHSy2lsPxAur) {
        return Math.max(Math.abs(z6dJOsU7D5mLs6alzzKsCrwqirCjjmli.field_1352 - gRqB1ZsFVKtNPB9qbKCTRHSy2lsPxAur.field_1352), Math.abs(z6dJOsU7D5mLs6alzzKsCrwqirCjjmli.field_1350 - gRqB1ZsFVKtNPB9qbKCTRHSy2lsPxAur.field_1350));
    }

    public static /* bridge */ /* synthetic */ class_243 X0tf2AZ3tQ0z4kX5CsWCTwEzXePeDL2v(class_243 BOpOIJBF9LXLFUpPn9F7PJ5g0F7LAnX0) {
        return new class_243(BOpOIJBF9LXLFUpPn9F7PJ5g0F7LAnX0.field_1352, 0.0, BOpOIJBF9LXLFUpPn9F7PJ5g0F7LAnX0.field_1350);
    }

    public static /* bridge */ /* synthetic */ double biQks4q8E5TEPsoWqxda4nG3F5cNfJZk(double field003, int lV0Ygn0G00VBjBus4RPKRIfcl51WkGLi) {
        if (lV0Ygn0G00VBjBus4RPKRIfcl51WkGLi == 0) {
            return field003;
        }
        double field004 = field003;
        int field005 = 0;
        while (field005 < lV0Ygn0G00VBjBus4RPKRIfcl51WkGLi) {
            field004 = (field004 - 0.08) * (double)0.98f;
            ++field005;
        }
        return field004;
    }

    public static /* bridge */ /* synthetic */ class_243 tMEPAuLOcKwX9ZnIs2txwsTz4yfIgzjt(double FnbJrI8OUqi77SafhRJ2GarVO8XHK3Ev, double hL7MuQqoExEx5QHAuDAN6jwaDBOo7hto, double W8Yckzp1uDm7AiG04tIPc7Vexw6czxcO) {
        return new class_243((double)(-class_3532.method_15374((float)((float)hL7MuQqoExEx5QHAuDAN6jwaDBOo7hto))) * FnbJrI8OUqi77SafhRJ2GarVO8XHK3Ev, W8Yckzp1uDm7AiG04tIPc7Vexw6czxcO, (double)class_3532.method_15362((float)((float)hL7MuQqoExEx5QHAuDAN6jwaDBOo7hto)) * FnbJrI8OUqi77SafhRJ2GarVO8XHK3Ev);
    }

    public static /* bridge */ /* synthetic */ boolean NwSk3icflLPLegGtIjqi9fRBF9e1t6aE(class_243 Ij4gyqmXnYWGXKAZkQbSJ1iFFdzYoUIw) {
        return Math.abs(Ij4gyqmXnYWGXKAZkQbSJ1iFFdzYoUIw.field_1352) >= 3.9 || Math.abs(Ij4gyqmXnYWGXKAZkQbSJ1iFFdzYoUIw.field_1351) >= 3.9 || Math.abs(Ij4gyqmXnYWGXKAZkQbSJ1iFFdzYoUIw.field_1350) >= 3.9;
    }

    public static /* bridge */ /* synthetic */ double pksffTeD5kqWVNWkFibJst0jjoQmjbng(class_1657 hsu7pnbyyKmCKNZPBNHM95lu1lirB4n2) {
        class_243 field006 = hsu7pnbyyKmCKNZPBNHM95lu1lirB4n2.method_18798();
        return Math.hypot(field006.field_1352, field006.field_1350);
    }

    public static /* bridge */ /* synthetic */ double al44ITGaE057UFoBFkBJmh8G5CMVodNf(class_742 LoYQZInj2KXvz1t4yZilOg7Dy9EEFiLt) {
        try {
            int field007 = Objects.requireNonNull((class_1293)LoYQZInj2KXvz1t4yZilOg7Dy9EEFiLt.method_6088().get(class_1294.field_5913)).method_5578() + 1;
            return 0.04837 * (double)field007 + 0.5356 * (double)field007 + 1.252;
        }
        catch (NullPointerException qh8SfjqqjiGW3KrX8fchtvrdKzxAuAZy) {
            return 1.252203340253729;
        }
    }

    public static /* bridge */ /* synthetic */ double rLpN2aoFzpuXRg8hu83HAVh8zmAqvhav(class_243 JyrEWQyrVptuUnsYyWwaHWgj0kURhFRb, class_243 Oxypcrwie4SgVWTsVCc0Vx5rUtHxk7UA) {
        return SecureClass0067.X0tf2AZ3tQ0z4kX5CsWCTwEzXePeDL2v(Oxypcrwie4SgVWTsVCc0Vx5rUtHxk7UA).method_1022(SecureClass0067.X0tf2AZ3tQ0z4kX5CsWCTwEzXePeDL2v(JyrEWQyrVptuUnsYyWwaHWgj0kURhFRb));
    }
}

