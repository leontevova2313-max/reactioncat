/*
 * Decompiled with CFR.
 */
package org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_1060;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL30;

public final class TxzfK8JXUwlbK4Iz45eBnYELY6uHhdKt {
    public static /* synthetic */ int cfr_renamed_969;

    public static /* bridge */ /* synthetic */ int ADZqzPGkA1nQy71ZxvqmH5vcVXIBNf8D(class_2960 OBV6dMGpus5fKp8O1YoAiW8M0ys9IkYT) {
        class_1060 exmyRa2f0IBXD05GE9lc90S5k8ihj4Mo = class_310.method_1551().method_1531();
        class_1044 fyMiZQdFaaEtQBjCyqyzKrHAld9e6U0l = exmyRa2f0IBXD05GE9lc90S5k8ihj4Mo.method_4619(OBV6dMGpus5fKp8O1YoAiW8M0ys9IkYT);
        return fyMiZQdFaaEtQBjCyqyzKrHAld9e6U0l.method_4624();
    }

    public static /* bridge */ /* synthetic */ void ZZ6vd7EDbf8Tvryhh1znE82TRd9KRq6H(class_2960 class_29602) {
        cfr_renamed_969 = TxzfK8JXUwlbK4Iz45eBnYELY6uHhdKt.ADZqzPGkA1nQy71ZxvqmH5vcVXIBNf8D(class_29602);
    }

    public static /* bridge */ /* synthetic */ void YvXbxIQ2a8tZd4WwyMLK6SfxK2d8Zo4B() {
        if (cfr_renamed_969 == -1) {
            return;
        }
        GlStateManager._bindTexture((int)cfr_renamed_969);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9729);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
    }

    public static /* bridge */ /* synthetic */ void lxQgTjBpONCRXLsgf22OBbcJ291OstZs(int n) {
        cfr_renamed_969 = n;
    }

    public static /* bridge */ /* synthetic */ void a5L7WmLHrrMn5TsFr8yMPoV4Twx3eCWA(class_1043 dMrbyFr9eFbowRVw9DA3CiRrVeWlZKKt) {
        GlStateManager._bindTexture((int)dMrbyFr9eFbowRVw9DA3CiRrVeWlZKKt.method_4624());
        GL30.glGenerateMipmap((int)3553);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9987);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9729);
    }

    public static /* bridge */ /* synthetic */ void close() {
        if (cfr_renamed_969 == -1) {
            return;
        }
        GlStateManager._bindTexture((int)cfr_renamed_969);
        GlStateManager._texParameter((int)3553, (int)10241, (int)9728);
        GlStateManager._texParameter((int)3553, (int)10240, (int)9728);
        cfr_renamed_969 = -1;
    }

    public /* synthetic */ TxzfK8JXUwlbK4Iz45eBnYELY6uHhdKt() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        cfr_renamed_969 = -1;
    }
}

