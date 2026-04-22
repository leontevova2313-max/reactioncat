/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.l0Urun2abXBe0SS1IOlSPdpGqqW5PfyZ;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.y2FQ3hePQeW0W4oQjyahzyHwvmhj7Rem;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FastFallModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Double> speed;
    public final /* synthetic */ SecureClass0603<Double> height;
    public final /* synthetic */ SecureClass0603<y2FQ3hePQeW0W4oQjyahzyHwvmhj7Rem> mode;
    public /* synthetic */ boolean field001;
    public final /* synthetic */ SecureClass0603<Boolean> verify;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;

    public /* synthetic */ FastFallModule(SecureClass0242 Wxi0BQmRjmiK0Nc8bEHFSPwUt6YThidC) {
        super(Wxi0BQmRjmiK0Nc8bEHFSPwUt6YThidC, "FastFall", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you fall fast", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<y2FQ3hePQeW0W4oQjyahzyHwvmhj7Rem>("Mode", y2FQ3hePQeW0W4oQjyahzyHwvmhj7Rem.Normal));
        this.verify = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Verify").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Tests if you will fall correctly or not"));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Height", 6.0, 0.5, 150.0));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Correction").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, y2FQ3hePQeW0W4oQjyahzyHwvmhj7Rem.Strict).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Corrects horizontal velocity"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Speed", 4.0, 1.0, 10.0));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.verify, this.height);
        this.cfr_renamed_69(new l0Urun2abXBe0SS1IOlSPdpGqqW5PfyZ(this, -1000, Wxi0BQmRjmiK0Nc8bEHFSPwUt6YThidC));
    }
}

