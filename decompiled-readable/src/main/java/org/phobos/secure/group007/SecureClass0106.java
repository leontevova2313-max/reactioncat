/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group010.SecureInterface0020;
import org.phobos.secure.group049.SecureInterface0124;
import org.phobos.secure.group040.SecureInterface0100;
import org.phobos.secure.group042.SecureInterface0107;

public abstract class SecureClass0106<N extends SecureInterface0100<N>>
implements SecureInterface0124<N>,
SecureInterface0107<List<N>> {
    public final /* synthetic */ Map<N, @Nullable N> Fitxr41qfrZnkuOIZjjsKB3pFniq9AcV;
    public final /* synthetic */ N field001;
    public /* synthetic */ SecureInterface0020<N> field002;
    public final /* synthetic */ AtomicBoolean field003;
    public final /* synthetic */ N field004;
    public /* synthetic */ N field005;

    public /* synthetic */ SecureClass0106(N ZZgwXDMrLAw9UH7X36vKFnBi6UOyyGNh, N kw6tHbSk7wumGWZEEDAwwsfKHxV25ssx) {
        this.field003 = new AtomicBoolean();
        this.Fitxr41qfrZnkuOIZjjsKB3pFniq9AcV = new HashMap<N, N>();
        this.field004 = ZZgwXDMrLAw9UH7X36vKFnBi6UOyyGNh;
        this.field001 = kw6tHbSk7wumGWZEEDAwwsfKHxV25ssx;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ <N extends SecureInterface0100<N>> List<N> tyeOpw4J7AHbMlbRZqvrJZQCivABxv51(@Nullable List<N> field006) {
        if (field006 != null) {
            Collections.reverse(field006);
        }
        return field006;
    }
}

