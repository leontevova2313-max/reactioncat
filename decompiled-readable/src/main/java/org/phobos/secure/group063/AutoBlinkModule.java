/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.GfISvEKWbUY9jkZpk1Na4phfF6WpZfWy;
import org.phobos.secure.group053.MY3J1MEeiijiXjuhSwIOwb3wapjGefWA;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoBlinkModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> timeout;
    public final /* synthetic */ SecureClass0603<Boolean> triggerBlock;
    public final /* synthetic */ SecureClass0603<Boolean> releaseTime;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Boolean> releaseBlock;
    public static /* synthetic */ AutoBlinkModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> triggerHole;
    public /* synthetic */ boolean field003;
    public /* synthetic */ boolean field004;
    public final /* synthetic */ SecureClass0603<Boolean> releaseHole;

    public static /* bridge */ /* synthetic */ AutoBlinkModule GnmUmdNd6avPpzMIpOMAAdfN22MG6wbx() {
        return field002;
    }

    public /* synthetic */ AutoBlinkModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoBlink", SecureClass1004.cfr_renamed_106, "Turns blink on and off for you", new int[0]);
        this.triggerHole = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("TriggerHole"));
        this.triggerBlock = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("TriggerBlock"));
        this.releaseHole = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ReleaseHole"));
        this.releaseBlock = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ReleaseBlock"));
        this.releaseTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ReleaseTime"));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Timeout", 500L, 50L, 10000L, true));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_89("Trigger", this.triggerHole, this.triggerBlock);
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Release").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.releaseTime, this.timeout)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.releaseHole, this.releaseBlock).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new GfISvEKWbUY9jkZpk1Na4phfF6WpZfWy(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new MY3J1MEeiijiXjuhSwIOwb3wapjGefWA(this));
        field002 = this;
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

