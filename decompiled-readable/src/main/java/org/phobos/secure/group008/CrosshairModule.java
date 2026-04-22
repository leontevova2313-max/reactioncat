/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.awt.Color;
import java.util.Map;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.SecureClass0053;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0723;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.qIeyARBKjEvy9aDdpnhyaYZ9XCWg0gvE;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group028.SecureClass0485;
import org.phobos.secure.group040.SecureClass0691;
import org.phobos.secure.group045._1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1;
import org.phobos.secure.group044.vaKfNesmxmcw3HZC1xWBwS99LSaev0A7;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class CrosshairModule
extends SecureClass1027 {
    public final /* synthetic */ qIeyARBKjEvy9aDdpnhyaYZ9XCWg0gvE field001;
    public final /* synthetic */ SecureClass0603<vaKfNesmxmcw3HZC1xWBwS99LSaev0A7> field002;
    public final /* synthetic */ SecureClass0603<Color> field003;
    public final /* synthetic */ SecureClass0377 field004;
    public final /* synthetic */ SecureClass0603<Float> field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<Color> field007;
    public final /* synthetic */ SecureClass0377 field008;
    public final /* synthetic */ SecureClass0603<Boolean> field009;
    public final /* synthetic */ SecureClass0603<Map<_1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1, Boolean>> field010;
    public final /* synthetic */ SecureClass0603<Boolean> field011;
    public final /* synthetic */ SecureClass0603<Float> field012;
    public final /* synthetic */ SecureClass0603<Float> field013;
    public final /* synthetic */ SecureClass0603<Float> field014;
    public static /* synthetic */ CrosshairModule field015;

    public /* synthetic */ CrosshairModule(SecureClass0242 emm5hwv3OVma5qvjwPCPO36MuAZTwWAd) {
        super(emm5hwv3OVma5qvjwPCPO36MuAZTwWAd, "Crosshair", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Renders custom crosshair", new int[0]);
        this.field002 = new SecureClass0033<vaKfNesmxmcw3HZC1xWBwS99LSaev0A7>("Style", vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.Default).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field012 = new SecureClass0962<Float>("Length", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(10.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Length/Size").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field014 = new SecureClass0962<Float>("Shift", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(20.0f)).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field002, new vaKfNesmxmcw3HZC1xWBwS99LSaev0A7[]{vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.Default, vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.Dot})).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Distance from center").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field011 = new SecureClass1022("Animate").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Moves the crosshair").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field010 = new SecureClass0889<_1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1>("Trigger", _1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(MaLVGxDSeBksdMg4SaOEoDuzQTENO3v9 -> {
            _1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1[] field016 = _1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1.values();
            int n = field016.length;
            int n2 = 0;
            while (n2 < n) {
                _1YnweHMg6v3RGYlQiCE8YKYd3EbIHyk1 field017 = field016[n2];
                MaLVGxDSeBksdMg4SaOEoDuzQTENO3v9.n1W8XPBYJrDzssWYPABQFTJ1vXyEatgH(field017, field017.name());
                ++n2;
            }
            return;
        }).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field013 = new SecureClass0962<Float>("Offset", Float.valueOf(20.0f), Float.valueOf(0.0f), Float.valueOf(100.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass0074("Color", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass1022("Hit").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field009 = new SecureClass1022("Sync").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass0962<Float>("HitLength", Float.valueOf(2.0f), Float.valueOf(0.1f), Float.valueOf(16.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0074("HitColor", Color.WHITE).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new qIeyARBKjEvy9aDdpnhyaYZ9XCWg0gvE();
        this.field004 = new SecureClass0377();
        this.field008 = new SecureClass0377();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field011, this.field010, this.field013).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field002, new vaKfNesmxmcw3HZC1xWBwS99LSaev0A7[]{vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.Default, vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.Dot}));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field006, this.field009, this.field005, this.field003);
        this.cfr_renamed_69(new SecureClass0485(this));
        this.cfr_renamed_69(new SecureClass0053(this));
        this.cfr_renamed_69(new SecureClass0691(this));
        this.cfr_renamed_69(new SecureClass0723(this));
        field015 = this;
    }

    public static /* bridge */ /* synthetic */ CrosshairModule tl9I1PnmBJa2sdqCpg4oa56VaPWuP15f() {
        return field015;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_12() {
        return field015 != null && field015.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && !CrosshairModule.field015.field002.getValue().equals((Object)((Object)vaKfNesmxmcw3HZC1xWBwS99LSaev0A7.None));
    }
}

