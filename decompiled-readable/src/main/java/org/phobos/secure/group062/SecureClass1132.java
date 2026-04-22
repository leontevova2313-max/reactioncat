/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import java.util.Iterator;
import net.minecraft.class_2248;
import net.minecraft.class_2480;
import org.phobos.secure.group029.SecureClass0521;
import org.phobos.secure.group041.SecureClass0725;

public class SecureClass1132
extends SecureClass0521<class_2248> {
    public static final /* synthetic */ SecureClass1132 field001;

    static {
        field001 = new SecureClass1132();
    }

    public static /* bridge */ /* synthetic */ SecureClass1132 C11Ky7zYObARq4A5AzCxaRSSMMjhdt09() {
        return field001;
    }

    public /* synthetic */ SecureClass1132() {
        super("Shulkers");
        Iterator<class_2248> iterator = SecureClass0725.UbZCPB1DIAp9LBejOGNF477VYWGTUgZz().iterator();
        while (iterator.hasNext()) {
            class_2248 field002 = iterator.next();
            if (!(field002 instanceof class_2480)) continue;
            class_2480 field003 = (class_2480)field002;
            this.add(field003);
        }
        return;
    }
}

