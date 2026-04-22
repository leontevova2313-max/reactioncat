/*
 * Decompiled with CFR.
 */
package io.netty.handler.ssl;

import io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ApplicationProtocolUtil {
    private static final int DEFAULT_LIST_SIZE = 2;

    private ApplicationProtocolUtil() {
    }

    static List<String> toList(Iterable<String> protocols) {
        return ApplicationProtocolUtil.toList(2, protocols);
    }

    static List<String> toList(int initialListSize, Iterable<String> protocols) {
        if (protocols == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>(initialListSize);
        Iterator<String> iterator = protocols.iterator();
        while (iterator.hasNext()) {
            String p = iterator.next();
            result.add(ObjectUtil.checkNonEmpty(p, "p"));
        }
        return ObjectUtil.checkNonEmpty(result, "result");
    }

    static List<String> toList(String ... protocols) {
        return ApplicationProtocolUtil.toList(2, protocols);
    }

    static List<String> toList(int initialListSize, String ... protocols) {
        if (protocols == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>(initialListSize);
        String[] stringArray = protocols;
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String p = stringArray[n2];
            result.add(ObjectUtil.checkNonEmpty(p, "p"));
            ++n2;
        }
        return ObjectUtil.checkNonEmpty(result, "result");
    }
}

