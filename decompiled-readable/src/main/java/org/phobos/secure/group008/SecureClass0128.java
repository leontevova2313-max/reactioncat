/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import engine.linking.NativeMethodHandler;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.loader.api.FabricLoader;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group014.SecureClass0233;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.SecureEnum0005;
import org.phobos.secure.group018.SecureClass0289;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group029.SecureClass0509;
import org.phobos.secure.group032.SecureClass0575;
import org.phobos.secure.group048.SecureInterface0119;
import org.phobos.secure.group048.SecureClass0876;
import org.phobos.secure.group022.SecureClass0368;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group023.SecureClass0396;
import org.phobos.secure.group045.SecureClass0808;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0128
extends SecureClass0966
implements SecureInterface0119,
EventSubscriber {
    public final /* synthetic */ Map<String, String> field001;
    public static final /* synthetic */ SecureClass0575 field002;
    public static final /* synthetic */ Path field003;
    public static final /* synthetic */ Path field004;
    public static final /* synthetic */ SecureClass0876 field005;
    public final /* synthetic */ SecureClass0242 field006;
    public static final /* synthetic */ SecureClass0575 field007;
    public static /* synthetic */ SecureClass0128 field008;
    public static final /* synthetic */ SecureClass0396 field009;
    public final /* synthetic */ List<Object> field010;
    public static final /* synthetic */ Logger field011;
    public static /* synthetic */ boolean field012;
    public static /* synthetic */ boolean field013;

    public static /* bridge */ native /* synthetic */ void stop();

    public /* synthetic */ SecureClass0128(SecureClass0242 y6gTjCU28gdA4iRuGqdUwdXuZKkWuoGc) {
        this.field001 = new HashMap<String, String>();
        this.field010 = new ArrayList<Object>();
        this.field006 = y6gTjCU28gdA4iRuGqdUwdXuZKkWuoGc;
        this.eM7F2KfmB7lIu8TiKh7fFNgxoOMXGWve();
        field008 = this;
    }

    public static /* bridge */ native /* synthetic */ void oYsIyHaWmCwPqddLEiAEVvaNIS7mq6BK(SecureClass0242 var0);

    public static /* bridge */ /* synthetic */ SecureClass0128 DrSaRpJ8hjGCTh7lwpqmKIZ5waXelTvn() {
        return field008;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(52);
        field011 = LoggerFactory.getLogger(SecureClass0128.class);
        field013 = false;
        field012 = false;
        field002 = new SecureClass0575();
        field007 = new SecureClass0575();
        field005 = new SecureClass0876();
        field004 = Path.of(System.getProperty("user.home"), "earthhack", "configs");
        field003 = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
        field009 = new SecureClass0396();
    }

    public static /* bridge */ /* synthetic */ SecureClass0575 w7bECRPgidsg15gTU8feLvGNkhDBetjh() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_202(SecureClass0424 SBMCaf2bNEYdtAtsPPs15VfUxX6ZoMDi) {
        SBMCaf2bNEYdtAtsPPs15VfUxX6ZoMDi.G7ZxgdMfERZBUqp5gzc8h2EadufE7U64().forEach(wc8vSlUw7KKYvFsdJ1QHuhao7AF9XkFn -> wc8vSlUw7KKYvFsdJ1QHuhao7AF9XkFn.xFo7xRSV6FGwEA4NspaY8FbC6VCdI2hR(wc8vSlUw7KKYvFsdJ1QHuhao7AF9XkFn.WzTNlVqrT6GQ7RhlvyGsKLIXoFTdQpSy()));
        SBMCaf2bNEYdtAtsPPs15VfUxX6ZoMDi.FzHo3P7I4xzBHsLIjpe0gUtWMKHsizkK(true);
        SBMCaf2bNEYdtAtsPPs15VfUxX6ZoMDi.lZaptq2ozCw1iQ3WrnBmH6CL7zAa4dR8(true);
    }

    public static /* bridge */ /* synthetic */ SecureClass0876 cfr_renamed_203() {
        return field005;
    }

    public static /* bridge */ /* synthetic */ boolean NyXBnxv5cFDHyxWlLPlRmZMgGvbgP1xd(File nCikYB6ieXW5sI1FvsHv8d4nfV7CB2vz, String SnMRPXb6cxkEF3hwAX7HlckZ1rEqtpfP) {
        return SnMRPXb6cxkEF3hwAX7HlckZ1rEqtpfP.endsWith(".json");
    }

    public static /* bridge */ /* synthetic */ SecureClass0575 Nxic9hla41WOavxdXxFN0dmDhe6XHE3W() {
        return field007;
    }

    public static /* bridge */ /* synthetic */ void mZQO0hQY8IIdUPBMqoZ3pt7Wx4YTYyi7() {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().O9aXTsZIuKec1PQvjH4lWn3RqXVc7VSP().vYmvu5QvQkB14bsypKsWkGWup0lisMbt();
    }

    public static /* bridge */ /* synthetic */ void uLSKrE5zkuuXcQFWtBDyN9fzmDiHicIi(Map map) {
        field007.stop();
        map.clear();
    }

    public static /* bridge */ /* synthetic */ void HNq5wlqcIjJjwluC8mUXGhaDzWAtpSA6(String oJNSuS2hLgXjH02loKO65pRjlMIxDarh, String FHe6R3hHavKmh93OZRcc7E1tB2LAymMe, boolean Zbou7jnnRWGH4NQR6DoXi1ohaRTLc1Nq, SecureEnum0005 mIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E, Map Y2SaiHVuM2O48h3kJilD8ZlH9FsHVqvy, SecureClass0808 ICWc5c9HaF8lTo8i5ngXAyLNo71Ekm7N, String UAPHgW5kUxXjMMBSad2z7g6uXhO3sj0I) {
        SecureClass0509 field014 = new SecureClass0509(oJNSuS2hLgXjH02loKO65pRjlMIxDarh, FHe6R3hHavKmh93OZRcc7E1tB2LAymMe, UAPHgW5kUxXjMMBSad2z7g6uXhO3sj0I, true, Zbou7jnnRWGH4NQR6DoXi1ohaRTLc1Nq, mIfoa3YdsvdIl7OKOWXseF3ng2gHzf9E, SecureClass0289.ZZSKvjcosFEgDXCywCfrJDYo8ZxCdnfg(UAPHgW5kUxXjMMBSad2z7g6uXhO3sj0I));
        SecureClass0233 field015 = (SecureClass0233)Y2SaiHVuM2O48h3kJilD8ZlH9FsHVqvy.remove(ICWc5c9HaF8lTo8i5ngXAyLNo71Ekm7N);
        if (field015 != null) {
            field015.RQGGMNnWQIwwAKRMAqLCivKEyJqY8nUV(field014);
            field015.asTX5nZlsS4qmlDrYwmHUiVFh3Wz0ETr();
            SecureClass0368.cfr_renamed_204.ZZYR3GLHictBFhWh3pHt7eLADEyTI1xW(field015);
        }
        field002.kCOVIPbzXw58b88bngQNm3fljdOtQZNT();
    }

    public static /* bridge */ /* synthetic */ void RmV5sSCwa8EoAuilNxuQr9dyYvdl1ryd(SecureClass1027 UB7gneyzF3Up43b4ZKSRSr201qbf9fyh) {
        UB7gneyzF3Up43b4ZKSRSr201qbf9fyh.saNIRYl8oTp1L3HJJaWaprcSzoCTjSVF(true);
    }

    public static /* bridge */ /* synthetic */ SecureClass0396 QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ() {
        return field009;
    }
}

