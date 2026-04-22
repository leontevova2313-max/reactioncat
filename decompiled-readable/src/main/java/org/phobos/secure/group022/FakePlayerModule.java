/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063._0gdhHTQt4nSdvvz5kcrjgxdeUtZrmA1D;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FakePlayerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> damage;
    public static /* synthetic */ FakePlayerModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<_0gdhHTQt4nSdvvz5kcrjgxdeUtZrmA1D> movement;
    public final /* synthetic */ SecureClass0603<Boolean> heal;
    public final /* synthetic */ SecureClass0603<String> name;
    public final /* synthetic */ SecureClass0603<Integer> limit;

    public /* synthetic */ FakePlayerModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "FakePlayer", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Manages fake players", new int[0]);
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Knockback"));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Damage", true));
        this.heal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Heal", true));
        this.limit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Limit", 10, 1, 100).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Maximum amount you can spawn"));
        this.name = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Name", "FakePlayer").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("FakePlayer name"));
        this.movement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_0gdhHTQt4nSdvvz5kcrjgxdeUtZrmA1D>("Movement", _0gdhHTQt4nSdvvz5kcrjgxdeUtZrmA1D.None));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ FakePlayerModule cfr_renamed_762() {
        return field001;
    }
}

