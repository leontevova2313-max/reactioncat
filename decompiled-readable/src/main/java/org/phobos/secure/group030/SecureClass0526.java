/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group030;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.phobos.secure.group025.SecureClass0438;
import org.phobos.secure.group038.SecureClass0658;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group037.RSk6DBiFJEUUi2VFY6FQvjByGtVyRUXO;
import org.phobos.secure.group042.SecureClass0755;

public class SecureClass0526<T>
extends SecureClass0438<Map<T, Boolean>, SecureClass0889<T>> {
    public /* synthetic */ float field001;
    public final /* synthetic */ List<RSk6DBiFJEUUi2VFY6FQvjByGtVyRUXO<T>> field002;

    public /* synthetic */ SecureClass0526(SecureClass0874 mjdzGcz06gFIoUC4379rcQloOIEX9Ccb, SecureClass0755 uATdwGtsRDZ4gqScPkvyPUsz9Dl2qcuA2, float IQvDJbJtBXPvGqpwvqIoCt0oCqgTmqZv, float f, float f2, float NA2IvPECoj1I6QIHj42f4Tp8x6sxFiWb, SecureClass0658 eMC29F9I9Glu4mu20LhTv4CZX0poVyMA, String jWFhNFMPZUjJHq9KpIpMNiCk6CJZxZ2w, SecureClass0889<T> DXiX68l2zPiKNBwI01GGGeWeXFIVk3AW) {
        super(mjdzGcz06gFIoUC4379rcQloOIEX9Ccb, uATdwGtsRDZ4gqScPkvyPUsz9Dl2qcuA2, IQvDJbJtBXPvGqpwvqIoCt0oCqgTmqZv, f, f2, NA2IvPECoj1I6QIHj42f4Tp8x6sxFiWb, eMC29F9I9Glu4mu20LhTv4CZX0poVyMA, jWFhNFMPZUjJHq9KpIpMNiCk6CJZxZ2w, DXiX68l2zPiKNBwI01GGGeWeXFIVk3AW);
        this.field002 = new ArrayList<RSk6DBiFJEUUi2VFY6FQvjByGtVyRUXO<T>>();
        this.field001 = 0.0f;
        Iterator<Map.Entry<T, String>> iterator = ((SecureClass0889)this.cfr_renamed_811()).Vl7oyLZOhqZfcoiUwnOhABGBcFbR98V4().entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<T, String> field003 = iterator.next();
            T field004 = field003.getKey();
            this.field002.add(new RSk6DBiFJEUUi2VFY6FQvjByGtVyRUXO<T>(field003.getValue().replaceAll("_", " "), SecureInterface0050.ObBKCAIXlhfDd9ITFSMeFxrtGkuTAJyz(field004), field004));
        }
        return;
    }
}

