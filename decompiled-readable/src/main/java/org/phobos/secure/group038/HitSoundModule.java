/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group013.SecureClass0187;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0877;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.SecureClass1053;
import org.phobos.secure.group053.kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class HitSoundModule
extends SecureClass0187 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Float> field002;
    public final /* synthetic */ SecureClass0603<kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas> field003;

    public /* synthetic */ HitSoundModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "HitSound", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Plays a sound when you hit an entity");
        this.field003 = new SecureClass0033<kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas>("Mode", kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas.Wood).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass1022("Sync").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0962<Float>("Volume", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass1053(this));
        this.cfr_renamed_69(new SecureClass0877(this));
        this.field003.cfr_renamed_123(kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas2 -> ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.OJrowqXXDUVCHM8j1N4mhZc7WZwFEY1k().xKfjJe2c33XIv8iDvJckD02m8AuJjJnR(kgHfTR3q0QmIVmRtm8RKwjxwMIRobuas2.o5elywBjGVQCbYpQdM9lCPUoKcuq9Un8(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb), this.field002.getValue().floatValue()));
    }
}

