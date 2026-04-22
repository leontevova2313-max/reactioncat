/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group007.IRCModule;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group033.SecureClass0583;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group028.SecureClass0492;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0219
extends SecureClass0424 {
    public final /* synthetic */ SecureClass0603<Double> playersRadius;
    public static final /* synthetic */ SecureClass0492 field001;
    public final /* synthetic */ SecureClass0603<Float> pingsSize;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Color> sharedColor;
    public final /* synthetic */ SecureClass0583 field003;
    public final /* synthetic */ SecureClass0603<Boolean> visible;
    public final /* synthetic */ SecureClass0603<Color> playersColor;
    public final /* synthetic */ SecureClass0603<Color> playersFriends;
    public final /* synthetic */ SecureClass0603<Color> playersEnemies;
    public final /* synthetic */ SecureClass0603<Float> sharedSize;
    public final /* synthetic */ SecureClass0603<Double> sharedRadius;
    public final /* synthetic */ SecureClass0603<Boolean> shared;
    public final /* synthetic */ SecureClass0603<Boolean> pings;
    public final /* synthetic */ SecureClass0603<Float> playersSize;
    public final /* synthetic */ SecureClass0603<Double> pingsRadius;
    public final /* synthetic */ SecureClass0603<Color> pingsColor;

    static {
        field001 = SecureClass0492.n8dsaXHCFKcQ1tSGxPbXtFSPD72YbMf6("phoboslite", "textures/ui/arrow.png", true);
    }

    public /* synthetic */ SecureClass0219() {
        super("Arrows", 0.0f, 0.0f, 0.0f, 0.0f);
        this.visible = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Visible", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("If off, only renders arrows for players off screen"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Players"));
        this.playersRadius = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("PlayersRadius", 1.0, 0.3, 2.0));
        this.playersSize = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("PlayersSize", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.5f)));
        this.playersColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PlayersColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.playersFriends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PlayersFriends", Color.CYAN));
        this.playersEnemies = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PlayersEnemies", Color.RED));
        this.pings = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Pings"));
        this.pingsRadius = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("PingsRadius", 1.0, 0.3, 2.0));
        this.pingsSize = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("PingsSize", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.5f)));
        this.pingsColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("PingsColor", Color.WHITE).JYIcoicL19xUlBDonwYHuRFRmbPuz3H4(wraY9oBbFywkglUz1qZR8zbYHXeuxa3k -> wraY9oBbFywkglUz1qZR8zbYHXeuxa3k.cfr_renamed_94(true)));
        this.shared = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shared"));
        this.sharedRadius = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("SharedRadius", 1.0, 0.3, 2.0));
        this.sharedSize = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SharedSize", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.5f)));
        this.sharedColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SharedColor", Color.GRAY));
        this.field003 = new SecureClass0583();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.playersRadius, this.playersSize, this.playersColor, this.playersFriends, this.playersEnemies);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.pings, this.pingsRadius, this.pingsSize, this.pingsColor).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(IRCModule::Hjwm2FK3oebSZjAhFEos5DyujzOtI2ad);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.shared, this.sharedRadius, this.sharedSize, this.sharedColor);
    }
}

