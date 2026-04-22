/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import net.minecraft.class_1297;
import net.minecraft.class_1540;
import net.minecraft.class_1829;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.SecureClass0624;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class BlockTweaksModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static /* synthetic */ BlockTweaksModule field003;
    public final /* synthetic */ SecureClass0603<Integer> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;

    public static /* bridge */ /* synthetic */ boolean IcATL1pUNwkUMHzsh9PjhreAmg4MPvVU() {
        if (!field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() || BlockTweaksModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return false;
        }
        if (BlockTweaksModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_6047().method_7909() instanceof class_1829) {
            return false;
        }
        return BlockTweaksModule.field003.field002.getValue();
    }

    public /* synthetic */ BlockTweaksModule(SecureClass0242 icRKwDocnE5vOyUhRBS480h2k6R7gk7r) {
        super(icRKwDocnE5vOyUhRBS480h2k6R7gk7r, "BlockTweaks", SecureClass1004.cfr_renamed_106, "Block tweaks", new int[0]);
        this.field004 = new SecureClass0962<Integer>("Delay", 0, 0, 5).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field005 = new SecureClass1022("NoBreakAnim").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Cancels breaking animation").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass1022("EntityTrace").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows you to click blocks through entities").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new SecureClass1022("SkipFalling").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ignores falling blocks").Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass0624(this));
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ boolean Ai5GN7PTdxdLdko5qLmgJSt79Kxt5Bm3(class_1297 mL77Vpy6qVZluJSkZnn2xRATh5JM9Qbf) {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && BlockTweaksModule.field003.field001.getValue() != false && mL77Vpy6qVZluJSkZnn2xRATh5JM9Qbf instanceof class_1540;
    }

    public static /* bridge */ /* synthetic */ BlockTweaksModule oE4gZFfilApjjI6PGzJU9R5Ge2oBzGvS() {
        return field003;
    }
}

