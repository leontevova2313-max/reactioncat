/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import net.minecraft.class_1657;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.X81nHIT5HyW2XtA8550BneAWL2bxa6lM;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group027.oLlMig0zQfAkrllXcqe8YpyedE96UGAk;
import org.phobos.secure.group032._1w6NcKe2bjX9B5ccob30PUhxAuHCN94l;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038._9U4T88sfpIFsypNSgiZ66QOWqyR0nFa7;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.aawhag6omxEYP4j3xbGsVV7knfKB38Vr;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BowKillerModule
extends SecureClass1027 {
    public final /* synthetic */ MutableObject<class_1657> field001;
    public volatile /* synthetic */ int field002;
    public final /* synthetic */ SecureClass0603<Boolean> always;
    public final /* synthetic */ SecureClass0603<aawhag6omxEYP4j3xbGsVV7knfKB38Vr> mode;
    public final /* synthetic */ SecureClass0603<Integer> height;
    public final /* synthetic */ SecureClass0603<Integer> interval;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Double> buffer;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<Double> field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<Integer> teleports;
    public /* synthetic */ boolean field007;

    public /* synthetic */ BowKillerModule(SecureClass0242 mA7RHKWRKdLCMtvMaPD0vKUaOK6yXEND) {
        super(mA7RHKWRKdLCMtvMaPD0vKUaOK6yXEND, "BowKiller", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Instant bow exploit", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<aawhag6omxEYP4j3xbGsVV7knfKB38Vr>("Mode", aawhag6omxEYP4j3xbGsVV7knfKB38Vr.Default));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Height", 10, 0, 170).cfr_renamed_85("Max", 170).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, aawhag6omxEYP4j3xbGsVV7knfKB38Vr.Height));
        this.always = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Always", false));
        this.interval = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Interval", 25, 0, 100));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Runs", 10.0, 0.0, 200.0));
        this.buffer = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Buffer", 70.0, 0.0, 200.0));
        this.teleports = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Teleports", 0, 0, 100));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate", false));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Predict", false));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 1, 0, 5));
        this.field001 = new MutableObject(null);
        this.cfr_renamed_89("Factor", this.field005, this.buffer, this.teleports);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.always, this.interval);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field006, this.field004, this.ticks);
        this.cfr_renamed_69(new _9U4T88sfpIFsypNSgiZ66QOWqyR0nFa7(this));
        this.cfr_renamed_69(new oLlMig0zQfAkrllXcqe8YpyedE96UGAk(this));
        this.cfr_renamed_69(new _1w6NcKe2bjX9B5ccob30PUhxAuHCN94l(this));
        this.cfr_renamed_69(new X81nHIT5HyW2XtA8550BneAWL2bxa6lM(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

