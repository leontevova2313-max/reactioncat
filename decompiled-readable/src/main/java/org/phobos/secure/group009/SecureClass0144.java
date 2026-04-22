/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import org.phobos.secure.group004.SecureInterface0007;
import org.phobos.secure.group051.SecureClass0918;
import org.phobos.secure.group045.SecureClass0799;

public abstract class SecureClass0144<E>
implements Comparable<SecureClass0144<E>>,
SecureInterface0007<E> {
    public final /* synthetic */ Class<?> field001;
    public /* synthetic */ Runnable field002;
    public final /* synthetic */ Class<? super E> field003;
    public static final /* synthetic */ int field004 = 10;
    public final /* synthetic */ int field005;

    public /* synthetic */ SecureClass0144(Class<?> wAkxf0ydgD2O72E6cLciYbM5G3UGAsy1, int n) {
        this.field001 = SecureClass0799.AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(this.getClass()).MthUzsLswIO7w19b4fOh0K8CIe7giYip();
        this.field005 = n;
        this.field003 = wAkxf0ydgD2O72E6cLciYbM5G3UGAsy1;
    }

    public /* synthetic */ SecureClass0144(Class<? super E> O8hqynldbpuloI5v5BmbL5ZSjeRRcVym, Class<?> zdxWYKk4xzMQPrYiLQHdO0ER4hJI9jDg, int ZrIr6Sf46ytJZoCAJJRop2yoJTnezgIy) {
        this.field003 = O8hqynldbpuloI5v5BmbL5ZSjeRRcVym;
        this.field001 = zdxWYKk4xzMQPrYiLQHdO0ER4hJI9jDg;
        this.field005 = ZrIr6Sf46ytJZoCAJJRop2yoJTnezgIy;
    }

    public /* synthetic */ SecureClass0144(int zzsyXxu2tqXbE7zWnLW1GPkzwytGP4ri) {
        SecureClass0918<T> field006 = SecureClass0799.AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(this.getClass());
        this.field003 = field006.MthUzsLswIO7w19b4fOh0K8CIe7giYip();
        this.field001 = field006.cfr_renamed_162();
        this.field005 = zzsyXxu2tqXbE7zWnLW1GPkzwytGP4ri;
    }

    public /* synthetic */ SecureClass0144() {
        SecureClass0918<T> field007 = SecureClass0799.AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(this.getClass());
        this.field003 = field007.MthUzsLswIO7w19b4fOh0K8CIe7giYip();
        this.field001 = field007.cfr_renamed_162();
        this.field005 = 10;
    }

    public /* synthetic */ SecureClass0144(Class<E> clazz) {
        this.field003 = clazz;
        this.field001 = null;
        this.field005 = 10;
    }
}

