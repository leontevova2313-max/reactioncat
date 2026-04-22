/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import io.netty.handler.proxy.HttpProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.SocketAddress;
import org.phobos.secure.group041.SecureInterface0104;

public class SecureClass0846 {
    public static /* synthetic */ SecureInterface0104<HttpProxyHandler> field001;
    public static /* synthetic */ SecureInterface0104<Socks5ProxyHandler> field002;

    public static /* bridge */ /* synthetic */ String cfr_renamed_564(SecureInterface0104<?> sJWCQz8B1gMNKtNuiYxR0O9eF2WwAMcc) {
        return sJWCQz8B1gMNKtNuiYxR0O9eF2WwAMcc.equals(field001) ? "http" : "socks5";
    }

    static {
        field001 = SJQq8fYscwCK3uFc60C4szz66PKWI6yP -> {
            if (SJQq8fYscwCK3uFc60C4szz66PKWI6yP.IOugY20O9txZtSQXcyWucpxA8SgmHJKO() && SJQq8fYscwCK3uFc60C4szz66PKWI6yP.WyCvYuD3SwjaeGXxz27zNcdlMBk2WuC9() != null && SJQq8fYscwCK3uFc60C4szz66PKWI6yP.tZXXeGA0YUzgplPGbkF3jPREdgOodwzI() != null) {
                return new HttpProxyHandler((SocketAddress)SJQq8fYscwCK3uFc60C4szz66PKWI6yP.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2(), SJQq8fYscwCK3uFc60C4szz66PKWI6yP.WyCvYuD3SwjaeGXxz27zNcdlMBk2WuC9(), SJQq8fYscwCK3uFc60C4szz66PKWI6yP.tZXXeGA0YUzgplPGbkF3jPREdgOodwzI());
            }
            return new HttpProxyHandler(SJQq8fYscwCK3uFc60C4szz66PKWI6yP.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2());
        };
        field002 = xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W -> {
            if (xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.IOugY20O9txZtSQXcyWucpxA8SgmHJKO() && xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.WyCvYuD3SwjaeGXxz27zNcdlMBk2WuC9() != null && xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.tZXXeGA0YUzgplPGbkF3jPREdgOodwzI() != null) {
                return new Socks5ProxyHandler(xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2(), xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.WyCvYuD3SwjaeGXxz27zNcdlMBk2WuC9(), xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.tZXXeGA0YUzgplPGbkF3jPREdgOodwzI());
            }
            return new Socks5ProxyHandler(xcl0RsEawvy1EJE6yGRi43eNOXu7gL9W.E2oXevODAG6di3ta3qTAfVnOpI3uVkK2());
        };
    }

    public static /* bridge */ /* synthetic */ SecureInterface0104<?> Ew6tRPEUsoksX8SCHPu2kjIHZIbbVizI(String bSsGTE0mNkjWatGcyutfUr6R3ZOtO43z) {
        return bSsGTE0mNkjWatGcyutfUr6R3ZOtO43z.equals("http") ? field001 : field002;
    }
}

