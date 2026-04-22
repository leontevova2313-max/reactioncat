/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.tUeWmrnN4C7F7g2MjcciZQdzin5cNUKI;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group015.SecureClass0243;
import org.phobos.secure.group019._8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group026.URtkVJm9ilOvXAKntVHAA29bMDV78nK7;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group059.SecureClass1076;

public class AutoLoginModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> field001;
    public final /* synthetic */ SecureClass0603<String> field002;
    public final /* synthetic */ SecureClass0603<String> field003;
    public final /* synthetic */ SecureClass0603<String> field004;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field005;
    public final /* synthetic */ SecureClass0603<String> field006;
    public final /* synthetic */ SecureClass0603<Boolean> field007;
    public final /* synthetic */ SecureClass0603<_8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb> field008;
    public final /* synthetic */ tUeWmrnN4C7F7g2MjcciZQdzin5cNUKI field009;
    public final /* synthetic */ SecureClass0603<Boolean> field010;
    public final /* synthetic */ SecureClass0603<String> field011;

    public /* synthetic */ AutoLoginModule(SecureClass0242 bf7WWCnq8COEzjUV2BIyA119RKGGH89n) {
        super(bf7WWCnq8COEzjUV2BIyA119RKGGH89n, "AutoLogin", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Automatically logs you in using stored database", new int[0]);
        this.field008 = new SecureClass0033<_8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb>("Mode", _8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb.Single).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass0667("Trigger", "/login").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field011 = new SecureClass0667("Command", "login %password%").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass0840("Timeout", 5000L, 250L, 10000L).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0667("Password", "123").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field008, new _8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb[]{_8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb.Single})).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field010 = new SecureClass1022("Create").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0667("CreateLogin", "user").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0667("CreatePassword", "123").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass1022("List").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field008, new _8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb[]{_8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb.Multi})).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field009 = new tUeWmrnN4C7F7g2MjcciZQdzin5cNUKI();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field010, this.field004, this.field003).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field008, new _8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb[]{_8xuzczV73zhGE4qjIbDfoSO0KQO4cOMb.Multi}));
        this.cfr_renamed_69(new SecureClass1076(this));
        this.cfr_renamed_69(new SecureClass0243(this));
        this.field011.cfr_renamed_123(string -> {
            if (!string.contains("%password%")) {
                this.QesFPNePMQP1QX1qvFLRZmdqHXNLKxpF("Command must contain \"%password%\"");
                this.field011.crraVzykwykyJsThoWn3tfrxvjJ10d3S(this.field011.WzTNlVqrT6GQ7RhlvyGsKLIXoFTdQpSy());
            }
        });
        this.field010.cfr_renamed_123(bl -> {
            if (bl.booleanValue()) {
                if (this.field004.getValue().isEmpty()) {
                    this.QesFPNePMQP1QX1qvFLRZmdqHXNLKxpF("Can't register an account with no name!");
                } else if (this.field003.getValue().isEmpty()) {
                    this.QesFPNePMQP1QX1qvFLRZmdqHXNLKxpF("Can't register an account with no password!");
                } else {
                    this.field009.k7V90uMMcs19DU4SpO1ieIV7k8rLOnby(this.field004.getValue(), this.field003.getValue());
                }
                this.field010.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        this.field007.cfr_renamed_123(nBn9MtytsinorkeaqeSw11CXrr9bmFWg -> {
            if (nBn9MtytsinorkeaqeSw11CXrr9bmFWg.booleanValue()) {
                for (URtkVJm9ilOvXAKntVHAA29bMDV78nK7 QL5yXIoqOlshQ9DoUoC8uOpZbu52alao : this.field009.VDZJFA7l7Zj39naxZ0Zo2ymxVYdXKWk1) {
                    this.QesFPNePMQP1QX1qvFLRZmdqHXNLKxpF(QL5yXIoqOlshQ9DoUoC8uOpZbu52alao.iJBOyWYQxlTPdgcdtWvdAF87sYxnMqSp() + " -> " + QL5yXIoqOlshQ9DoUoC8uOpZbu52alao.cfr_renamed_492());
                }
                this.field007.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

