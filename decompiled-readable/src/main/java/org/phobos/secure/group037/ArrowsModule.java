/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import java.awt.Color;
import net.minecraft.class_2960;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group033.SecureClass0583;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group048.SecureClass0869;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class ArrowsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> enemies;
    public final /* synthetic */ SecureClass0603<Float> size;
    public final /* synthetic */ SecureClass0603<Double> field001;
    public final /* synthetic */ SecureClass0603<Color> friends;
    public final /* synthetic */ SecureClass0583 field002;
    public final /* synthetic */ SecureClass0603<Color> color;
    public static final /* synthetic */ class_2960 field003;

    static {
        field003 = class_2960.method_60655((String)"phoboslite", (String)"textures/ui/arrow.png");
    }

    public /* synthetic */ ArrowsModule(SecureClass0242 zrQUnpZCd7IdiK19buGoSvpyuGRtWIm3) {
        super(zrQUnpZCd7IdiK19buGoSvpyuGRtWIm3, "Arrows", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Draws arrows to enemies", new int[0]);
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Radius", 1.0, 0.3, 2.0));
        this.size = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Size", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.5f)));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.friends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Friends", Color.CYAN));
        this.enemies = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Enemies", Color.RED));
        this.field002 = new SecureClass0583();
        this.cfr_renamed_69(new SecureClass0869(this));
    }
}

