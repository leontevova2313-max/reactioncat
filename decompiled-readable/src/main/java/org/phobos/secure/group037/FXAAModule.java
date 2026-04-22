/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import net.minecraft.class_2960;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureClass0275;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.SecureInterface0145;
import org.phobos.secure.group028.SecureInterface0078;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class FXAAModule
extends SecureClass1027 {
    public final /* synthetic */ SecureInterface0078 field001;
    public final /* synthetic */ SecureClass0603<Float> field002;
    public final /* synthetic */ SecureClass0603<Float> field003;

    public /* synthetic */ FXAAModule(SecureClass0242 QIlUa1ZgTMRvj3iM0vm1OR0ev1YNMBLt) {
        super(QIlUa1ZgTMRvj3iM0vm1OR0ev1YNMBLt, "FXAA", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "FXAA filtering", new int[0]);
        this.field003 = new SecureClass0962<Float>("Span", Float.valueOf(8.0f), Float.valueOf(0.1f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0962<Float>("Delta", Float.valueOf(128.0f), Float.valueOf(64.0f), Float.valueOf(256.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = SecureInterface0145.PtJPKA0EcuQD6qGGWW8Wiw1qVYm5uv9q().W98DCRGPPn9wQTrN0A6aZOlmFHwFuO3t(class_2960.method_60655((String)"phoboslite", (String)"shaders/post/fxaa.json"), rIcsf0Pv3ZtcaX67Xp1XbxSTjJVMFxRd -> {
            rIcsf0Pv3ZtcaX67Xp1XbxSTjJVMFxRd.mFbO5XMYInzZ19UJBvs0LL4u1oRZzYI2("resolution", P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4486(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4502());
            rIcsf0Pv3ZtcaX67Xp1XbxSTjJVMFxRd.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("span", this.KgRuywi2ybPdWjGifLw8voBQrFbNGT4m());
            rIcsf0Pv3ZtcaX67Xp1XbxSTjJVMFxRd.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("multiplication", this.uZEURdPGPqpoWpmUVYK7ZFLCwoN0cH0r());
            rIcsf0Pv3ZtcaX67Xp1XbxSTjJVMFxRd.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("minimum", this.UVNrcJGisdtRTjLW28DxVAH2gsnDLL1M());
        });
        this.cfr_renamed_69(new SecureClass0275(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

