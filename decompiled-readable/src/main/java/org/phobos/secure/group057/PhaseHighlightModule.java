/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.olKktvc5Rfv2YHferkBOEE93ODRO6Hzi;
import org.phobos.secure.group010.orj6kPvhFHTqnCFqdPGPMcBkAUDsPyUJ;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.udRYPLhWPcTw3galfoHYTPI0CKIThLjw;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class PhaseHighlightModule
extends SecureClass1027 {
    public final /* synthetic */ List<class_2338> field001;
    public final /* synthetic */ SecureClass0603<Float> sealedWidth;
    public final /* synthetic */ SecureClass0603<Boolean> semi;
    public final /* synthetic */ SecureClass0603<orj6kPvhFHTqnCFqdPGPMcBkAUDsPyUJ> extension;
    public final /* synthetic */ SecureClass0603<Color> unsafeLine;
    public final /* synthetic */ List<class_2338> field002;
    public final /* synthetic */ SecureClass0603<Long> time;
    public final /* synthetic */ SecureClass0603<Boolean> collide;
    public final /* synthetic */ SecureClass0603<Color> safeBox;
    public final /* synthetic */ SecureClass0603<Color> semiBox;
    public final /* synthetic */ SecureClass0603<Boolean> sealed;
    public final /* synthetic */ List<class_2338> field003;
    public final /* synthetic */ SecureClass0603<Color> unsafeBox;
    public final /* synthetic */ SecureClass0603<Float> safeWidth;
    public final /* synthetic */ SecureClass0603<Color> safeLine;
    public final /* synthetic */ SecureClass0603<Color> field004;
    public final /* synthetic */ SecureClass0603<Boolean> unsafe;
    public final /* synthetic */ SecureClass0603<Float> unsafeWidth;
    public final /* synthetic */ SecureClass0603<Boolean> fade;
    public final /* synthetic */ SecureClass0603<Color> semiLine;
    public final /* synthetic */ SecureClass0603<Float> semiWidth;
    public final /* synthetic */ SecureClass0603<Color> sealedBox;
    public final /* synthetic */ SecureClass0603<Boolean> safe;
    public final /* synthetic */ List<class_2338> field005;
    public final /* synthetic */ SecureClass0603<Double> threshold;

    public /* synthetic */ PhaseHighlightModule(SecureClass0242 bP7ef5k61NdiEJW8VARcTFKt7fbbPYTl) {
        super(bP7ef5k61NdiEJW8VARcTFKt7fbbPYTl, "PhaseHighlight", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Highlights phase positions", new int[0]);
        this.extension = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<orj6kPvhFHTqnCFqdPGPMcBkAUDsPyUJ>("Extension", orj6kPvhFHTqnCFqdPGPMcBkAUDsPyUJ.Blocked));
        this.collide = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Collide", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks collision"));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Threshold", 0.02, 0.0, 0.5));
        this.safe = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Safe", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Safe positions (solid bedrock)"));
        this.safeBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SafeBox", new Color(0, 255, 0, 40)));
        this.safeLine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SafeLine", Color.GREEN));
        this.safeWidth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SafeWidth", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.semi = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Semi", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Semi-safe positions (bedrock, can fall)"));
        this.semiBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SemiBox", new Color(255, 255, 0, 40)));
        this.semiLine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SemiLine", Color.YELLOW));
        this.semiWidth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SemiWidth", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.unsafe = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Unsafe", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Unsafe positions (obsidian)"));
        this.unsafeBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("UnsafeBox", new Color(255, 0, 0, 40)));
        this.unsafeLine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("UnsafeLine", Color.RED));
        this.unsafeWidth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("UnsafeWidth", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.sealed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sealed", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Sealed positions (can fall, bedrock all around)"));
        this.sealedBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SealedBox", new Color(255, 0, 255, 40)));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SealedLine", Color.MAGENTA));
        this.sealedWidth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SealedWidth", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fade", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Adds fade animation"));
        this.time = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Time", 500L, 0L, 1000L));
        this.field001 = new ArrayList<class_2338>();
        this.field002 = new ArrayList<class_2338>();
        this.field003 = new ArrayList<class_2338>();
        this.field005 = new ArrayList<class_2338>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.collide, this.threshold);
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Render").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.safe, this.safeBox, this.safeLine, this.safeWidth), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.semi, this.semiBox, this.semiLine, this.semiWidth), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.unsafe, this.unsafeBox, this.unsafeLine, this.unsafeWidth), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.sealed, this.sealedBox, this.field004, this.sealedWidth), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.fade, this.time)).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new udRYPLhWPcTw3galfoHYTPI0CKIThLjw(this));
        this.cfr_renamed_69(new olKktvc5Rfv2YHferkBOEE93ODRO6Hzi(this));
    }
}

