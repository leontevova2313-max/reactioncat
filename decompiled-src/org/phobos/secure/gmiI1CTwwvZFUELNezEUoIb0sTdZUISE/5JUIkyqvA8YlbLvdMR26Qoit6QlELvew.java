/*
 * Decompiled with CFR.
 */
package org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE;

import java.util.concurrent.TimeUnit;

public final class _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew {
    public static final /* synthetic */ long ke1eSbcXVeiwjbAHRl2EzKi8EtST3JHo;

    public /* synthetic */ _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean CU8m47Esp6YjkCBrVNFV9k0PXmwvXmQB(long CabOYvRvHBvIeRqg1TxGKT58DW5doiHv, long ARoNjckvGmyO8uKQY07uQxZdqoUuIm92, Runnable ... y2o8bErpIrzRpGcpPZkxETFTqqX9l1GP) {
        if (_5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(CabOYvRvHBvIeRqg1TxGKT58DW5doiHv) < ARoNjckvGmyO8uKQY07uQxZdqoUuIm92) {
            return false;
        }
        Runnable[] runnableArray = y2o8bErpIrzRpGcpPZkxETFTqqX9l1GP;
        int n = runnableArray.length;
        int n2 = 0;
        while (n2 < n) {
            Runnable sWUz9XID94PDESVCGdckomk5z2HxWWzc = runnableArray[n2];
            sWUz9XID94PDESVCGdckomk5z2HxWWzc.run();
            ++n2;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean cMu4mng5Ra0Lefr47ePJFYyNWz9W3fy3(long puZqocnntilJqJD6Dfqp84HurezgpSJM, long ZK88OVaTa2z1wjK00Jng49JpXZjf14ry) {
        return _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(puZqocnntilJqJD6Dfqp84HurezgpSJM) >= ZK88OVaTa2z1wjK00Jng49JpXZjf14ry;
    }

    public static /* bridge */ /* synthetic */ long ThBdM0j0S2rUs2MEE575qtVPGJrizbkC(long l) {
        return _5JUIkyqvA8YlbLvdMR26Qoit6QlELvew.y68cQJYK5TyzyxMDP3V77ygd8g1LQe98() - l;
    }

    public static /* bridge */ /* synthetic */ long y68cQJYK5TyzyxMDP3V77ygd8g1LQe98() {
        return System.nanoTime() / ke1eSbcXVeiwjbAHRl2EzKi8EtST3JHo;
    }

    static {
        ke1eSbcXVeiwjbAHRl2EzKi8EtST3JHo = TimeUnit.MILLISECONDS.toNanos(1L);
    }
}

