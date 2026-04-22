/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group010.SecureClass0155;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group033.kxD32T7LPJBUCD26ZzB5ge47eBTNvM98;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039.SecureClass0674;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1027;

public class AntiWebModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public static /* synthetic */ AntiWebModule field002;
    public final /* synthetic */ SecureClass0603<kxD32T7LPJBUCD26ZzB5ge47eBTNvM98> field003;

    public static /* bridge */ /* synthetic */ boolean FZTupVbhY9VGG4c8dRaLRSFhtF4RVExf() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AntiWebModule.field002.field003.getValue().equals((Object)((Object)kxD32T7LPJBUCD26ZzB5ge47eBTNvM98.Disable));
    }

    public /* synthetic */ AntiWebModule(SecureClass0242 bw8pPKK1h1yuiOWlYXjs4wEJOLwfqgN6) {
        super(bw8pPKK1h1yuiOWlYXjs4wEJOLwfqgN6, "AntiWeb", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Prevents web slowdown", new int[0]);
        this.field003 = new SecureClass0033<kxD32T7LPJBUCD26ZzB5ge47eBTNvM98>("Mode", kxD32T7LPJBUCD26ZzB5ge47eBTNvM98.Disable).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = false;
        this.cfr_renamed_69(new SecureClass0674(this));
        this.cfr_renamed_69(new SecureClass0155(this));
        field002 = this;
    }
}

