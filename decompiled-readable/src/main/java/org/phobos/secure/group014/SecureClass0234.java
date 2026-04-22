/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import java.util.List;
import java.util.function.Function;
import net.minecraft.class_2596;
import org.phobos.secure.group034.QtJL3nvotFcpGZktZW8qgApjWGz5foLa;
import org.phobos.secure.group055.Ep687fbv1XiKq2LcWmqD0bt4KhcaDePg;
import org.phobos.secure.group045.SecureClass0799;
import org.phobos.secure.group044.EUOIYnZlODSHU4Bam8oau1LF2LacvSKZ;
import org.phobos.secure.group053.tAIaycqy4oaiEdelBjRMjKJJfUZmCoPU;
import org.phobos.secure.group053.SecureClass0966;

public abstract class SecureClass0234<P extends class_2596<?>>
extends SecureClass0966 {
    public final /* synthetic */ ThreadLocal<class_2596<?>> field001;
    public final /* synthetic */ ThreadLocal<List<Runnable>> field002;

    public /* synthetic */ SecureClass0234(Function<Class<?>, Class<P>> tUKwglduU3Zu8Qs4WBE02IZodvKUrJEo) {
        this.field002 = new ThreadLocal<T>();
        this.field001 = new ThreadLocal<T>();
        Class<P> field003 = tUKwglduU3Zu8Qs4WBE02IZodvKUrJEo.apply(this.getClass());
        this.cfr_renamed_69(new Ep687fbv1XiKq2LcWmqD0bt4KhcaDePg(this, EUOIYnZlODSHU4Bam8oau1LF2LacvSKZ.class, field003));
        this.cfr_renamed_69(new tAIaycqy4oaiEdelBjRMjKJJfUZmCoPU(this, QtJL3nvotFcpGZktZW8qgApjWGz5foLa.class, field003));
    }

    public /* synthetic */ SecureClass0234(Class<P> h5gTYJYsBQXswhGd9yFh6D1b7No4oklY) {
        this((Class<?> NRqR8wmMJ5zHHgJSVKID5Z9HSY3GnUsQ) -> h5gTYJYsBQXswhGd9yFh6D1b7No4oklY);
    }

    public /* synthetic */ SecureClass0234() {
        this((Class<?> T5o72sa5CbplDUhlt2ZTTzS5E47316sr) -> SecureClass0799.AEJJL7V0zkOjuJ8dbQ2XZTD4npRjkDQ2(T5o72sa5CbplDUhlt2ZTTzS5E47316sr).MthUzsLswIO7w19b4fOh0K8CIe7giYip());
    }
}

