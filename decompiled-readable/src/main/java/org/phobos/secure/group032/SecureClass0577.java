/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.locks.ReentrantLock;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import org.phobos.secure.group010.SecureClass0154;
import org.phobos.secure.group013.HcMkjfCcSAPDKCcTgKekbZEI1uM2v5ce;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group053.SecureClass0962;

public class SecureClass0577
extends SecureClass0424 {
    public /* synthetic */ class_1043 field001;
    public final /* synthetic */ SecureClass0603<String> path;
    public final /* synthetic */ ReentrantLock field002;
    public final /* synthetic */ SecureClass0603<Float> width;
    public final /* synthetic */ SecureClass0603<Float> height;

    public /* synthetic */ SecureClass0577() {
        super("Image", 0.0f, 0.0f, 0.0f, 0.0f);
        this.path = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Path", ""));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.01f), Float.valueOf(5.0f)));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Height", Float.valueOf(1.0f), Float.valueOf(0.01f), Float.valueOf(5.0f)));
        this.field002 = new ReentrantLock();
        this.cfr_renamed_69(new HcMkjfCcSAPDKCcTgKekbZEI1uM2v5ce(this, Integer.MIN_VALUE));
        this.path.cfr_renamed_123(ETEX2RKfMgl2rQ9z2sChQSyojRoG1Cfy -> P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> {
            Path path = Path.of(ETEX2RKfMgl2rQ9z2sChQSyojRoG1Cfy, new String[0]);
            if (!Files.exists(path, new LinkOption[0])) {
                return;
            }
            try {
                this.field002.lock();
                BufferedImage bufferedImage = ImageIO.read(path.toFile());
                this.field001 = SecureClass0154.CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(bufferedImage);
                class_1011 field003 = this.field001.method_4525();
                if (field003 == null) {
                    return;
                }
                this.BnY56VCq1HyViVyiJeYvLL8JkD4Iz385((float)field003.method_4307() * this.width.getValue().floatValue());
                this.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9((float)field003.method_4323() * this.height.getValue().floatValue());
            }
            catch (Throwable throwable) {
            }
            finally {
                this.field002.unlock();
            }
        }));
        this.width.cfr_renamed_123(CkPYKWma5t9k75elcWKa5e19zF142k8I -> this.cfr_renamed_468(CkPYKWma5t9k75elcWKa5e19zF142k8I.floatValue(), this.height.getValue().floatValue()));
        this.height.cfr_renamed_123(BawNipjA6l4Gb54eNaewo3MoOIhL0S06 -> this.cfr_renamed_468(this.width.getValue().floatValue(), BawNipjA6l4Gb54eNaewo3MoOIhL0S06.floatValue()));
    }
}

