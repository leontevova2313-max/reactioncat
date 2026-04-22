/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group051.GWppeOneZoQ1wtkLhrZ3CWp6N2UXEeMI;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.ldIhKedeMnpJzBOtAqCjuIpMYrAQCwI6;

public class ItemsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Color> boxFill;
    public final /* synthetic */ SecureClass0603<Boolean> itemsData;
    public final /* synthetic */ SecureClass0603<Double> offset;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Boolean> thrown;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> itemsText;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Color> itemsDataColor;
    public final /* synthetic */ SecureClass0603<Boolean> properties;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Float> scale;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> items;
    public final /* synthetic */ SecureClass0603<Color> textColor;
    public final /* synthetic */ SecureClass0603<Boolean> itemsBox;

    public /* synthetic */ ItemsModule(SecureClass0242 to3hGxrqsMc3ChiDsSVAGR07bflfqagT) {
        super(to3hGxrqsMc3ChiDsSVAGR07bflfqagT, "Items", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Renders items and projectiles", new int[0]);
        this.items = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Items", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Items on the ground"));
        this.itemsData = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ItemsData", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Displays container contents"));
        this.itemsDataColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("ItemsDataColor", new Color(0, 0, 0, 50)));
        this.itemsText = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ItemsText", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Nametag data"));
        this.itemsBox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ItemsBox", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Bounding box"));
        this.thrown = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Thrown", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Projectiles"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ThrownText", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Nametag data"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ThrownBox", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Bounding box"));
        this.properties = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Properties", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Shows how much is in the stack"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Font", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Custom font"));
        this.textColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("TextColor", Color.WHITE));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shadow", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font shadow"));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Offset", 0.4, 0.0, 1.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Vertical offset"));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(2.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font size"));
        this.boxFill = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BoxFill", new Color(255, 255, 255, 100)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(2.0f)));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Text").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.field003)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.textColor, this.properties, this.scale).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.items).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.itemsData, this.itemsDataColor)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.itemsText, this.itemsBox).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.thrown, this.field001, this.field004);
        this.cfr_renamed_89("Box", this.boxFill, this.line, this.width);
        this.cfr_renamed_69(new GWppeOneZoQ1wtkLhrZ3CWp6N2UXEeMI(this, -1, to3hGxrqsMc3ChiDsSVAGR07bflfqagT));
        this.cfr_renamed_69(new ldIhKedeMnpJzBOtAqCjuIpMYrAQCwI6(this, -2));
    }
}

