/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import org.phobos.secure.group007.zbYLJdaedLk578LwAlYIUlXQWcSAlFnM;
import org.phobos.secure.group012.Al0TmLfmf3oxQmNF0MGPjBSVRy7tN8fQ;
import org.phobos.secure.group018._59eUZxQ3vSY0zcOp2WsxdV0koHYfbeHh;
import org.phobos.secure.group038._6GPNo7vwX5vHK25cfzHwRKvqvg4YM8Sk;

public abstract sealed class SecureClass1100
extends Enum<SecureClass1100>
permits zbYLJdaedLk578LwAlYIUlXQWcSAlFnM, _6GPNo7vwX5vHK25cfzHwRKvqvg4YM8Sk, _59eUZxQ3vSY0zcOp2WsxdV0koHYfbeHh, Al0TmLfmf3oxQmNF0MGPjBSVRy7tN8fQ {
    public static final /* synthetic */ /* enum */ SecureClass1100 F;
    public final /* synthetic */ String description;
    public static final /* synthetic */ /* enum */ SecureClass1100 LAOG;
    public static final /* synthetic */ /* enum */ SecureClass1100 OGO;
    public static final /* synthetic */ /* enum */ SecureClass1100 PAOG;
    public static final /* synthetic */ SecureClass1100[] $VALUES;

    public static /* bridge */ /* synthetic */ SecureClass1100[] values() {
        return (SecureClass1100[])$VALUES.clone();
    }

    public static /* bridge */ /* synthetic */ SecureClass1100 valueOf(String name) {
        return Enum.valueOf(SecureClass1100.class, name);
    }

    static {
        OGO = new zbYLJdaedLk578LwAlYIUlXQWcSAlFnM("OGO", 0, "OnGroundOnly");
        PAOG = new _6GPNo7vwX5vHK25cfzHwRKvqvg4YM8Sk("PAOG", 1, "PositionAndOnGround");
        LAOG = new _59eUZxQ3vSY0zcOp2WsxdV0koHYfbeHh("LAOG", 2, "LookAndOnGround");
        F = new Al0TmLfmf3oxQmNF0MGPjBSVRy7tN8fQ("F", 3, "FULL");
        $VALUES = SecureClass1100.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass1100(String string) {
        void description;
        void field001;
        void field002;
        this.description = description;
    }

    public static /* bridge */ /* synthetic */ SecureClass1100[] $values() {
        return new SecureClass1100[]{OGO, PAOG, LAOG, F};
    }
}

