/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import net.minecraft.class_1297;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group032.SecureClass0565;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group048.SecureClass0868;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.SecureClass1086;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TargetStrafeModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public final /* synthetic */ SecureClass0603<Boolean> speed;
    public static /* synthetic */ class_1297 field002;
    public final /* synthetic */ SecureClass0603<Boolean> strafe;
    public final /* synthetic */ SecureClass0603<Double> range;
    public /* synthetic */ boolean field003;
    public final /* synthetic */ SecureClass0603<Boolean> fly;
    public static /* synthetic */ float field004;
    public static /* synthetic */ TargetStrafeModule field005;
    public static /* synthetic */ boolean field006;
    public final /* synthetic */ SecureClass0603<Boolean> manual;

    static {
        field006 = false;
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_378(float field007) {
        if (field006 && field002 != null) {
            return field004;
        }
        return field007;
    }

    public static /* bridge */ /* synthetic */ TargetStrafeModule ljLcXa30tmz2aop2DzTFRfOkgDmCIYXq() {
        return field005;
    }

    public /* synthetic */ TargetStrafeModule(SecureClass0242 tlq0BSHmOvBAHb45NqS9TPoqR4tKQ6JL) {
        super(tlq0BSHmOvBAHb45NqS9TPoqR4tKQ6JL, "TargetStrafe", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Strafes around enemies", new int[0]);
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 1.0, 0.2, 6.0));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Speed"));
        this.fly = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fly"));
        this.manual = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Manual"));
        this.strafe = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Strafe"));
        this.cfr_renamed_69(new SecureClass0868(this));
        this.cfr_renamed_69(new SecureClass0565(this));
        this.cfr_renamed_69(new SecureClass1086(this));
        field005 = this;
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

