/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group010.Uqzy0eiLyDCf3eh8wMkfs37ybo9Jjd0y;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.vR1oEgVyoXO5mM0Y7NLCWfDEnLSHmmqL;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl;
import org.phobos.secure.group040._0WxGilTCD9moIjWnRFioBuUIAcMDz1iy;
import org.phobos.secure.group044.SecureClass0790;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class WaypointsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> box;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Float> scale;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public /* synthetic */ MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl field003;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0790 field005;

    public /* synthetic */ WaypointsModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Waypoints", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Shows waypoints", new int[0]);
        this.box = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 50)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Font").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Custom font"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shadow").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font shadow"));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Line width"));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(5.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Scaling"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Deaths").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Displays last death position"));
        this.field005 = new SecureClass0790();
        this.field003 = null;
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Render").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field004, this.field002)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.box, this.line, this.width, this.scale).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new Uqzy0eiLyDCf3eh8wMkfs37ybo9Jjd0y(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new vR1oEgVyoXO5mM0Y7NLCWfDEnLSHmmqL(this));
        this.cfr_renamed_69(new _0WxGilTCD9moIjWnRFioBuUIAcMDz1iy(this));
    }
}

