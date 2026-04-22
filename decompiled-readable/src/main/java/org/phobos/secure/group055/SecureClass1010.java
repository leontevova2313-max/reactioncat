/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass1010
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Float> field001;
    public final /* synthetic */ SecureClass0603<Double> field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Float> field004;

    public /* synthetic */ SecureClass1010(SecureClass0242 ASiRTHc98NIxgdsrTBuYdL59Rvf5X6yz) {
        super(ASiRTHc98NIxgdsrTBuYdL59Rvf5X6yz, "AutoCrystalBlock", "Blocks existing crystals with blocks", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 7);
        this.field002 = new SecureClass0962<Double>("Range", 6.0, 2.0, 16.0).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0962<Float>("Damage", Float.valueOf(6.0f), Float.valueOf(0.1f), Float.valueOf(12.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass0962<Float>("Reduction", Float.valueOf(4.0f), Float.valueOf(0.1f), Float.valueOf(10.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass1022("Extend").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
    }
}

