/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group056;

import java.awt.Color;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group007.svFbELqxkTTJo3dlf8wvr5JJpm9FsLH9;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.WnPM8MoFEBV4XuY7yYnbnS3ac4EcJMUc;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.D7mVZAhV6UqI4hX653ezKXQdXP7ltpWo;
import org.phobos.secure.group031.UT49HcPqhs72gOTBpQhath78j7ggC6QW;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062._9mnN04FFxqlJ7DyQdbnxaWEA2XePS8kB;

public class LogoutSpotsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Long> visualTime;
    public final /* synthetic */ Map<_9mnN04FFxqlJ7DyQdbnxaWEA2XePS8kB, Long> field002;
    public final /* synthetic */ SecureClass0603<Long> timeout;
    public final /* synthetic */ SecureClass0603<Color> color;
    public final /* synthetic */ SecureClass0603<Boolean> telemetry;
    public final /* synthetic */ Map<svFbELqxkTTJo3dlf8wvr5JJpm9FsLH9, Long> field003;
    public final /* synthetic */ SecureClass0603<Boolean> totems;
    public final /* synthetic */ SecureClass0603<Boolean> replace;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Boolean> clear;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> font;
    public final /* synthetic */ SecureClass0603<Float> scale;

    public /* synthetic */ LogoutSpotsModule(SecureClass0242 HpQVnCVjiMSkHAcY77FjsmOUmyv9RcnQ) {
        super(HpQVnCVjiMSkHAcY77FjsmOUmyv9RcnQ, "LogoutSpots", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, new int[0]);
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(2.0f)));
        this.font = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Font"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shadow"));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 300.0, 10.0, 300.0));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Timeout", 10000L, 10000L, 600000L).cfr_renamed_85("None", 10000L));
        this.telemetry = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Telemetry", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Displays an icon if a player is using phobos"));
        this.replace = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Replace").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Replaces players name with their phobos name"));
        this.totems = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Totems"));
        this.clear = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Clear"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Visual").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Shows where you've last seen a player"));
        this.visualTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("VisualTime", 60000L, 1000L, 600000L));
        this.field003 = new ConcurrentHashMap<svFbELqxkTTJo3dlf8wvr5JJpm9FsLH9, Long>();
        this.field002 = new ConcurrentHashMap<_9mnN04FFxqlJ7DyQdbnxaWEA2XePS8kB, Long>();
        this.cfr_renamed_89("Text", this.font, this.field004, this.color, this.scale);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.visualTime);
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Data").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.telemetry, this.replace)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.totems).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new UT49HcPqhs72gOTBpQhath78j7ggC6QW(this, HpQVnCVjiMSkHAcY77FjsmOUmyv9RcnQ));
        this.cfr_renamed_69(new D7mVZAhV6UqI4hX653ezKXQdXP7ltpWo(this));
        this.cfr_renamed_69(new WnPM8MoFEBV4XuY7yYnbnS3ac4EcJMUc(this, HpQVnCVjiMSkHAcY77FjsmOUmyv9RcnQ));
        this.clear.cfr_renamed_123(bl -> {
            if (bl.booleanValue()) {
                this.field003.clear();
                this.clear.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        SecureClass0003.w983xraM2Cg1plUsVtES0Kilv8JlIJ2o(this, this.field003::clear);
    }
}

