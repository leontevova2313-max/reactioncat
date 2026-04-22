/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import net.minecraft.class_3532;
import net.minecraft.class_4587;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1027;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class NoBobModule
extends SecureClass1027 {
    public static /* synthetic */ NoBobModule field001;

    public static /* bridge */ /* synthetic */ boolean i4ILpHjCmOJs6zS7CzGBunJqrmcO81Il(class_4587 S7V0BcCFEsWAsFegFKKIDkFCWTpQkVrJ, float waxtax01FTJg7q9zV8myPfQ0nSypfCuZ) {
        if (NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return false;
        }
        float field002 = -(NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_5973 + (NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_5973 - NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_6039) * waxtax01FTJg7q9zV8myPfQ0nSypfCuZ);
        float field003 = class_3532.method_16439((float)waxtax01FTJg7q9zV8myPfQ0nSypfCuZ, (float)NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_7505, (float)NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.field_7483);
        S7V0BcCFEsWAsFegFKKIDkFCWTpQkVrJ.method_22904(0.0, -Math.abs((double)(field002 * field003) * 3.5E-4), 0.0);
        return true;
    }

    public static /* bridge */ /* synthetic */ boolean lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL() {
        return field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public /* synthetic */ NoBobModule(SecureClass0242 MygbCkOFtpWypMSfVuJsb2PgWA6h36td) {
        super(MygbCkOFtpWypMSfVuJsb2PgWA6h36td, "NoBob", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Minimizes bobbing effect", new int[0]);
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ void Npew5hEDxS9WEAOKGGqJcDIkSGpvzrTt(class_4587 class_45872, float jnbkSn3f9GzWlPQVtJklPGGEWi0Rsn69, CallbackInfo V2m6ascll6otobNqzDzyIUbBQkKQYbt0) {
        if (field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NoBobModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null) {
            NoBobModule.i4ILpHjCmOJs6zS7CzGBunJqrmcO81Il(class_45872, jnbkSn3f9GzWlPQVtJklPGGEWi0Rsn69);
            V2m6ascll6otobNqzDzyIUbBQkKQYbt0.cancel();
            return;
        }
    }
}

