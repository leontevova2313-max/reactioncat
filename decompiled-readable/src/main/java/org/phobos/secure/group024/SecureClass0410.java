/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import java.util.HashMap;
import java.util.Map;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.fzD7MjQDaWgbIpNQcE6CrpPnP5fE2kPy;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;

public class SecureClass0410
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<fzD7MjQDaWgbIpNQcE6CrpPnP5fE2kPy> field001;
    public final /* synthetic */ Map<Integer, Long> field002;
    public final /* synthetic */ SecureClass0603<Float> field003;
    public final /* synthetic */ SecureClass0603<Long> field004;
    public final /* synthetic */ SecureClass0603<Integer> field005;

    public /* synthetic */ SecureClass0410(SecureClass0242 lVi9QqAmV6DsFVxz7vPtfth0duWk917L) {
        super(lVi9QqAmV6DsFVxz7vPtfth0duWk917L, "AutoPearlBlock", "Blocks pearls with blocks", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 4);
        this.field001 = new SecureClass0033<fzD7MjQDaWgbIpNQcE6CrpPnP5fE2kPy>("Mode", fzD7MjQDaWgbIpNQcE6CrpPnP5fE2kPy.Single).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0840("Delay", 1000L, 0L, 2000L, true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass0962<Integer>("Prediction", 2, 0, 5).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0962<Float>("Delta", Float.valueOf(0.5f), Float.valueOf(0.0f), Float.valueOf(1.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new HashMap<Integer, Long>();
    }
}

