/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group008.VSmyt9oU0k5sIB6xVtuu5aJOtN3YZGXS;
import org.phobos.secure.group012.Clq78lUFfrlfEED5Jvdujg2UiVeWfZ0S;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group026.GcjRSpKmUAI8eyAlecF89GnExRq1z1th;
import org.phobos.secure.group027.NpAHJpGCixQnXglwyTbXq6LTOAq9EePF;
import org.phobos.secure.group033.SecureClass0583;
import org.phobos.secure.group034.xKLhkyrlGUsy0s9kxgUBs2WuOb520RQK;
import org.phobos.secure.group049.Ao6akQZOgCwSanF62ZhhJdtqsNixeHgA;
import org.phobos.secure.group057.ViuBCJvVau4FOkcUEnFMQky7eyU7C75b;
import org.phobos.secure.group057._5PHTrtQ3XfdTTOKeZEkfxqZ09VaGU6U3;
import org.phobos.secure.group058.LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs;
import org.phobos.secure.group058.lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o;
import org.phobos.secure.group063.ZWikDnDtvWmPc6099UmFNaAfFFdWEokc;
import org.phobos.secure.group061.tuVlVosF8VuJ610Mb2RXV3KitUIAbacc;
import org.phobos.secure.group061.SecureClass1119;
import org.phobos.secure.group020.Gnr39EjOTVRE0YwBA3lHYt4qHdJbrcub;
import org.phobos.secure.group021.d5r9qTJ2SzQeolB5i4cSm8Q8H1aYMhfH;
import org.phobos.secure.group021.SecureClass0347;
import org.phobos.secure.group021.n9BzlriMI0gm1XKITo5SdQcbQdgbliTY;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group023.qrIaq3RwxFCwWKU5ZXZ8joTkjcYtVIAM;
import org.phobos.secure.group023.xK2tn5MBqTOiCpJIFI8qS7V8Y4IpvT5S;
import org.phobos.secure.group028.XDlo46VT8qSN32ETtlCraohg4vyIomGw;
import org.phobos.secure.group043.QWXM8ZyfVfh2Jn6hrJpGWHrpQUHCQC78;
import org.phobos.secure.group046.MVOH9WPhPm0RNJ8iCYmyYEoo2QEjRDFY;
import org.phobos.secure.group046.XRPszHK8Ub2ruRwX4BJHhw1fpC6PzgQW;
import org.phobos.secure.group053.g96CzaBGiMRHY8QHVoTTQKHat21zBqFT;
import org.phobos.secure.group053.SecureClass0966;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0700
extends SecureClass0966
implements EventSubscriber {
    public /* synthetic */ float field001;
    public /* synthetic */ boolean field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ float field004;
    public /* synthetic */ float field005;
    public /* synthetic */ float field006;
    public /* synthetic */ boolean field007;
    public /* synthetic */ float field008;
    public /* synthetic */ boolean field009;
    public static final /* synthetic */ Logger field010;
    public /* synthetic */ float field011;
    public /* synthetic */ float field012;
    public /* synthetic */ float field013;
    public /* synthetic */ float field014;
    public /* synthetic */ float field015;
    public /* synthetic */ float field016;
    public /* synthetic */ float field017;
    public /* synthetic */ float field018;
    public /* synthetic */ boolean field019;
    public final /* synthetic */ SecureClass0583 field020;
    public /* synthetic */ float field021;
    public final /* synthetic */ Queue<Runnable> field022;
    public /* synthetic */ boolean field023;
    public final /* synthetic */ LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs field024;
    public final /* synthetic */ SecureClass0347 field025;
    public final /* synthetic */ lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o field026;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field027;
    public final /* synthetic */ SecureClass1119 field028;
    public /* synthetic */ float field029;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field030;
    public /* synthetic */ float field031;
    public /* synthetic */ float field032;
    public /* synthetic */ float field033;

    public /* synthetic */ SecureClass0700() {
        this.field024 = LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs.oF2EUJ9g35Agp6TDl1V3X9C28qux8NQ0(LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs.P2QWQJ2Nx6BbTWCb6HTsTNJov2V2DUHL);
        this.field027 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field026 = new lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o();
        this.field028 = new SecureClass1119();
        this.field020 = new SecureClass0583();
        this.field030 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field022 = new ConcurrentLinkedQueue<Runnable>();
        this.field025 = new SecureClass0347();
        this.cfr_renamed_69(new qrIaq3RwxFCwWKU5ZXZ8joTkjcYtVIAM(this));
        this.cfr_renamed_69(new Gnr39EjOTVRE0YwBA3lHYt4qHdJbrcub(this));
        this.cfr_renamed_69(new MVOH9WPhPm0RNJ8iCYmyYEoo2QEjRDFY(this));
        this.cfr_renamed_69(new QWXM8ZyfVfh2Jn6hrJpGWHrpQUHCQC78(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new XRPszHK8Ub2ruRwX4BJHhw1fpC6PzgQW(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new GcjRSpKmUAI8eyAlecF89GnExRq1z1th(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new xK2tn5MBqTOiCpJIFI8qS7V8Y4IpvT5S(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new n9BzlriMI0gm1XKITo5SdQcbQdgbliTY(this));
        this.cfr_renamed_69(new ZWikDnDtvWmPc6099UmFNaAfFFdWEokc(this));
        this.cfr_renamed_69(new VSmyt9oU0k5sIB6xVtuu5aJOtN3YZGXS(this, 1));
        this.cfr_renamed_69(new xKLhkyrlGUsy0s9kxgUBs2WuOb520RQK(this));
        this.cfr_renamed_69(new ViuBCJvVau4FOkcUEnFMQky7eyU7C75b(this));
        this.cfr_renamed_69(new NpAHJpGCixQnXglwyTbXq6LTOAq9EePF(this));
        this.cfr_renamed_69(new Ao6akQZOgCwSanF62ZhhJdtqsNixeHgA(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new g96CzaBGiMRHY8QHVoTTQKHat21zBqFT(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new Clq78lUFfrlfEED5Jvdujg2UiVeWfZ0S(this));
        this.cfr_renamed_69(new d5r9qTJ2SzQeolB5i4cSm8Q8H1aYMhfH(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new XDlo46VT8qSN32ETtlCraohg4vyIomGw(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new _5PHTrtQ3XfdTTOKeZEkfxqZ09VaGU6U3(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new tuVlVosF8VuJ610Mb2RXV3KitUIAbacc(this, Integer.MIN_VALUE));
    }

    @NotNull
    public static /* bridge */ /* synthetic */ LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm() {
        return SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().jbJBRBvK3Na5rdi1h4WNK99O8tRtiWJB().field024;
    }

    public static /* bridge */ /* synthetic */ boolean WdIj8jisqpClnExRcTqhuUnV4Pf5gPnh() {
        return SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().jbJBRBvK3Na5rdi1h4WNK99O8tRtiWJB().field003;
    }

    static {
        field010 = LoggerFactory.getLogger(SecureClass0700.class);
    }
}

