/*
 * Decompiled with CFR.
 */
package org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E._8TXtaQebpH3JeJQ6x4InRyjCqIBNwu4y;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE._5JUIkyqvA8YlbLvdMR26Qoit6QlELvew;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl;

public final class fDA2HgapkfUc1OVPDgKi6G9j8bRiDRLT {
    public static final /* synthetic */ Map<String, Long> EqTfaBiggTyfV7vpCOpStoI7jbIL4yMq;
    public static final /* synthetic */ Thread eBeEwTtij3IFtmISfQ0zhU0yovyzM5lH;
    public static final /* synthetic */ Map<MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl, Long> YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb;

    public static /* bridge */ /* synthetic */ void nkqNFrhPChbRCXdtOBY9p0HzZ2JhOXP6(String mfcmAeKpgxPO5WvizsWehnKelBomCS1v) {
        Long QcglqorQmcpBPpeWQocE7JHbeRJlW28r = EqTfaBiggTyfV7vpCOpStoI7jbIL4yMq.remove(mfcmAeKpgxPO5WvizsWehnKelBomCS1v);
        if (QcglqorQmcpBPpeWQocE7JHbeRJlW28r == null) {
            return;
        }
        long nLkhBcQx3hpARN4aCAMqkOaBdexZueSP = _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98();
        YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb.put(new MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl(mfcmAeKpgxPO5WvizsWehnKelBomCS1v, nLkhBcQx3hpARN4aCAMqkOaBdexZueSP - QcglqorQmcpBPpeWQocE7JHbeRJlW28r), nLkhBcQx3hpARN4aCAMqkOaBdexZueSP);
    }

    public static /* bridge */ /* synthetic */ void hDFaY1DJswAtfHW8kL92xGpm928P4Hgl() {
        Iterator<Map.Entry<MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl, Long>> iterator = YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl, Long> CJSVG20DLRe9MKoeVZKiPFSo60R6081c = iterator.next();
            MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl O59qqmcWm9yoW11rRcRKL0AK7aiJ0h38 = CJSVG20DLRe9MKoeVZKiPFSo60R6081c.getKey();
            if (CJSVG20DLRe9MKoeVZKiPFSo60R6081c.getValue() + 1000L < _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98()) {
                YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb.remove(O59qqmcWm9yoW11rRcRKL0AK7aiJ0h38);
                continue;
            }
            if (O59qqmcWm9yoW11rRcRKL0AK7aiJ0h38.K6Aacd15iiTIExciWUGQiKXd9jYKBuND() <= 2000L) continue;
            _8TXtaQebpH3JeJQ6x4InRyjCqIBNwu4y.QLtfRiJkwuxQbPZtsww0NgFrMhEJBYf0("Profiler", "Task %s executed in %s (If you are seeing this, this means some kind of overload has happened, please report to the developers)".formatted(O59qqmcWm9yoW11rRcRKL0AK7aiJ0h38.name(), O59qqmcWm9yoW11rRcRKL0AK7aiJ0h38.K6Aacd15iiTIExciWUGQiKXd9jYKBuND()));
        }
        return;
    }

    public /* synthetic */ fDA2HgapkfUc1OVPDgKi6G9j8bRiDRLT() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void kJffY0XYARAocXB2rhPkeBk8YwFKPvuy(String K1a5WQ8wvZjIfrLMusug50xVOnSnxOME) {
        EqTfaBiggTyfV7vpCOpStoI7jbIL4yMq.put(K1a5WQ8wvZjIfrLMusug50xVOnSnxOME, _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98());
    }

    static {
        EqTfaBiggTyfV7vpCOpStoI7jbIL4yMq = new ConcurrentHashMap<String, Long>();
        YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb = new ConcurrentHashMap<MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl, Long>();
        eBeEwTtij3IFtmISfQ0zhU0yovyzM5lH = new Thread(() -> {
            try {
                fDA2HgapkfUc1OVPDgKi6G9j8bRiDRLT.hDFaY1DJswAtfHW8kL92xGpm928P4Hgl();
                Thread.sleep(150L);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        });
        eBeEwTtij3IFtmISfQ0zhU0yovyzM5lH.start();
    }

    public static /* bridge */ /* synthetic */ Stream<MEq0HGoHpAjuUKrQqCU4QmmTrn7iJ5Hl> stream() {
        return YvwNJ6K0WKr0r7FmmTApI0SLY6kxsSPb.keySet().stream();
    }
}

