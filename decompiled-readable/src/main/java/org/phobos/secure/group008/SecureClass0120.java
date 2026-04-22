/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0120
extends SecureClass0424 {
    public final /* synthetic */ SecureClass0603<Boolean> vertical;
    public final /* synthetic */ SecureClass0603<Boolean> line;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Float> spacing;
    public final /* synthetic */ SecureClass0603<Color> main;
    public static final /* synthetic */ Logger field002;
    public final /* synthetic */ Set<SecureClass1027> field003;
    public final /* synthetic */ SecureClass0603<Float> glow;
    public final /* synthetic */ SecureClass0603<Color> field004;

    static {
        field002 = LoggerFactory.getLogger(SecureClass0120.class);
    }

    public /* synthetic */ SecureClass0120() {
        super("Modules", 0.0f, 0.0f, 0.0f, 40.0f);
        this.vertical = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Vertical").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Does a vertical roll animation"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Floating").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows modules to reposition vertically"));
        this.spacing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Spacing", Float.valueOf(12.0f), Float.valueOf(10.0f), Float.valueOf(15.0f)).cfr_renamed_85("Sync", Float.valueOf(12.0f)));
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Line"));
        this.main = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Main", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Secondary", Color.BLACK));
        this.glow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Glow", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.field003 = new HashSet<SecureClass1027>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.line, this.main, this.field004, this.glow);
    }
}

