/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import java.awt.Color;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import net.minecraft.class_2960;
import org.phobos.secure.group003.SolrV9ufPwaRrc8nnmBWJiLM9agm1vrX;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group013.SecureClass0204;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.nuUMqJDzECIPyzsbEJhmuBxnqyt6pBjS;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group051.MH6KG7xoTnfmPA9iRvxosttVBREq7aHK;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.SecureClass1033;
import org.phobos.secure.group061.SecureClass1119;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TrajectoriesModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> pearls;
    public final /* synthetic */ SecureClass0603<Boolean> lines;
    public final /* synthetic */ SecureClass0603<Color> background;
    public final /* synthetic */ SecureClass0603<Color> handPosLine;
    public final /* synthetic */ SecureClass0603<Boolean> damage;
    public final /* synthetic */ SecureClass0603<Boolean> arrows;
    public final /* synthetic */ SecureClass0603<Color> field001;
    public final /* synthetic */ SecureClass0603<Float> handPosWidth;
    public final /* synthetic */ SecureClass0603<Color> linesColor;
    public final /* synthetic */ SecureClass0603<Double> handPosSize;
    public final /* synthetic */ SecureClass0603<Float> scale;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Color> damageNegative;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> indicator;
    public final /* synthetic */ SecureClass0603<Boolean> tridents;
    public final /* synthetic */ SecureClass0603<Color> color;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Float> field004;
    public final /* synthetic */ SecureClass0603<Boolean> fireballs;
    public final /* synthetic */ SecureClass0603<Boolean> hand;
    public final /* synthetic */ SecureClass0603<Color> handPosFill;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<Color> field006;
    public static final /* synthetic */ class_2960 field007;
    public final /* synthetic */ Map<class_1297, MH6KG7xoTnfmPA9iRvxosttVBREq7aHK> field008;
    public final /* synthetic */ SecureClass0204 field009;
    public /* synthetic */ boolean field010;
    public static final /* synthetic */ class_2960 field011;
    public static final /* synthetic */ class_2960 field012;
    public static final /* synthetic */ class_2960 field013;
    public static final /* synthetic */ class_2960 field014;
    public final /* synthetic */ SecureClass0603<Float> width;
    public static final /* synthetic */ class_2960 field015;
    public static final /* synthetic */ class_2960 field016;
    public final /* synthetic */ SecureClass0204 field017;
    public final /* synthetic */ SecureClass0603<Boolean> potions;
    public static final /* synthetic */ class_2960 field018;
    public final /* synthetic */ SecureClass0603<Boolean> xP;
    public /* synthetic */ boolean field019;
    public final /* synthetic */ SecureClass1033 field020;
    public final /* synthetic */ SecureClass1119 field021;
    public final /* synthetic */ SecureClass0603<Boolean> snowballs;
    public static final /* synthetic */ class_2960 field022;
    public static final /* synthetic */ class_2960 field023;
    public static final /* synthetic */ class_2960 field024;
    public static final /* synthetic */ class_2960 field025;
    public final /* synthetic */ SecureClass0603<Boolean> eggs;

    public /* synthetic */ TrajectoriesModule(SecureClass0242 d6SpIruwbtBQitHXTnFYQmJSkQc49tJo) {
        super(d6SpIruwbtBQitHXTnFYQmJSkQc49tJo, "Trajectories", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Predicts projectiles", new int[0]);
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Predict").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Prediction"));
        this.indicator = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Indicator"));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(5.0f), Float.valueOf(1.0f), Float.valueOf(3.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Indicator scale"));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 8.0, 0.0, 50.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Indicator range"));
        this.background = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Background", new Color(0, 0, 0, 70)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Indicator background"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Rim", new Color(255, 255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Indicator rim"));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Damage").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Shows damage from potions"));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("DamagePositive", Color.GREEN).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Positive potion color"));
        this.damageNegative = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("DamageNegative", Color.RED).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Negative potion color"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("DamageFix", Float.valueOf(0.5f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.lines = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lines"));
        this.linesColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LinesColor", new Color(255, 255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.hand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Hand").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Predicts from hand"));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", new Color(255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("HandPos", true));
        this.handPosFill = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("HandPosFill", new Color(255, 255, 255, 30)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.handPosLine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("HandPosLine", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.handPosWidth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("HandPosWidth", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)));
        this.handPosSize = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("HandPosSize", 0.5, 0.05, 1.0));
        this.arrows = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Arrows", true));
        this.pearls = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Pearls", true));
        this.tridents = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Tridents", true));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Charges", true));
        this.fireballs = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fireballs", true));
        this.potions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Potions"));
        this.xP = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("XP"));
        this.snowballs = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Snowballs"));
        this.eggs = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Eggs"));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.field008 = new ConcurrentHashMap<class_1297, MH6KG7xoTnfmPA9iRvxosttVBREq7aHK>();
        this.field009 = new SecureClass0204();
        this.field017 = new SecureClass0204();
        this.field020 = new SecureClass1033();
        this.field021 = new SecureClass1119();
        this.field010 = true;
        this.field019 = true;
        this.PJ36d6I7Em2hOXkBf40iAY44Tu1Bewqp().Dc2ZbJprnFbxRKGzz4f5bVarlh5ETgPW(this.field005).edQY4SaFZiPTyNslTJ6mvFfM1w3L5gqw(this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.indicator).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.damage, this.field006, this.damageNegative, this.field004)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.scale, this.range, this.background, this.field001).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa()).d4AS7b6uCFGTU6R6uTYqaA8JgEQ1MQLR(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lines, this.linesColor)).SkAchMPA8RzvAh8Q3vk4t4SxmOHwwjwY();
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.hand).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field003, this.handPosFill, this.handPosLine, this.handPosWidth, this.handPosSize)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.color).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_89("Selection", this.arrows, this.pearls, this.tridents, this.field002, this.fireballs, this.potions, this.xP, this.snowballs, this.eggs);
        this.cfr_renamed_69(new nuUMqJDzECIPyzsbEJhmuBxnqyt6pBjS(this));
        this.cfr_renamed_69(new SolrV9ufPwaRrc8nnmBWJiLM9agm1vrX(this, d6SpIruwbtBQitHXTnFYQmJSkQc49tJo));
    }

    static {
        field014 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/arrow.png");
        field012 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/spectral_arrow.png");
        field011 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/ender_pearl.png");
        field024 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/fire_charge.png");
        field022 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/splash_potion.png");
        field013 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/lingering_potion.png");
        field025 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/trident.png");
        field018 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/wind_charge.png");
        field016 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/experience_bottle.png");
        field015 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/snowball.png");
        field023 = class_2960.method_60655((String)"phoboslite", (String)"textures/vanilla/egg.png");
        field007 = class_2960.method_60655((String)"phoboslite", (String)"textures/user.png");
    }
}

