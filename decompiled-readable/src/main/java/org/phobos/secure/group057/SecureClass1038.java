/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import org.phobos.secure.group001.dKcfPwd9CTUinhyuTUfwkYcavqQ4Z9qO;
import org.phobos.secure.group008.ShfcDWsHSvA0NquYIQVlVsRRaoXVp0pO;
import org.phobos.secure.group008.uYaK00iDHhfr6P73rmggl4FXnU6vwCk4;
import org.phobos.secure.group026.ZTg7MbREudhhdtm1rCwAkt7UALGQTnzn;
import org.phobos.secure.group035.SecureEnum0012;
import org.phobos.secure.group039.B2a9sI0bNBxDYEXTNgEgGybtIOmNi3m6;
import org.phobos.secure.group057.PM6P0GWzSnqepHDhooHSZhx65qRaxs2M;
import org.phobos.secure.group061.i2VpCFE82pdcNYmLZU1pZoANUSW6tgWu;
import org.phobos.secure.group022.ga6wtqqVtlUkvfv3eI7q8UhMS2YpPfz4;
import org.phobos.secure.group044.rCD3ZPhQK81qpaoHaPltkbbxptRZb4h4;
import org.phobos.secure.group046._6Ul3W2McMVal3DzQ5MlPtvk3OrCJk5PG;

public sealed class SecureClass1038
extends Enum<SecureClass1038>
permits i2VpCFE82pdcNYmLZU1pZoANUSW6tgWu, dKcfPwd9CTUinhyuTUfwkYcavqQ4Z9qO, rCD3ZPhQK81qpaoHaPltkbbxptRZb4h4, _6Ul3W2McMVal3DzQ5MlPtvk3OrCJk5PG, B2a9sI0bNBxDYEXTNgEgGybtIOmNi3m6, ga6wtqqVtlUkvfv3eI7q8UhMS2YpPfz4, PM6P0GWzSnqepHDhooHSZhx65qRaxs2M, ZTg7MbREudhhdtm1rCwAkt7UALGQTnzn, uYaK00iDHhfr6P73rmggl4FXnU6vwCk4, ShfcDWsHSvA0NquYIQVlVsRRaoXVp0pO {
    public final /* synthetic */ SecureEnum0012 axis;
    public static final /* synthetic */ /* enum */ SecureClass1038 Right;
    public static final /* synthetic */ /* enum */ SecureClass1038 Top;
    public static final /* synthetic */ /* enum */ SecureClass1038 Bottom;
    public static final /* synthetic */ /* enum */ SecureClass1038 InsideRight;
    public static final /* synthetic */ /* enum */ SecureClass1038 InsideTop;
    public final /* synthetic */ boolean side;
    public static final /* synthetic */ /* enum */ SecureClass1038 YCenter;
    public static final /* synthetic */ SecureClass1038[] $VALUES;
    public static final /* synthetic */ /* enum */ SecureClass1038 Left;
    public static final /* synthetic */ /* enum */ SecureClass1038 InsideBottom;
    public final /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ SecureClass1038 XCenter;
    public static final /* synthetic */ /* enum */ SecureClass1038 InsideLeft;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass1038(boolean bl2, String bl2, SecureEnum0012 side) {
        void axis;
        void name;
        void field001;
        void field002;
        this.side = side;
        this.name = name;
        this.axis = axis;
    }

    public static /* bridge */ /* synthetic */ SecureClass1038[] values() {
        return (SecureClass1038[])$VALUES.clone();
    }

    static {
        Top = new i2VpCFE82pdcNYmLZU1pZoANUSW6tgWu("Top", 0, false, "top", SecureEnum0012.Vertical);
        Bottom = new dKcfPwd9CTUinhyuTUfwkYcavqQ4Z9qO("Bottom", 1, false, "bottom", SecureEnum0012.Vertical);
        Left = new rCD3ZPhQK81qpaoHaPltkbbxptRZb4h4("Left", 2, true, "left", SecureEnum0012.Horizontal);
        Right = new _6Ul3W2McMVal3DzQ5MlPtvk3OrCJk5PG("Right", 3, true, "right", SecureEnum0012.Horizontal);
        InsideRight = new B2a9sI0bNBxDYEXTNgEgGybtIOmNi3m6("InsideRight", 4, true, "insideRight", SecureEnum0012.Horizontal);
        InsideLeft = new ga6wtqqVtlUkvfv3eI7q8UhMS2YpPfz4("InsideLeft", 5, true, "insideLeft", SecureEnum0012.Horizontal);
        InsideTop = new PM6P0GWzSnqepHDhooHSZhx65qRaxs2M("InsideTop", 6, true, "insideTop", SecureEnum0012.Vertical);
        InsideBottom = new ZTg7MbREudhhdtm1rCwAkt7UALGQTnzn("InsideBottom", 7, true, "insideBottom", SecureEnum0012.Vertical);
        YCenter = new uYaK00iDHhfr6P73rmggl4FXnU6vwCk4("YCenter", 8, false, "centerY", SecureEnum0012.Vertical);
        XCenter = new ShfcDWsHSvA0NquYIQVlVsRRaoXVp0pO("XCenter", 9, false, "centerX", SecureEnum0012.Horizontal);
        $VALUES = SecureClass1038.$values();
    }

    public static /* bridge */ /* synthetic */ SecureClass1038 valueOf(String name) {
        return Enum.valueOf(SecureClass1038.class, name);
    }

    public static /* bridge */ /* synthetic */ SecureClass1038 fromString(String string) {
        return switch (string) {
            case "top" -> Top;
            case "bottom" -> Bottom;
            case "centerX" -> XCenter;
            case "center", "centerY" -> YCenter;
            case "left" -> Left;
            case "right" -> Right;
            case "insideRight" -> InsideRight;
            case "insideLeft" -> InsideLeft;
            case "insideTop" -> InsideTop;
            case "insideBottom" -> InsideBottom;
            default -> null;
        };
    }

    public static /* bridge */ /* synthetic */ SecureClass1038[] $values() {
        return new SecureClass1038[]{Top, Bottom, Left, Right, InsideRight, InsideLeft, InsideTop, InsideBottom, YCenter, XCenter};
    }
}

