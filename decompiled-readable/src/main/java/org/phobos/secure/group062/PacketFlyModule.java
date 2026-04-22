/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group062;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_2596;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.PU0LDGnWAO7cHQcgGjdNpKxPGFvNESN1;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group029.xT1zWwekoFvwUAwbbmqNsNdgTbNmBrZA;
import org.phobos.secure.group033.SecureClass0581;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass0995;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.zmwRYtHCEoHfM631RdYesT6d7a1GxQiO;
import org.phobos.secure.group060.CxAU0yaJrHz5Hwc1obP29z4KBimH0ylZ;
import org.phobos.secure.group061.SecureClass1109;
import org.phobos.secure.group044.SecureClass0782;
import org.phobos.secure.group046.SecureClass0814;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class PacketFlyModule
extends SecureClass1027 {
    public final /* synthetic */ Set<class_2596<?>> field001;
    public final /* synthetic */ Map<Integer, xT1zWwekoFvwUAwbbmqNsNdgTbNmBrZA> field002;
    public final /* synthetic */ SecureClass0603<PU0LDGnWAO7cHQcgGjdNpKxPGFvNESN1> field003;
    public /* synthetic */ float field004;
    public /* synthetic */ int field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<zmwRYtHCEoHfM631RdYesT6d7a1GxQiO> field007;
    public final /* synthetic */ SecureClass0603<Float> field008;
    public final /* synthetic */ SecureClass0603<CxAU0yaJrHz5Hwc1obP29z4KBimH0ylZ> field009;
    public final /* synthetic */ AtomicInteger field010;

    public /* synthetic */ PacketFlyModule(SecureClass0242 hCMgkfwyNnGB1O2HBujirlVJqHzWQlOA) {
        super(hCMgkfwyNnGB1O2HBujirlVJqHzWQlOA, "PacketFly", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Allows you to fly through blocks", new int[0]);
        this.field003 = new SecureClass0033<PU0LDGnWAO7cHQcgGjdNpKxPGFvNESN1>("Mode", PU0LDGnWAO7cHQcgGjdNpKxPGFvNESN1.Factor).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field009 = new SecureClass0033<CxAU0yaJrHz5Hwc1obP29z4KBimH0ylZ>("Type", CxAU0yaJrHz5Hwc1obP29z4KBimH0ylZ.Up).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass0033<zmwRYtHCEoHfM631RdYesT6d7a1GxQiO>("Phase", zmwRYtHCEoHfM631RdYesT6d7a1GxQiO.Full).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass1022("AntiKick", true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field008 = new SecureClass0962<Float>("Factor", Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new ConcurrentHashMap<Integer, xT1zWwekoFvwUAwbbmqNsNdgTbNmBrZA>();
        this.field001 = ConcurrentHashMap.newKeySet();
        this.field010 = new AtomicInteger();
        this.cfr_renamed_69(new SecureClass0581(this));
        this.cfr_renamed_69(new SecureClass0995(this));
        this.cfr_renamed_69(new SecureClass0782(this));
        this.cfr_renamed_69(new SecureClass1109(this));
        this.cfr_renamed_69(new SecureClass0814(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field004 = 1.0f;
            this.field005 = 0;
            this.field010.set(0);
            this.field001.clear();
            this.field002.clear();
        });
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

