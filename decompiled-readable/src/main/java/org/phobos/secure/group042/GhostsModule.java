/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group042;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.iVuDyKHWgoyHT7EzAsosRiZUy8RnmWUm;
import org.phobos.secure.group029.SecureClass0506;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group047.y2Bd2HlOre3qIsF0WIhYDhKmiC5nCBwu;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class GhostsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ Map<SecureClass0506, Long> field001;
    public final /* synthetic */ SecureClass0603<Long> fade;

    public /* synthetic */ GhostsModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Ghosts", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Fades out entities when they disappear", new int[0]);
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 16.0, 3.0, 300.0));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Fade", 1000L, 50L, 5000L));
        this.field001 = new ConcurrentHashMap<SecureClass0506, Long>();
        this.cfr_renamed_69(new y2Bd2HlOre3qIsF0WIhYDhKmiC5nCBwu(this));
        this.cfr_renamed_69(new iVuDyKHWgoyHT7EzAsosRiZUy8RnmWUm(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, this.field001::clear);
    }
}

