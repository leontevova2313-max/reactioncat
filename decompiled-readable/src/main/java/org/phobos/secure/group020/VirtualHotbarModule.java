/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import java.util.Map;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.SecureClass0308;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class VirtualHotbarModule
extends SecureClass1027 {
    public static /* synthetic */ VirtualHotbarModule field001;
    public /* synthetic */ SecureClass0308 field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public /* synthetic */ Map<Integer, Integer> field004;
    public /* synthetic */ Map<Integer, Integer> field005;

    public /* synthetic */ VirtualHotbarModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "VirtualHotbar", SecureClass1004.cfr_renamed_106, "Simulates an additional hotbar", new int[0]);
        this.field003 = new SecureClass1022("Setup").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = null;
        this.field004 = null;
        this.field003.cfr_renamed_123(Ll1xvpW0QRdqmZSzL7Rv1bmBKNSmWEEd -> {
            if (this.field003.getValue().booleanValue()) {
                if (VirtualHotbarModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null) {
                    this.field002 = SecureClass0308.K0XrUCjgAty6jSrzmDB5ECnG4eLVoV9J(VirtualHotbarModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724);
                }
                this.field003.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ VirtualHotbarModule t8OOgUV8QjOdQ6yvZvfdK7W6C0VSEZTO() {
        return field001;
    }
}

