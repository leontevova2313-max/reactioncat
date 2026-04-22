/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import net.minecraft.class_1297;
import net.minecraft.class_3965;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group061.SecureClass1117;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group059._3AoLUlz3XcRaC8mbk7M5w8z9vJtDMfDC;

public class SecureClass0316
extends SecureClass0966 {
    public static /* synthetic */ BiConsumer<class_3965, float[]> field001;
    public static /* synthetic */ BiFunction<class_3965, float[], @NotNull class_3965> field005;
    public final /* synthetic */ SecureClass0242 field002;
    public volatile /* synthetic */ boolean field003;

    public static /* bridge */ /* synthetic */ class_3965 Cgx3GAKolsfxf685R0YTVwR0bIXaTvZL(class_746 bbPXHF0p0XldUcKHkzpnQgTa4ot9KRdf, class_3965 field006) {
        if (field005 != null) {
            class_3965 field004 = field005.apply(field006, SecureClass1117.ZaD0SEPOdWzV4m2SUsKn5AoI32vdzOQL((class_1297)bbPXHF0p0XldUcKHkzpnQgTa4ot9KRdf, field006.method_17784()));
            field005 = null;
            return field004;
        }
        return field006;
    }

    public /* synthetic */ SecureClass0316(SecureClass0242 PLZHXdPTEszS10CzO6OV2VX0UfHRJp1s) {
        this.field002 = PLZHXdPTEszS10CzO6OV2VX0UfHRJp1s;
        this.cfr_renamed_69(new _3AoLUlz3XcRaC8mbk7M5w8z9vJtDMfDC(this));
    }

    public static /* bridge */ /* synthetic */ void wTNnrZQLrmYz6AUgPcZ8rzVePvjXPP09(class_746 P7kKLw9IfrlejiVUOLAVlxOuyjE8klwg, class_3965 XeQiKI1EkPws1KMhCEldJZxw3KNGJUau) {
        if (field001 != null) {
            field001.accept(XeQiKI1EkPws1KMhCEldJZxw3KNGJUau, SecureClass1117.ZaD0SEPOdWzV4m2SUsKn5AoI32vdzOQL((class_1297)P7kKLw9IfrlejiVUOLAVlxOuyjE8klwg, XeQiKI1EkPws1KMhCEldJZxw3KNGJUau.method_17784()));
            field001 = null;
        }
    }
}

