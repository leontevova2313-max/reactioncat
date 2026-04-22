/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group058;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group027.zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.SecureClass1063;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FastSwimModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> water;
    public /* synthetic */ float field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v> field003;
    public final /* synthetic */ SecureClass0603<Boolean> lava;
    public final /* synthetic */ SecureClass0603<Float> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<Float> field006;

    public /* synthetic */ FastSwimModule(SecureClass0242 KTRXGocFCRa5J2DsXVgFucmpTkSCZRLC) {
        super(KTRXGocFCRa5J2DsXVgFucmpTkSCZRLC, "FastSwim", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you faster in liquids", new int[0]);
        this.field003 = new SecureClass0033<zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v>("Mode", zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v.Intave).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("Horizontal").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass0962<Float>("HorizontalSpeed", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass1022("Vertical").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0962<Float>("VerticalSpeed", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.water = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Water"));
        this.lava = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lava"));
        this.field001 = 0.0f;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.field006).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.field003, zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v.Vanilla);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field005, this.field004).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.field003, zIV3qVXM0QuXIrrWxr0Tc5uEcdIjBr9v.Vanilla);
        this.cfr_renamed_69(new SecureClass1063(this));
    }
}

