/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import net.minecraft.class_2680;
import org.phobos.secure.group002._6jlNlZOnEKWVQGReVLkeEcQq64O4wt7J;
import org.phobos.secure.group004.NKERquIffblFWvpaTwwfUwGVNvpULjOD;
import org.phobos.secure.group007.o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a;
import org.phobos.secure.group013.rpCSxe6sjJP3Ex1WJo7eu5jPWgLfUQm0;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group015.EknXtGN7Q5xVgliwtaFXrFN9cxEdfDI2;
import org.phobos.secure.group017.rUj9OT9RNEjxqetNFfjWeRiBxtanUxjA;
import org.phobos.secure.group026.WrBvP3SW9e4kNZzGdcYznBrOlGWM5gwe;
import org.phobos.secure.group029._0gJbuoTpWtxPLa3fXmmA0j4sXlXNHpgJ;
import org.phobos.secure.group034.Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035._770CqaTAPYBwpgCeySVoa3CPLLrqdomG;
import org.phobos.secure.group039.UhzXi0lrN2yUwxuxeyFcJ8osEDCKEhnf;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group048.AHd9VZZWXdagBFlM1lTYGmA6khn36KBw;
import org.phobos.secure.group055.S6bSHVSViBYZ6m8UBbf7ACazAsQknmiF;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.dkniv8R95kjr5mGauwWeWYUtXRqG96bJ;
import org.phobos.secure.group020._5NL67dveaft7W6w4NPWRHOLlQPGDVzsY;
import org.phobos.secure.group030.ngfi3id7U6Jbq7z3UvjG7EFUxzcE3eFZ;
import org.phobos.secure.group037.GwLeFYUWiuIhU4JWBJ4jKuI2zGXUMD52;
import org.phobos.secure.group042.SecureClass0738;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class NoRenderModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> glint;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static /* synthetic */ NoRenderModule field003;
    public final /* synthetic */ SecureClass0603<Set<class_2248>> blocks;

    public static /* bridge */ /* synthetic */ boolean priGBqBlKthcKKxnu2hb4bCOjU9nZ3RS() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NoRenderModule.field003.field001.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean oQ3M64PiFnDzesCi3gKujk3jjRv13XK5(class_2248 G6KSTTZWtLTBT90GOslzp6789n1OjjC1) {
        if (field003 != null && field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return NoRenderModule.field003.blocks.getValue().contains(G6KSTTZWtLTBT90GOslzp6789n1OjjC1);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean m0zZUQYeUKVUVOMRFJJRa7oOwyM9w1Sb() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && NoRenderModule.field003.field002.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean R1M3Y91nTUxM6sRuTZOtYyFqDqnQw7vn(class_2680 tc3RqRMUTf1gjrSWPIpEQNc2BvhWHSX4) {
        return NoRenderModule.oQ3M64PiFnDzesCi3gKujk3jjRv13XK5(tc3RqRMUTf1gjrSWPIpEQNc2BvhWHSX4.method_26204());
    }

    public static /* bridge */ /* synthetic */ boolean xZ6Y7CCVp4BjLkGFZa6PXVwbmJYgQSWK(class_1799 MdkXDK22UHB7Jblyb68bPwDONhnfJLdZ, boolean field004) {
        if (!field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return field004;
        }
        Set<class_1792> field005 = NoRenderModule.field003.glint.getValue();
        if (field005.isEmpty()) {
            return field004;
        }
        if (field005.contains(MdkXDK22UHB7Jblyb68bPwDONhnfJLdZ.method_7909())) {
            return false;
        }
        return field004;
    }

    public /* synthetic */ NoRenderModule(SecureClass0242 tsVlTMEIp0KO9bJmnVZjzIoFeRPwgsmy) {
        super(tsVlTMEIp0KO9bJmnVZjzIoFeRPwgsmy, "NoRender", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Prevents certain things from rendering", new int[0]);
        this.blocks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0738("Blocks", new class_2248[0]));
        this.glint = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Glint", new class_1792[0]));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Shadow", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("removes shadows under entities"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Boss", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Removes boss bar"));
        this.blocks.cfr_renamed_123(set -> {
            if (!set.isEmpty()) {
                P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> {
                    if (NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769 == null) {
                        return;
                    }
                    NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1730 = false;
                    NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.method_3279();
                });
                return;
            }
            if (!NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1730) {
                P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> {
                    if (NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769 == null) {
                        return;
                    }
                    NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1730 = true;
                    NoRenderModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1769.method_3279();
                });
            }
        });
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Fire", "Prevents fire from rendering", rUj9OT9RNEjxqetNFfjWeRiBxtanUxjA.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Inside", "Prevents fire blocks and grass blocks from rendering", _5NL67dveaft7W6w4NPWRHOLlQPGDVzsY.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Totems", "Stops the totem animation", ngfi3id7U6Jbq7z3UvjG7EFUxzcE3eFZ.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Skylight", "Prevents Skylight updates", dkniv8R95kjr5mGauwWeWYUtXRqG96bJ.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Liquids", "Prevents the liquid overlay from rendering", NKERquIffblFWvpaTwwfUwGVNvpULjOD.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Hurtcam", "Stops your screen from shaking when you are hurt", EknXtGN7Q5xVgliwtaFXrFN9cxEdfDI2.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Bob", "Stops your screen from bobbing when you move", o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Fov", "Stops all effects changing your FOV", Y2tYHf99nmJ64IzMX1g3DlCjpaxt5oYn.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Scoreboard", "Removes scoreboard renderer", UhzXi0lrN2yUwxuxeyFcJ8osEDCKEhnf.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Potions", "Stops rendering effect boxes", _6jlNlZOnEKWVQGReVLkeEcQq64O4wt7J.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Armor", "Removes armor layers", S6bSHVSViBYZ6m8UBbf7ACazAsQknmiF.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Blindness", "Removes blindness", rpCSxe6sjJP3Ex1WJo7eu5jPWgLfUQm0.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Toast", "Removes in-game toast notifications", AHd9VZZWXdagBFlM1lTYGmA6khn36KBw.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("Break", "Removes block break particles", _770CqaTAPYBwpgCeySVoa3CPLLrqdomG.class);
        this.evcn8MHj0jPOe7i6xsa1BKAg97zVRTGN("ActionBar", "Removes action bar & item name display", GwLeFYUWiuIhU4JWBJ4jKuI2zGXUMD52.class);
        SecureClass0603<V> field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Explosions", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Removes explosion particles"));
        SecureClass0603<V> field007 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Particles", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Removes all particles"));
        this.cfr_renamed_69(new _0gJbuoTpWtxPLa3fXmmA0j4sXlXNHpgJ(this, field007, field006));
        SecureClass1022 field008 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fog", "Removes fog.", true));
        this.cfr_renamed_69(new WrBvP3SW9e4kNZzGdcYznBrOlGWM5gwe(this, -1, field008));
        field003 = this;
    }
}

