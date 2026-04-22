/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass0999;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.SecureClass1054;
import org.phobos.secure.group058.SecureClass1052;
import org.phobos.secure.group061._2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH;
import org.phobos.secure.group020.SecureClass0329;
import org.phobos.secure.group044.BrZKwywRAmM5vGJTy0vY20YZOEcLsQK6;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class WallClimbModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> field001;
    public final /* synthetic */ SecureClass0603<BrZKwywRAmM5vGJTy0vY20YZOEcLsQK6> field002;
    public final /* synthetic */ SecureClass0603<Boolean> packet;
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<Float> threshold;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Long> sequence;
    public final /* synthetic */ SecureClass0603<_2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH> mode;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public final /* synthetic */ SecureClass0603<Long> timeout;
    public /* synthetic */ boolean field005;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field006;
    public final /* synthetic */ SecureClass0603<Boolean> reset;

    public /* synthetic */ WallClimbModule(SecureClass0242 Cg3vlhxTsA0kulAxPJM50RAqKEDf3fBy) {
        super(Cg3vlhxTsA0kulAxPJM50RAqKEDf3fBy, "WallClimb", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH>("Mode", _2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH.Polar));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Back", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<BrZKwywRAmM5vGJTy0vY20YZOEcLsQK6>("Boost", BrZKwywRAmM5vGJTy0vY20YZOEcLsQK6.Threshold));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.5f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH.Polar));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Threshold", Float.valueOf(0.15f), Float.valueOf(0.01f), Float.valueOf(0.5f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _2ypNnfr0lPeoHhTVM97xP3wsqr1YmvfH.Polar).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.field002, BrZKwywRAmM5vGJTy0vY20YZOEcLsQK6.Threshold));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reset"));
        this.sequence = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Sequence", 150L, 50L, 500L, true));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Timeout", 250L, 0L, 500L, true));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate"));
        this.packet = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Packet"));
        this.field006 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new SecureClass1054(this));
        this.cfr_renamed_69(new SecureClass0999(this));
        this.cfr_renamed_69(new SecureClass0329(this));
        this.cfr_renamed_69(new SecureClass1052(this));
    }
}

