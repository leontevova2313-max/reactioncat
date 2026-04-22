/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group029;

import engine.linking.NativeMethodHandler;
import org.phobos.secure.group008.SecureClass0126;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group039.SecureClass0672;

public class SecureClass0505
extends SecureClass0126 {
    public static final /* synthetic */ SecureClass0672 field001;
    public static final /* synthetic */ SecureClass0672 field002;

    public /* synthetic */ SecureClass0505(SecureClass0242 mJY5s0jniga4rD05puXb2GKJRunNwwIh) {
        super(mJY5s0jniga4rD05puXb2GKJRunNwwIh, "config", "action", "name", "flags");
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(31);
        field001 = new SecureClass0672("save", "load", "delete", "update", "reset", "list");
        field002 = new SecureClass0672("binds", "hud", "settings", "friends", "enemies", "colors", "visuals");
    }
}

