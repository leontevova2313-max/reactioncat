/*
 * Decompiled with CFR.
 */
package org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir;

import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.iB2V6uQcx7lwzId3OZgmHTG0xFf2AuwZ;

public enum uFfNfKYvWVoZC973sOycTXaH6M0h3tPE implements iB2V6uQcx7lwzId3OZgmHTG0xFf2AuwZ
{
    Normal("Normal"),
    Hold("Hold");

    public final /* synthetic */ String name;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ uFfNfKYvWVoZC973sOycTXaH6M0h3tPE(String string) {
        void name;
        this.name = name;
    }

    public static /* bridge */ /* synthetic */ uFfNfKYvWVoZC973sOycTXaH6M0h3tPE fromString(String string) {
        return string.equals("Hold") ? Hold : Normal;
    }

    public static /* bridge */ /* synthetic */ uFfNfKYvWVoZC973sOycTXaH6M0h3tPE other(uFfNfKYvWVoZC973sOycTXaH6M0h3tPE other) {
        return switch (other.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> Hold;
            case 1 -> Normal;
        };
    }
}

