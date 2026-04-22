/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group042;

import engine.linking.NativeMethodHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group003.SecureClass0042;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0424;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group020.SecureInterface0052;
import org.phobos.secure.group050.SecureClass0894;
import org.phobos.secure.group050.SecureClass0903;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0742
extends SecureClass0966
implements SecureInterface0038,
SecureInterface0143,
SecureInterface0134 {
    public final /* synthetic */ SecureClass0242 field001;
    public final /* synthetic */ SecureClass0042 field002;
    public static /* synthetic */ SecureClass0742 field003;
    public final /* synthetic */ List<SecureClass0424> field004;
    public final /* synthetic */ SecureInterface0052 field005;

    public static /* bridge */ /* synthetic */ SecureClass0742 zXY0przerZFetvGmkI5lRWGsIvOee3GZ() {
        return field003;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ SecureClass0424 rskqCz5dVTH1fL9ke0aL6NidsRA80DfR(String string) {
        SecureClass0424 field006;
        Iterator<SecureClass0424> iterator = SecureClass0742.field003.field004.iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field006 = iterator.next()).getName().equals(string));
        return field006;
    }

    public /* synthetic */ SecureClass0742(SecureClass0242 Q0EMlKOp6kb8ot4XLmOHemJb96c8NwWR) {
        this.field004 = new ArrayList<SecureClass0424>();
        this.field005 = new SecureClass0894();
        this.field002 = new SecureClass0042();
        this.field001 = Q0EMlKOp6kb8ot4XLmOHemJb96c8NwWR;
        field003 = this;
        this.cfr_renamed_219();
        SecureClass0903.pN2GNQpvy7JFfJ3zm1xNJ4HDNp84fbnz = new SecureClass0903(this);
        Iterator<SecureClass0424> iterator = this.field004.iterator();
        while (iterator.hasNext()) {
            SecureClass0424 field007 = iterator.next();
            try {
                field007.asTX5nZlsS4qmlDrYwmHUiVFh3Wz0ETr();
            }
            catch (Throwable uz0JavqbfWPhdsQYUb1SbQFbBWjZnW5B) {
                uz0JavqbfWPhdsQYUb1SbQFbBWjZnW5B.printStackTrace(System.err);
                continue;
            }
            break;
        }
        return;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(62);
    }
}

