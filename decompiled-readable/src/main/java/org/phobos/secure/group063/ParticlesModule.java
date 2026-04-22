/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group063;

import java.awt.Color;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.SecureClass0560;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class ParticlesModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Integer> multiplier;
    public final /* synthetic */ SecureClass0603<Integer> field001;
    public final /* synthetic */ SecureClass0603<Color> color;
    public final /* synthetic */ SecureClass0603<Boolean> square;
    public final /* synthetic */ SecureClass0603<YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y> mode;
    public final /* synthetic */ SecureClass0603<Double> scale;
    public final /* synthetic */ SecureClass0603<Long> time;
    public static /* synthetic */ ParticlesModule field002;

    public static /* bridge */ /* synthetic */ ParticlesModule Szol4ZsTaQulFv1mJRPPHeOYj4Ah8bj6() {
        return field002;
    }

    public /* synthetic */ ParticlesModule(SecureClass0242 tzuX8tiO7UChdZuCeYST4kzWFyatE9u6) {
        super(tzuX8tiO7UChdZuCeYST4kzWFyatE9u6, "Particles", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Alters hit particles", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y>("Mode", YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Always));
        this.multiplier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Multiplier", 2, 0, 6).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Multiply})));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Times", 1, 1, 6).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Always})));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Custom})));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Scale", 0.04, 0.01, 1.0).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Custom})));
        this.square = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Square", false).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Custom})));
        this.time = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Time", 250L, 0L, 2000L, true).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y[]{YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Custom})));
        this.cfr_renamed_69(new SecureClass0560(this));
        field002 = this;
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_9() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ParticlesModule.field002.mode.getValue().equals((Object)((Object)YlzzfosuYzGUTN6th5rZBJYcwDb8yb1y.Multiply)) ? ParticlesModule.field002.multiplier.getValue() : 1;
    }
}

