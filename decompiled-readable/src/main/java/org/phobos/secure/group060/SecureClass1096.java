/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass1096 {
    public final /* synthetic */ AtomicReference<Object> field001;
    public final /* synthetic */ Object field002;
    public static final /* synthetic */ Logger field003;
    public final /* synthetic */ ExecutorService field004;

    static {
        field003 = LoggerFactory.getLogger(SecureClass1096.class);
    }

    public /* synthetic */ SecureClass1096() {
        this.field002 = new Object[0];
        this.field004 = Executors.newSingleThreadExecutor();
        this.field001 = new AtomicReference<V>();
    }
}

