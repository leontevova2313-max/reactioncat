/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group033;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group009.SecureClass0144;
import org.phobos.secure.group016.SecureInterface0039;
import org.phobos.secure.group054.SecureInterface0134;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0592
implements SecureInterface0134,
Iterable<SecureInterface0039> {
    public final /* synthetic */ Map<Class<?>, List<SecureClass0144>> field001;
    public static final /* synthetic */ Logger field002;
    public volatile /* synthetic */ boolean field003;
    public final /* synthetic */ Set<SecureInterface0039> field004;

    static {
        field002 = LoggerFactory.getLogger(SecureClass0592.class);
    }

    public /* synthetic */ SecureClass0592() {
        this.field003 = false;
        this.field001 = new ConcurrentHashMap<Class<?>, List<SecureClass0144>>();
        this.field004 = ConcurrentHashMap.newKeySet();
    }
}

