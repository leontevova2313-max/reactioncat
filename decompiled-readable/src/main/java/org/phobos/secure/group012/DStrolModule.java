/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group012;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group010.YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.SecureClass1083;
import org.phobos.secure.group036.SecureClass0642;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class DStrolModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> releaseMultiplier;
    public final /* synthetic */ SecureClass0603<YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA> mode;
    public final /* synthetic */ SecureClass0603<Double> stretch;
    public final /* synthetic */ SecureClass0603<Integer> field001;
    public final /* synthetic */ SecureClass0603<Double> control;
    public final /* synthetic */ SecureClass0603<Integer> combatTicks;
    public final /* synthetic */ SecureClass0603<Float> factor;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Integer> releaseTicks;
    public final /* synthetic */ SecureClass0603<Boolean> release;
    public /* synthetic */ int field002;
    public /* synthetic */ boolean field003;
    public final /* synthetic */ SecureClass0603<Boolean> combat;

    public /* synthetic */ DStrolModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "DStrol", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Controls time and distance to combo targets", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA>("Mode", YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Evaluate));
        this.stretch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Stretch", 2.8, 0.1, 4.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Distance));
        this.control = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Control", 3.3, 0.1, 4.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Evaluate));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 3.6, 3.1, 6.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Evaluate));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 4, 1, 10).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Single));
        this.factor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Factor", Float.valueOf(0.2f), Float.valueOf(0.1f), Float.valueOf(0.7f)));
        this.release = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Release").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA[]{YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Evaluate, YRDm2XlcLLwGRxeH5yOTgcjTaKILVOzA.Distance})));
        this.releaseTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("ReleaseTicks", 2, 1, 5));
        this.releaseMultiplier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("ReleaseMultiplier", Float.valueOf(1.1f), Float.valueOf(1.01f), Float.valueOf(1.3f), "%"));
        this.combat = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Combat"));
        this.combatTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("CombatTicks", 2, 1, 5));
        this.field003 = false;
        this.field002 = 0;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.release, this.releaseTicks, this.releaseMultiplier);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.combat, this.combatTicks);
        this.cfr_renamed_69(new SecureClass0642(this));
        this.cfr_renamed_69(new SecureClass1083(this));
    }
}

