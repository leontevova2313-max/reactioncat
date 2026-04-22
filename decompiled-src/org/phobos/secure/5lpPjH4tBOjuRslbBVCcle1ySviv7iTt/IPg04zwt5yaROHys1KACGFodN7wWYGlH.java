/*
 * Decompiled with CFR.
 */
package org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import org.phobos.secure.cxD3bbysrD3GZeMPRiFOph5AKymUJItE.JOKW9fG0OqnAoDYVJQS2r1erneVpqMCE;

public class IPg04zwt5yaROHys1KACGFodN7wWYGlH {
    public static /* bridge */ /* synthetic */ <T> void dETcuhA3nh1SyVxrdYYpptNB8oYUA2c8(JOKW9fG0OqnAoDYVJQS2r1erneVpqMCE Yn8Ta1XVehZTXFzsue5pjYrwTDt6fRZX, Class<T> Bzebj4S2Scnof0wgcoDzvcXxbKwJfoxM, T t, String HkNmSHJV1rTBklydBoqSh5SoyAEFg0bn, Object ... yYVvIcoFaYMpr9WsXCGMCfH67bhDous5) {
        try {
            Bzebj4S2Scnof0wgcoDzvcXxbKwJfoxM.getDeclaredMethod(HkNmSHJV1rTBklydBoqSh5SoyAEFg0bn, yYVvIcoFaYMpr9WsXCGMCfH67bhDous5.getClass()).invoke(t, yYVvIcoFaYMpr9WsXCGMCfH67bhDous5);
        }
        catch (Exception Zw7G88ftZUMBdhYHeTWtjFh0gYLrxEOS) {
            Yn8Ta1XVehZTXFzsue5pjYrwTDt6fRZX.cfr_renamed_243(Zw7G88ftZUMBdhYHeTWtjFh0gYLrxEOS);
        }
    }

    public static /* bridge */ /* synthetic */ List<Class<?>> cfr_renamed_244(File file, String MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2) throws ClassNotFoundException {
        ArrayList<Class<?>> BS3JJiYHZEaVssrbw6oNH6F6YgmN1iAm = new ArrayList<Class<?>>();
        if (!file.exists()) {
            return BS3JJiYHZEaVssrbw6oNH6F6YgmN1iAm;
        }
        File[] pA2I4xFPjDOGy7aPwsWCgKX8cLQobE28 = file.listFiles();
        assert (pA2I4xFPjDOGy7aPwsWCgKX8cLQobE28 != null);
        File[] fileArray = pA2I4xFPjDOGy7aPwsWCgKX8cLQobE28;
        int n = fileArray.length;
        int n2 = 0;
        while (n2 < n) {
            File MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu = fileArray[n2];
            if (MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.isDirectory()) {
                assert (!MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.getName().contains("."));
                BS3JJiYHZEaVssrbw6oNH6F6YgmN1iAm.addAll(IPg04zwt5yaROHys1KACGFodN7wWYGlH.cfr_renamed_244(MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu, MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2 + "." + MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.getName()));
            } else if (MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.getName().endsWith(".class")) {
                BS3JJiYHZEaVssrbw6oNH6F6YgmN1iAm.add(Class.forName(MIHSmgA5Nzy3TqAYHUfQZWJ7Bkhl8Gx2 + "." + MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.getName().substring(0, MPwMzcq7qGLsSRf4Zuej4aEXTrmZlUIu.getName().length() - 6)));
            }
            ++n2;
        }
        return BS3JJiYHZEaVssrbw6oNH6F6YgmN1iAm;
    }

    public static /* bridge */ /* synthetic */ Class<?>[] Kny1GjPjLPCNyd7QTP7IjYu5K2MVNodN(String hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K) throws ClassNotFoundException, IOException {
        ClassLoader jHo50AoS0rOQuSzPmxfAU05l46CmioSP = Thread.currentThread().getContextClassLoader();
        assert (jHo50AoS0rOQuSzPmxfAU05l46CmioSP != null);
        String J2Lq41uHOPcCmx8bbJ27bwRCXQERDOwD = hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K.replace('.', '/');
        Enumeration<URL> iTo4bOcQKItXZtW5G1Dlvj78e1cCaQMd = jHo50AoS0rOQuSzPmxfAU05l46CmioSP.getResources(J2Lq41uHOPcCmx8bbJ27bwRCXQERDOwD);
        ArrayList<File> gTr4jtzBfXmuwP4gYRjIZSGMxH95KkFo = new ArrayList<File>();
        while (iTo4bOcQKItXZtW5G1Dlvj78e1cCaQMd.hasMoreElements()) {
            URL uRL = iTo4bOcQKItXZtW5G1Dlvj78e1cCaQMd.nextElement();
            gTr4jtzBfXmuwP4gYRjIZSGMxH95KkFo.add(new File(uRL.getFile()));
        }
        ArrayList<Class<?>> IcsA5AfJmTqJtkpU7DazTzWBnxKsU4Sj = new ArrayList<Class<?>>();
        Iterator<E> iterator = gTr4jtzBfXmuwP4gYRjIZSGMxH95KkFo.iterator();
        while (iterator.hasNext()) {
            File GemAZuqME3PigQUQ55KwlaVL5RqPgOZz = (File)iterator.next();
            IcsA5AfJmTqJtkpU7DazTzWBnxKsU4Sj.addAll(IPg04zwt5yaROHys1KACGFodN7wWYGlH.cfr_renamed_244(GemAZuqME3PigQUQ55KwlaVL5RqPgOZz, hCbsrUynpq04uUFpb4mMUYrfz9xpDs3K));
        }
        return IcsA5AfJmTqJtkpU7DazTzWBnxKsU4Sj.toArray(new Class[0]);
    }
}

