/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

import java.awt.Color;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1299;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.wWIGxyEKKAlresyZWumB5jLGFyQHaxZg;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.SecureClass1096;
import org.phobos.secure.group021.RLbKaMLNh6w9X1gPZdUaOSpVinNtJrD0;
import org.phobos.secure.group042.SecureClass0738;
import org.phobos.secure.group043.SecureClass0774;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class SearchModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ SecureClass0603<Set<class_1299<?>>> entities;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Color> tracersColor;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Set<class_2248>> selection;
    public final /* synthetic */ SecureClass0603<Float> field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<Color> field003;
    public final /* synthetic */ Map<class_2338, class_238> field004;
    public final /* synthetic */ SecureClass0603<Long> update;
    public final /* synthetic */ Object field005;
    public final /* synthetic */ SecureClass1096 field006;
    public final /* synthetic */ SecureClass0603<Boolean> tracers;

    public /* synthetic */ SearchModule(SecureClass0242 LlkaCtJP5CNyDPkLyq95ziFsL2MPNYv0) {
        super(LlkaCtJP5CNyDPkLyq95ziFsL2MPNYv0, "Search", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Looks up blocks", new int[0]);
        this.field005 = new Object[0];
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 150.0, 0.0, 300.0));
        this.update = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Update", 1000L, 0L, 3000L));
        this.selection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0738("Selection", new class_2248[0]));
        this.entities = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0774("Entities", new class_1299[0]));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 70)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", new Color(255, 255, 255, 255)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Line width"));
        this.tracers = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Tracers"));
        this.tracersColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("TracersColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("TracersWidth", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)));
        this.field006 = new SecureClass1096();
        this.field004 = new ConcurrentHashMap<class_2338, class_238>();
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_89("Render", this.field003, this.line, this.width);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.tracers, this.tracersColor, this.field001);
        this.selection.cfr_renamed_123(kmCOEyaIK557K3jHW1xFlgZm2PNFeCCF -> {
            if (SearchModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && SearchModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null) {
                this.woBocrta7rhYf19jjUUJR4nFFJmQV7vb(SearchModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724, SearchModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, true);
            }
        });
        this.cfr_renamed_69(new RLbKaMLNh6w9X1gPZdUaOSpVinNtJrD0(this));
        this.cfr_renamed_69(new wWIGxyEKKAlresyZWumB5jLGFyQHaxZg(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field004::clear);
    }
}

