/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import java.util.Map;
import java.util.function.Function;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0611;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AnchorModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Double> acceleration;
    public final /* synthetic */ SecureClass0603<Boolean> partial;
    public final /* synthetic */ SecureClass0603<Map<Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY, Boolean>> disablers;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Double> drag;

    public /* synthetic */ AnchorModule(SecureClass0242 pBOxQGsT7Frwm7zsodTeKa0eGpLy1ZW2) {
        super(pBOxQGsT7Frwm7zsodTeKa0eGpLy1ZW2, "Anchor", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, new int[0]);
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 1.5, 0.5, 2.0));
        this.disablers = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0889<Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY>("Disablers", Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY.class).vyj2JO6suqRzOglrkzffuHbbCGRijPqL((Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY[])Rziemi8mtakxAJJRwKeOqP2Hpg7PjapY.values(), new Function[0]));
        this.drag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Drag", 2.0, 1.0, 3.0));
        this.acceleration = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Acceleration", 1.0, 0.5, 2.0));
        this.partial = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Partial"));
        this.cfr_renamed_69(new SecureClass0611(this));
    }
}

