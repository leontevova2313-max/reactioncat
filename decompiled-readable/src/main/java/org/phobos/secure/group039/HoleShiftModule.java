/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group039;

import net.minecraft.class_243;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group020.SecureClass0340;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class HoleShiftModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<Boolean> step;
    public final /* synthetic */ SecureClass0603<Integer> field001;
    public final /* synthetic */ SecureClass0603<Double> field002;
    public final /* synthetic */ SecureClass0603<Boolean> normal;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public /* synthetic */ class_243 field004;

    public /* synthetic */ HoleShiftModule(SecureClass0242 YY6syy9A2ufZtxqijMrU6VLoaQTDBJ2d) {
        super(YY6syy9A2ufZtxqijMrU6VLoaQTDBJ2d, "HoleShift", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Simulates lag after leaving a hole", new int[0]);
        this.field001 = new SecureClass0962<Integer>("Ticks", 5, 1, 20).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass1022("Range").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0962<Double>("RangeValue", 6.0, 0.1, 30.0).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Step"));
        this.normal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Normal"));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(2.0f), Float.valueOf(0.6f), Float.valueOf(2.0f)));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field003, this.field002);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.step, this.normal, this.height);
        this.cfr_renamed_69(new SecureClass0340(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

