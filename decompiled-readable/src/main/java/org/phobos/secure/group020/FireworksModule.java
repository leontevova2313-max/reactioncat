/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class FireworksModule
extends SecureClass1027 {
    public static /* synthetic */ FireworksModule field001;
    public final /* synthetic */ SecureClass0603<Double> field002;

    public /* synthetic */ FireworksModule(SecureClass0242 qRyq933UUeKreud9kFAdpZEoGSEDajnY) {
        super(qRyq933UUeKreud9kFAdpZEoGSEDajnY, "Fireworks", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Controls fireworks", new int[0]);
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Boost", 100.0, Double.valueOf(100.0), Double.valueOf(300.0), "%"));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ double shZY8eYlgLMzVWoQwJuBf1i9nGE6iXtV(double field003) {
        if (field001 == null) {
            return field003;
        }
        return field003 * (FireworksModule.field001.field002.getValue() / 100.0);
    }

    public static /* bridge */ /* synthetic */ boolean lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL() {
        return field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }
}

