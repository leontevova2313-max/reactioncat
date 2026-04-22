/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group006;

import org.phobos.secure.group012.SecureClass0183;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoToolModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static /* synthetic */ AutoToolModule field003;

    public /* synthetic */ AutoToolModule(SecureClass0242 MS19fGILrLWCab38aj6JzpEvmbmQSFby) {
        super(MS19fGILrLWCab38aj6JzpEvmbmQSFby, "AutoTool", SecureClass1004.cfr_renamed_106, "Selects the best mining tool", new int[0]);
        this.field001 = new SecureClass1022("Inventory").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Gets items from inventory").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("Silent").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Switches to the item right before breaking").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass0183(this));
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ AutoToolModule cfr_renamed_151() {
        return field003;
    }

    public static /* bridge */ /* synthetic */ boolean zzo7KIdqlstmB4oY9clp6MylKwSwHx8F() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AutoToolModule.field003.field002.getValue() != false;
    }
}

