/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class SecureClass0337 {
    public static final /* synthetic */ Random field001;

    public static /* bridge */ /* synthetic */ String uCfgmYLHwekHbhU3byt3NfOKyYZ9F60A(int XrjCgj1O3gXMNiqLz1Oo38FzWTU5kuEf) {
        return IntStream.range(0, XrjCgj1O3gXMNiqLz1Oo38FzWTU5kuEf).mapToObj(SLK3ybGbSpJ4gchWcr2sHr70bTtPBdCW -> String.valueOf((char)field001.nextInt(97, 123))).collect(Collectors.joining());
    }

    public /* synthetic */ SecureClass0337() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        field001 = new Random();
    }
}

