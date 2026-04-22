/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import java.util.Iterator;
import java.util.Map;
import net.minecraft.class_1074;
import net.minecraft.class_3414;
import net.minecraft.class_7923;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1027;

public class AntiSoundModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Map<class_3414, Boolean>> sounds;

    public /* synthetic */ AntiSoundModule(SecureClass0242 MZFJG8YE0o5TTdkZXJ590NpouzolcbZs) {
        super(MZFJG8YE0o5TTdkZXJ590NpouzolcbZs, "AntiSound", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, new int[0]);
        this.sounds = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<class_3414>("Sounds", class_3414.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(Caj0Rwe6SWzEEKInc2bImSBrrnBePVRD -> {
            Iterator iterator = class_7923.field_41172.iterator();
            while (iterator.hasNext()) {
                class_3414 field001 = (class_3414)iterator.next();
                Caj0Rwe6SWzEEKInc2bImSBrrnBePVRD.n1W8XPBYJrDzssWYPABQFTJ1vXyEatgH(field001, class_1074.method_4662((String)field001.method_14833().toString(), (Object[])new Object[0]));
            }
            return;
        }));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

