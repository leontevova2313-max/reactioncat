/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import java.util.HashMap;
import java.util.Set;
import net.minecraft.class_1743;
import net.minecraft.class_1770;
import net.minecraft.class_1781;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1829;
import net.minecraft.class_2246;
import org.phobos.secure.group003.FKGCdJiXeQhZY86oWClirKPVjEVYo4IF;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.SecureClass0426;
import org.phobos.secure.group027._7KxozEshHDpiyc1oOOyKphK5qx2xyOJm;
import org.phobos.secure.group029._5QPgPrqaqhkoeT2dtViSRYq6EqKWxbHl;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group039.BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group055.LVVoyUHGgvmcr9J0GUBuIH7fphkI3xaY;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.J8z2hLawmOz47IaAOqGvpKmMCpCbvSg2;
import org.phobos.secure.group043.SecureClass0768;
import org.phobos.secure.group050.SecureInterface0126;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group056.SecureClass1027;

public class LegitHelperModule
extends SecureClass1027 {
    public final /* synthetic */ _5QPgPrqaqhkoeT2dtViSRYq6EqKWxbHl field001;
    public final /* synthetic */ _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm field002;
    public final /* synthetic */ SecureClass0603<SecureClass0666> elytraSwap;
    public final /* synthetic */ SecureClass0603<SecureClass0666> shieldSwap;
    public final /* synthetic */ SecureClass0603<SecureClass0666> maceSwap;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Float>> speed;
    public final /* synthetic */ _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm field003;
    public static /* synthetic */ LegitHelperModule field004;
    public final /* synthetic */ _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm field005;

    public /* synthetic */ LegitHelperModule(SecureClass0242 sAJ2SOOKi27b3OZ8GRdq4NfJxgTCRhFY) {
        super(sAJ2SOOKi27b3OZ8GRdq4NfJxgTCRhFY, "LegitHelper", SecureClass1004.cfr_renamed_106, "Helps you in vanilla pvp", new int[0]);
        this.maceSwap = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("MaceSwap").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Swaps sword & anchors and glowstone to mace & elytra and fireworks"));
        this.elytraSwap = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("ElytraSwap").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Swaps anchors & glowstone with elytra & fireworks"));
        this.shieldSwap = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("ShieldSwap").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Swaps shield with axe"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0426<Float>("Speed", (Float)((Object)SecureInterface0126.wMAZSEjvEoULCU29BTHtikjbktQ9hg7X(Float.valueOf(50.0f), Float.valueOf(150.0f))), Float.valueOf(10.0f), Float.valueOf(200.0f), new String[0]).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Aim speed"));
        this.field003 = new _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm().zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(UUuLwhbNEUAofyzvo1Cbv8gF5GUlg3a2 -> UUuLwhbNEUAofyzvo1Cbv8gF5GUlg3a2.method_7909() instanceof class_1829, SecureClass0768::cfr_renamed_264)).zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(iTXuPxA2hE0mATSua0Wpw5RkYZ6MG7E2 -> iTXuPxA2hE0mATSua0Wpw5RkYZ6MG7E2.method_31574(class_2246.field_23152.method_8389()), class_17992 -> class_17992.method_7909() instanceof class_1770)).zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(class_17992 -> class_17992.method_31574(class_2246.field_10171.method_8389()), OszngCCKhpBGFbEBFsXM2pp9VB5F5yAX -> OszngCCKhpBGFbEBFsXM2pp9VB5F5yAX.method_7909() instanceof class_1781));
        this.field002 = new _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm().zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(BzVcEBAOoZMnNbsumU4WmSPK8KUvRsvQ -> BzVcEBAOoZMnNbsumU4WmSPK8KUvRsvQ.method_31574(class_2246.field_23152.method_8389()), YvRTqXlhTxVT4BC5Inspxp8aRSmAEFCT -> YvRTqXlhTxVT4BC5Inspxp8aRSmAEFCT.method_7909() instanceof class_1770)).zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(QcIT8ds6GdZa1q9ZljR8RMlCeKTNshNd -> QcIT8ds6GdZa1q9ZljR8RMlCeKTNshNd.method_31574(class_2246.field_10171.method_8389()), mbvcVlmUfeXavPC14NJKfqZsVxyIYaM0 -> mbvcVlmUfeXavPC14NJKfqZsVxyIYaM0.method_7909() instanceof class_1781));
        this.field005 = new _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm().zCEHEj34re7Jbao5MFn1R8VH8ENmZUl3(BDwkcy7wQTZi3R8W6SrX1lo16NVRt69Y.cfr_renamed_263(PrORMmoxDnHrz1x7KTtQH8TOVKltSNFH -> PrORMmoxDnHrz1x7KTtQH8TOVKltSNFH.method_31574(class_1802.field_8255), SzjvO7TJk3mFcuo3kgwVNp0HnDQXhxZQ -> SzjvO7TJk3mFcuo3kgwVNp0HnDQXhxZQ.method_7909() instanceof class_1743));
        this.field001 = new _5QPgPrqaqhkoeT2dtViSRYq6EqKWxbHl().lfwye9WuFykEx6DS0TNdc8PTlLAiYU1c(this.maceSwap, this.field003).lfwye9WuFykEx6DS0TNdc8PTlLAiYU1c(this.elytraSwap, this.field002).lfwye9WuFykEx6DS0TNdc8PTlLAiYU1c(this.shieldSwap, this.field005);
        HashMap<_7KxozEshHDpiyc1oOOyKphK5qx2xyOJm, SecureClass0603<Set>> field006 = new HashMap<_7KxozEshHDpiyc1oOOyKphK5qx2xyOJm, SecureClass0603<Set>>();
        int field007 = 1;
        while (true) {
            if (field007 >= 10) {
                this.cfr_renamed_69(new FKGCdJiXeQhZY86oWClirKPVjEVYo4IF(this, field006));
                this.cfr_renamed_69(new J8z2hLawmOz47IaAOqGvpKmMCpCbvSg2(this, sAJ2SOOKi27b3OZ8GRdq4NfJxgTCRhFY));
                this.cfr_renamed_69(new LVVoyUHGgvmcr9J0GUBuIH7fphkI3xaY(this, sAJ2SOOKi27b3OZ8GRdq4NfJxgTCRhFY));
                field004 = this;
                return;
            }
            SecureClass0940 field008 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("Slot-%sSwap".formatted(field007)));
            SecureClass0603<Set> field009 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Slot-%sItems".formatted(field007), new class_1792[0]).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allowed sizes: 2, 4, 6, 8"));
            this.cfr_renamed_89("Slot-%s".formatted(field007), field008, field009);
            _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm field010 = new _7KxozEshHDpiyc1oOOyKphK5qx2xyOJm().idg9jeoA5oRHMPFx6pqFZDAGlRoY7KxR(() -> {
                int field011 = ((Set)field009.getValue()).size();
                return field011 > 0 && field011 <= 8 && field011 % 2 == 0;
            });
            this.field001.lfwye9WuFykEx6DS0TNdc8PTlLAiYU1c(field008, field010);
            field009.cfr_renamed_123(hcqZ1zFuSAJi1gevarKE2jF5SWqc7uxS -> this.axH0EEZPxP7A1s2o88D4T6cc3SozJM9m((Set<class_1792>)hcqZ1zFuSAJi1gevarKE2jF5SWqc7uxS, field010));
            field006.put(field010, field009);
            ++field007;
        }
    }
}

