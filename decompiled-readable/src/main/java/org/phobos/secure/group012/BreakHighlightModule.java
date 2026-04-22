/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group012;

import java.awt.Color;
import org.phobos.secure.group001.vHNVIVXR5IItPoserT6eLZtZEwsSFZXl;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.XciyeG2Tet2FkzO8kP8EEOFZG7Afi8zQ;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BreakHighlightModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> box;
    public final /* synthetic */ SecureClass0603<vHNVIVXR5IItPoserT6eLZtZEwsSFZXl> mode;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Boolean> fade;
    public final /* synthetic */ SecureClass0603<Long> fadeTime;
    public final /* synthetic */ SecureClass0603<Float> width;

    public /* synthetic */ BreakHighlightModule(SecureClass0242 BjpGxvijem3iopinyN31RI52WxJjCm2x) {
        super(BjpGxvijem3iopinyN31RI52WxJjCm2x, "BreakHighlight", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Highlights blocks that are being broken", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<vHNVIVXR5IItPoserT6eLZtZEwsSFZXl>("Mode", vHNVIVXR5IItPoserT6eLZtZEwsSFZXl.Continuous));
        this.box = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fade"));
        this.fadeTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("FadeTime", 500L, 0L, 2000L));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.fade, this.fadeTime).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new vHNVIVXR5IItPoserT6eLZtZEwsSFZXl[]{vHNVIVXR5IItPoserT6eLZtZEwsSFZXl.Continuous}));
        this.cfr_renamed_69(new XciyeG2Tet2FkzO8kP8EEOFZG7Afi8zQ(this));
    }
}

