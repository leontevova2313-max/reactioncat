/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group002;

import engine.linking.NativeMethodHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.function.TriConsumer;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group022.SecureClass0378;
import org.phobos.secure.group056.SecureClass1022;

public abstract class SecureClass0020
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Boolean> extend;
    public final /* synthetic */ SecureClass0603<Boolean> block;
    public final /* synthetic */ Map<class_2338, Long> field001;
    public final /* synthetic */ SecureClass0603<Boolean> below;
    public final /* synthetic */ SecureClass0603<Boolean> sides;
    public final /* synthetic */ SecureClass0603<Boolean> top;

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_88(Map.Entry TzQkVDdHppxyhmrSl3NFwo5eqOH9kl6j) {
        return (Long)TzQkVDdHppxyhmrSl3NFwo5eqOH9kl6j.getValue() + 150L < System.currentTimeMillis();
    }

    public static /* bridge */ /* synthetic */ boolean cwg0ZfMRCzhAJl4QxwRhPHhFoYLbifoU(class_1657 CwON6vsKX9DvoIqaMA44fzkO248vOPWU, class_2338 AymuPZtV77vRSGdjvJqlC8JvawEGDDDW) {
        return (double)AymuPZtV77vRSGdjvJqlC8JvawEGDDDW.method_10264() < CwON6vsKX9DvoIqaMA44fzkO248vOPWU.method_23318() - 0.25;
    }

    public /* synthetic */ SecureClass0020(SecureClass0242 wF2OgiosFxoKYkXI7a1AIngjnWwF1wxb, String z5cZocRTkthExmE206vKBHAFRk7qHn0r, String G5JhBU8H1JuNMWISmIKXdANmru8RW82z, SecureClass0378 yO7k8z6KRIF3GDZ8MpiI5FfIpnzrBF0J, int olD7IQJXNINVulVfWKFDptEUQjS5wHHh) {
        super(wF2OgiosFxoKYkXI7a1AIngjnWwF1wxb, z5cZocRTkthExmE206vKBHAFRk7qHn0r, G5JhBU8H1JuNMWISmIKXdANmru8RW82z, yO7k8z6KRIF3GDZ8MpiI5FfIpnzrBF0J, olD7IQJXNINVulVfWKFDptEUQjS5wHHh);
        this.top = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Top"));
        this.block = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Block").WJ0vcdoIoTedaHc3VbdkGjMiqv0Ku7VO(this.top));
        this.sides = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sides"));
        this.below = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Below"));
        this.extend = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Extend"));
        this.field001 = new HashMap<class_2338, Long>();
        this.wQmStBqRMLz8129caFX4oSmE9yGtCMQV().add(this.cfr_renamed_89("Trap", this.top, this.block, this.sides, this.below, this.extend));
        this.gvJ976ZZegRbLxDC0QCo07dOy6lcsqRv((TriConsumer<class_746, class_638, class_636>)((TriConsumer)(BsP6xoZ04k9x7oC3ALYFYEItwYQOHzTQ, kgZSWK9jhRZ6byUwFWajZ6AcAiJ98z2d, Y8sRot3h0Y06tLYJQuuIyQalgTqOiC2S) -> this.field001.clear()));
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(83);
    }
}

