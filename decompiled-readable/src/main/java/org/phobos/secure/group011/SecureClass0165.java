/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.phobos.secure.group021.SecureInterface0055;

public class SecureClass0165 {
    public static /* bridge */ /* synthetic */ <T> void dETcuhA3nh1SyVxrdYYpptNB8oYUA2c8(SecureInterface0055 Yn8Ta1XVehZTXFzsue5pjYrwTDt6fRZX, Class<T> Bzebj4S2Scnof0wgcoDzvcXxbKwJfoxM, T t, String HkNmSHJV1rTBklydBoqSh5SoyAEFg0bn, Object ... yYVvIcoFaYMpr9WsXCGMCfH67bhDous5) {
        try {
            Bzebj4S2Scnof0wgcoDzvcXxbKwJfoxM.getDeclaredMethod(HkNmSHJV1rTBklydBoqSh5SoyAEFg0bn, yYVvIcoFaYMpr9WsXCGMCfH67bhDous5.getClass()).invoke(t, yYVvIcoFaYMpr9WsXCGMCfH67bhDous5);
        }
        catch (Exception Zw7G88ftZUMBdhYHeTWtjFh0gYLrxEOS) {
            Yn8Ta1XVehZTXFzsue5pjYrwTDt6fRZX.cfr_renamed_243(Zw7G88ftZUMBdhYHeTWtjFh0gYLrxEOS);
        }
    }

    public static /* bridge */ /* synthetic */ List<Class<?>> cfr_renamed_244(File file, String MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2) throws ClassNotFoundException {
        ArrayList<Class<?>> field001 = new ArrayList<Class<?>>();
        if (!file.exists()) {
            return field001;
        }
        File[] field002 = file.listFiles();
        assert (field002 != null);
        File[] fileArray = field002;
        int n = fileArray.length;
        int n2 = 0;
        while (n2 < n) {
            File field003 = fileArray[n2];
            if (field003.isDirectory()) {
                assert (!field003.getName().contains("."));
                field001.addAll(SecureClass0165.cfr_renamed_244(field003, MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2 + "." + field003.getName()));
            } else if (field003.getName().endsWith(".class")) {
                field001.add(Class.forName(MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2 + "." + field003.getName().substring(0, field003.getName().length() - 6)));
            }
            ++n2;
        }
        return field001;
    }

    public static /* bridge */ /* synthetic */ Class<?>[] Kny1GjPjLPCNyd7QTP7IjYu5K2MVNodN(String hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K) throws ClassNotFoundException, IOException {
        ClassLoader field004 = Thread.currentThread().getContextClassLoader();
        assert (field004 != null);
        String field005 = hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K.replace('.', '/');
        Enumeration<URL> field006 = field004.getResources(field005);
        ArrayList<File> field007 = new ArrayList<File>();
        while (field006.hasMoreElements()) {
            URL uRL = field006.nextElement();
            field007.add(new File(uRL.getFile()));
        }
        ArrayList<Class<?>> field008 = new ArrayList<Class<?>>();
        Iterator<E> iterator = field007.iterator();
        while (iterator.hasNext()) {
            File field009 = (File)iterator.next();
            field008.addAll(SecureClass0165.cfr_renamed_244(field009, hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K));
        }
        return field008.toArray(new Class[0]);
    }
}

