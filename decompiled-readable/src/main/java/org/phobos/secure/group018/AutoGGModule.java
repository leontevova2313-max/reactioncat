/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group018;

import engine.linking.NativeMethodHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.SecureClass0613;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group020.SecureClass0333;
import org.phobos.secure.group043.G9Eo2PGKnLwXhDxDa7vaBgSkRnNMiwVc;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoGGModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> await;
    public final /* synthetic */ SecureClass0603<G9Eo2PGKnLwXhDxDa7vaBgSkRnNMiwVc> field001;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> chain;
    public final /* synthetic */ Map<String, Long> field003;

    public /* synthetic */ AutoGGModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoGG", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Types messages in the chat for you", new int[0]);
        this.field001 = new SecureClass0033<G9Eo2PGKnLwXhDxDa7vaBgSkRnNMiwVc>("Mode", G9Eo2PGKnLwXhDxDa7vaBgSkRnNMiwVc.GG).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sync").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Creates an illusion of typing"));
        this.chain = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Chain").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Trolls the target until they lose interest"));
        this.await = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Await", 5000L, 1000L, 30000L).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Initial delay (after your first message)"));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 10000L, 2000L, 60000L).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Chain delay"));
        this.field003 = new ConcurrentHashMap<String, Long>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.chain, this.await, this.delay).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.field001, G9Eo2PGKnLwXhDxDa7vaBgSkRnNMiwVc.AI);
        this.cfr_renamed_69(new SecureClass0613(this));
        this.cfr_renamed_69(new SecureClass0333(this));
        this.chain.cfr_renamed_123(DE2OBKbm7BRJYxDHrBTnEEdW1TtEz1wL -> {
            if (!DE2OBKbm7BRJYxDHrBTnEEdW1TtEz1wL.booleanValue()) {
                this.field003.clear();
            }
        });
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(87);
    }
}

