/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group006;

import java.awt.Color;
import net.minecraft.class_1959;
import net.minecraft.class_2394;
import net.minecraft.class_2396;
import net.minecraft.class_2398;
import net.minecraft.class_4761;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.ZopjyATzUVUlf81u0DtX80UAxDSbZ1lX;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group051.fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class WeatherModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> color;
    public static /* synthetic */ WeatherModule field001;
    public static /* synthetic */ boolean field002;
    public static final /* synthetic */ class_4761 field003;
    public final /* synthetic */ SecureClass0603<Float> amount;
    public final /* synthetic */ SecureClass0603<fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW> mode;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public final /* synthetic */ SecureClass0603<Boolean> unlock;

    @Nullable
    public static /* bridge */ /* synthetic */ class_1959.class_1963 SPUgJnWHV4nuJuJD3jYuCqqXym1PnmQX(class_1959.class_1963 field004) {
        if (!field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return field004;
        }
        return switch (WeatherModule.field001.mode.getValue().ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> class_1959.class_1963.field_9384;
            case 1 -> class_1959.class_1963.field_9382;
            case 2 -> class_1959.class_1963.field_9383;
            case 3 -> null;
        };
    }

    public static /* bridge */ /* synthetic */ WeatherModule cfr_renamed_146() {
        return field001;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ Color tBxwXTKQIYH0xM8u3eXM0b2mCkNxGiH1() {
        if (field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && field002) {
            return WeatherModule.field001.color.getValue();
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ float xX5DZu0SdfTbTgkdw0k4dwMGzvTJXJMm() {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? WeatherModule.field001.speed.getValue().floatValue() / 100.0f * 10.0f : 1.0f;
    }

    public static /* bridge */ /* synthetic */ float QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(float f) {
        return f * (field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? WeatherModule.field001.speed.getValue().floatValue() / 100.0f : 1.0f);
    }

    public static /* bridge */ /* synthetic */ boolean Upe2R9xjlSoNoO0YdYqun0UuZ9sGUyI2() {
        return WeatherModule.field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && WeatherModule.field001.unlock.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean pgxaiLI5E6CE3zvTcBhzKrCfvXqCvUTc() {
        return WeatherModule.field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && WeatherModule.field001.mode.getValue().equals((Object)((Object)fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW.Clear));
    }

    public /* synthetic */ WeatherModule(SecureClass0242 lPeXAfFDpFo0j4BHKxjjXl3QkrkybjrU) {
        super(lPeXAfFDpFo0j4BHKxjjXl3QkrkybjrU, "Weather", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Controls weather", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW>("Mode", fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW.Snow));
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW.Ash));
        this.unlock = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Unlock").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Makes rain and snow go through blocks"));
        this.amount = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Amount", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)).cfr_renamed_85("Max", Float.valueOf(1.0f)));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(100.0f), Float.valueOf(10.0f), Float.valueOf(500.0f), "%").cfr_renamed_85("Max", Float.valueOf(500.0f)).cfr_renamed_85("Default", Float.valueOf(100.0f)));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ float dafCE3okw1ETuuS6ubbtHK7Q7kGx4VI6(float JxV8MnFvTq7ZSmLetCJVvRUagxxIYbUn) {
        return field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? WeatherModule.field001.amount.getValue().floatValue() : JxV8MnFvTq7ZSmLetCJVvRUagxxIYbUn;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_147() {
        return field002;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ class_4761 X41zd8mirfgSS2uFIKPpNYA1SncpbZ1o() {
        if (!field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return null;
        }
        return switch (WeatherModule.field001.mode.getValue().ordinal()) {
            case 3 -> field003;
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ boolean vvdQ62Xlfu45ARI1JlnnCtSaLh1PVzmg(class_2396<?> ErhSJxz9taFxFaFMaEK8c0atHgp11yG4) {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && WeatherModule.field001.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(fPteSUqTDILgxs3GOaZfAt0x9U7pFTqW.Ash) && ErhSJxz9taFxFaFMaEK8c0atHgp11yG4 == class_2398.field_22248;
    }

    public static /* bridge */ /* synthetic */ void TYmcYkheSadLlXutoR5eIKfWywVHWvkB(boolean yDgGmtn5LbUwXdhXC1JJS4VCD8kjOdka) {
        field002 = yDgGmtn5LbUwXdhXC1JJS4VCD8kjOdka;
    }

    static {
        field002 = false;
        field003 = new ZopjyATzUVUlf81u0DtX80UAxDSbZ1lX((class_2394)class_2398.field_22248, 0.025f);
    }
}

