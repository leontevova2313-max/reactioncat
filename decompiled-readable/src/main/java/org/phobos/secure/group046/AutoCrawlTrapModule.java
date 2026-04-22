/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group046;

import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.KKVtyWqDsFcS4VLpGzutrn6f9oIsoA8M;
import org.phobos.secure.group056.SecureClass1022;

public class AutoCrawlTrapModule
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> full;
    public final /* synthetic */ SecureClass0603<Float> field002;
    public final /* synthetic */ SecureClass0603<Boolean> async;
    public final /* synthetic */ SecureClass0603<Integer> predictionTicks;

    public static /* bridge */ /* synthetic */ void cfr_renamed_919(AutoCrawlTrapModule HjZp8mcZg2yCX5CeqRTI7QEpe4BrBfVb, class_746 M14SQVv4x03cJMJw6AvpAjsdT7FLxc5X, class_638 uuHX96OVhd1kScIIC1S8l9y0YSHlguiG, class_636 class_6362) {
        HjZp8mcZg2yCX5CeqRTI7QEpe4BrBfVb.cfr_renamed_920(M14SQVv4x03cJMJw6AvpAjsdT7FLxc5X, uuHX96OVhd1kScIIC1S8l9y0YSHlguiG, class_6362);
    }

    public /* synthetic */ AutoCrawlTrapModule(SecureClass0242 O5P4jCLz4ZvcfgnftpvapY6xaYrshApR) {
        super(O5P4jCLz4ZvcfgnftpvapY6xaYrshApR, "AutoCrawlTrap", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 2);
        this.field002 = new SecureClass0962<Float>("Extension", Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.5f)).cfr_renamed_85("Off", Float.valueOf(3.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.predictionTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PredictionTicks", 1, 0, 6));
        this.full = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Full").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Places at all predicted positions"));
        this.async = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Async").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Updates with blocks"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.predictionTicks, this.full);
        this.cfr_renamed_69(new KKVtyWqDsFcS4VLpGzutrn6f9oIsoA8M(this));
    }
}

