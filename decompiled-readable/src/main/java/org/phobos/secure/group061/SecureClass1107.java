/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group061;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_2960;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group039.SecureClass0680;
import org.phobos.secure.group016.oOvS7efVKNNtpswOyYC2PG08rMH2O5fu;
import org.phobos.secure.group042.LKGdWtO9QKcHX2ixRrnchD0SGI6C40tW;
import org.phobos.secure.group052.SecureClass0943;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass1107
extends SecureClass0966 {
    public static final /* synthetic */ Map<String, class_2960> field001;
    public final /* synthetic */ Map<String, class_2960> field002;
    public final /* synthetic */ Queue<SecureClass0680> field003;
    public static final /* synthetic */ Map<String, oOvS7efVKNNtpswOyYC2PG08rMH2O5fu> field004;
    public final /* synthetic */ Queue<SecureClass0943> field005;

    public static /* bridge */ /* synthetic */ oOvS7efVKNNtpswOyYC2PG08rMH2O5fu AfdyhZwUrPt8nUoX64zZVdodZ73n9Cjc(String d42ZnDJAzZxvMCIrSg30yYOyZwwHpA0s) {
        return field004.get(d42ZnDJAzZxvMCIrSg30yYOyZwwHpA0s);
    }

    static {
        field001 = new HashMap<String, class_2960>();
        field004 = new HashMap<String, oOvS7efVKNNtpswOyYC2PG08rMH2O5fu>();
    }

    public /* synthetic */ SecureClass1107(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        this.field003 = new ConcurrentLinkedQueue<SecureClass0680>();
        this.field005 = new ConcurrentLinkedQueue<SecureClass0943>();
        this.field002 = new HashMap<String, class_2960>();
        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().RnnUuNNh3JW28ws7linsjvyVcjubYo13(SecureClass0680.class, this.field003::add);
        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().RnnUuNNh3JW28ws7linsjvyVcjubYo13(SecureClass0943.class, this.field005::add);
        this.cfr_renamed_69(new LKGdWtO9QKcHX2ixRrnchD0SGI6C40tW(this));
    }

    public static /* bridge */ /* synthetic */ class_2960 cdoamY2efVZe8mfcV7LEEZd0AR4LL8a5(String OF5B8EbwkWi3gIJMGEtTKTKPH3sH59Nm) {
        return field001.get(OF5B8EbwkWi3gIJMGEtTKTKPH3sH59Nm);
    }
}

