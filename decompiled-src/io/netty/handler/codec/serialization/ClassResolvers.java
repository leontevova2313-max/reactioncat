/*
 * Decompiled with CFR.
 */
package io.netty.handler.codec.serialization;

import io.netty.handler.codec.serialization.CachingClassResolver;
import io.netty.handler.codec.serialization.ClassLoaderClassResolver;
import io.netty.handler.codec.serialization.ClassResolver;
import io.netty.handler.codec.serialization.SoftReferenceMap;
import io.netty.handler.codec.serialization.WeakReferenceMap;
import io.netty.util.internal.PlatformDependent;
import java.util.HashMap;

@Deprecated
public final class ClassResolvers {
    public static ClassResolver cacheDisabled(ClassLoader classLoader) {
        return new ClassLoaderClassResolver(ClassResolvers.defaultClassLoader(classLoader));
    }

    public static ClassResolver weakCachingResolver(ClassLoader classLoader) {
        return new CachingClassResolver(new ClassLoaderClassResolver(ClassResolvers.defaultClassLoader(classLoader)), new WeakReferenceMap<String, Class<?>>(new HashMap<K, V>()));
    }

    public static ClassResolver softCachingResolver(ClassLoader classLoader) {
        return new CachingClassResolver(new ClassLoaderClassResolver(ClassResolvers.defaultClassLoader(classLoader)), new SoftReferenceMap<String, Class<?>>(new HashMap<K, V>()));
    }

    public static ClassResolver weakCachingConcurrentResolver(ClassLoader classLoader) {
        return new CachingClassResolver(new ClassLoaderClassResolver(ClassResolvers.defaultClassLoader(classLoader)), new WeakReferenceMap<String, Class<?>>(PlatformDependent.<K, V>newConcurrentHashMap()));
    }

    public static ClassResolver softCachingConcurrentResolver(ClassLoader classLoader) {
        return new CachingClassResolver(new ClassLoaderClassResolver(ClassResolvers.defaultClassLoader(classLoader)), new SoftReferenceMap<String, Class<?>>(PlatformDependent.<K, V>newConcurrentHashMap()));
    }

    static ClassLoader defaultClassLoader(ClassLoader classLoader) {
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader contextClassLoader = PlatformDependent.getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        return PlatformDependent.getClassLoader(ClassResolvers.class);
    }

    private ClassResolvers() {
    }
}

