/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

import org.apache.commons.lang3.mutable.MutableBoolean;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0658;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group063.UIModule;
import org.phobos.secure.group056.SecureClass1027;

public class SecureClass0360 {
    public static final /* synthetic */ SecureClass0603<String> field001;

    public static /* bridge */ /* synthetic */ boolean isEmpty() {
        return SecureClass0360.field001.getValue().isEmpty();
    }

    static {
        field001 = new SecureClass0667("Search", "");
    }

    public static /* bridge */ /* synthetic */ boolean sL8cOeSGeyd3fdsjqpUkNFaqLpcCvs9a(SecureClass1027 lm19bNXsKFrIqEVG4uQPf1TWfpQYpiQu, SecureClass0658 Vx4qacVpC4DFFL9EUDUnHLHGlLv7n3EJ) {
        if (Vx4qacVpC4DFFL9EUDUnHLHGlLv7n3EJ != null) {
            Vx4qacVpC4DFFL9EUDUnHLHGlLv7n3EJ.cfr_renamed_752(false);
        }
        if (!UIModule.W22vqq42MmQsH62x9mIBz15BhfESFB2y()) {
            return true;
        }
        String field002 = SecureClass0360.field001.getValue();
        if (field002.isEmpty()) {
            return true;
        }
        String field003 = field002.toLowerCase();
        if (lm19bNXsKFrIqEVG4uQPf1TWfpQYpiQu.getName().toLowerCase().contains(field003)) {
            return true;
        }
        MutableBoolean field004 = new MutableBoolean();
        for (SecureClass0603<?> V8GsoUCjUiZEKsb5unEC1Xzq50tYvr1Q : lm19bNXsKFrIqEVG4uQPf1TWfpQYpiQu.G7ZxgdMfERZBUqp5gzc8h2EadufE7U64()) {
            if (V8GsoUCjUiZEKsb5unEC1Xzq50tYvr1Q.ZrL7lTsQE6xNzvMhapwyaOsSPcoDWsgt() != null && !V8GsoUCjUiZEKsb5unEC1Xzq50tYvr1Q.ZrL7lTsQE6xNzvMhapwyaOsSPcoDWsgt().kN308btmvxQdNNAMOdSaGn3VixYR1HVC() || !V8GsoUCjUiZEKsb5unEC1Xzq50tYvr1Q.getName().toLowerCase().contains(field003)) continue;
            field004.setTrue();
        }
        if (!field004.isTrue()) {
            return false;
        }
        if (Vx4qacVpC4DFFL9EUDUnHLHGlLv7n3EJ != null) {
            Vx4qacVpC4DFFL9EUDUnHLHGlLv7n3EJ.cfr_renamed_752(true);
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ SecureClass0603<String> cfr_renamed_753() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ boolean pbs8flCZWv8JrxH2i2Jihjt08Fs1tE7x(String jweDvesIFP9R3dtA3tl9fNUVmvFuGNzl, SecureClass0658 ... Cf2TAEFcxd3Ix4YXpdRne8mCrugkeYhw) {
        for (SecureClass0658 TxIUS6arU1Bd2OJrPTw4CAwjUjm29YFO : Cf2TAEFcxd3Ix4YXpdRne8mCrugkeYhw) {
            TxIUS6arU1Bd2OJrPTw4CAwjUjm29YFO.cfr_renamed_752(false);
        }
        if (!UIModule.W22vqq42MmQsH62x9mIBz15BhfESFB2y()) {
            return true;
        }
        String field005 = SecureClass0360.field001.getValue();
        if (field005.isEmpty()) {
            return true;
        }
        String field006 = field005.toLowerCase();
        if (!jweDvesIFP9R3dtA3tl9fNUVmvFuGNzl.toLowerCase().contains(field006)) {
            return false;
        }
        SecureClass0658[] field007 = Cf2TAEFcxd3Ix4YXpdRne8mCrugkeYhw;
        int n = field007.length;
        int n2 = 0;
        while (n2 < n) {
            SecureClass0658 field008 = field007[n2];
            field008.cfr_renamed_752(true);
            ++n2;
        }
        return true;
    }
}

