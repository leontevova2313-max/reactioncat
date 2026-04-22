/*
 * Decompiled with CFR.
 */
package org.earthhack.mixin;

import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group060.SecureClass1087;
import org.phobos.secure.group022.SecureClass0361;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public interface EventSubscriber {
    default public <E> E invoke(E event) {
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(event);
        return event;
    }

    default public <E extends SecureClass1087> void invoke(E event, @Nullable Class<?> generic, CallbackInfo ci) {
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().EWUzHerEflJOY5iBE7jxQDKjd7Qnak8c(event, generic);
        if (event.isCancelled()) {
            ci.cancel();
        }
    }

    default public <E extends SecureClass1087> E invoke(E event, CallbackInfo ci) {
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(event);
        if (event.isCancelled()) {
            ci.cancel();
        }
        return event;
    }

    default public <E> E invoke(E event, @Nullable Class<?> generic) {
        SecureClass0361.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().EWUzHerEflJOY5iBE7jxQDKjd7Qnak8c(event, generic);
        return event;
    }
}

