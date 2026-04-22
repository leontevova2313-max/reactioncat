/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group061;

import org.phobos.secure.group009.pdGCnSUNLLuVo5iH3y7ZNCGJKQl9foNn;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ExtraTabModule
extends SecureClass1027 {
    public static /* synthetic */ ExtraTabModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> color;
    public final /* synthetic */ SecureClass0603<Boolean> telemetry;
    public final /* synthetic */ SecureClass0603<Integer> size;

    public /* synthetic */ ExtraTabModule(SecureClass0242 obrByoB8fmHSLIbNcclKoaoFhHrykFxc) {
        super(obrByoB8fmHSLIbNcclKoaoFhHrykFxc, "ExtraTab", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Extends tab functionality", new int[0]);
        this.size = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Size", 80, 80, 400));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Color").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Highlights friends & enemies"));
        this.telemetry = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Telemetry"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("TelemetryReplace"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.telemetry, this.field002);
        this.cfr_renamed_69(new pdGCnSUNLLuVo5iH3y7ZNCGJKQl9foNn(this));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ ExtraTabModule WP8wqFVk6B5xim1XUvXZYWeAXZLBrsiD() {
        return field001;
    }
}

