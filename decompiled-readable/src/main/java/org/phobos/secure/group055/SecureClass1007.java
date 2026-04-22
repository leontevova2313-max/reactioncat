/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import com.mojang.authlib.GameProfile;
import java.util.function.Function;
import net.minecraft.class_243;
import net.minecraft.class_638;
import org.phobos.secure.group011.SecureClass0171;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1028;

public class SecureClass1007
extends SecureClass0171
implements SecureInterface0134 {
    public /* synthetic */ boolean field001;
    public /* synthetic */ Function<class_243, class_243> field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ SecureClass1028 field004;

    public /* synthetic */ SecureClass1007(class_638 K2XmjTA8zcMKXXwhcYjjIZi7nW2LP8uG, GameProfile KX9X8ZmFpW7cii0KHP2DpjUyMwTflUZu) {
        super(K2XmjTA8zcMKXXwhcYjjIZi7nW2LP8uG, KX9X8ZmFpW7cii0KHP2DpjUyMwTflUZu);
        this.field002 = Function.identity();
    }

    public /* synthetic */ SecureClass1007(class_638 class_6382) {
        super(class_6382);
        this.field002 = Function.identity();
    }
}

