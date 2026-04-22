/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1041;
import net.minecraft.class_8251;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.phobos.secure.group038.SecureClass0662;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0081
implements SecureInterface0134 {
    public static final /* synthetic */ SecureClass0662<Double> field001;

    public static /* bridge */ /* synthetic */ SecureClass0662<Double> cfr_renamed_136() {
        return field001;
    }

    public /* synthetic */ SecureClass0081() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        field001 = SecureClass0662.FZUUMWJZbQ4dNumbohldaZhbq62AmAO1((DMUctbkQgNsCxVLIt6TqIIxadBCIUeUx, glgI35yLZYZajixGgpjvaVMlNlXHIEWm) -> {
            class_1041 class_10412 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683();
            Matrix4f field002 = new Matrix4f().setOrtho(0.0f, (float)((double)class_10412.method_4489() / glgI35yLZYZajixGgpjvaVMlNlXHIEWm), (float)((double)class_10412.method_4506() / glgI35yLZYZajixGgpjvaVMlNlXHIEWm), 0.0f, 1000.0f, 21000.0f);
            RenderSystem.setProjectionMatrix((Matrix4f)field002, (class_8251)class_8251.field_43361);
            Matrix4fStack field003 = RenderSystem.getModelViewStack();
            field003.popMatrix();
            field003.pushMatrix();
            field003.translation(0.0f, 0.0f, -11000.0f);
            RenderSystem.applyModelViewMatrix();
        }, (eQlFVqg2euskysOGG66BRnp1LLEEVBtA, WPdWDe37uzfclrQgW4N8r1RXZqQ1zeef) -> RenderSystem.applyModelViewMatrix());
    }
}

