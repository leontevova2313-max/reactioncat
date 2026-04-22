/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group045;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_310;

public class SecureClass0792 {
    public static /* synthetic */ Runnable field001;
    public static /* synthetic */ Runnable field002;
    public static /* synthetic */ Runnable field003;

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_909(Runnable runnable) {
        runnable.run();
        return true;
    }

    static {
        field001 = () -> {};
        field002 = () -> RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        field003 = () -> RenderSystem.setShaderGlintAlpha((double)((Double)class_310.method_1551().field_1690.method_48581().method_41753()));
    }
}

