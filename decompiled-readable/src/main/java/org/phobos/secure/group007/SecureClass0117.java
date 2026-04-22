/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.phobos.secure.group005.gFld8nGUki32nRevMKvEVXNijrsNqXI4;
import org.phobos.secure.group012.SecureClass0181;
import org.phobos.secure.group014.ilZbabGTCtv56eEFirr06z3zihB34c7u;
import org.phobos.secure.group045._6CaM3guN2i6ob8Ux97G6OEa8Fw2VeFUX;
import org.phobos.secure.group050.G6DAWsMRUwFRH4edEO2OOMP4kKgMvuLN;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0117
extends SecureClass0966 {
    public final /* synthetic */ Lock field001;
    public static /* synthetic */ ReentrantLock field002;
    public /* synthetic */ SecureClass0181 field003;
    public final /* synthetic */ AtomicBoolean field004;

    public static /* bridge */ /* synthetic */ void I9I9VM1SX8EsxdmCatDpAvZfYTgitXY0(Lock Fw94htwCY6khAbeIyRmOhEDcegD1J6ye, Runnable QGjICDIqsXv4UeNYRxXcj4gJwvw0FYK1) {
        try {
            Fw94htwCY6khAbeIyRmOhEDcegD1J6ye.lock();
            QGjICDIqsXv4UeNYRxXcj4gJwvw0FYK1.run();
        }
        finally {
            Fw94htwCY6khAbeIyRmOhEDcegD1J6ye.unlock();
        }
    }

    public /* synthetic */ SecureClass0117() {
        this.field004 = new AtomicBoolean(true);
        this.field001 = new ReentrantLock();
        this.cfr_renamed_69(new _6CaM3guN2i6ob8Ux97G6OEa8Fw2VeFUX(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new gFld8nGUki32nRevMKvEVXNijrsNqXI4(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new ilZbabGTCtv56eEFirr06z3zihB34c7u(this));
        this.cfr_renamed_69(new G6DAWsMRUwFRH4edEO2OOMP4kKgMvuLN(this));
    }

    static {
        field002 = new ReentrantLock();
    }
}

