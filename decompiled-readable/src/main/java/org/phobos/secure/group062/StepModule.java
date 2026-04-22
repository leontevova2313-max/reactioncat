/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047._26xqb5fpQf4XRCzWKi6arswoIqpC6QG9;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.MJGcQ7qQFqON9u6TwoETdREiYno5pR9G;
import org.phobos.secure.group016._3Yut0w7r0PgaJnZcWONPFztZyx1WR76Z;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class StepModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<MJGcQ7qQFqON9u6TwoETdREiYno5pR9G> mode;
    public final /* synthetic */ SecureClass0603<Boolean> disable;
    public final /* synthetic */ SecureClass0603<Float> height;
    public final /* synthetic */ SecureClass0603<Boolean> slow;
    public /* synthetic */ boolean field001;
    public static /* synthetic */ StepModule field002;

    public /* synthetic */ StepModule(SecureClass0242 AQ68QvCZUdmr3DokxvxEkHDp9jna4mRQ) {
        super(AQ68QvCZUdmr3DokxvxEkHDp9jna4mRQ, "Step", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you step up blocks", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<MJGcQ7qQFqON9u6TwoETdREiYno5pR9G>("Mode", MJGcQ7qQFqON9u6TwoETdREiYno5pR9G.Vanilla));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(2.0f), Float.valueOf(0.6f), Float.valueOf(5.0f)).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new MJGcQ7qQFqON9u6TwoETdREiYno5pR9G[]{MJGcQ7qQFqON9u6TwoETdREiYno5pR9G.Vanilla, MJGcQ7qQFqON9u6TwoETdREiYno5pR9G.Normal})));
        this.slow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Slow"));
        this.disable = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Disable").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Disables when you're safe"));
        this.cfr_renamed_69(new _3Yut0w7r0PgaJnZcWONPFztZyx1WR76Z(this, AQ68QvCZUdmr3DokxvxEkHDp9jna4mRQ));
        this.cfr_renamed_69(new _26xqb5fpQf4XRCzWKi6arswoIqpC6QG9(this, AQ68QvCZUdmr3DokxvxEkHDp9jna4mRQ));
        field002 = this;
    }

    public static /* bridge */ /* synthetic */ StepModule DvO5mmypjvXKFsvOBqyc3WNIoOAAt0B3() {
        return field002;
    }
}

