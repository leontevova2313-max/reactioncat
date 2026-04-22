/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group029;

import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.function.TriConsumer;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.SecureClass0437;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group051.SecureClass0934;
import org.phobos.secure.group051.SecureClass0938;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.SecureClass0255;
import org.phobos.secure.group020.SecureClass0322;
import org.phobos.secure.group022.TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class PhaseModule
extends SecureClass1027 {
    public /* synthetic */ boolean field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ SecureClass0603<Double> blocks;
    public static final /* synthetic */ class_265 field003;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f> mode;
    public static /* synthetic */ PhaseModule field004;
    public final /* synthetic */ SecureClass0603<Boolean> auto;
    public final /* synthetic */ SecureClass0603<Boolean> offset;

    public /* synthetic */ PhaseModule(SecureClass0242 vjDEySPHcTamJK8ipaS7ckeEfzQ0dR0Z) {
        super(vjDEySPHcTamJK8ipaS7ckeEfzQ0dR0Z, "Phase", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Allows you to phase through blocks", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f>("Mode", TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Normal));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Offset").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Desync));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 0.0, 0.1, 10.0).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f[]{TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Normal})));
        this.blocks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Blocks", 0.003, 0.001, 10.0).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f[]{TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Normal})));
        this.auto = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Auto").cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f[]{TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Normal, TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Intave})));
        this.field001 = false;
        this.field002 = false;
        this.cfr_renamed_69(new SecureClass0322(this));
        this.cfr_renamed_69(new SecureClass0938(this));
        this.cfr_renamed_69(new SecureClass0437(this));
        this.cfr_renamed_69(new SecureClass0255(this));
        this.e3M9qXVPD5w9Suq309f6Wit8fEb16IUi((TriConsumer<class_746, class_638, class_636>)((TriConsumer)(class_7462, I39z3vKts1wQJrdI4vUdceUPnvn2PIDA, bfeS0ozpfr2v2plg3RWZrMUnFaLzxTz5) -> {
            this.field001 = false;
            if (class_7462 == null || I39z3vKts1wQJrdI4vUdceUPnvn2PIDA == null) {
                return;
            }
            switch (this.mode.getValue().ordinal()) {
                case 0: {
                    if (!this.auto.getValue().booleanValue()) break;
                    double field005 = Math.cos(Math.toRadians(class_7462.method_36454() + 90.0f));
                    double field006 = Math.sin(Math.toRadians(class_7462.method_36454() + 90.0f));
                    class_7462.method_5814(class_7462.method_23317() + (1.0 * this.blocks.getValue() * field005 + 0.0 * this.blocks.getValue() * field006), class_7462.method_23318(), class_7462.method_23321() + (1.0 * this.blocks.getValue() * field006 - 0.0 * this.blocks.getValue() * field005));
                    break;
                }
                case 1: {
                    class_7462.method_18800(0.0, 0.0, 0.0);
                    break;
                }
            }
        }));
        field004 = this;
    }

    public static /* bridge */ /* synthetic */ boolean sPqLKNf5Vny14PNzQc2d6QNVVEOBsvgC() {
        return field004.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && PhaseModule.field004.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(TXvH4nzAy7UGY2OTNhSuKRofvI1cFm2f.Flow);
    }

    static {
        field003 = SecureClass0934.cfr_renamed_451(class_259.method_1077(), 0.001, 0.0, 0.001);
    }
}

