/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group026;

import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import org.phobos.secure.group014.j4wbCU2MNsspAkEJQjvmGuSCdoBPOtp9;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoPlaceModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Double> frame;
    public final /* synthetic */ SecureClass0603<Boolean> any;
    public /* synthetic */ class_239 field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public /* synthetic */ class_2338 field003;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> whitelist;
    public /* synthetic */ int field004;

    public /* synthetic */ AutoPlaceModule(SecureClass0242 EdYnzpf2bi8NdgrolrUq1bxMzJKWuLXu) {
        super(EdYnzpf2bi8NdgrolrUq1bxMzJKWuLXu, "AutoPlace", SecureClass1004.cfr_renamed_106, "Simulates legit fast place", new int[0]);
        this.frame = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Frame", 8.0, 0.0, 30.0));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 60L, 1L, 500L, true));
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Whitelist", new class_1792[0]));
        this.any = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Any"));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new j4wbCU2MNsspAkEJQjvmGuSCdoBPOtp9(this, EdYnzpf2bi8NdgrolrUq1bxMzJKWuLXu));
    }
}

