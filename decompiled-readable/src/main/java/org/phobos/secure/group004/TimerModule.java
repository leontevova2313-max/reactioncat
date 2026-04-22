/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group004;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.zdI5zrqJn7dGJVQPxrZMH2jCPzh7xayb;
import org.phobos.secure.group016.poKxdNMaLNDYUZxDuiBk9khyQ9L1Csur;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TimerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> threshold;
    public /* synthetic */ int field001;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public /* synthetic */ float field002;
    public final /* synthetic */ SecureClass0603<Long> lag;
    public final /* synthetic */ SecureClass0603<Boolean> discharge;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public /* synthetic */ long field003;
    public final /* synthetic */ SecureClass0603<Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS> mode;
    public final /* synthetic */ SecureClass0603<SecureClass0666> use;
    public final /* synthetic */ SecureClass0603<Boolean> step;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public /* synthetic */ boolean field005;

    public /* synthetic */ TimerModule(SecureClass0242 IoyrvAOLXqgycxVuqPKYmOW9e3hG4jFV) {
        super(IoyrvAOLXqgycxVuqPKYmOW9e3hG4jFV, "Timer", SecureClass1004.cfr_renamed_106, "Speeds up the game", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS>("Mode", Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Normal));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 1, 1, 10));
        this.use = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("Use").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Grim));
        this.discharge = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Discharge", true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Grim));
        this.lag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Lag", 3000L, 0L, 20000L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Grim).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Stops if lagging"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(2.0f), Float.valueOf(0.001f), Float.valueOf(15.0f)).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS[]{Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Normal, Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Grim})));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Threshold", 50L, -1L, 500L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Y0J4e7loYrPAoQesvQ0kR2gQclH8Q7KS.Intave));
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Step"));
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new zdI5zrqJn7dGJVQPxrZMH2jCPzh7xayb(this, -10, IoyrvAOLXqgycxVuqPKYmOW9e3hG4jFV));
        this.cfr_renamed_69(new poKxdNMaLNDYUZxDuiBk9khyQ9L1Csur(this, IoyrvAOLXqgycxVuqPKYmOW9e3hG4jFV));
    }
}

