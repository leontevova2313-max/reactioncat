/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group002;

import java.util.Iterator;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_2480;
import org.phobos.secure.group029.SecureClass0521;
import org.phobos.secure.group041.SecureClass0725;

public class SecureClass0017
extends SecureClass0521<class_1792> {
    public static final /* synthetic */ SecureClass0017 field001;

    static {
        field001 = new SecureClass0017();
    }

    public static /* bridge */ /* synthetic */ SecureClass0017 b4LafGf143yuO63gsdAWXMvFl7y5wmnh() {
        return field001;
    }

    public /* synthetic */ SecureClass0017() {
        super("Shulkers");
        Iterator<class_2248> iterator = SecureClass0725.UbZCPB1DIAp9LBejOGNF477VYWGTUgZz().iterator();
        while (iterator.hasNext()) {
            class_2248 field002 = iterator.next();
            if (!(field002 instanceof class_2480)) continue;
            class_2480 field003 = (class_2480)field002;
            this.add(field003.method_8389());
        }
        return;
    }
}

