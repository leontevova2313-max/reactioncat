/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_5602;
import net.minecraft.class_5617;
import net.minecraft.class_591;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.phobos.mixin.game.entity.ILivingEntity;
import org.phobos.mixin.game.render.interfaces.ILimbAnimator;
import org.phobos.secure.group049.gVU5oJArtyuNWJ5x6dLv3hg2YvSFYib6;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0418
implements SecureInterface0134 {
    public /* synthetic */ long field001;
    public /* synthetic */ class_1657 field002;
    public final /* synthetic */ float field003;
    public final /* synthetic */ long field004;
    public final /* synthetic */ class_591<class_1657> field005;

    public static /* bridge */ /* synthetic */ void sZaEMK0p77WNbWJUzEcpHiN8mva3xwl1(class_1657 NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv, class_1657 vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ) {
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.field_6283 = NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.field_6283;
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.field_6241 = NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.field_6241;
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.field_6279 = NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.field_6279;
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.field_6251 = NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.field_6251;
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.method_5660(NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.method_5715());
        vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ.method_18380(NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv.method_18376());
        ((ILivingEntity)vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ).setLeaningPitch(((ILivingEntity)NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv).getLeaningPitch());
        ((ILivingEntity)vN1vBc5b5ef3UHuIetnw5inNxSc4hNgZ).setLastLeaningPitch(((ILivingEntity)NrdvzdoPhlUjVhTfMxKwdX9yudyZxlZv).getLastLeaningPitch());
    }

    public static /* bridge */ /* synthetic */ class_1657 FmALGWwGx3kGOnV0vIAtkWvkh8OW7Ekz(class_1657 GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ, class_638 class_6382) {
        gVU5oJArtyuNWJ5x6dLv3hg2YvSFYib6 field006 = new gVU5oJArtyuNWJ5x6dLv3hg2YvSFYib6((class_1937)class_6382, class_2338.field_10980, GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ.field_6283, new GameProfile(GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ.method_5667(), GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ.method_5477().getString()));
        field006.method_5878((class_1297)GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ);
        SecureClass0418.sZaEMK0p77WNbWJUzEcpHiN8mva3xwl1(GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ, field006);
        field006.field_42108.method_48567(GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ.field_42108.method_48566());
        ((ILimbAnimator)field006.field_42108).setPos(GM0IJUcDcXdqzNvynP0DvgIW5YPcuIwJ.field_42108.method_48569());
        return field006;
    }

    public /* synthetic */ SecureClass0418(class_1657 WunC8VhMmLQJrPi9ka4B74YJErWBGhCo, float f) {
        class_591 class_5913;
        this.field002 = WunC8VhMmLQJrPi9ka4B74YJErWBGhCo;
        if (WunC8VhMmLQJrPi9ka4B74YJErWBGhCo instanceof class_742) {
            class_742 field007 = (class_742)WunC8VhMmLQJrPi9ka4B74YJErWBGhCo;
            class_5913 = new class_591(new class_5617.class_5618(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1541(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().method_43336(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1478(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_31974(), SecureClass0418.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772).method_32167(field007.method_52814().comp_1629().equals((Object)class_8685.class_7920.field_41122) ? class_5602.field_27581 : class_5602.field_27577), false);
        } else {
            class_5913 = new class_591(new class_5617.class_5618(P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1480(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1541(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1561().method_43336(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1478(), P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_31974(), SecureClass0418.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1772).method_32167(class_5602.field_27577), false);
        }
        this.field005 = class_5913;
        this.field004 = System.currentTimeMillis();
        this.field003 = f;
    }
}

