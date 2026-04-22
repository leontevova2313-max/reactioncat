/*
 * Decompiled with CFR.
 */
package org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1041;
import net.minecraft.class_8251;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.JGIK6HwaQYaPnRUXkWt5S4biujq7P00O;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;

public final class uVFYg6uE7lLEgRrySWyhGc1PGUBevWMP
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    public static final /* synthetic */ JGIK6HwaQYaPnRUXkWt5S4biujq7P00O<Double> nnKlIK7mNy7I3J2EhnnXxSoUGJK0Cg0Q;

    public static /* bridge */ /* synthetic */ JGIK6HwaQYaPnRUXkWt5S4biujq7P00O<Double> cfr_renamed_136() {
        return nnKlIK7mNy7I3J2EhnnXxSoUGJK0Cg0Q;
    }

    public /* synthetic */ uVFYg6uE7lLEgRrySWyhGc1PGUBevWMP() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        nnKlIK7mNy7I3J2EhnnXxSoUGJK0Cg0Q = JGIK6HwaQYaPnRUXkWt5S4biujq7P00O.FZUUMWJZbQ4dNumbohldaZhbq62AmAO1((DMUctbkQgNsCxVLIt6TqIIxadBCIUeUx, glgI35yLZYZajixGgpjvaVMlNlXHIEWm) -> {
            class_1041 class_10412 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683();
            Matrix4f HVA9b0OI5L6tOAFuY15NBmKxMlgmWNIp = new Matrix4f().setOrtho(0.0f, (float)((double)class_10412.method_4489() / glgI35yLZYZajixGgpjvaVMlNlXHIEWm), (float)((double)class_10412.method_4506() / glgI35yLZYZajixGgpjvaVMlNlXHIEWm), 0.0f, 1000.0f, 21000.0f);
            RenderSystem.setProjectionMatrix((Matrix4f)HVA9b0OI5L6tOAFuY15NBmKxMlgmWNIp, (class_8251)class_8251.field_43361);
            Matrix4fStack aVJBdxOpK3P05yWJcCXDLSh45DVRprYX = RenderSystem.getModelViewStack();
            aVJBdxOpK3P05yWJcCXDLSh45DVRprYX.popMatrix();
            aVJBdxOpK3P05yWJcCXDLSh45DVRprYX.pushMatrix();
            aVJBdxOpK3P05yWJcCXDLSh45DVRprYX.translation(0.0f, 0.0f, -11000.0f);
            RenderSystem.applyModelViewMatrix();
        }, (eQlFVqg2euskysOGG66BRnp1LLEEVBtA, WPdWDe37uzfclrQgW4N8r1RXZqQ1zeef) -> RenderSystem.applyModelViewMatrix());
    }
}

