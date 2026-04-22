/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group042;

import org.phobos.secure.group005.SecureClass0078;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group036.SecureClass0630;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AntiLagModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;

    public /* synthetic */ AntiLagModule(SecureClass0242 GUSD6b2VnHylH0UfygEfJeUY7WYyRDIz) {
        super(GUSD6b2VnHylH0UfygEfJeUY7WYyRDIz, "AntiLag", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Prevents FPS drops when server is at fault", new int[0]);
        this.field004 = new SecureClass1022("EntityFix").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass1022("ItemFix").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new SecureClass0630(this));
        this.cfr_renamed_69(new SecureClass0078(this));
    }
}

