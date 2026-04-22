/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group041.SecureInterface0103;

public class SecureClass1152
implements SecureInterface0103 {
    public final /* synthetic */ MutableObject<String> field001;
    public final /* synthetic */ MutableObject<String> field002;

    public static /* bridge */ /* synthetic */ String fODE3ageO1ugfBMFpZcsyiC4zhG4FnEg(String field003, String BWhGGykdoSqsAzWkNaVtg5R3SJMHcIVP) {
        if (field003.length() < BWhGGykdoSqsAzWkNaVtg5R3SJMHcIVP.length()) {
            return field003.concat(BWhGGykdoSqsAzWkNaVtg5R3SJMHcIVP.substring(field003.length()));
        }
        return field003;
    }

    public /* synthetic */ SecureClass1152() {
        this.field001 = new MutableObject();
        this.field002 = new MutableObject();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <T> T kSgrXAmbCJwIshD6CBXSZZSOwiQ0JxyF(String string, Collection<T> RGuMkswdqsSUpY82PZbt9SJYhVhxmSib, Function<T, String> g8cPgy6gDBON6mIavgUUt0Tgl1SPfS8W, Predicate<T> P5qcOujYSSAreU2CgwqKF25mCAC5UYBn) {
        T field004;
        Iterator<T> iterator = RGuMkswdqsSUpY82PZbt9SJYhVhxmSib.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!g8cPgy6gDBON6mIavgUUt0Tgl1SPfS8W.apply(field004 = iterator.next()).startsWith(string) || !P5qcOujYSSAreU2CgwqKF25mCAC5UYBn.test(field004));
        return field004;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ String miIzkntHJk5hnP5lmvnjuYTHnyQfjVON(String ES35epDIzWzx47za08Z9YpWQl6Ljt0SW, Collection<String> ptrkBWJv96zd4IRVjCWuODMiQiD2YcRl) {
        String field005;
        Iterator<String> iterator = ptrkBWJv96zd4IRVjCWuODMiQiD2YcRl.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field005 = iterator.next()).toLowerCase().startsWith(ES35epDIzWzx47za08Z9YpWQl6Ljt0SW));
        return field005;
    }
}

