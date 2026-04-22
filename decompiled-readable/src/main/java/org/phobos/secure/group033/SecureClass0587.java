/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group033;

import engine.linking.NativeMethodHandler;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_2561;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group003.SecureInterface0004;
import org.phobos.secure.group009.SecureInterface0017;
import org.phobos.secure.group032.SecureClass0568;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group057.SecureClass1048;
import org.phobos.secure.group063.SecureInterface0148;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group042.SecureClass0755;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group062.SecureInterface0143;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0587
extends SecureClass0870<SecureClass0587>
implements SecureInterface0004,
SecureInterface0143,
SecureInterface0148,
SecureInterface0017 {
    public static final /* synthetic */ Logger field001;
    public static /* synthetic */ SecureClass0587 field002;
    public final /* synthetic */ SecureClass0874 field003;
    public final /* synthetic */ List<SecureClass0755> field004;
    public final /* synthetic */ SecureClass0377 field005;
    public final /* synthetic */ SecureInterface0052 field006;
    public final /* synthetic */ MutableObject<SecureClass1048> field007;

    public /* synthetic */ SecureClass0587() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field005 = new SecureClass0377(0.0f, 1.0f);
        this.field004 = new CopyOnWriteArrayList<SecureClass0755>();
        this.field007 = new MutableObject();
        this.field006 = new SecureClass0894();
        this.field003 = new SecureClass0874(this.field006);
        field002 = this;
        this.KcvnzCLqipZdYYrsD0KstIASehhu7Ecj();
        SecureClass0568.jid88MNQdTqBNsGFOSw7Q4hEhQnyaEaG().ZDdwq6FhOzrQWAHtV5NdQH3aTQEnis4u(this);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(34);
        field001 = LoggerFactory.getLogger(SecureClass0587.class);
        field002 = new SecureClass0587();
    }
}

