/*
 * Decompiled with CFR.
 */
package io.netty.util.internal;

import io.netty.util.internal.PlatformDependent;

public final class ClassInitializerUtil {
    private ClassInitializerUtil() {
    }

    public static void tryLoadClasses(Class<?> loadingClass, Class<?> ... classes) {
        ClassLoader loader = PlatformDependent.getClassLoader(loadingClass);
        Class<?>[] classArray = classes;
        int n = classArray.length;
        int n2 = 0;
        while (n2 < n) {
            Class<?> clazz = classArray[n2];
            ClassInitializerUtil.tryLoadClass(loader, clazz.getName());
            ++n2;
        }
        return;
    }

    private static void tryLoadClass(ClassLoader classLoader, String className) {
        try {
            Class.forName(className, true, classLoader);
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
    }
}

