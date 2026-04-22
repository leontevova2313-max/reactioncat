/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group030;

import java.util.concurrent.TimeUnit;

public final class SecureClass0525 {
    public static final /* synthetic */ long field001;

    public /* synthetic */ SecureClass0525() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean CU8m47Esp6YjkCBrVNFV9k0PXmwvXmQB(long CabOYvRvHBvIeRqg1TxGKT58DW5doiHv, long ARoNjckvGmyO8uKQY07uQxZdqoUuIm92, Runnable ... y2o8bErpIrzRpGcpPZkxETFTqqX9l1GP) {
        if (SecureClass0525.ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(CabOYvRvHBvIeRqg1TxGKT58DW5doiHv) < ARoNjckvGmyO8uKQY07uQxZdqoUuIm92) {
            return false;
        }
        Runnable[] runnableArray = y2o8bErpIrzRpGcpPZkxETFTqqX9l1GP;
        int n = runnableArray.length;
        int n2 = 0;
        while (n2 < n) {
            Runnable field002 = runnableArray[n2];
            field002.run();
            ++n2;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean cMu4mng5Ra0Lefr47ePJFYyNWz9W3fy3(long puZqocnntilJqJD6Dfqp84HurezgpSJM, long ZK88OVaTa2z1wjK00Jng49JpXZjf14ry) {
        return SecureClass0525.ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(puZqocnntilJqJD6Dfqp84HurezgpSJM) >= ZK88OVaTa2z1wjK00Jng49JpXZjf14ry;
    }

    public static /* bridge */ /* synthetic */ long ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(long l) {
        return SecureClass0525.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98() - l;
    }

    public static /* bridge */ /* synthetic */ long y68cQJYK5TyzyxMDP3V77ygd8g1LQe98() {
        return System.nanoTime() / field001;
    }

    static {
        field001 = TimeUnit.MILLISECONDS.toNanos(1L);
    }
}

