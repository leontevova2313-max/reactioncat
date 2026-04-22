/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import net.minecraft.class_1542;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_5819;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ItemPhysicsModule
extends SecureClass1027 {
    public static final /* synthetic */ float field001 = 0.0625f;
    public final /* synthetic */ class_5819 field002;
    public /* synthetic */ boolean field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> drag;
    public static /* synthetic */ ItemPhysicsModule field005;

    public static /* bridge */ /* synthetic */ ItemPhysicsModule lnXFg9BAfNFuarz5EXBbpF8jHkkCzN2x() {
        return field005;
    }

    public /* synthetic */ ItemPhysicsModule(SecureClass0242 H3t6Jweq7pMaqePdtzN4ED81G52b0s2Y) {
        super(H3t6Jweq7pMaqePdtzN4ED81G52b0s2Y, "ItemPhysics", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Adds physics to items", new int[0]);
        this.drag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Drag"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate"));
        this.field002 = class_5819.method_43053();
        field005 = this;
    }

    public static /* bridge */ /* synthetic */ boolean yUqLT9ZtvY7fgdUfS8MhxXkK7fASNPJT(class_1542 J0eVSVocyPs9H9BT0XNI3I0DRwXtKAAW, float K3NGLqWaJ4SSVCaLHqYzcNbCoL97WsaD, float f, class_4587 gn0O30BQXCGBEuqRPcHKlvdnO4fS24tJ, class_4597 class_45972, int n) {
        if (field005.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            field005.GpxdbOE9dhjZ9rpN8fmtUP87geCw3mjU(J0eVSVocyPs9H9BT0XNI3I0DRwXtKAAW, gn0O30BQXCGBEuqRPcHKlvdnO4fS24tJ, class_45972, n, f);
            return true;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean qZnCasjMSUZ6lGJcCkZzLqbpPWYWSlIh() {
        return field005.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ItemPhysicsModule.field005.field003;
    }
}

