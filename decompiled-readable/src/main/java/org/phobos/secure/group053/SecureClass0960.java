/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group053;

import java.util.function.Supplier;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group057.SecureClass1035;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group040.SecureClass0703;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0960
extends SecureClass0870<SecureClass0960>
implements SecureInterface0143 {
    public final /* synthetic */ SecureInterface0052 field001;
    public final /* synthetic */ SecureClass0703 field002;
    public static /* synthetic */ SecureClass0960 field003;
    public final /* synthetic */ SecureClass1035 field004;

    public /* synthetic */ SecureClass0960() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field001 = new SecureClass0894();
        this.field004 = new SecureClass1035(this.field001);
        Supplier<Float> field005 = () -> Float.valueOf(54.0f);
        Supplier<Float> supplier = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 - 217.0));
        this.field002 = this.field004.Y2Mc1pJs5ejB9YxOehIFVw1zz1T0pSws("Store");
        this.field002.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field002.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(supplier.get().floatValue());
        this.field002.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(supplier);
        this.field002.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(field005.get().floatValue());
        this.field002.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(field005);
    }

    static {
        field003 = new SecureClass0960();
    }
}

