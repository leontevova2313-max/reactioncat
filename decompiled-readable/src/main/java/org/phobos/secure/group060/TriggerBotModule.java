/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.phobos.secure.group013.SecureClass0187;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group054.DIN9iqm0CrKNkTrulb57mgKyUrd8odu0;

public class TriggerBotModule
extends SecureClass0187 {
    public /* synthetic */ long field001;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Long> spread;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> items;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;

    public /* synthetic */ TriggerBotModule(SecureClass0242 KGLbVxwgJmvAiLa3E3ckquJ8a8RYbQKG) {
        super(KGLbVxwgJmvAiLa3E3ckquJ8a8RYbQKG, "TriggerBot", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Clicks for you");
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 100L, 0L, 3000L, true));
        this.spread = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Spread", 0L, 0L, 150L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Randomness"));
        this.items = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Items", class_1802.field_8091, class_1802.field_8845, class_1802.field_8371, class_1802.field_8802, class_1802.field_22022));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new DIN9iqm0CrKNkTrulb57mgKyUrd8odu0(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

