/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import java.util.Arrays;
import java.util.function.Supplier;
import org.jetbrains.annotations.Contract;
import org.phobos.secure.group015.DtGCPXOhrxs1nACERNnZnFIZsZB1z7IF;
import org.phobos.secure.group030.SecureClass0527;

@FunctionalInterface
public interface SecureInterface0130 {
    public static final /* synthetic */ SecureInterface0130 field001;
    public static final /* synthetic */ SecureInterface0130 field002;
    public static final /* synthetic */ SecureInterface0130 field003;

    static {
        field001 = () -> true;
        field002 = () -> SecureClass0527.E2f1bCYCTjTyu2qqiFvbcqOl3sxFtG9Q;
        field003 = () -> SecureClass0527.dVI9u7As3qeVpu71pgCbaqlGVnoO5MLQ;
    }

    public static /* bridge */ /* synthetic */ SecureInterface0130 c4AVgld5xgJgxldpK7dS10pxC4bNWjpg(Supplier<Boolean> UZF6UYa5cIPvc2aOceCKrg0W6JPaEFPf) {
        return UZF6UYa5cIPvc2aOceCKrg0W6JPaEFPf::get;
    }

    @SafeVarargs
    @Contract(value="_, _ -> new")
    public static /* bridge */ /* synthetic */ <T> SecureInterface0130 KPZEp86ul0Tw9CboqV56M3rzaxkWcp6a(Supplier<T> uMeMHy1OAZVnBrJUqOFkz9ptXWovEQCd, T ... XJPArhrjAM04ekn5zZ0PJbzUGPqe8P89) {
        return () -> Arrays.asList(XJPArhrjAM04ekn5zZ0PJbzUGPqe8P89).contains(uMeMHy1OAZVnBrJUqOFkz9ptXWovEQCd.get());
    }

    public static /* bridge */ /* synthetic */ SecureInterface0130 L5OT4zhF3VzBMfrxVndwnztuw665eS3C(SecureInterface0130 IpMjFfBf4zGj7uNFVnwhglf6eEn9IlL4, SecureInterface0130 WPe260PU3JYhUmkTjRssFYL4PkOSMxK2, DtGCPXOhrxs1nACERNnZnFIZsZB1z7IF mp8udST9wZRUmZ2tdEwE2nPiWTxZ8ABp) {
        return switch (mp8udST9wZRUmZ2tdEwE2nPiWTxZ8ABp.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> IpMjFfBf4zGj7uNFVnwhglf6eEn9IlL4.MnQPfMgVIUaJMGWAQA218opwxTbZwfnL(WPe260PU3JYhUmkTjRssFYL4PkOSMxK2);
            case 1 -> IpMjFfBf4zGj7uNFVnwhglf6eEn9IlL4.GikHTot1lQ8xJ6vxZKw0bY6Pofwvjrbd(WPe260PU3JYhUmkTjRssFYL4PkOSMxK2);
            case 2 -> IpMjFfBf4zGj7uNFVnwhglf6eEn9IlL4.NQ9Y015SxGuHb8jIEwlLOkbSuiNVkMq0().MnQPfMgVIUaJMGWAQA218opwxTbZwfnL(WPe260PU3JYhUmkTjRssFYL4PkOSMxK2.NQ9Y015SxGuHb8jIEwlLOkbSuiNVkMq0());
        };
    }
}

