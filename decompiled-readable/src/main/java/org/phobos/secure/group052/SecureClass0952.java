/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group052;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import engine.linking.NativeMethodHandler;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group048.SecureInterface0119;
import org.phobos.secure.group022.MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0952
extends SecureClass0966
implements SecureInterface0119,
Iterable<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> {
    public static final /* synthetic */ List<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> field001;
    public static final /* synthetic */ Path field002;

    public static /* bridge */ /* synthetic */ void pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(JsonElement MqTgyp59YQNXkDVyhbrZGgFBaDHunUIb) {
        JsonObject field003 = MqTgyp59YQNXkDVyhbrZGgFBaDHunUIb.getAsJsonObject();
        Iterator<E> iterator = field003.keySet().iterator();
        while (iterator.hasNext()) {
            String field004 = (String)iterator.next();
            JsonElement field005 = field003.get(field004);
            if (field005 == null) continue;
            MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl field006 = new MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl(field004);
            try {
                field006.pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(field005);
                field001.add(field006);
            }
            catch (Throwable throwable) {
            }
        }
        return;
    }

    public static /* bridge */ native /* synthetic */ void ktHmOsX7pPogP5pDNHlAdBfSr4BWzcCl(SecureClass0242 var0);

    public static /* bridge */ /* synthetic */ JsonElement A560aqP6y49ieDCCqIy6sn1dAbeymTvZ() {
        JsonObject field007 = new JsonObject();
        Iterator<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> iterator = field001.iterator();
        while (iterator.hasNext()) {
            MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl field008 = iterator.next();
            try {
                JsonElement field009 = field008.A560aqP6y49ieDCCqIy6sn1dAbeymTvZ();
                if (field009 == null) continue;
                field007.add(field008.getName(), field009);
            }
            catch (Throwable throwable) {
            }
        }
        return field007;
    }

    public static /* bridge */ native /* synthetic */ void oYsIyHaWmCwPqddLEiAEVvaNIS7mq6BK(SecureClass0242 var0);

    static {
        NativeMethodHandler.registerNativeCallbacks(59);
        field002 = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
        field001 = new ArrayList<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl>();
    }
}

