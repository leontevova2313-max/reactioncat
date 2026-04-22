/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group036;

import engine.linking.NativeMethodHandler;
import java.util.Deque;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2960;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.CalculationsModule;
import org.phobos.secure.group051.t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI;
import org.phobos.secure.group058.uxWhZjpVbrcwpcP0uv2nFLHXMrCqTBHz;
import org.phobos.secure.group053.SecureClass0965;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group059.fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3;

public class SecureClass0628
extends SecureClass0966 {
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public /* synthetic */ String name;
    public static final /* synthetic */ class_2960 field002;
    public final /* synthetic */ Map<String, fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3> field003;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ Map<uxWhZjpVbrcwpcP0uv2nFLHXMrCqTBHz, Long> field007;
    public final /* synthetic */ Deque<String> field008;
    public static final /* synthetic */ class_2960 field009;
    public final /* synthetic */ Set<fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3> field010;
    public final /* synthetic */ Map<String, fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3> field011;
    public static final /* synthetic */ class_2960 field012;

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ SecureClass0628(SecureClass0242 VpKvGPHMWbcMurktb8qYWv6GFWybL5sH) {
        void var1_1;
        this.__init__org_phobos_secure_l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf_06UI6DMDBg42Ra1MGEwPbLWBT1iLoA2W((SecureClass0242)var1_1);
    }

    public native /* synthetic */ void __init__org_phobos_secure_l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf_06UI6DMDBg42Ra1MGEwPbLWBT1iLoA2W(SecureClass0242 var1);

    public static /* bridge */ /* synthetic */ class_2960 MnHWSUIpZetL7baZVeyYLrGhysX9IoJe(t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI fp4X9fEprOSWH9xuPNdn1SaDzw9WvMlW) {
        return switch (fp4X9fEprOSWH9xuPNdn1SaDzw9WvMlW) {
            case t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI.Beta, t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI.Moderator -> field012;
            case t9Ab8GYHv1jgYYGa3lQk8R9V9wnJkdYI.Admin -> field009;
            default -> field002;
        };
    }

    /*
     * WARNING - void declaration
     */
    public static /* bridge */ /* synthetic */ void rgN8MX2VoDaGD1OkBcszhRlV5PHmmei7(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, SecureClass0965 dQ1tjgX4RpJ6MfymoXmHKFcPDygn9Nvd) {
        class_1309 field013;
        if (!SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().qoROvH0slFjLpJJWpOmzJbNqvf54xkUW.getValue().booleanValue() || SecureClass0628.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null || !CalculationsModule.UDzwsDq1j6qNuLCQfKoOgWAQt62w0hMM()) {
            return;
        }
        class_1297 field014 = SecureClass0628.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687.method_8469(dQ1tjgX4RpJ6MfymoXmHKFcPDygn9Nvd.drnEQOEbwfZXuGTaA7FToYNOaZYNqTWO());
        if (field014 instanceof class_1309 && !(field013 = (class_1309)field014).method_29504()) {
            void field015;
            ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.jHqrdqnyWuZBVucmK3J8S6jbcpPrdbjz().njTydqRKqT9J70YQKtM02Cgpnq096Lzx().B4K0VjLFmO5v9WTgmRWRRelEvQ7W0XgL((class_1309)field015, dQ1tjgX4RpJ6MfymoXmHKFcPDygn9Nvd.sTzcvXxZbrjQHsrzC0wBXdy378vO7p35());
            return;
        }
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(56);
        field002 = class_2960.method_60655((String)"phoboslite", (String)"textures/tags/user.png");
        field012 = class_2960.method_60655((String)"phoboslite", (String)"textures/tags/beta.png");
        field009 = class_2960.method_60655((String)"phoboslite", (String)"textures/tags/admin.png");
    }
}

