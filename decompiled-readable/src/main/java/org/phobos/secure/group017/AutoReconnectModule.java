/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group017;

import net.minecraft.class_642;
import org.phobos.secure.group005.SecureClass0066;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039.SecureClass0678;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1027;

public class AutoReconnectModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public /* synthetic */ long field002;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public /* synthetic */ boolean field004;
    public /* synthetic */ class_642 field005;

    public /* synthetic */ AutoReconnectModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoReconnect", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Reconnects you to the server", new int[0]);
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 5000L, 1000L, 60000L));
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new SecureClass0678(this));
        this.cfr_renamed_69(new SecureClass0066(this));
    }
}

