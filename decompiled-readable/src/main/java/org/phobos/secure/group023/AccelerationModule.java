/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group023;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.ivpPqMSRC9AjuHg5745uHaI72zUiajhU;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041._9NjcQ2Kmz8BUBoExuvn4oRD6WuiOF3O8;
import org.phobos.secure.group049.TIvSLJofSGBNbmySYP7tIILjp1gfMr9X;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.GeL4tB8bkaS4a2eqWFgeA0xCMC4bwmZg;
import org.phobos.secure.group040.SecureClass0692;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AccelerationModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0692 field002;
    public final /* synthetic */ SecureClass0603<Boolean> stop;
    public final /* synthetic */ SecureClass0603<Boolean> move;
    public final /* synthetic */ SecureClass0603<Boolean> air;
    public final /* synthetic */ SecureClass0603<Double> boostReduction;
    public final /* synthetic */ SecureClass0603<Double> moveFactor;
    public final /* synthetic */ SecureClass0603<Integer> boostTicks;
    public final /* synthetic */ SecureClass0603<ivpPqMSRC9AjuHg5745uHaI72zUiajhU> moveControl;

    public /* synthetic */ AccelerationModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Acceleration", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you strafe", new int[0]);
        this.move = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Move"));
        this.air = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Air", true));
        this.moveControl = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<ivpPqMSRC9AjuHg5745uHaI72zUiajhU>("MoveControl", ivpPqMSRC9AjuHg5745uHaI72zUiajhU.Strict).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses alternative speed for UNCP only"));
        this.moveFactor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("MoveFactor", 1.0, 0.5, 2.0));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Boost"));
        this.boostTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("BoostTicks", 0, 0, 16).cfr_renamed_85("None", 0));
        this.boostReduction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("BoostReduction", 1.0, 0.1, 5.0));
        this.stop = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Stop", true));
        this.field002 = new SecureClass0692();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.move, this.air, this.moveControl, this.moveFactor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.boostTicks, this.boostReduction);
        this.cfr_renamed_69(new _9NjcQ2Kmz8BUBoExuvn4oRD6WuiOF3O8(this, 1000));
        this.cfr_renamed_69(new GeL4tB8bkaS4a2eqWFgeA0xCMC4bwmZg(this));
        this.cfr_renamed_69(new TIvSLJofSGBNbmySYP7tIILjp1gfMr9X(this));
    }
}

