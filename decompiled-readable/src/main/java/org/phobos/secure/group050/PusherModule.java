/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.E8izgpiicix566ASerLk6r3alBVjTaPf;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.rwqx4f8VGQn5IqvDZAQtKnwN4TjxSKpd;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group043._3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr;
import org.phobos.secure.group044.GuhfL5WG5zLow2bZzCal5kw4gbkq6nal;
import org.phobos.secure.group056.SecureClass1022;

public class PusherModule
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Boolean> phase;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> crystalSilent;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<GuhfL5WG5zLow2bZzCal5kw4gbkq6nal> placement;
    public final /* synthetic */ SecureClass0603<Boolean> crystalExtra;
    public final /* synthetic */ SecureClass0603<Boolean> crystal;
    public final /* synthetic */ SecureClass0603<rwqx4f8VGQn5IqvDZAQtKnwN4TjxSKpd> crystalAxis;
    public final /* synthetic */ SecureClass0603<_3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr> crystalSwitch;
    public final /* synthetic */ SecureClass0603<E8izgpiicix566ASerLk6r3alBVjTaPf> field003;
    public final /* synthetic */ SecureClass0603<Long> delay;

    public static /* bridge */ /* synthetic */ boolean Q60pSnNcU5dOnFOxdNftRYe66Ecp5eaq(class_2338 IJsMUCpTjVhp1KTRTr0qeWdYNJeQx93R, class_2680 class_26802) {
        return class_26802.method_27852(class_2246.field_10343);
    }

    public /* synthetic */ PusherModule(SecureClass0242 EtI8JPkeBfG5APptmJLKrIUCH96seBpl) {
        super(EtI8JPkeBfG5APptmJLKrIUCH96seBpl, "Pusher", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 4);
        this.crystal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Crystal").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Pushes crystals into enemies"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalOnly"));
        this.crystalAxis = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<rwqx4f8VGQn5IqvDZAQtKnwN4TjxSKpd>("CrystalAxis", rwqx4f8VGQn5IqvDZAQtKnwN4TjxSKpd.Any));
        this.crystalExtra = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalExtra"));
        this.crystalSwitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr>("CrystalSwitch", _3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr.Silent));
        this.crystalSilent = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("CrystalSilent", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Normal));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<E8izgpiicix566ASerLk6r3alBVjTaPf>("Verify", E8izgpiicix566ASerLk6r3alBVjTaPf.Simulation));
        this.placement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<GuhfL5WG5zLow2bZzCal5kw4gbkq6nal>("Placement", GuhfL5WG5zLow2bZzCal5kw4gbkq6nal.Redstone).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("First block to place"));
        this.phase = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Phase").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Only push players when they are phasing"));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 5000L));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.crystal, this.field002, this.crystalAxis, this.crystalExtra, this.crystalSwitch, this.crystalSilent);
    }
}

