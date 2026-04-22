/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group028;

import net.minecraft.class_1657;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group037._7gW6zgoWyEc5rllNyGZDhbzFBYYfqFd6;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoChaseModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> prediction;
    public final /* synthetic */ SecureClass0603<Double> offset;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public /* synthetic */ class_1657 field001;
    public final /* synthetic */ SecureClass0603<Boolean> teleport;
    public final /* synthetic */ SecureClass0603<Double> speed;

    public /* synthetic */ AutoChaseModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoChase", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Mimics targets movements", new int[0]);
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Speed", 2.0, 0.1, 10.0));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Offset", -4.0, -10.0, 10.0));
        this.teleport = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Teleport").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Teleport when possible"));
        this.prediction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 1, 1, 4));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.prediction, this.ticks);
        this.cfr_renamed_69(new _7gW6zgoWyEc5rllNyGZDhbzFBYYfqFd6(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        SecureClass0003.cZo8wB8c7XNLE22F7YGv6rCFPvbQF7kX(this);
    }
}

