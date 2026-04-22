/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import io.netty.handler.proxy.Socks5ProxyHandler;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group013.CwaD2i15DrD5N9Q84fZPGze6ZF8TVZhy;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group026.SecureClass0457;
import org.phobos.secure.group048.SecureInterface0119;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group062.SecureInterface0143;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0215
extends SecureClass0966
implements SecureInterface0038,
SecureInterface0143,
SecureInterface0119,
Iterable<SecureClass0457> {
    public static /* synthetic */ boolean field001;
    public final /* synthetic */ MutableObject<SecureClass0457> field002;
    public static /* synthetic */ int field003;
    public static final /* synthetic */ Logger field004;
    public static final /* synthetic */ Path field005;
    public final /* synthetic */ List<SecureClass0457> field006;
    public final /* synthetic */ SecureClass0242 field007;
    public static /* synthetic */ int field008;

    static {
        field004 = LoggerFactory.getLogger(SecureClass0215.class);
        field005 = Path.of(System.getProperty("user.home"), "earthhack");
    }

    @Nullable
    public static /* bridge */ /* synthetic */ Socks5ProxyHandler Cu2TdzXT0uRziT8eqG6Dn7peIy4jpOC9(SecureClass0457 C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN) {
        if (C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN == null) {
            return null;
        }
        if (C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN.IOugY20O9txZtSQXcyWucpxA8SgmHJKO()) {
            return new Socks5ProxyHandler(C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2(), C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN.WyCvYuD3SwjaeGXxz27zNcdlMBk2WuC9(), C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN.tZXXeGA0YUzgplPGbkF3jPREdgOodwzI());
        }
        return new Socks5ProxyHandler(C5y7v1YscHhYnnv6N9dj85hpWK0ASuzN.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2());
    }

    public static /* bridge */ /* synthetic */ void mZQO0hQY8IIdUPBMqoZ3pt7Wx4YTYyi7() {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().AP7gZPgbE2zMRiWa6axcSTQXFUPxC40n().SE8J1IotdQOicHBT9L4mJjt9Bt2SPTrS();
    }

    public /* synthetic */ SecureClass0215(SecureClass0242 kWaBBdN7dO2S2pTTNwSCLhi6wyjAL4Wa) {
        this.field002 = new MutableObject(null);
        this.field006 = new ArrayList<SecureClass0457>();
        this.field007 = kWaBBdN7dO2S2pTTNwSCLhi6wyjAL4Wa;
        this.cfr_renamed_69(new CwaD2i15DrD5N9Q84fZPGze6ZF8TVZhy(this));
    }
}

