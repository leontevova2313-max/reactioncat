/*
 * Decompiled with CFR.
 */
package io.netty.handler.ssl.util;

import io.netty.handler.ssl.util.FingerprintTrustManagerFactory;
import io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class FingerprintTrustManagerFactoryBuilder {
    private final String algorithm;
    private final List<String> fingerprints = new ArrayList<String>();

    FingerprintTrustManagerFactoryBuilder(String algorithm) {
        this.algorithm = ObjectUtil.checkNotNull(algorithm, "algorithm");
    }

    public FingerprintTrustManagerFactoryBuilder fingerprints(CharSequence ... fingerprints) {
        return this.fingerprints(Arrays.asList((Object[])ObjectUtil.checkNotNull(fingerprints, "fingerprints")));
    }

    public FingerprintTrustManagerFactoryBuilder fingerprints(Iterable<? extends CharSequence> fingerprints) {
        ObjectUtil.checkNotNull(fingerprints, "fingerprints");
        Iterator<? extends CharSequence> iterator = fingerprints.iterator();
        while (iterator.hasNext()) {
            CharSequence fingerprint = iterator.next();
            ObjectUtil.checkNotNullWithIAE(fingerprint, "fingerprint");
            this.fingerprints.add(fingerprint.toString());
        }
        return this;
    }

    public FingerprintTrustManagerFactory build() {
        if (this.fingerprints.isEmpty()) {
            throw new IllegalStateException("No fingerprints provided");
        }
        return new FingerprintTrustManagerFactory(this.algorithm, FingerprintTrustManagerFactory.toFingerprintArray(this.fingerprints));
    }
}

