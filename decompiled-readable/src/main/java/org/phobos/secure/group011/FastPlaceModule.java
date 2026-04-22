/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

import java.util.Set;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group010.g0T7cWxWTeGodlXTQBM3C2d0nDbuwYRb;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FastPlaceModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> any;
    public final /* synthetic */ SecureClass0603<Boolean> compute;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> whitelist;
    public static /* synthetic */ FastPlaceModule field001;
    public final /* synthetic */ SecureClass0603<Integer> delay;

    public /* synthetic */ FastPlaceModule(SecureClass0242 ldtMkuSam45jSNegT0uK6XXJscK9WNZ3) {
        super(ldtMkuSam45jSNegT0uK6XXJscK9WNZ3, "FastPlace", SecureClass1004.cfr_renamed_106, "Allows for faster interactions", new int[0]);
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Delay", 1, 0, 10));
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Whitelist", new class_1792[0]));
        this.any = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Any"));
        this.compute = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Compute").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Updates delay after item switch"));
        this.cfr_renamed_69(new g0T7cWxWTeGodlXTQBM3C2d0nDbuwYRb(this));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ int CeEiIZFlInmqec33hVGjMJo46PQvPUO6(@NotNull class_1799 wOIBLBibeyVqDrOyNoQ4atXlCiaSf1dW, @NotNull class_1268 rjP3LNYNiXJACgS0AFty1mdIjdvtAaxm) {
        if (!field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return 4;
        }
        if (rjP3LNYNiXJACgS0AFty1mdIjdvtAaxm != class_1268.field_5808) {
            if (FastPlaceModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
                return 0;
            }
            return FastPlaceModule.CeEiIZFlInmqec33hVGjMJo46PQvPUO6(FastPlaceModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_6047(), class_1268.field_5808);
        }
        return FastPlaceModule.field001.whitelist.getValue().contains(wOIBLBibeyVqDrOyNoQ4atXlCiaSf1dW.method_7909()) || FastPlaceModule.field001.any.getValue() != false ? FastPlaceModule.field001.delay.getValue() : 4;
    }
}

