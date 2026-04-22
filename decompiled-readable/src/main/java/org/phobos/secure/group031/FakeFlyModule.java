/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group031;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.swhW4W6LFLgXjTVI4RzQk6ENsi9OIDXh;
import org.phobos.secure.group032._6FWjJ5DusqwZRxAEGsyvoCeLeQZ5RIui;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group049.K0hV4pOuQmhVLRSz6ozelAd4Llf6Vstr;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061.NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl;
import org.phobos.secure.group030._0TldcG9267ReU83sVs55nySvbgKkPzoL;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FakeFlyModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> inventory;
    public final /* synthetic */ SecureClass0603<Boolean> control;
    public final /* synthetic */ SecureClass0603<Boolean> keys;
    public final /* synthetic */ SecureClass0603<Boolean> firework;
    public final /* synthetic */ SecureClass0603<Boolean> ground;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Double> field002;
    public final /* synthetic */ _6FWjJ5DusqwZRxAEGsyvoCeLeQZ5RIui field003;
    public final /* synthetic */ SecureClass0603<K0hV4pOuQmhVLRSz6ozelAd4Llf6Vstr> type;
    public final /* synthetic */ SecureClass0603<Boolean> water;
    public final /* synthetic */ SecureClass0603<Double> vertical;
    public static /* synthetic */ FakeFlyModule field004;

    public static /* bridge */ /* synthetic */ FakeFlyModule LKAX1k63mPiOYnuEUpOVqUL9c3smWMC0() {
        return field004;
    }

    public /* synthetic */ FakeFlyModule(SecureClass0242 dceoZRN5rKwIIvFrddI4bYPluwQRFGDV) {
        super(dceoZRN5rKwIIvFrddI4bYPluwQRFGDV, "FakeFly", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you glide with a chestplate on", new int[0]);
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 0L, 0L, 1000L));
        this.type = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<K0hV4pOuQmhVLRSz6ozelAd4Llf6Vstr>("Type", K0hV4pOuQmhVLRSz6ozelAd4Llf6Vstr.Default));
        this.keys = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Keys", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Only performs the exloit on movement keys"));
        this.ground = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Ground").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows you to start flying on ground"));
        this.water = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Water").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows you to start flying in water"));
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Inventory").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows you to silent elytra from inventory"));
        this.firework = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Firework").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses a firework when enabled"));
        this.control = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Control"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Horizontal", 2.0, 0.5, 2.5));
        this.vertical = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Vertical", 2.0, 0.5, 2.5));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field003 = NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl.Y7n7CeQ15PHfnehCbNsQQKLHkI5ao1rM().rdDfqcbUX0fu7m37F7V1aIzGA5TIAoea(this.ground).D2iLqiPXrU96DwQ9udG9NNZQn4d3G7m1(this.water).WeFnl6P84576WrNCdtCbds0LU8f580MG(this.inventory).pRLrHBlQLDAwtC7RDqhIe3LI9EqOU2os(this.delay).oGt15UJS5BKhpHRwnjBLR3ZClul5s5Rl(this.type).n4AgQ3axG4LDodqny76OXEUutqyX5q44().cfr_renamed_744(3);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.control, this.field002, this.vertical);
        this.cfr_renamed_69(new swhW4W6LFLgXjTVI4RzQk6ENsi9OIDXh(this, -5, dceoZRN5rKwIIvFrddI4bYPluwQRFGDV));
        this.cfr_renamed_69(new _0TldcG9267ReU83sVs55nySvbgKkPzoL(this, dceoZRN5rKwIIvFrddI4bYPluwQRFGDV));
        field004 = this;
    }
}

