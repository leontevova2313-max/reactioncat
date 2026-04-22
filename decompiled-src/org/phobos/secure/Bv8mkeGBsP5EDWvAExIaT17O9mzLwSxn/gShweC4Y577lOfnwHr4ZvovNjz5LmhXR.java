/*
 * Decompiled with CFR.
 */
package org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.loader.impl.launch.FabricLauncherBase;
import net.fabricmc.loader.impl.launch.knot.Knot;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam._6uBH2nn2xwaRWvXC0STjpcHqfqxJOUEx;
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.transformer.Config;
import org.spongepowered.asm.mixin.transformer.IMixinTransformer;

public class gShweC4Y577lOfnwHr4ZvovNjz5LmhXR {
    public final /* synthetic */ _6uBH2nn2xwaRWvXC0STjpcHqfqxJOUEx qI27ReKZkfyziUdCOxLWnOw0oOX0jrk9;
    public static final /* synthetic */ gShweC4Y577lOfnwHr4ZvovNjz5LmhXR z0ByFcMQQOsIxUPeisxgyvJFIVI42p9r;
    public final /* synthetic */ AtomicBoolean cfr_renamed_383;

    public static /* bridge */ /* synthetic */ void h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(@Nullable Config Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U) {
        Field rsOFRk5yQ5my6ugLVTWGgllDHAcjxIWd = Mixins.class.getDeclaredField("registeredConfigs");
        rsOFRk5yQ5my6ugLVTWGgllDHAcjxIWd.setAccessible(true);
        Set YBZeyxlzOn96i7iWxuvJ7tP69VWNLtEW = (Set)rsOFRk5yQ5my6ugLVTWGgllDHAcjxIWd.get(null);
        if (Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U == null || YBZeyxlzOn96i7iWxuvJ7tP69VWNLtEW.contains(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName())) {
            return;
        }
        MixinEnvironment mixinEnvironment = Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getEnvironment();
        if (mixinEnvironment != null) {
            Method HcIJrOrLDBStNNXiQU39R1OS6wnspXvI = MixinEnvironment.class.getDeclaredMethod("registerConfig", String.class);
            HcIJrOrLDBStNNXiQU39R1OS6wnspXvI.setAccessible(true);
            HcIJrOrLDBStNNXiQU39R1OS6wnspXvI.invoke((Object)mixinEnvironment, Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName());
        }
        gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.cfr_renamed_384(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U);
        YBZeyxlzOn96i7iWxuvJ7tP69VWNLtEW.add(Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getName());
        Config GjusSeC1766XOMdvI9JhvStrl79kcGmM = Ll1oAKeKmYhPiz8LH8jtQwqaazSBlz5U.getParent();
        if (GjusSeC1766XOMdvI9JhvStrl79kcGmM != null) {
            gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(GjusSeC1766XOMdvI9JhvStrl79kcGmM);
        }
    }

    public /* synthetic */ gShweC4Y577lOfnwHr4ZvovNjz5LmhXR() {
        this.qI27ReKZkfyziUdCOxLWnOw0oOX0jrk9 = new _6uBH2nn2xwaRWvXC0STjpcHqfqxJOUEx();
        this.cfr_renamed_383 = new AtomicBoolean();
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_384(Config HtLpZfTkFLGhui37heua6I1DedS4UI3W) {
        try {
            Method JuONbC8pIpk6unCbDfPNseRUHadbF3if = Config.class.getDeclaredMethod("get", new Class[0]);
            JuONbC8pIpk6unCbDfPNseRUHadbF3if.setAccessible(true);
            Object lrNr2fm0QWMqnpmR83zrLd03bQrtxzLU = JuONbC8pIpk6unCbDfPNseRUHadbF3if.invoke((Object)HtLpZfTkFLGhui37heua6I1DedS4UI3W, new Object[0]);
            Class<?> Qi9FetZfJz511eikjQ3b6n3xue3lCqKh = Class.forName("org.spongepowered.asm.mixin.transformer.MixinConfig");
            Method twkQUdlJ4g9NMfrCP1utCr1KViUOKsgK = Qi9FetZfJz511eikjQ3b6n3xue3lCqKh.getDeclaredMethod("select", MixinEnvironment.class);
            twkQUdlJ4g9NMfrCP1utCr1KViUOKsgK.setAccessible(true);
            if (((Boolean)twkQUdlJ4g9NMfrCP1utCr1KViUOKsgK.invoke(lrNr2fm0QWMqnpmR83zrLd03bQrtxzLU, MixinEnvironment.getDefaultEnvironment())).booleanValue()) {
                Method rFUY7PDlYTetk827Xv4BOFBZgqMbggYK = Qi9FetZfJz511eikjQ3b6n3xue3lCqKh.getDeclaredMethod("onSelect", new Class[0]);
                rFUY7PDlYTetk827Xv4BOFBZgqMbggYK.setAccessible(true);
                rFUY7PDlYTetk827Xv4BOFBZgqMbggYK.invoke(lrNr2fm0QWMqnpmR83zrLd03bQrtxzLU, new Object[0]);
                gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.kVHRsM38r8QQjfBvzF8Gw975DhG5kvGn().add(lrNr2fm0QWMqnpmR83zrLd03bQrtxzLU);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static /* bridge */ /* synthetic */ gShweC4Y577lOfnwHr4ZvovNjz5LmhXR kcHOGdIFztuGC4chKII7DAsZ04VOBzza() {
        return z0ByFcMQQOsIxUPeisxgyvJFIVI42p9r;
    }

    public static /* bridge */ /* synthetic */ IMixinTransformer cfr_renamed_385() {
        Object PHTyF310PgCl29IoJAnvtI0rull5Oj8c = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.fTvbCsl07sjjah3gRKiUA7hyoCFNgw55();
        Field CFJd1CR3hPVWi0E0SZG1Fp0iML7Z6saj = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.m4nmwM4UICmlCi9DSxhcq0he592nhG80();
        CFJd1CR3hPVWi0E0SZG1Fp0iML7Z6saj.setAccessible(true);
        return (IMixinTransformer)CFJd1CR3hPVWi0E0SZG1Fp0iML7Z6saj.get(PHTyF310PgCl29IoJAnvtI0rull5Oj8c);
    }

    static {
        z0ByFcMQQOsIxUPeisxgyvJFIVI42p9r = new gShweC4Y577lOfnwHr4ZvovNjz5LmhXR();
    }

    public static /* bridge */ /* synthetic */ void YWlNrBEhoSi3UY4Ie3BAKcdqyYpDFWch(String string) {
        Config drRES3YfgSInFZkLDMTvFo15IljnGyYF = null;
        try {
            drRES3YfgSInFZkLDMTvFo15IljnGyYF = Config.create((String)string, (MixinEnvironment)MixinEnvironment.getDefaultEnvironment());
        }
        catch (Exception exception) {
            // empty catch block
        }
        gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.h8bIrIK89twQuMXf9oIc6AvAMZaIoTA8(drRES3YfgSInFZkLDMTvFo15IljnGyYF);
    }

    public static /* bridge */ /* synthetic */ Object fTvbCsl07sjjah3gRKiUA7hyoCFNgw55() {
        Knot fnftB1VU0Qdg77nTDw1q1q5DxC8vJPpg = (Knot)FabricLauncherBase.getLauncher();
        Field OiUJNg64r2KBstsRz03aaVzxlH4ESCi0 = Knot.class.getDeclaredField("classLoader");
        OiUJNg64r2KBstsRz03aaVzxlH4ESCi0.setAccessible(true);
        return OiUJNg64r2KBstsRz03aaVzxlH4ESCi0.get(fnftB1VU0Qdg77nTDw1q1q5DxC8vJPpg);
    }

    public static /* bridge */ /* synthetic */ Field m4nmwM4UICmlCi9DSxhcq0he592nhG80() {
        Class<?> clazz = Class.forName("net.fabricmc.loader.impl.launch.knot.KnotClassDelegate");
        return clazz.getDeclaredField("mixinTransformer");
    }

    public static /* bridge */ /* synthetic */ IMixinTransformer cfr_renamed_386() {
        boolean GwnGrIZ5AH40jSkstCOO24l8ajOEFRd9;
        IMixinTransformer iMixinTransformer = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.cfr_renamed_385();
        Class<?> clazz = Class.forName("org.spongepowered.asm.mixin.transformer.MixinTransformer");
        block4: do {
            if (clazz.isInstance(iMixinTransformer)) {
                return iMixinTransformer;
            }
            GwnGrIZ5AH40jSkstCOO24l8ajOEFRd9 = false;
            for (Class<T> clazz2 = iMixinTransformer.getClass(); clazz2 != Object.class; clazz2 = clazz2.getSuperclass()) {
                try {
                    Field yPSgG5jIY7CMAnrUmMPA1pXmIEQ7RJZD = clazz2.getDeclaredField("delegate");
                    yPSgG5jIY7CMAnrUmMPA1pXmIEQ7RJZD.setAccessible(true);
                    iMixinTransformer = (IMixinTransformer)yPSgG5jIY7CMAnrUmMPA1pXmIEQ7RJZD.get(iMixinTransformer);
                    GwnGrIZ5AH40jSkstCOO24l8ajOEFRd9 = true;
                    continue block4;
                }
                catch (ClassCastException | NoSuchFieldException SQMyI7JnACZMs9T0YvrgPhCnS3cYblzt) {
                    continue;
                }
            }
        } while (GwnGrIZ5AH40jSkstCOO24l8ajOEFRd9);
        throw new NoSuchFieldException("Failed to find delegate field on " + String.valueOf(iMixinTransformer.getClass()));
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_387(IMixinTransformer SdLOm4d9hlNjPqhccBU66pDsmTeUdPL9) {
        Object jUqWxOyMvUfXsZrJ98oaBjdlJ4wlpuM8 = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.fTvbCsl07sjjah3gRKiUA7hyoCFNgw55();
        Field ImrLmul6TD9agJTVDJCN6U60s18nNGWR = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.m4nmwM4UICmlCi9DSxhcq0he592nhG80();
        ImrLmul6TD9agJTVDJCN6U60s18nNGWR.setAccessible(true);
        ImrLmul6TD9agJTVDJCN6U60s18nNGWR.set(jUqWxOyMvUfXsZrJ98oaBjdlJ4wlpuM8, SdLOm4d9hlNjPqhccBU66pDsmTeUdPL9);
    }

    public static /* bridge */ /* synthetic */ List<Object> kVHRsM38r8QQjfBvzF8Gw975DhG5kvGn() {
        IMixinTransformer keAlxwizAdX4LI2FUFspKP3k7zMiXpsp = gShweC4Y577lOfnwHr4ZvovNjz5LmhXR.cfr_renamed_386();
        Class<?> RrwgiFQxAJPZzxpToqrS8I1CXc1edpae = Class.forName("org.spongepowered.asm.mixin.transformer.MixinTransformer");
        Field VjH21payJiGEJrALdI52EZplYmpIYFlY = RrwgiFQxAJPZzxpToqrS8I1CXc1edpae.getDeclaredField("processor");
        VjH21payJiGEJrALdI52EZplYmpIYFlY.setAccessible(true);
        Object object = VjH21payJiGEJrALdI52EZplYmpIYFlY.get(keAlxwizAdX4LI2FUFspKP3k7zMiXpsp);
        Class<?> Vr8oYDvCrAUSWiAGSwDKI8ieYxg41b5S = Class.forName("org.spongepowered.asm.mixin.transformer.MixinProcessor");
        Field yBoj0fI8iQGp3dtaGc8EoIUS6y5Xmt0q = Vr8oYDvCrAUSWiAGSwDKI8ieYxg41b5S.getDeclaredField("pendingConfigs");
        yBoj0fI8iQGp3dtaGc8EoIUS6y5Xmt0q.setAccessible(true);
        return (List)yBoj0fI8iQGp3dtaGc8EoIUS6y5Xmt0q.get(object);
    }
}

