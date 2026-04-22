/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group055;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.stb.STBImage;
import org.phobos.secure.group007.skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0997
implements SecureInterface0134 {
    public static /* bridge */ /* synthetic */ ByteBuffer gnmyleo9oe022t3jW8X1X299PuavbKRI(String U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h, IntBuffer xbszKGWrkEJA8nOuvL4vo57H6xf19zsl, IntBuffer yMj8icwC8zAWFXPa5CYxLlI3jWRGgcN5, IntBuffer jECJs4M5sR3NPc2w6N1RstY64EXeZPKU) {
        STBImage.stbi_set_flip_vertically_on_load((boolean)false);
        ByteBuffer field001 = STBImage.stbi_load((CharSequence)U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h, (IntBuffer)xbszKGWrkEJA8nOuvL4vo57H6xf19zsl, (IntBuffer)yMj8icwC8zAWFXPa5CYxLlI3jWRGgcN5, (IntBuffer)jECJs4M5sR3NPc2w6N1RstY64EXeZPKU, (int)4);
        if (field001 == null) {
            throw new RuntimeException("Failed to load %s".formatted(U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h));
        }
        return field001;
    }

    public static /* bridge */ /* synthetic */ void T8sEDqlbuTMyksbojDTczQZwY1phkt4R() {
        SecureClass0997.tdtL04cdASt1wPu11c1DKmRz6wY2mczX(skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N.Default);
    }

    public static /* bridge */ /* synthetic */ GLFWImage wQ0HZrLHp5lrYFDeaYvbhVlZsu8dhBRB(ByteBuffer MI022MUf7s5oV175E69xGHjEJMRKFnmY, int CNNe91shmGjA71diI2kVq6gfvb6mrh0d, int n) {
        GLFWImage field002 = GLFWImage.malloc();
        field002.set(CNNe91shmGjA71diI2kVq6gfvb6mrh0d, n, MI022MUf7s5oV175E69xGHjEJMRKFnmY);
        return field002;
    }

    public static /* bridge */ /* synthetic */ long zd9lRpqS2hmGgdZEOAJIqEAlpeUFFknr() {
        return P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4490();
    }

    public /* synthetic */ SecureClass0997() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void tdtL04cdASt1wPu11c1DKmRz6wY2mczX(skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0) {
        if (o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.isCustom() && !o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.isCustomLoaded()) {
            o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.load();
        }
        long field003 = GLFW.glfwCreateStandardCursor((int)o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.getShape());
        GLFW.glfwSetCursor((long)SecureClass0997.zd9lRpqS2hmGgdZEOAJIqEAlpeUFFknr(), (long)field003);
    }
}

