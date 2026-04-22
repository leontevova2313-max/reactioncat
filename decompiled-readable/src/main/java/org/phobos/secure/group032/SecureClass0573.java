/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

import net.minecraft.class_1306;
import net.minecraft.class_1829;
import net.minecraft.class_1839;
import net.minecraft.class_4587;
import net.minecraft.class_746;
import org.phobos.secure.group002.vVxxt53LBxjGZfRxUzo0nTlqXlZMDjsN;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class SecureClass0573
extends SecureClass1027 {
    public static /* synthetic */ SecureClass0573 field001;
    public final /* synthetic */ SecureClass0603<Float> offset;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl> animation;
    public final /* synthetic */ SecureClass0603<Float> scale;

    public /* synthetic */ SecureClass0573(SecureClass0242 UPoD9JQS4C0mC0hrAOeR8URzFHAmfXL3) {
        super(UPoD9JQS4C0mC0hrAOeR8URzFHAmfXL3, "1.8", SecureClass1004.cfr_renamed_106, "Tweaks some game mechanics to match 1.8", new int[0]);
        this.animation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl>("Animation", gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl.Default));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Offset", Float.valueOf(0.1f), Float.valueOf(0.05f), Float.valueOf(0.3f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.animation, gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl.OneSeven));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(0.9f), Float.valueOf(0.1f), Float.valueOf(1.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.animation, gAEHLhZfW7uBKJj8YxfS6zbAt3oRJCcl.OneSeven));
        this.field002 = false;
        field001 = this;
        this.cfr_renamed_69(new vVxxt53LBxjGZfRxUzo0nTlqXlZMDjsN(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }

    public static /* bridge */ /* synthetic */ boolean YorGnQLy6XOMyNMIIVmvpI5eksLgmPY4() {
        return SecureClass0573.field001.field002;
    }

    public static /* bridge */ /* synthetic */ boolean Aonvur9S8uzTfJKUr1NUGqvYDikHYaCI(class_4587 VQgQYO4pGYmqq9VDUlRrsMVLiXrg5QgR, class_1306 uRKuJPYHBLviFdPykP3dRvcgo24mVE7Q, float w0EHRHM1601pWEcX0qWPCX7blQQFU59y, float TIMTI9vkdFN2UYF31H5NoQfbXztvJKmR) {
        if (!SecureClass0573.UZokPY9FdVf5VUcV1D1BsuhjnIMBjz6u()) {
            return false;
        }
        SecureClass0573.field001.animation.getValue().transform(field001, VQgQYO4pGYmqq9VDUlRrsMVLiXrg5QgR, uRKuJPYHBLviFdPykP3dRvcgo24mVE7Q, TIMTI9vkdFN2UYF31H5NoQfbXztvJKmR, w0EHRHM1601pWEcX0qWPCX7blQQFU59y);
        return true;
    }

    public static /* bridge */ /* synthetic */ void pxWYXPG9PkDclSKxIC815sJtmtENj2Wg(class_4587 ee8w7BJh78ElpXoCABTHWDzVO63Vq1xE, class_1306 class_13062) {
        int field003 = class_13062 == class_1306.field_6183 ? 1 : -1;
        ee8w7BJh78ElpXoCABTHWDzVO63Vq1xE.method_46416((float)field003 * 0.56f, -0.52f, -0.72f);
    }

    public static /* bridge */ /* synthetic */ boolean UZokPY9FdVf5VUcV1D1BsuhjnIMBjz6u() {
        if (SecureClass0573.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null || !(SecureClass0573.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_6047().method_7909() instanceof class_1829) || field001 == null || !field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return false;
        }
        return SecureClass0573.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && SecureClass0573.JksdjgqjcqxwbWS25matR2AVTblCmvju(SecureClass0573.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724) || SecureClass0573.field001.field002;
    }

    public static /* bridge */ /* synthetic */ SecureClass0573 cfr_renamed_22() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ boolean JksdjgqjcqxwbWS25matR2AVTblCmvju(class_746 n5umcR9E8BPJPSu2MeIV5GJhj4UY817k) {
        return n5umcR9E8BPJPSu2MeIV5GJhj4UY817k.method_6115() && n5umcR9E8BPJPSu2MeIV5GJhj4UY817k.method_6030().method_7976().equals((Object)class_1839.field_8949);
    }

    public static /* bridge */ /* synthetic */ void rfWcuJj8DGbz0YssQotpaTVdtFYtnbmB(boolean hQ0paGP50R7YXWWwhqsERv6llVE8l9nb) {
        SecureClass0573.field001.field002 = hQ0paGP50R7YXWWwhqsERv6llVE8l9nb;
    }
}

