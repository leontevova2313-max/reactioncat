/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group017;

import net.minecraft.class_243;
import org.phobos.secure.group003.Ktml9L5PKCPxTVOgE5KSujbhKkFrLT5J;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group003.nwxNxS55iPEqqxi88vhuMwRfegb7sOKv;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group044.cbZGJG1OaRp9XKtKZ0x1oxQXb4SsEMlu;
import org.phobos.secure.group046.nsR8Rm7qfecIR1E03KfrQSqe4jQePjZP;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB;
import org.phobos.secure.group062.uQGO3NPVt1zZAzFNs5ITMSrEJkTwsnv9;

public class SprintModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public final /* synthetic */ SecureClass0603<Float> pitchAngle;
    public final /* synthetic */ SecureClass0603<Boolean> pitch;
    public /* synthetic */ boolean field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ boolean field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ boolean field006;
    public /* synthetic */ int field007;
    public final /* synthetic */ SecureClass0603<Boolean> diagonal;
    public /* synthetic */ boolean field008;
    public final /* synthetic */ SecureClass0603<nwxNxS55iPEqqxi88vhuMwRfegb7sOKv> stop;
    public final /* synthetic */ SecureClass0603<Boolean> randomize;
    public /* synthetic */ boolean field009;
    public /* synthetic */ class_243 field010;
    public /* synthetic */ boolean field011;
    public static /* synthetic */ SprintModule field012;
    public final /* synthetic */ SecureClass0603<Boolean> air;
    public final /* synthetic */ SecureClass0603<MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB> mode;
    public /* synthetic */ int field013;
    public final /* synthetic */ SecureClass0603<Float> amount;

    public static /* bridge */ /* synthetic */ boolean hEBptiDUPTkp9CXuNQ16yMCezYVB2nEp() {
        return field012.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && SprintModule.field012.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Rage);
    }

    public /* synthetic */ SprintModule(SecureClass0242 SD9b8q2sKHeeQooGh7iCAPFplF1icnQG) {
        super(SD9b8q2sKHeeQooGh7iCAPFplF1icnQG, "Sprint", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Modifies sprint", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB>("Mode", MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Legit));
        this.stop = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<nwxNxS55iPEqqxi88vhuMwRfegb7sOKv>("Stop", nwxNxS55iPEqqxi88vhuMwRfegb7sOKv.Vanilla).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (nwxNxS55iPEqqxi88vhuMwRfegb7sOKv)((Object)MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Directional)));
        this.randomize = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Randomize", false));
        this.amount = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Amount", Float.valueOf(2.0f), Float.valueOf(0.0f), Float.valueOf(10.0f)));
        this.air = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Air", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Rotates in air").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Directional));
        this.diagonal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Diagonal").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Rotates sideways to gain additional speed").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Directional));
        this.pitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Pitch"));
        this.pitchAngle = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("PitchAngle", Float.valueOf(45.0f), Float.valueOf(45.0f), Float.valueOf(90.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Elytra tilt"));
        this.field007 = 0;
        this.field013 = 0;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.randomize, this.amount).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Directional);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.pitch, this.pitchAngle).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, MXDVy4PBQZlAqq26ZGB5hFL70FwC6LhB.Directional);
        this.cfr_renamed_69(new nsR8Rm7qfecIR1E03KfrQSqe4jQePjZP(this));
        this.cfr_renamed_69(new Ktml9L5PKCPxTVOgE5KSujbhKkFrLT5J(this, 1, SD9b8q2sKHeeQooGh7iCAPFplF1icnQG));
        this.cfr_renamed_69(new uQGO3NPVt1zZAzFNs5ITMSrEJkTwsnv9(this));
        this.cfr_renamed_69(new cbZGJG1OaRp9XKtKZ0x1oxQXb4SsEMlu(this));
        field012 = this;
    }
}

