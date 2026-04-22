/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.launch.knot.Knot;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group046.SecureClass0816;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.transformer.Config;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;

public class SecureClass0305 {
    public final /* synthetic */ SecureClass0816 field001;
    public static final /* synthetic */ SecureClass0305 field002;
    public final /* synthetic */ AtomicBoolean field003;

    public static /* bridge */ /* synthetic */ void h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(@Nullable Config Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U) {
        Field field004 = Mixins.class.getDeclaredField("registeredConfigs");
        field004.setAccessible(true);
        Set field005 = (Set)field004.get(null);
        if (Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U == null || field005.contains(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName())) {
            return;
        }
        MixinEnvironment field006 = Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getEnvironment();
        if (field006 != null) {
            Method field007 = MixinEnvironment.class.getDeclaredMethod("registerConfig", String.class);
            field007.setAccessible(true);
            field007.invoke((Object)field006, Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName());
        }
        SecureClass0305.cfr_renamed_384(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U);
        field005.add(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName());
        Config field008 = Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getParent();
        if (field008 != null) {
            SecureClass0305.h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(field008);
        }
    }

    public /* synthetic */ SecureClass0305() {
        this.field001 = new SecureClass0816();
        this.field003 = new AtomicBoolean();
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_384(Config HtLpZfTkFLGhui37heua6I1DedS4UI3W) {
        try {
            Method field009 = Config.class.getDeclaredMethod("get", new Class[0]);
            field009.setAccessible(true);
            Object field010 = field009.invoke((Object)HtLpZfTkFLGhui37heua6I1DedS4UI3W, new Object[0]);
            Class<?> field011 = Class.forName("org.spongepowered.asm.mixin.transformer.MixinConfig");
            Method field012 = field011.getDeclaredMethod("select", MixinEnvironment.class);
            field012.setAccessible(true);
            if (((Boolean)field012.invoke(field010, MixinEnvironment.getDefaultEnvironment())).booleanValue()) {
                Method field013 = field011.getDeclaredMethod("onSelect", new Class[0]);
                field013.setAccessible(true);
                field013.invoke(field010, new Object[0]);
                SecureClass0305.kVHRsM38r8QQjfBvzF8Gw975DhG5kvGn().add(field010);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ SecureClass0305 kcHOGdIFztuGC4chKII7DAsZ04VOBzza() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ IMixinTransformer cfr_renamed_385() {
        Object field014 = SecureClass0305.fTvbCsl07sjjah3gRKiUA7hyoCFNgw55();
        Field field015 = SecureClass0305.m4nmwM4UICmlCi9DSxhcq0he592nhG80();
        field015.setAccessible(true);
        return (IMixinTransformer)field015.get(field014);
    }

    static {
        field002 = new SecureClass0305();
    }

    public static /* bridge */ /* synthetic */ void YWlNrBEhoSi3UY4Ie3BAKcdqyYpDFWch(String string) {
        Config field016 = null;
        try {
            field016 = Config.create((String)string, (MixinEnvironment)MixinEnvironment.getDefaultEnvironment());
        }
        catch (Exception exception) {
            // empty catch block
        }
        SecureClass0305.h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(field016);
    }

    public static /* bridge */ /* synthetic */ Object fTvbCsl07sjjah3gRKiUA7hyoCFNgw55() {
        Knot field017 = (Knot)FabricLauncherBase.getLauncher();
        Field field018 = Knot.class.getDeclaredField("classLoader");
        field018.setAccessible(true);
        return field018.get(field017);
    }

    public static /* bridge */ /* synthetic */ Field m4nmwM4UICmlCi9DSxhcq0he592nhG80() {
        Class<?> clazz = Class.forName("net.fabricmc.loader.impl.launch.knot.KnotClassDelegate");
        return clazz.getDeclaredField("mixinTransformer");
    }

    public static /* bridge */ /* synthetic */ IMixinTransformer cfr_renamed_386() {
        boolean field019;
        IMixinTransformer field020 = SecureClass0305.cfr_renamed_385();
        Class<?> clazz = Class.forName("org.spongepowered.asm.mixin.transformer.MixinTransformer");
        block4: do {
            if (clazz.isInstance(field020)) {
                return field020;
            }
            field019 = false;
            for (Class<T> clazz2 = field020.getClass(); clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
                try {
                    Field field021 = clazz2.getDeclaredField("delegate");
                    field021.setAccessible(true);
                    field020 = (IMixinTransformer)field021.get(field020);
                    field019 = true;
                    continue block4;
                }
                catch (ClassCastException | NoSuchFieldException SQMyI7JnACZMs9T0YvrgPhCnS3cYblzt) {
                    continue;
                }
            }
        } while (field019);
        throw new NoSuchFieldException("Failed to find delegate field on " + String.valueOf(field020.getClass()));
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_387(IMixinTransformer SdLOm4d9hlNjPqhccBU66pDsmTeUdPL9) {
        Object field022 = SecureClass0305.fTvbCsl07sjjah3gRKiUA7hyoCFNgw55();
        Field field023 = SecureClass0305.m4nmwM4UICmlCi9DSxhcq0he592nhG80();
        field023.setAccessible(true);
        field023.set(field022, SdLOm4d9hlNjPqhccBU66pDsmTeUdPL9);
    }

    public static /* bridge */ /* synthetic */ List<Object> kVHRsM38r8QQjfBvzF8Gw975DhG5kvGn() {
        IMixinTransformer field024 = SecureClass0305.cfr_renamed_386();
        Class<?> field025 = Class.forName("org.spongepowered.asm.mixin.transformer.MixinTransformer");
        Field field026 = field025.getDeclaredField("processor");
        field026.setAccessible(true);
        Object object = field026.get(field024);
        Class<?> field027 = Class.forName("org.spongepowered.asm.mixin.transformer.MixinProcessor");
        Field field028 = field027.getDeclaredField("pendingConfigs");
        field028.setAccessible(true);
        return (List)field028.get(object);
    }
}

