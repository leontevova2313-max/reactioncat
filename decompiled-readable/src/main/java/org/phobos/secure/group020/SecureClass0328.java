/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import java.util.function.Supplier;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group011.SecureClass0169;
import org.phobos.secure.group017.WKRUpaUOefASPaZD5MtaHwqUiIns4owq;
import org.phobos.secure.group035._2GsFX0fNzWXgMthoLd1KVPNB7zis8hRs;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group023.SecureClass0393;
import org.phobos.secure.group042.SecureClass0755;
import org.phobos.secure.group043.SecureClass0770;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0328
extends SecureClass0870<SecureClass0328>
implements SecureInterface0134,
SecureInterface0143 {
    public final /* synthetic */ SecureInterface0052 field001;
    public final /* synthetic */ SecureClass0169 field002;
    public final /* synthetic */ SecureClass0393 field003;
    public final /* synthetic */ SecureClass0393 field004;
    public static /* synthetic */ SecureClass0328 field005;

    public /* synthetic */ SecureClass0328() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field001 = new SecureClass0894();
        this.field002 = new SecureClass0169(this.field001);
        Supplier<Float> supplier = () -> Float.valueOf(54.0f);
        Supplier<Float> field006 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 - 217.0));
        this.field004 = this.field002.cfr_renamed_727("Internal", false);
        this.field004.I2AhfFcJgekm2JXn5CAiKaUdgu5intdq(new WKRUpaUOefASPaZD5MtaHwqUiIns4owq(this, this.field002, this.field004, 0.0f, 0.0f, 212.0f, 15.0f, null, "Register", new SecureClass0667("Register", "name -> type -> address:port?@username:password")));
        this.field004.I2AhfFcJgekm2JXn5CAiKaUdgu5intdq(new SecureClass0770((SecureClass0874)this.field002, (SecureClass0755)this.field004, 0.0f, 0.0f, 212.0f, 15.0f, null, "Force-Detach", new _2GsFX0fNzWXgMthoLd1KVPNB7zis8hRs(this, "Force-Detach")));
        this.field004.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field004.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field006.get().floatValue());
        this.field004.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field006);
        this.field004.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(supplier.get().floatValue());
        this.field004.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(supplier);
        Supplier<Float> field007 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 + 1.0));
        this.field003 = this.field002.cfr_renamed_727("Cloud", true);
        this.field003.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field003.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field007.get().floatValue());
        this.field003.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field007);
        this.field003.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(supplier.get().floatValue());
        this.field003.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(supplier);
    }

    static {
        field005 = new SecureClass0328();
    }
}

