/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import java.awt.Color;
import java.util.LinkedHashSet;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_7422;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group003.krinL1leKMisKZlZytp50DoEA5EXr5jz;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group027.QN9BUiBkXxmkLUFPOetH3RDoibNi5ci3;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.SecureClass1033;
import org.phobos.secure.group060.BYmb0gwaLCBXaaonczFFI4SozQs6qxKD;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group045.GEtT6wkIQz0l6iUVNf4MrYnSFJfKeBD2;
import org.phobos.secure.group053._2jqU2PbxdcQobJhZj7LiTm8lgFd9VGso;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.Dpijq4MeDYNSCudEZ2HMpBpOE6rlS2oG;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class SecureClass0115
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> width;
    public /* synthetic */ class_1297 field001;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Color> box;
    public final /* synthetic */ SecureClass1033 field002;
    public final /* synthetic */ Set<GEtT6wkIQz0l6iUVNf4MrYnSFJfKeBD2> field003;
    public /* synthetic */ class_7422 field004;
    public final /* synthetic */ SecureClass0603<Double> min;
    public final /* synthetic */ SecureClass0603<Double> max;
    public final /* synthetic */ SecureClass0603<Boolean> render;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> delay;
    public final /* synthetic */ SecureClass0603<BYmb0gwaLCBXaaonczFFI4SozQs6qxKD> mode;

    public /* synthetic */ SecureClass0115(SecureClass0242 x4eoNwwaSe1j70wG0mzHDJCVjZCaK0lB) {
        super(x4eoNwwaSe1j70wG0mzHDJCVjZCaK0lB, "Backtrack", "Forces lag to compensate reach", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, new int[0]);
        this.min = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Min", 3.0, 0.1, 6.0));
        this.max = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Max", 6.0, 3.0, 10.0));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("Delay", 100L, 10L, 2000L));
        this.render = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Render", false));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<BYmb0gwaLCBXaaonczFFI4SozQs6qxKD>("Mode", BYmb0gwaLCBXaaonczFFI4SozQs6qxKD.Box));
        this.box = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 50)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, BYmb0gwaLCBXaaonczFFI4SozQs6qxKD.Box));
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, BYmb0gwaLCBXaaonczFFI4SozQs6qxKD.Box));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(2.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, BYmb0gwaLCBXaaonczFFI4SozQs6qxKD.Box));
        this.field003 = new LinkedHashSet<GEtT6wkIQz0l6iUVNf4MrYnSFJfKeBD2>();
        this.field002 = new SecureClass1033();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.render, this.mode, this.box, this.line, this.width);
        this.cfr_renamed_69(new QN9BUiBkXxmkLUFPOetH3RDoibNi5ci3(this));
        this.cfr_renamed_69(new _2jqU2PbxdcQobJhZj7LiTm8lgFd9VGso(this, 1002));
        this.cfr_renamed_69(new Dpijq4MeDYNSCudEZ2HMpBpOE6rlS2oG(this));
        this.cfr_renamed_69(new krinL1leKMisKZlZytp50DoEA5EXr5jz(this, x4eoNwwaSe1j70wG0mzHDJCVjZCaK0lB));
        SecureClass0003.w983xraM2Cg1plUsVtES0Kilv8JlIJ2o(this, () -> this.jnw1FKmSzsxrV34bsRjgExG6zhP3rccg(false, true));
    }
}

