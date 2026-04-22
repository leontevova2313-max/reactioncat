/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.phobos.secure.group035.SecureClass0617;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group042.GameTiersModule;

public final class SecureClass0707
extends Record
implements SecureInterface0038 {
    public final /* synthetic */ String field001;
    public final /* synthetic */ String field002;
    public static final /* synthetic */ SecureClass0707 field003;

    public static /* bridge */ /* synthetic */ CompletableFuture<List<SecureClass0707>> FllBzYzNWOKXXmn3tAxNdLxnehrra9J9(HttpClient g2yrAlEHry24w3XZ08bcYAAjKElib2e4) {
        String field004 = GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/tierlists";
        HttpRequest field005 = HttpRequest.newBuilder(URI.create(field004)).GET().build();
        return g2yrAlEHry24w3XZ08bcYAAjKElib2e4.sendAsync(field005, HttpResponse.BodyHandlers.ofString()).thenApply(M3bdtWXsQ9MGvOAGpNpWZz4iBm74ZCbW -> {
            JsonObject field006 = (JsonObject)SecureClass0617.cfr_renamed_328.fromJson((String)M3bdtWXsQ9MGvOAGpNpWZz4iBm74ZCbW.body(), JsonObject.class);
            return field006.entrySet().stream().map(PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5 -> {
                String field007 = ((JsonElement)PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5.getValue()).getAsJsonObject().get("title").getAsString();
                return new SecureClass0707((String)PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5.getKey(), field007);
            }).toList();
        });
    }

    static {
        field003 = new SecureClass0707("empty", "empty");
    }

    public /* synthetic */ SecureClass0707(String yTk7fArtZ5I92jSPOVigD6dyh9sW3bHp, String string) {
        this.field001 = yTk7fArtZ5I92jSPOVigD6dyh9sW3bHp;
        this.field002 = string;
    }
}

