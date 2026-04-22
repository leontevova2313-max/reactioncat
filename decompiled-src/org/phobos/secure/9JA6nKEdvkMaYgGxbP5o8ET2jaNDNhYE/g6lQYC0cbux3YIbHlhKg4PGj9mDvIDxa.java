/*
 * Decompiled with CFR.
 */
package org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE;

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

public class g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa {
    public static final /* synthetic */ class_2960 kmVPPyEwnro1rUW6g1QucZ6lXZ4n2s5H;

    public static /* bridge */ /* synthetic */ void ury0awWvwu8ituMn0vLvBuFp9bzSNXBC(CallbackInfoReturnable<List<class_785>> H1IO58p44dyzTwwbv3WkUPHxSHtZWoeC) {
        float f = (float)g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.ax0tIGbszTD0GlxkAFsEfcMfWyBNmpdJ();
        float syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh = (float)g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.cfr_renamed_293();
        Iterator<E> iterator = ((List)H1IO58p44dyzTwwbv3WkUPHxSHtZWoeC.getReturnValue()).iterator();
        block6: while (iterator.hasNext()) {
            class_785 cwzmF4j2RE3T31TtMtCEuWKy3dOJSkrc = (class_785)iterator.next();
            Vector3f FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB = cwzmF4j2RE3T31TtMtCEuWKy3dOJSkrc.field_4228;
            Vector3f XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz = cwzmF4j2RE3T31TtMtCEuWKy3dOJSkrc.field_4231;
            Set<K> EMeimKYKo0tKjezD3uHfTUnryDftgKAg = cwzmF4j2RE3T31TtMtCEuWKy3dOJSkrc.field_4230.keySet();
            if (EMeimKYKo0tKjezD3uHfTUnryDftgKAg.size() != 1) continue;
            class_2350 class_23502 = (class_2350)EMeimKYKo0tKjezD3uHfTUnryDftgKAg.stream().findAny().get();
            switch (class_23502) {
                case field_11036: {
                    FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.set(FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.x - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.y - f, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.z - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.set(XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.x + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.y - f, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.z + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    break;
                }
                case field_11033: {
                    FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.set(FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.x - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.y + f, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.z - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.set(XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.x + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.y + f, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.z + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    break;
                }
                case field_11039: {
                    FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.set(FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.x - f, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.y + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.z - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.set(XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.x - f, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.y - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.z + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    break;
                }
                case field_11034: {
                    FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.set(FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.x + f, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.y + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, FJIgjTqBdXplv1Nm15FJE1sLutTQFhZB.z - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
                    XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.set(XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.x + f, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.y - syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh, XaqRjwNXDVoTUbBiDu4XVHdOBgHawHCz.z + syMTV0Tytq8gyjS4SSsjIbtP9gqk7AAh);
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
        int LFCR88FuERjWgQQpEOvInGEw4oeBcNky;
        class_801.class_802 TD9zbsdifnoj9OhsYuAdFiCOJF2iwm36 = null;
        for (class_801.class_802 R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt : cUeB6IO8iLepJDtHr0UjUyR2E0JlLkSK) {
            int H5KD7BvJa4Nup3DAIiKVRNZvK2NwLPRH;
            if (R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3484() == null || !R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3484().equals((Object)OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z)) continue;
            int n = H5KD7BvJa4Nup3DAIiKVRNZvK2NwLPRH = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa;
            if (R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3486() != H5KD7BvJa4Nup3DAIiKVRNZvK2NwLPRH || g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.cfr_renamed_293() != 0.0 && R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt.method_3485() != (!OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa) - 1) continue;
            TD9zbsdifnoj9OhsYuAdFiCOJF2iwm36 = R8zA6X6lZ1pdiNhom3g8MZ5XOGlU2Kpt;
            break;
        }
        int n = LFCR88FuERjWgQQpEOvInGEw4oeBcNky = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? FCXY2U685r03nFrIpOMX9j5nT06FeFUa : q5I50rIk2qJlyRdpEatCvGeW47YUF9pY;
        if (TD9zbsdifnoj9OhsYuAdFiCOJF2iwm36 == null) {
            int NWFjKyZfSK5w9m0ZAxnWZgk5VnpOHDkp = OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z.method_3491() ? q5I50rIk2qJlyRdpEatCvGeW47YUF9pY : FCXY2U685r03nFrIpOMX9j5nT06FeFUa;
            cUeB6IO8iLepJDtHr0UjUyR2E0JlLkSK.add(new class_801.class_802(OSFpJ40MehS2bzsiw7yjO1G96wGrB75Z, LFCR88FuERjWgQQpEOvInGEw4oeBcNky, NWFjKyZfSK5w9m0ZAxnWZgk5VnpOHDkp));
        } else {
            TD9zbsdifnoj9OhsYuAdFiCOJF2iwm36.method_3483(LFCR88FuERjWgQQpEOvInGEw4oeBcNky);
        }
        return true;
    }

    static {
        kmVPPyEwnro1rUW6g1QucZ6lXZ4n2s5H = class_2960.method_60656((String)"atlases/blocks.png");
    }

    public static /* bridge */ /* synthetic */ void bbIPhmaGgatCC1B6KyAQZMXFHPghRQGp(class_7764 Q49PISwfaudpqJb3UuUUeMTPSlt6jknt, float EeqynAub3sN6pnERLsctLq9n0YpBrMhF, CallbackInfoReturnable<Float> x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ) {
        if (Q49PISwfaudpqJb3UuUUeMTPSlt6jknt.method_45816().equals((Object)kmVPPyEwnro1rUW6g1QucZ6lXZ4n2s5H) && EeqynAub3sN6pnERLsctLq9n0YpBrMhF == x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ.getReturnValueF()) {
            x972ptYQkWpLKIobJ6ysuQri1TmmNeAJ.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }
}

