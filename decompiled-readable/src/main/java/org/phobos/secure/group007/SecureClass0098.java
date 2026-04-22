/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.class_1735;
import net.minecraft.class_238;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group010.SecureClass0154;
import org.phobos.secure.group032._2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW;
import org.phobos.secure.group041.J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI;
import org.phobos.secure.group050.SecureClass0898;

public final class SecureClass0098 {
    public static final /* synthetic */ Map<J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI, Long> field001;

    static {
        field001 = new HashMap<J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI, Long>();
    }

    public static /* bridge */ /* synthetic */ void EFeatNB76Sw7xBbmriEM7I1bNkjtqiJw() {
        field001.entrySet().removeIf(entry -> (Long)entry.getValue() < System.currentTimeMillis());
    }

    @Nullable
    public static /* bridge */ /* synthetic */ Color xkZNu2E8u2U5iAp5H7o1sSNTD4mtoGuY(class_1735 NxkR0D7ddQTdYoZ0W67ZD24c085rU8oy) {
        J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI field002;
        Iterator<J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI> iterator = field001.keySet().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field002 = iterator.next()).NKJ4iTqHAVm0GYMD4PHBxSwbVjn4p94K().equals(NxkR0D7ddQTdYoZ0W67ZD24c085rU8oy));
        return field002.FargRwaHDQXqdK2IvhQntPiL9clYe3og();
    }

    public static /* bridge */ /* synthetic */ void opKJY6SX8ipFdDLGdXWgKx5K6UboyoT8(class_1735 class_17352, Color color, long HKWBrANAK6fMWkFRPIDrCz4r9Nf7c5Xm) {
        field001.put(new J4CuH0E1mgeUyFKfDrfIlvuJf4W6h6JI(class_17352, color), System.currentTimeMillis() + HKWBrANAK6fMWkFRPIDrCz4r9Nf7c5Xm);
    }

    public /* synthetic */ SecureClass0098() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void ITgKbrHz4V0wYKBbOmJrwk73dLrtkvgo(class_238 class_2383, Color Ztap7MRR1mW0sxdmY4JSgIlyqxlI72Er, long OYMqqNtAkBTJi2NGkN57k2VWmDfHjYDx) {
        SecureClass0154.Jkg2YSiYU5fV4kpvQcUdC5hUaK4hWSO7(_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW.avx6pem7TVs8549zSZvWgoLjHVr3zJah().sHSB7IaFhL53e1jiVSjBZiMSJWPx2KFB(class_2383).cfr_renamed_164(SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Ztap7MRR1mW0sxdmY4JSgIlyqxlI72Er, 0.3f), Ztap7MRR1mW0sxdmY4JSgIlyqxlI72Er).UcgA0yMq0QziA6Y4yI9FEYwrcmX5T3NC(1.0f).PUjXZ96cXWDVw3h5wvMikn8yk6enFEoL(OYMqqNtAkBTJi2NGkN57k2VWmDfHjYDx).OQmFOPYt08ebSjW766c8CRdAwii53bz5());
    }
}

