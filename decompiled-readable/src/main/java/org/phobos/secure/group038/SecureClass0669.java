/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.phobos.secure.group047.SecureClass0850;
import org.phobos.secure.group023.AntiCheatModule;

public class SecureClass0669
extends SecureClass0850 {
    public static /* synthetic */ SecureClass0669 field001;
    public /* synthetic */ class_746 field002;
    public /* synthetic */ ScheduledExecutorService field003;

    public /* synthetic */ SecureClass0669(class_746 J5R4Kgya2EwVnL3uoS6JLEEw6wqhfHST, AntiCheatModule nyh6xI2hLM8cr7XmTE0wi3RwEJJNEStW) {
        super((class_742)J5R4Kgya2EwVnL3uoS6JLEEw6wqhfHST, true, nyh6xI2hLM8cr7XmTE0wi3RwEJJNEStW);
        this.field003 = Executors.newScheduledThreadPool(8);
        this.field002 = J5R4Kgya2EwVnL3uoS6JLEEw6wqhfHST;
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ SecureClass0669 hq9Oi2EDKELNA5Oygyo0FFviOAsdazlE() {
        return field001;
    }
}

