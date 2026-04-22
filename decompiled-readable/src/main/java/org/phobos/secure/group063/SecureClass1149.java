/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import org.phobos.secure.group013.SecureClass0189;
import org.phobos.secure.group016.SecureInterface0037;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group046.SecureClass0826;

public class SecureClass1149
extends SecureClass0189 {
    public static final /* synthetic */ boolean field001;
    public final /* synthetic */ SecureInterface0037 field002;
    public final /* synthetic */ long integration;
    public static final /* synthetic */ String field003 = "spotify:track:";
    public /* synthetic */ SecureClass0826 field004;
    public static final /* synthetic */ long[] field005;

    public /* synthetic */ SecureClass1149() {
        super("Spotify.exe");
        this.field004 = SecureClass0826.wQFjoq68tRST2qB6Y2v5umX0SNeMmHKx;
        if (field001) {
            SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Integration", "Spotify process loaded! Searching for addresses...");
        }
        long field006 = System.currentTimeMillis();
        this.integration = this.voog6XbIC1UU6XQvve1rczA7W3QxB0Oa();
        this.field002 = this.FCGsk1BJgcewEWFVgmyBKlHvtA0SW4XS();
        if (field001) {
            SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Integration", "Scanning took " + (System.currentTimeMillis() - field006) + "ms");
        }
    }

    static {
        field001 = SecureClass0361.cfr_renamed_670;
        field005 = new long[]{1395296L, 1374768L, 1073560L, 1362416L, 1057144L, 1350128L, 1044456L};
    }
}

