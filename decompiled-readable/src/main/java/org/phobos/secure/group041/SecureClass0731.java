/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group041;

import net.minecraft.class_2561;
import net.minecraft.class_437;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group054.SecureInterface0134;

public class SecureClass0731
extends class_437
implements SecureInterface0134 {
    public final /* synthetic */ long field001;
    public final /* synthetic */ SecureClass0377 field002;
    public static /* synthetic */ boolean field003;

    public /* synthetic */ SecureClass0731() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field002 = new SecureClass0377();
        this.field001 = System.currentTimeMillis();
        field003 = true;
    }

    static {
        field003 = false;
    }
}

