/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import net.minecraft.class_243;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group005.SecureClass0072;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1001;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group028.SecureClass0489;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AnnouncerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> join;
    public final /* synthetic */ SecureClass0603<Boolean> client;
    public final /* synthetic */ SecureClass0603<Boolean> leave;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> consume;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Boolean> movement;
    public /* synthetic */ int field002;
    public /* synthetic */ class_243 field003;

    public /* synthetic */ AnnouncerModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Announcer", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Announces your actions", new int[0]);
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 2000L, 0L, 30000L));
        this.movement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Movement"));
        this.consume = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Consume"));
        this.join = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Join"));
        this.leave = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Leave"));
        this.client = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Client").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Client-side messages"));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = 0;
        this.cfr_renamed_69(new SecureClass0072(this));
        this.cfr_renamed_69(new SecureClass1001(this));
        this.cfr_renamed_69(new SecureClass0489(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field003 = null;
            this.field002 = 0;
            this.field001.kBV8JHPVfmyQSmxrXmFgvwxMsYzBEJIy();
        });
    }
}

