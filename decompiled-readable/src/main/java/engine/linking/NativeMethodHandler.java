/*
 * Decompiled with CFR.
 */
package engine.linking;

import engine.external.runtime.CloudLoader;

public class NativeMethodHandler {
    public static native void registerNativeCallbacks(int var0);

    static {
        StringBuilder stringBuilder = new StringBuilder("7Kwcb3psAzDPK0Hh9vprhwvVGsBBqZyKRnkvwYAxokIIsrjW8jjHpPWAe809EaTbcbFhGyjjzvzNNRUIt6uxZYL7On9b1cJb");
        CloudLoader.load("http://127.0.0.1:7565/api/v2/protection/loader", "phobos-loader", stringBuilder.reverse().toString());
    }
}

