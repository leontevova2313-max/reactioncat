/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group003.SecureInterface0004;
import org.phobos.secure.group018.SecureClass0295;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group029.SecureInterface0079;
import org.phobos.secure.group032.SecureClass0568;
import org.phobos.secure.group048.SecureClass0870;
import org.phobos.secure.group060.SecureClass1102;
import org.phobos.secure.group063.SecureInterface0148;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group042.SecureClass0742;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group054.SecureClass0979;
import org.phobos.secure.group054.SecureClass0974;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group054.SecureClass0993;
import org.phobos.secure.group056.SecureClass1024;

public class SecureClass0903
extends SecureClass0870<SecureClass0903>
implements SecureInterface0134,
SecureInterface0004,
SecureInterface0148 {
    public final /* synthetic */ Set<SecureClass1102> field001;
    public final /* synthetic */ List<SecureClass0424> field002;
    public final /* synthetic */ Set<SecureClass0974> field003;
    public final /* synthetic */ SecureClass0979 field004;
    public static /* synthetic */ SecureClass0903 field005;
    public final /* synthetic */ SecureClass0993 field006;
    public /* synthetic */ SecureInterface0079 field007;
    public final /* synthetic */ SecureInterface0052 field008;
    public final /* synthetic */ Color field009;

    public /* synthetic */ SecureClass0903(SecureClass0742 C4pKJaUz9qqcJef10zWgakSDmeyjbD47) {
        super((class_2561)class_2561.method_43470((String)""));
        this.field002 = new CopyOnWriteArrayList<SecureClass0424>();
        this.field009 = new Color(255, 255, 255, 50);
        this.field003 = new HashSet<SecureClass0974>();
        this.field001 = new HashSet<SecureClass1102>();
        this.field008 = new SecureClass0894();
        this.field004 = new SecureClass0979(this.field008);
        this.field006 = this.field004.MBNWAfEAvQEtdYhAhLRjOrM8zgyuR425("HUD");
        this.xbXSNJtGDDOjSXlkw0EJqA9KJiEOVazj(C4pKJaUz9qqcJef10zWgakSDmeyjbD47);
        SecureClass0568.jid88MNQdTqBNsGFOSw7Q4hEhQnyaEaG().ZDdwq6FhOzrQWAHtV5NdQH3aTQEnis4u(this);
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_934(Consumer<SecureClass0903> udAQ1qRDHYknpUYk7R0O7FnbL7gGytI4) {
        SecureClass0903.field005.field006.IcdExKNTAkW2zIGF91Qy6wcOFniWe2Eb(SecureClass0903.field005.field006.cfr_renamed_935(SecureClass0903.field005.field006.RHXkQ1hY7Gw87ABJNiCT9mFtI6Og8yza()));
        SecureClass0903.field005.field006.Zxn7EuxR0cuO28xjg2pGhEncP2VSRmwz(SecureClass0903.field005.field006.wl4ikn6NhV2bTbOWIohGZnRkMEsBDqBh(SecureClass0903.field005.field006.cfr_renamed_936()));
        udAQ1qRDHYknpUYk7R0O7FnbL7gGytI4.accept(field005);
    }

    public static /* bridge */ /* synthetic */ Float cfr_renamed_937() {
        return Float.valueOf((float)((double)class_310.method_1551().method_22683().method_4486() / 2.0 - 54.0 - 2.0));
    }

    public static /* bridge */ /* synthetic */ boolean sN5edeD2pFo9YTQBDyeaOPmFJVyEEHQz(SecureClass1024 JFfUmH1PblswmXVZaFFe74zsemAfY5Jy, SecureClass0295 YMTz4Lqq9qKOa7FXG0D2cDrOnXVMA4gM) {
        return JFfUmH1PblswmXVZaFFe74zsemAfY5Jy.ZrL7lTsQE6xNzvMhapwyaOsSPcoDWsgt().kN308btmvxQdNNAMOdSaGn3VixYR1HVC();
    }

    public static /* bridge */ /* synthetic */ boolean ctfFDkXIjpvBK1DtICCmn2Y7QLOUj76h(SecureClass1024 P4Lw9LSf9rPc4Bp0lpHjeBOIQG4M6WPH, SecureClass0295 ERMs5oTIX9qWKL6ng3p8uHJqT65YE6wF) {
        return P4Lw9LSf9rPc4Bp0lpHjeBOIQG4M6WPH.ZrL7lTsQE6xNzvMhapwyaOsSPcoDWsgt().kN308btmvxQdNNAMOdSaGn3VixYR1HVC();
    }

    public static /* bridge */ /* synthetic */ Float cfr_renamed_938() {
        return Float.valueOf(54.0f);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(36);
    }
}

