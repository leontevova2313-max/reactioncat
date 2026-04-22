/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group045;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.phobos.secure.group051.SecureClass0918;

public final class SecureClass0799 {
    public static /* bridge */ /* synthetic */ <T> SecureClass0918<T> AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(Class<?> d2KpAEae7zkYfr9UonV5BdS8w6jJIARe) {
        ParameterizedType field001;
        Type[] typeArray;
        int n;
        int n2;
        Type field002 = d2KpAEae7zkYfr9UonV5BdS8w6jJIARe.getGenericSuperclass();
        if (field002 instanceof ParameterizedType && (n2 = 0) < (n = (typeArray = (field001 = (ParameterizedType)field002).getActualTypeArguments()).length)) {
            Type field003 = typeArray[n2];
            if (field003 instanceof ParameterizedType) {
                ParameterizedType field004 = (ParameterizedType)field003;
                if (!(field004.getRawType() instanceof Class)) {
                    throw new RuntimeException();
                }
                int n3 = 0;
                Type[] typeArray2 = field004.getActualTypeArguments();
                int n4 = typeArray2.length;
                if (n3 < n4) {
                    ParameterizedType field005;
                    Type field006 = typeArray2[n3];
                    if (field006 instanceof ParameterizedType && (field005 = (ParameterizedType)field006).getRawType() instanceof Class) {
                        return new SecureClass0918<T>((Class)field004.getRawType(), (Class)field005.getRawType());
                    }
                    if (field006 instanceof Class) {
                        return new SecureClass0918<T>((Class)field004.getRawType(), (Class)field006);
                    }
                }
                return new SecureClass0918<T>((Class)field004.getRawType(), null);
            }
            if (field003 instanceof Class) {
                return new SecureClass0918<T>((Class)field003, null);
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public /* synthetic */ SecureClass0799() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

