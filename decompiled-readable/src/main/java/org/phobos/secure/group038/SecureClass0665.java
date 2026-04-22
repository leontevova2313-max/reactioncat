/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group035.SecureClass0617;
import org.phobos.secure.group030.SecureClass0536;
import org.phobos.secure.group042.GameTiersModule;

public final class SecureClass0665
extends Record {
    @SerializedName(value="fetch_unknown")
    @Nullable
    public final /* synthetic */ Boolean field001;
    public final /* synthetic */ List<UUID> field002;
    public final /* synthetic */ List<SecureClass0536> field003;

    public /* synthetic */ SecureClass0665(List<SecureClass0536> lLqlpt9I5Dj0hfgetXW657tEJkcP5emf, List<UUID> SsVwEOIJjUvogKJqmZtuLhTA41FqDOAx, @Nullable Boolean lYc6MnLw0hvWor36aR1kMtdPQEAOiqoc) {
        this.field003 = lLqlpt9I5Dj0hfgetXW657tEJkcP5emf;
        this.field002 = SsVwEOIJjUvogKJqmZtuLhTA41FqDOAx;
        this.field001 = lYc6MnLw0hvWor36aR1kMtdPQEAOiqoc;
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<SecureClass0665> AN6XPG9oZ6ioVr7vhRtxOYYJOn1J0EQN(HttpClient h9DBTRoBPDsy4gS5fUQ6RmckxCUgpLfu) {
        String field004 = GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/all";
        HttpRequest field005 = HttpRequest.newBuilder(URI.create(field004)).GET().build();
        return ((CompletableFuture)((CompletableFuture)h9DBTRoBPDsy4gS5fUQ6RmckxCUgpLfu.sendAsync(field005, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(O3QNLugNw285PLNUSVxNgKhoSD0AWL8I -> (SecureClass0665)SecureClass0617.cfr_renamed_328.fromJson(O3QNLugNw285PLNUSVxNgKhoSD0AWL8I, SecureClass0665.class))).whenComplete((lziNiN4ECMuqrGQdTQduTaNFlufddTkT, throwable) -> {});
    }
}

