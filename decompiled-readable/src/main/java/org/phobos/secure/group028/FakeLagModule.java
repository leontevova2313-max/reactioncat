/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group028;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE;
import org.phobos.secure.group007.aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group025.SecureClass0426;
import org.phobos.secure.group027.SecureClass0464;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class FakeLagModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE> tick;
    public final /* synthetic */ aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno field001;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Integer>> ticks;
    public final /* synthetic */ SecureClass0603<Integer> delay;

    public /* synthetic */ FakeLagModule(SecureClass0242 g7u4aiNoM2HC8UgAvcJxbeHJixaO3TqJ) {
        super(g7u4aiNoM2HC8UgAvcJxbeHJixaO3TqJ, "FakeLag", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Simulates lag (incoming and outcoming)", new int[0]);
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Delay", 2, 1, 10));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0426<Integer>("Ticks", 4, Integer.valueOf(1), Integer.valueOf(10), new String[0]));
        this.tick = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE>("Tick", Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE.Player));
        this.field001 = new aqyJnUHfaY7Zjyh4rZgHB81QcAZCFMno();
        this.cfr_renamed_69(new SecureClass0464(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("beta", this);
    }
}

