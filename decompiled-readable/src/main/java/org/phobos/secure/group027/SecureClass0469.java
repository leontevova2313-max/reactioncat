/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group027;

import java.util.Arrays;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public final class SecureClass0469 {
    public static /* bridge */ /* synthetic */ void UkZIVQ7jvgN4eTcWCsEANTKsHTYz4Ydr(ClassNode m5pTac6YYtPiH7B291ied3s61tIUfk07, Type HrML60dKyKAggUyquUUQO2mHSANveBox, String ... Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6) throws RuntimeException {
        String field001 = null;
        for (FieldNode oNktawMF4J82hzKRQMUDsM5GEmccDECK : m5pTac6YYtPiH7B291ied3s61tIUfk07.fields) {
            if (!Type.getType((String)oNktawMF4J82hzKRQMUDsM5GEmccDECK.desc).equals((Object)HrML60dKyKAggUyquUUQO2mHSANveBox) || !Arrays.asList(Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6).contains(oNktawMF4J82hzKRQMUDsM5GEmccDECK.name)) continue;
            if (field001 != null) {
                throw new RuntimeException("Found both field " + field001 + " and " + oNktawMF4J82hzKRQMUDsM5GEmccDECK.name + " in class " + m5pTac6YYtPiH7B291ied3s61tIUfk07.name);
            }
            field001 = oNktawMF4J82hzKRQMUDsM5GEmccDECK.name;
            oNktawMF4J82hzKRQMUDsM5GEmccDECK.access |= 0x40;
        }
        if (field001 == null) {
            throw new RuntimeException("Failed to find any of " + Arrays.toString(Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6) + " in " + m5pTac6YYtPiH7B291ied3s61tIUfk07.name);
        }
    }

    public static /* bridge */ /* synthetic */ void gi10RAtNzZBxeSX420tAA4Y8LFhiVuXk(Throwable CaXNlmxKNOo1YqjyXsE6uC3uWsMyKWrN) {
        CaXNlmxKNOo1YqjyXsE6uC3uWsMyKWrN.printStackTrace();
    }

    public /* synthetic */ SecureClass0469() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

