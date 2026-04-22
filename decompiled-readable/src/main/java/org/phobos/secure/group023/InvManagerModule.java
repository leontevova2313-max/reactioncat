/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group023;

import java.util.ArrayList;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group033.oGgf3Z2zcT5jIZcJyP6qL2RP8brIE0MB;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group036.fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.IUy3IuXgbw0X0DcO8nrVWuobk6c7kLU6;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvManagerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<IUy3IuXgbw0X0DcO8nrVWuobk6c7kLU6> inventory;
    public final /* synthetic */ SecureClass0603<Boolean> stacker;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public static final /* synthetic */ Logger field002;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> delay;
    public final /* synthetic */ SecureClass0603<Boolean> hotbar;

    public /* synthetic */ InvManagerModule(SecureClass0242 uBTpdAXRaTAEzbA2ZnIgmcRmf7ULIhBw) {
        super(uBTpdAXRaTAEzbA2ZnIgmcRmf7ULIhBw, "InvManager", SecureClass1004.cfr_renamed_106, "Manages inventory layout", new int[0]);
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<IUy3IuXgbw0X0DcO8nrVWuobk6c7kLU6>("Inventory", IUy3IuXgbw0X0DcO8nrVWuobk6c7kLU6.Silent));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("Delay", 50L, 0L, 5000L, true));
        this.stacker = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Stacker", false));
        this.hotbar = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Hotbar", false));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        ArrayList<SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>> arrayList = new ArrayList<SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>>();
        ArrayList<SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>> field003 = new ArrayList<SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>>();
        int field004 = 1;
        while (true) {
            if (field004 > 9) {
                this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.hotbar).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.cfr_renamed_89("Layout", arrayList.toArray(new SecureClass0603[0])), this.cfr_renamed_89("Fallback", field003.toArray(new SecureClass0603[0]))).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
                this.cfr_renamed_69(new oGgf3Z2zcT5jIZcJyP6qL2RP8brIE0MB(this, uBTpdAXRaTAEzbA2ZnIgmcRmf7ULIhBw, arrayList, field003));
                return;
            }
            arrayList.add(this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>("Layout" + field004, fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy.Free)));
            field003.add(this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy>("Fallback" + field004, fwCcU69IzKOUDDYH3Glur6QjV1zoPVQy.Free)));
            ++field004;
        }
    }

    static {
        field002 = LoggerFactory.getLogger(InvManagerModule.class);
    }
}

