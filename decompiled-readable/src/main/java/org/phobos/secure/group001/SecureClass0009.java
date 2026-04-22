/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.class_2596;
import org.phobos.secure.group001.d6WiyzDZ8WOrGKpKOK4HM6G6JMpOw8xf;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.HXxrgtEIVIHDnS1y5P8DOhKxHTvKiNsC;
import org.phobos.secure.group009.qu6TToopy9lEHdSqpqThPopVjbogjwdR;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group047.SaZoGBR6fior34PO3OBFDiyeE6jFi1FI;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.IuPNfIdBsVWcKpKONtH4awGhjk9RM075;
import org.phobos.secure.group040.D8iYw6uoSDLYxJ4kmzqeswNwMZFgf3rf;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.x2YNGL4V3zS8N9PSEP9Xg0ipREXEZJrb;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class SecureClass0009
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ Set<class_2596<?>> field002;
    public final /* synthetic */ SecureClass0603<Double> maxRange;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Boolean> velocity;
    public final /* synthetic */ SecureClass0603<Integer> lag;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> debug;
    public /* synthetic */ SaZoGBR6fior34PO3OBFDiyeE6jFi1FI field004;
    public final /* synthetic */ SecureClass0603<Boolean> scaffold;
    public final /* synthetic */ SecureClass0603<Boolean> resync;
    public final /* synthetic */ SecureClass0603<Integer> timer;
    public final /* synthetic */ SecureClass0603<Boolean> pause;
    public final /* synthetic */ SecureClass0603<Boolean> ground;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field005;
    public final /* synthetic */ SecureClass0603<Boolean> reset;
    public final /* synthetic */ SecureClass0603<Double> minRange;
    public final /* synthetic */ SecureClass0603<D8iYw6uoSDLYxJ4kmzqeswNwMZFgf3rf> mode;
    public final /* synthetic */ SecureClass0603<Boolean> break;

    public /* synthetic */ SecureClass0009(SecureClass0242 AtmVrWRkD199XBwkN7hEE0qV74HBrHwS) {
        super(AtmVrWRkD199XBwkN7hEE0qV74HBrHwS, "LagSwitch", "Performs lag/blink/teleport at contact moments to get a first hit", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<D8iYw6uoSDLYxJ4kmzqeswNwMZFgf3rf>("Mode", D8iYw6uoSDLYxJ4kmzqeswNwMZFgf3rf.Lag));
        this.lag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Lag", 2, 0, 15));
        this.timer = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Timer", 2, 0, 15));
        this.minRange = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("MinRange", 3.6, 0.0, 8.0));
        this.maxRange = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("MaxRange", 5.0, 0.0, 8.0));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 4000L, true));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reset", false));
        this.break = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Break", "Stops lagging/shifting if the conditions are met", true));
        this.pause = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Pause", false));
        this.ground = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Ground", false));
        this.velocity = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Velocity", false));
        this.scaffold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Scaffold", false));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Invisible", false));
        this.resync = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Resync", "Stops lag on attack", false));
        this.debug = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Debug"));
        this.field005 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field004 = SaZoGBR6fior34PO3OBFDiyeE6jFi1FI.None;
        this.field003 = 0;
        this.field002 = new LinkedHashSet<class_2596<?>>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.pause, this.ground, this.velocity, this.scaffold, this.field001);
        this.cfr_renamed_69(new x2YNGL4V3zS8N9PSEP9Xg0ipREXEZJrb(this));
        this.cfr_renamed_69(new HXxrgtEIVIHDnS1y5P8DOhKxHTvKiNsC(this, 300));
        this.cfr_renamed_69(new d6WiyzDZ8WOrGKpKOK4HM6G6JMpOw8xf(this, 300));
        this.cfr_renamed_69(new IuPNfIdBsVWcKpKONtH4awGhjk9RM075(this, 2000));
        this.cfr_renamed_69(new qu6TToopy9lEHdSqpqThPopVjbogjwdR(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

