/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0123 {
    public final /* synthetic */ AtomicBoolean field001;
    public static final /* synthetic */ Logger field002;
    public final /* synthetic */ Deque<Runnable> field003;
    public final /* synthetic */ AtomicInteger field004;

    static {
        field002 = LoggerFactory.getLogger(SecureClass0123.class);
    }

    public /* synthetic */ SecureClass0123() {
        this.field003 = new ArrayDeque<Runnable>();
        this.field004 = new AtomicInteger();
        this.field001 = new AtomicBoolean();
    }
}

