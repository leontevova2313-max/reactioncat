/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group042;

import java.lang.reflect.Field;
import java.util.Objects;
import net.minecraft.class_310;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group047.K1VGW8O9FqV6eNdM3rHdq9DSXDuZ4hcb;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0744
implements SecureInterface0134 {
    @Nullable
    public static /* bridge */ /* synthetic */ <T> K1VGW8O9FqV6eNdM3rHdq9DSXDuZ4hcb<T> tQzGT3W3pJXrqVJw7qMAalZdtsK3qwjU(Class<? super T> DYMHrafXJfhGG65AoBWVz2giKiHtD3i1, String f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA) {
        MutableObject field001 = new MutableObject();
        for (Field nbvpl3QjKhpp10sez8e6HUcYMipVziJS : class_310.class.getDeclaredFields()) {
            if (!Objects.equals(nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getType(), DYMHrafXJfhGG65AoBWVz2giKiHtD3i1)) continue;
            if (field001.getValue() != null) {
                if (!nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getName().equals(f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA)) continue;
                field001.setValue((Object)nbvpl3QjKhpp10sez8e6HUcYMipVziJS);
                break;
            }
            field001.setValue((Object)nbvpl3QjKhpp10sez8e6HUcYMipVziJS);
            if (nbvpl3QjKhpp10sez8e6HUcYMipVziJS.getName().equals(f9T2NhzxK8Ojx8gEh0H2uJ3mFH86jLmA)) break;
        }
        if (field001.getValue() != null) {
            Field field002 = (Field)field001.getValue();
            return () -> {
                try {
                    return field002.get(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3);
                }
                catch (Throwable MM6FkTSYzHxTEbBy9gQnQpnQdK0ymMKx) {
                    return null;
                }
            };
        }
        return null;
    }

    public /* synthetic */ SecureClass0744() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

