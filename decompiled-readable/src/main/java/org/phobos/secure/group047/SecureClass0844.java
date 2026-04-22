/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import engine.linking.NativeMethodHandler;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;

public class SecureClass0844 {
    public static final /* synthetic */ Path field001;

    public /* synthetic */ SecureClass0844() {
        this.__set__nN5oi9ujofobBZWoRPROMio0aCAFXaBo(new ArrayList<E>());
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(49);
        field001 = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
    }

    public native /* synthetic */ List __get__nN5oi9ujofobBZWoRPROMio0aCAFXaBo();

    public native /* synthetic */ void __set__nN5oi9ujofobBZWoRPROMio0aCAFXaBo(List var1);
}

