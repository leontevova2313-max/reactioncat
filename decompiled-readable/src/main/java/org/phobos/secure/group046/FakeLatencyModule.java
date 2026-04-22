/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group046;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2596;
import org.phobos.secure.group003.YJgTB6ovSnsnbd8cQaqlhSWXE6IysGpb;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno;
import org.phobos.secure.group010.SecureInterface0023;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.yG3FiClAfQvFyQ8XKvCMKSvqNB7qDHF0;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.L2MyhukP5Bw1cqfgy5F5ouXb1tkK5ycq;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FakeLatencyModule
extends SecureClass1027 {
    public static /* synthetic */ FakeLatencyModule field001;
    public final /* synthetic */ SecureClass0603<Integer> range;
    public final /* synthetic */ SecureInterface0023 field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ Map<class_2596<?>, Long> field004;
    public final /* synthetic */ SecureClass0603<Boolean> spike;
    public final /* synthetic */ SecureClass0603<Integer> base;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Float> spikeProbability;
    public final /* synthetic */ SecureClass0603<hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr> mode;
    public final /* synthetic */ SecureClass0603<Integer> spikeSpread;
    public /* synthetic */ long field005;
    public final /* synthetic */ SecureClass0603<Integer> spikeDistance;

    public /* synthetic */ FakeLatencyModule(SecureClass0242 jBx5l6J5kjuwoPQUrcJsf7QXBwhnUqNI) {
        super(jBx5l6J5kjuwoPQUrcJsf7QXBwhnUqNI, "FakeLatency", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Spoofs your ping", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr>("Mode", hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Normal));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 30000L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Normal));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Transactions", false).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Normal));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 10, Integer.valueOf(1), Integer.valueOf(300), "t").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Fake));
        this.base = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Base", 300, 20, 1500).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Fake));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Range", 10, 0, 30).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Fake));
        this.spike = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Spike"));
        this.spikeProbability = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SpikeProbability", Float.valueOf(25.0f), Float.valueOf(0.1f), Float.valueOf(100.0f), "%"));
        this.spikeDistance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SpikeDistance", 100, -1000, 1000).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Calculate ping + Distance"));
        this.spikeSpread = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SpikeSpread", 50, 0, 250).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Randomness spread from the final spike result"));
        this.field004 = new ConcurrentHashMap<class_2596<?>, Long>();
        this.field002 = new aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.spike, this.spikeProbability, this.spikeDistance, this.spikeSpread).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Fake);
        this.cfr_renamed_69(new yG3FiClAfQvFyQ8XKvCMKSvqNB7qDHF0(this));
        this.cfr_renamed_69(new YJgTB6ovSnsnbd8cQaqlhSWXE6IysGpb(this));
        this.cfr_renamed_69(new L2MyhukP5Bw1cqfgy5F5ouXb1tkK5ycq(this, Integer.MIN_VALUE));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ int UcM59e9BzeFHfBGNqNtsyTZtaV5JrNlq(int field006) {
        if (field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && FakeLatencyModule.field001.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(hOQiu0JKqgrifxjoBCzDtmhQd7yWYqyr.Fake)) {
            return (int)FakeLatencyModule.field001.field005;
        }
        return field006;
    }
}

