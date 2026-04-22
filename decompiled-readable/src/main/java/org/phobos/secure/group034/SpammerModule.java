/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group034;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.function.TriConsumer;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group049.EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.SecureClass1037;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class SpammerModule
extends SecureClass1027 {
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Long> field002;
    public final /* synthetic */ SecureClass0603<String> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv> field007;
    public final /* synthetic */ List<String> field008;
    public /* synthetic */ int field009;

    public /* synthetic */ SpammerModule(SecureClass0242 maTn0BDvAWj5CRZx4fJCVbBo0RS3tWRo) {
        super(maTn0BDvAWj5CRZx4fJCVbBo0RS3tWRo, "Spammer", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Automatically sends chat messages", new int[0]);
        this.field007 = new SecureClass0033<EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv>("Mode", EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv.Text).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0667("Text", "text").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field007, new EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv[]{EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv.Text})).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field006 = new SecureClass1022("Random").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field007, new EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv[]{EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv.File})).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass1022("AntiKick").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Appends suffix to prevent kicks").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0840("Delay", 1500L, 0L, 60000L, true).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass1022("Refresh").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field007, new EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv[]{EfEyEafJfbFn0aEUxoqlKBQk0sUJivyv.File})).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Refreshes the spammer file").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field008 = new ArrayList<String>();
        this.cfr_renamed_69(new SecureClass1037(this));
        this.field003.cfr_renamed_123(string -> {
            if (string.isEmpty()) {
                this.QesFPNePMQP1QX1qvFLRZmdqHXNLKxpF("Text should contain at least 1 letter!");
                this.field003.crraVzykwykyJsThoWn3tfrxvjJ10d3S(this.field003.WzTNlVqrT6GQ7RhlvyGsKLIXoFTdQpSy());
            }
        });
        this.field004.cfr_renamed_123(b1oDeq35r2js0KCFaBye65G9aMMRINAC -> {
            if (b1oDeq35r2js0KCFaBye65G9aMMRINAC.booleanValue()) {
                this.ipQov9PcOSHzBsrGdhR3ruZN5yiaI3Bi();
                this.field004.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        this.gvJ976ZZegRbLxDC0QCo07dOy6lcsqRv((TriConsumer<class_746, class_638, class_636>)((TriConsumer)(alhgb6byMncCBhUqlbGRcrO6ruxoR5aa, CRJ3q8GbPgTLUmSjMqGAMOBi2jPqjOqG, RNcMMhItbYTozYUuo3gmi6cVFZnykcsI) -> {
            this.field009 = 0;
        }));
        this.ipQov9PcOSHzBsrGdhR3ruZN5yiaI3Bi();
    }
}

