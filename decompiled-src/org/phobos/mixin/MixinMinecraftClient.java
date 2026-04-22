/*
 * Decompiled with CFR.
 */
package org.phobos.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import java.awt.Font;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import net.minecraft.class_1011;
import net.minecraft.class_1041;
import net.minecraft.class_1060;
import net.minecraft.class_1142;
import net.minecraft.class_1144;
import net.minecraft.class_1156;
import net.minecraft.class_1268;
import net.minecraft.class_128;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_2535;
import net.minecraft.class_304;
import net.minecraft.class_309;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_329;
import net.minecraft.class_340;
import net.minecraft.class_3695;
import net.minecraft.class_4071;
import net.minecraft.class_418;
import net.minecraft.class_423;
import net.minecraft.class_437;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_702;
import net.minecraft.class_746;
import net.minecraft.class_757;
import net.minecraft.class_7594;
import net.minecraft.class_761;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2._0hTpbyyEW5qnFrePlOEYMw43vv8qi9EU;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2._3OCksD5XVtq1g4zozSy1Ty4Ck4BcNzJa;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.qFORrQtPYBcWll6edNPcgmx3NFYsxPkR;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.FWOK8F0nHHTgM2jVB1hCjmalSqYtE932;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.i5KxYd3FYzxOy8rEyuia3xW93GGNhlUT;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE._0hI4EKssQOrgS47aPEsja2TKDQ6GeoNX;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.I2Qzs9zL65PW4bCVdmXjms8Xvj9doiFJ;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.wnxvTX3RV02LdYDqHT2mCLhVgOHCS9s7;
import org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn.MSTM1uOjzx2SLo1U9EgTsVrN7qVmq2Q8;
import org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn.ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.izYjBFodU60gr2apTFxPJvlcprGlywjG;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.DdHsFeRCUbwS2Hodg1WQxK4YieZ34xIQ;
import org.phobos.secure.RugDPRqy5xmkJR7Yctr5fQZFvaNSp12I.GEEkDkvM8O2wv7RQdNuFM5opiKyja70G;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.kJPNoR0rkAV5MdIpuKalnf68UmhUrM5R;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf.IFBwO5urZ94FSgMlGiRJZBS4I19xfibY;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ.gcsJFL65Ls909OFvFm7TLYBmc0Gyaai7;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.FdGZg0crkbOEn8w0kJ5mXFGcP2kJ7nWo;
import org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ.WYj2CHvNmNPxAFeXbXpFfyHUlydHOq3C;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY;
import org.phobos.secure.ulFKkKf3PI2HUx83QjvCny5RVdQ1JbCt.fQfHEeeC8bQ6VCX7nm6WBCbbnFd49lak;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_310.class})
public abstract class MixinMinecraftClient
implements EventSubscriber {
    @Shadow
    @Final
    public class_761 field_1769;
    @Shadow
    @Final
    private class_1142 field_1714;
    @Shadow
    @Final
    public class_309 field_1774;
    @Shadow
    @Nullable
    public class_239 field_1765;
    @Shadow
    @Final
    private class_1060 field_1764;
    @Shadow
    private volatile boolean field_1734;
    @Shadow
    @Nullable
    public class_638 field_1687;
    @Shadow
    @Final
    public class_757 field_1773;
    @Shadow
    @Final
    private class_1144 field_1727;
    @Shadow
    @Final
    private class_7594 field_39770;
    @Shadow
    @Final
    public class_329 field_1705;
    @Shadow
    private long field_46553;
    @Shadow
    @Nullable
    private class_2535 field_1746;
    @Shadow
    @Nullable
    public class_636 field_1761;
    @Shadow
    @Final
    public class_315 field_1690;
    @Shadow
    @Nullable
    public class_746 field_1724;
    @Shadow
    @Final
    private class_1156 field_1758;
    @Shadow
    private int field_1752;
    @Shadow
    @Final
    public class_702 field_1713;
    @Shadow
    @Nullable
    private Supplier<class_128> field_1747;
    @Shadow
    @Final
    private class_1041 field_1704;
    @Shadow
    private class_3695 field_16240;
    @Shadow
    public int field_1771;
    @Shadow
    @Nullable
    public class_437 field_1755;
    @Shadow
    @Nullable
    private class_4071 field_18175;

    @Inject(method={"reloadResources(ZLnet/minecraft/client/MinecraftClient$LoadingContext;)Ljava/util/concurrent/CompletableFuture;"}, at={@At(value="TAIL")})
    private void setOverlayHook(boolean force, // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable class_310.class_8764 loadingContext, CallbackInfoReturnable<CompletableFuture<Void>> cir) {
        CompletableFuture result = (CompletableFuture)cir.getReturnValue();
        result.thenRun(() -> {
            GEEkDkvM8O2wv7RQdNuFM5opiKyja70G manager = _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().bwEmrDnsyfDEVWklw1PjrvbUN9ZrHHgH();
            if (manager == null) {
                return;
            }
            manager.cfr_renamed_3();
            manager.fPF5qROudQSlT3Ai5pI4Ez0AAdJvm7Tg();
        });
    }

    @Shadow
    public abstract class_1041 method_22683();

    @Inject(method={"run"}, at={@At(value="RETURN")})
    private void runHook(CallbackInfo ci) {
        this.invoke(new _0hTpbyyEW5qnFrePlOEYMw43vv8qi9EU());
    }

    @Inject(method={"<init>"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;setOverlay(Lnet/minecraft/client/gui/screen/Overlay;)V", shift=At.Shift.AFTER)})
    private void runGameHook(CallbackInfo ci) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().cfr_renamed_4();
    }

    @Shadow
    protected abstract boolean method_60647();

    @Shadow
    protected abstract void method_1508();

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;)V"}, at={@At(value="RETURN")})
    private void disconnectHook(class_437 disconnectionScreen, CallbackInfo ci) {
        this.invoke(new _0hI4EKssQOrgS47aPEsja2TKDQ6GeoNX());
    }

    @Unique
    private void insertImage(InputStream _16, InputStream _32) {
        try (MemoryStack stack = MemoryStack.stackPush();){
            GLFWImage.Buffer buffer = GLFWImage.malloc((int)2, (MemoryStack)stack);
            List<InputStream> list = List.of(_16, _32);
            ArrayList<ByteBuffer> buffers = new ArrayList<ByteBuffer>();
            for (int i = 0; i < list.size(); ++i) {
                class_1011 image = class_1011.method_4309((InputStream)list.get(i));
                ByteBuffer bb = MemoryUtil.memAlloc(image.method_4307() * image.method_4323() * 4);
                bb.asIntBuffer().put(image.method_48463());
                buffer.position(i);
                buffer.width(image.method_4307());
                buffer.height(image.method_4323());
                buffer.pixels(bb);
                buffers.add(bb);
            }
            try {
                if (GLFW.glfwGetPlatform() != 393219) {
                    GLFW.glfwSetWindowIcon((long)this.method_22683().method_4490(), (GLFWImage.Buffer)buffer);
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            for (ByteBuffer bb : buffers) {
                MemoryUtil.memFree(bb);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @ModifyVariable(method={"render"}, ordinal=0, at=@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;runTasks()V", shift=At.Shift.AFTER))
    private int runTickHook(int i) {
        IFBwO5urZ94FSgMlGiRJZBS4I19xfibY.MZ8f9QHHuOXnSnsFvfK1PYfyv4adMA2V.i6Yuw54sYTLSaNb6tkFeZCb4CiRr1m2T(i);
        this.invoke(IFBwO5urZ94FSgMlGiRJZBS4I19xfibY.MZ8f9QHHuOXnSnsFvfK1PYfyv4adMA2V);
        return IFBwO5urZ94FSgMlGiRJZBS4I19xfibY.MZ8f9QHHuOXnSnsFvfK1PYfyv4adMA2V.aa1CBm68TmxU6ggMwNC433KXESVQis3x();
    }

    @Shadow
    protected abstract String method_24287();

    @Inject(method={"tick"}, at={@At(value="HEAD")}, cancellable=true)
    private void tickHook(CallbackInfo ci) {
        FdGZg0crkbOEn8w0kJ5mXFGcP2kJ7nWo event = this.invoke(new FdGZg0crkbOEn8w0kJ5mXFGcP2kJ7nWo(), ci);
        if (event.isCancelled()) {
            ++this.field_46553;
            if (this.field_1687 != null && !this.field_1734) {
                this.field_1687.method_54719().method_54755();
            }
            if (this.field_1752 > 0) {
                --this.field_1752;
            }
            this.field_16240.method_15396("gui");
            this.field_39770.method_44765();
            this.field_1705.method_39191(this.field_1734);
            this.field_16240.method_15407();
            this.field_1773.method_3190(1.0f);
            this.field_1758.method_4911(this.field_1687, this.field_1765);
            this.field_16240.method_15396("gameMode");
            if (!this.field_1734 && this.field_1687 != null) {
                this.field_1761.method_2927();
            }
            this.field_16240.method_15405("textures");
            if (this.method_60647()) {
                this.field_1764.method_4622();
            }
            if (this.field_1755 == null && this.field_1724 != null) {
                if (this.field_1724.method_29504() && !(this.field_1755 instanceof class_418)) {
                    this.method_1507(null);
                } else if (this.field_1724.method_6113() && this.field_1687 != null) {
                    this.method_1507((class_437)new class_423());
                }
            } else {
                class_437 var2 = this.field_1755;
                if (var2 instanceof class_423) {
                    class_423 sleepingChatScreen = (class_423)var2;
                    if (!this.field_1724.method_6113()) {
                        sleepingChatScreen.method_38530();
                    }
                }
            }
            if (this.field_1755 != null) {
                this.field_1771 = 10000;
            }
            if (this.field_1755 != null) {
                class_437.method_25412(() -> this.field_1755.method_25393(), (String)"Ticking screen", (String)this.field_1755.getClass().getCanonicalName());
            }
            if (!this.method_53526().method_53536()) {
                this.field_1705.method_1745();
            }
            if (this.field_18175 == null && this.field_1755 == null) {
                this.field_16240.method_15405("Keybindings");
                this.method_1508();
                if (this.field_1771 > 0) {
                    --this.field_1771;
                }
            }
            if (this.field_1687 != null) {
                this.field_16240.method_15405("gameRenderer");
                if (!this.field_1734) {
                    this.field_1773.method_3182();
                }
                this.field_16240.method_15405("levelRenderer");
                if (!this.field_1734) {
                    this.field_1769.method_3252();
                }
            } else if (this.field_1773.method_3183() != null) {
                this.field_1773.method_3207();
            }
            if (!this.field_1734) {
                this.field_1714.method_18669();
            }
            this.field_1727.method_18670(this.field_1734);
            if (this.field_1687 != null) {
                this.field_16240.method_15405("animateTick");
                if (!this.field_1734 && this.method_60647()) {
                    this.field_1687.method_2941(this.field_1724.method_31477(), this.field_1724.method_31478(), this.field_1724.method_31479());
                }
                this.field_16240.method_15405("particles");
                if (!this.field_1734 && this.method_60647()) {
                    this.field_1713.method_3057();
                }
            } else if (this.field_1746 != null) {
                this.field_16240.method_15405("pendingConnection");
                this.field_1746.method_10754();
            }
            this.field_16240.method_15405("keyboard");
            this.field_1774.method_1474();
            this.field_16240.method_15407();
        }
    }

    @Shadow
    public abstract void method_1507(@Nullable class_437 var1);

    @Shadow
    public abstract class_340 method_53526();

    @Inject(method={"printCrashReport(Lnet/minecraft/util/crash/CrashReport;)V"}, at={@At(value="HEAD")})
    private void printCrashReportHook1(class_128 report, CallbackInfo ci) {
        FWOK8F0nHHTgM2jVB1hCjmalSqYtE932.auBggbhosvKvcTvL4uvlvmlc7FrRMsyT(report);
        this.invoke(new _0hTpbyyEW5qnFrePlOEYMw43vv8qi9EU());
    }

    @Shadow
    protected abstract void method_1590(boolean var1);

    @Inject(method={"joinWorld"}, at={@At(value="RETURN")})
    private void joinHook(CallbackInfo ci) {
        this.invoke(new _0hI4EKssQOrgS47aPEsja2TKDQ6GeoNX());
    }

    @Inject(method={"onResolutionChanged"}, at={@At(value="TAIL")})
    private void captureResize(CallbackInfo ci) {
        ((qFORrQtPYBcWll6edNPcgmx3NFYsxPkR)qFORrQtPYBcWll6edNPcgmx3NFYsxPkR.qOFwezjcS6uiVO8oLRN3e7Qo0baAskwZ.invoker()).ZlqmArg4vjGZZSXc9kNlExPxgOJpOP5y((class_310)this, this.field_1704);
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void setupHook(CallbackInfo ci) {
        try {
            _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().fJKSYg2lHT3xeM2vnEoyNttu9ywm8EJg().cfr_renamed_5(new kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip(new Font[]{Font.decode("FreeSerif")}, 16.0f, 36, 2));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Inject(method={"printCrashReport()V"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;printCrashReport(Lnet/minecraft/client/MinecraftClient;Ljava/io/File;Lnet/minecraft/util/crash/CrashReport;)V")})
    private void printCrashReportHook2(CallbackInfo ci) {
        assert (this.field_1747 != null);
        FWOK8F0nHHTgM2jVB1hCjmalSqYtE932.auBggbhosvKvcTvL4uvlvmlc7FrRMsyT(this.field_1747.get());
        this.invoke(new _0hTpbyyEW5qnFrePlOEYMw43vv8qi9EU());
    }

    @Inject(method={"stop"}, at={@At(value="HEAD")})
    private void stopHook(CallbackInfo ci) {
        Thread thread = new Thread(() -> {
            try {
                o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.stop();
                ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY.stop();
                WYj2CHvNmNPxAFeXbXpFfyHUlydHOq3C.ktHmOsX7pPogP5pDNHlAdBfSr4BWzcCl(_5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ());
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        });
        thread.setName("Phobos/Stop");
        thread.start();
    }

    @Inject(method={"disconnect(Lnet/minecraft/client/gui/screen/Screen;Z)V"}, at={@At(value="HEAD")})
    private void disconnectHook(class_437 disconnectionScreen, boolean transferring, CallbackInfo ci) {
        this.invoke(new I2Qzs9zL65PW4bCVdmXjms8Xvj9doiFJ());
    }

    @Inject(method={"tick"}, at={@At(value="TAIL")})
    public void endTickHook(CallbackInfo ci) {
        this.invoke(new fQfHEeeC8bQ6VCX7nm6WBCbbnFd49lak());
    }

    @Inject(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z", ordinal=0, shift=At.Shift.BEFORE)}, cancellable=true)
    private void handleInputEventsHook3(CallbackInfo ci) {
        this.invoke(new kJPNoR0rkAV5MdIpuKalnf68UmhUrM5R(), ci);
    }

    @Redirect(method={"handleInputEvents"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/option/KeyBinding;isPressed()Z"))
    private boolean handleInputEventsHook4(class_304 instance) {
        boolean pressed = instance.method_1434();
        if (instance == this.field_1690.field_1886) {
            return GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY.RhYzCDSZ5KrU7zqFiKJdTVdPzNt0fAoL(pressed);
        }
        if (instance == this.field_1690.field_1904) {
            return GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY.RGvhp0rt4o4VSh9bIzyVEbKzHuz618Wt(pressed);
        }
        return pressed;
    }

    @ModifyExpressionValue(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;isBreakingBlock()Z")})
    private boolean doItemUseHook(boolean original) {
        return !a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.jrYZBEod37iElrPhUhHJaZ6hFkxhI1Nk() && original;
    }

    @ModifyExpressionValue(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z", ordinal=0)})
    private boolean handleInputEventsHook1(boolean original) {
        return !a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.cfr_renamed_6() && original;
    }

    @Inject(method={"setScreen"}, at={@At(value="HEAD")})
    private <T extends class_437> void screenHook(T screen, CallbackInfo ci) {
        this.invoke(new _3OCksD5XVtq1g4zozSy1Ty4Ck4BcNzJa<T>(screen));
    }

    @Inject(method={"handleInputEvents"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z", ordinal=0, shift=At.Shift.BEFORE)})
    private void handleInputEventsHook2(CallbackInfo info) {
        if (this.field_1724 == null || this.field_1761 == null) {
            return;
        }
        if (a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.MwBxTEvwUoMGCMcv17UhagMSYW8qIgvb() && this.field_1724.method_6115()) {
            if (!GRPyEgdwETOBNwYE1BcyXtGAZiQId1DY.RGvhp0rt4o4VSh9bIzyVEbKzHuz618Wt(this.field_1690.field_1904.method_1434())) {
                this.field_1761.method_2897((class_1657)this.field_1724);
            }
            while (this.field_1690.field_1904.method_1436()) {
            }
        }
    }

    @Inject(method={"setScreen"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;showsDeathScreen()Z", shift=At.Shift.BEFORE)})
    private void onDeathScreenHook(class_437 screen, CallbackInfo ci) {
        this.invoke(new MSTM1uOjzx2SLo1U9EgTsVrN7qVmq2Q8(this.field_1724));
    }

    @Inject(method={"handleBlockBreaking"}, at={@At(value="HEAD")}, cancellable=true)
    private void handleBlockBreakingHook(boolean breaking, CallbackInfo ci) {
        if (_5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().Jh3FJFxGuX1y20n8d2MeR7TvOJ39E6SS().x1tyQkzBKsQ0GP1XzjazGczybHaoPzO8(this.field_1724, this.field_1687, this.field_1761)) {
            ci.cancel();
        }
    }

    @Inject(method={"doItemPick"}, at={@At(value="HEAD")}, cancellable=true)
    private void doItemPick(CallbackInfo ci) {
        if (!DdHsFeRCUbwS2Hodg1WQxK4YieZ34xIQ.Zx6GBkUB80tWfo0qQtdyzmo8FYhVQjw9()) {
            return;
        }
        ci.cancel();
    }

    @Inject(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/item/ItemStack;isItemEnabled(Lnet/minecraft/resource/featuretoggle/FeatureSet;)Z")})
    private void doItemUseHook(CallbackInfo ci, @Local class_1799 stack, @Local class_1268 hand) {
        this.field_1752 = i5KxYd3FYzxOy8rEyuia3xW93GGNhlUT.CeEiIZFlInmqec33hVGjMJo46PQvPUO6(stack, hand);
    }

    @Inject(method={"doItemUse"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;interactEntityAtLocation(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/hit/EntityHitResult;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResult;")}, cancellable=true)
    private void doItemUseHook(CallbackInfo ci, @Local class_1799 itemStack, @Local class_1297 entity) {
        if (a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.sQ5jsnD505XSZFQ4wTz8UvXtgvaSNNhy() && (entity instanceof class_1511 || entity instanceof class_1657)) {
            if (gcsJFL65Ls909OFvFm7TLYBmc0Gyaai7.sitxd7zhZre5KKvAnSWfrd4JcUBxuNDd(itemStack.method_7909())) {
                return;
            }
            this.field_1752 = 0;
            ci.cancel();
        }
    }

    @Unique
    private boolean acceptBlockBreaking(boolean original) {
        if (this.field_1724 == null) {
            return original;
        }
        class_1799 itemStack = this.field_1724.method_6047();
        if (a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.sQ5jsnD505XSZFQ4wTz8UvXtgvaSNNhy() && (itemStack.method_31574(class_1802.field_8301) || itemStack.method_31574(class_1802.field_8281))) {
            this.field_1771 = 0;
            return false;
        }
        return original;
    }

    @Inject(method={"doAttack"}, at={@At(value="HEAD")}, cancellable=true)
    private void doAttackHook(CallbackInfoReturnable<Boolean> cir) {
        wnxvTX3RV02LdYDqHT2mCLhVgOHCS9s7 event = this.invoke(new wnxvTX3RV02LdYDqHT2mCLhVgOHCS9s7());
        if (event.isCancelled()) {
            cir.setReturnValue((Object)false);
        }
    }

    @ModifyExpressionValue(method={"handleBlockBreaking"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerEntity;isUsingItem()Z")})
    private boolean handleBlockBreakingHook2(boolean original) {
        return !a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.cfr_renamed_6() && original;
    }

    @Inject(method={"doAttack"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/network/ClientPlayerInteractionManager;attackBlock(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/Direction;)Z")}, cancellable=true)
    private void doAttackHook(CallbackInfoReturnable<Boolean> cir, @Local class_1799 itemStack) {
        if (a0SCwvAms6DZ9Ao0s0KdT2W4LI8A3v5W.sQ5jsnD505XSZFQ4wTz8UvXtgvaSNNhy() && (itemStack.method_31574(class_1802.field_8301) || itemStack.method_31574(class_1802.field_8281))) {
            this.field_1771 = 0;
            cir.setReturnValue((Object)false);
        }
    }

    @Redirect(method={"handleInputEvents"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;handleBlockBreaking(Z)V"))
    private void handleInputEventsHook$isPressed(class_310 instance, boolean breaking) {
        this.method_1590(this.acceptBlockBreaking(breaking));
    }

    @Inject(method={"setScreen"}, at={@At(value="NEW", target="(Lnet/minecraft/text/Text;Z)Lnet/minecraft/client/gui/screen/DeathScreen;")}, cancellable=true)
    public void deathScreenHook(class_437 screen, CallbackInfo ci) {
        this.invoke(new izYjBFodU60gr2apTFxPJvlcprGlywjG(), ci);
    }
}

