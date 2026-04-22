/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import java.awt.Font;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.SecureClass0620;
import org.phobos.secure.group038.SecureClass0670;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FontModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<String> font2d;
    public final /* synthetic */ SecureClass0603<String> font3d;
    public final /* synthetic */ SecureClass0603<Boolean> onlyAffects3DFont;
    public static final /* synthetic */ Logger field001;
    public static /* synthetic */ FontModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> metrics;
    public final /* synthetic */ SecureClass0603<Float> size;

    static {
        field001 = LoggerFactory.getLogger(FontModule.class);
    }

    public /* synthetic */ FontModule(SecureClass0242 j1dVktDhwUoLcjkOhIoJlPX1pfzCXmVz) {
        super(j1dVktDhwUoLcjkOhIoJlPX1pfzCXmVz, "Font", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Uses custom font", new int[0]);
        this.font2d = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Font2d", "Verdana").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("2D Font (Hud, UI)"));
        this.font3d = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Font3d", "FreeSerif").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("3D Font (Nametags, Items)"));
        this.size = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Size", Float.valueOf(9.0f), Float.valueOf(1.0f), Float.valueOf(16.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Font size"));
        this.onlyAffects3DFont = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Anti-Aliasing").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Only affects 3D Font"));
        this.metrics = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Metrics").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Enables font metrics"));
        field002 = this;
        this.font2d.cfr_renamed_123(lB8fmwKvjVRsfNxpAQhwwwP3qQfoMIm6 -> {
            try {
                SecureClass0242.XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(j1dVktDhwUoLcjkOhIoJlPX1pfzCXmVz.fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg()::T0pUv83IF6zJmEB3EguYxbpIA6npeqx9);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
        });
        this.font3d.cfr_renamed_123(jMFf3JdzdSy8hXORdfMaoHu2PNUUdNuQ -> SecureClass0242.XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(() -> this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv.fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().cfr_renamed_5(new SecureClass0620(new Font[]{Font.decode(this.font3d.getValue())}, 16.0f, 36, 2))));
        this.onlyAffects3DFont.cfr_renamed_123(nm8X6G37pODhFVEBQnayfWfleGLqRzKV -> SecureClass0670.fz0YhTkHTXnlrIaZy4cOFWyrhDvIu8zL().c2fZcsg7UkGtcU51bHGjMgTkFBZAZrid((boolean)nm8X6G37pODhFVEBQnayfWfleGLqRzKV));
        this.metrics.cfr_renamed_123(bcxlD147rWFUzapGpuoDoGIkuitM7m4C -> {
            SecureClass0670.fz0YhTkHTXnlrIaZy4cOFWyrhDvIu8zL().MaR9DsYTy9CzM2rbugTNTLBhNTNTcEVF((boolean)bcxlD147rWFUzapGpuoDoGIkuitM7m4C);
            SecureClass0242.XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(() -> this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv.fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().cfr_renamed_5(new SecureClass0620(new Font[]{Font.decode(this.font3d.getValue())}, 16.0f, 36, 2)));
        });
        this.XExhjkn01ygDfysy3yJqPVDUS9R4uVFK();
    }

    public static /* bridge */ /* synthetic */ FontModule NAZfV3vjZ0ueXZkLFCTcDieuljTG55uh() {
        return field002;
    }
}

