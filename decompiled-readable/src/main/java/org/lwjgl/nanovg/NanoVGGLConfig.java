/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.lang.reflect.Method;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.FunctionProvider;
import org.lwjgl.system.MemoryUtil;

final class NanoVGGLConfig {
    private NanoVGGLConfig() {
    }

    static void configGL(long pointersAddress) {
        NanoVGGLConfig.config(pointersAddress, NanoVGGLConfig.getFunctionProvider("org.lwjgl.opengl.GL"));
    }

    static void configGLES(long pointersAddress) {
        NanoVGGLConfig.config(pointersAddress, NanoVGGLConfig.getFunctionProvider("org.lwjgl.opengles.GLES"));
    }

    private static FunctionProvider getFunctionProvider(String className) {
        try {
            Class<?> c = Class.forName(className);
            Method getCapabilities = c.getMethod("getCapabilities", new Class[0]);
            getCapabilities.invoke(null, new Object[0]);
            Method getFunctionProvider = c.getMethod("getFunctionProvider", new Class[0]);
            return (FunctionProvider)getFunctionProvider.invoke(null, new Object[0]);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void config(long pointersAddress, FunctionProvider fp) {
        String[] functions = new String[]{"glActiveTexture", "glAttachShader", "glBindAttribLocation", "glBindBuffer", "glBindBufferRange", "glBindFramebuffer", "glBindRenderbuffer", "glBindTexture", "glBindVertexArray", "glBlendFunc", "glBlendFuncSeparate", "glBufferData", "glCheckFramebufferStatus", "glColorMask", "glCompileShader", "glCreateProgram", "glCreateShader", "glCullFace", "glDeleteBuffers", "glDeleteFramebuffers", "glDeleteProgram", "glDeleteRenderbuffers", "glDeleteShader", "glDeleteTextures", "glDeleteVertexArrays", "glDetachShader", "glDisable", "glDisableVertexAttribArray", "glDrawArrays", "glEnable", "glEnableVertexAttribArray", "glFinish", "glFlush", "glFramebufferRenderbuffer", "glFramebufferTexture2D", "glFrontFace", "glGenBuffers", "glGenFramebuffers", "glGenRenderbuffers", "glGenTextures", "glGenVertexArrays", "glGenerateMipmap", "glGetError", "glGetIntegerv", "glGetProgramiv", "glGetProgramInfoLog", "glGetShaderiv", "glGetShaderInfoLog", "glGetUniformBlockIndex", "glGetUniformLocation", "glLinkProgram", "glPixelStorei", "glRenderbufferStorage", "glShaderSource", "glStencilFunc", "glStencilMask", "glStencilOp", "glStencilOpSeparate", "glTexImage2D", "glTexParameteri", "glTexSubImage2D", "glUniform1i", "glUniform2fv", "glUniform4fv", "glUniformBlockBinding", "glUseProgram", "glVertexAttribPointer"};
        PointerBuffer pointers = MemoryUtil.memPointerBuffer(pointersAddress, functions.length);
        int i = 0;
        while (i < functions.length) {
            pointers.put(i, fp.getFunctionAddress(functions[i]));
            ++i;
        }
        return;
    }
}

