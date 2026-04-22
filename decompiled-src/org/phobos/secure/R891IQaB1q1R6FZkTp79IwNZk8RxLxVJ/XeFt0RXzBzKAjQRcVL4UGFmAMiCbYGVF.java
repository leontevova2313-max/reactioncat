/*
 * Decompiled with CFR.
 */
package org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ;

import java.util.function.Consumer;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.fAI3zntY3MJooUXkZmkqCytfVM2shI8G;

public enum XeFt0RXzBzKAjQRcVL4UGFmAMiCbYGVF {
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
    public final /* synthetic */ Consumer<fAI3zntY3MJooUXkZmkqCytfVM2shI8G> action;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ XeFt0RXzBzKAjQRcVL4UGFmAMiCbYGVF(String string2, Consumer<fAI3zntY3MJooUXkZmkqCytfVM2shI8G> string2) {
        void action;
        void name;
        this.name = name;
        this.action = action;
    }

    public static /* bridge */ /* synthetic */ XeFt0RXzBzKAjQRcVL4UGFmAMiCbYGVF fromString(String string) {
        return switch (string) {
            case "combined" -> COMBINED;
            case "switch" -> SWITCH;
            default -> NORMAL;
        };
    }
}

