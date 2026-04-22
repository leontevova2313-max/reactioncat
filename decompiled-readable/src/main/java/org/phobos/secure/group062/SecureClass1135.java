/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1657;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group041.XpSivbPRCbTjqO7omteYsg3q6R8k2slr;
import org.phobos.secure.group063._22WODnzRO3tgf8tQYv43rNL1ylmEjxzO;
import org.phobos.secure.group020.OtztK8chJVJuhPCjFCLqMudWBp2T892q;
import org.phobos.secure.group020.lfOVKoBNC2HmJBKypdphS3J9Ak6LESuW;
import org.phobos.secure.group030.Q5uM4IZt20BFI8H2mQYKPTiXWpFvyEzZ;
import org.phobos.secure.group037.HRzTIcVhKsWfblcJyPw7E3NDLLBVyNfd;
import org.phobos.secure.group040.SecureInterface0102;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass1135
extends SecureClass0966
implements SecureInterface0102 {
    public final /* synthetic */ Map<class_1657, lfOVKoBNC2HmJBKypdphS3J9Ak6LESuW> field001;
    public final /* synthetic */ Map<UUID, OtztK8chJVJuhPCjFCLqMudWBp2T892q> field002;
    public static /* synthetic */ int field003;

    static {
        field003 = -1;
    }

    public /* synthetic */ SecureClass1135(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        this.field001 = new ConcurrentHashMap<class_1657, lfOVKoBNC2HmJBKypdphS3J9Ak6LESuW>();
        this.field002 = new HashMap<UUID, OtztK8chJVJuhPCjFCLqMudWBp2T892q>();
        this.cfr_renamed_69(new _22WODnzRO3tgf8tQYv43rNL1ylmEjxzO(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new HRzTIcVhKsWfblcJyPw7E3NDLLBVyNfd(this, 20, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new Q5uM4IZt20BFI8H2mQYKPTiXWpFvyEzZ(this));
        this.cfr_renamed_69(new XpSivbPRCbTjqO7omteYsg3q6R8k2slr(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field001::clear);
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field002::clear);
    }
}

