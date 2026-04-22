/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group046;

import com.google.gson.Gson;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.phobos.secure.group033.SecureClass0590;
import org.phobos.secure.group061.SecureClass1112;
import org.phobos.secure.group043.SecureClass0763;

public class SecureClass0825 {
    public static final /* synthetic */ String field001 = "https://api.spotify.com/v1/tracks/%s";
    public final /* synthetic */ SecureClass1112<BufferedImage> field002;
    public static final /* synthetic */ Gson field003;
    public static final /* synthetic */ String field004 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/71.0.3578.98";
    public /* synthetic */ SecureClass0590 field005;
    public static final /* synthetic */ String field006 = "https://open.spotify.com/get_access_token?reason=transport&productType=web_player";
    public final /* synthetic */ SecureClass1112<SecureClass0763> field007;
    public final /* synthetic */ Executor field008;

    static {
        field003 = new Gson();
    }

    public /* synthetic */ SecureClass0825() {
        this.field008 = Executors.newSingleThreadExecutor();
        this.field002 = new SecureClass1112<T>(10);
        this.field007 = new SecureClass1112<T>(100);
    }
}

