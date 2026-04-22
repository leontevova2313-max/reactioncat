/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group048;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE;
import org.phobos.secure.group007.pESM8SKJph1GypFsw2xpBbqsHD2P5PS5;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.H1Ou6aQpJWyYxNzKv8hKXdqgdckyZDII;
import org.phobos.secure.group049._73fG8SZd5SeAeshSpsOLIXwrtfH9vp7e;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TickBaseModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<_73fG8SZd5SeAeshSpsOLIXwrtfH9vp7e> mode;
    public final /* synthetic */ SecureClass0603<H1Ou6aQpJWyYxNzKv8hKXdqgdckyZDII> target;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE> tick;
    public final /* synthetic */ SecureClass0603<Integer> delta;
    public final /* synthetic */ SecureClass0603<Boolean> fluctuate;
    public final /* synthetic */ SecureClass0603<Integer> cooldown;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Integer> pause;

    public /* synthetic */ TickBaseModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "TickBase", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Assists you in combat.", new int[0]);
        this.tick = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE>("Tick", Ifh7DVSQo0LVoFkeZZyFxuZF9ntXMxsE.Player));
        this.target = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<H1Ou6aQpJWyYxNzKv8hKXdqgdckyZDII>("Target", H1Ou6aQpJWyYxNzKv8hKXdqgdckyZDII.Auto));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_73fG8SZd5SeAeshSpsOLIXwrtfH9vp7e>("Mode", _73fG8SZd5SeAeshSpsOLIXwrtfH9vp7e.Box));
        this.fluctuate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fluctuate"));
        this.delta = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Delta", 1, Integer.valueOf(1), Integer.valueOf(3), "t"));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 2.5, 0.0, 16.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Min distance to target"));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 4.0, 0.0, 16.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Max distance to target"));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 4, Integer.valueOf(1), Integer.valueOf(20), "t"));
        this.pause = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Pause", 4, Integer.valueOf(0), Integer.valueOf(20), "t").cfr_renamed_110(() -> this.fluctuate.getValue() == false));
        this.cooldown = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Cooldown", 0, Integer.valueOf(0), Integer.valueOf(100), "t"));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_89("Main", this.tick, this.target, this.mode);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.fluctuate, this.delta);
        this.cfr_renamed_69(new pESM8SKJph1GypFsw2xpBbqsHD2P5PS5(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
    }
}

