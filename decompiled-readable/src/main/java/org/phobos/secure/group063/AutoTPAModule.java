/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group020.P8PRV7kBnyd1CWAEQZ6DmKtP7JR8JPJA;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group059.QCUYKmpo58ZQO5iFapac5UTeYQf0ihhK;

public class AutoTPAModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<P8PRV7kBnyd1CWAEQZ6DmKtP7JR8JPJA> mode;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ List<UUID> field002;

    public /* synthetic */ AutoTPAModule(SecureClass0242 ZWLEGnXUxIGWWAacMU92lX2boo2ZvJjM) {
        super(ZWLEGnXUxIGWWAacMU92lX2boo2ZvJjM, "AutoTPA", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Sends everyone tpa requests", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<P8PRV7kBnyd1CWAEQZ6DmKtP7JR8JPJA>("Mode", P8PRV7kBnyd1CWAEQZ6DmKtP7JR8JPJA.Normal));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 2000L, true));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = new ArrayList<UUID>();
        this.cfr_renamed_69(new QCUYKmpo58ZQO5iFapac5UTeYQf0ihhK(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

