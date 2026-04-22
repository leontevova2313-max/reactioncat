/*
 * Decompiled with CFR.
 */
package org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.phobos.secure.KCc25p0Ms0G8li5hGx4IIWIcsKmCc9nl.k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd;

public final class tT6iIQuMdScp5Lu41gE80CSKqKARFxLj
extends Record {
    @SerializedName(value="combat_master")
    public final /* synthetic */ boolean KMnYN8xNBNkG7u5WmGTgX1NPuIFStuKW;
    public final /* synthetic */ String ZCScPqRqujhEDmKc6ANOWxqMRSogkKmS;
    public final /* synthetic */ int hUEbCOscaVmOkQcnmAjaZU5VrcQc5fbG;
    public final /* synthetic */ int ezYhw5LkC5QNmOmhkDn9gXJlqb6p3iMx;
    public final /* synthetic */ List<PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT> cfr_renamed_817;
    public final /* synthetic */ Map<String, k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E> Mp5ZsOe5xrqWRzUFSMC6ojTKQXgi4fmI;
    public final /* synthetic */ String name;
    public static final /* synthetic */ Map<String, Integer> GNL6LsNUePYWqvsUQXuKmtpHSPkyepaW;
    public final /* synthetic */ String N8gP1L6StVbwymCxQQRJ4D0VCm3725Vu;

    static {
        GNL6LsNUePYWqvsUQXuKmtpHSPkyepaW = Map.of("NA", 16738926, "EU", 7012206, "SA", 0xFF9900, "AU", 16167531, "ME", 16767334, "AS", 12745632, "AF", 6770343);
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<tT6iIQuMdScp5Lu41gE80CSKqKARFxLj> S6BDRA0uZLUR80nhDBDMSGZ71k5bCpVI(HttpClient pvSitFmGKLuyvHo4FTrvep6e8K97jiP7, String O12SzR9jQr6tl0ABFsgOy9ifcvcAASDF) {
        String string = cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/search_profile/" + O12SzR9jQr6tl0ABFsgOy9ifcvcAASDF;
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(string)).GET().build();
        return ((CompletableFuture)((CompletableFuture)pvSitFmGKLuyvHo4FTrvep6e8K97jiP7.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(YQC3bcryMtLLCFQx8kjLpMmoiCtlrpMj -> (tT6iIQuMdScp5Lu41gE80CSKqKARFxLj)F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ.cfr_renamed_328.fromJson(YQC3bcryMtLLCFQx8kjLpMmoiCtlrpMj, tT6iIQuMdScp5Lu41gE80CSKqKARFxLj.class))).whenComplete((JRfLEJEGNKHCfSoKwbISfjdplSsl3voy, S9wN2FWE5eBvbPnpytnDS3BjQzn8ehrr) -> {});
    }

    public /* synthetic */ tT6iIQuMdScp5Lu41gE80CSKqKARFxLj(String omvquyaWxi8jes6pWGSLFX5fglIL2frL, String K3q3SMFgo5fxddBeZH4jtuBCFoF41Yo2, Map<String, k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E> t24N7qzTcatVC4ufh2Sft8xYulkBAiMU, String hkPrfzepf72Chi6aPY1VuyPKfX4ZA3U3, int n, int s2WIdn2jm2QZGPVPbcWQlXZG0DW9aWcO, List<PJ1KOmV8cvjQgavpkAhZcwgc2swRxPaT> list, boolean ZCJUG4ZaYcy6qxXK1cNdHbvJspv0P23o) {
        this.N8gP1L6StVbwymCxQQRJ4D0VCm3725Vu = omvquyaWxi8jes6pWGSLFX5fglIL2frL;
        this.name = K3q3SMFgo5fxddBeZH4jtuBCFoF41Yo2;
        this.Mp5ZsOe5xrqWRzUFSMC6ojTKQXgi4fmI = t24N7qzTcatVC4ufh2Sft8xYulkBAiMU;
        this.ZCScPqRqujhEDmKc6ANOWxqMRSogkKmS = hkPrfzepf72Chi6aPY1VuyPKfX4ZA3U3;
        this.hUEbCOscaVmOkQcnmAjaZU5VrcQc5fbG = n;
        this.ezYhw5LkC5QNmOmhkDn9gXJlqb6p3iMx = s2WIdn2jm2QZGPVPbcWQlXZG0DW9aWcO;
        this.cfr_renamed_817 = list;
        this.KMnYN8xNBNkG7u5WmGTgX1NPuIFStuKW = ZCJUG4ZaYcy6qxXK1cNdHbvJspv0P23o;
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<tT6iIQuMdScp5Lu41gE80CSKqKARFxLj> PkRUAmvrDzv5LQ3rezWq3l2av7c2p4qH(HttpClient httpClient, UUID az7wCJmfUT3xeDhXUYABgAJDstBuZPHd) {
        String ADAfYzA9yZAJMp08Kl1YA5DWWl57QjWJ = cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/profile/" + az7wCJmfUT3xeDhXUYABgAJDstBuZPHd.toString().replace("-", "");
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(ADAfYzA9yZAJMp08Kl1YA5DWWl57QjWJ)).GET().build();
        return ((CompletableFuture)((CompletableFuture)httpClient.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(QfgyWCVpxjkngb97loEwmBdG2iIEq1pv -> (tT6iIQuMdScp5Lu41gE80CSKqKARFxLj)F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ.cfr_renamed_328.fromJson(QfgyWCVpxjkngb97loEwmBdG2iIEq1pv, tT6iIQuMdScp5Lu41gE80CSKqKARFxLj.class))).whenComplete((BYEcGp6SKqbOKL9lxIYjUEU5fWW1iGun, throwable) -> {});
    }
}

