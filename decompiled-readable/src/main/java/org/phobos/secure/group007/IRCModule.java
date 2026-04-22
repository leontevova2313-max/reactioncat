/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group007;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import java.util.List;
import java.util.concurrent.ExecutorService;
import net.minecraft.class_124;
import net.minecraft.class_128;
import net.minecraft.class_2561;
import org.apache.logging.log4j.util.TriConsumer;
import org.phobos.secure.group008.SecureClass0122;
import org.phobos.secure.group013.SecureClass0201;
import org.phobos.secure.group014.SecureClass0237;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureClass0277;
import org.phobos.secure.group018.SecureClass0291;
import org.phobos.secure.group024.SecureClass0411;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group041.SecureClass0715;
import org.phobos.secure.group055.SecureClass1005;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.SecureClass1051;
import org.phobos.secure.group063._60zPYfu4s7jfKbddIyFAsL1cjNhu4L7m;
import org.phobos.secure.group063.NotificationsModule;
import org.phobos.secure.group022.SecureClass0357;
import org.phobos.secure.group022.SecureClass0362;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group056.SecureClass1027;

public class IRCModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<String> field001;
    public static /* synthetic */ IRCModule field002;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0603<Long> field004;
    public final /* synthetic */ SecureClass0603<Color> field005;
    public final /* synthetic */ SecureClass0603<SecureClass0666> field006;
    public final /* synthetic */ Color field007;
    public /* synthetic */ boolean field008;
    public final /* synthetic */ SecureClass0603<Boolean> field009;
    public final /* synthetic */ SecureClass0603<Boolean> field010;
    public final /* synthetic */ ExecutorService field011;
    public static /* synthetic */ String field012;
    public final /* synthetic */ List<_60zPYfu4s7jfKbddIyFAsL1cjNhu4L7m> field013;

    public static /* bridge */ /* synthetic */ void auBggbhosvKvcTvL4uvlvmlc7FrRMsyT(class_128 xzsN8bAzJo7Pozchnj2C0h3bCeZMaYME) {
        if (field002 == null) {
            return;
        }
        field002.rGsCrzDaJNN7LEcFjyse76Ov8Hl8K0u7(xzsN8bAzJo7Pozchnj2C0h3bCeZMaYME);
    }

    public static /* bridge */ /* synthetic */ boolean Hjwm2FK3oebSZjAhFEos5DyujzOtI2ad() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && IRCModule.field002.field009.getValue() != false;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ IRCModule(SecureClass0242 bYeHYALCXtnjpwJtjRJhMwkqbV2jxKA8) {
        super((SecureClass0242)var1_1, "IRC", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "IRC and shared features", new int[0]);
        void var1_1;
        this.__init__org_phobos_secure_4ankqQTX08KHaG3hRKAriJZJvFiF7YAw_FWOK8F0nHHTgM2jVB1hCjmalSqYtE932((SecureClass0242)var1_1);
    }

    public native /* synthetic */ void __init__org_phobos_secure_4ankqQTX08KHaG3hRKAriJZJvFiF7YAw_FWOK8F0nHHTgM2jVB1hCjmalSqYtE932(SecureClass0242 var1);

    public static /* bridge */ /* synthetic */ boolean KNvfiSpmgcdcmou2L2BezDuJMf6GQHxZ(String ZDltgwXvFW7UXvLs5t3waObuQ9oPkp30) {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ZDltgwXvFW7UXvLs5t3waObuQ9oPkp30.startsWith(IRCModule.field002.field001.getValue());
    }

    public static /* bridge */ /* synthetic */ void MuWz6PKiqopVBpFun3KohEjWcPYMxyF4(SecureClass1005 sC3QaWW2tu7C5HpowrGApMXq80CPhRV5) {
        if (IRCModule.field002 != null) {
            NotificationsModule.EBTOe9BxfODSaZKz6RqUb9wF3OHHvp6e().HRsM5dzNNcWDypRCUpVAulox8ejxc99x(hZZGCv3x4sCmwlxHUFJozOGNOvJuSOga -> {
                if (sC3QaWW2tu7C5HpowrGApMXq80CPhRV5.eD1LipCX2LuHvTWIHZyufKrwCwywt9lx()) {
                    IRCModule.field002.MEMyhIj3Dw99mGb8uDXM9X9DUJ9N1kiz((class_2561)class_2561.method_43470((String)"[IRC] %s".formatted(sC3QaWW2tu7C5HpowrGApMXq80CPhRV5.getMessage())).method_54663(hZZGCv3x4sCmwlxHUFJozOGNOvJuSOga.hashCode()));
                    return;
                }
                IRCModule.field002.MEMyhIj3Dw99mGb8uDXM9X9DUJ9N1kiz((class_2561)class_2561.method_43470((String)"[IRC] ").method_54663(hZZGCv3x4sCmwlxHUFJozOGNOvJuSOga.hashCode()).method_10852((class_2561)class_2561.method_43470((String)(sC3QaWW2tu7C5HpowrGApMXq80CPhRV5.PbHMCwwKkwT3vq8q1h874NC6vwppiaNu() + ": " + sC3QaWW2tu7C5HpowrGApMXq80CPhRV5.getMessage())).method_54663(0xFFFFFF)));
            });
        }
    }

    public static /* bridge */ /* synthetic */ void IX9EhNjIYULgSDmW1s9prR2qppHCf02z(SecureClass0411 FDBKQvS5Lr0K2fnJV0CCOaq515mAAztB) {
        if (IRCModule.field002 != null) {
            NotificationsModule.EBTOe9BxfODSaZKz6RqUb9wF3OHHvp6e().HRsM5dzNNcWDypRCUpVAulox8ejxc99x(GJHXqmlcNF8pRwwGtmmkEwpIV0OtOTHv -> IRCModule.field002.MEMyhIj3Dw99mGb8uDXM9X9DUJ9N1kiz((class_2561)class_2561.method_43470((String)"[IRC] ").method_54663(GJHXqmlcNF8pRwwGtmmkEwpIV0OtOTHv.hashCode()).method_10852((class_2561)class_2561.method_43470((String)FDBKQvS5Lr0K2fnJV0CCOaq515mAAztB.fcMhmlWL6FofGPGyYAgYAcVIqSH7NQiU()).method_54663(0xFFFFFF))));
        }
    }

    public static /* bridge */ /* synthetic */ void o9DRrmHPMhMUpC5HQbfnfd2jxJPbz4db(SecureClass0237 girH3joAeAwleNJkVPvu2Ak2ngBGNq00) {
        String field014 = SecureClass0357.BoKAhLSkZHa8o5F21VdpTG81vA8jGTRs(girH3joAeAwleNJkVPvu2Ak2ngBGNq00.LEV4qyfKfSuqgkzXSYySYCPCQFkUvG6X());
        if (girH3joAeAwleNJkVPvu2Ak2ngBGNq00.cfr_renamed_166().equals(SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.tnNO9sjqYkhz1EEvQ5qgi9LLO5JQHe0e())) {
            IRCModule.field012 = field014;
        }
        if (IRCModule.field002 != null) {
            NotificationsModule.EBTOe9BxfODSaZKz6RqUb9wF3OHHvp6e().cfr_renamed_167((TriConsumer<Color, Color, Color>)((TriConsumer)(ZXhgAZ4jiqHyvK95gqME8U8pEsnXJc1i, O1Rm4eYhnjO98alosAsfzgVHQURxm4yI, SrPHRlE0drB0stnn8SPVgJNYP3rfrbyN) -> IRCModule.field002.MEMyhIj3Dw99mGb8uDXM9X9DUJ9N1kiz((class_2561)class_2561.method_43470((String)"[IRC] ").method_54663(O1Rm4eYhnjO98alosAsfzgVHQURxm4yI.hashCode()).method_10852((class_2561)class_2561.method_43470((String)("[" + field014 + " -> " + girH3joAeAwleNJkVPvu2Ak2ngBGNq00.cfr_renamed_166() + "]: " + girH3joAeAwleNJkVPvu2Ak2ngBGNq00.getMessage())).method_54663(0xFFFFFF)))));
        }
    }

    public static /* bridge */ /* synthetic */ String CmHEKU1KQ1XC0r28uGZygx6xTXmq059v() {
        return field012;
    }

    public static /* bridge */ /* synthetic */ void CqawXnhZUG06YKezKgqJeMqFnKHclYJA(SecureClass0201 RScHYzip269FzhG9srzYElVtZV8nDjLJ) {
    }

    public static /* bridge */ /* synthetic */ void sx5L1XIP0KznwXGTQuLLciXRdsYCNWNi(SecureClass0242 ikz0GBLsIFWE0o17HelEccuOEi4s0945, SecureClass0122 xC3qmDr3EKTUJZvwadROzhCte7GvDazA) {
        if (IRCModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null) {
            return;
        }
        String field015 = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.PbHMCwwKkwT3vq8q1h874NC6vwppiaNu();
        String field016 = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.getName();
        String field017 = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.gqHzLXMtHkLByw3lHJFkoUET4oup8XIJ();
        double d = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.cfr_renamed_168();
        double field018 = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.JPwjAKQ9yMX4tZetmb58pmeVlOFn3ECw();
        double field019 = xC3qmDr3EKTUJZvwadROzhCte7GvDazA.cfr_renamed_169();
        double field020 = Math.round(Math.sqrt(IRCModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_19538().method_1028(d, field018, field019)));
        ikz0GBLsIFWE0o17HelEccuOEi4s0945.Plhq8JYts4x7Zqe2hK5zBYXdwlFCCFxA().HXo5IRn2bWOgTftOmembFAkM2XxGGjz6("Do you want to add %s (%s blocks away) sent by %s as a waypoint?".formatted(field016, field020, field015), () -> ikz0GBLsIFWE0o17HelEccuOEi4s0945.Wi6ebtxT9OSopY3BT8rmvsBA4nkKmCZF().VcWMeFgmjHEnWeVb9w7CiWikXywjbEL1(d, field018, field019, field016, field017));
    }

    public static /* bridge */ /* synthetic */ void WeenbnO8tiaoQ7PWYGeAeFHGG62QSl5K(SecureClass0242 lYmmXD62SUR17VICXp9SLmSG8hJCwotL, SecureClass0291 rtGfxpjOFiNc1FccHeBzI3tv3CK4aeoj) {
        String field021 = rtGfxpjOFiNc1FccHeBzI3tv3CK4aeoj.cfr_renamed_170();
        lYmmXD62SUR17VICXp9SLmSG8hJCwotL.Plhq8JYts4x7Zqe2hK5zBYXdwlFCCFxA().B7FSY0vWh8co5fVf8rXElVvxFwptU29K("%s (%s) wants to join you on this server".formatted(field021, rtGfxpjOFiNc1FccHeBzI3tv3CK4aeoj.kHvOfprdGt8vewTmL5SQREIyZOLliDTD()), () -> lYmmXD62SUR17VICXp9SLmSG8hJCwotL.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().cfr_renamed_171(new SecureClass0277(true, field021)), () -> lYmmXD62SUR17VICXp9SLmSG8hJCwotL.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().cfr_renamed_171(new SecureClass0277(false, field021)), "Accept", "Reject");
    }

    public static /* bridge */ /* synthetic */ void SMTA3VEzcUZqg7HiviiIbCu8Ko4FUPGE(SecureClass0715 GVWkcxpQmYWksnZhUA2ceqdNkkEirgWy) {
        P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_20493(() -> SecureClass0362.n2hKpI0rY5qGY85gDyqxzYMAhEnxpC60(GVWkcxpQmYWksnZhUA2ceqdNkkEirgWy.FyYFb6w9zvqnSnJDr3TSKuxqVHnRGIlH()));
    }

    public static /* bridge */ /* synthetic */ void ze0LnjdIXZctFFLnrGvH4pMcQ4OVabc4(SecureClass1051 DoomiHGyxwVft7M8lNYFidYmW2ja30iV) {
        if (IRCModule.field002 != null) {
            NotificationsModule.EBTOe9BxfODSaZKz6RqUb9wF3OHHvp6e().HRsM5dzNNcWDypRCUpVAulox8ejxc99x(LaYF3Q20LhYyVRwCnD3fSLh56kRwFwan -> IRCModule.field002.MEMyhIj3Dw99mGb8uDXM9X9DUJ9N1kiz((class_2561)class_2561.method_43470((String)"[IRC] ").method_54663(LaYF3Q20LhYyVRwCnD3fSLh56kRwFwan.hashCode()).method_10852((class_2561)class_2561.method_43470((String)(DoomiHGyxwVft7M8lNYFidYmW2ja30iV.jeTIa7sYleHuXQhceFlje6SZMZlz3HFW() + " " + (DoomiHGyxwVft7M8lNYFidYmW2ja30iV.JoRqgCxKKulsI89xBxt2DB93XbUx1Kqc() ? "has connected." : "has disconnected"))).method_27692(class_124.field_1070))));
        }
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(65);
    }
}

