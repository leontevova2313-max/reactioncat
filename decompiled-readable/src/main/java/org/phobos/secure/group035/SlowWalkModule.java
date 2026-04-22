/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group025.SecureClass0432;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class SlowWalkModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> acceleration;
    public final /* synthetic */ SecureClass0603<Float> field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0603<Long> balance;

    public /* synthetic */ SlowWalkModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "SlowWalk", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Balances timer speed", new int[0]);
        this.acceleration = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Acceleration", Float.valueOf(1.4f), Float.valueOf(1.1f), Float.valueOf(2.0f)));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Shift", Float.valueOf(0.7f), Float.valueOf(0.1f), Float.valueOf(0.9f)));
        this.balance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Balance", 250L, 0L, 500L, true));
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = false;
        this.cfr_renamed_69(new SecureClass0432(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("beta", this);
    }
}

