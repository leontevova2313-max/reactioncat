/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class SecureClass0853 {
    /*
     * WARNING - void declaration
     */
    public static /* bridge */ /* synthetic */ X509TrustManager cfr_renamed_560() throws Exception {
        void field001;
        CertificateFactory field002 = CertificateFactory.getInstance("X.509");
        try (InputStream inputStream = SecureClass0853.class.getResourceAsStream("/assets/phobos/certificate.crt");){
            if (inputStream == null) {
                throw new IllegalArgumentException("Certificate not found");
            }
            Certificate field003 = field002.generateCertificate(inputStream);
        }
        KeyStore field004 = KeyStore.getInstance(KeyStore.getDefaultType());
        field004.load(null, null);
        field004.setCertificateEntry("ca", (Certificate)field001);
        TrustManagerFactory field005 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        field005.init(field004);
        TrustManager[] field006 = field005.getTrustManagers();
        int n = field006.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                throw new IllegalStateException("Unable to find X509");
            }
            TrustManager field007 = field006[n2];
            if (field007 instanceof X509TrustManager) {
                X509TrustManager field008 = (X509TrustManager)field007;
                return field008;
            }
            ++n2;
        }
    }

    public static /* bridge */ /* synthetic */ SSLContext IwojLaD3RfbGcOnRD0ud8KEogteHrdvJ() throws Exception {
        X509TrustManager field009 = SecureClass0853.cfr_renamed_560();
        SSLContext field010 = SSLContext.getInstance("TLS");
        field010.init(null, new TrustManager[]{field009}, null);
        return field010;
    }
}

