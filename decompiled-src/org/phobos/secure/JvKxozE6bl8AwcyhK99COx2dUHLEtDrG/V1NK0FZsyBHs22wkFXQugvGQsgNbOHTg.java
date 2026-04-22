/*
 * Decompiled with CFR.
 */
package org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG;

import java.awt.image.BufferedImage;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.concurrent.locks.ReentrantLock;
import javax.imageio.ImageIO;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.HcMkjfCcSAPDKCcTgKekbZEI1uM2v5ce;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.yAnzKEKZ7UjpbPT8gBDhHdfXiwSXFd16;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.pYhDd3f8yVrOkgyttMO1P7mTdejXSfA0;

public class V1NK0FZsyBHs22wkFXQugvGQsgNbOHTg
extends yAnzKEKZ7UjpbPT8gBDhHdfXiwSXFd16 {
    public /* synthetic */ class_1043 gwHYciquuWB26IeffGnkCPhWVkkWJyz6;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<String> PML65gh2JKQ3PdIFzAOR43acfcbJg6XY;
    public final /* synthetic */ ReentrantLock cfr_renamed_467;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Float> EoYNoss44AumiEEPVWbIsnAg4cUjLNxF;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Float> M1y1LAABDCr9eCS8dcQfulJABiZQbXdK;

    public /* synthetic */ V1NK0FZsyBHs22wkFXQugvGQsgNbOHTg() {
        super("Image", 0.0f, 0.0f, 0.0f, 0.0f);
        this.PML65gh2JKQ3PdIFzAOR43acfcbJg6XY = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC("Path", ""));
        this.EoYNoss44AumiEEPVWbIsnAg4cUjLNxF = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new pYhDd3f8yVrOkgyttMO1P7mTdejXSfA0<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.01f), Float.valueOf(5.0f)));
        this.M1y1LAABDCr9eCS8dcQfulJABiZQbXdK = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new pYhDd3f8yVrOkgyttMO1P7mTdejXSfA0<Float>("Height", Float.valueOf(1.0f), Float.valueOf(0.01f), Float.valueOf(5.0f)));
        this.cfr_renamed_467 = new ReentrantLock();
        this.cfr_renamed_69(new HcMkjfCcSAPDKCcTgKekbZEI1uM2v5ce(this, Integer.MIN_VALUE));
        this.PML65gh2JKQ3PdIFzAOR43acfcbJg6XY.cfr_renamed_123(ETEX2RKfMgl2rQ9z2sChQSyojRoG1Cfy -> P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> {
            Path path = Path.of(ETEX2RKfMgl2rQ9z2sChQSyojRoG1Cfy, new String[0]);
            if (!Files.exists(path, new LinkOption[0])) {
                return;
            }
            try {
                this.cfr_renamed_467.lock();
                BufferedImage bufferedImage = ImageIO.read(path.toFile());
                this.gwHYciquuWB26IeffGnkCPhWVkkWJyz6 = qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.CvsQtkYVZqlNKJnrVQiASOr9wtxSMBFM(bufferedImage);
                class_1011 w9eIPCnC5WyOSfxX2RrxUPWT4Xi4trSV = this.gwHYciquuWB26IeffGnkCPhWVkkWJyz6.method_4525();
                if (w9eIPCnC5WyOSfxX2RrxUPWT4Xi4trSV == null) {
                    return;
                }
                this.BnY56VCq1HyViVyiJeYvLL8JkD4Iz385((float)w9eIPCnC5WyOSfxX2RrxUPWT4Xi4trSV.method_4307() * this.EoYNoss44AumiEEPVWbIsnAg4cUjLNxF.getValue().floatValue());
                this.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9((float)w9eIPCnC5WyOSfxX2RrxUPWT4Xi4trSV.method_4323() * this.M1y1LAABDCr9eCS8dcQfulJABiZQbXdK.getValue().floatValue());
            }
            catch (Throwable throwable) {
            }
            finally {
                this.cfr_renamed_467.unlock();
            }
        }));
        this.EoYNoss44AumiEEPVWbIsnAg4cUjLNxF.cfr_renamed_123(CkPYKWma5t9k75elcWKa5e19zF142k8I -> this.cfr_renamed_468(CkPYKWma5t9k75elcWKa5e19zF142k8I.floatValue(), this.M1y1LAABDCr9eCS8dcQfulJABiZQbXdK.getValue().floatValue()));
        this.M1y1LAABDCr9eCS8dcQfulJABiZQbXdK.cfr_renamed_123(BawNipjA6l4Gb54eNaewo3MoOIhL0S06 -> this.cfr_renamed_468(this.EoYNoss44AumiEEPVWbIsnAg4cUjLNxF.getValue().floatValue(), BawNipjA6l4Gb54eNaewo3MoOIhL0S06.floatValue()));
    }
}

