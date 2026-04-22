/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.nKTCbLmrWWRtrdJcTMij2YpoJmsjldmN;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group040.pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr;
import org.phobos.secure.group043._2pMBfwO1AbaEp51WDIw5r8JQxC2mXpEW;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.SecureInterface0130;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ElytraFlyModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> use;
    public final /* synthetic */ SecureClass0603<Boolean> stand;
    public final /* synthetic */ SecureClass0603<Integer> top;
    public final /* synthetic */ SecureClass0603<Boolean> infinite;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> useSilent;
    public final /* synthetic */ SecureClass0603<Float> field001;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public final /* synthetic */ SecureClass0603<Double> multiplier;
    public final /* synthetic */ SecureClass0603<Float> exploitPitch;
    public final /* synthetic */ SecureClass0603<Boolean> look;
    public final /* synthetic */ SecureClass0603<Boolean> modifiesJumpHeight;
    public final /* synthetic */ SecureClass0603<Boolean> static;
    public final /* synthetic */ SecureClass0603<Boolean> limit;
    public final /* synthetic */ SecureClass0603<Boolean> vertical;
    public final /* synthetic */ SecureClass0603<Float> max;
    public final /* synthetic */ SecureClass0603<Float> accelerationFactor;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static /* synthetic */ ElytraFlyModule field003;
    public final /* synthetic */ SecureClass0603<Boolean> control;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> field004;
    public final /* synthetic */ SecureClass0603<pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr> mode;
    public final /* synthetic */ SecureClass0603<Double> field005;
    public final /* synthetic */ SecureClass0603<nKTCbLmrWWRtrdJcTMij2YpoJmsjldmN> field006;
    public final /* synthetic */ SecureClass0603<Boolean> switch;
    public final /* synthetic */ SecureClass0603<Boolean> exploitCancel;
    public final /* synthetic */ SecureClass0603<Boolean> exploit;
    public final /* synthetic */ SecureClass0603<Boolean> acceleration;
    public final /* synthetic */ SecureClass0603<_2pMBfwO1AbaEp51WDIw5r8JQxC2mXpEW> strict;

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_17() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ElytraFlyModule.field003.mode.getValue().equals(pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Bounce);
    }

    public static /* bridge */ /* synthetic */ boolean jbG8W28gzU0kdCliisouEPslb6LfD66m() {
        if (ElytraFlyModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return false;
        }
        return field003.xpqElSFFuUuUPpQqwCsppwghHIZUVANH(ElytraFlyModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724);
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_11() {
        return field003 != null && field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ElytraFlyModule.field003.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Shift) && ElytraFlyModule.field003.control.getValue() != false;
    }

    public /* synthetic */ ElytraFlyModule(SecureClass0242 Yqqe7SbRRR2V3K3XIzCugiWsgbXdoXXr) {
        super(Yqqe7SbRRR2V3K3XIzCugiWsgbXdoXXr, "ElytraFly", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Modifies the way you travel on an elytra", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr>("Mode", pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Normal));
        this.limit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Limit", false));
        this.max = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Max", Float.valueOf(2.5f), Float.valueOf(0.1f), Float.valueOf(20.0f)));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(1.5f), Float.valueOf(0.1f), Float.valueOf(20.0f)).cfr_renamed_369().cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr[]{pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Boost, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Normal})));
        this.top = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Top", 200, 50, 360).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Infinite));
        this.infinite = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Infinite").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Packet));
        this.strict = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_2pMBfwO1AbaEp51WDIw5r8JQxC2mXpEW>("Strict", _2pMBfwO1AbaEp51WDIw5r8JQxC2mXpEW.None).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (_2pMBfwO1AbaEp51WDIw5r8JQxC2mXpEW)((Object)pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Packet)));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Bounce));
        this.stand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Stand").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Bounce));
        this.multiplier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Multiplier", 104.0, Double.valueOf(10.0), Double.valueOf(500.0), "%").cfr_renamed_85("Grim", 104.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Firework));
        this.use = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Use").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses fireworks"));
        this.useSilent = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("UseSilent", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Normal));
        this.exploit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Exploit"));
        this.exploitPitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("ExploitPitch", Float.valueOf(35.0f), Float.valueOf(0.0f), Float.valueOf(90.0f)));
        this.exploitCancel = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ExploitCancel"));
        this.look = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Look").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Firework).dgRfo3eJqbUqE6YkSLHzP6agKtrqtz78(SecureInterface0130.c4AVgld5xgJgxldpK7dS10pxC4bNWjpg(this.exploit).NQ9Y015SxGuHb8jIEwlLOkbSuiNVkMq0(), true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Look in the boost direction"));
        this.static = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Static").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Firework).dgRfo3eJqbUqE6YkSLHzP6agKtrqtz78(SecureInterface0130.c4AVgld5xgJgxldpK7dS10pxC4bNWjpg(this.exploit).NQ9Y015SxGuHb8jIEwlLOkbSuiNVkMq0(), true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Makes you not move if you aren't pressing movement keys"));
        this.modifiesJumpHeight = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("0-Tick").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Modifies jump height"));
        this.switch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("0-TickAccelerate"));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<nKTCbLmrWWRtrdJcTMij2YpoJmsjldmN>("0-TickMode", nKTCbLmrWWRtrdJcTMij2YpoJmsjldmN.Jump));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("0-TickStart", 40.0, 10.0, 100.0));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("Switch", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Normal).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6)((Object)pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Shift)));
        this.control = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Control").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Disables firework boost").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Shift));
        this.acceleration = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Acceleration"));
        this.accelerationFactor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("AccelerationFactor", Float.valueOf(9.0f), Float.valueOf(0.0f), Float.valueOf(100.0f)));
        this.vertical = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Vertical", true));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("VerticalSpeed", Float.valueOf(0.47f), Float.valueOf(0.0f), Float.valueOf(2.0f)));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.limit, this.max).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Boost);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.acceleration, this.accelerationFactor).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Packet);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.vertical, this.field001).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr[]{pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Packet, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Normal}));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.modifiesJumpHeight, this.switch, this.field006, this.field005).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Bounce);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.use, this.useSilent).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Firework);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.exploit, this.exploitPitch, this.exploitCancel).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.Firework);
        pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr[] field007 = pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr.values();
        int n = field007.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.mode.D7UPnsW8x2nvxmsqGDm08nmKK9mcb74e((pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr2, DecJ5QaZtO0Ov1cYkAKHvWBNVVVkqhag) -> {
                    if (this.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
                        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().cfr_renamed_370(pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr2);
                        pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr2.f81hlCNVGwuzSqMN5inLdOpROoWfSU5A();
                        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().vX7WzZjJYXQQ11WCdpLxvgQDfOs7XfUw(DecJ5QaZtO0Ov1cYkAKHvWBNVVVkqhag);
                        DecJ5QaZtO0Ov1cYkAKHvWBNVVVkqhag.NUINiKnTozM2pXMf8LS3T0ZfON8TJgHi();
                    }
                });
                field003 = this;
                return;
            }
            pMXMDpKNmcA0MBoJJ4oWRej7VoSDX2jr field008 = field007[n2];
            field008.init(Yqqe7SbRRR2V3K3XIzCugiWsgbXdoXXr, this);
            ++n2;
        }
    }
}

