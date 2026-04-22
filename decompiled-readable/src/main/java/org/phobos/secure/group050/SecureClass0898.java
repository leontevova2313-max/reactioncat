/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group050;

import com.google.common.base.Preconditions;
import java.awt.Color;
import java.util.UUID;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group060.ColorsModule;
import org.phobos.secure.group042.SecureClass0754;

public final class SecureClass0898 {
    public static /* bridge */ /* synthetic */ Color DVUWQPWf1Gx7Xf3hGU93E9kVW22ISdxz(float z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs, float field001, float field002, float pkaoPOlAQSQOf9E2XCnjqR20VE48oiox) {
        if (field001 < 0.0f || field001 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Saturation");
        }
        if (field002 < 0.0f || field002 > 100.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Lightness");
        }
        if (pkaoPOlAQSQOf9E2XCnjqR20VE48oiox < 0.0f || pkaoPOlAQSQOf9E2XCnjqR20VE48oiox > 1.0f) {
            throw new IllegalArgumentException("Color parameter outside of expected range - Alpha");
        }
        z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs %= 360.0f;
        float f = (double)field002 < 0.5 ? field002 * (1.0f + field001) : (field002 /= 100.0f) + (field001 /= 100.0f) - field001 * field002;
        field001 = 2.0f * field002 - f;
        field002 = Math.max(0.0f, SecureClass0898.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(field001, f, (z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs /= 360.0f) + 0.33333334f));
        float field003 = Math.max(0.0f, SecureClass0898.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(field001, f, z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs));
        field001 = Math.max(0.0f, SecureClass0898.a8XE3Y61tKkklDvggahGzckXaLFCFfL6(field001, f, z2CLQuV3UnUEKpgRAc6QF6Scpvs9bKOs - 0.33333334f));
        field002 = Math.min(field002, 1.0f);
        field003 = Math.min(field003, 1.0f);
        field001 = Math.min(field001, 1.0f);
        return new Color(field002, field003, field001, pkaoPOlAQSQOf9E2XCnjqR20VE48oiox);
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

    public static /* bridge */ /* synthetic */ int cfr_renamed_928(float field004, Color b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN) {
        field004 = Math.abs(field004);
        double field005 = (double)System.currentTimeMillis() % 1750.0 / 850.0;
        float[] field006 = new float[3];
        Color.RGBtoHSB(b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getRed(), b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getGreen(), b6OFqf08T63iwrpt3bnBBl1A8ggI7sJN.getBlue(), field006);
        float f = (float)((double)field006[2] * Math.abs(((double)field004 + field005) % 1.0 - (double)0.55f) + (double)0.45f);
        return Color.HSBtoRGB(field006[0], field006[1], f);
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

    public /* synthetic */ SecureClass0898() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ Color w2BoPuJNqjrd5Bad2dNshu2VsjjrBvsV(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, UUID jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo, Color color, Color field007, Color field008) {
        if (ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.CaWImRaTpPweoHJZvWGGaMQ9UE4MGsc4().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo)) {
            return field007;
        }
        if (ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.Wlu5mquyi1ElStMl4NA0ACkdCEexvpZJ().QE1lSY5VtJsYkuO5ab17y521NiVmPU0e(jLYrCouSkqu4e7qedYCm4lxt1eDrmwAo)) {
            return field008;
        }
        return color;
    }

    public static /* bridge */ /* synthetic */ float ZcJWk3Ga8iMV0dFt0jmQX6gNvOSVgsTk(double JdEKxUdjL8Lm4MP16Q0monleZo7sN3ZL) {
        return (float)((double)ColorsModule.dwCniG5LTXw0xmgg4Nqk8c0nMhUfW5sW - JdEKxUdjL8Lm4MP16Q0monleZo7sN3ZL * (double)0.001f);
    }

    public static /* bridge */ /* synthetic */ Color cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1, float lFmAQP3btIQ8bDKDUTYIOrD7LPqu0Q6K) {
        return new Color((float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getRed() / 255.0f, (float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getGreen() / 255.0f, (float)d0HdJ573MkF9eJ1Ei0sNHYrQ0WzRpDG1.getBlue() / 255.0f, class_3532.method_15363((float)lFmAQP3btIQ8bDKDUTYIOrD7LPqu0Q6K, (float)0.0f, (float)1.0f));
    }

    public static /* bridge */ /* synthetic */ Color cfr_renamed_790(Color o3UiQ2lFqTxnaVn9FrA94xbe6WYnRtZa, Color lOxbzOWCML47xvt9jJ7xLMbcvCmXem2w) {
        return SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(lOxbzOWCML47xvt9jJ7xLMbcvCmXem2w, (float)o3UiQ2lFqTxnaVn9FrA94xbe6WYnRtZa.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ Color xymiD8VHyYX7ZCoyzzg4afP5hY6inSmJ(int DS6IU9XQacqcrb1leZY5nu0XdIcsokWK) {
        int field009 = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 24 & 0xFF;
        int field010 = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 16 & 0xFF;
        int field011 = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK >> 8 & 0xFF;
        int field012 = DS6IU9XQacqcrb1leZY5nu0XdIcsokWK & 0xFF;
        return new Color(field010, field011, field012, field009);
    }

    public static /* bridge */ /* synthetic */ Color PixjPDDantYECOvNCr76PWCE8WxLvxwX(Color ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp, Color color, float NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX) {
        float field013 = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getRed() / 255.0f;
        float field014 = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getGreen() / 255.0f;
        float field015 = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getBlue() / 255.0f;
        float field016 = (float)ZPbBw2HAfhXNZrTjAwP5llfROyPIPplp.getAlpha() / 255.0f;
        float field017 = (float)color.getRed() / 255.0f;
        float field018 = (float)color.getGreen() / 255.0f;
        float field019 = (float)color.getBlue() / 255.0f;
        float field020 = (float)color.getAlpha() / 255.0f;
        float f = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)field013, (float)field017);
        float field021 = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)field014, (float)field018);
        float field022 = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)field015, (float)field019);
        float field023 = class_3532.method_16439((float)NYIdrmnyXzKf3bltTMHSRpNEaqLT7amX, (float)field016, (float)field020);
        return new Color(SecureClass0754.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(f, 0.0f, 1.0f), SecureClass0754.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(field021, 0.0f, 1.0f), SecureClass0754.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(field022, 0.0f, 1.0f), SecureClass0754.CpuQwEbQJIjxd3M6uEzYXlNlfRE7uaLy(field023, 0.0f, 1.0f));
    }

    public static /* bridge */ /* synthetic */ Vector3f BnDLZSIXV1EJEwwv2mY59z3dlkFC6tOv(Color color) {
        return new Vector3f((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ int[] uVf8sjVFl5nBx29N1S6gGeKvsbO2IBbr(int nUz2kWt475prWjheF6UMDLdROemYbmec) {
        int n = nUz2kWt475prWjheF6UMDLdROemYbmec >> 24 & 0xFF;
        int field024 = nUz2kWt475prWjheF6UMDLdROemYbmec >> 16 & 0xFF;
        int field025 = nUz2kWt475prWjheF6UMDLdROemYbmec >> 8 & 0xFF;
        int field026 = nUz2kWt475prWjheF6UMDLdROemYbmec & 0xFF;
        return new int[]{field024, field025, field026, n};
    }

    public static /* bridge */ /* synthetic */ Color GFFSk7B8pqei8XZQisyrPBw9jPDfBrNq(Color RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru) {
        return SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(new Color((RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getRGB() & 0xFCFCFC) >> 2 | RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getRGB() & 0xF3F3F3F3), (float)RfUAg2nPhvFJ1R3FJPAgMnpBusOTEmru.getAlpha() / 255.0f);
    }

    public static /* bridge */ /* synthetic */ int tjB7HZY7wSiTSl8ox0RZNYq6Ifim8J0r(float field027, Color D8F17XOru9tYITm2g6TXQmCdK121pVbZ, float ZcPoHTDPmM5u4T1F6kTYqBXxKg9awZ27, float jwxZecaalUtKZqbvMRHfZF8r8QGMI375, float gaI8pHKb0Vyner0MZxFA0BGOYzZTrU7D) {
        field027 = Math.abs(field027);
        double field028 = 1.0 / (double)(1.0f - ZcPoHTDPmM5u4T1F6kTYqBXxKg9awZ27);
        double field029 = (double)System.currentTimeMillis() % (1750.0 * field028) / (850.0 * field028);
        float[] field030 = new float[3];
        Color.RGBtoHSB(D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getRed(), D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getGreen(), D8F17XOru9tYITm2g6TXQmCdK121pVbZ.getBlue(), field030);
        float f = (float)((double)gaI8pHKb0Vyner0MZxFA0BGOYzZTrU7D * Math.abs(((double)field027 + field029) % 1.0 - (double)0.55f) + (double)0.45f);
        return Color.HSBtoRGB(field030[0], jwxZecaalUtKZqbvMRHfZF8r8QGMI375, f);
    }

    public static /* bridge */ /* synthetic */ Color cfr_renamed_929(Color YRE12XS0rsYO1od2TFNRufju1X9aRGA1, Color n8nu34XuptEoqX0r1qao6dtmpN5RqVLn, float field031) {
        if (field031 > 1.0f) {
            field031 = 1.0f;
        } else if (field031 < 0.0f) {
            field031 = 0.0f;
        }
        float f = 1.0f - field031;
        int field032 = YRE12XS0rsYO1od2TFNRufju1X9aRGA1.getRGB();
        int field033 = n8nu34XuptEoqX0r1qao6dtmpN5RqVLn.getRGB();
        int n = field032 >> 24 & 0xFF;
        int field034 = (field032 & 0xFF0000) >> 16;
        int field035 = (field032 & 0xFF00) >> 8;
        int field036 = field032 & 0xFF;
        int field037 = field033 >> 24 & 0xFF;
        int field038 = (field033 & 0xFF0000) >> 16;
        int field039 = (field033 & 0xFF00) >> 8;
        int n2 = field033 & 0xFF;
        int field040 = (int)((float)n * f + (float)field037 * field031);
        int field041 = (int)((float)field034 * f + (float)field038 * field031);
        int field042 = (int)((float)field035 * f + (float)field039 * field031);
        int field043 = (int)((float)field036 * f + (float)n2 * field031);
        return new Color(field040 << 24 | field041 << 16 | field042 << 8 | field043);
    }

    public static /* bridge */ /* synthetic */ Color bZVG03hI4wx3EJnLK4LQOeFv2olU0sfS(int s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo, int n, float sH8da4nA0IRoGMbSrDuVlWUyV6GKAylz, float MMmNMKEdvEPHi8pCH73mMjolHgVZ9EiR) {
        float field044 = (System.currentTimeMillis() + (long)n) % (long)s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo;
        return Color.getHSBColor(field044 /= (float)s5nrRcH6vC7eq6OrVsUJkqNEN2nfCvZo, sH8da4nA0IRoGMbSrDuVlWUyV6GKAylz, MMmNMKEdvEPHi8pCH73mMjolHgVZ9EiR);
    }

    public static /* bridge */ /* synthetic */ Color N7XFOz711PiWjK2NAUruQqxWKPRpJzWb(Color ygmpBBTlPYDYK3objoZlA5do72T5YDuN, float Ch1Q5lQCWYoSpczoYXVWzUGLa7huRoVu) {
        float[] field045 = Color.RGBtoHSB(ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getRed(), ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getGreen(), ygmpBBTlPYDYK3objoZlA5do72T5YDuN.getBlue(), null);
        return Color.getHSBColor(field045[0], Ch1Q5lQCWYoSpczoYXVWzUGLa7huRoVu, field045[2]);
    }

    public static /* bridge */ /* synthetic */ class_243 iDrOrCYK1PV9W9Ma7mfx3Hxb4txPAYMa(Color e8706iAU8tyqGhcrfCKNe20tTe01LfzQ) {
        return new class_243((double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getRed() / 255.0f), (double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getGreen() / 255.0f), (double)((float)e8706iAU8tyqGhcrfCKNe20tTe01LfzQ.getBlue() / 255.0f));
    }

    public static /* bridge */ /* synthetic */ float[] gnqLEsxEGMPGfzJPlR7HLZ0btMc3yksh(int[] nArray) {
        Preconditions.checkArgument((nArray.length == 4 ? 1 : 0) != 0, (Object)("Expected int[] of size 4, got " + nArray.length));
        int field046 = 0;
        while (field046 < nArray.length) {
            Preconditions.checkArgument((boolean)SecureClass0898.IVlDhzn5P1F2Oll26ULd1ZEDHE92UjmL(nArray[field046]), (Object)("Expected in[" + field046 + "] to be 0-255, got " + nArray[field046]));
            ++field046;
        }
        return new float[]{(float)nArray[0] / 255.0f, (float)nArray[1] / 255.0f, (float)nArray[2] / 255.0f, (float)nArray[3] / 255.0f};
    }

    public static /* bridge */ /* synthetic */ float a8XE3Y61tKkklDvggahGzckXaLFCFfL6(float field047, float f, float f2) {
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        if (6.0f * f2 < 1.0f) {
            return field047 + (f - field047) * 6.0f * f2;
        }
        if (2.0f * f2 < 1.0f) {
            return f;
        }
        if (3.0f * f2 < 2.0f) {
            return field047 + (f - field047) * 6.0f * (0.6666667f - f2);
        }
        return field047;
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
        int field048 = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi >> 16 & 0xFF;
        int field049 = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi >> 8 & 0xFF;
        int field050 = IFl9nK9Dqt8gEWfiC7R8Tu17bNXQ91bi & 0xFF;
        return new int[]{field048, field049, field050};
    }

    public static /* bridge */ /* synthetic */ Color IAsRsO3QmlIeFSwovm18ygQaWRbygFhz(Color uTKfoJuMKMWbzq69bd1l1JeYHpCD5Joj, Color Zc9uLB6SFlgQ5Pkz6nHtj0b7IvqZtK0i, float vO1k3UlL5LqRBgmhozZPoZsDmlBDgum9, float jgByW0EPOpcjFUMRPdWTQu5X8aygJaGT) {
        return SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(SecureClass0898.cfr_renamed_929(uTKfoJuMKMWbzq69bd1l1JeYHpCD5Joj, Zc9uLB6SFlgQ5Pkz6nHtj0b7IvqZtK0i, vO1k3UlL5LqRBgmhozZPoZsDmlBDgum9), jgByW0EPOpcjFUMRPdWTQu5X8aygJaGT);
    }
}

