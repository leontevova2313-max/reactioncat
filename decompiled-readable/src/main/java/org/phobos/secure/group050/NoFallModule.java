/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.wFwT97qumbqT6s0kn8UOU7KgxSdl4o1r;
import org.phobos.secure.group012.n486Ekppgf8os57fSbxxdeRCPaIDOuqG;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group051.aQD1YSZYlr5UtkHWDjQ3a00axAutMOLT;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.eHRWNnhbDabfJj7r6GvGjX2mWkBJOigh;
import org.phobos.secure.group020.DPEsXH6H6lV8SlIGQoaLBBr03328Xadr;
import org.phobos.secure.group043.EO9Zl3O24hSswYN34xFo98wYKeulXFh6;
import org.phobos.secure.group043.xne35FmUd0ZmE5pjPFqE6YDjtsrfupOh;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group056.wP7APumlC7IpBt7Px16mU82kr5K1k6MH;

public class NoFallModule
extends SecureClass1027 {
    public /* synthetic */ class_2338 field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<eHRWNnhbDabfJj7r6GvGjX2mWkBJOigh> mode;
    public /* synthetic */ class_243 field003;
    public final /* synthetic */ SecureClass0603<wFwT97qumbqT6s0kn8UOU7KgxSdl4o1r> ground;
    public final /* synthetic */ SecureClass0603<Boolean> grim;
    public /* synthetic */ class_2338 field004;
    public /* synthetic */ int field005;
    public /* synthetic */ int field006;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field007;
    public /* synthetic */ float[] field008;
    public /* synthetic */ EO9Zl3O24hSswYN34xFo98wYKeulXFh6 field009;

    public /* synthetic */ NoFallModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "NoFall", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Prevents fall damage", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<eHRWNnhbDabfJj7r6GvGjX2mWkBJOigh>("Mode", eHRWNnhbDabfJj7r6GvGjX2mWkBJOigh.Vanilla));
        this.ground = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<wFwT97qumbqT6s0kn8UOU7KgxSdl4o1r>("Ground", wFwT97qumbqT6s0kn8UOU7KgxSdl4o1r.Enabled));
        this.grim = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Grim").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, eHRWNnhbDabfJj7r6GvGjX2mWkBJOigh.Pearl));
        this.field007 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field009 = EO9Zl3O24hSswYN34xFo98wYKeulXFh6.None;
        this.cfr_renamed_69(new DPEsXH6H6lV8SlIGQoaLBBr03328Xadr(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new n486Ekppgf8os57fSbxxdeRCPaIDOuqG(this));
        this.cfr_renamed_69(new xne35FmUd0ZmE5pjPFqE6YDjtsrfupOh(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new aQD1YSZYlr5UtkHWDjQ3a00axAutMOLT(this, 26, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new wP7APumlC7IpBt7Px16mU82kr5K1k6MH(this));
    }
}

