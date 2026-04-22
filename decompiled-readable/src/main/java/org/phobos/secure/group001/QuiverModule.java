/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

import engine.linking.NativeMethodHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1291;
import net.minecraft.class_6880;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061.RTgUNurxktWXJkz4fb4NiMhK36WGg1AH;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class QuiverModule
extends SecureClass1027 {
    public final /* synthetic */ Map<class_6880<class_1291>, Long> field001;
    public final /* synthetic */ SecureClass0603<Integer> ticks;

    public /* synthetic */ QuiverModule(SecureClass0242 KSGK4oWIMky4dIEcN9wchfPFZyQViW1Y) {
        super(KSGK4oWIMky4dIEcN9wchfPFZyQViW1Y, "Quiver", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Shoots yourself with arrows", new int[0]);
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 3, 3, 6));
        this.field001 = new HashMap<class_6880<class_1291>, Long>();
        this.cfr_renamed_69(new RTgUNurxktWXJkz4fb4NiMhK36WGg1AH(this, 500));
    }

    public static /* bridge */ /* synthetic */ boolean BrBYsRtmQkA5eFLVZUj9WtBZJuo12Aiy(Map.Entry FV3r1xAvxhorhWBozSi7DkvyWmylyzFV) {
        return (Long)FV3r1xAvxhorhWBozSi7DkvyWmylyzFV.getValue() < System.currentTimeMillis();
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(80);
    }
}

