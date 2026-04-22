/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group034;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.phobos.secure.group047.SecureClass0850;
import org.phobos.secure.group023.AntiCheatModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0598
implements SecureInterface0134 {
    public /* synthetic */ Map<UUID, SecureClass0850> field001;
    public /* synthetic */ Map<UUID, Boolean> field002;
    public final /* synthetic */ AntiCheatModule field003;
    public static /* synthetic */ SecureClass0598 field004;
    public static final /* synthetic */ Logger field005;

    static {
        field005 = LoggerFactory.getLogger(SecureClass0598.class);
    }

    public static /* bridge */ /* synthetic */ SecureClass0598 RS7qeZel54ieLit66qmcQl0x0y0KW24N() {
        return field004;
    }

    public /* synthetic */ SecureClass0598(AntiCheatModule aNksXLqliBVJirJCNNQSZTI5IyYsziaT) {
        this.field002 = new HashMap<UUID, Boolean>();
        this.field001 = new HashMap<UUID, SecureClass0850>();
        this.field003 = aNksXLqliBVJirJCNNQSZTI5IyYsziaT;
        field004 = this;
    }
}

