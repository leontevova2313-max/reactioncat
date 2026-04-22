/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group030;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.phobos.secure.group033.k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E;
import org.phobos.secure.group035.SecureClass0617;
import org.phobos.secure.group020.PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT;
import org.phobos.secure.group042.GameTiersModule;

public final class SecureClass0536
extends Record {
    @SerializedName(value="combat_master")
    public final /* synthetic */ boolean field001;
    public final /* synthetic */ String field002;
    public final /* synthetic */ int field003;
    public final /* synthetic */ int field004;
    public final /* synthetic */ List<PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT> field005;
    public final /* synthetic */ Map<String, k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E> field006;
    public final /* synthetic */ String name;
    public static final /* synthetic */ Map<String, Integer> field007;
    public final /* synthetic */ String field008;

    static {
        field007 = Map.of("NA", 16738926, "EU", 7012206, "SA", 0xFF9900, "AU", 16167531, "ME", 16767334, "AS", 12745632, "AF", 6770343);
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<SecureClass0536> S6BDRA0uZLUR80nhDBDMSGZ71k5bCpVI(HttpClient pvSitFmGKLuyvHo4FTrvep6e8K97jiP7, String O12SzR9jQr6tl0ABFsgOy9ifcvcAASDF) {
        String string = GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/search_profile/" + O12SzR9jQr6tl0ABFsgOy9ifcvcAASDF;
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(string)).GET().build();
        return ((CompletableFuture)((CompletableFuture)pvSitFmGKLuyvHo4FTrvep6e8K97jiP7.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(YQC3bcryMtLLCFQx8kjLpMmoiCtlrpMj -> (SecureClass0536)SecureClass0617.cfr_renamed_328.fromJson(YQC3bcryMtLLCFQx8kjLpMmoiCtlrpMj, SecureClass0536.class))).whenComplete((JRfLEJEGNKHCfSoKwbISfjdplSsl3voy, S9wN2FWE5eBvbPnpytnDS3BjQzn8ehrr) -> {});
    }

    public /* synthetic */ SecureClass0536(String omvquyaWxi8jes6pWGSLFX5fglIL2frL, String K3q3SMFgo5fxddBeZH4jtuBCFoF41Yo2, Map<String, k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E> t24N7qzTcatVC4ufh2Sft8xYulkBAiMU, String hkPrfzepf72Chi6aPY1VuyPKfX4ZA3U3, int n, int s2WIdn2jm2QZGPVPbcWQlXZG0DW9aWcO, List<PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT> list, boolean ZCJUG4ZaYcy6qxXK1cNdHbvJspv0P23o) {
        this.field008 = omvquyaWxi8jes6pWGSLFX5fglIL2frL;
        this.name = K3q3SMFgo5fxddBeZH4jtuBCFoF41Yo2;
        this.field006 = t24N7qzTcatVC4ufh2Sft8xYulkBAiMU;
        this.field002 = hkPrfzepf72Chi6aPY1VuyPKfX4ZA3U3;
        this.field003 = n;
        this.field004 = s2WIdn2jm2QZGPVPbcWQlXZG0DW9aWcO;
        this.field005 = list;
        this.field001 = ZCJUG4ZaYcy6qxXK1cNdHbvJspv0P23o;
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<SecureClass0536> PkRUAmvrDzv5LQ3rezWq3l2av7c2p4qH(HttpClient httpClient, UUID az7wCJmfUT3xeDhXUYABgAJDstBuZPHd) {
        String field009 = GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/profile/" + az7wCJmfUT3xeDhXUYABgAJDstBuZPHd.toString().replace("-", "");
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(field009)).GET().build();
        return ((CompletableFuture)((CompletableFuture)httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(QfgyWCVpxjkngb97loEwmBdG2iIEq1pv -> (SecureClass0536)SecureClass0617.cfr_renamed_328.fromJson(QfgyWCVpxjkngb97loEwmBdG2iIEq1pv, SecureClass0536.class))).whenComplete((BYEcGp6SKqbOKL9lxIYjUEU5fWW1iGun, throwable) -> {});
    }
}

