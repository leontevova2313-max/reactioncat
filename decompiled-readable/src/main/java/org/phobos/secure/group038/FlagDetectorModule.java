/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import net.minecraft.class_1657;
import org.phobos.secure.group008.SecureClass0132;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0415;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.SecureClass1150;
import org.phobos.secure.group021.SecureClass0353;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FlagDetectorModule
extends SecureClass1027 {
    public /* synthetic */ int field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public /* synthetic */ int field003;
    public volatile /* synthetic */ int field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public /* synthetic */ boolean field006;
    public /* synthetic */ class_1657 field007;
    public /* synthetic */ int field008;

    public /* synthetic */ FlagDetectorModule(SecureClass0242 CoW5TlUFxC3Vp1vcERfZchSbCoVdLSfk) {
        super(CoW5TlUFxC3Vp1vcERfZchSbCoVdLSfk, "FlagDetector", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Detects when you are flagging the anticheat", new int[0]);
        this.field002 = new SecureClass1022("Combat", true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass1022("Movement", true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass0132(this));
        this.cfr_renamed_69(new SecureClass1150(this));
        this.cfr_renamed_69(new SecureClass0353(this));
        this.cfr_renamed_69(new SecureClass0415(this));
    }
}

