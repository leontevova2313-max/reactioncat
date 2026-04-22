/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import java.awt.Color;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.Uc0er8LRr0GQITjjbRbf13THPCLFaBQ9;
import org.phobos.secure.group046.bJCyRk0ctZW0tQGa7nTeEDhpxtp6KXh4;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TracersModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> hostilesColor;
    public final /* synthetic */ SecureClass0603<bJCyRk0ctZW0tQGa7nTeEDhpxtp6KXh4> bone;
    public final /* synthetic */ SecureClass0603<Color> playersColor;
    public final /* synthetic */ SecureClass0603<Color> bossesColor;
    public final /* synthetic */ SecureClass0603<Boolean> bosses;
    public final /* synthetic */ SecureClass0603<Color> animalsColor;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Color> enemies;
    public final /* synthetic */ SecureClass0603<Boolean> hostiles;
    public final /* synthetic */ SecureClass0603<Boolean> animals;
    public final /* synthetic */ SecureClass0603<Color> friends;

    public /* synthetic */ TracersModule(SecureClass0242 zVeHNGDPP4qRjZmriH9jtXWdBUFdwNLa) {
        super(zVeHNGDPP4qRjZmriH9jtXWdBUFdwNLa, "Tracers", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Draws lines to entities", new int[0]);
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Players").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Players"));
        this.playersColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PlayersColor", Color.WHITE));
        this.friends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Friends", Color.CYAN).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Friend color"));
        this.enemies = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Enemies", Color.RED).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Enemy color"));
        this.hostiles = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Hostiles").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Hostiles (zombies, phantoms)"));
        this.hostilesColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("HostilesColor", Color.RED));
        this.animals = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animals").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Animals (cows, chickens, etc)"));
        this.animalsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("AnimalsColor", Color.GREEN));
        this.bosses = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Bosses").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Bosses (wither, dragon, etc)"));
        this.bossesColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BossesColor", Color.BLACK));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Line width"));
        this.bone = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<bJCyRk0ctZW0tQGa7nTeEDhpxtp6KXh4>("Bone", bJCyRk0ctZW0tQGa7nTeEDhpxtp6KXh4.Feet));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.playersColor, this.friends, this.enemies);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.hostiles, this.hostilesColor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.animals, this.animalsColor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.bosses, this.bossesColor);
        this.cfr_renamed_69(new Uc0er8LRr0GQITjjbRbf13THPCLFaBQ9(this, zVeHNGDPP4qRjZmriH9jtXWdBUFdwNLa));
    }
}

