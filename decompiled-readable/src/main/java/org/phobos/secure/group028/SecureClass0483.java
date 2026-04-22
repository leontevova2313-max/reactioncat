/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group028;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1834;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group001.FjVDL6yJqPhrN3XlXXEcomS55TT1C3Mm;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.r7rMLXRuQR5bePYWJD2ROCD4nk3YRkQm;
import org.phobos.secure.group038.SbYelPPyBJfjWpHgWP1KnoaTL6uJbkig;
import org.phobos.secure.group016._4NX4F8Gm8veZYeHpKQ5RkaYvaaoSaDZI;
import org.phobos.secure.group021.MLPxx5K0ffp9QfDyObwA9xvljjhTJm9K;
import org.phobos.secure.group022.IyV58LQBT3Cr1crZYwPnycsUhh2mf2Fs;
import org.phobos.secure.group045.SsdnexkhbvqVMX5Lt1EyDbvSpZ6cbXvt;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0483
extends SecureClass0966 {
    public final /* synthetic */ Map<class_2338, Long> field001;
    @Nullable
    public /* synthetic */ SsdnexkhbvqVMX5Lt1EyDbvSpZ6cbXvt field002;
    public final /* synthetic */ Map<class_2338, Long> field003;
    public final /* synthetic */ Map<class_2338, MLPxx5K0ffp9QfDyObwA9xvljjhTJm9K> field004;

    public static /* bridge */ /* synthetic */ float o9PZs2oWsVIUOhagZiTvQalPlCnySXAe() {
        float field005 = class_1834.field_22033.method_8027();
        if (field005 > 1.0f) {
            field005 += 26.0f;
        }
        return Math.max(field005, 0.0f);
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_800(class_2338 kaPT0R8dPcQgPK1ZEXUaJ33UKaeKmP8z, class_2680 FKaq34Fywcw1PDcl9UzpSXUaolyiJXdk, class_638 lIoxve7TZbMMVFz0jSz5piosgyfZx6kH) {
        float field006 = FKaq34Fywcw1PDcl9UzpSXUaolyiJXdk.method_26214((class_1922)lIoxve7TZbMMVFz0jSz5piosgyfZx6kH, kaPT0R8dPcQgPK1ZEXUaJ33UKaeKmP8z);
        if (field006 == -1.0f || FKaq34Fywcw1PDcl9UzpSXUaolyiJXdk.method_26215()) {
            field006 = class_2246.field_10540.method_9564().method_26214((class_1922)lIoxve7TZbMMVFz0jSz5piosgyfZx6kH, kaPT0R8dPcQgPK1ZEXUaJ33UKaeKmP8z);
        }
        return SecureClass0483.o9PZs2oWsVIUOhagZiTvQalPlCnySXAe() / field006 / 30.0f;
    }

    public /* synthetic */ SecureClass0483(SecureClass0242 YVgz2Pra7c2BtDdaZIU6bAHeCQ8NwB8F) {
        this.field004 = new ConcurrentHashMap<class_2338, MLPxx5K0ffp9QfDyObwA9xvljjhTJm9K>(0);
        this.field001 = new ConcurrentHashMap<class_2338, Long>(0);
        this.field003 = new ConcurrentHashMap<class_2338, Long>();
        this.cfr_renamed_69(new r7rMLXRuQR5bePYWJD2ROCD4nk3YRkQm(this));
        this.cfr_renamed_69(new _4NX4F8Gm8veZYeHpKQ5RkaYvaaoSaDZI(this));
        this.cfr_renamed_69(new IyV58LQBT3Cr1crZYwPnycsUhh2mf2Fs(this));
        this.cfr_renamed_69(new FjVDL6yJqPhrN3XlXXEcomS55TT1C3Mm(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new SbYelPPyBJfjWpHgWP1KnoaTL6uJbkig(this, 1200, YVgz2Pra7c2BtDdaZIU6bAHeCQ8NwB8F));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field004::clear);
    }
}

