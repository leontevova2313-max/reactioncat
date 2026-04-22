/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;

public final class SecureClass0625 {
    public static /* bridge */ /* synthetic */ class_243 Cjr2QLmO3NQMjkN43p1gnsSSu12XQ8Uc(class_1297 z71KNSTEtKgylhTNJHYaELDQpMEdtqGU, class_243 c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00, float BLa7LD2iDF7h3rPbiCW04VdPSA97jJ7x) {
        boolean field001;
        class_238 field002 = z71KNSTEtKgylhTNJHYaELDQpMEdtqGU.method_5829();
        List field003 = z71KNSTEtKgylhTNJHYaELDQpMEdtqGU.method_37908().method_20743(z71KNSTEtKgylhTNJHYaELDQpMEdtqGU, field002.method_18804(c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00));
        class_243 class_2432 = c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.method_1027() == 0.0 ? c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00 : class_1297.method_20736((class_1297)z71KNSTEtKgylhTNJHYaELDQpMEdtqGU, (class_243)c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00, (class_238)field002, (class_1937)z71KNSTEtKgylhTNJHYaELDQpMEdtqGU.method_37908(), (List)field003);
        boolean bl = c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1352 != class_2432.field_1352;
        boolean field004 = c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1351 != class_2432.field_1351;
        boolean bl2 = c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1350 != class_2432.field_1350;
        boolean bl3 = field001 = field004 && c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1351 < 0.0;
        if (BLa7LD2iDF7h3rPbiCW04VdPSA97jJ7x > 0.0f && (field001 || z71KNSTEtKgylhTNJHYaELDQpMEdtqGU.method_24828()) && (bl || bl2)) {
            float[] field005;
            class_238 field006 = field001 ? field002.method_989(0.0, class_2432.field_1351, 0.0) : field002;
            class_238 field007 = field006.method_1012(c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1352, (double)BLa7LD2iDF7h3rPbiCW04VdPSA97jJ7x, c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1350);
            if (!field001) {
                field007 = field007.method_1012(0.0, (double)-1.0E-5f, 0.0);
            }
            List field008 = class_1297.method_59920((class_1297)z71KNSTEtKgylhTNJHYaELDQpMEdtqGU, (class_1937)z71KNSTEtKgylhTNJHYaELDQpMEdtqGU.method_37908(), (List)field003, (class_238)field007);
            float field009 = (float)class_2432.field_1351;
            for (float hAJ1IQDDdH8OskGemLizrKw4YSmwZNYk : field005 = class_1297.method_59921((class_238)field006, (List)field008, (float)BLa7LD2iDF7h3rPbiCW04VdPSA97jJ7x, (float)field009)) {
                class_243 field010 = class_1297.method_20737((class_243)new class_243(c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1352, (double)hAJ1IQDDdH8OskGemLizrKw4YSmwZNYk, c1TF2aPdLUC0t8kKmPjJ7Hddr3dCuz00.field_1350), (class_238)field006, (List)field008);
                if (!(field010.method_37268() > class_2432.method_37268())) continue;
                double field011 = field002.field_1322 - field006.field_1322;
                return field010.method_1031(0.0, -field011, 0.0);
            }
        }
        return class_2432;
    }

    public /* synthetic */ SecureClass0625() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

