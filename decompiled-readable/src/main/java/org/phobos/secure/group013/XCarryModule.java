/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group015.SecureClass0252;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.U6AONEdZ1js4sNtimcr99lERBbz3iWZz;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group045.SecureClass0806;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class XCarryModule
extends SecureClass1027 {
    public static /* synthetic */ XCarryModule field001;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> field002;
    public final /* synthetic */ SecureClass0603<Boolean> armor;
    public final /* synthetic */ SecureClass0603<U6AONEdZ1js4sNtimcr99lERBbz3iWZz> field003;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public final /* synthetic */ SecureClass0603<Long> field005;

    public /* synthetic */ XCarryModule(SecureClass0242 eUmk0sntE5dfn30ptaItSgiNLPEr7TKt) {
        super(eUmk0sntE5dfn30ptaItSgiNLPEr7TKt, "XCarry", SecureClass1004.cfr_renamed_106, "Allows you to carry more items", new int[0]);
        this.armor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Armor").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Unlocks armor slots"));
        this.field003 = new SecureClass0033<U6AONEdZ1js4sNtimcr99lERBbz3iWZz>("Mode", U6AONEdZ1js4sNtimcr99lERBbz3iWZz.Default).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass0840("Delay", 500L, 0L, 1000L, true).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field003, new U6AONEdZ1js4sNtimcr99lERBbz3iWZz[]{U6AONEdZ1js4sNtimcr99lERBbz3iWZz.Auto})).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0719("Items", class_1802.field_8301).cfr_renamed_260(4).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.field003, new U6AONEdZ1js4sNtimcr99lERBbz3iWZz[]{U6AONEdZ1js4sNtimcr99lERBbz3iWZz.Auto})).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Items to put in crafting slots").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new SecureClass0806(this));
        this.cfr_renamed_69(new SecureClass0252(this));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ boolean ZVe2eZOCCX6664vinqMYE8gQTuPZ0ZOg() {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && XCarryModule.field001.armor.getValue() != false;
    }
}

