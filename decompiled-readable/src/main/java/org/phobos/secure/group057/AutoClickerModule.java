/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import java.util.Map;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8;
import org.phobos.secure.group033._3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.BKYImc7OOICYlcgAWWCSuDkUNIq592F1;
import org.phobos.secure.group061.SecureClass1111;
import org.phobos.secure.group022.ytXY1mh6yRT1D1NnBV5o24xvAp0VVaSW;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class AutoClickerModule
extends SecureClass1027 {
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ MutableObject<ytXY1mh6yRT1D1NnBV5o24xvAp0VVaSW> field002;
    public final /* synthetic */ SecureClass0603<Integer> size;
    public /* synthetic */ long field003;
    public final /* synthetic */ SecureClass0603<Map<_3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW, Boolean>> disablers;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Map<BKYImc7OOICYlcgAWWCSuDkUNIq592F1, Boolean>> keys;
    public final /* synthetic */ SecureClass0603<Integer> offset;
    public final /* synthetic */ SecureClass0603<Long> spread;
    public final /* synthetic */ SecureClass0603<iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8> field004;
    public final /* synthetic */ SecureClass0603<Integer> field005;

    public /* synthetic */ AutoClickerModule(SecureClass0242 QZHrcS7EWsT6lYfQNm24uzPPtxU1w7ln) {
        super(QZHrcS7EWsT6lYfQNm24uzPPtxU1w7ln, "AutoClicker", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Clicks for you", new int[0]);
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8>("Pattern", iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Random));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 10000L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Working delay"));
        this.spread = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Spread", 100L, 1L, 500L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Random: delay + random(-spread, spread), Burst: Delay between steps").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field004, new iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8[]{iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Random, iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Burst})));
        this.size = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Size", 4, 2, 10).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Burst pattern size").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.field004, iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Burst));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Random", 1, 1, 5).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Burst pattern size formula: size + random(-random, random)").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.field004, iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Burst));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Offset", 10, 1, 40).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("For random value, formula: random(spread - offset, spread + offset)").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.field004, iK9xhO8Co2JAcj0RAmz82AHvTeGHC1p8.Burst));
        this.keys = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<BKYImc7OOICYlcgAWWCSuDkUNIq592F1>("Keys", BKYImc7OOICYlcgAWWCSuDkUNIq592F1.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(jAm17Lt51rKC7BwbAoKLW11wn2eigJHb -> {
            BKYImc7OOICYlcgAWWCSuDkUNIq592F1[] field006 = BKYImc7OOICYlcgAWWCSuDkUNIq592F1.values();
            int n = field006.length;
            int n2 = 0;
            while (n2 < n) {
                BKYImc7OOICYlcgAWWCSuDkUNIq592F1 field007 = field006[n2];
                jAm17Lt51rKC7BwbAoKLW11wn2eigJHb.n1W8XPBYJrDzssWYPABQFTJ1vXyEatgH(field007, field007.name());
                ++n2;
            }
            return;
        }));
        this.disablers = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<_3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW>("Disablers", _3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(PlfyG8xH7ycoP7XgSoY53T3hAVYeI8y2 -> {
            _3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW[] field008 = _3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW.values();
            int n = field008.length;
            int n2 = 0;
            while (n2 < n) {
                _3zBkVnZWi9J9rZTjEJjQ6ijCupPsxwFW field009 = field008[n2];
                PlfyG8xH7ycoP7XgSoY53T3hAVYeI8y2.n1W8XPBYJrDzssWYPABQFTJ1vXyEatgH(field009, field009.name());
                ++n2;
            }
            return;
        }));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field002 = new MutableObject();
        this.field003 = -1L;
        this.cfr_renamed_69(new SecureClass1111(this));
    }
}

