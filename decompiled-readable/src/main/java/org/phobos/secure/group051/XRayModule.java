/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import java.util.Set;
import net.minecraft.class_2248;
import net.minecraft.class_2404;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group042.SecureClass0738;
import org.phobos.secure.group056.SecureClass1027;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class XRayModule
extends SecureClass1027 {
    public static /* synthetic */ XRayModule field001;
    public final /* synthetic */ SecureClass0603<Set<class_2248>> whitelist;

    public /* synthetic */ XRayModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "XRay", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Makes everything transparent", new int[0]);
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0738("Whitelist", new class_2248[0]));
        field001 = this;
        this.whitelist.cfr_renamed_123(EYUo0XWLQ8JayPaI3xSu82fCpySKfXL9 -> {
            if (!this.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
                return;
            }
            P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> XRayModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.method_3279());
        });
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_25() {
        return field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public static /* bridge */ /* synthetic */ boolean elDZyd5nc38X1YrMr5CoxLKq4G9WhsmN(class_2248 KGjp0NkZfiMlMOcfQSE4s4K4IcUKzm1F) {
        if (field001 == null || !field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return true;
        }
        if (KGjp0NkZfiMlMOcfQSE4s4K4IcUKzm1F instanceof class_2404) {
            return true;
        }
        return XRayModule.field001.whitelist.getValue().contains(KGjp0NkZfiMlMOcfQSE4s4K4IcUKzm1F);
    }

    public static /* bridge */ /* synthetic */ XRayModule j3FsexJAlVmELIfHV7323i4AZBPMLxjs() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ void QbQeuMt9irM15NNuxiwACpPAYBjtt8hR(class_2248 MD51F2wIRHugS4IaYbM2MzQysJmXfiIQ, CallbackInfoReturnable<Boolean> CUkI9IbqbM4yhQlmRiqbrF2PfzIIOCYz) {
        if (field001 == null || !field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return;
        }
        if (MD51F2wIRHugS4IaYbM2MzQysJmXfiIQ instanceof class_2404) {
            CUkI9IbqbM4yhQlmRiqbrF2PfzIIOCYz.setReturnValue((Object)true);
            return;
        }
        CUkI9IbqbM4yhQlmRiqbrF2PfzIIOCYz.setReturnValue((Object)XRayModule.field001.whitelist.getValue().contains(MD51F2wIRHugS4IaYbM2MzQysJmXfiIQ));
    }
}

