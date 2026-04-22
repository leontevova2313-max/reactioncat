/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group002;

import engine.linking.NativeMethodHandler;
import java.util.Queue;
import java.util.function.Consumer;
import net.minecraft.class_332;
import org.joml.Matrix4f;
import org.phobos.secure.group010.SecureClass0151;
import org.phobos.secure.group035.SecureClass0620;
import org.phobos.secure.group022.SecureClass0365;
import org.phobos.secure.group042.SecureClass0756;
import org.phobos.secure.group053.SecureClass0966;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0016
extends SecureClass0966 {
    public static final /* synthetic */ Logger field001;
    public final /* synthetic */ Queue<Consumer<Matrix4f>> field002;
    public final /* synthetic */ SecureClass0756 field003;
    public final /* synthetic */ SecureClass0151 field004;
    public final /* synthetic */ SecureClass0365<class_332> field005;
    public /* synthetic */ SecureClass0620 field006;

    public /* synthetic */ SecureClass0016() {
        this.__init__org_phobos_secure_16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2_5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O();
    }

    public native /* synthetic */ void __init__org_phobos_secure_16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2_5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O();

    static {
        NativeMethodHandler.registerNativeCallbacks(63);
        field001 = LoggerFactory.getLogger(SecureClass0016.class);
    }
}

