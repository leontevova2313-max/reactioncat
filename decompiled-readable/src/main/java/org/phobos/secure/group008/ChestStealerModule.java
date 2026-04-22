/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.jFoFexGxsMekMZJdolDt2SkbmXUUx3Jr;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group008.HcvdEv2KzjL6DC5WljQMurOeDjxS8tq7;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.U0MWzMyIyHhvHYoY104H1REopXmYld2k;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.SecureInterface0091;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group040.Nd5ZhLmeJ9WDEFUyLfeXklWfJfjlkDyW;
import org.phobos.secure.group050.SecureInterface0126;
import org.phobos.secure.group052.fILibhiqoP6BR9GoObcMdNksSdMmP6IC;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054._9iTuu37hasK8o90BMSAJIlrwIJ8ydZj3;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ChestStealerModule
extends SecureClass1027
implements SecureInterface0091 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<U0MWzMyIyHhvHYoY104H1REopXmYld2k> mode;
    public final /* synthetic */ SecureClass0603<_9iTuu37hasK8o90BMSAJIlrwIJ8ydZj3> filter;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public final /* synthetic */ SecureClass0603<Boolean> open;
    public final /* synthetic */ SecureClass0603<Boolean> reset;
    public final /* synthetic */ SecureClass0603<Long> timeout;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> delay;
    public final /* synthetic */ SecureClass0603<Nd5ZhLmeJ9WDEFUyLfeXklWfJfjlkDyW> rotateType;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> whitelist;
    public /* synthetic */ long field005;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Boolean> move;
    public final /* synthetic */ Map<class_2338, Long> field006;
    public final /* synthetic */ SecureClass0603<Boolean> normal;

    public /* synthetic */ ChestStealerModule(SecureClass0242 fTCF2v8dP5NKCfV2Y01uqBlumlkK7vzx) {
        super(fTCF2v8dP5NKCfV2Y01uqBlumlkK7vzx, "ChestStealer", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Takes items out of containers", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<U0MWzMyIyHhvHYoY104H1REopXmYld2k>("Mode", U0MWzMyIyHhvHYoY104H1REopXmYld2k.Rage));
        this.open = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Open"));
        this.timeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Timeout", 120000L, 0L, 300000L));
        this.move = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Move"));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 5.0, 0.1, 6.0));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate"));
        this.rotateType = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Nd5ZhLmeJ9WDEFUyLfeXklWfJfjlkDyW>("RotateType", Nd5ZhLmeJ9WDEFUyLfeXklWfJfjlkDyW.Normal));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("Delay", SecureInterface0126.wMAZSEjvEoULCU29BTHtikjbktQ9hg7X(50L, 50L), 0L, 500L, 0L, true));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Close", false));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reset").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Resets delay on container open"));
        this.normal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Normal", true));
        this.filter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_9iTuu37hasK8o90BMSAJIlrwIJ8ydZj3>("Filter", _9iTuu37hasK8o90BMSAJIlrwIJ8ydZj3.None));
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Whitelist", new class_1792[0]).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.filter, _9iTuu37hasK8o90BMSAJIlrwIJ8ydZj3.Single));
        this.field006 = new ConcurrentHashMap<class_2338, Long>();
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.open).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field003, this.rotateType)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.timeout, this.range, this.move).cfr_renamed_195(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new U0MWzMyIyHhvHYoY104H1REopXmYld2k[]{U0MWzMyIyHhvHYoY104H1REopXmYld2k.Rage})).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.cfr_renamed_69(new jFoFexGxsMekMZJdolDt2SkbmXUUx3Jr(this));
        this.cfr_renamed_69(new HcvdEv2KzjL6DC5WljQMurOeDjxS8tq7(this, fTCF2v8dP5NKCfV2Y01uqBlumlkK7vzx));
        this.cfr_renamed_69(new fILibhiqoP6BR9GoObcMdNksSdMmP6IC(this, fTCF2v8dP5NKCfV2Y01uqBlumlkK7vzx));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field006::clear);
    }
}

