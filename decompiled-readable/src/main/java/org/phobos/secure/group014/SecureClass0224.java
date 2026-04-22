/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.class_2350;
import net.minecraft.class_2960;
import net.minecraft.class_7764;
import net.minecraft.class_785;
import net.minecraft.class_801;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class SecureClass0224 {
    public static final /* synthetic */ class_2960 field001;

    public static /* bridge */ /* synthetic */ void ury0awWvwu8ituMn0vLvBuFp9bzSNXBC(CallbackInfoReturnable<List<class_785>> H1IO58p44dyzTwwbv3WkUPHxSHtZWoeC) {
        float f = (float)SecureClass0224.ax0tIGbszTD0GlxkAFsEfcMfWyBNmpdJ();
        float field002 = (float)SecureClass0224.cfr_renamed_293();
        Iterator<E> iterator = ((List)H1IO58p44dyzTwwbv3WkUPHxSHtZWoeC.getReturnValue()).iterator();
        block6: while (iterator.hasNext()) {
            class_785 field003 = (class_785)iterator.next();
            Vector3f field004 = field003.field_4228;
            Vector3f field005 = field003.field_4231;
            Set<K> field006 = field003.field_4230.keySet();
            if (field006.size() != 1) continue;
            class_2350 class_23502 = (class_2350)field006.stream().findAny().get();
            switch (class_23502) {
                case field_11036: {
                    field004.set(field004.x - field002, field004.y - f, field004.z - field002);
                    field005.set(field005.x + field002, field005.y - f, field005.z + field002);
                    break;
                }
                case field_11033: {
                    field004.set(field004.x - field002, field004.y + f, field004.z - field002);
                    field005.set(field005.x + field002, field005.y + f, field005.z + field002);
                    break;
                }
                case field_11039: {
                    field004.set(field004.x - f, field004.y + field002, field004.z - field002);
                    field005.set(field005.x - f, field005.y - field002, field005.z + field002);
                    break;
                }
                case field_11034: {
                    field004.set(field004.x + f, field004.y + field002, field004.z - field002);
                    field005.set(field005.x + f, field005.y - field002, field005.z + field002);
                    continue block6;
                }
            }
        }
        return;
    }

    public static /* bridge */ /* synthetic */ double ax0tIGbszTD0GlxkAFsEfcMfWyBNmpdJ() {
        return 1.0E-4;
    }

    public static /* bridge */ /* synthetic */ double cfr_renamed_293() {
        return 0.002;
    }

    public static /* bridge */ /* synthetic */ boolean fTQ2EIYcmOeNMc6pg5GIANHGP762gByS(List<class_801.class_802> cUeB6IO8iLepJDtHr0UjUyR2E0JlLkSK, class_801.class_803 OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z, int FCXY2U685r03nFrIpOMX9j5nT06FeFUa, int q5I50rIk2qJlyRdpEatCvGeW47YUF9pY) {
        int field007;
        class_801.class_802 field008 = null;
        for (class_801.class_802 R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt : cUeB6IO8iLepJDtHr0UjUyR2E0JlLkSK) {
            int field009;
            if (R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3484() == null || !R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3484().equals((Object)OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z)) continue;
            int n = field009 = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa;
            if (R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3486() != field009 || SecureClass0224.cfr_renamed_293() != 0.0 && R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3485() != (!OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa) - 1) continue;
            field008 = R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt;
            break;
        }
        int n = field007 = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? FCXY2U685r03nFrIpOMX9j5nT06FeFUa : q5I50rIk2qJlyRdpEatCvGeW47YUF9pY;
        if (field008 == null) {
            int field010 = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa;
            cUeB6IO8iLepJDtHr0UjUyR2E0JlLkSK.add(new class_801.class_802(OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z, field007, field010));
        } else {
            field008.method_3483(field007);
        }
        return true;
    }

    static {
        field001 = class_2960.method_60656((String)"atlases/blocks.png");
    }

    public static /* bridge */ /* synthetic */ void bbIPhmaGgatCC1B6KyAQZMXFHPghRQGp(class_7764 Q49PISwfaudpqJb3UuUUeMTPSlt6jknt, float EeqynAub3sN6pnERLsctLq9n0YpBrMhF, CallbackInfoReturnable<Float> x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ) {
        if (Q49PISwfaudpqJb3UuUUeMTPSlt6jknt.method_45816().equals((Object)field001) && EeqynAub3sN6pnERLsctLq9n0YpBrMhF == x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ.getReturnValueF()) {
            x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }
}

