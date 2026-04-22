/*
 * Decompiled with CFR.
 */
package org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.opengl.GL30;
import org.phobos.secure.BG6SCJ9dGHnHqtvjrWwJni1M9WZsNaLM.arYwQPBy5k2b3w7Raa54qs5UDA8xHfxr;

public class DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM
extends class_276 {
    public final /* synthetic */ int LJM88J6hdGsUTQqBla6kYcJ84uDhCUvo;
    public static final /* synthetic */ int BDSkfcenW9N9Wm48zS1zJrqFJ0OltlEI;
    public static final /* synthetic */ Map<Integer, DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM> cfr_renamed_303;
    public /* synthetic */ int CSmvjhoWomHhNHXNAlW3bPvItBpcvmB7;
    public static final /* synthetic */ int W4nRP8K9Xmu3soFhaeNvdu0dUjjWPB14 = 2;
    public /* synthetic */ int pYmaP2s26uUX5V6CBsZS5JP4qc6z3Occ;

    static {
        BDSkfcenW9N9Wm48zS1zJrqFJ0OltlEI = GL30.glGetInteger((int)36183);
        cfr_renamed_303 = new HashMap<Integer, DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM>();
    }

    public /* synthetic */ DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM(int Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH) {
        super(true);
        if (Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH < 2 || Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH > BDSkfcenW9N9Wm48zS1zJrqFJ0OltlEI) {
            Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH = BDSkfcenW9N9Wm48zS1zJrqFJ0OltlEI;
        }
        if ((Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH & Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH - 1) != 0) {
            throw new IllegalArgumentException("The number of samples must be a power of two.");
        }
        this.LJM88J6hdGsUTQqBla6kYcJ84uDhCUvo = Svzgy9GjrJiMPnlnmTnUcb3KZ6Tje9zH;
        this.method_1236(1.0f, 1.0f, 1.0f, 0.0f);
    }

    public static /* bridge */ /* synthetic */ void bILARVyaqhdMt0rXeLN672dWjShMBlr3(Runnable uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi) {
        int nri8QG8RohEm48gzN118PpW7rV6n3UVo = arYwQPBy5k2b3w7Raa54qs5UDA8xHfxr.qPJDADxqokbFcnDKQ6t7iTTvpFYWRI2L();
        if (nri8QG8RohEm48gzN118PpW7rV6n3UVo == -1) {
            uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi.run();
            return;
        }
        DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM.ekgZz9QYOWLwxw188wredS24f8jL9hZ8(nri8QG8RohEm48gzN118PpW7rV6n3UVo, class_310.method_1551().method_1522(), uacG3vAJ4ZHy4Vr4Xe4YdGVOwkzVyeJi);
    }

    public static /* bridge */ /* synthetic */ void ekgZz9QYOWLwxw188wredS24f8jL9hZ8(int hvO7dI9TcoNSKj6KMBsm9jq96lS0wS9A, class_276 uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ, Runnable NMxnobKEgPusCZxdbh4a20HMC0xVdteo) {
        RenderSystem.assertOnRenderThreadOrInit();
        DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm = DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM.cfr_renamed_303.computeIfAbsent(hvO7dI9TcoNSKj6KMBsm9jq96lS0wS9A, n -> new DTXiX2joOYvVoMs3bXyAvlTJ89f7sCOM(TD1wccbxP6syERMltV3s1Scrb5CuZBwe));
        uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.method_1234(uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1482, uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1481, true);
        GlStateManager._glBindFramebuffer((int)36008, (int)uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1476);
        GlStateManager._glBindFramebuffer((int)36009, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1476);
        GlStateManager._glBlitFrameBuffer((int)0, (int)0, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1482, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1481, (int)0, (int)0, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1482, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1481, (int)16384, (int)9729);
        uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.method_1235(true);
        NMxnobKEgPusCZxdbh4a20HMC0xVdteo.run();
        uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.method_1240();
        GlStateManager._glBindFramebuffer((int)36008, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1476);
        GlStateManager._glBindFramebuffer((int)36009, (int)uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.field_1476);
        GlStateManager._glBlitFrameBuffer((int)0, (int)0, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1482, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1481, (int)0, (int)0, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1482, (int)uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.field_1481, (int)16384, (int)9729);
        uaQ1GpLVcAr2mYKgUkdtRUxCExCT1Gpm.method_1230(true);
        uNMoQ7qJC1h7f3z19V5xjMCCsQg6LunJ.method_1235(false);
    }
}

