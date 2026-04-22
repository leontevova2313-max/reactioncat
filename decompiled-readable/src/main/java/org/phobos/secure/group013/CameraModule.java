/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import net.minecraft.class_239;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039.sSMdCTVe8JGITve8jwWFdy4u9llncmx4;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group046.hxwwT5mgDCIVmugwa7ILjiv5TcMrTaRz;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class CameraModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> distance;
    public static /* synthetic */ CameraModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> clip;

    public static /* bridge */ /* synthetic */ class_239.class_240 KNXntM9081EgPPIAoZgPwbmB3jQcORQT(class_239.class_240 Q7QjVSKUMzvuTWOOCRzaF8iGfsnutH49) {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && CameraModule.field001.clip.getValue() != false ? class_239.class_240.field_1333 : Q7QjVSKUMzvuTWOOCRzaF8iGfsnutH49;
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_28(float nLpEN7UE5luMT9fPvFDdUqQYOi9V1HWM) {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? CameraModule.field001.distance.getValue().floatValue() : nLpEN7UE5luMT9fPvFDdUqQYOi9V1HWM;
    }

    public static /* bridge */ /* synthetic */ CameraModule R1WDPHHMTEUzE83h85t64KtwAwO0vMLX() {
        return field001;
    }

    public /* synthetic */ CameraModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Camera", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Manages camera", new int[0]);
        this.clip = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Clip"));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Distance", Float.valueOf(4.0f), Float.valueOf(0.0f), Float.valueOf(20.0f)));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.clip, this.distance);
        this.cfr_renamed_69(new hxwwT5mgDCIVmugwa7ILjiv5TcMrTaRz(this));
        this.cfr_renamed_69(new sSMdCTVe8JGITve8jwWFdy4u9llncmx4(this));
        field001 = this;
    }
}

