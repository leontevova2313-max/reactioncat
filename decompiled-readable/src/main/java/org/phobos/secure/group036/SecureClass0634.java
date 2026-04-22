/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group036;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_2960;
import org.phobos.secure.group004._3RBQ2qzlivEuqrckN9EQvFOCGZYGiZs0;
import org.phobos.secure.group019.ZvBeo7i0simoxGAyiSpVPDBeEnuwYe47;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group058.SecureClass1049;
import org.phobos.secure.group021.MaFTwnQtLLsp4VkTxlzyljdCDmz03qih;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group059.SecureClass1073;

public class SecureClass0634
extends SecureClass1073<Object> {
    public final /* synthetic */ SecureClass0603<Long> fade;
    public static final /* synthetic */ class_2960 field001;
    public final /* synthetic */ SecureClass0603<Boolean> test;

    public static /* bridge */ /* synthetic */ void cfr_renamed_849(SecureClass0634 PqmnIOC2SgLQmKhF1Y4Z3yMUa3BTjErT, MaFTwnQtLLsp4VkTxlzyljdCDmz03qih vPTwNO7X21TEmcQuUsFcLBGFlNoIIJry) {
        PqmnIOC2SgLQmKhF1Y4Z3yMUa3BTjErT.XsWTXxJfCmaMdexBhUmZ740ooYtth7zp(vPTwNO7X21TEmcQuUsFcLBGFlNoIIJry);
    }

    public static /* bridge */ /* synthetic */ SecureClass0603 cfr_renamed_850(SecureClass0634 PgpnhUfKFy4SqorTCMoFwpgenx7Z6ulM) {
        return PgpnhUfKFy4SqorTCMoFwpgenx7Z6ulM.K19r6yg6IFT2vXC3kQ3HwgPeiRxWkNUX;
    }

    public /* synthetic */ SecureClass0634() {
        super("Killfeed");
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Fade", 1000L, 250L, 5000L, true));
        this.test = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Test").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Adds a fake entry, use this to see the position of the element"));
        this.cfr_renamed_69(new ZvBeo7i0simoxGAyiSpVPDBeEnuwYe47(this));
        this.test.cfr_renamed_123(pqg3cuKNROEHP0FVTF7WKzLLsup4nwp2 -> {
            if (pqg3cuKNROEHP0FVTF7WKzLLsup4nwp2.booleanValue() && SecureClass0634.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null) {
                this.XsWTXxJfCmaMdexBhUmZ740ooYtth7zp(MaFTwnQtLLsp4VkTxlzyljdCDmz03qih.N3fygVXq0U9ROhGHGXrLBRgyV7jzJAvh(_3RBQ2qzlivEuqrckN9EQvFOCGZYGiZs0.cfr_renamed_851("Attacker \u00a7f->\u00a7r Victim", "Attacker -> Victim")).MXUJAC4RTABhdn6cNkK1eqQ5dGV7ofIf(() -> {
                    if (!((Boolean)this.K19r6yg6IFT2vXC3kQ3HwgPeiRxWkNUX.getValue()).booleanValue()) {
                        return null;
                    }
                    return (DzMkalgqpc9lzwJf0LBeTnFZlyTHMEV5, BswD5YXIf6rULH85oW2tVFed5G4sGH66, C8cvZChFae2OSx9LQmsv6NT3DRE2ijSa, c9xDNdN1Hg1J2a6300xhvJXKiUzE8VU6, UeirzFh0DkxYCXikjdZQ2TzxWgPh8I8V) -> {
                        RenderSystem.setShaderTexture((int)0, (class_2960)field001);
                        SecureClass1049.cfr_renamed_54(BswD5YXIf6rULH85oW2tVFed5G4sGH66, C8cvZChFae2OSx9LQmsv6NT3DRE2ijSa, c9xDNdN1Hg1J2a6300xhvJXKiUzE8VU6, UeirzFh0DkxYCXikjdZQ2TzxWgPh8I8V);
                    };
                }));
                this.test.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
    }

    static {
        field001 = class_2960.method_60655((String)"phobos", (String)"icons/skull.png");
    }
}

