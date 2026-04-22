/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.UDB6XBOymLuC9e7XRkLc6Pt7aeiVoH0u;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class EngineModule
extends SecureClass1027 {
    public static /* synthetic */ EngineModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Double> field005;
    public final /* synthetic */ SecureClass0603<UDB6XBOymLuC9e7XRkLc6Pt7aeiVoH0u> field006;
    public final /* synthetic */ SecureClass0603<Boolean> field007;
    public final /* synthetic */ SecureClass0603<Boolean> field008;
    public final /* synthetic */ SecureClass0603<Boolean> field009;
    public final /* synthetic */ SecureClass0603<Boolean> field010;
    public final /* synthetic */ SecureClass0603<Boolean> field011;
    public final /* synthetic */ SecureClass0603<Boolean> field012;

    public /* synthetic */ EngineModule(SecureClass0242 WSvI4suGCVtQVfYg6kkr7LYpTKIzxCBO) {
        super(WSvI4suGCVtQVfYg6kkr7LYpTKIzxCBO, "Engine", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Controls evaluation systems", new int[0]);
        this.field009 = new SecureClass1022("Teams").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Detects teams & friend groups").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field008 = new SecureClass1022("TeamsDebug").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("Movement").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Runs movement predictions").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass1022("MovementDebug").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass0033<UDB6XBOymLuC9e7XRkLc6Pt7aeiVoH0u>("Breaking", UDB6XBOymLuC9e7XRkLc6Pt7aeiVoH0u.Generic).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Breaking logic").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field010 = new SecureClass1022("Mining").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Predicts what positions will be broken").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field012 = new SecureClass1022("Predictions", true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass0962<Double>("PredictionsMagnitude", 100.0, Double.valueOf(10.0), Double.valueOf(300.0), "%").cfr_renamed_85("Default", 100.0).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field011 = new SecureClass1022("PredictionsStep").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Upwards step prediction").cfr_renamed_247().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field007 = new SecureClass1022("PredictionsFastFall").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Fast fall prediction").cfr_renamed_247().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass1022("PredictionsMachine-Learning").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses position history to evaluate movement behaviour").cfr_renamed_247().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field009, this.field008);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.field003);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field012, this.field005, this.field011, this.field007, this.field004);
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ EngineModule d77jHtmtjEcZaX8VcNg7n9skOp8U5L3R() {
        return field001;
    }
}

