/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.WY6y2vmXbNcIEY3poAsvChhLYukKIRAD;
import org.phobos.secure.group024.BmLCY4FNo8R7P9WVyeNROw9Mw8eUJfvp;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ClipModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> swing;
    public final /* synthetic */ SecureClass0603<Float> angle;
    public final /* synthetic */ SecureClass0603<Boolean> crawl;
    public final /* synthetic */ SecureClass0603<Boolean> elevator;
    public final /* synthetic */ SecureClass0603<Double> extension;
    public final /* synthetic */ SecureClass0603<WY6y2vmXbNcIEY3poAsvChhLYukKIRAD> sides;
    public final /* synthetic */ SecureClass0603<sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4> mode;
    public final /* synthetic */ SecureClass0603<BmLCY4FNo8R7P9WVyeNROw9Mw8eUJfvp> field001;
    public final /* synthetic */ SecureClass0603<Boolean> attack;

    public /* synthetic */ ClipModule(SecureClass0242 eKj10u1l7ZH1FiNiVhyxhkx0msR6seGe) {
        super(eKj10u1l7ZH1FiNiVhyxhkx0msR6seGe, "Clip", SecureClass1004.cfr_renamed_106, "Clips you into blocks nearby", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4>("Mode", sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Mover));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<BmLCY4FNo8R7P9WVyeNROw9Mw8eUJfvp>("Rotate", BmLCY4FNo8R7P9WVyeNROw9Mw8eUJfvp.Simple).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4[]{sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl})));
        this.extension = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Extension", 0.2, 0.01, 0.3).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Colliding hitbox extension").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl));
        this.angle = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Angle", Float.valueOf(82.8f), Float.valueOf(-90.0f), Float.valueOf(90.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl));
        this.attack = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Attack").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Breaks blocking entities").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl));
        this.swing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swing").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Hand swing").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl));
        this.crawl = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Crawl").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Crawl phase").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl));
        this.elevator = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Elevator").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Pearl).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows you to clip upwards when phased"));
        this.sides = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<WY6y2vmXbNcIEY3poAsvChhLYukKIRAD>("Sides", WY6y2vmXbNcIEY3poAsvChhLYukKIRAD.Both).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (WY6y2vmXbNcIEY3poAsvChhLYukKIRAD)((Object)sh5z8UWctNzHABZBtosT1MWeGwG0LgQ4.Desync)));
        SecureClass0003.cZo8wB8c7XNLE22F7YGv6rCFPvbQF7kX(this);
    }
}

