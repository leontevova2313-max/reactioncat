/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group002;

import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.SecureClass0313;
import org.phobos.secure.group029.SecureClass0516;
import org.phobos.secure.group033.SecureClass0578;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0890;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group021.SecureClass0345;
import org.phobos.secure.group023.SecureClass0399;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.SecureClass0980;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TickShiftModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<Float> field006;
    public final /* synthetic */ SecureClass0603<Boolean> field007;
    public final /* synthetic */ SecureClass0603<Integer> field008;

    public /* synthetic */ TickShiftModule(SecureClass0242 YqQsVXxjCK5bT4nmrQ11XS7FEls1GReH) {
        super(YqQsVXxjCK5bT4nmrQ11XS7FEls1GReH, "TickShift", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Shifts and releases packets to make you faster", new int[0]);
        this.field006 = new SecureClass0962<Float>("Speed", Float.valueOf(2.5f), Float.valueOf(0.1f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field008 = new SecureClass0962<Integer>("Packets", 10, 1, 50).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass1022("Sneaking").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("Ground").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass1022("Rotation").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass1022("Instant").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass1022("InstantDisable").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.field005);
        this.cfr_renamed_69(new SecureClass0313(this));
        this.cfr_renamed_69(new SecureClass0980(this));
        this.cfr_renamed_69(new SecureClass0516(this));
        this.cfr_renamed_69(new SecureClass0399(this));
        this.cfr_renamed_69(new SecureClass0890(this));
        this.cfr_renamed_69(new SecureClass0345(this));
        this.cfr_renamed_69(new SecureClass0578(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv.S4LvIyXT911Z6JX1A9sbgjbm7y8XdGXy().T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            this.field003 = 0;
        });
    }
}

