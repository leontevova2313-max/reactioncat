/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class RescaleModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> ratio;
    public static /* synthetic */ RescaleModule field001;

    public static /* bridge */ /* synthetic */ float HgZDCck4IVesnWUBjaXqB2yOonplYz0Z() {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? RescaleModule.field001.ratio.getValue().floatValue() : (float)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4489() / (float)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4506();
    }

    public /* synthetic */ RescaleModule(SecureClass0242 gu5jvR0aFQd6EdhkxNClJILrVfhv4BE4) {
        super(gu5jvR0aFQd6EdhkxNClJILrVfhv4BE4, "Rescale", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Changes aspect ratio", new int[0]);
        this.ratio = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Ratio", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)));
        field001 = this;
    }
}

