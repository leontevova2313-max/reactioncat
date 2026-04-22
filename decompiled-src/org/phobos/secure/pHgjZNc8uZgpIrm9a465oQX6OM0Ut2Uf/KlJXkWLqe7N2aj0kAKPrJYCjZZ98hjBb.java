/*
 * Decompiled with CFR.
 */
package org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.phobos.secure.SFDLLxag6BrgT2xFaaiwM4KXMC6N6SbP.CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl;

public final class KlJXkWLqe7N2aj0kAKPrJYCjZZ98hjBb {
    public static /* bridge */ /* synthetic */ <T> CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl<T> AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(Class<?> d2KpAEae7zkYfr9UonV5BdS8w6jJIARe) {
        ParameterizedType CShNAC11PYDaPhWA7wKnI0I6ZO82SARz;
        Type[] typeArray;
        int n;
        int n2;
        Type xgLIm6xQu70nKNzRCqU6rKfDwoBFunlz = d2KpAEae7zkYfr9UonV5BdS8w6jJIARe.getGenericSuperclass();
        if (xgLIm6xQu70nKNzRCqU6rKfDwoBFunlz instanceof ParameterizedType && (n2 = 0) < (n = (typeArray = (CShNAC11PYDaPhWA7wKnI0I6ZO82SARz = (ParameterizedType)xgLIm6xQu70nKNzRCqU6rKfDwoBFunlz).getActualTypeArguments()).length)) {
            Type z0lKYurKQI2s9W0fuxQq2Ah5KBRhq0se = typeArray[n2];
            if (z0lKYurKQI2s9W0fuxQq2Ah5KBRhq0se instanceof ParameterizedType) {
                ParameterizedType CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S = (ParameterizedType)z0lKYurKQI2s9W0fuxQq2Ah5KBRhq0se;
                if (!(CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S.getRawType() instanceof Class)) {
                    throw new RuntimeException();
                }
                int n3 = 0;
                Type[] typeArray2 = CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S.getActualTypeArguments();
                int n4 = typeArray2.length;
                if (n3 < n4) {
                    ParameterizedType qHjIioWRA6Bm1bYKjQ57RTWbd42qfvtZ;
                    Type fg8dxxQ798p44ELnuQ1HLup7f5LhcQ1g = typeArray2[n3];
                    if (fg8dxxQ798p44ELnuQ1HLup7f5LhcQ1g instanceof ParameterizedType && (qHjIioWRA6Bm1bYKjQ57RTWbd42qfvtZ = (ParameterizedType)fg8dxxQ798p44ELnuQ1HLup7f5LhcQ1g).getRawType() instanceof Class) {
                        return new CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl<T>((Class)CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S.getRawType(), (Class)qHjIioWRA6Bm1bYKjQ57RTWbd42qfvtZ.getRawType());
                    }
                    if (fg8dxxQ798p44ELnuQ1HLup7f5LhcQ1g instanceof Class) {
                        return new CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl<T>((Class)CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S.getRawType(), (Class)fg8dxxQ798p44ELnuQ1HLup7f5LhcQ1g);
                    }
                }
                return new CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl<T>((Class)CkwFis7XNUNq1RkExLeWkFHH8WHVlf5S.getRawType(), null);
            }
            if (z0lKYurKQI2s9W0fuxQq2Ah5KBRhq0se instanceof Class) {
                return new CXJbRRJxFBj9AwDaCjmamtzEOMaFpMtl<T>((Class)z0lKYurKQI2s9W0fuxQq2Ah5KBRhq0se, null);
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public /* synthetic */ KlJXkWLqe7N2aj0kAKPrJYCjZZ98hjBb() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

