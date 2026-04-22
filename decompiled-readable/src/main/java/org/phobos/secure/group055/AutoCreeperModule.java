/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import net.minecraft.class_1297;
import net.minecraft.class_1548;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group011.NBM7EF58VppKmUsS01EVcz83lOfT3F8H;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.D3n5r17dOOhWcYATL49Hdf03FveisvMi;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class AutoCreeperModule
extends SecureClass0214 {
    public /* synthetic */ boolean field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<NBM7EF58VppKmUsS01EVcz83lOfT3F8H> mode;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0603<Boolean> auto;
    public final /* synthetic */ SecureClass0603<Float> damage;
    public final /* synthetic */ SecureClass0603<Long> cooldown;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<SecureClass0666> macro;
    public final /* synthetic */ SecureClass0603<Integer> predictionTicks;

    public static /* bridge */ /* synthetic */ void lY7Qj9mUTPcin1agZ81fcioGz0gVaS9d(class_636 d4aybyEOdRXV84LtJWq7OyXaU9WodDNy, class_746 gR9477Eumb8Eu4MdPDKamLnPaX6aFB7M, class_1548 lvtsq4Z7D7xSCp3xRCPKOGlLFlyt4XM5) {
        d4aybyEOdRXV84LtJWq7OyXaU9WodDNy.method_2918((class_1657)gR9477Eumb8Eu4MdPDKamLnPaX6aFB7M, (class_1297)lvtsq4Z7D7xSCp3xRCPKOGlLFlyt4XM5);
    }

    public /* synthetic */ AutoCreeperModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoCreeper", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 5);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<NBM7EF58VppKmUsS01EVcz83lOfT3F8H>("Mode", NBM7EF58VppKmUsS01EVcz83lOfT3F8H.Rage));
        this.auto = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Auto").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Places creepers automatically").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, NBM7EF58VppKmUsS01EVcz83lOfT3F8H.Legit));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Damage", Float.valueOf(6.0f), Float.valueOf(1.0f), Float.valueOf(36.0f)));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.predictionTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PredictionTicks", 1, 1, 6));
        this.cooldown = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Cooldown", 500L, 0L, 5000L));
        this.macro = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("Macro").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, NBM7EF58VppKmUsS01EVcz83lOfT3F8H.Legit));
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = false;
        this.field001 = false;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field004, this.predictionTicks).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, NBM7EF58VppKmUsS01EVcz83lOfT3F8H.Legit);
        this.wQmStBqRMLz8129caFX4oSmE9yGtCMQV().forEach(khXjMfqwWGy3M5dv1o87OQewDtLXGh4v -> khXjMfqwWGy3M5dv1o87OQewDtLXGh4v.Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, NBM7EF58VppKmUsS01EVcz83lOfT3F8H.Rage));
        this.cfr_renamed_69(new D3n5r17dOOhWcYATL49Hdf03FveisvMi(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
    }
}

