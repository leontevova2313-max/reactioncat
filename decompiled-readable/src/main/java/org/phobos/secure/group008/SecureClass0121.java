/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_1297;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0121
implements SecureInterface0134 {
    public static /* bridge */ /* synthetic */ List<class_1297> GDEqLUYugvBAZs2xzLlRLZBM2zdNBcaB() {
        if (SecureClass0121.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return Collections.emptyList();
        }
        ArrayList<class_1297> field001 = new ArrayList<class_1297>();
        Iterator<T> iterator = SecureClass0121.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687.method_18112().iterator();
        while (iterator.hasNext()) {
            class_1297 class_12972 = (class_1297)iterator.next();
            field001.add(class_12972);
        }
        return field001;
    }

    public /* synthetic */ SecureClass0121() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

