/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group048;

import java.util.function.Consumer;
import org.phobos.secure.group005.SecureClass0069;

public enum SecureEnum0018 {
    NORMAL("normal", macro -> {
        if (macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv().length > 0) {
            macro.jUTx9tycKHAZlTTPSrTSPiqH4QlhOL0W(macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv()[0]);
        }
    }),
    COMBINED("combined", macro -> {
        String[] stringArray = macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv();
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String command = stringArray[n2];
            macro.jUTx9tycKHAZlTTPSrTSPiqH4QlhOL0W(command);
            ++n2;
        }
        return;
    }),
    SWITCH("flow", macro -> {
        if (macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv().length == 0) {
            return;
        }
        macro.jUTx9tycKHAZlTTPSrTSPiqH4QlhOL0W(macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv()[macro.CYzTVINu7eLmpzbzrTY6CVsChNUgab1N()]);
        macro.hDlTWMWEqnMWpvpKaEyEK8IEN5NQbApR(macro.CYzTVINu7eLmpzbzrTY6CVsChNUgab1N() + 1);
        if (macro.CYzTVINu7eLmpzbzrTY6CVsChNUgab1N() >= macro.SKCFZx7bmOx1C5CP06QAjNOO2fS9WCrv().length) {
            macro.hDlTWMWEqnMWpvpKaEyEK8IEN5NQbApR(0);
        }
    });

    public final /* synthetic */ String name;
    public final /* synthetic */ Consumer<SecureClass0069> action;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ SecureEnum0018(String string2, Consumer<SecureClass0069> string2) {
        void action;
        void name;
        this.name = name;
        this.action = action;
    }

    public static /* bridge */ /* synthetic */ SecureEnum0018 fromString(String string) {
        return switch (string) {
            case "combined" -> COMBINED;
            case "switch" -> SWITCH;
            default -> NORMAL;
        };
    }
}

