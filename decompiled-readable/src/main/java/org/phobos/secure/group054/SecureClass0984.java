/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SecureClass0984 {
    public final /* synthetic */ Map<String, Class<?>> field001;
    public static final /* synthetic */ SecureClass0984 field002;
    public final /* synthetic */ Map<Class<?>, String> field003;

    public /* synthetic */ SecureClass0984() {
        this.field003 = new ConcurrentHashMap<Class<?>, String>();
        this.field001 = new ConcurrentHashMap<String, Class<?>>();
    }

    static {
        field002 = new SecureClass0984();
    }
}

