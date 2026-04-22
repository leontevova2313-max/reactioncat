/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL30;
import org.phobos.secure.group018.RenderModule;

public class SecureClass0240
extends class_276 {
    public final /* synthetic */ int field001;
    public static final /* synthetic */ int field002;
    public static final /* synthetic */ Map<Integer, SecureClass0240> field003;
    public /* synthetic */ int field004;
    public static final /* synthetic */ int field005 = 2;
    public /* synthetic */ int field006;

    static {
        field002 = GL30.glGetInteger((int)36183);
        field003 = new HashMap<Integer, SecureClass0240>();
    }

    public /* synthetic */ SecureClass0240(int field007) {
        super(true);
        if (field007 < 2 || field007 > field002) {
            field007 = field002;
        }
        if ((field007 & field007 - 1) != 0) {
            throw new IllegalArgumentException("The number of samples must be a power of two.");
        }
        this.field001 = field007;
        this.method_1236(1.0f, 1.0f, 1.0f, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void bILARVyaqhdMt0rXeLN672dWjShMBlr3(Runnable uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi) {
        int field008 = RenderModule.qPJDADxqokbFcnDKQ6t7iTTvpFYWRI2L();
        if (field008 == -1) {
            uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi.run();
            return;
        }
        SecureClass0240.ekgZz9QYOWLwxw188wredS24f8jL9hZ8(field008, class_310.method_1551().method_1522(), uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi);
    }

    public static /* bridge */ /* synthetic */ void ekgZz9QYOWLwxw188wredS24f8jL9hZ8(int hvO7dI9TcoNSKj6KMBsm9jq96lS0wS9A, class_276 uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ, Runnable NMxnobKEgPusCZxdbh4a20HMC0xVdteo) {
        RenderSystem.assertOnRenderThreadOrInit();
        SecureClass0240 field009 = SecureClass0240.field003.computeIfAbsent(hvO7dI9TcoNSKj6KMBsm9jq96lS0wS9A, n -> new SecureClass0240(TD1wccbxP6syERMltV3s1Scrb5CuZBwe));
        field009.method_1234(uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1482, uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1481, true);
        GlStateManager._glBindFramebuffer((int)36008, (int)uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1476);
        GlStateManager._glBindFramebuffer((int)36009, (int)field009.field_1476);
        GlStateManager._glBlitFrameBuffer((int)0, (int)0, (int)field009.field_1482, (int)field009.field_1481, (int)0, (int)0, (int)field009.field_1482, (int)field009.field_1481, (int)16384, (int)9729);
        field009.method_1235(true);
        NMxnobKEgPusCZxdbh4a20HMC0xVdteo.run();
        field009.method_1240();
        GlStateManager._glBindFramebuffer((int)36008, (int)field009.field_1476);
        GlStateManager._glBindFramebuffer((int)36009, (int)uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1476);
        GlStateManager._glBlitFrameBuffer((int)0, (int)0, (int)field009.field_1482, (int)field009.field_1481, (int)0, (int)0, (int)field009.field_1482, (int)field009.field_1481, (int)16384, (int)9729);
        field009.method_1230(true);
        uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.method_1235(false);
    }
}

