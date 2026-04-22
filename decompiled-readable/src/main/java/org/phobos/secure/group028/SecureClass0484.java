/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group028;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group026.EDW76W0RdsdUZw7IelRyUDeSVZBzSgzG;
import org.phobos.secure.group040.SecureClass0689;
import org.phobos.secure.group046.qYfzA5oHDRXKOc8iiidXNeayvZe29zjn;
import org.phobos.secure.group053.SecureClass0966;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0484
extends SecureClass0966 {
    public final /* synthetic */ Set<SecureClass0689> field001;
    public static final /* synthetic */ Logger field002;

    public /* synthetic */ SecureClass0484() {
        this.field001 = ConcurrentHashMap.newKeySet();
        this.cfr_renamed_69(new EDW76W0RdsdUZw7IelRyUDeSVZBzSgzG(this));
        this.cfr_renamed_69(new qYfzA5oHDRXKOc8iiidXNeayvZe29zjn(this));
    }

    static {
        field002 = LoggerFactory.getLogger(SecureClass0484.class);
    }
}

