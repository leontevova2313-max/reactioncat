/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import java.awt.Color;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0418;
import org.phobos.secure.group033.R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0884;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group059.QbvjcSvazqX6R5pTCNJPuiupPKnDyhqo;

public class BlinkModule
extends SecureClass0884 {
    public final /* synthetic */ SecureClass0603<Boolean> all;
    public final /* synthetic */ SecureClass0603<Boolean> animations;
    public final /* synthetic */ SecureClass0603<Color> color;
    public /* synthetic */ boolean field001;
    public /* synthetic */ int field002;
    public final /* synthetic */ SecureClass0603<Integer> packets;
    public final /* synthetic */ SecureClass0603<Boolean> render;
    public final /* synthetic */ SecureClass0603<Float> width;
    public static /* synthetic */ BlinkModule field003;
    public final /* synthetic */ SecureClass0603<Boolean> step;
    public static final /* synthetic */ int field004 = -92871825;
    public final /* synthetic */ SecureClass0603<Boolean> lines;
    public /* synthetic */ SecureClass0418 field005;
    public final /* synthetic */ SecureClass0603<R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe> mode;
    public final /* synthetic */ SecureClass0603<Color> linesColor;
    public final /* synthetic */ SecureClass0603<Boolean> disable;

    public static /* bridge */ /* synthetic */ BlinkModule cfr_renamed_394() {
        return field003;
    }

    public /* synthetic */ BlinkModule(SecureClass0242 F0TQBb4XRUhoMjaOY6da9KSGmmbV0QLN) {
        super(F0TQBb4XRUhoMjaOY6da9KSGmmbV0QLN, "Blink", SecureClass1004.cfr_renamed_106, "Cancels packets to appear teleporting");
        this.all = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("All").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Shifts all packets"));
        this.render = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Render").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Displays server position"));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe>("Mode", R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Texture));
        this.lines = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lines").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model})));
        this.linesColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LinesColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model})));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", new Color(255, 255, 255, 50)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model})));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model})));
        this.animations = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animations").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model})));
        this.disable = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Disable").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Turns off the module when enough packets were cancelled"));
        this.packets = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Packets", 500, 10, 10000));
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Step"));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.render).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lines, this.linesColor).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe[]{R5aYTB5aAIDMiMC4iQkp9C0wkequ0coe.Model}))).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.mode, this.color, this.width, this.animations).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.disable, this.packets);
        this.cfr_renamed_69(new QbvjcSvazqX6R5pTCNJPuiupPKnDyhqo(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this::foc4DEvX7GNdJsX2JJB1tirKnyFuHDak);
        field003 = this;
    }
}

