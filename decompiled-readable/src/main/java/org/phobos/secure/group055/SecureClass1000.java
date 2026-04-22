/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group022.SecureClass0357;

public final class SecureClass1000 {
    public /* synthetic */ SecureClass1000() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Nullable
    public static /* bridge */ /* synthetic */ Long Uci9FOisvfVptdadU0IA3KxoBOLH6J6v(String PkPDOkZZRcYixZboPggtqmxgYRInGtEd) {
        try {
            if (!PkPDOkZZRcYixZboPggtqmxgYRInGtEd.endsWith("s")) {
                return Integer.parseInt(PkPDOkZZRcYixZboPggtqmxgYRInGtEd);
            }
            String field001 = PkPDOkZZRcYixZboPggtqmxgYRInGtEd.substring(0, PkPDOkZZRcYixZboPggtqmxgYRInGtEd.length() - 1);
            if (!SecureClass0357.KeKp0f2xLCnENOBxISo6JKZZPAO8BsYD(field001)) {
                throw new IllegalStateException("Invalid time format");
            }
            int field002 = Integer.parseInt(field001);
            return (long)field002 * 1000L;
        }
        catch (Throwable TF4xy7yla18qEXKmdLnxTYayeSfc6k5X) {
            return null;
        }
    }
}

