/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group025;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group046.YB9OLI2asr5KXZlZ9LwKC6MfmRLXTtue;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class PhaseStatusModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> normalBox;
    public final /* synthetic */ SecureClass0603<Boolean> fade;
    public final /* synthetic */ SecureClass0603<Color> normalLine3;
    public final /* synthetic */ SecureClass0603<Color> normalBox3;
    public final /* synthetic */ SecureClass0603<Color> normalLine2;
    public final /* synthetic */ SecureClass0603<Long> fadeTime;
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<Color> normalLine;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Color> normalBox2;

    public /* synthetic */ PhaseStatusModule(SecureClass0242 b3rGCiUNWVhO8UJ3NBmgn2DrZChBYuQ4) {
        super(b3rGCiUNWVhO8UJ3NBmgn2DrZChBYuQ4, "PhaseStatus", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Displays block type", new int[0]);
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 8.0, 3.0, 12.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Enemy range"));
        this.normalBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalBox", new Color(255, 255, 255, 30)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.normalLine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalLine", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.normalBox2 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalBox", new Color(255, 255, 0, 30)));
        this.normalLine2 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalLine", Color.YELLOW));
        this.normalBox3 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalBox", new Color(255, 0, 0, 30)));
        this.normalLine3 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("NormalLine", Color.RED));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(0.0f), Float.valueOf(-1.0f), Float.valueOf(1.0f)));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fade"));
        this.fadeTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("FadeTime", 500L, 0L, 3000L));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Render").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.cfr_renamed_89("Safe", this.normalBox, this.normalLine), this.cfr_renamed_89("Normal", this.normalBox2, this.normalLine2), this.cfr_renamed_89("Unsafe", this.normalBox3, this.normalLine3), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.fade, this.fadeTime)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.width, this.height).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new YB9OLI2asr5KXZlZ9LwKC6MfmRLXTtue(this, b3rGCiUNWVhO8UJ3NBmgn2DrZChBYuQ4));
    }
}

