/*
 * Decompiled with CFR.
 */
package org.earthhack.mixin;

import org.jetbrains.annotations.Nullable;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.fox148w3vCUgBbnUg9dWcULJE7PGcNkI;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public interface EventSubscriber {
    default public <E> E invoke(E event) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(event);
        return event;
    }

    default public <E extends fox148w3vCUgBbnUg9dWcULJE7PGcNkI> void invoke(E event, @Nullable Class<?> generic, CallbackInfo ci) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().EWUzHerEflJOY5iBE7jxQDKjd7Qnak8c(event, generic);
        if (event.isCancelled()) {
            ci.cancel();
        }
    }

    default public <E extends fox148w3vCUgBbnUg9dWcULJE7PGcNkI> E invoke(E event, CallbackInfo ci) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().j52jkT9HXVS0iTGYgwacqU96MRa87vPZ(event);
        if (event.isCancelled()) {
            ci.cancel();
        }
        return event;
    }

    default public <E> E invoke(E event, @Nullable Class<?> generic) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.o7GZpkgkJ4LnXmVXeJIHbpaQdjOXBs24().EWUzHerEflJOY5iBE7jxQDKjd7Qnak8c(event, generic);
        return event;
    }
}

