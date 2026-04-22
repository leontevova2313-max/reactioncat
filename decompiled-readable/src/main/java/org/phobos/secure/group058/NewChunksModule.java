/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group058;

import java.awt.Color;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1923;
import net.minecraft.class_2487;
import net.minecraft.class_2672;
import net.minecraft.class_2818;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group026._97c4Oj2HhDGBptCLIfHYyJlj3KO5Ta2y;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047._6e5KsakH6hrmZDJK22IhjdFlvftBOxLi;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class NewChunksModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> poll;
    public final /* synthetic */ SecureClass0603<Color> outline;
    public final /* synthetic */ SecureClass0603<Boolean> liquid;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ Set<class_1923> field001;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Color> fill;
    public final /* synthetic */ Set<class_1923> field002;
    public final /* synthetic */ Set<class_1923> field003;
    public final /* synthetic */ Set<class_1923> field004;

    public /* synthetic */ NewChunksModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "NewChunks", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, new int[0]);
        this.fill = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Fill", new Color(0, 0, 0, 50)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.outline = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Outline", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(2.0f)));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 128.0, 12.0, 300.0));
        this.poll = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Poll"));
        this.liquid = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Liquid").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks liquid flow"));
        this.field002 = ConcurrentHashMap.newKeySet();
        this.field004 = ConcurrentHashMap.newKeySet();
        this.field003 = ConcurrentHashMap.newKeySet();
        this.field001 = ConcurrentHashMap.newKeySet();
        this.cfr_renamed_89("Render", this.fill, this.outline, this.width, this.distance, this.poll);
        this.cfr_renamed_69(new _6e5KsakH6hrmZDJK22IhjdFlvftBOxLi(this));
        this.cfr_renamed_69(new _97c4Oj2HhDGBptCLIfHYyJlj3KO5Ta2y(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field002.clear();
            this.field004.clear();
            this.field003.clear();
            this.field001.clear();
        });
    }

    public static /* bridge */ /* synthetic */ void nfsT0C41ZnkCzKELF6cd7GbtOU2XR8YY(class_2818 gnVAR0bjovUMcr4q4nQu7fU3nWPJ5KET, class_2672 WDd4kao4eW8BXdpw2J25PfAERVBST1WF) {
        gnVAR0bjovUMcr4q4nQu7fU3nWPJ5KET.method_12224(WDd4kao4eW8BXdpw2J25PfAERVBST1WF.method_38598().method_38586(), new class_2487(), WDd4kao4eW8BXdpw2J25PfAERVBST1WF.method_38598().method_38587(WDd4kao4eW8BXdpw2J25PfAERVBST1WF.method_11523(), WDd4kao4eW8BXdpw2J25PfAERVBST1WF.method_11524()));
    }
}

