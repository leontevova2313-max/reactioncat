/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1735;
import net.minecraft.class_1792;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group033.qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA;
import org.phobos.secure.group022.SecureClass0377;

public final class SecureClass1012 {
    public static final /* synthetic */ Set<qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA> field001;

    public static /* bridge */ /* synthetic */ void zP9BtiZGXmOumUG6F5R0pf2v78L3DTii(Object SH4TV4Wnk1EAiYVNJGisHpHyLNpEZqGq) {
        Iterator<qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA> iterator = field001.iterator();
        while (iterator.hasNext()) {
            qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA field002 = iterator.next();
            if (!Objects.equals(SH4TV4Wnk1EAiYVNJGisHpHyLNpEZqGq, field002.ZMvEeZNEYGpJWdIhgBuj9sJMx2Wuse0e())) continue;
            field002.dAL5Z0WKAdKLdRJrN5ZfpgfmwL5cDbFr(true);
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_618(Object vVsCBlBynwxigll2ZHttyTUar5JlojnY, class_1735 H9QILKYUZJfC1GEJOHzCHLR37jAsUyWB, class_1792 t6T5EMPR26aMO1cwFrGEkGFrLTLn6lSH, float y79iovY4wD3Ij3bCX8P6sdyI3n1WQOuv) {
        field001.add(new qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA(new SecureClass0377(0.0f, y79iovY4wD3Ij3bCX8P6sdyI3n1WQOuv), vVsCBlBynwxigll2ZHttyTUar5JlojnY, H9QILKYUZJfC1GEJOHzCHLR37jAsUyWB, t6T5EMPR26aMO1cwFrGEkGFrLTLn6lSH));
    }

    public /* synthetic */ SecureClass1012() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    @Nullable
    public static /* bridge */ /* synthetic */ qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA aj1rXnYfSNfsx5s1XZL3OXscOp3EAEbE(class_1735 cI1k9NfroXWE9Ylcax1Rw5hMeIEHeDe3) {
        for (qDEdTzSbZlf7tzIfFYw9nMep4h4mk0SA field003 : field001) {
            if (!field003.elgIk1xOX0krNJoMRBOmSAFuCzSpHBXc.equals(cI1k9NfroXWE9Ylcax1Rw5hMeIEHeDe3)) continue;
            field003.x2eIV5BJdSBgzJKw1tdzvrG5Rw1WJU4O.uLfnF5tzL7ZsjZFWndyTmsPrQf4O4AG8(field003.mauT2cMyPCJBeAOazLwF6Ud3Z3Db2xXY ? 0.0f : field003.x2eIV5BJdSBgzJKw1tdzvrG5Rw1WJU4O.OvNvRVhcS4lStHbAKxYVN8OVT8fUGG3n());
            field003.x2eIV5BJdSBgzJKw1tdzvrG5Rw1WJU4O.BMMCpqfUxEdTwLEu5UFj3ge24ytSFktk(10.0f, 0.1f);
            if (field003.x2eIV5BJdSBgzJKw1tdzvrG5Rw1WJU4O.HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY() <= 0.05f && field003.mauT2cMyPCJBeAOazLwF6Ud3Z3Db2xXY) {
                field001.remove(field003);
                break;
            }
            return field003;
        }
        return null;
    }

    static {
        field001 = ConcurrentHashMap.newKeySet();
    }
}

