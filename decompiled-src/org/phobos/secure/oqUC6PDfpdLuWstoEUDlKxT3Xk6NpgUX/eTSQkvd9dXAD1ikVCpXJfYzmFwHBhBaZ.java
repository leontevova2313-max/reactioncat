/*
 * Decompiled with CFR.
 */
package org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX;

import java.lang.reflect.Field;
import java.util.Objects;
import net.minecraft.class_310;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.K1VGW8O9FqV6eNdM3rHdq9DSXDuZ4hcb;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;

public final class eTSQkvd9dXAD1ikVCpXJfYzmFwHBhBaZ
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    @Nullable
    public static /* bridge */ /* synthetic */ <T> K1VGW8O9FqV6eNdM3rHdq9DSXDuZ4hcb<T> tQzGT3W3pJXrqVJw7qMAalZdtsK3qwjU(Class<? super T> DYMHrafXJfhGG65AoBWVz2giKiHtD3i1, String f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA) {
        MutableObject Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG = new MutableObject();
        for (Field nbvpl3QjKhpp10sez8e6HUcYMipVziJS : class_310.class.getDeclaredFields()) {
            if (!Objects.equals(nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getType(), DYMHrafXJfhGG65AoBWVz2giKiHtD3i1)) continue;
            if (Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG.getValue() != null) {
                if (!nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getName().equals(f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA)) continue;
                Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG.setValue((Object)nbvpl3QjKhpp10sez8e6HUcYMipVziJS);
                break;
            }
            Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG.setValue((Object)nbvpl3QjKhpp10sez8e6HUcYMipVziJS);
            if (nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getName().equals(f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA)) break;
        }
        if (Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG.getValue() != null) {
            Field Mg0S4xMsyOF6e92rFbyiifhehHRPGt2r = (Field)Eigmt7ff6JTz1mN6aiP4Di0D9AS268rG.getValue();
            return () -> {
                try {
                    return Mg0S4xMsyOF6e92rFbyiifhehHRPGt2r.get(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3);
                }
                catch (Throwable MM6FkTSYzHxTEbBy9gQnQpnQdK0ymMKx) {
                    return null;
                }
            };
        }
        return null;
    }

    public /* synthetic */ eTSQkvd9dXAD1ikVCpXJfYzmFwHBhBaZ() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

