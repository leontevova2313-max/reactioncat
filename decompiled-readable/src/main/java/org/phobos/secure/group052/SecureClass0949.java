/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group052;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL30;

public final class SecureClass0949 {
    public static /* synthetic */ int field001;

    public static /* bridge */ /* synthetic */ int ADZqzPGkA1nQy71ZxvqmH5vcVXIBNf8D(class_2960 OBV6dMGpus5fKp8O1YoAiW8M0ys9IkYT) {
        class_1060 field002 = class_310.method_1551().method_1531();
        class_1044 field003 = field002.method_4619(OBV6dMGpus5fKp8O1YoAiW8M0ys9IkYT);
        return field003.method_4624();
    }

    public static /* bridge */ /* synthetic */ void ZZ6vd7EDbf8Tvryhh1znE82TRd9KRq6H(class_2960 class_29602) {
        field001 = SecureClass0949.ADZqzPGkA1nQy71ZxvqmH5vcVXIBNf8D(class_29602);
    }

    public static /* bridge */ /* synthetic */ void YvXbxIQ2a8tZd4WwyMLK6SfxK2d8Zo4B() {
        if (field001 == -1) {
            return;
        }
        GlStateManager._bindTexture((int)field001);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
    }

    public static /* bridge */ /* synthetic */ void lxQgTjBpONCRXLsgf22OBbcJ291OstZs(int n) {
        field001 = n;
    }

    public static /* bridge */ /* synthetic */ void a5L7WmLHrrMn5TsFr8yMPoV4Twx3eCWA(class_1043 dMrbyFr9eFbowRVw9DA3CiRrVeWlZKKt) {
        GlStateManager._bindTexture((int)dMrbyFr9eFbowRVw9DA3CiRrVeWlZKKt.method_4624());
        GL30.glGenerateMipmap((int)3553);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9987);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
    }

    public static /* bridge */ /* synthetic */ void close() {
        if (field001 == -1) {
            return;
        }
        GlStateManager._bindTexture((int)field001);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9728);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9728);
        field001 = -1;
    }

    public /* synthetic */ SecureClass0949() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        field001 = -1;
    }
}

