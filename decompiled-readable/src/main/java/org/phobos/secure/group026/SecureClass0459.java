/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group026;

import java.util.Iterator;
import net.minecraft.class_1792;
import net.minecraft.class_2244;
import net.minecraft.class_2248;
import org.phobos.secure.group029.SecureClass0521;
import org.phobos.secure.group041.SecureClass0725;

public class SecureClass0459
extends SecureClass0521<class_1792> {
    public static final /* synthetic */ SecureClass0459 field001;

    static {
        field001 = new SecureClass0459();
    }

    public /* synthetic */ SecureClass0459() {
        super("Beds");
        Iterator<class_2248> iterator = SecureClass0725.UbZCPB1DIAp9LBejOGNF477VYWGTUgZz().iterator();
        while (iterator.hasNext()) {
            class_2248 class_22482 = iterator.next();
            if (!(class_22482 instanceof class_2244)) continue;
            class_2244 field002 = (class_2244)class_22482;
            this.add(field002.method_8389());
        }
        return;
    }

    public static /* bridge */ /* synthetic */ SecureClass0459 Z9BzBQmdume6w5B7gzUUiM88TLYsonwt() {
        return field001;
    }
}

