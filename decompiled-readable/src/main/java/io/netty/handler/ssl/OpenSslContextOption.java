/*
 * Decompiled with CFR.
 */
package io.netty.handler.ssl;

import io.netty.handler.ssl.OpenSslAsyncPrivateKeyMethod;
import io.netty.handler.ssl.OpenSslCertificateCompressionConfig;
import io.netty.handler.ssl.OpenSslPrivateKeyMethod;
import io.netty.handler.ssl.SslContextOption;

public final class OpenSslContextOption<T>
extends SslContextOption<T> {
    public static final OpenSslContextOption<Boolean> USE_TASKS = new OpenSslContextOption<T>("USE_TASKS");
    public static final OpenSslContextOption<Boolean> TLS_FALSE_START = new OpenSslContextOption<T>("TLS_FALSE_START");
    public static final OpenSslContextOption<OpenSslPrivateKeyMethod> PRIVATE_KEY_METHOD = new OpenSslContextOption<T>("PRIVATE_KEY_METHOD");
    public static final OpenSslContextOption<OpenSslAsyncPrivateKeyMethod> ASYNC_PRIVATE_KEY_METHOD = new OpenSslContextOption<T>("ASYNC_PRIVATE_KEY_METHOD");
    public static final OpenSslContextOption<OpenSslCertificateCompressionConfig> CERTIFICATE_COMPRESSION_ALGORITHMS = new OpenSslContextOption<T>("CERTIFICATE_COMPRESSION_ALGORITHMS");
    public static final OpenSslContextOption<Integer> MAX_CERTIFICATE_LIST_BYTES = new OpenSslContextOption<T>("MAX_CERTIFICATE_LIST_BYTES");

    private OpenSslContextOption(String name) {
        super(name);
    }
}

