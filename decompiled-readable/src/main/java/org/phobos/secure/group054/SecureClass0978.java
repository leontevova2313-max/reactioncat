/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import org.phobos.secure.group029.SecureClass0501;
import org.phobos.secure.group030.SecureClass0525;
import org.phobos.secure.group054.SecureClass0982;

public final class SecureClass0978 {
    public static final /* synthetic */ Map<String, Long> field001;
    public static final /* synthetic */ Thread field002;
    public static final /* synthetic */ Map<SecureClass0982, Long> field003;

    public static /* bridge */ /* synthetic */ void nkqNFrhPChbRCXdtOBY9p0HzZ2JhOXP6(String mfcmAeKpgxPO5WvizsWehnKelBomCS1v) {
        Long field004 = field001.remove(mfcmAeKpgxPO5WvizsWehnKelBomCS1v);
        if (field004 == null) {
            return;
        }
        long field005 = SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98();
        field003.put(new SecureClass0982(mfcmAeKpgxPO5WvizsWehnKelBomCS1v, field005 - field004), field005);
    }

    public static /* bridge */ /* synthetic */ void hDFaY1DJswAtfHW8kL92xGpm928P4Hgl() {
        Iterator<Map.Entry<SecureClass0982, Long>> iterator = field003.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<SecureClass0982, Long> field006 = iterator.next();
            SecureClass0982 field007 = field006.getKey();
            if (field006.getValue() + 1000L < SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98()) {
                field003.remove(field007);
                continue;
            }
            if (field007.K6Aacd15iiTIExciWUGQiKXd9jYKBuND() <= 2000L) continue;
            SecureClass0501.QLtfRiJkwuxQbPZtsww0NgFrMhEJBYf0("Profiler", "Task %s executed in %s (If you are seeing this, this means some kind of overload has happened, please report to the developers)".formatted(field007.name(), field007.K6Aacd15iiTIExciWUGQiKXd9jYKBuND()));
        }
        return;
    }

    public /* synthetic */ SecureClass0978() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void kJffY0XYARAocXB2rhPkeBk8YwFKPvuy(String K1a5WQ8wvZjIfrLMusug50xVOnSnxOME) {
        field001.put(K1a5WQ8wvZjIfrLMusug50xVOnSnxOME, SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98());
    }

    static {
        field001 = new ConcurrentHashMap<String, Long>();
        field003 = new ConcurrentHashMap<SecureClass0982, Long>();
        field002 = new Thread(() -> {
            try {
                SecureClass0978.hDFaY1DJswAtfHW8kL92xGpm928P4Hgl();
                Thread.sleep(150L);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        });
        field002.start();
    }

    public static /* bridge */ /* synthetic */ Stream<SecureClass0982> stream() {
        return field003.keySet().stream();
    }
}

