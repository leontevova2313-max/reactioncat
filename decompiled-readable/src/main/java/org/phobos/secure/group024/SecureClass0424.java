/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.SecureInterface0010;
import org.phobos.secure.group014.SecureClass0220;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group029.SecureInterface0079;
import org.phobos.secure.group032.XtS5soJKpLuXIPt1kGeWXS6f1q83I7uw;
import org.phobos.secure.group032.SecureEnum0009;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureInterface0136;
import org.phobos.secure.group055.SecureClass1013;
import org.phobos.secure.group057.SecureClass1038;
import org.phobos.secure.group057.SecureClass1041;
import org.phobos.secure.group061.uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group028.SecureClass0488;
import org.phobos.secure.group037.SecureInterface0095;
import org.phobos.secure.group037.SecureInterface0094;
import org.phobos.secure.group046.SecureClass0822;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1024;
import org.phobos.secure.group059.SecureEnum0023;
import org.phobos.secure.group062.SecureInterface0143;

public abstract class SecureClass0424
extends SecureClass0966
implements SecureInterface0134,
SecureInterface0038,
SecureInterface0143,
SecureInterface0094,
SecureInterface0079,
SecureInterface0050,
SecureInterface0010<SecureClass0220>,
SecureInterface0095,
SecureInterface0136 {
    public final /* synthetic */ SecureClass0603<Boolean> reset;
    public final /* synthetic */ SecureClass0603<Color> backgroundColor;
    public final /* synthetic */ List<SecureClass1013> field001;
    public final /* synthetic */ SecureClass0488 field002;
    public final /* synthetic */ List<SecureClass1024> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ Map<SecureClass0424, Set<SecureClass1038>> field005;
    public final /* synthetic */ List<SecureClass0603<?>> field006;
    public final /* synthetic */ List<SecureClass0220> field007;
    public final /* synthetic */ SecureClass0822 field008;
    public final /* synthetic */ SecureClass0242 field009;
    public /* synthetic */ float field010;
    public final /* synthetic */ Set<SecureClass0424> field011;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> backgroundShader;
    @Nullable
    public /* synthetic */ String field012;
    public final /* synthetic */ SecureClass0603<Boolean> background;
    public final /* synthetic */ String name;
    public /* synthetic */ boolean field013;
    public /* synthetic */ boolean field014;
    public /* synthetic */ float field015;
    public /* synthetic */ SecureEnum0009 field016;
    public /* synthetic */ SecureClass1041 field017;
    public /* synthetic */ boolean field018;
    public /* synthetic */ float field019;
    public /* synthetic */ float field020;
    public /* synthetic */ boolean field021;
    public /* synthetic */ float field022;
    public /* synthetic */ SecureEnum0023 field023;
    public /* synthetic */ float field024;
    public /* synthetic */ float field025;
    public /* synthetic */ float field026;
    public /* synthetic */ boolean field027;
    public /* synthetic */ boolean field028;
    public /* synthetic */ boolean field029;

    public /* synthetic */ SecureClass0424(String mmyvL7jgt3v7VzN3QWvmtDcdKVc48RaK, float iaHnZRuRFy2HI8AWBnUrr9VwlXh6yuKC, float iDetG3y13yLZkxJZXS3wqMvZs6Bsxj6V, float Vq6juILEctoz6Cug2H6ns9SrMOfSXQbx, float DGqDi2UhUa1MeOCJ6ypCvxp1rIxFBinf) {
        this.field006 = new ArrayList<SecureClass0603<?>>();
        this.field007 = new ArrayList<SecureClass0220>();
        this.field003 = new ArrayList<SecureClass1024>();
        this.field001 = new ArrayList<SecureClass1013>();
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Snapping", true));
        this.background = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Background", false));
        this.backgroundColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BackgroundColor", new Color(0, 0, 0, 50)));
        this.backgroundShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("BackgroundShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.Blur));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reset"));
        this.field011 = new HashSet<SecureClass0424>();
        this.field005 = new LinkedHashMap<SecureClass0424, Set<SecureClass1038>>();
        this.field008 = new SecureClass0822();
        this.field013 = true;
        this.field029 = true;
        this.field016 = SecureEnum0009.Left;
        this.field023 = SecureEnum0023.Top;
        this.field002 = SecureClass0488.qHzThuKHUVfdyE9GHEkGgSTyyNqkmdRr(Vq6juILEctoz6Cug2H6ns9SrMOfSXQbx, DGqDi2UhUa1MeOCJ6ypCvxp1rIxFBinf);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.background, this.backgroundColor, this.backgroundShader);
        this.field009 = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ();
        this.field014 = true;
        this.field010 = iaHnZRuRFy2HI8AWBnUrr9VwlXh6yuKC;
        this.field022 = iDetG3y13yLZkxJZXS3wqMvZs6Bsxj6V;
        this.name = mmyvL7jgt3v7VzN3QWvmtDcdKVc48RaK;
        this.field026 = Vq6juILEctoz6Cug2H6ns9SrMOfSXQbx;
        this.field024 = DGqDi2UhUa1MeOCJ6ypCvxp1rIxFBinf;
        this.reset.cfr_renamed_123(hZbaIL0EYGB4q41Y7SYnNvdDHCeHdaha -> {
            if (this.reset.getValue().booleanValue()) {
                this.lZaptq2ozCw1iQ3WrnBmH6CL7zAa4dR8(true);
            }
        });
        XtS5soJKpLuXIPt1kGeWXS6f1q83I7uw.IaCMs8cXnkZIEZpHWqkXll8QX8P7SxI7(this);
    }

    public static /* bridge */ /* synthetic */ float[] wmvOKICwJCWg3GjztHPBAZTEMKDbjy1u(float f, float lXsJir2WYwBUszGf2FoGxmSOfWKportk, float f2, float f3) {
        float f4 = f + f2;
        float field030 = lXsJir2WYwBUszGf2FoGxmSOfWKportk + f3;
        return new float[]{Math.min(f, f4), Math.min(lXsJir2WYwBUszGf2FoGxmSOfWKportk, field030), Math.max(f, f4), Math.max(lXsJir2WYwBUszGf2FoGxmSOfWKportk, field030)};
    }
}

