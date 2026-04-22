/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group006;

import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0087
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Boolean> laggy;
    public final /* synthetic */ SecureClass0603<Boolean> scaffold;
    public final /* synthetic */ SecureClass0603<Boolean> offset;
    public final /* synthetic */ SecureClass0603<Integer> scaffoldTicks;
    public final /* synthetic */ SecureClass0603<Boolean> eyesExtend;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Integer> field002;

    public /* synthetic */ SecureClass0087(SecureClass0242 OYVFXkUkkmAWELhtCx95gWNgpOLFSjyU) {
        super(OYVFXkUkkmAWELhtCx95gWNgpOLFSjyU, "CombatPlace", "Places blocks to block enemy movement", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 18);
        this.scaffold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Scaffold").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Places blocks below the enemy"));
        this.scaffoldTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("ScaffoldTicks", 2, 1, 5));
        this.laggy = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Laggy").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses E-Chests"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Eyes"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("EyesTiming", 4, 1, 5));
        this.eyesExtend = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("EyesExtend"));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Offset").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses real prediction Y instead of base Y"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.scaffold, this.scaffoldTicks, this.laggy);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.field002, this.eyesExtend);
    }
}

