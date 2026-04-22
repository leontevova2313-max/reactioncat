/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group003;

import java.awt.Color;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_3728;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group014.siFlcdV4gO40ViN50kR3xElpMyOpuilE;
import org.phobos.secure.group025.SecureClass0438;
import org.phobos.secure.group029.SecureInterface0079;
import org.phobos.secure.group038.SecureClass0658;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group040.SecureClass0704;
import org.phobos.secure.group042.SecureClass0755;
import org.phobos.secure.group050.SecureClass0898;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0031
extends SecureClass0438<Color, SecureClass0074>
implements SecureInterface0079 {
    public /* synthetic */ float field001;
    public /* synthetic */ float field002;
    public /* synthetic */ boolean field003;
    public static final /* synthetic */ Logger field004;
    public final /* synthetic */ List<siFlcdV4gO40ViN50kR3xElpMyOpuilE> field005;
    public final /* synthetic */ SecureClass0377 field006;
    public final /* synthetic */ SecureClass0704 field007;
    public /* synthetic */ float field008;
    public final /* synthetic */ SecureClass0377 field009;
    public /* synthetic */ float field010;
    public final /* synthetic */ SecureClass0377 field011;
    public /* synthetic */ boolean field012;
    public /* synthetic */ boolean field013;
    public final /* synthetic */ Color field014;
    public final /* synthetic */ SecureClass0377 field015;
    public final /* synthetic */ SecureClass0377 field016;
    public final /* synthetic */ SecureClass0377 field017;
    public final /* synthetic */ SecureClass0377 field018;
    public /* synthetic */ boolean field019;
    public /* synthetic */ boolean field020;

    public /* synthetic */ SecureClass0031(SecureClass0874 r2gKgtzZYeHDkxFAeGPvmOsFTYYAvojd, SecureClass0755 blPX7iAYfphTuiPhFmB9HVbMH7dFj5kq, float ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, float c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, float F4uafYpRH374Gh3uxeJTclrafisXAp0Q, float f, SecureClass0658 nz5ZV3gm2l9m9uyzyu5oh5ecU1LeT72Q, String ST2AgyeOT4uuD3yVq1AvsBqmMtZ15mXg, SecureClass0074 WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6) {
        super(r2gKgtzZYeHDkxFAeGPvmOsFTYYAvojd, blPX7iAYfphTuiPhFmB9HVbMH7dFj5kq, ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, F4uafYpRH374Gh3uxeJTclrafisXAp0Q, f, nz5ZV3gm2l9m9uyzyu5oh5ecU1LeT72Q, ST2AgyeOT4uuD3yVq1AvsBqmMtZ15mXg, WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6);
        this.field009 = new SecureClass0377();
        this.field017 = new SecureClass0377();
        this.field006 = new SecureClass0377();
        this.field016 = new SecureClass0377();
        this.field018 = new SecureClass0377();
        this.field015 = new SecureClass0377();
        this.field011 = new SecureClass0377(10.0f);
        this.field007 = new SecureClass0704();
        this.field014 = new Color(120, 120, 120, 42);
        Color field021 = (Color)WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.getValue();
        float[] field022 = Color.RGBtoHSB(field021.getRed(), field021.getGreen(), field021.getBlue(), null);
        this.field010 = field022[0];
        this.field008 = field022[1];
        this.field002 = field022[2];
        this.field001 = (float)field021.getAlpha() / 255.0f;
        siFlcdV4gO40ViN50kR3xElpMyOpuilE field023 = new siFlcdV4gO40ViN50kR3xElpMyOpuilE("Sync", ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, F4uafYpRH374Gh3uxeJTclrafisXAp0Q, f, WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.xpdRYZdJFCkGGWRsBIdPIPyJZqsBbdbW(), (vSJpM7mMrEcE06ltBAwYUydnHT8NoMbI, IunEol5IUTim7lg30PdrvIZcSGjznWhS) -> WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.zs3jOWt5gZ8548S1BL65ANg0sE5N7JFo((boolean)IunEol5IUTim7lg30PdrvIZcSGjznWhS));
        siFlcdV4gO40ViN50kR3xElpMyOpuilE field024 = new siFlcdV4gO40ViN50kR3xElpMyOpuilE("Rainbow", ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, F4uafYpRH374Gh3uxeJTclrafisXAp0Q, f, WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.EHHteazwUsM3Ve5lh3htoHnnGKMhwSyg(), !WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.Viid0Kj97f4G592IkzLJn2ZQcCneqDd5(), (siFlcdV4gO40ViN50kR3xElpMyOpuilE2, DHX4oDy7qhbmxOODTu3bh8KoRTLFolfF) -> WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.cfr_renamed_94((boolean)DHX4oDy7qhbmxOODTu3bh8KoRTLFolfF), (tF3U9ec4HPw78J9lSZ7CPivmIxjzBjsM, KTNbFJRjiLUcN0DaJejyDSaabtvofLc5) -> WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.DjtmqJXfFwdrAz3e3O4l7XNKLRWhiW0u(!WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.Viid0Kj97f4G592IkzLJn2ZQcCneqDd5()));
        siFlcdV4gO40ViN50kR3xElpMyOpuilE field025 = new siFlcdV4gO40ViN50kR3xElpMyOpuilE("Copy", ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, F4uafYpRH374Gh3uxeJTclrafisXAp0Q, f, false, (fcMHtiR6bYhb77A4VHRjSadUUXqWGwws, bl) -> {
            fcMHtiR6bYhb77A4VHRjSadUUXqWGwws.EDwoO45jvH6uIWNniijXVqC8zsfmS7YZ = false;
            class_3728.method_27551((class_310)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3, (String)String.valueOf(SecureClass0898.cfr_renamed_95((Color)WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.getValue())));
        });
        siFlcdV4gO40ViN50kR3xElpMyOpuilE field026 = new siFlcdV4gO40ViN50kR3xElpMyOpuilE("Paste", ncSxxdctIKzMrZAJ11Cb6mMgW62KAukx, c9DJiDLqPc7Q0DygxIjGQ0Mp36g8Dtxa, F4uafYpRH374Gh3uxeJTclrafisXAp0Q, f, false, (KeVOz25RtxC8zMSVD2CGvOsOOK0Vf17F, bl) -> {
            KeVOz25RtxC8zMSVD2CGvOsOOK0Vf17F.EDwoO45jvH6uIWNniijXVqC8zsfmS7YZ = false;
            String field027 = class_3728.method_27556((class_310)P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3);
            if (field027 != null && WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.cfr_renamed_96(field027)) {
                float[] field028 = Color.RGBtoHSB(WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.srdKIklhaHTwkjguzOf0Xw9PomQEb9YL(), WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.evNabDfCrgBzClnr0tGQnfmHZYxmkug6(), WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.xydnY8FIPZLM2UuIgvH9nn9x8EudOBWs(), null);
                this.field010 = field028[0];
                this.field008 = field028[1];
                this.field002 = field028[2];
                this.field001 = (float)WR88Bm24AGv7IkDJgT03JSRZK6RGmeN6.cfr_renamed_97() / 255.0f;
            }
        });
        this.field005 = List.of(field023, field024, field025, field026);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field009);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field017);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field006);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field016);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field018);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field015);
        this.field007.YM32tseYLtCLzXXl5WsR1SlE86C7oouF(this.field011);
    }

    static {
        field004 = LoggerFactory.getLogger(SecureClass0031.class);
    }
}

