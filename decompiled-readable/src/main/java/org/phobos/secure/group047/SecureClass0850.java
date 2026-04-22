/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import net.minecraft.class_1799;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_742;
import org.phobos.secure.group038.SecureClass0669;
import org.phobos.secure.group023.AntiCheatModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1021;

public class SecureClass0850
implements SecureInterface0134 {
    public /* synthetic */ SecureClass1021 field001;
    public /* synthetic */ class_243 field002;
    public /* synthetic */ class_243 field003;
    public /* synthetic */ class_241 field004;
    public /* synthetic */ class_243 field005;
    public /* synthetic */ boolean field006;
    public /* synthetic */ class_1799 field007;
    public /* synthetic */ class_243 field008;
    public /* synthetic */ boolean field009;
    public /* synthetic */ class_243 field010;
    public /* synthetic */ class_243 field011;
    public final /* synthetic */ AntiCheatModule field012;
    public /* synthetic */ class_241 field013;
    public /* synthetic */ class_742 field014;
    public /* synthetic */ boolean field015;
    public /* synthetic */ class_243 field016;
    public /* synthetic */ class_1799 field017;
    public /* synthetic */ boolean field018;
    public /* synthetic */ class_1799 field019;
    public /* synthetic */ class_1799 field020;
    public /* synthetic */ class_243 field021;
    public /* synthetic */ int field022;
    public /* synthetic */ ScheduledExecutorService field023;
    public /* synthetic */ double field024;
    public /* synthetic */ double field025;
    public /* synthetic */ boolean field026;
    public /* synthetic */ int field027;
    public /* synthetic */ List<Boolean> field028;
    public /* synthetic */ int field029;
    public /* synthetic */ int field030;
    public /* synthetic */ float field031;
    public /* synthetic */ boolean field032;
    public /* synthetic */ boolean field033;
    public /* synthetic */ long field034;
    public /* synthetic */ boolean field035;
    public /* synthetic */ List<class_243> field036;
    public /* synthetic */ boolean field037;
    public /* synthetic */ List<Boolean> field038;
    public /* synthetic */ boolean field039;
    public /* synthetic */ List<class_241> field040;
    public /* synthetic */ List<class_243> field041;
    public /* synthetic */ boolean field042;

    public static /* bridge */ /* synthetic */ SecureClass0850 cfr_renamed_570(class_742 vT1xyiY3NY0LmgdTcn1p2uhJ04Zx9nhd, AntiCheatModule xjA8il29BZlkMpUte40RkW9Cj2PkNgVb) {
        return new SecureClass0850(vT1xyiY3NY0LmgdTcn1p2uhJ04Zx9nhd, false, xjA8il29BZlkMpUte40RkW9Cj2PkNgVb);
    }

    public /* synthetic */ SecureClass0850(class_742 rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7, boolean PJL3XKEkUBvXotvBLdnJqHmZEi1XkbrZ, AntiCheatModule p4AqnksQNh0i4KvZCTnBIEsywjdsNbrw) {
        this.field005 = class_243.field_1353;
        this.field003 = class_243.field_1353;
        this.field020 = class_1799.field_8037;
        this.field019 = class_1799.field_8037;
        this.field006 = false;
        this.field009 = false;
        this.field011 = class_243.field_1353;
        this.field002 = class_243.field_1353;
        this.field007 = class_1799.field_8037;
        this.field017 = class_1799.field_8037;
        this.field015 = false;
        this.field018 = false;
        this.field021 = class_243.field_1353;
        this.field008 = class_243.field_1353;
        this.field010 = class_243.field_1353;
        this.field016 = class_243.field_1353;
        this.field004 = class_241.field_1340;
        this.field013 = class_241.field_1340;
        this.field036 = new ArrayList<class_243>(20);
        this.field038 = new ArrayList<Boolean>(20);
        this.field041 = new ArrayList<class_243>(20);
        this.field028 = new ArrayList<Boolean>(20);
        this.field040 = new ArrayList<class_241>(20);
        this.field031 = 0.0f;
        this.field039 = true;
        this.field032 = true;
        this.field026 = true;
        this.field037 = false;
        this.field035 = false;
        this.field033 = false;
        this.field042 = false;
        this.field024 = 1.0;
        this.field025 = 1.0;
        this.field034 = 0L;
        this.field022 = 0;
        this.field030 = 0;
        this.field029 = 0;
        this.field027 = 0;
        this.field023 = Executors.newScheduledThreadPool(4);
        this.field014 = rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7;
        this.field012 = p4AqnksQNh0i4KvZCTnBIEsywjdsNbrw;
        this.field001 = PJL3XKEkUBvXotvBLdnJqHmZEi1XkbrZ ? SecureClass1021.cfr_renamed_571((SecureClass0669)this) : SecureClass1021.AP7etJKut4eSKVJ1OzEXG3bTWOqbiDbe(this);
        this.field005 = rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_19538();
        this.field003 = new class_243(rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_18798().field_1352, rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_18798().field_1351, rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_18798().field_1350);
        this.field006 = rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_5624();
        this.field009 = rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.field_6252;
        this.field004 = new class_241(rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_36455(), rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_36454());
        this.field032 = this.field026 = rY8xO3RjqjPrH8dY65k1giJ5hBmHXPh7.method_24828();
        this.field039 = this.field026;
        for (int rtpfwTbbSwphBH6FllC6DHImFxXA9fbw = 0; rtpfwTbbSwphBH6FllC6DHImFxXA9fbw < 20; ++rtpfwTbbSwphBH6FllC6DHImFxXA9fbw) {
            this.field036.add(this.field005);
        }
        for (int WJ6Nw0HMtlcrKcAcFRpDAvuCxoFXffoQ = 0; WJ6Nw0HMtlcrKcAcFRpDAvuCxoFXffoQ < 20; ++WJ6Nw0HMtlcrKcAcFRpDAvuCxoFXffoQ) {
            this.field041.add(this.field003);
        }
        for (int lYyJXLWtTRh4Nvab33jOOaEmPjQKTgba = 0; lYyJXLWtTRh4Nvab33jOOaEmPjQKTgba < 20; ++lYyJXLWtTRh4Nvab33jOOaEmPjQKTgba) {
            this.field028.add(this.field006);
        }
        for (int iEXmQux00HG0F1TcHsoWcCbMil2jevu9 = 0; iEXmQux00HG0F1TcHsoWcCbMil2jevu9 < 20; ++iEXmQux00HG0F1TcHsoWcCbMil2jevu9) {
            this.field038.add(this.field039);
        }
        int field043 = 0;
        while (field043 < 20) {
            this.field040.add(this.field004);
            ++field043;
        }
        return;
    }
}

