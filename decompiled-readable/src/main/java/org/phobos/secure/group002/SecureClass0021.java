/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group002;

import java.util.function.Supplier;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group025.SecureClass0436;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group043.SecureClass0769;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0021
extends SecureClass0870<SecureClass0021>
implements SecureInterface0134,
SecureInterface0143 {
    public static /* synthetic */ SecureClass0021 field001;
    public final /* synthetic */ SecureClass0769 field002;
    public final /* synthetic */ SecureClass0436 field003;
    public final /* synthetic */ SecureClass0436 field004;
    public final /* synthetic */ SecureInterface0052 field005;

    public /* synthetic */ SecureClass0021() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field005 = new SecureClass0894();
        this.field002 = new SecureClass0769(this.field005);
        Supplier<Float> field006 = () -> Float.valueOf(54.0f);
        Supplier<Float> field007 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 - 217.0));
        this.field003 = this.field002.dhirGIuEE5wfYsepadSe1v6E1B3PlfC0("Internal", false);
        this.field003.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field003.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field007.get().floatValue());
        this.field003.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field007);
        this.field003.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(field006.get().floatValue());
        this.field003.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(field006);
        Supplier<Float> field008 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 + 1.0));
        this.field004 = this.field002.dhirGIuEE5wfYsepadSe1v6E1B3PlfC0("Cloud", true);
        this.field004.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field004.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field008.get().floatValue());
        this.field004.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field008);
        this.field004.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(field006.get().floatValue());
        this.field004.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(field006);
    }

    static {
        field001 = new SecureClass0021();
    }
}

