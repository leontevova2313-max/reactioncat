/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group026;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import net.minecraft.class_2596;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019._97P8Kui8Bo66RfPV8P6HDegSDfqbzeE8;
import org.phobos.secure.group024.kSyuyFzHuW0plyDBdeNGe056ft2EyVmw;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061.r85Lr4OOWCpntIiN5V8iQ2Lk0LKNGrOj;
import org.phobos.secure.group023.bS25NDykqCjlnRSmrcaYz0qadelnMucY;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class InvMoveModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public final /* synthetic */ SecureClass0603<Boolean> inventory;
    public final /* synthetic */ SecureClass0603<_97P8Kui8Bo66RfPV8P6HDegSDfqbzeE8> mode;
    public /* synthetic */ int field002;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ Queue<class_2596<?>> field003;

    public /* synthetic */ InvMoveModule(SecureClass0242 ISYpjI5oxBL7Cdeq4Jjbt5tsINRuoOVQ) {
        super(ISYpjI5oxBL7Cdeq4Jjbt5tsINRuoOVQ, "InvMove", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Allows you to move while in inventory", new int[0]);
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Inventory", false));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_97P8Kui8Bo66RfPV8P6HDegSDfqbzeE8>("Mode", _97P8Kui8Bo66RfPV8P6HDegSDfqbzeE8.Vanilla));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 2, 0, 5).cfr_renamed_85("Instant", 0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _97P8Kui8Bo66RfPV8P6HDegSDfqbzeE8.Polar).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Release ticks"));
        this.field003 = new LinkedBlockingQueue<class_2596<?>>();
        this.field001 = false;
        this.field002 = 0;
        this.cfr_renamed_69(new bS25NDykqCjlnRSmrcaYz0qadelnMucY(this));
        this.cfr_renamed_69(new r85Lr4OOWCpntIiN5V8iQ2Lk0LKNGrOj(this));
        this.cfr_renamed_69(new kSyuyFzHuW0plyDBdeNGe056ft2EyVmw(this));
    }
}

