/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group043;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group021.SecureClass0341;
import org.phobos.secure.group053.kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class KillSoundModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas> field001;
    public final /* synthetic */ SecureClass0603<Float> field002;

    public /* synthetic */ KillSoundModule(SecureClass0242 ijvkt5F3oPgvtsXgm7z2vKHbyiZCfA2j) {
        super(ijvkt5F3oPgvtsXgm7z2vKHbyiZCfA2j, "KillSound", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Plays a sound when someone dies", new int[0]);
        this.field001 = new SecureClass0033<kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas>("Mode", kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas.Normal).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0962<Float>("Volume", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(1.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass0341(this));
        this.field001.cfr_renamed_123(RigPWkxh9KLFon5XivVilYf01rrzzNl5 -> {
            if (SecureClass0128.mgivZ9HvOERr50C4QkIXJJcJ5UOPu4gl) {
                return;
            }
            ijvkt5F3oPgvtsXgm7z2vKHbyiZCfA2j.OJrowqXXDUVCHM8j1N4mhZc7WZwFEY1k().xKfjJe2c33XIv8iDvJckD02m8AuJjJnR(RigPWkxh9KLFon5XivVilYf01rrzzNl5.o5elywBjGVQCbYpQdM9lCPUoKcuq9Un8(ijvkt5F3oPgvtsXgm7z2vKHbyiZCfA2j), this.field002.getValue().floatValue());
        });
    }
}

