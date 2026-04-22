/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group017;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group033.oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group045.i2TDswtCMGMHNuTq8jmhzlA9zr8LrQpo;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class CalculationsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> simulate;
    public final /* synthetic */ SecureClass0603<Long> simulateTimeout;
    public final /* synthetic */ SecureClass0603<oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf> type;
    public final /* synthetic */ SecureClass0603<Boolean> debug;
    public final /* synthetic */ SecureClass0603<i2TDswtCMGMHNuTq8jmhzlA9zr8LrQpo> update;
    public static /* synthetic */ CalculationsModule field003;

    public static /* bridge */ /* synthetic */ boolean F5viMjxXZBg67af6fVYccbfr4l53nvoA() {
        return CalculationsModule.field003.simulate.getValue();
    }

    public /* synthetic */ CalculationsModule(SecureClass0242 Cf6K9HqEQkgXI9dgYqLDiafrfk5qZMMh) {
        super(Cf6K9HqEQkgXI9dgYqLDiafrfk5qZMMh, "Calculations", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Manages calculations", new int[0]);
        this.debug = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Debug"));
        this.update = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<i2TDswtCMGMHNuTq8jmhzlA9zr8LrQpo>("Update", i2TDswtCMGMHNuTq8jmhzlA9zr8LrQpo.Async));
        this.simulate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Simulate", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses localized damage engine"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shared").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Listens and dispatches health"));
        this.simulateTimeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("SimulateTimeout", 30000L, 0L, 300000L, true));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Terrain", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Skips terrain blocks when calculating damages"));
        this.type = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf>("Type", oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf.Normal).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Protection calculation"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.simulate, this.field002, this.simulateTimeout);
        this.simulate.cfr_renamed_123(Emn5Ia5vGinMv5QzAwf0MeBv3ydACtW6 -> {
            if (!Emn5Ia5vGinMv5QzAwf0MeBv3ydACtW6.booleanValue()) {
                Cf6K9HqEQkgXI9dgYqLDiafrfk5qZMMh.jHqrdqnyWuZBVucmK3J8S6jbcpPrdbjz().njTydqRKqT9J70YQKtM02Cgpnq096Lzx().T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            }
        });
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ CalculationsModule ti2BjS6DKTf7Iqhvnta7UH54ttHbEUBv() {
        return field003;
    }

    public static /* bridge */ /* synthetic */ boolean KevpK85Aneuph9rmKOS8qUUIledkFuN3() {
        return CalculationsModule.field003.field001.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean AfKNxjiS7pedwKmxbm4GmBOvWpK8kXgM() {
        return CalculationsModule.field003.debug.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean UDzwsDq1j6qNuLCQfKoOgWAQt62w0hMM() {
        return CalculationsModule.field003.field002.getValue();
    }

    public static /* bridge */ /* synthetic */ oldSdAVMrLHFZWjmBJZ3V98P6fTn5FPf ZRQzdvaPDLyHVr77Oy0VVQZFFZ1pUzc8() {
        return CalculationsModule.field003.type.getValue();
    }

    public static /* bridge */ /* synthetic */ long mcoez4xwmfFKDqUdi6ABIaCFOcyzPKA9() {
        return CalculationsModule.field003.simulateTimeout.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean YXx8A3U3dSHEFvcLlxfnPJzLxu6tMJFv() {
        return CalculationsModule.field003.update.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(i2TDswtCMGMHNuTq8jmhzlA9zr8LrQpo.Async);
    }
}

