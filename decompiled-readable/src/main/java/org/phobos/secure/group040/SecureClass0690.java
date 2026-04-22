/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import java.util.function.Supplier;
import org.phobos.secure.group027.SecureInterface0073;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SecureClass0690 {
    public static final /* synthetic */ Logger field001;

    public static /* bridge */ /* synthetic */ <T> T GLQR2ZVj5YfReAijjB2gLqdCVHIUhJAM(int Iz4JYQ8ARye0HNSp1NDDjsIjLZ6pdmQD, Supplier<Throwable> supplier, SecureInterface0073<T, ?> fFqKaKNTmgoFKPtzpunDKLvGxRzaztUr) {
        int field002 = 0;
        while (true) {
            if (field002 >= Iz4JYQ8ARye0HNSp1NDDjsIjLZ6pdmQD) {
                throw supplier.get();
            }
            try {
                return fFqKaKNTmgoFKPtzpunDKLvGxRzaztUr.get();
            }
            catch (Exception We1DrBMT2O7HdP42IFEJwlaYmJrTm3Ie) {
                We1DrBMT2O7HdP42IFEJwlaYmJrTm3Ie.printStackTrace();
                ++field002;
                continue;
            }
            break;
        }
    }

    static {
        field001 = LoggerFactory.getLogger(SecureClass0690.class);
    }

    public /* synthetic */ SecureClass0690() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

