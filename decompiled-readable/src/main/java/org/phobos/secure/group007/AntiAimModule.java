/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group043.SecureClass0760;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class AntiAimModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> pitch;
    public final /* synthetic */ SecureClass0603<GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE> mode;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public final /* synthetic */ SecureClass0603<Float> angle;
    public final /* synthetic */ SecureClass0603<Float> base;
    public /* synthetic */ float field001;
    public final /* synthetic */ SecureClass0603<Long> delay;

    public /* synthetic */ AntiAimModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AntiAim", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Turns your head around", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE>("Mode", GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE.Static));
        this.base = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Base", Float.valueOf(180.0f), Float.valueOf(-180.0f), Float.valueOf(180.0f)));
        this.pitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Pitch", Float.valueOf(90.0f), Float.valueOf(-90.0f), Float.valueOf(90.0f)));
        this.angle = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Angle", Float.valueOf(35.0f), Float.valueOf(0.0f), Float.valueOf(90.0f)).cfr_renamed_110(() -> this.mode.getValue().equals((Object)((Object)GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE.Jitter))));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 3L, 1L, 50L, true).cfr_renamed_110(() -> this.mode.getValue().equals((Object)((Object)GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE.Jitter))));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(100.0f)).cfr_renamed_110(() -> this.mode.getValue().equals((Object)((Object)GWMapxHHUBa5MWHVPcN97pPqHPmpqoVE.Spin))));
        this.field001 = 0.0f;
        this.cfr_renamed_89("Values", this.base, this.pitch, this.angle, this.delay, this.speed);
        this.cfr_renamed_69(new SecureClass0760(this));
    }
}

