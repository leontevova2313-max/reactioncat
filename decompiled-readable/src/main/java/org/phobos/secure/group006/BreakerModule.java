/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group006;

import engine.linking.NativeMethodHandler;
import java.util.Map;
import net.minecraft.class_1735;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group008.i3aRxL5mvWQWHXnYhMmhvH35msBoC1rP;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039._07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.WiiiTPulZnteNjDbScXGGGBoy36QFIvf;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.NxxJ1Rw5YXvmm7Z1raBDvwSJrbeSJ46U;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BreakerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> swing;
    public final /* synthetic */ SecureClass0603<i3aRxL5mvWQWHXnYhMmhvH35msBoC1rP> update;
    public final /* synthetic */ SecureClass0603<Map<WiiiTPulZnteNjDbScXGGGBoy36QFIvf, Boolean>> types;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> inventory;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Long> inventoryTimeout;
    public final /* synthetic */ SecureClass0603<XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb> mode;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ class_1735 field004;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> inventoryClose;
    public final /* synthetic */ SecureClass0603<Boolean> manual;
    public /* synthetic */ int field005;
    public final /* synthetic */ SecureClass0603<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0> rotate;
    public final /* synthetic */ SecureClass0603<NxxJ1Rw5YXvmm7Z1raBDvwSJrbeSJ46U> inventoryReplace;
    public final /* synthetic */ SecureClass0603<Boolean> stun;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ SecureClass0603<Boolean> verify;

    public /* synthetic */ BreakerModule(SecureClass0242 gIOVLNFXTG7EaECLXmDO7sMCCU1mPaua) {
        super(gIOVLNFXTG7EaECLXmDO7sMCCU1mPaua, "Breaker", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Breaks item frames and scaffolding near you", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb>("Mode", XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Phase));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 150L, 0L, 1000L, true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Shield));
        this.update = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<i3aRxL5mvWQWHXnYhMmhvH35msBoC1rP>("Update", i3aRxL5mvWQWHXnYhMmhvH35msBoC1rP.Async).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Update stage").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Phase));
        this.types = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<WiiiTPulZnteNjDbScXGGGBoy36QFIvf>("Types", WiiiTPulZnteNjDbScXGGGBoy36QFIvf.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(MZorAVz1D0F6kaJteHaYBLQOpgMeMUHm -> {
            WiiiTPulZnteNjDbScXGGGBoy36QFIvf[] field007 = WiiiTPulZnteNjDbScXGGGBoy36QFIvf.values();
            int n = field007.length;
            int n2 = 0;
            while (n2 < n) {
                WiiiTPulZnteNjDbScXGGGBoy36QFIvf field008 = field007[n2];
                MZorAVz1D0F6kaJteHaYBLQOpgMeMUHm.n1W8XPBYJrDzssWYPABQFTJ1vXyEatgH(field008, field008.name());
                ++n2;
            }
            return;
        }).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ((SecureClass0603<WiiiTPulZnteNjDbScXGGGBoy36QFIvf>)this.mode, (WiiiTPulZnteNjDbScXGGGBoy36QFIvf)((Object)XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Phase)));
        this.rotate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0>("Rotate", _07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0.None).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0)((Object)XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Phase)));
        this.swing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swing").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Phase));
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Inventory").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Gets the axe from inventory"));
        this.inventoryTimeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("InventoryTimeout", 200L, 0L, 500L));
        this.inventoryClose = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("InventoryClose", 100L, 0L, 1000L, true));
        this.inventoryReplace = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<NxxJ1Rw5YXvmm7Z1raBDvwSJrbeSJ46U>("InventoryReplace", NxxJ1Rw5YXvmm7Z1raBDvwSJrbeSJ46U.Sword));
        this.manual = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Manual", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Requires you to attack the enemy"));
        this.stun = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Stun").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Shield));
        this.verify = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Verify").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks if the target is using the shield").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, XiZIdA5gnmFhkBl5kLKcZwahAwlZoATb.Shield));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field006 = false;
        this.field004 = null;
        this.field003 = false;
        this.field005 = -1;
        this.eM7F2KfmB7lIu8TiKh7fFNgxoOMXGWve();
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(79);
    }
}

