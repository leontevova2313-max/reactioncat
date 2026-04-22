/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group056.SecureClass1029;

public class SecureClass0104 {
    public static volatile /* synthetic */ boolean field001;
    public static final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;

    public static /* bridge */ /* synthetic */ void lkDyYhsnhlK5vZTZRye81zcr4muub8W8() {
        field002.kBV8JHPVfmyQSmxrXmFgvwxMsYzBEJIy();
        Thread field003 = new Thread(() -> {
            while (!field001) {
                if (!field002.cfr_renamed_61(3000L)) continue;
                SecureClass1029.cfr_renamed_173(SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI());
            }
            return;
        });
        field003.setDaemon(true);
        field003.start();
    }

    public static /* bridge */ /* synthetic */ void B8bktPYEb988HYBxJKOcUGRGqne0FA6x(boolean DCxRJ8Wr1453T3Feg4FEocm5CyXbLxW1) {
        field001 = DCxRJ8Wr1453T3Feg4FEocm5CyXbLxW1;
    }

    static {
        field001 = false;
        field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
    }
}

