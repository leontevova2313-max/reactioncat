/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group029;

import net.minecraft.class_2246;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.function.TriConsumer;
import org.phobos.secure.group012.SecureClass0174;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class IceSpeedModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Float> field001;

    public /* synthetic */ IceSpeedModule(SecureClass0242 V7EcVxaJnnKdckMmIGXemjUGUA5xZRso) {
        super(V7EcVxaJnnKdckMmIGXemjUGUA5xZRso, "IceSpeed", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Makes you faster on ice", new int[0]);
        this.field001 = new SecureClass0962<Float>("Speed", Float.valueOf(0.01f), Float.valueOf(0.01f), Float.valueOf(0.2f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new SecureClass0174(this));
        this.cfr_renamed_453((TriConsumer<class_746, class_638, class_636>)((TriConsumer)(RjAVOUwylfDTQ0TjB9lNyJV1LRlQBSsY, XzpJr00z9PvXDtPgGSuPZnScActI7fnF, class_6362) -> {
            this.ZDbNgUrhrZpYh8fmgy7poghvhZXVmmjQ(class_2246.field_10295).setSlipperiness(0.98f);
            this.ZDbNgUrhrZpYh8fmgy7poghvhZXVmmjQ(class_2246.field_10225).setSlipperiness(0.98f);
            this.ZDbNgUrhrZpYh8fmgy7poghvhZXVmmjQ(class_2246.field_10110).setSlipperiness(0.98f);
        }));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

