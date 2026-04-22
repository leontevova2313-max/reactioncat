/*
 * Decompiled with CFR.
 */
package org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn;

import java.util.Arrays;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

public final class DEojBPU0wtd155dGgTMCJjZzgNZ0t8B8 {
    public static /* bridge */ /* synthetic */ void UkZIVQ7jvgN4eTcWCsEANTKsHTYz4Ydr(ClassNode m5pTac6YYtPiH7B291ied3s61tIUfk07, Type HrML60dKyKAggUyquUUQO2mHSANveBox, String ... Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6) throws RuntimeException {
        String JUasTkik7H8sC6ISmGuESd0LOifo3tas = null;
        for (FieldNode oNktawMF4J82hzKRQMUDsM5GEmccDECK : m5pTac6YYtPiH7B291ied3s61tIUfk07.fields) {
            if (!Type.getType((String)oNktawMF4J82hzKRQMUDsM5GEmccDECK.desc).equals((Object)HrML60dKyKAggUyquUUQO2mHSANveBox) || !Arrays.asList(Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6).contains(oNktawMF4J82hzKRQMUDsM5GEmccDECK.name)) continue;
            if (JUasTkik7H8sC6ISmGuESd0LOifo3tas != null) {
                throw new RuntimeException("Found both field " + JUasTkik7H8sC6ISmGuESd0LOifo3tas + " and " + oNktawMF4J82hzKRQMUDsM5GEmccDECK.name + " in class " + m5pTac6YYtPiH7B291ied3s61tIUfk07.name);
            }
            JUasTkik7H8sC6ISmGuESd0LOifo3tas = oNktawMF4J82hzKRQMUDsM5GEmccDECK.name;
            oNktawMF4J82hzKRQMUDsM5GEmccDECK.access |= 0x40;
        }
        if (JUasTkik7H8sC6ISmGuESd0LOifo3tas == null) {
            throw new RuntimeException("Failed to find any of " + Arrays.toString(Ldnl6EKoOa8cOlOZXdgr58v7lFVKuUK6) + " in " + m5pTac6YYtPiH7B291ied3s61tIUfk07.name);
        }
    }

    public static /* bridge */ /* synthetic */ void gi10RAtNzZBxeSX420tAA4Y8LFhiVuXk(Throwable CaXNlmxKNOo1YqjyXsE6uC3uWsMyKWrN) {
        CaXNlmxKNOo1YqjyXsE6uC3uWsMyKWrN.printStackTrace();
    }

    public /* synthetic */ DEojBPU0wtd155dGgTMCJjZzgNZ0t8B8() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

