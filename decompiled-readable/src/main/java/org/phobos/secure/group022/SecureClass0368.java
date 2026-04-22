/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

import java.util.function.Supplier;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group032.SecureClass0568;
import org.phobos.secure.group034.SecureClass0602;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group049.SecureClass0880;
import org.phobos.secure.group063.SecureInterface0148;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0368
extends SecureClass0870<SecureClass0368>
implements SecureInterface0143,
SecureInterface0148 {
    public final /* synthetic */ SecureClass0602 field001;
    public final /* synthetic */ SecureClass0602 field002;
    public /* synthetic */ boolean field003;
    public final /* synthetic */ SecureInterface0052 field004;
    public final /* synthetic */ SecureClass0880 field005;
    public static /* synthetic */ SecureClass0368 field006;

    public /* synthetic */ SecureClass0368() {
        super((class_2561)class_2561.method_43470((String)""));
        this.field003 = true;
        this.field004 = new SecureClass0894();
        this.field005 = new SecureClass0880(this.field004);
        Supplier<Float> field007 = () -> Float.valueOf(54.0f);
        Supplier<Float> field008 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 - 217.0));
        this.field002 = this.field005.jug8dLPdmLCFAHUcTY76SYAq8Wmi2He0("Internal", false);
        this.field002.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field002.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field008.get().floatValue());
        this.field002.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field008);
        this.field002.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(field007.get().floatValue());
        this.field002.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(field007);
        Supplier<Float> field009 = () -> Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 + 1.0));
        this.field001 = this.field005.jug8dLPdmLCFAHUcTY76SYAq8Wmi2He0("Cloud", true);
        this.field001.ujyJdAVaFEZXNiLCGbqjgd5vpofQcum9(15.0f);
        this.field001.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(field009.get().floatValue());
        this.field001.T8WvPhCOpIK3V8G8ocp6nbEeqMv0tYh2(field009);
        this.field001.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(field007.get().floatValue());
        this.field001.rBFx8cjaEOGuTcsF4fpJXZVn5g550dNl(field007);
        SecureClass0568.jid88MNQdTqBNsGFOSw7Q4hEhQnyaEaG().ZDdwq6FhOzrQWAHtV5NdQH3aTQEnis4u(this);
    }

    static {
        field006 = new SecureClass0368();
    }
}

