/*
 * Decompiled with CFR.
 */
package org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf;

import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.tT6iIQuMdScp5Lu41gE80CSKqKARFxLj;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd;

public final class LziNiN4ECMuqrGQdTQduTaNFlufddTkT
extends Record {
    @SerializedName(value="fetch_unknown")
    @Nullable
    public final /* synthetic */ Boolean NvqfIOxuKCei250lgS4MLttCYhWmNY89;
    public final /* synthetic */ List<UUID> STHgGpTh3eZVoW8wnmPdglQzrIaAFxvT;
    public final /* synthetic */ List<tT6iIQuMdScp5Lu41gE80CSKqKARFxLj> PivXf058sTBhF5xSN7GLboWcNfQTBtJ6;

    public /* synthetic */ LziNiN4ECMuqrGQdTQduTaNFlufddTkT(List<tT6iIQuMdScp5Lu41gE80CSKqKARFxLj> lLqlpt9I5Dj0hfgetXW657tEJkcP5emf, List<UUID> SsVwEOIJjUvogKJqmZtuLhTA41FqDOAx, @Nullable Boolean lYc6MnLw0hvWor36aR1kMtdPQEAOiqoc) {
        this.PivXf058sTBhF5xSN7GLboWcNfQTBtJ6 = lLqlpt9I5Dj0hfgetXW657tEJkcP5emf;
        this.STHgGpTh3eZVoW8wnmPdglQzrIaAFxvT = SsVwEOIJjUvogKJqmZtuLhTA41FqDOAx;
        this.NvqfIOxuKCei250lgS4MLttCYhWmNY89 = lYc6MnLw0hvWor36aR1kMtdPQEAOiqoc;
    }

    public static /* bridge */ /* synthetic */ CompletableFuture<LziNiN4ECMuqrGQdTQduTaNFlufddTkT> AN6XPG9oZ6ioVr7vhRtxOYYJOn1J0EQN(HttpClient h9DBTRoBPDsy4gS5fUQ6RmckxCUgpLfu) {
        String tgHA9o5aXDe0F6LuXqMq77Y4QaKeb3iv = cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/all";
        HttpRequest lRq9jdJbDOdjhS7t0ePxdWzfwFVzMNnk = HttpRequest.newBuilder(URI.create(tgHA9o5aXDe0F6LuXqMq77Y4QaKeb3iv)).GET().build();
        return ((CompletableFuture)((CompletableFuture)h9DBTRoBPDsy4gS5fUQ6RmckxCUgpLfu.sendAsync(lRq9jdJbDOdjhS7t0ePxdWzfwFVzMNnk, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)).thenApply(O3QNLugNw285PLNUSVxNgKhoSD0AWL8I -> (LziNiN4ECMuqrGQdTQduTaNFlufddTkT)F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ.cfr_renamed_328.fromJson(O3QNLugNw285PLNUSVxNgKhoSD0AWL8I, LziNiN4ECMuqrGQdTQduTaNFlufddTkT.class))).whenComplete((lziNiN4ECMuqrGQdTQduTaNFlufddTkT, throwable) -> {});
    }
}

