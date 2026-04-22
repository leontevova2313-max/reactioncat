/*
 * Decompiled with CFR.
 */
package org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir;

import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class XCnWZJhoWGbKIqT5xjGTQcTrmIZnvqEF {
    /*
     * WARNING - void declaration
     */
    public static /* bridge */ /* synthetic */ X509TrustManager cfr_renamed_560() throws Exception {
        void Xq6WisA5bFGozld8uVUIPr9cWFYPMt7C;
        CertificateFactory WzInZcdJf5q7BejeDYLcDLN8EMcAHbgF = CertificateFactory.getInstance("X.509");
        try (InputStream inputStream = XCnWZJhoWGbKIqT5xjGTQcTrmIZnvqEF.class.getResourceAsStream("/assets/phobos/certificate.crt");){
            if (inputStream == null) {
                throw new IllegalArgumentException("Certificate not found");
            }
            Certificate YMk7dFMNwHkg6vFuT50r6UCC2EByW3eR = WzInZcdJf5q7BejeDYLcDLN8EMcAHbgF.generateCertificate(inputStream);
        }
        KeyStore jjz8GcyYtJ6WiZ8cPcLVrHy3ZskoUElh = KeyStore.getInstance(KeyStore.getDefaultType());
        jjz8GcyYtJ6WiZ8cPcLVrHy3ZskoUElh.load(null, null);
        jjz8GcyYtJ6WiZ8cPcLVrHy3ZskoUElh.setCertificateEntry("ca", (Certificate)Xq6WisA5bFGozld8uVUIPr9cWFYPMt7C);
        TrustManagerFactory Ab0RMjZpQonDOCUQUl6F2VGWHuSbAHwr = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        Ab0RMjZpQonDOCUQUl6F2VGWHuSbAHwr.init(jjz8GcyYtJ6WiZ8cPcLVrHy3ZskoUElh);
        TrustManager[] trustManagerArray = Ab0RMjZpQonDOCUQUl6F2VGWHuSbAHwr.getTrustManagers();
        int n = trustManagerArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                throw new IllegalStateException("Unable to find X509");
            }
            TrustManager XcncvVNYodkbbxMxj2X1J9bwP01i9yp5 = trustManagerArray[n2];
            if (XcncvVNYodkbbxMxj2X1J9bwP01i9yp5 instanceof X509TrustManager) {
                X509TrustManager oFdZOdCYSNaI1KUSRCf1Dmr3O8Ohueny = (X509TrustManager)XcncvVNYodkbbxMxj2X1J9bwP01i9yp5;
                return oFdZOdCYSNaI1KUSRCf1Dmr3O8Ohueny;
            }
            ++n2;
        }
    }

    public static /* bridge */ /* synthetic */ SSLContext IwojLaD3RfbGcOnRD0ud8KEogteHrdvJ() throws Exception {
        X509TrustManager IQ7AndfqmC8dhE109qJrdv9VVruFYscK = XCnWZJhoWGbKIqT5xjGTQcTrmIZnvqEF.cfr_renamed_560();
        SSLContext okk4B7mvjGAZV3bPf0lX1p4Cc0vInsvn = SSLContext.getInstance("TLS");
        okk4B7mvjGAZV3bPf0lX1p4Cc0vInsvn.init(null, new TrustManager[]{IQ7AndfqmC8dhE109qJrdv9VVruFYscK}, null);
        return okk4B7mvjGAZV3bPf0lX1p4Cc0vInsvn;
    }
}

