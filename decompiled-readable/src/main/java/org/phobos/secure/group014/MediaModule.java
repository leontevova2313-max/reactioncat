/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class MediaModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<String> field001;
    public static /* synthetic */ MediaModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<String> field004;

    public /* synthetic */ MediaModule(SecureClass0242 yczjDfwy5N5x4U0X3Mf3YPWk6U4LkOBw) {
        super(yczjDfwy5N5x4U0X3Mf3YPWk6U4LkOBw, "Media", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Hides your name", new int[0]);
        this.field001 = new SecureClass0667("Replacement", "Player").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass1022("Friends").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0667("FriendsReplacement", "Friend");
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field003, this.field004);
        field002 = this;
    }

    public static /* bridge */ /* synthetic */ MediaModule QFMAJ0cjHwmAOz4ALG8rY1tzG9iCWhhK() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_25() {
        return field002 != null && field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ String cfr_renamed_20(String field005) {
        if (MediaModule.cfr_renamed_25()) {
            if (MediaModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && field005.contains(MediaModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_5820())) {
                return field005.replace(MediaModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_5820(), MediaModule.field002.field001.getValue());
            }
            if (!MediaModule.field002.field003.getValue().booleanValue()) {
                return field005;
            }
            String string = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().kCoaiPkMkTBSaD24aUsOrNJVsU7avY2F(field005);
            if (string != null) {
                return field005.replace(string, MediaModule.field002.field004.getValue());
            }
        }
        return field005;
    }
}

