/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group010;

import engine.linking.NativeMethodHandler;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.SecureInterface0086;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group022.SecureClass0378;
import org.phobos.secure.group040.SecureClass0695;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0159
extends SecureClass0966
implements SecureInterface0143,
SecureInterface0038,
SecureInterface0086 {
    public final /* synthetic */ SecureClass0695 field001;
    public final /* synthetic */ Map<SecureClass0378, List<SecureClass1027>> field002;
    public /* synthetic */ SecureClass0242 field003;

    public /* synthetic */ SecureClass0159() {
        this.__set__n281R9LJm5BQLByixuVaBZCK3nVBESkG(Collections.synchronizedList(new LinkedList<E>()));
        this.field002 = new LinkedHashMap<SecureClass0378, List<SecureClass1027>>();
        this.field001 = new SecureClass0695();
    }

    public native /* synthetic */ List __get__n281R9LJm5BQLByixuVaBZCK3nVBESkG();

    public native /* synthetic */ void __set__n281R9LJm5BQLByixuVaBZCK3nVBESkG(List var1);

    static {
        NativeMethodHandler.registerNativeCallbacks(54);
    }
}

