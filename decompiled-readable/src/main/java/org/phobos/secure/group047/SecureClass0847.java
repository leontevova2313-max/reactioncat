/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0847
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Integer> predictionTicks;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> auto;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Boolean> partial;

    public /* synthetic */ SecureClass0847(SecureClass0242 GiCKHN9p8zbSdss0Tc2MO0UJwkl1zQ0H) {
        super(GiCKHN9p8zbSdss0Tc2MO0UJwkl1zQ0H, "HoleFill", "Fills holes around you", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 6);
        this.auto = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Auto"));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 2.5, 1.0, 8.0));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Prediction"));
        this.predictionTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PredictionTicks", 2, 1, 5).cfr_renamed_85("Latency", 5));
        this.partial = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Partial"));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.auto).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.predictionTicks)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.distance).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
    }

    public static /* bridge */ /* synthetic */ double n4aFm7mT3fN59ZGiJf7EmP9V5PVguHwa(class_243 TbCvbo5VpC2aTir7cRZwPo7d8QxPqhnz, class_2338 Vos5G2rUilKrcFelAC7B8NXX0ifcrs5G) {
        return -Vos5G2rUilKrcFelAC7B8NXX0ifcrs5G.method_10268(TbCvbo5VpC2aTir7cRZwPo7d8QxPqhnz.field_1352, TbCvbo5VpC2aTir7cRZwPo7d8QxPqhnz.field_1351, TbCvbo5VpC2aTir7cRZwPo7d8QxPqhnz.field_1350);
    }
}

