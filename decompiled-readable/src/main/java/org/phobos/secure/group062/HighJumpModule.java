/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.SecureClass0096;
import org.phobos.secure.group009.mxTNtYIDfW7XE1SRjsql5dSJ1HE03rli;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ;
import org.phobos.secure.group020.SecureClass0324;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class HighJumpModule
extends SecureClass1027 {
    public /* synthetic */ int field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<Float> random;
    public final /* synthetic */ SecureClass0603<Float> field003;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<Float> slow;
    public final /* synthetic */ SecureClass0603<Boolean> automatic;
    public final /* synthetic */ SecureClass0603<Integer> lag;
    public final /* synthetic */ SecureClass0603<Float> modifier;
    public final /* synthetic */ SecureClass0603<Double> horizontal;
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ> mode;
    public /* synthetic */ int field004;
    public /* synthetic */ mxTNtYIDfW7XE1SRjsql5dSJ1HE03rli field005;
    public final /* synthetic */ SecureClass0603<Double> vertical;

    public /* synthetic */ HighJumpModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "HighJump", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you jump higher", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ>("Mode", OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(0.42f), Float.valueOf(0.01f), Float.valueOf(1.0f)).cfr_renamed_369().UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Static));
        this.modifier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Modifier", Float.valueOf(1.0f), Float.valueOf(0.01f), Float.valueOf(3.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Factor));
        this.horizontal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Horizontal", 1.0, 0.1, 1.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.vertical = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Vertical", 1.0, 0.1, 1.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 1, 1, 5).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.lag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Lag", 2, 1, 8).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.slow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Slow", Float.valueOf(0.5f), Float.valueOf(0.1f), Float.valueOf(0.5f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Factor", Float.valueOf(60.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), "%").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.random = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Random", Float.valueOf(10.0f), Float.valueOf(0.0f), Float.valueOf(45.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.automatic = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Automatic").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, OtV90i3uG1eukE0Q5UpsfNoewQLigfXZ.Polar));
        this.field002 = false;
        this.field001 = 0;
        this.field004 = 0;
        this.cfr_renamed_69(new SecureClass0096(this));
        this.cfr_renamed_69(new SecureClass0324(this));
    }
}

