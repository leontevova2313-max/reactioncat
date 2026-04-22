/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import java.awt.Color;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group001.p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group027.Zf5A6sN04DjnjDcXa5jFk6Uy6PYfwcgg;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.IJnZ1IGdXLobMGOSdAICZim4rpBOXKlA;
import org.phobos.secure.group051.K1PWn2hdFFWFR34bq6HffGL3zsIvRLcC;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group023.ot9aY8J4nuDTZXiKteWMiLMKV5xOunka;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HudModule
extends SecureClass1027
implements EventSubscriber {
    public final /* synthetic */ SecureClass0603<Color> color;
    public final /* synthetic */ SecureClass0603<Boolean> uI;
    public final /* synthetic */ SecureClass0603<Color> colors3;
    public final /* synthetic */ SecureClass0603<Color> colors2;
    public final /* synthetic */ SecureClass0603<Zf5A6sN04DjnjDcXa5jFk6Uy6PYfwcgg> style;
    public final /* synthetic */ SecureClass0603<Color> colors4;
    public final /* synthetic */ SecureClass0603<p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb> rainbow;
    public final /* synthetic */ Queue<Consumer<HudModule>> field001;
    public final /* synthetic */ SecureClass0603<Color> colors1;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> glow;
    public final /* synthetic */ SecureClass0603<Integer> speed;
    public final /* synthetic */ SecureClass0603<Boolean> brackets;
    public final /* synthetic */ SecureClass0603<ot9aY8J4nuDTZXiKteWMiLMKV5xOunka> field003;
    public static /* synthetic */ HudModule field004;
    public static final /* synthetic */ Logger field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;

    public /* synthetic */ HudModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Hud", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Client hud", new int[0]);
        this.rainbow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb>("Rainbow", p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb.None));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Speed", 15, 2, 100).cfr_renamed_110(() -> this.rainbow.getValue().oGQt4LXsP6D8K72nU01l3wy8PqaasmZa != -1));
        this.colors1 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Colors1", Color.WHITE));
        this.colors2 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Colors2", Color.WHITE));
        this.colors3 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Colors3", Color.WHITE).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.rainbow, new p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb[]{p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb.Triple, p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb.Quad})));
        this.colors4 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Colors4", Color.WHITE).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.rainbow, new p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb[]{p8x2Aa4HyQEp0NT03G2s0aLoSyxT62Tb.Quad})));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().cfr_renamed_110(() -> this.rainbow.getValue().oGQt4LXsP6D8K72nU01l3wy8PqaasmZa == -1));
        this.style = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Zf5A6sN04DjnjDcXa5jFk6Uy6PYfwcgg>("Style", Zf5A6sN04DjnjDcXa5jFk6Uy6PYfwcgg.Value));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<ot9aY8J4nuDTZXiKteWMiLMKV5xOunka>("Font", ot9aY8J4nuDTZXiKteWMiLMKV5xOunka.Vanilla).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font type"));
        this.glow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Glow").cfr_renamed_110(() -> this.field003.getValue().equals((Object)((Object)ot9aY8J4nuDTZXiKteWMiLMKV5xOunka.Native))).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font glow"));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shadow", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font shadow"));
        this.brackets = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Brackets", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Info brackets"));
        this.uI = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("UI", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Draws hud in the main UI"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Layout").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Creates vanilla hud layout for hotbar attachments"));
        this.field001 = new ConcurrentLinkedQueue<Consumer<HudModule>>();
        this.cfr_renamed_89("Colors", this.colors1, this.colors2, this.colors3, this.colors4).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(() -> this.rainbow.getValue().oGQt4LXsP6D8K72nU01l3wy8PqaasmZa != -1);
        this.cfr_renamed_69(new K1PWn2hdFFWFR34bq6HffGL3zsIvRLcC(this, Integer.MIN_VALUE, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.field003.cfr_renamed_123(OejmJ2tBK9VnTg9Aaru3sQ4vxz2blUPT -> IJnZ1IGdXLobMGOSdAICZim4rpBOXKlA.QcLBEHtuaAoWDw9uX1wnBaPIvUPFXAAF());
        field004 = this;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_865(Consumer<HudModule> FtM1lOjbaPrS43CkaPFEUemZUBKJM9mL) {
        HudModule.field004.field001.add(FtM1lOjbaPrS43CkaPFEUemZUBKJM9mL);
    }

    public static /* bridge */ /* synthetic */ HudModule Gu6fPoYCqT0oZ5xfPyvIAfE7CDocdyzJ() {
        return field004;
    }

    static {
        field005 = LoggerFactory.getLogger(HudModule.class);
    }
}

