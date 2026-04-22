/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group061;

import java.awt.Color;
import java.util.concurrent.CopyOnWriteArrayList;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group007.dVnN5cNFBtJLYIdlic9goKxF3GXeY6nJ;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0418;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041._64CJLWdirYqpztoetH2f35ijVA5AYyBQ;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040._8c4biqTeqvUH52g4h9JvMCNHevvIVfjP;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class HitEffectModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> trail;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Long> field002;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Color> color;
    public final /* synthetic */ SecureClass0603<Color> linesColor;
    public final /* synthetic */ SecureClass0603<Long> fade;
    public final /* synthetic */ SecureClass0603<Boolean> gradient;
    public final /* synthetic */ CopyOnWriteArrayList<SecureClass0418> field003;
    public final /* synthetic */ SecureClass0603<Color> lead;
    public final /* synthetic */ SecureClass0603<Float> factor;
    public final /* synthetic */ SecureClass0603<Boolean> lines;

    public /* synthetic */ HitEffectModule(SecureClass0242 mF7SOdl5OcxloXYXdUHlORi6QU42D6Hv) {
        super(mF7SOdl5OcxloXYXdUHlORi6QU42D6Hv, "HitEffect", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, new int[0]);
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color.WHITE, 0.2f)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.lines = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lines"));
        this.linesColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LinesColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Fade", 500L, 0L, 5000L));
        this.factor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Factor", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Dissolve", false));
        this.lead = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Lead", new Color(0.95f, 0.35f, 0.01f, 1.0f)));
        this.trail = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Trail", new Color(0.95f, 0.75f, 0.01f, 1.0f)));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("DissolveTime", 1700L, 500L, 4000L, true));
        this.gradient = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Gradient"));
        this.field003 = new CopyOnWriteArrayList<E>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lines, this.linesColor, this.width);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.field002, this.lead, this.trail, this.gradient);
        this.cfr_renamed_69(new _64CJLWdirYqpztoetH2f35ijVA5AYyBQ(this));
        this.cfr_renamed_69(new _8c4biqTeqvUH52g4h9JvMCNHevvIVfjP(this));
        this.cfr_renamed_69(new dVnN5cNFBtJLYIdlic9goKxF3GXeY6nJ(this));
    }
}

