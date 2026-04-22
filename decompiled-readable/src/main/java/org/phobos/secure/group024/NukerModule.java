/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import java.util.Set;
import net.minecraft.class_2248;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group042.SecureClass0738;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class NukerModule
extends SecureClass1027 {
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Set<class_2248>> whitelist;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Double> range;

    public /* synthetic */ NukerModule(SecureClass0242 UHjS3mmn1xqyJUcTHTexJYWdJknZTNv1) {
        super(UHjS3mmn1xqyJUcTHTexJYWdJknZTNv1, "Nuker", SecureClass1004.cfr_renamed_106, "Mines blocks around you", new int[0]);
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 6.0, 0.1, 6.0));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 0L, 0L, 1000L, true));
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0738("Whitelist", new class_2248[0]));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
    }
}

