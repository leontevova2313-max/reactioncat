/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import org.phobos.secure.group013.SecureClass0187;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.SecureClass0627;
import org.phobos.secure.group039.SecureClass0673;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group030.SecureInterface0082;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group062.PPsirTP5OsBL70nUAINvhG6na9yRrpHs;

public class AimBotModule
extends SecureClass0187 {
    public final /* synthetic */ SecureClass0603<Boolean> bow;
    public final /* synthetic */ SecureInterface0082 field001;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureInterface0082 field002;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Boolean> prediction;
    public final /* synthetic */ SecureClass0603<Boolean> thorwables;

    public /* synthetic */ AimBotModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AimBot", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Adjusts your aim");
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 64.0, 6.0, 200.0));
        this.bow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Bow"));
        this.thorwables = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Thorwables").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Snowballs & Eggs"));
        this.prediction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 1, 1, 5));
        this.field002 = new SecureClass0673();
        this.field001 = new SecureClass0627();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.prediction, this.ticks);
        this.cfr_renamed_69(new PPsirTP5OsBL70nUAINvhG6na9yRrpHs(this, 8, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
    }
}

