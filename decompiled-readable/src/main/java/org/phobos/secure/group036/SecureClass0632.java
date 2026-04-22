/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group036;

import org.phobos.secure.group002.SecureClass0020;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.Y4Rh33mVac3RTZ1sGKyyr0UdzsfDd3C4;
import org.phobos.secure.group007._0v6Q4y7ssqCF0RbR5eAdk32F9rImt8nw;
import org.phobos.secure.group008.bzEVlkj0AcA4C3q28WH9aAJlp6KegXgs;
import org.phobos.secure.group014._3LQU720m8rMw3Rps7qaf68AAW35CQXoj;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017._3LgEzuC5WaYKS9QreFuPHWPM8aHImUQz;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.N8MyukhB8wFbdSQ0Aff9gELq8gWTv9Lo;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group047.zBYJfV3NG4UkueyyFcl3JXRqxvi5iKlg;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group021.bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx;
import org.phobos.secure.group023.j4ytKCwPpBOeByM709Uge6pgyNl5Tr6k;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0632
extends SecureClass0020 {
    public final /* synthetic */ SecureClass0603<Boolean> combat;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Boolean> lag;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Double> reduceXZ;
    public static final /* synthetic */ Logger field003;
    public final /* synthetic */ SecureClass0603<Boolean> dBPI;
    public final /* synthetic */ SecureClass0603<Boolean> explosions;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public /* synthetic */ Y4Rh33mVac3RTZ1sGKyyr0UdzsfDd3C4 field005;
    public final /* synthetic */ SecureClass0603<Double> chance;
    public final /* synthetic */ SecureClass0603<Long> unlag;
    public /* synthetic */ int field006;
    public /* synthetic */ int field007;
    public volatile /* synthetic */ boolean field008;
    public final /* synthetic */ SecureClass0603<Boolean> filter;
    public /* synthetic */ boolean field009;
    public final /* synthetic */ SecureClass0603<Double> reduceY;
    public final /* synthetic */ SecureClass0603<Long> time;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx> mode;
    public /* synthetic */ int field010;
    public final /* synthetic */ SecureClass0603<Double> field011;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field012;

    public /* synthetic */ SecureClass0632(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Velocity", "Modifies incoming velocity", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, 8);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx>("Mode", bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Normal));
        this.chance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Chance", 100.0, Double.valueOf(0.0), Double.valueOf(100.0), "%").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx[]{bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Watchdog, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Jump})));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Knockback", true));
        this.explosions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Explosions", true).cfr_renamed_110(() -> !this.mode.getValue().equals(bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Watchdog)));
        this.filter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Filter", false).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Grim).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Only sends invalid packets after taking velocity"));
        this.lag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lag", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Temporary disables velocity on lag"));
        this.time = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Time", 250L, 0L, 5000L, true));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 50L, 0L, 500L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Freeze).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Delay between taking velocity and freezing"));
        this.unlag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Unlag", 1000L, 50L, 2000L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Freeze).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Freeze time"));
        this.combat = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Combat").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Whether the lag should be a combat related one"));
        this.field011 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("CombatDistance", 4.0, 2.0, 10.0));
        this.reduceXZ = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("ReduceXZ", 0.3, -1.0, 1.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Reduce).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Horizontal reduction"));
        this.reduceY = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("ReduceY", 0.3, -1.0, 1.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Reduce).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Vertical reduction"));
        this.dBPI = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("DBPI").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ignores explosions in double blast protection").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Walls));
        this.field007 = 0;
        this.field006 = 0;
        this.field010 = 0;
        this.field012 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field009 = false;
        this.field005 = Y4Rh33mVac3RTZ1sGKyyr0UdzsfDd3C4.None;
        this.wQmStBqRMLz8129caFX4oSmE9yGtCMQV().forEach(LNTXdVBwxkP4mQhutnz9Us43iS1DTYBh -> LNTXdVBwxkP4mQhutnz9Us43iS1DTYBh.Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Block));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lag, this.time);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.combat, this.field011).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, bhh8aQ7eljyFgRIPlg6ciT5NUKuELOnx.Freeze);
        this.cfr_renamed_69(new j4ytKCwPpBOeByM709Uge6pgyNl5Tr6k(this));
        this.cfr_renamed_69(new _3LQU720m8rMw3Rps7qaf68AAW35CQXoj(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new N8MyukhB8wFbdSQ0Aff9gELq8gWTv9Lo(this));
        this.cfr_renamed_69(new _0v6Q4y7ssqCF0RbR5eAdk32F9rImt8nw(this));
        this.cfr_renamed_69(new zBYJfV3NG4UkueyyFcl3JXRqxvi5iKlg(this));
        this.cfr_renamed_69(new bzEVlkj0AcA4C3q28WH9aAJlp6KegXgs(this));
        this.cfr_renamed_69(new _3LgEzuC5WaYKS9QreFuPHWPM8aHImUQz(this, Integer.MIN_VALUE));
    }

    static {
        field003 = LoggerFactory.getLogger(SecureClass0632.class);
    }
}

