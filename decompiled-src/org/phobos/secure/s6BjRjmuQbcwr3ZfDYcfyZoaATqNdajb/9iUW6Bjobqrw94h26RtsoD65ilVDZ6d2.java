/*
 * Decompiled with CFR.
 */
package org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb;

import com.google.common.base.Preconditions;
import java.awt.Color;
import java.util.UUID;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.VwfvjMgQ58GYmYKcEk7G4LPA5aahLy2o;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY;

public final class _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2 {
    public static /* bridge */ /* synthetic */ Color DVUWQPWf1Gx7Xf3hGU93E9kVW22ISdxz(float z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs, float JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, float o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL, float pkaoPOlAQSQOf9E2XCnjqR20VE48oiox) {
        if (JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ < 0.0f || JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
        }
        if (o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL < 0.0f || o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Lightness");
        }
        if (pkaoPOlAQSQOf9E2XCnjqR20VE48oiox < 0.0f || pkaoPOlAQSQOf9E2XCnjqR20VE48oiox > 1.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs %= 360.0f;
        float f = (double)o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL < 0.5 ? o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL * (1.0f + JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ) : (o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL /= 100.0f) + (JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ /= 100.0f) - JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ * o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL;
        JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ = 2.0f * o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL - f;
        o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL = Math.max(0.0f, _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, f, (z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs /= 360.0f) + 0.33333334f));
        float ufPN7M80Q10nP5fhvNW2Mjj3ttrD3pHP = Math.max(0.0f, _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, f, z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs));
        JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ = Math.max(0.0f, _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, f, z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs - 0.33333334f));
        o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL = Math.min(o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL, 1.0f);
        ufPN7M80Q10nP5fhvNW2Mjj3ttrD3pHP = Math.min(ufPN7M80Q10nP5fhvNW2Mjj3ttrD3pHP, 1.0f);
        JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ = Math.min(JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, 1.0f);
        return new Color(o9iRAh66MbcLu3rP9H9GyMUTcrbOvShL, ufPN7M80Q10nP5fhvNW2Mjj3ttrD3pHP, JqDn6VrFyF94p30fGtVsQl9d5hE5UCrJ, pkaoPOlAQSQOf9E2XCnjqR20VE48oiox);
    }

    public static /* bridge */ /* synthetic */ Color cLVbqfMijsLzS6JmNYX32Ij8GcgIXlOp(Color LvutJ5sJPugdH0hzEYaGxpbQc1B2o5AR, float IFHd374Z7Leo1FWW7d0XS99BdHHSEU0Y) {
        return new Color((float)LvutJ5sJPugdH0hzEYaGxpbQc1B2o5AR.getRed() / 255.0f * IFHd374Z7Leo1FWW7d0XS99BdHHSEU0Y, (float)LvutJ5sJPugdH0hzEYaGxpbQc1B2o5AR.getGreen() / 255.0f * IFHd374Z7Leo1FWW7d0XS99BdHHSEU0Y, (float)LvutJ5sJPugdH0hzEYaGxpbQc1B2o5AR.getBlue() / 255.0f * IFHd374Z7Leo1FWW7d0XS99BdHHSEU0Y, (float)LvutJ5sJPugdH0hzEYaGxpbQc1B2o5AR.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ Color sLPYPu9gxEZdzZWoqc94bcTXQtKxDeS6(Color TZddRebt3sG0TRTWI2K3XMDSP6qbeBPi, int bW8tMJSX1Woc4OcgFBPMKkgQ4Wd58Vvr) {
        return new Color((float)TZddRebt3sG0TRTWI2K3XMDSP6qbeBPi.getRed() / 255.0f, (float)TZddRebt3sG0TRTWI2K3XMDSP6qbeBPi.getGreen() / 255.0f, (float)TZddRebt3sG0TRTWI2K3XMDSP6qbeBPi.getBlue() / 255.0f, class_3532.method_15363((float)((float)bW8tMJSX1Woc4OcgFBPMKkgQ4Wd58Vvr / 255.0f), (float)0.0f, (float)1.0f));
    }

    public static /* bridge */ /* synthetic */ Color OrsrhPEm0s25D05pyWU9Iwe06sAL1seA(Color JNeSqx8fOW1wOOSRJ5QgWobgrhOhLOeO, float bwrSCma0OZzZMbKduUzwYW9ws0mGVVRC) {
        return new Color((float)JNeSqx8fOW1wOOSRJ5QgWobgrhOhLOeO.getRed() / 255.0f, (float)JNeSqx8fOW1wOOSRJ5QgWobgrhOhLOeO.getGreen() / 255.0f, (float)JNeSqx8fOW1wOOSRJ5QgWobgrhOhLOeO.getBlue() / 255.0f, class_3532.method_15363((float)((float)JNeSqx8fOW1wOOSRJ5QgWobgrhOhLOeO.getAlpha() / 255.0f * bwrSCma0OZzZMbKduUzwYW9ws0mGVVRC), (float)0.0f, (float)1.0f));
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_928(float xIS9g19IF16sGu3WFJmIeBUiLjxQ9gsV, Color b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN) {
        xIS9g19IF16sGu3WFJmIeBUiLjxQ9gsV = Math.abs(xIS9g19IF16sGu3WFJmIeBUiLjxQ9gsV);
        double WQC9bJg5DdBD6ZXZ4UGBrd3kvDWmau4J = (double)System.currentTimeMillis() % 1750.0 / 850.0;
        float[] mDFF4FJEjmvLN9XR5YeZ4Bdb419Q3QU0 = new float[3];
        Color.RGBtoHSB(b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getRed(), b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getGreen(), b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getBlue(), mDFF4FJEjmvLN9XR5YeZ4Bdb419Q3QU0);
        float f = (float)((double)mDFF4FJEjmvLN9XR5YeZ4Bdb419Q3QU0[2] * Math.abs(((double)xIS9g19IF16sGu3WFJmIeBUiLjxQ9gsV + WQC9bJg5DdBD6ZXZ4UGBrd3kvDWmau4J) % 1.0 - (double)0.55f) + (double)0.45f);
        return Color.HSBtoRGB(mDFF4FJEjmvLN9XR5YeZ4Bdb419Q3QU0[0], mDFF4FJEjmvLN9XR5YeZ4Bdb419Q3QU0[1], f);
    }

    public static /* bridge */ /* synthetic */ Color ksA4PXNp3oxpbJVk5tc36slHAFwqjwwx(Color fakP2VIe4e0sXxfSlBv6Vm9P93BfZ5xv, int WB3QeLaLWxRACGshAPYGfENgMTRoEbKP) {
        return new Color(fakP2VIe4e0sXxfSlBv6Vm9P93BfZ5xv.getRed(), fakP2VIe4e0sXxfSlBv6Vm9P93BfZ5xv.getGreen(), fakP2VIe4e0sXxfSlBv6Vm9P93BfZ5xv.getBlue(), class_3532.method_15340((int)(fakP2VIe4e0sXxfSlBv6Vm9P93BfZ5xv.getAlpha() + WB3QeLaLWxRACGshAPYGfENgMTRoEbKP), (int)0, (int)255));
    }

    public static /* bridge */ /* synthetic */ boolean IVlDhzn5P1F2Oll26ULd1ZEDHE92UjmL(int n) {
        return n >= 0 && n <= 255;
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_95(Color PER9M3kCW6HJxw9IwQ0TtgQA9Eo3KMk6) {
        return PER9M3kCW6HJxw9IwQ0TtgQA9Eo3KMk6.getAlpha() << 24 | PER9M3kCW6HJxw9IwQ0TtgQA9Eo3KMk6.getRed() << 16 | PER9M3kCW6HJxw9IwQ0TtgQA9Eo3KMk6.getGreen() << 8 | PER9M3kCW6HJxw9IwQ0TtgQA9Eo3KMk6.getBlue();
    }

    public static /* bridge */ /* synthetic */ Color UwtZ8fC7kleVqRBtpa5BKZ7GKybtFIz7(Color W57stfO7OUT7szFOMoCfeRxFyRMTymVD, float rpZZTR1bHKHPplTEjkd8m3yy7gQTtXnf) {
        float[] fArray = Color.RGBtoHSB(W57stfO7OUT7szFOMoCfeRxFyRMTymVD.getRed(), W57stfO7OUT7szFOMoCfeRxFyRMTymVD.getGreen(), W57stfO7OUT7szFOMoCfeRxFyRMTymVD.getBlue(), null);
        return Color.getHSBColor(fArray[0], fArray[1], rpZZTR1bHKHPplTEjkd8m3yy7gQTtXnf);
    }

    public /* synthetic */ _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ Color w2BoPuJNqjrd5Bad2dNshu2VsjjrBvsV(EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, UUID jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo, Color color, Color JgN0WamKMYt6suaQ3YgH95TjdAzkcPOw, Color m5GJzTcRaolo2Esh1U7tx6n5K48YEhuO) {
        if (ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo)) {
            return JgN0WamKMYt6suaQ3YgH95TjdAzkcPOw;
        }
        if (ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.Wlu5mquyi1ElStMl4NA0ACkdCEexvpZJ().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo)) {
            return m5GJzTcRaolo2Esh1U7tx6n5K48YEhuO;
        }
        return color;
    }

    public static /* bridge */ /* synthetic */ float ZcJWk3Ga8iMV0dFt0jmQX6gNvOSVgsTk(double JdEKxUdjL8Lm4MP16Q0monleZo7sN3ZL) {
        return (float)((double)VwfvjMgQ58GYmYKcEk7G4LPA5aahLy2o.dwCniG5LTXw0xmgg4Nqk8c0nMhUfW5sW - JdEKxUdjL8Lm4MP16Q0monleZo7sN3ZL * (double)0.001f);
    }

    public static /* bridge */ /* synthetic */ Color cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1, float lFmAQP3btIQ8bDKDUTYIOrD7LPqu0Q6K) {
        return new Color((float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getRed() / 255.0f, (float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getGreen() / 255.0f, (float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getBlue() / 255.0f, class_3532.method_15363((float)lFmAQP3btIQ8bDKDUTYIOrD7LPqu0Q6K, (float)0.0f, (float)1.0f));
    }

    public static /* bridge */ /* synthetic */ Color cfr_renamed_790(Color o3UiQ2lFqTxnaVn9FrA94xbe6WYnRtZa, Color lOxbzOWCML47xvt9jJ7xLMbcvCmXem2w) {
        return _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(lOxbzOWCML47xvt9jJ7xLMbcvCmXem2w, (float)o3UiQ2lFqTxnaVn9FrA94xbe6WYnRtZa.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ Color xymiD8VHyYX7ZCoyzzg4afP5hY6inSmJ(int DS6IU9XQacqcrb1leZY5nu0XdIcsokWK) {
        int VcHCyTPkL24zDKDb2OpaXcJVPRRjZvaI = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 24 & 0xFF;
        int HcgY7GuR289axMZvMUVvZBHIvZFr029R = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 16 & 0xFF;
        int fY0n4hfIsSuhy1MjdGLKvCRSCiQ4bwoL = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 8 & 0xFF;
        int XKer30GDx3ncWhVF7rtMNASwx32MZqrF = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK & 0xFF;
        return new Color(HcgY7GuR289axMZvMUVvZBHIvZFr029R, fY0n4hfIsSuhy1MjdGLKvCRSCiQ4bwoL, XKer30GDx3ncWhVF7rtMNASwx32MZqrF, VcHCyTPkL24zDKDb2OpaXcJVPRRjZvaI);
    }

    public static /* bridge */ /* synthetic */ Color PixjPDDantYECOvNCr76PWCE8WxLvxwX(Color ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp, Color color, float NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX) {
        float wy5wPfyYsjuVuq1C6sqtgm5IQQRuybu7 = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getRed() / 255.0f;
        float QesCis3D8iSjz5IHu419DMjDmq6HXMhN = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getGreen() / 255.0f;
        float rGwbevCv65rgoBLcixx8fjvo5yZT1fKh = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getBlue() / 255.0f;
        float gJjUp48u9cT1HynTQ8UF214KunRXeABE = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getAlpha() / 255.0f;
        float ZCbUgjF02DH1UpA8S00OPyVDqO0pUiom = (float)color.getRed() / 255.0f;
        float hehZl2m2DyRRwhXDTHel2Mh7LlIDyuaC = (float)color.getGreen() / 255.0f;
        float rdM080Ic2G6M5kXN0GEtj5uz3EF7lmGZ = (float)color.getBlue() / 255.0f;
        float rEoSIjYsDm36dr7htvf2p87Y59jxLJCB = (float)color.getAlpha() / 255.0f;
        float f = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)wy5wPfyYsjuVuq1C6sqtgm5IQQRuybu7, (float)ZCbUgjF02DH1UpA8S00OPyVDqO0pUiom);
        float Lwet1UkPGfZmZNnBZezNzrwXkGy0PXQV = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)QesCis3D8iSjz5IHu419DMjDmq6HXMhN, (float)hehZl2m2DyRRwhXDTHel2Mh7LlIDyuaC);
        float DoDVdBFGOrysWhMLx3Kl0OG1q4mofTGb = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)rGwbevCv65rgoBLcixx8fjvo5yZT1fKh, (float)rdM080Ic2G6M5kXN0GEtj5uz3EF7lmGZ);
        float M1j5qxwsGboM8dbebN80X7O9B0OYRXGf = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)gJjUp48u9cT1HynTQ8UF214KunRXeABE, (float)rEoSIjYsDm36dr7htvf2p87Y59jxLJCB);
        return new Color(RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(f, 0.0f, 1.0f), RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(Lwet1UkPGfZmZNnBZezNzrwXkGy0PXQV, 0.0f, 1.0f), RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(DoDVdBFGOrysWhMLx3Kl0OG1q4mofTGb, 0.0f, 1.0f), RQEkDgQhM5mCP1cgiZcFAOCNc99UwOoY.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(M1j5qxwsGboM8dbebN80X7O9B0OYRXGf, 0.0f, 1.0f));
    }

    public static /* bridge */ /* synthetic */ Vector3f BnDLZSIXV1EJEwwv2mY59z3dlkFC6tOv(Color color) {
        return new Vector3f((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ int[] uVf8sjVFl5nBx29N1S6gGeKvsbO2IBbr(int nUz2kWt475prWjheF6UMDLdROemYbmec) {
        int n = nUz2kWt475prWjheF6UMDLdROemYbmec >> 24 & 0xFF;
        int w0MyMOOslbD6iOHd0zxg2gSltrr45b2H = nUz2kWt475prWjheF6UMDLdROemYbmec >> 16 & 0xFF;
        int gsEGnXPSUE9vGkhasvdZnsr1dr1SvI4s = nUz2kWt475prWjheF6UMDLdROemYbmec >> 8 & 0xFF;
        int xjEqTalBocdUpgFI1DbWxuumfmETDIUd = nUz2kWt475prWjheF6UMDLdROemYbmec & 0xFF;
        return new int[]{w0MyMOOslbD6iOHd0zxg2gSltrr45b2H, gsEGnXPSUE9vGkhasvdZnsr1dr1SvI4s, xjEqTalBocdUpgFI1DbWxuumfmETDIUd, n};
    }

    public static /* bridge */ /* synthetic */ Color GFFSk7B8pqei8XZQisyrPBw9jPDfBrNq(Color RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru) {
        return _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(new Color((RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getRGB() & 0xFCFCFC) >> 2 | RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getRGB() & 0xF3F3F3F3), (float)RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ int tjB7HZY7wSiTSl8ox0RZNYq6Ifim8J0r(float cDEd8bmLK9aYGfJlAFNuK4OFZeTSWpof, Color D8F17XOru9tYITm2g6TXQmCdK121pVbZ, float ZcPoHTDPmM5u4T1F6kTYqBXxKg9awZ27, float jwxZecaalUtKZqbvMRHfZF8r8QGMI375, float gaI8pHKb0Vyner0MZxFA0BGOYzZTrU7D) {
        cDEd8bmLK9aYGfJlAFNuK4OFZeTSWpof = Math.abs(cDEd8bmLK9aYGfJlAFNuK4OFZeTSWpof);
        double IsYMyQGJgWJ77RzWh6Fs8iFgssT5Lu2n = 1.0 / (double)(1.0f - ZcPoHTDPmM5u4T1F6kTYqBXxKg9awZ27);
        double xS4IiukIqR66okdKkoiiCGogRVig1MVb = (double)System.currentTimeMillis() % (1750.0 * IsYMyQGJgWJ77RzWh6Fs8iFgssT5Lu2n) / (850.0 * IsYMyQGJgWJ77RzWh6Fs8iFgssT5Lu2n);
        float[] YsrepLCbKHOCfR55xruJgItQp3De8nL5 = new float[3];
        Color.RGBtoHSB(D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getRed(), D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getGreen(), D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getBlue(), YsrepLCbKHOCfR55xruJgItQp3De8nL5);
        float f = (float)((double)gaI8pHKb0Vyner0MZxFA0BGOYzZTrU7D * Math.abs(((double)cDEd8bmLK9aYGfJlAFNuK4OFZeTSWpof + xS4IiukIqR66okdKkoiiCGogRVig1MVb) % 1.0 - (double)0.55f) + (double)0.45f);
        return Color.HSBtoRGB(YsrepLCbKHOCfR55xruJgItQp3De8nL5[0], jwxZecaalUtKZqbvMRHfZF8r8QGMI375, f);
    }

    public static /* bridge */ /* synthetic */ Color cfr_renamed_929(Color YRE12XS0rsYO1od2TFNRufju1X9aRGA1, Color n8nu34XuptEoqX0r1qao6dtmpN5RqVLn, float XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz) {
        if (XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz > 1.0f) {
            XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz = 1.0f;
        } else if (XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz < 0.0f) {
            XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz = 0.0f;
        }
        float f = 1.0f - XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz;
        int hy7n7Fl7jJezLWRBtEdtZ5nzhYA0WHQh = YRE12XS0rsYO1od2TFNRufju1X9aRGA1.getRGB();
        int s8X9dd8DLpIrMTCSNjo4asifIB5nl2KC = n8nu34XuptEoqX0r1qao6dtmpN5RqVLn.getRGB();
        int n = hy7n7Fl7jJezLWRBtEdtZ5nzhYA0WHQh >> 24 & 0xFF;
        int eMaOtCSGyUChKvfZv5lEyX2PGrZ9Rf1t = (hy7n7Fl7jJezLWRBtEdtZ5nzhYA0WHQh & 0xFF0000) >> 16;
        int XGltkRIGaFJU1PX8dtZyfKtELRnDTtOv = (hy7n7Fl7jJezLWRBtEdtZ5nzhYA0WHQh & 0xFF00) >> 8;
        int HlKzZTnIgxcBbuuB9flfhkNnsFqGHfKH = hy7n7Fl7jJezLWRBtEdtZ5nzhYA0WHQh & 0xFF;
        int WJaeysciXnW5AGy4gQ0aY1SIXnTD16FZ = s8X9dd8DLpIrMTCSNjo4asifIB5nl2KC >> 24 & 0xFF;
        int ILr3UOct6v0nfRfS7kRmUkNrK1SkO5oE = (s8X9dd8DLpIrMTCSNjo4asifIB5nl2KC & 0xFF0000) >> 16;
        int EqAWoXI0KS5nyadqolfa9KcItXNNiEhJ = (s8X9dd8DLpIrMTCSNjo4asifIB5nl2KC & 0xFF00) >> 8;
        int n2 = s8X9dd8DLpIrMTCSNjo4asifIB5nl2KC & 0xFF;
        int E0S7rsd1pnZ8ehnfPTaDEmXaTqqrcuAU = (int)((float)n * f + (float)WJaeysciXnW5AGy4gQ0aY1SIXnTD16FZ * XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz);
        int wnJ5la6AqanBpPhRAOPUtMpMLGM9UtSf = (int)((float)eMaOtCSGyUChKvfZv5lEyX2PGrZ9Rf1t * f + (float)ILr3UOct6v0nfRfS7kRmUkNrK1SkO5oE * XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz);
        int m06qBwKkL1qHswbBKVB4MmhdQowFSMs2 = (int)((float)XGltkRIGaFJU1PX8dtZyfKtELRnDTtOv * f + (float)EqAWoXI0KS5nyadqolfa9KcItXNNiEhJ * XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz);
        int HpKhp5SZMQwmG6EPyQ9qRRcCgXC8Gd4P = (int)((float)HlKzZTnIgxcBbuuB9flfhkNnsFqGHfKH * f + (float)n2 * XndDb0dtPJN4hfX9klFY1C2aU9sLhOFz);
        return new Color(E0S7rsd1pnZ8ehnfPTaDEmXaTqqrcuAU << 24 | wnJ5la6AqanBpPhRAOPUtMpMLGM9UtSf << 16 | m06qBwKkL1qHswbBKVB4MmhdQowFSMs2 << 8 | HpKhp5SZMQwmG6EPyQ9qRRcCgXC8Gd4P);
    }

    public static /* bridge */ /* synthetic */ Color bZVG03hI4wx3EJnLK4LQOeFv2olU0sfS(int s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo, int n, float sH8da4nA0IRoGMbSrDuVlWUyV6GKAylz, float MMmNMKEdvEPHi8pCH73mMjolHgVZ9EiR) {
        float rEl4yvJ8Br2Yzb6kfhcHUnaVV2oyq8pU = (System.currentTimeMillis() + (long)n) % (long)s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo;
        return Color.getHSBColor(rEl4yvJ8Br2Yzb6kfhcHUnaVV2oyq8pU /= (float)s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo, sH8da4nA0IRoGMbSrDuVlWUyV6GKAylz, MMmNMKEdvEPHi8pCH73mMjolHgVZ9EiR);
    }

    public static /* bridge */ /* synthetic */ Color N7XFOz711PiWjK2NAUruQqxWKPRpJzWb(Color ygmpBBTlPYDYK3objoZlA5do72T5YDuN, float Ch1Q5lQCWYoSpczoYXVWzUGLa7huRoVu) {
        float[] Hi90icoTnZXxplOe8pLkiukdYKJsUDVZ = Color.RGBtoHSB(ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getRed(), ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getGreen(), ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getBlue(), null);
        return Color.getHSBColor(Hi90icoTnZXxplOe8pLkiukdYKJsUDVZ[0], Ch1Q5lQCWYoSpczoYXVWzUGLa7huRoVu, Hi90icoTnZXxplOe8pLkiukdYKJsUDVZ[2]);
    }

    public static /* bridge */ /* synthetic */ class_243 iDrOrCYK1PV9W9Ma7mfx3Hxb4txPAYMa(Color e8706iAU8tyqGhcrfCKNe20tTe01LfzQ) {
        return new class_243((double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getRed() / 255.0f), (double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getGreen() / 255.0f), (double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getBlue() / 255.0f));
    }

    public static /* bridge */ /* synthetic */ float[] gnqLEsxEGMPGfzJPlR7HLZ0btMc3yksh(int[] nArray) {
        Preconditions.checkArgument((nArray.length == 4 ? 1 : 0) != 0, (Object)("Expected int[] of size 4, got " + nArray.length));
        int NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w = 0;
        while (NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w < nArray.length) {
            Preconditions.checkArgument((boolean)_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.IVlDhzn5P1F2Oll26ULd1ZEDHE92UjmL(nArray[NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w]), (Object)("Expected in[" + NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w + "] to be 0-255, got " + nArray[NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w]));
            ++NQgeqREVlYbj1yWtbVXOl5lOfjb6QY0w;
        }
        return new float[]{(float)nArray[0] / 255.0f, (float)nArray[1] / 255.0f, (float)nArray[2] / 255.0f, (float)nArray[3] / 255.0f};
    }

    public static /* bridge */ /* synthetic */ float a8XE3Y61tKkklDvggahGzckXaLFCFfL6(float HlgaT0sAELT7irxpqO7ytY749C1Q5uOf, float f, float f2) {
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        if (6.0f * f2 < 1.0f) {
            return HlgaT0sAELT7irxpqO7ytY749C1Q5uOf + (f - HlgaT0sAELT7irxpqO7ytY749C1Q5uOf) * 6.0f * f2;
        }
        if (2.0f * f2 < 1.0f) {
            return f;
        }
        if (3.0f * f2 < 2.0f) {
            return HlgaT0sAELT7irxpqO7ytY749C1Q5uOf + (f - HlgaT0sAELT7irxpqO7ytY749C1Q5uOf) * 6.0f * (0.6666667f - f2);
        }
        return HlgaT0sAELT7irxpqO7ytY749C1Q5uOf;
    }

    public static /* bridge */ /* synthetic */ float[] cfr_renamed_224(float[] C7Vomrj2agOpvMic4CPVbPp0vl3Lkxi4, float f) {
        return new float[]{C7Vomrj2agOpvMic4CPVbPp0vl3Lkxi4[0], C7Vomrj2agOpvMic4CPVbPp0vl3Lkxi4[1], C7Vomrj2agOpvMic4CPVbPp0vl3Lkxi4[2], f};
    }

    public static /* bridge */ /* synthetic */ Vector4f bUZGHskyQR3APc108gAvEFDTvkaP8gTv(Color xJF784luiahRWz0g6Z3U6z3QwVowZO8R) {
        return new Vector4f((float)xJF784luiahRWz0g6Z3U6z3QwVowZO8R.getRed() / 255.0f, (float)xJF784luiahRWz0g6Z3U6z3QwVowZO8R.getGreen() / 255.0f, (float)xJF784luiahRWz0g6Z3U6z3QwVowZO8R.getBlue() / 255.0f, (float)xJF784luiahRWz0g6Z3U6z3QwVowZO8R.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ float[] lmTM2nCCn8a7v73gNKAcAb2MViqPTGcg(Color vI7GMBdMjo1Ux9KOiHmzCmau2pIJnYKH) {
        return new float[]{(float)vI7GMBdMjo1Ux9KOiHmzCmau2pIJnYKH.getRed() / 255.0f, (float)vI7GMBdMjo1Ux9KOiHmzCmau2pIJnYKH.getGreen() / 255.0f, (float)vI7GMBdMjo1Ux9KOiHmzCmau2pIJnYKH.getBlue() / 255.0f, (float)vI7GMBdMjo1Ux9KOiHmzCmau2pIJnYKH.getAlpha() / 255.0f};
    }

    public static /* bridge */ /* synthetic */ int[] RneEHNrSaaFZjW93vrSV6xNbo3LXq2do(int IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi) {
        int MAkbJV5TXiv4wgy58DIg3OmbSNtZPlFa = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi >> 16 & 0xFF;
        int yM0mZvI7Td4I3SmvAwXVyjUlXDTYxAC6 = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi >> 8 & 0xFF;
        int zs3LrjtMQcTPjS4jXTJFzGnNPCwazKAz = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi & 0xFF;
        return new int[]{MAkbJV5TXiv4wgy58DIg3OmbSNtZPlFa, yM0mZvI7Td4I3SmvAwXVyjUlXDTYxAC6, zs3LrjtMQcTPjS4jXTJFzGnNPCwazKAz};
    }

    public static /* bridge */ /* synthetic */ Color IAsRsO3QmlIeFSwovm18ygQaWRbygFhz(Color uTKfoJuMKMWbzq69bd1l1JeYHpCD5Joj, Color Zc9uLB6SFlgQ5Pkz6nHtj0b7IvqZtK0i, float vO1k3UlL5LqRBgmhozZPoZsDmlBDgum9, float jgByW0EPOpcjFUMRPdWTQu5X8aygJaGT) {
        return _9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(_9iUW6Bjobqrw94h26RtsoD65ilVDZ6d2.cfr_renamed_929(uTKfoJuMKMWbzq69bd1l1JeYHpCD5Joj, Zc9uLB6SFlgQ5Pkz6nHtj0b7IvqZtK0i, vO1k3UlL5LqRBgmhozZPoZsDmlBDgum9), jgByW0EPOpcjFUMRPdWTQu5X8aygJaGT);
    }
}

