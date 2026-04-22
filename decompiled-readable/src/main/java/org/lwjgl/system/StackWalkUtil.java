/*
 * Decompiled with CFR.
 */
package org.lwjgl.system;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;

final class StackWalkUtil {
    private StackWalkUtil() {
    }

    static StackTraceElement[] stackWalkArray(Object[] a) {
        return (StackTraceElement[])a;
    }

    static Object stackWalkGetMethod(Class<?> after) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 3;
        while (true) {
            if (i >= stackTrace.length) {
                throw new IllegalStateException();
            }
            if (!stackTrace[i].getClassName().startsWith(after.getName())) {
                return stackTrace[i];
            }
            ++i;
        }
    }

    private static boolean isSameMethod(StackTraceElement a, StackTraceElement b) {
        return StackWalkUtil.isSameMethod(a, b, b.getMethodName());
    }

    private static boolean isSameMethod(StackTraceElement a, StackTraceElement b, String methodName) {
        return a.getMethodName().equals(methodName) && a.getClassName().equals(b.getClassName()) && Objects.equals(a.getFileName(), b.getFileName());
    }

    private static boolean isAutoCloseable(StackTraceElement element, StackTraceElement pushed) {
        if (StackWalkUtil.isSameMethod(element, pushed, "$closeResource")) {
            return true;
        }
        return "closeFinally".equals(element.getMethodName()) && "AutoCloseable.kt".equals(element.getFileName());
    }

    @Nullable
    static Object stackWalkCheckPop(Class<?> after, Object pushedObj) {
        StackTraceElement element;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        int i = 3;
        while (true) {
            if (i >= stackTrace.length) {
                throw new IllegalStateException();
            }
            element = stackTrace[i];
            if (!element.getClassName().startsWith(after.getName())) break;
            ++i;
        }
        StackTraceElement pushed = (StackTraceElement)pushedObj;
        if (StackWalkUtil.isSameMethod(element, pushed)) {
            return null;
        }
        if (StackWalkUtil.isAutoCloseable(element, pushed) && i + 1 < stackTrace.length) {
            element = stackTrace[i + 1];
            if (StackWalkUtil.isSameMethod(pushed, stackTrace[i + 1])) {
                return null;
            }
        }
        return element;
    }

    static Object[] stackWalkGetTrace() {
        int i;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        for (i = 3; i < stackTrace.length && stackTrace[i].getClassName().startsWith("org.lwjgl.system.Memory"); ++i) {
        }
        return Arrays.copyOfRange(stackTrace, i, stackTrace.length);
    }
}

