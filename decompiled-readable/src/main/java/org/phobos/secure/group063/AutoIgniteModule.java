/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group025.SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;

public class AutoIgniteModule
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Map<SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L, Boolean>> targets;
    public final /* synthetic */ Map<class_1657, Long> field001;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ Map<class_2338, class_1792> field002;

    public /* synthetic */ AutoIgniteModule(SecureClass0242 I7WpXH05Lp0B2bJ8UljlPFWisHuGDq81) {
        super(I7WpXH05Lp0B2bJ8UljlPFWisHuGDq81, "AutoIgnite", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 4);
        this.targets = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L>("Targets", SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L.class).vyj2JO6suqRzOglrkzffuHbbCGRijPqL((SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L[])SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L.values(), new Function[0]));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 4.0, 1.0, 6.0).cfr_renamed_110(() -> this.targets.getValue().get((Object)((Object)SDd0emxHr6fd97BUfMn8S8GaKwBv2X3L.Items))));
        this.field002 = new ConcurrentHashMap<class_2338, class_1792>();
        this.field001 = new HashMap<class_1657, Long>();
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("beta", this);
    }
}

