/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.time.Instant;
import net.minecraft.class_2797;
import net.minecraft.class_3515;
import net.minecraft.class_746;
import net.minecraft.class_7469;
import net.minecraft.class_7608;
import net.minecraft.class_7637;
import net.minecraft.class_9145;

public final class SecureClass0702 {
    public static /* synthetic */ Object2IntMap<?> field001;

    public static /* bridge */ /* synthetic */ void skVlkQ2DBCxLHUJ9njB1m6Bg0AahuDrC(Object2IntMap<?> hKXziIHECrGnmPfi6KSP4TM2jNf853ju) {
        field001 = hKXziIHECrGnmPfi6KSP4TM2jNf853ju;
    }

    public static /* bridge */ /* synthetic */ int tNzRxxEdPhZweFB6LHe210dXpTfvJnCm(class_9145<?> XKES0ywifNjZ22eQ3D3EbcVSilWk0c8O) {
        return field001.getInt(XKES0ywifNjZ22eQ3D3EbcVSilWk0c8O);
    }

    public /* synthetic */ SecureClass0702() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ class_2797 c0nFi7Yu5aVEqQqeR3O0uSeW0o4p8FNQ(class_746 WW6aXlx1AghXJ3LoGIqMkG6V939uBnkD, String mEG0r9pv9H7WOjMqYN9ffzvlNsZ79mFL) {
        Instant instant = Instant.now();
        long field002 = class_3515.class_7426.method_43531();
        class_7637.class_7816 field003 = WW6aXlx1AghXJ3LoGIqMkG6V939uBnkD.field_3944.field_39858.method_46266();
        class_7469 field004 = WW6aXlx1AghXJ3LoGIqMkG6V939uBnkD.field_3944.field_39808.pack(new class_7608(mEG0r9pv9H7WOjMqYN9ffzvlNsZ79mFL, instant, field002, field003.comp_1073()));
        return new class_2797(mEG0r9pv9H7WOjMqYN9ffzvlNsZ79mFL, instant, field002, field004, field003.comp_1074());
    }
}

