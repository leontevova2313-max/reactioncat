/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group026;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import net.minecraft.class_2338;
import org.phobos.secure.group015.SecureInterface0035;
import org.phobos.secure.group017.SecureClass0283;
import org.phobos.secure.group018.SecureClass0298;
import org.phobos.secure.group033.UpdaXQrBMgtymInoD4zArBGhqIL3o4f7;
import org.phobos.secure.group037.diVI2AEoR8dhMf9vS7lWK91Yga6bcQBV;
import org.phobos.secure.group044.SecureInterface0110;
import org.phobos.secure.group059.otlOaGM48ihUL2J1d5dNpwCI3byhWOLP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SecureClass0451<T extends SecureInterface0110>
extends SecureClass0283<Runnable>
implements SecureInterface0035 {
    public final /* synthetic */ SecureClass0298 field001;
    public final /* synthetic */ Map<class_2338, T> field002;
    public static final /* synthetic */ Logger field003;
    public final /* synthetic */ ExecutorService field004;

    public /* synthetic */ SecureClass0451(Map<class_2338, T> map, ExecutorService WDwutQbodJl76DytUGK2zU2HBqPq2xld) {
        this.field001 = new SecureClass0298();
        this.field002 = map;
        this.field004 = WDwutQbodJl76DytUGK2zU2HBqPq2xld;
        this.cfr_renamed_69(new diVI2AEoR8dhMf9vS7lWK91Yga6bcQBV(this));
        this.cfr_renamed_69(new otlOaGM48ihUL2J1d5dNpwCI3byhWOLP(this, P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3));
        this.cfr_renamed_69(new UpdaXQrBMgtymInoD4zArBGhqIL3o4f7(this));
    }

    static {
        field003 = LoggerFactory.getLogger(SecureClass0451.class);
    }
}

