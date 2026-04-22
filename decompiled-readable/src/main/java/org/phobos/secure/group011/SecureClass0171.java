/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group048.SecureInterface0122;
import org.phobos.secure.group042.SecureClass0743;

public class SecureClass0171
extends class_742 {
    public static final /* synthetic */ class_640 field001;
    @Nullable
    public /* synthetic */ SecureClass0743 field002;
    public final /* synthetic */ SecureInterface0122 field003;
    public static final /* synthetic */ GameProfile field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ class_8685 field006;
    public /* synthetic */ int field007;
    public /* synthetic */ boolean field008;

    public /* synthetic */ SecureClass0171(class_638 PKa0Iiz3R0XedJBnYXheIW3H9yY5dgzG, GameProfile HPyD4ieMSuFiWX1YH74vCN0RShf25uzb) {
        super(PKa0Iiz3R0XedJBnYXheIW3H9yY5dgzG, HPyD4ieMSuFiWX1YH74vCN0RShf25uzb);
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field005 = true;
        this.field008 = false;
    }

    public /* synthetic */ SecureClass0171(class_638 xvUrxF9TS1jOq893xHMu0yNOkJ7FP55T, String aFjuWU21rUxGltUJFf31Qiu6K8eNCPme) {
        super(xvUrxF9TS1jOq893xHMu0yNOkJ7FP55T, new GameProfile(UUID.randomUUID(), aFjuWU21rUxGltUJFf31Qiu6K8eNCPme));
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field005 = true;
        this.field008 = false;
    }

    public /* synthetic */ SecureClass0171(class_638 fX8MzaWCbdU6uV6f9GIzb1R333nIhOl4) {
        super(fX8MzaWCbdU6uV6f9GIzb1R333nIhOl4, field004);
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field005 = true;
        this.field008 = false;
    }

    static {
        field004 = new GameProfile(UUID.randomUUID(), "FakePlayer");
        field001 = new class_640(field004, true);
    }
}

