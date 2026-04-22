/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import javax.imageio.ImageIO;
import net.minecraft.class_1043;
import net.minecraft.class_2596;
import net.minecraft.class_2960;
import org.earthhack.ducks.IClientPlayerNetworkHandler;
import org.phobos.secure.group010.SecureClass0154;
import org.phobos.secure.group020.SecureInterface0051;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group054.SecureInterface0134;

public class SecureClass0930
implements SecureInterface0134 {
    public static /* synthetic */ String field001;
    public static /* synthetic */ boolean field002;
    public static final /* synthetic */ class_2960 field003;
    public static /* synthetic */ class_1043 field004;

    public static /* bridge */ /* synthetic */ class_1043 g6MoqwsRlTMoT5QuOynunfkDZkIck1vK(Path jxYyuAQZUfx0DZkj2X2xFbIHmCNPrFUR) {
        File file = jxYyuAQZUfx0DZkj2X2xFbIHmCNPrFUR.toFile();
        if (!file.exists()) {
            return null;
        }
        try {
            BufferedImage field005 = ImageIO.read(file);
            return SecureClass0154.CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(field005);
        }
        catch (Throwable ZzyzrQwDKWHTtDFvACOvbPneXTpiywPN) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void pPFgvgxM1D02XsYLbokyaHYnMp44ojC0(class_2596<?> jZzpeEMWUQog589eqHjAKKVB71b43YpN) {
        if (SecureClass0930.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && jZzpeEMWUQog589eqHjAKKVB71b43YpN != null) {
            ((IClientPlayerNetworkHandler)SecureClass0930.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_3944).pPFgvgxM1D02XsYLbokyaHYnMp44ojC0(jZzpeEMWUQog589eqHjAKKVB71b43YpN);
            return;
        }
    }

    public static /* bridge */ /* synthetic */ boolean qucJRwMfCf4PIktuUsnHn4eWff1wS2ei(String tnu9gWJR7fh2ncw7centDWo7GjRyQMNa) {
        return field001 != null && field001.equals(tnu9gWJR7fh2ncw7centDWo7GjRyQMNa);
    }

    public static /* bridge */ /* synthetic */ void hafXje2J6IZoC2AuvcSv0apT71Yv5YCp(SecureInterface0051 CHqcNSMqUsSZS7e0Wsh39ijxGjnVsaNN) {
        if (SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ() == null) {
            return;
        }
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().cfr_renamed_171(CHqcNSMqUsSZS7e0Wsh39ijxGjnVsaNN);
    }

    public static /* bridge */ /* synthetic */ void ewSf4B2qHowVBkMe5FW729v1UDTPok82() {
        if (!SecureClass0930.yyraQStIALTzcqSdzTgkuwVbUkYRbna6()) {
            return;
        }
        RenderSystem.setShaderTexture((int)0, (int)field004.method_4624());
    }

    public static /* bridge */ /* synthetic */ boolean yyraQStIALTzcqSdzTgkuwVbUkYRbna6() {
        return field004 != null;
    }

    public static /* bridge */ /* synthetic */ String Wa49W5HBaIcC7HAy0eRJ4wNnR4shEUlK(String havgO44BPcIiuXoZDam0NGGWJHAhnE9e) {
        if (field004 != null) {
            field001 = null;
            field004.close();
        }
        String field006 = System.getProperty("user.home");
        Path path = Path.of(field006, "earthhack", "textures");
        if (!path.toFile().exists()) {
            return "Textures folder not found";
        }
        Path field007 = path.resolve(havgO44BPcIiuXoZDam0NGGWJHAhnE9e);
        if (!field007.toFile().exists()) {
            return "File not found";
        }
        try {
            BufferedImage field008 = ImageIO.read(field007.toFile());
            field004 = SecureClass0154.CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(field008);
            field001 = havgO44BPcIiuXoZDam0NGGWJHAhnE9e;
            return null;
        }
        catch (Throwable jq1CKJtoiWV4kfyhnv6zRpWPisq44S9f) {
            return jq1CKJtoiWV4kfyhnv6zRpWPisq44S9f.getMessage();
        }
    }

    static {
        field002 = false;
        field003 = class_2960.method_60655((String)"phobos", (String)"textures/skybox.png");
    }
}

