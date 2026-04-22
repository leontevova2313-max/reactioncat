/*
 * Decompiled with CFR.
 */
package org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.iB2V6uQcx7lwzId3OZgmHTG0xFf2AuwZ;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd;

public final class uab2J7qPTpom35gPalNDojQxjdIcN0NW
extends Record
implements iB2V6uQcx7lwzId3OZgmHTG0xFf2AuwZ {
    public final /* synthetic */ String D4vRwDohL9lKYlxPbZXzuirnYHZEakqS;
    public final /* synthetic */ String KF2KxjL8mm1x3NuCXQy5l2Fvgybhpowh;
    public static final /* synthetic */ uab2J7qPTpom35gPalNDojQxjdIcN0NW YoGXuojpJgbt1UvMPfA46ttTAcQE0d4t;

    public static /* bridge */ /* synthetic */ CompletableFuture<List<uab2J7qPTpom35gPalNDojQxjdIcN0NW>> FllBzYzNWOKXXmn3tAxNdLxnehrra9J9(HttpClient g2yrAlEHry24w3XZ08bcYAAjKElib2e4) {
        String ZvCutXZk3l7LYTNe1xMuxsZrAyaAxW6D = cqc3lug5XTknQ2ObAuGJypqZ8q4LTNKd.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().z6lfEVQ6abc6Lcx8EXCBa09UQzagUqXX() + "/tierlists";
        HttpRequest NK0w3euHki3gIW6qi8Xk48R4ABN9DCAs = HttpRequest.newBuilder(URI.create(ZvCutXZk3l7LYTNe1xMuxsZrAyaAxW6D)).GET().build();
        return g2yrAlEHry24w3XZ08bcYAAjKElib2e4.sendAsync(NK0w3euHki3gIW6qi8Xk48R4ABN9DCAs, HttpResponse.BodyHandlers.ofString()).thenApply(M3bdtWXsQ9MGvOAGpNpWZz4iBm74ZCbW -> {
            JsonObject AoK0N7TUE6ox0XaZe95MfVoFl0zFySbU = (JsonObject)F2i1ygbdnNrOCx7moI0v90YQUOK1mYfJ.cfr_renamed_328.fromJson((String)M3bdtWXsQ9MGvOAGpNpWZz4iBm74ZCbW.body(), JsonObject.class);
            return AoK0N7TUE6ox0XaZe95MfVoFl0zFySbU.entrySet().stream().map(PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5 -> {
                String RWUYLwN5zGl2RcMYgYvBJf624a9YN9vF = ((JsonElement)PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5.getValue()).getAsJsonObject().get("title").getAsString();
                return new uab2J7qPTpom35gPalNDojQxjdIcN0NW((String)PvHcnr4XCvmFLdsj1FpywYhBqs6ZRnH5.getKey(), RWUYLwN5zGl2RcMYgYvBJf624a9YN9vF);
            }).toList();
        });
    }

    static {
        YoGXuojpJgbt1UvMPfA46ttTAcQE0d4t = new uab2J7qPTpom35gPalNDojQxjdIcN0NW("empty", "empty");
    }

    public /* synthetic */ uab2J7qPTpom35gPalNDojQxjdIcN0NW(String yTk7fArtZ5I92jSPOVigD6dyh9sW3bHp, String string) {
        this.D4vRwDohL9lKYlxPbZXzuirnYHZEakqS = yTk7fArtZ5I92jSPOVigD6dyh9sW3bHp;
        this.KF2KxjL8mm1x3NuCXQy5l2Fvgybhpowh = string;
    }
}

