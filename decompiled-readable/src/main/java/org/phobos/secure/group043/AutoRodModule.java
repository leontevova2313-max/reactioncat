/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group043;

import org.phobos.secure.group008.KaEdSu3a9f7sgq46nForhyxXHuLOCRJh;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.SecureClass0990;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoRodModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Integer> hold;
    public final /* synthetic */ SecureClass0603<Integer> timeoutTicks;
    public final /* synthetic */ SecureClass0603<Integer> step;
    public final /* synthetic */ SecureClass0603<Boolean> timeout;
    public final /* synthetic */ SecureClass0603<Integer> predictionTicks;
    public final /* synthetic */ SecureClass0603<Boolean> disable;
    public /* synthetic */ float[] field001;
    public /* synthetic */ int field002;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Boolean> prediction;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Double> range;
    public /* synthetic */ KaEdSu3a9f7sgq46nForhyxXHuLOCRJh field004;

    public /* synthetic */ AutoRodModule(SecureClass0242 bibAoshmFP7UVL4lw5AYCRSLsKK6ruSH) {
        super(bibAoshmFP7UVL4lw5AYCRSLsKK6ruSH, "AutoRod", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Hooks closest enemy with a rod", new int[0]);
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 4.0, 0.1, 7.0));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 5.0, 0.3, 10.0));
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Step", 0, Integer.valueOf(0), Integer.valueOf(5), "t"));
        this.hold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Hold", 2, Integer.valueOf(1), Integer.valueOf(5), "t"));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 0L, 0L, 2000L, true));
        this.prediction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.predictionTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PredictionTicks", 2, 1, 4));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Timeout", true));
        this.timeoutTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("TimeoutTicks", 6, Integer.valueOf(1), Integer.valueOf(32), "t"));
        this.disable = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Disable").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Disable after execution"));
        this.field004 = KaEdSu3a9f7sgq46nForhyxXHuLOCRJh.None;
        this.field003 = 0;
        this.field002 = 0;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.prediction, this.predictionTicks);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.timeout, this.timeoutTicks);
        this.cfr_renamed_69(new SecureClass0990(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

