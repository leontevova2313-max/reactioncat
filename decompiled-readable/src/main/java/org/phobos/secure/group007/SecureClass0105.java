/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1255;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2818;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group008.SecureClass0123;
import org.phobos.secure.group018.SecureClass0298;
import org.phobos.secure.group026.SecureClass0451;
import org.phobos.secure.group044.SecureInterface0110;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class SecureClass0105<I extends SecureInterface0110, M extends SecureClass0451<I>>
implements Runnable {
    public final /* synthetic */ int field001;
    public final /* synthetic */ int field002;
    public final /* synthetic */ int field003;
    public final /* synthetic */ class_1255<Runnable> field004;
    public final /* synthetic */ Map<class_2338, I> field005;
    @Nullable
    public final /* synthetic */ SecureClass0123 field006;
    public final /* synthetic */ int field007;
    public final /* synthetic */ M field008;
    public final /* synthetic */ int field009;
    public final /* synthetic */ SecureClass0298 field010;
    public final /* synthetic */ int field011;
    public static final /* synthetic */ Logger field012;
    public final /* synthetic */ class_1937 field013;

    public /* synthetic */ SecureClass0105(class_1255<Runnable> n2QVSMTmB0yaOzOHbh8Nlomowj7UD4JE, class_2818 EpCgB112O5bfPXxmkoOI23n3UkLA7nhk, SecureClass0123 bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy2, int n, int i3BS9gbr0IjejwPlC888ABgxswUOqWZh, M kT9IHYwcsYimFw3NAOZhN2M9AIqojLBL) {
        this(new HashMap<K, V>(), n2QVSMTmB0yaOzOHbh8Nlomowj7UD4JE, EpCgB112O5bfPXxmkoOI23n3UkLA7nhk.method_12200(), new SecureClass0298(), kT9IHYwcsYimFw3NAOZhN2M9AIqojLBL, bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy2, EpCgB112O5bfPXxmkoOI23n3UkLA7nhk.method_12004().field_9181 * 16 - 1, EpCgB112O5bfPXxmkoOI23n3UkLA7nhk.method_12004().field_9181 * 16 + 16 + 1, i3BS9gbr0IjejwPlC888ABgxswUOqWZh, n, EpCgB112O5bfPXxmkoOI23n3UkLA7nhk.method_12004().field_9180 * 16 - 1, EpCgB112O5bfPXxmkoOI23n3UkLA7nhk.method_12004().field_9180 * 16 + 16 + 1);
    }

    static {
        field012 = LoggerFactory.getLogger(SecureClass0105.class);
    }

    public /* synthetic */ SecureClass0105(Map<class_2338, I> map, class_1255<Runnable> gBohKBr7FxVs0fitcJs4wKwmYepjye32, class_1937 xMSlUqv45zFmAiFh8KjicM3clA9mzMag, SecureClass0298 biM4xSmFz0q28tVEj2yYcZ2xB9gIos0u, M DGWZuX2RfoxrX0b5C0UTsiP9l7gVAETp, @Nullable SecureClass0123 yEAlZVmWOysMziLwj8HobR17ALr1Hn4s, int n, int HG1wQuPLreywdQDz7MCfmNx2d3VL1cFK, int EsWHAmLVDR3kB7GFM6LQK2cFyAykC3Hc, int UWjy4hdznbdtL3hwMroMMI6a9P5yKre1, int wTSoupOzyEyHzvBFn6TPEmjKH6EVT9eh, int gEyzFdA2ZuSLikb1rVsacgPzoBGs0TLX) {
        this.field005 = map;
        this.field004 = gBohKBr7FxVs0fitcJs4wKwmYepjye32;
        this.field013 = xMSlUqv45zFmAiFh8KjicM3clA9mzMag;
        this.field010 = biM4xSmFz0q28tVEj2yYcZ2xB9gIos0u;
        this.field008 = DGWZuX2RfoxrX0b5C0UTsiP9l7gVAETp;
        this.field006 = yEAlZVmWOysMziLwj8HobR17ALr1Hn4s;
        this.field002 = n;
        this.field009 = HG1wQuPLreywdQDz7MCfmNx2d3VL1cFK;
        this.field003 = EsWHAmLVDR3kB7GFM6LQK2cFyAykC3Hc;
        this.field011 = UWjy4hdznbdtL3hwMroMMI6a9P5yKre1;
        this.field001 = wTSoupOzyEyHzvBFn6TPEmjKH6EVT9eh;
        this.field007 = gEyzFdA2ZuSLikb1rVsacgPzoBGs0TLX;
    }
}

