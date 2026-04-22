/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group053;

import java.util.Iterator;
import net.minecraft.class_2244;
import net.minecraft.class_2248;
import org.phobos.secure.group029.SecureClass0521;
import org.phobos.secure.group041.SecureClass0725;

public class SecureClass0955
extends SecureClass0521<class_2248> {
    public static final /* synthetic */ SecureClass0955 field001;

    public static /* bridge */ /* synthetic */ SecureClass0955 q7bjrzfjowBiI14b5pHQ5J9Zf88TICP0() {
        return field001;
    }

    public /* synthetic */ SecureClass0955() {
        super("Beds");
        Iterator<class_2248> iterator = SecureClass0725.UbZCPB1DIAp9LBejOGNF477VYWGTUgZz().iterator();
        while (iterator.hasNext()) {
            class_2248 field002 = iterator.next();
            if (!(field002 instanceof class_2244)) continue;
            class_2244 field003 = (class_2244)field002;
            this.add(field003);
        }
        return;
    }

    static {
        field001 = new SecureClass0955();
    }
}

