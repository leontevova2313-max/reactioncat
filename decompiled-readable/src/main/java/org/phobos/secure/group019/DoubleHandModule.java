/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import org.phobos.secure.group001.o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.SecureClass0108;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0416;
import org.phobos.secure.group034._8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0724;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group023.SecureClass0389;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class DoubleHandModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> health;
    public /* synthetic */ float field001;
    public final /* synthetic */ SecureClass0603<Float> damage;
    public final /* synthetic */ SecureClass0603<Integer> slot;
    public final /* synthetic */ SecureClass0603<Boolean> auto;
    public final /* synthetic */ SecureClass0603<Long> timeout;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<Long> totem;
    public final /* synthetic */ SecureClass0603<Boolean> offhand;
    public final /* synthetic */ SecureClass0603<Boolean> ground;
    public final /* synthetic */ SecureClass0603<Boolean> anchorWorld;
    public static /* synthetic */ boolean field003;
    public final /* synthetic */ o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe field004;
    public final /* synthetic */ SecureClass0603<Boolean> anchor;
    public final /* synthetic */ SecureClass0603<_8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7> mode;
    public final /* synthetic */ SecureClass0603<Float> threshold;
    public final /* synthetic */ SecureClass0603<Boolean> shield;

    static {
        field003 = false;
    }

    public /* synthetic */ DoubleHandModule(SecureClass0242 lVy5NtpdKku3MXslDPYjYWnjbR4eXxR3) {
        super(lVy5NtpdKku3MXslDPYjYWnjbR4eXxR3, "DoubleHand", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Holds a totem but works as a gap", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7>("Mode", _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Rage));
        this.anchor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Anchor").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Selects totem on when clicking a lethal anchor"));
        this.anchorWorld = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("AnchorWorld").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Assumes newly placed anchors are dangerous"));
        this.offhand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Offhand").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Offhand totem").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Legit));
        this.ground = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Ground").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Requires you to be off ground to work with crystals").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Legit));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Threshold", Float.valueOf(2.0f), Float.valueOf(0.0f), Float.valueOf(4.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("If damage is higher than (health - threshold)").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Legit));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Timeout", 750L, 50L, 3000L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Legit));
        this.slot = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Slot", 1, 1, 9).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Slot for double hand").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Rage));
        this.auto = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Auto").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Switches to totem on low health"));
        this.health = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Health", Float.valueOf(10.0f), Float.valueOf(1.0f), Float.valueOf(36.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Gives you a totem under this health (Not locked)"));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Damage", Float.valueOf(10.0f), Float.valueOf(4.0f), Float.valueOf(16.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Gives you a totem if you take this amount of damage"));
        this.totem = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Totem", 100L, 50L, 500L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Gives you a totem if you popped within the timeout"));
        this.shield = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shield").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Does nothing if you're holding a shield"));
        this.field004 = new o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe();
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.anchor, this.anchorWorld).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Legit);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.auto, this.health, this.damage, this.totem).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, _8rRfSnPa7SGHJ4KgC8KOlEcEs5LAYXy7.Rage);
        this.cfr_renamed_69(new SecureClass0108(this));
        this.cfr_renamed_69(new SecureClass0724(this));
        this.cfr_renamed_69(new SecureClass0416(this));
        this.cfr_renamed_69(new SecureClass0389(this));
    }
}

