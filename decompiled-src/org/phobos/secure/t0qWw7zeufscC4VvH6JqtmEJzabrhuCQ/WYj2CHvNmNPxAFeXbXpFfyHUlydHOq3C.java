/*
 * Decompiled with CFR.
 */
package org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import engine.linking.NativeMethodHandler;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.loader.api.FabricLoader;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ._3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf;

public class WYj2CHvNmNPxAFeXbXpFfyHUlydHOq3C
extends zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf
implements _3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX,
Iterable<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> {
    public static final /* synthetic */ List<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> SnyrohdSr2TJ6PeRM6epEvOMdicup6Dg;
    public static final /* synthetic */ Path PnCJHxxjEPAgfgRCpp1NFKCcyBNlX79A;

    public static /* bridge */ /* synthetic */ void pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(JsonElement MqTgyp59YQNXkDVyhbrZGgFBaDHunUIb) {
        JsonObject BqhLcMjLWuws6WoOCFIBhN88tW1P2j6U = MqTgyp59YQNXkDVyhbrZGgFBaDHunUIb.getAsJsonObject();
        Iterator<E> iterator = BqhLcMjLWuws6WoOCFIBhN88tW1P2j6U.keySet().iterator();
        while (iterator.hasNext()) {
            String AHygxCXk9tisg9zhRyeuLE6tJ0yTa8ZQ = (String)iterator.next();
            JsonElement DkyRKREjqaqqVWIXL99aTDi3aiBte2FG = BqhLcMjLWuws6WoOCFIBhN88tW1P2j6U.get(AHygxCXk9tisg9zhRyeuLE6tJ0yTa8ZQ);
            if (DkyRKREjqaqqVWIXL99aTDi3aiBte2FG == null) continue;
            MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl mxtzgLARoog2LOyOq0nfOmEN7N5IqzPl = new MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl(AHygxCXk9tisg9zhRyeuLE6tJ0yTa8ZQ);
            try {
                mxtzgLARoog2LOyOq0nfOmEN7N5IqzPl.pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(DkyRKREjqaqqVWIXL99aTDi3aiBte2FG);
                SnyrohdSr2TJ6PeRM6epEvOMdicup6Dg.add(mxtzgLARoog2LOyOq0nfOmEN7N5IqzPl);
            }
            catch (Throwable throwable) {
            }
        }
        return;
    }

    public static /* bridge */ native /* synthetic */ void ktHmOsX7pPogP5pDNHlAdBfSr4BWzcCl(EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb var0);

    public static /* bridge */ /* synthetic */ JsonElement A560aqP6y49ieDCCqIy6sn1dAbeymTvZ() {
        JsonObject KjHjJaJqKDcxXCgp1PC24XSvDSHGWsOj = new JsonObject();
        Iterator<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl> iterator = SnyrohdSr2TJ6PeRM6epEvOMdicup6Dg.iterator();
        while (iterator.hasNext()) {
            MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl wDbUNq1S9vLoSzfVg72rROf6iEKdR56c = iterator.next();
            try {
                JsonElement XkS7HTZX8fhJUtSjku3SWiKvKAYSyIlI = wDbUNq1S9vLoSzfVg72rROf6iEKdR56c.A560aqP6y49ieDCCqIy6sn1dAbeymTvZ();
                if (XkS7HTZX8fhJUtSjku3SWiKvKAYSyIlI == null) continue;
                KjHjJaJqKDcxXCgp1PC24XSvDSHGWsOj.add(wDbUNq1S9vLoSzfVg72rROf6iEKdR56c.getName(), XkS7HTZX8fhJUtSjku3SWiKvKAYSyIlI);
            }
            catch (Throwable throwable) {
            }
        }
        return KjHjJaJqKDcxXCgp1PC24XSvDSHGWsOj;
    }

    public static /* bridge */ native /* synthetic */ void oYsIyHaWmCwPqddLEiAEVvaNIS7mq6BK(EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb var0);

    static {
        NativeMethodHandler.registerNativeCallbacks(59);
        PnCJHxxjEPAgfgRCpp1NFKCcyBNlX79A = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
        SnyrohdSr2TJ6PeRM6epEvOMdicup6Dg = new ArrayList<MxtzgLARoog2LOyOq0nfOmEN7N5IqzPl>();
    }
}

