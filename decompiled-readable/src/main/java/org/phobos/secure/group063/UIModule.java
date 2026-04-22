/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import org.phobos.secure.group002.SecureClass0021;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group008.liq5O546QsKVd9LeoigCE0fepWfHDIk4;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.YdQKdutyBZCXyptTyJR8OepJtkdT0YzC;
import org.phobos.secure.group033.SecureClass0587;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.tILk6rDH9AOKiPUzuXMM9vqFoVt6ojkN;
import org.phobos.secure.group061.uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA;
import org.phobos.secure.group016._6SkCUab5AtlB6j1HI7HrmeDvRbx8RnxH;
import org.phobos.secure.group022.SecureClass0368;
import org.phobos.secure.group050.SecureClass0903;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class UIModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public static /* synthetic */ UIModule field002;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> bindsShader;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> slidersShader;
    public final /* synthetic */ SecureClass0603<Boolean> animate;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> field003;
    public final /* synthetic */ SecureClass0603<Color> slidersColor;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> backgroundShader;
    public final /* synthetic */ SecureClass0603<Boolean> lock;
    public final /* synthetic */ SecureClass0603<Color> field004;
    public final /* synthetic */ SecureClass0603<Color> switchesEnabled;
    public final /* synthetic */ SecureClass0603<Color> switchesDisabled;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> field005;
    public final /* synthetic */ SecureClass0603<Boolean> binds;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> pickersShader;
    public final /* synthetic */ SecureClass0603<Color> backgroundColor;
    public final /* synthetic */ SecureClass0603<Color> pickersColor;
    public final /* synthetic */ SecureClass0603<Boolean> descriptions;
    public final /* synthetic */ SecureClass0603<Boolean> slide;
    public final /* synthetic */ SecureClass0603<Color> inputsColor;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> inputsShader;
    public final /* synthetic */ SecureClass0603<Color> bindsColor;
    public final /* synthetic */ SecureClass0603<Color> modulesDisabled;
    public final /* synthetic */ SecureClass0603<Color> modulesEnabled;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> field006;
    public final /* synthetic */ SecureClass0603<Boolean> effects;
    public final /* synthetic */ SecureClass0603<Color> outlineColor;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Boolean> search;
    public final /* synthetic */ SecureClass0603<liq5O546QsKVd9LeoigCE0fepWfHDIk4> animation;
    public final /* synthetic */ SecureClass0603<Float> scroll;
    public final /* synthetic */ SecureClass0603<Boolean> cPMODE;
    public final /* synthetic */ SecureClass0603<Color> glowColor;
    public final /* synthetic */ SecureClass0603<Float> soundsVolume;
    public final /* synthetic */ SecureClass0603<Boolean> sounds;
    public final /* synthetic */ SecureClass0603<Color> itemsColor;
    public final /* synthetic */ SecureClass0603<String> field007;
    public final /* synthetic */ SecureClass0603<String> open;
    public final /* synthetic */ SecureClass0603<Float> limit;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> field008;
    public final /* synthetic */ SecureClass0603<Color> selectorsColor;
    public final /* synthetic */ SecureClass0603<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA> itemsShader;
    public final /* synthetic */ SecureClass0603<_6SkCUab5AtlB6j1HI7HrmeDvRbx8RnxH> order;
    public final /* synthetic */ SecureClass0603<Color> text;
    public final /* synthetic */ SecureClass0603<Boolean> glow;
    public final /* synthetic */ SecureClass0603<Boolean> debug;
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<Boolean> outline;
    public final /* synthetic */ SecureClass0603<Float> offset;

    public static /* bridge */ /* synthetic */ boolean W22vqq42MmQsH62x9mIBz15BhfESFB2y() {
        return UIModule.field002.search.getValue();
    }

    public static /* bridge */ /* synthetic */ UIModule JVB0RhbFDbrby57vk6xoNQJ4R6iBQpei() {
        return field002;
    }

    public /* synthetic */ UIModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "UI", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Client UI", 344);
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Layout", true));
        this.animate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animate", true));
        this.lock = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lock"));
        this.slide = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Slide"));
        this.descriptions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Descriptions"));
        this.modulesEnabled = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("ModulesEnabled", new Color(255, 0, 0, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.modulesDisabled = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("ModulesDisabled", new Color(255, 0, 0, 45)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("ModulesShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("CategoriesColor", new Color(255, 0, 0, 150)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("CategoriesShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.backgroundColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BackgroundColor", new Color(0, 0, 0, 70)));
        this.backgroundShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("BackgroundShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.inputsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("InputsColor", new Color(255, 0, 0, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.inputsShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("InputsShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.binds = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Binds").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Displays binds"));
        this.bindsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BindsColor", new Color(255, 0, 0, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.bindsShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("BindsShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.switchesEnabled = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SwitchesEnabled", new Color(255, 0, 0, 140)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.switchesDisabled = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SwitchesDisabled", new Color(255, 0, 0, 45)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("SwitchesShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.slidersColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SlidersColor", new Color(255, 0, 0, 150)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.slidersShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("SlidersShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.pickersColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PickersColor", new Color(255, 0, 0, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.pickersShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("PickersShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.selectorsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SelectorsColor", new Color(255, 0, 0, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field008 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("SelectorsShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.itemsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("ItemsColor", new Color(0, 0, 0, 70)));
        this.itemsShader = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA>("ItemsShader", uipeHqZoyDUXGd0PD7sRnZOSBmc1IenA.None));
        this.text = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Text", new Color(255, 255, 255, 255)));
        this.sounds = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sounds"));
        this.soundsVolume = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SoundsVolume", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.effects = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Effects"));
        this.glow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Glow", false));
        this.glowColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("GlowColor", new Color(255, 255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.outline = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Outline").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Creates an outline"));
        this.outlineColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("OutlineColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.7f), Float.valueOf(1.35f)));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(1.0f), Float.valueOf(0.7f), Float.valueOf(1.5f)));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Offset", Float.valueOf(0.0f), Float.valueOf(-3.0f), Float.valueOf(3.0f)));
        this.limit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Limit", Float.valueOf(10.0f), Float.valueOf(10.0f), Float.valueOf(500.0f)).cfr_renamed_85("None", Float.valueOf(10.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Window height limit"));
        this.scroll = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scroll", Float.valueOf(100.0f), Float.valueOf(0.1f), Float.valueOf(200.0f), "%").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Scrolling speed"));
        this.open = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Open", "+"));
        this.field007 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Close", "-"));
        this.animation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<liq5O546QsKVd9LeoigCE0fepWfHDIk4>("Animation", liq5O546QsKVd9LeoigCE0fepWfHDIk4.Fast).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Animation vendor"));
        this.order = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_6SkCUab5AtlB6j1HI7HrmeDvRbx8RnxH>("Order", _6SkCUab5AtlB6j1HI7HrmeDvRbx8RnxH.Default));
        this.search = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Search", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Enables search"));
        this.cPMODE = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CPMODE", false));
        this.debug = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Debug"));
        this.cfr_renamed_219();
        field002 = this;
        this.lock.cfr_renamed_123(uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt -> {
            SecureClass0587.cfr_renamed_62.SNpujMqy5kMxoXcNuOweXz1t83ICNSuu().forEach(XgSUlDlX2tbSgnNgfL5tWy7L95jX2XP8 -> XgSUlDlX2tbSgnNgfL5tWy7L95jX2XP8.XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt));
            SecureClass0021.CYISnAKrOSL9E9H4Y2uDB8pFKGW1H7Pq.UR8g8cIpyWLCMSc5X3j9hl9orNGg5XWR().XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt);
            SecureClass0021.CYISnAKrOSL9E9H4Y2uDB8pFKGW1H7Pq.yoHMLP7RYQwfHKJmMp2KcLlae1Pmfbk4().XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt);
            SecureClass0368.cfr_renamed_204.cfr_renamed_680().XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt);
            SecureClass0368.cfr_renamed_204.bgzW21VEx5uuXnM1ecBr4jXnVFvRmfD3().XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt);
            SecureClass0903.pN2GNQpvy7JFfJ3zm1xNJ4HDNp84fbnz.tjm5VSwhnktZXeLnW0mYC5e7pGt9E7QF().XEA4RI3AZXuYZlSeQNJjbFR3qRObCIUI((boolean)uBB4wTpu5n3Zg85g0NrpHCTQKiimsgdt);
        });
        this.order.cfr_renamed_123(UnHQ4Ia19iuOHpBHuE6pVdRa0gjgdvVM -> {
            SecureClass0587.cfr_renamed_62.KcvnzCLqipZdYYrsD0KstIASehhu7Ecj();
            if (UIModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1755 instanceof SecureClass0587) {
                this.foc4DEvX7GNdJsX2JJB1tirKnyFuHDak();
                this.XExhjkn01ygDfysy3yJqPVDUS9R4uVFK();
            }
        });
        this.cfr_renamed_69(new YdQKdutyBZCXyptTyJR8OepJtkdT0YzC(this));
        this.cfr_renamed_69(new tILk6rDH9AOKiPUzuXMM9vqFoVt6ojkN(this));
    }

    public static /* bridge */ /* synthetic */ boolean iQBbmTYWIsLfviOt9A6k7KpYDwnnD88Q() {
        return UIModule.field002.field001.getValue() == false && UIModule.field002.lock.getValue() == false;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(67);
    }
}

