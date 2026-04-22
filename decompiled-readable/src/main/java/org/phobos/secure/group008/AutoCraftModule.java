/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_3955;
import net.minecraft.class_8786;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group007.aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno;
import org.phobos.secure.group010.SecureInterface0023;
import org.phobos.secure.group012.KPxgA7h8FslQSBbhKmMlj4NpP8qae6hw;
import org.phobos.secure.group012.SecureClass0181;
import org.phobos.secure.group014.SecureClass0211;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group015.bBHowHHUPUXLXUemiD5SOHEVcF945PrK;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group021.skpdRTjO5ADAxdsXhosi4C9b3cf0Tdxo;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoCraftModule
extends SecureClass1027 {
    public final /* synthetic */ SecureInterface0023 field001;
    public final /* synthetic */ SecureInterface0023 field002;
    public final /* synthetic */ Set<class_1792> field003;
    public static final /* synthetic */ skpdRTjO5ADAxdsXhosi4C9b3cf0Tdxo field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public static final /* synthetic */ skpdRTjO5ADAxdsXhosi4C9b3cf0Tdxo field006;
    public /* synthetic */ boolean field007;
    public final /* synthetic */ SecureClass0603<Boolean> procedural;
    public final /* synthetic */ Map<class_1792, class_8786<class_3955>> field008;
    public final /* synthetic */ SecureClass0603<Boolean> field009;
    public final /* synthetic */ SecureClass0603<Boolean> filter;
    public final /* synthetic */ Map<class_2960, Long> field010;
    public final /* synthetic */ SecureClass0603<Integer> complete;
    public final /* synthetic */ SecureClass0603<Integer> delay;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> items;

    public /* synthetic */ AutoCraftModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoCraft", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, new int[0]);
        this.items = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Items", new class_1792[0]));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Delay", 5, 0, 30));
        this.complete = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Complete", 1, 0, 30));
        this.procedural = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Procedural").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Tries to craft dependencies"));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Table").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Craft the crafting table if needed"));
        this.field009 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Check").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks if you already have the item you want to craft"));
        this.filter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Filter").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Runs comparator filtering on tools and armor"));
        this.field008 = new HashMap<class_1792, class_8786<class_3955>>();
        this.field003 = ConcurrentHashMap.newKeySet();
        this.field010 = new HashMap<class_2960, Long>();
        this.field001 = new aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno();
        this.field002 = new aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.procedural, this.field005);
        this.cfr_renamed_69(new KPxgA7h8FslQSBbhKmMlj4NpP8qae6hw(this));
        this.cfr_renamed_69(new bBHowHHUPUXLXUemiD5SOHEVcF945PrK(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field008::clear);
    }

    static {
        field004 = new skpdRTjO5ADAxdsXhosi4C9b3cf0Tdxo(2, 2);
        field006 = new skpdRTjO5ADAxdsXhosi4C9b3cf0Tdxo(3, 3);
    }

    public static /* bridge */ /* synthetic */ Boolean pYZpy1ZEYSMCLVJoKHZRqsIOowhrS3ft(class_1792 olMjV1IGHZajzXG0diYoI8HcPAbBtUFl, class_1799 BRJaeKHWxEa71dFyQWdORJG7JR9K54w4, SecureClass0181 jDyYlYSAs41qgflO4ccdktRPey4p87Vy) {
        return SecureClass0211.JNFJxLeQGLYRovsjWTKk1qfsrO0Vhjqs(jDyYlYSAs41qgflO4ccdktRPey4p87Vy, olMjV1IGHZajzXG0diYoI8HcPAbBtUFl, BRJaeKHWxEa71dFyQWdORJG7JR9K54w4);
    }
}

