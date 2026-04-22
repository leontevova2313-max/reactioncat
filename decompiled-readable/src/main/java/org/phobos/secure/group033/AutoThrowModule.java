/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group033;

import net.minecraft.class_1657;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group011._1AIzWeXiLjedIRVIrkFh9XRa6TZOHgyi;
import org.phobos.secure.group011.xekASqJS6tVJvlTWW9ewssmqQ1EfQidt;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.SecureClass0261;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoThrowModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Integer> predictionTicks;
    public /* synthetic */ class_1657 field001;
    public final /* synthetic */ SecureClass0603<Boolean> combo;
    public final /* synthetic */ SecureClass0603<_1AIzWeXiLjedIRVIrkFh9XRa6TZOHgyi> target;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<Integer> step;
    public /* synthetic */ xekASqJS6tVJvlTWW9ewssmqQ1EfQidt field003;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Double> threshold;
    public final /* synthetic */ SecureClass0603<Boolean> disable;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public /* synthetic */ int field004;
    public final /* synthetic */ SecureClass0603<Boolean> prediction;
    public final /* synthetic */ SecureClass0603<Integer> balance;
    public /* synthetic */ int field005;
    public /* synthetic */ float[] field006;

    public /* synthetic */ AutoThrowModule(SecureClass0242 tqK0jufml6JibGmo1rdh4sCJ5Q72TqRb) {
        super(tqK0jufml6JibGmo1rdh4sCJ5Q72TqRb, "AutoThrow", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Throws eggs/snowballs at a target", new int[0]);
        this.prediction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.predictionTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PredictionTicks", 2, 1, 4));
        this.target = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_1AIzWeXiLjedIRVIrkFh9XRa6TZOHgyi>("Target", _1AIzWeXiLjedIRVIrkFh9XRa6TZOHgyi.Auto));
        this.balance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Balance", 0, Integer.valueOf(0), Integer.valueOf(3), "t"));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 450L, 0L, 3000L, true));
        this.disable = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Disable"));
        this.combo = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Combo").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Terrifying tactics"));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 4.3, 2.0, 7.0));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Threshold", 0.3, 0.01, 0.4));
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Step", 6, Integer.valueOf(0), Integer.valueOf(16), "t"));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field005 = 0;
        this.field004 = 0;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.combo, this.distance, this.threshold, this.step);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.prediction, this.predictionTicks);
        this.cfr_renamed_69(new SecureClass0261(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

