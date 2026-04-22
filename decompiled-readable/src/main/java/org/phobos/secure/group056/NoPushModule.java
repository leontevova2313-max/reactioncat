/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group056;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class NoPushModule
extends SecureClass1027 {
    public static /* synthetic */ NoPushModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> liquids;

    public static /* bridge */ /* synthetic */ boolean MwBxTEvwUoMGCMcv17UhagMSYW8qIgvb() {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    public /* synthetic */ NoPushModule(SecureClass0242 a7zYHPURXg7yd6pPY8M0joruZ2Y8UYhv) {
        super(a7zYHPURXg7yd6pPY8M0joruZ2Y8UYhv, "NoPush", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Prevents you from being pushed by entities and blocks", new int[0]);
        this.liquids = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Liquids"));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ boolean GLDIqOsSBp6foSScWVQCQuTHmTYUFqtP() {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NoPushModule.field001.liquids.getValue() != false;
    }
}

