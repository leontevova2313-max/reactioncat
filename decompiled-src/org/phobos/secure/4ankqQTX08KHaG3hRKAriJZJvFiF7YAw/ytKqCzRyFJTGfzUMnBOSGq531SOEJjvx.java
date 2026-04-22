/*
 * Decompiled with CFR.
 */
package org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw;

import java.util.Arrays;
import java.util.Optional;

public enum ytKqCzRyFJTGfzUMnBOSGq531SOEJjvx {
    MCTiers("MCTiers", "https://api.uku3lig.net/tiers", '\ue901'),
    SubTiers("SubTiers", "https://subtiers.net/api", '\ue902');

    public final /* synthetic */ char icon;
    public final /* synthetic */ String name;
    public final /* synthetic */ String url;

    public static /* bridge */ /* synthetic */ Optional<ytKqCzRyFJTGfzUMnBOSGq531SOEJjvx> findByUrl(String url) {
        if (url.endsWith("/")) {
            url = url.substring(0, url.length() - 1);
        }
        String finalUrl = url;
        return Arrays.stream(ytKqCzRyFJTGfzUMnBOSGq531SOEJjvx.values()).filter(list -> list.url.equals(finalUrl)).findFirst();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ ytKqCzRyFJTGfzUMnBOSGq531SOEJjvx(String string2, String string2, char name) {
        void icon;
        void url;
        this.name = (String)name;
        this.url = url;
        this.icon = icon;
    }
}

