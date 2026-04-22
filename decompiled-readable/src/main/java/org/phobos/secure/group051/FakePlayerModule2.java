/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group011.SecureClass0171;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group051._4DnqBmD9Cb6zLW0wXEwf2AOPiiNM2RUn;
import org.phobos.secure.group055.Yc42aHsUSzHFUw92rVYdKcOiglDUd62U;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group020.ajyzZ1wy4U4s06W3e3HSfNhHnvxxhpDR;
import org.phobos.secure.group028.NR4VWtAOvhe5cyFIfjlZpvHIykooZadr;
import org.phobos.secure.group036.OFdIe5qSXJygH0UCtD20hB1noPijhsx0;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FakePlayerModule2
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> play;
    public final /* synthetic */ List<NR4VWtAOvhe5cyFIfjlZpvHIykooZadr> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static final /* synthetic */ int field003 = -30095827;
    public final /* synthetic */ SecureClass0603<Boolean> record;
    public /* synthetic */ int field004;
    public final /* synthetic */ SecureClass0603<String> name;
    public /* synthetic */ boolean field005;
    public /* synthetic */ int field006;
    public final /* synthetic */ SecureClass0603<Boolean> heal;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field007;
    public final /* synthetic */ SecureClass0603<Boolean> totem;
    public final /* synthetic */ MutableObject<SecureClass0171> field008;
    public static /* synthetic */ FakePlayerModule2 field009;
    public final /* synthetic */ SecureClass0603<Long> healDelay;
    public final /* synthetic */ SecureClass0603<Boolean> damage;

    public /* synthetic */ FakePlayerModule2(SecureClass0242 PZYbIhE6xgZTzjobqUOMLjgZrhVYLocD) {
        super(PZYbIhE6xgZTzjobqUOMLjgZrhVYLocD, "FakePlayer", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Spawns a fake player", new int[0]);
        this.play = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Play", false));
        this.record = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Record", false));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Loop", false));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Damage", true));
        this.heal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Heal", true));
        this.healDelay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("HealDelay", 1600L, 1500L, 2000L, true));
        this.totem = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Totem", true));
        this.name = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Name", "FakePlayer"));
        this.field008 = new MutableObject();
        this.field001 = new ArrayList<NR4VWtAOvhe5cyFIfjlZpvHIykooZadr>();
        this.field007 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new Yc42aHsUSzHFUw92rVYdKcOiglDUd62U(this, PZYbIhE6xgZTzjobqUOMLjgZrhVYLocD));
        this.cfr_renamed_69(new OFdIe5qSXJygH0UCtD20hB1noPijhsx0(this));
        this.cfr_renamed_69(new ajyzZ1wy4U4s06W3e3HSfNhHnvxxhpDR(this));
        this.cfr_renamed_69(new _4DnqBmD9Cb6zLW0wXEwf2AOPiiNM2RUn(this));
        SecureClass0003.cZo8wB8c7XNLE22F7YGv6rCFPvbQF7kX(this);
        field009 = this;
    }

    public static /* bridge */ /* synthetic */ FakePlayerModule2 jyLpsyW4x72YtKlfQahigK5WqLoE6wT2() {
        return field009;
    }
}

