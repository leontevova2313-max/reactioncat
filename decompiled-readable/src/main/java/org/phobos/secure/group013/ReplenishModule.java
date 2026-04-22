/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.SecureClass0426;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.DuIIXmGp1kyOnZmHIl7NwtwzMyjpIsSP;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.gb5IuRqukDBZfqpFmoIOnqoPTIWoP23C;
import org.phobos.secure.group050.SecureInterface0126;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ReplenishModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Float>> speed;
    public final /* synthetic */ SecureClass0603<Double> threshold;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<DuIIXmGp1kyOnZmHIl7NwtwzMyjpIsSP> mode;

    public /* synthetic */ ReplenishModule(SecureClass0242 X3fw04YtNo1rNeG59AWzckYdEVdnvuBg) {
        super(X3fw04YtNo1rNeG59AWzckYdEVdnvuBg, "Replenish", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Refills your hotbar", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<DuIIXmGp1kyOnZmHIl7NwtwzMyjpIsSP>("Mode", DuIIXmGp1kyOnZmHIl7NwtwzMyjpIsSP.Rage));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Creative").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Replenish for singleplayer testing"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0426<Float>("Speed", (Float)((Object)SecureInterface0126.wMAZSEjvEoULCU29BTHtikjbktQ9hg7X(Float.valueOf(50.0f), Float.valueOf(150.0f))), Float.valueOf(10.0f), Float.valueOf(200.0f), new String[0]).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Aim speed").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, DuIIXmGp1kyOnZmHIl7NwtwzMyjpIsSP.Legit));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 50L, 0L, 500L, true));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Threshold", 25.0, Double.valueOf(1.0), Double.valueOf(99.0), "%"));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new gb5IuRqukDBZfqpFmoIOnqoPTIWoP23C(this, X3fw04YtNo1rNeG59AWzckYdEVdnvuBg));
    }
}

