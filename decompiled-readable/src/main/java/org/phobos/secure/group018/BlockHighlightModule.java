/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group018;

import java.awt.Color;
import net.minecraft.class_2248;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group008.SecureClass0124;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.MarKXPPdUWsxkSNhUnwQb4exkbflaSPJ;
import org.phobos.secure.group038._7HZTCuJGcnBap51Ntb10Mjonc4nPmgma;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.SecureClass1033;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BlockHighlightModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass1033 field001;
    public final /* synthetic */ SecureClass0603<Boolean> depth;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public final /* synthetic */ SecureClass0603<Boolean> head;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ MutableObject<class_2248> field002;
    public final /* synthetic */ SecureClass0603<Long> time;
    public final /* synthetic */ SecureClass0603<Boolean> fade;
    public final /* synthetic */ SecureClass0603<Color> box;
    public final /* synthetic */ SecureClass0603<Boolean> animation;

    public /* synthetic */ BlockHighlightModule(SecureClass0242 skQG9haC1pmta7SzSth861Y5cNFqxguC) {
        super(skQG9haC1pmta7SzSth861Y5cNFqxguC, "BlockHighlight", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Highlights the block you're looking at", new int[0]);
        this.animation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animation"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(0.2f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.box = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 100)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(2.0f)));
        this.depth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Depth", false));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fade", false));
        this.time = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Time", 500L, 0L, 1000L, true));
        this.head = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Head", true));
        this.field001 = new SecureClass1033();
        this.field002 = new MutableObject();
        this.cfr_renamed_89("Render", this.box, this.line, this.width, this.depth);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.animation, this.speed);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.fade, this.time);
        this.cfr_renamed_69(new _7HZTCuJGcnBap51Ntb10Mjonc4nPmgma(this));
        this.cfr_renamed_69(new SecureClass0124<MarKXPPdUWsxkSNhUnwQb4exkbflaSPJ>(MarKXPPdUWsxkSNhUnwQb4exkbflaSPJ.class));
    }
}

