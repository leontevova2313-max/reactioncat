/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.SecureClass0228;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group048.SecureClass0866;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group028.SecureClass0500;
import org.phobos.secure.group040.eH9SdILNc6d6tyda8Mdix1YXAgufMOdd;
import org.phobos.secure.group050.SecureClass0893;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoKitModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public final /* synthetic */ SecureClass0603<eH9SdILNc6d6tyda8Mdix1YXAgufMOdd> mode;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<String> kit;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Long> delay;

    public /* synthetic */ AutoKitModule(SecureClass0242 t8aMLU2hRXwoOAJH2bM7QvLZKboyXK1z) {
        super(t8aMLU2hRXwoOAJH2bM7QvLZKboyXK1z, "AutoKit", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Automatically gives you a kit", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<eH9SdILNc6d6tyda8Mdix1YXAgufMOdd>("Mode", eH9SdILNc6d6tyda8Mdix1YXAgufMOdd.Always));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 5000L, true).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new eH9SdILNc6d6tyda8Mdix1YXAgufMOdd[]{eH9SdILNc6d6tyda8Mdix1YXAgufMOdd.Always})));
        this.kit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Kit", "kit 22"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Kill").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, eH9SdILNc6d6tyda8Mdix1YXAgufMOdd.Auto));
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field001 = false;
        this.cfr_renamed_69(new SecureClass0228(this));
        this.cfr_renamed_69(new SecureClass0866(this));
        this.cfr_renamed_69(new SecureClass0500(this));
        this.cfr_renamed_69(new SecureClass0893(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            if (this.mode.getValue().equals((Object)((Object)eH9SdILNc6d6tyda8Mdix1YXAgufMOdd.Always))) {
                this.foc4DEvX7GNdJsX2JJB1tirKnyFuHDak();
            }
        });
    }
}

