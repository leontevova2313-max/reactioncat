/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import net.minecraft.class_2960;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.tttfq19OVween2Eb8Wst0zXmSvINvzTY;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.SecureInterface0145;
import org.phobos.secure.group028.SecureInterface0078;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class MotionBlurModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> vignette;
    public final /* synthetic */ SecureClass0603<Float> scale;
    public final /* synthetic */ SecureInterface0078 field001;
    public final /* synthetic */ SecureClass0603<Integer> amount;

    public /* synthetic */ MotionBlurModule(SecureClass0242 xVvps6bo7AZqX2KS9MfixWkcuxa8LUeL) {
        super(xVvps6bo7AZqX2KS9MfixWkcuxa8LUeL, "MotionBlur", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Adds motion blur", new int[0]);
        this.amount = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Amount", 50, 0, 100));
        this.vignette = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Vignette"));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(0.25f), Float.valueOf(0.0f), Float.valueOf(5.0f)));
        this.field001 = SecureInterface0145.PtJPKA0EcuQD6qGGWW8Wiw1qVYm5uv9q().W98DCRGPPn9wQTrN0A6aZOlmFHwFuO3t(class_2960.method_60655((String)"phoboslite", (String)"shaders/post/motion_blur.json"), EnbvhAsIuSQviLnjrFl1Zl21GymzGNoM -> {
            EnbvhAsIuSQviLnjrFl1Zl21GymzGNoM.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("BlendFactor", this.r1BGjeNQcMPFyhAe7KxRYnMELNj1Csay());
            EnbvhAsIuSQviLnjrFl1Zl21GymzGNoM.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("Falloff", this.scale.getValue().floatValue());
            EnbvhAsIuSQviLnjrFl1Zl21GymzGNoM.MZhNWeQ7fV1H3yMf0JXyeECqGnQJuH7a("Sample0", this.vignette.getValue() != false ? 1.0f : 0.0f);
        });
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.vignette, this.scale);
        this.cfr_renamed_69(new tttfq19OVween2Eb8Wst0zXmSvINvzTY(this));
    }
}

