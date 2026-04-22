/*
 * Decompiled with CFR.
 */
package org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.stb.STBImage;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;

public final class clQO4lrkgwEkYIhRWnhdAe0QRNzkHiBf
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    public static /* bridge */ /* synthetic */ ByteBuffer gnmyleo9oe022t3jW8X1X299PuavbKRI(String U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h, IntBuffer xbszKGWrkEJA8nOuvL4vo57H6xf19zsl, IntBuffer yMj8icwC8zAWFXPa5CYxLlI3jWRGgcN5, IntBuffer jECJs4M5sR3NPc2w6N1RstY64EXeZPKU) {
        STBImage.stbi_set_flip_vertically_on_load((boolean)false);
        ByteBuffer VHcuPrR9wzr7hPbbpocyMyD4OsYLydOl = STBImage.stbi_load((CharSequence)U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h, (IntBuffer)xbszKGWrkEJA8nOuvL4vo57H6xf19zsl, (IntBuffer)yMj8icwC8zAWFXPa5CYxLlI3jWRGgcN5, (IntBuffer)jECJs4M5sR3NPc2w6N1RstY64EXeZPKU, (int)4);
        if (VHcuPrR9wzr7hPbbpocyMyD4OsYLydOl == null) {
            throw new RuntimeException("Failed to load %s".formatted(U0LQPkR1hteTnW7Wpq6TSoDRuocFFx0h));
        }
        return VHcuPrR9wzr7hPbbpocyMyD4OsYLydOl;
    }

    public static /* bridge */ /* synthetic */ void T8sEDqlbuTMyksbojDTczQZwY1phkt4R() {
        clQO4lrkgwEkYIhRWnhdAe0QRNzkHiBf.tdtL04cdASt1wPu11c1DKmRz6wY2mczX(skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N.Default);
    }

    public static /* bridge */ /* synthetic */ GLFWImage wQ0HZrLHp5lrYFDeaYvbhVlZsu8dhBRB(ByteBuffer MI022MUf7s5oV175E69xGHjEJMRKFnmY, int CNNe91shmGjA71diI2kVq6gfvb6mrh0d, int n) {
        GLFWImage t3KMsgpSI3SeFOVPaX0mVQMootRQ66Me = GLFWImage.malloc();
        t3KMsgpSI3SeFOVPaX0mVQMootRQ66Me.set(CNNe91shmGjA71diI2kVq6gfvb6mrh0d, n, MI022MUf7s5oV175E69xGHjEJMRKFnmY);
        return t3KMsgpSI3SeFOVPaX0mVQMootRQ66Me;
    }

    public static /* bridge */ /* synthetic */ long zd9lRpqS2hmGgdZEOAJIqEAlpeUFFknr() {
        return P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4490();
    }

    public /* synthetic */ clQO4lrkgwEkYIhRWnhdAe0QRNzkHiBf() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void tdtL04cdASt1wPu11c1DKmRz6wY2mczX(skjDqgKNZ09jDT1XVjODSYPFUUNKwl7N o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0) {
        if (o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.isCustom() && !o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.isCustomLoaded()) {
            o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.load();
        }
        long UjWRsb2z3pgCnQfnylcaySzOQUequvtF = GLFW.glfwCreateStandardCursor((int)o63vYzUvjqtouqhYZfCGoRXmjNDcFJa0.getShape());
        GLFW.glfwSetCursor((long)clQO4lrkgwEkYIhRWnhdAe0QRNzkHiBf.zd9lRpqS2hmGgdZEOAJIqEAlpeUFFknr(), (long)UjWRsb2z3pgCnQfnylcaySzOQUequvtF);
    }
}

