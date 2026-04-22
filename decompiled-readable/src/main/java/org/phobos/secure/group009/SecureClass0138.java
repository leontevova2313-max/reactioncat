/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import java.awt.Color;
import java.util.regex.Pattern;

public final class SecureClass0138 {
    public static final /* synthetic */ Color field001;
    public static final /* synthetic */ Pattern field002;

    public static /* bridge */ /* synthetic */ String BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(String field003) {
        return field003 == null ? null : field002.matcher(field003).replaceAll("");
    }

    static {
        field001 = new Color(0, 0, 0, 0);
        field002 = Pattern.compile("(?i)\u00a7[0-9A-FK-OR+]");
    }

    public /* synthetic */ SecureClass0138() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

