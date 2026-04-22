/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import org.phobos.secure.group010.SecureClass0150;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BridgeModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Float> field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<Boolean> field007;
    public final /* synthetic */ SecureClass0603<Boolean> field008;
    public final /* synthetic */ SecureClass0603<Float> field009;

    public /* synthetic */ BridgeModule(SecureClass0242 BCLmG8FSoLy6B4brnm2xBsKnkWNdTh4d) {
        super(BCLmG8FSoLy6B4brnm2xBsKnkWNdTh4d, "Bridge", SecureClass1004.cfr_renamed_106, "Helps you legit bridge", new int[0]);
        this.field009 = new SecureClass0962<Float>("Distance", Float.valueOf(0.4f), Float.valueOf(0.01f), Float.valueOf(1.3f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass1022("Blocks").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass1022("Ground", true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass0962<Float>("Pitch", Float.valueOf(-90.0f), Float.valueOf(-90.0f), Float.valueOf(90.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field008 = new SecureClass1022("Sneak").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass1022("Left").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass1022("Right").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass1022("Forward").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("Backward").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_89("Filter", this.field006, this.field004, this.field005, this.field008, this.field001, this.field007, this.field003, this.field002);
        this.cfr_renamed_69(new SecureClass0150(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

