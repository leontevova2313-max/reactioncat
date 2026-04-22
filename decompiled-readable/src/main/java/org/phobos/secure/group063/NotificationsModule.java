/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.class_2561;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group004._7iGgOlMJV5XRKKZiBZm4rFKP2eVrlgYk;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019._3w7PLsdykv0a4xMqAflCbgBGkmp8ABUp;
import org.phobos.secure.group024.SecureClass0408;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group051.HslVMqMCWuGJdwGPxGMRJu00zbRazudF;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061.kwD5IfQP6PcjV87yUxnz2jmevmeYSq6C;
import org.phobos.secure.group037.EdDyk4PnRCHLeF6PiLCybES6qJKd2yLu;
import org.phobos.secure.group053.Lu4gy153TWV5hP42U9327j02waC9mnQW;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.JhCqn4w3M1nVo2Wj57PercxWu0A4nTwQ;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class NotificationsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> streak;
    public final /* synthetic */ SecureClass0603<Boolean> totems;
    public final /* synthetic */ SecureClass0603<Map<SecureClass1027, Boolean>> modulesSelection;
    public final /* synthetic */ SecureClass0603<Color> field001;
    public final /* synthetic */ SecureClass0603<Boolean> death;
    public final /* synthetic */ SecureClass0603<Boolean> modules;
    public final /* synthetic */ SecureClass0603<Boolean> friends;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Color> logo;
    public final /* synthetic */ SecureClass0603<Float> field004;
    public final /* synthetic */ SecureClass0603<String> text;
    public static /* synthetic */ NotificationsModule field005;
    public final /* synthetic */ List<class_2561> field006;
    public final /* synthetic */ SecureClass0603<Boolean> sound;
    public final /* synthetic */ SecureClass0603<Boolean> self;
    public final /* synthetic */ SecureClass0603<Boolean> kills;
    public final /* synthetic */ SecureClass0603<Color> main;

    public /* synthetic */ NotificationsModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Notifications", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Chat notifications", new int[0]);
        this.field006 = new ArrayList<class_2561>();
        this.logo = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Logo", new Color(255, 255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.main = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Main", new Color(200, 200, 200, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Secondary", new Color(150, 150, 150, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.modules = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Modules", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Notify module status"));
        this.modulesSelection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<SecureClass1027>("ModulesSelection", SecureClass1027.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(sOOskK11vmArPZzXXLWaCvOY5iDOGwJ9 -> {
            Iterator<SecureClass1027> iterator = this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().cfr_renamed_154().iterator();
            while (iterator.hasNext()) {
                SecureClass1027 field007 = iterator.next();
                sOOskK11vmArPZzXXLWaCvOY5iDOGwJ9.bGwM62Ubm12oMVmfN57O7Jq3mIRAft3L(field007, field007.getName(), true);
            }
            return;
        }));
        this.totems = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Totems", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Totem pops"));
        this.self = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Self", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Count self-pops"));
        this.kills = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Kills").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Kill notification"));
        this.streak = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Streak").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Kill-streaks"));
        this.death = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Death").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Death coordinates"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("VisualRange").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Notifies when a player enters your visual range"));
        this.friends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Friends"));
        this.sound = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sound"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SoundVolume", Float.valueOf(0.5f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.text = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Text", "Phobos"));
        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().RnnUuNNh3JW28ws7linsjvyVcjubYo13(SecureClass0408.class, wkVO0Z2VhPcBQmbSiMAdr6TGsIubX3K0 -> this.LxLW25yafCOixtlwCtsA21k70nkKuq3Q((class_2561)class_2561.method_43470((String)wkVO0Z2VhPcBQmbSiMAdr6TGsIubX3K0.getMessage())));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.field002).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.sound, this.field004)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.friends).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.modules, this.modulesSelection);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.totems, this.self);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.kills, this.streak);
        this.cfr_renamed_69(new EdDyk4PnRCHLeF6PiLCybES6qJKd2yLu(this));
        this.cfr_renamed_69(new JhCqn4w3M1nVo2Wj57PercxWu0A4nTwQ(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new kwD5IfQP6PcjV87yUxnz2jmevmeYSq6C(this));
        this.cfr_renamed_69(new _3w7PLsdykv0a4xMqAflCbgBGkmp8ABUp(this));
        this.cfr_renamed_69(new Lu4gy153TWV5hP42U9327j02waC9mnQW(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new HslVMqMCWuGJdwGPxGMRJu00zbRazudF(this));
        this.cfr_renamed_69(new _7iGgOlMJV5XRKKZiBZm4rFKP2eVrlgYk(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field003 = 0;
        });
        field005 = this;
    }

    public static /* bridge */ /* synthetic */ NotificationsModule EBTOe9BxfODSaZKz6RqUb9wF3OHHvp6e() {
        return field005;
    }
}

