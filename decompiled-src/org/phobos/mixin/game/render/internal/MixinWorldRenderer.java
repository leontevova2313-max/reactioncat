/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.internal;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.class_1297;
import net.minecraft.class_1920;
import net.minecraft.class_1959;
import net.minecraft.class_2338;
import net.minecraft.class_2394;
import net.minecraft.class_243;
import net.minecraft.class_279;
import net.minecraft.class_286;
import net.minecraft.class_287;
import net.minecraft.class_289;
import net.minecraft.class_290;
import net.minecraft.class_2902;
import net.minecraft.class_291;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4599;
import net.minecraft.class_4618;
import net.minecraft.class_5819;
import net.minecraft.class_638;
import net.minecraft.class_703;
import net.minecraft.class_746;
import net.minecraft.class_757;
import net.minecraft.class_761;
import net.minecraft.class_765;
import net.minecraft.class_7833;
import net.minecraft.class_898;
import net.minecraft.class_9779;
import net.minecraft.class_9801;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.phobos.secure.233YlkA2dSoXPmZOG4uyJFB5W5MKs63U.QeJxrbuye3oxq64QmdlqnPRtGWvVxhFU;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.AfDCSdUoCnHMu8x6xjG2vpxHDldKDZf4;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.heIDGP8t1rXOCEc4vk7o4zRyIfgtESXr;
import org.phobos.secure.3BztNC70MwSEQNTzZ4lvFGqznxpf9J2W.h8XsoosExKicgnRCZfFzsLmTTsiGoQx4;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.s7DAjgNhRmduZVDyDddmFhhDDl4kBube;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.l0BD6hElCpemYaEmYzWvFPb4yTaVjQpo;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.MarKXPPdUWsxkSNhUnwQb4exkbflaSPJ;
import org.phobos.secure.N8Mbvei5jZJniHivyFx9alrtSLUznZLt.A2xG92loccN0hDhNDq0L7d45AY6WY7M0;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.flZ2QlW5XtZiHivkR5o1IsRUejidI60Y;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.rlALIrCrf8zIwYOkNPPXoyDF1CpwGUv8;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ.rbz4rDZAhaos0HCAMLOi2d7yYcVG8sks;
import org.phobos.secure.SFDLLxag6BrgT2xFaaiwM4KXMC6N6SbP.tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.KkXfGTf6Hg38oHUv0Kq6PXTdsefyajaN;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.jBamnY2bCSDeqHNITqpKmz02DojJcc8l.jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC;
import org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf.BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk;
import org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ._1ypehC3kL0JSsCv0RrAQqhOm13XRUYjR;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_761.class}, priority=0x7FFFFFFF)
public abstract class MixinWorldRenderer
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T,
EventSubscriber {
    @Shadow
    @Final
    private float[] field_20795;
    @Shadow
    @Final
    private static class_2960 field_20798;
    @Shadow
    @Final
    private class_310 field_4088;
    @Shadow
    @Final
    private static class_2960 field_20797;
    @Shadow
    @Final
    private float[] field_20794;
    @Shadow
    private int field_4073;
    @Unique
    private static final flZ2QlW5XtZiHivkR5o1IsRUejidI60Y[] TEXTURE_FACES;
    @Shadow
    @Final
    private class_4599 field_20951;
    @Shadow
    @Final
    private class_898 field_4109;
    @Shadow
    @Nullable
    private class_291 field_4087;

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/gl/PostEffectProcessor;render(F)V", ordinal=0))
    private void replaceShaderHook(class_279 instance, float tickDelta) {
        l0BD6hElCpemYaEmYzWvFPb4yTaVjQpo module = l0BD6hElCpemYaEmYzWvFPb4yTaVjQpo.cfr_renamed_36();
        if (module == null) {
            instance.method_1258(tickDelta);
            return;
        }
        KkXfGTf6Hg38oHUv0Kq6PXTdsefyajaN shader = module.ZMsxKElB6pwbzdP7S3gp12vpJNdzEo1H.getValue();
        if (module.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && MixinWorldRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null) {
            if (_5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().bwEmrDnsyfDEVWklw1PjrvbUN9ZrHHgH().fPF5qROudQSlT3Ai5pI4Ez0AAdJvm7Tg()) {
                return;
            }
            _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().bwEmrDnsyfDEVWklw1PjrvbUN9ZrHHgH().Wqm73MIWV2F6nxcfmM65hzHi8S297isn(shader, _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().bwEmrDnsyfDEVWklw1PjrvbUN9ZrHHgH().iyqexBBx1LPZjSOrLwozr9tTxzOXyxDA(shader));
            return;
        }
        instance.method_1258(tickDelta);
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void preRenderHook(class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, class_757 gameRenderer, class_765 lightmapTextureManager, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo ci) {
        this.invoke(new QeJxrbuye3oxq64QmdlqnPRtGWvVxhFU(camera));
    }

    @Redirect(method={"render"}, at=@At(value="NEW", target="()Lnet/minecraft/client/util/math/MatrixStack;"))
    private class_4587 renderMatrixHook() {
        class_4587 matrices = new class_4587();
        class_243 pos = MixinWorldRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418().method_19326();
        double cameraX = pos.method_10216();
        double cameraY = pos.method_10214();
        double cameraZ = pos.method_10215();
        heIDGP8t1rXOCEc4vk7o4zRyIfgtESXr.HLljn9F4P3EOO3oslFs0ktXlc3iR6WfW(this.field_4109, matrices, cameraX, cameraY, cameraZ, P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_60646().method_60637(false));
        return matrices;
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;renderEntity(Lnet/minecraft/entity/Entity;DDDFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;)V"))
    private void renderHook(class_761 instance, class_1297 entity, double cameraX, double cameraY, double cameraZ, float tickDelta, class_4587 matrices, class_4597 vertexConsumers) {
        zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv fakePlayer;
        float jitter = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.AekSpQ3RY5j8K9090C81vP06Gib6su8V(tickDelta);
        boolean rotations = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.dwUCEhoQBQX1Hun1W4TEMsmkuq71BvzY();
        boolean position = jz9kcBxDSHKrXSVT9yM0qxw3Dz1rVsAC.SECzLQRZ88n1cTyPN1IaGyGC3Kx8N7Gy();
        double x = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)entity.field_6038, (double)entity.method_23317());
        double y = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)entity.field_5971, (double)entity.method_23318());
        double z = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)entity.field_5989, (double)entity.method_23321());
        float yaw = class_3532.method_16439((float)(rotations ? jitter : tickDelta), (float)entity.field_5982, (float)entity.method_36454());
        if (entity instanceof class_746 && BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.cfr_renamed_37 && BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0 != null) {
            double x1 = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.field_6038, (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.method_23317());
            double y1 = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.field_5971, (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.method_23318());
            double z1 = class_3532.method_16436((double)(position ? (double)jitter : (double)tickDelta), (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.field_5989, (double)BkTqXrLwGZjuF82LAgl4RpMXVDgvUxuk.Ls9tghL0IlyfU7zLqrbObjrepbGJNkp0.method_23321());
            this.field_4109.method_3954(entity, x1 - cameraX, y1 - cameraY, z1 - cameraZ, yaw, tickDelta, matrices, vertexConsumers, this.field_4109.method_23839(entity, tickDelta));
        }
        if (entity instanceof zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv && !(fakePlayer = (zU5j8KNF3Bfq46fthFnlbVKCmoUqVdHv)entity).Ff4VzbZMLo6xYKbRM0gjo2mfjq5D2nbz()) {
            tickDelta = 0.0f;
        }
        this.field_4109.method_3954(entity, x - cameraX, y - cameraY, z - cameraZ, yaw, tickDelta, matrices, vertexConsumers, this.field_4109.method_23839(entity, tickDelta));
    }

    @Inject(method={"renderWeather"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderWeather(class_765 manager, float tickDelta, double cameraX, double cameraY, double cameraZ, CallbackInfo ci) {
        ci.cancel();
        if (h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.pgxaiLI5E6CE3zvTcBhzKrCfvXqCvUTc()) {
            return;
        }
        assert (this.field_4088 != null && this.field_4088.field_1687 != null);
        float f = this.field_4088.field_1687.method_8430(tickDelta);
        if (!(f <= 0.0f)) {
            manager.method_3316();
            class_638 world = this.field_4088.field_1687;
            int i = class_3532.method_15357((double)cameraX);
            int j = class_3532.method_15357((double)cameraY);
            int k = class_3532.method_15357((double)cameraZ);
            class_289 tessellator = class_289.method_1348();
            class_287 bufferBuilder = null;
            RenderSystem.disableCull();
            RenderSystem.enableBlend();
            RenderSystem.enableDepthTest();
            int l = 5;
            if (class_310.method_1517()) {
                l = 10;
            }
            RenderSystem.depthMask((boolean)class_310.method_29611());
            int m = -1;
            float g = (float)this.field_4073 + tickDelta;
            RenderSystem.setShader(class_757::method_34546);
            class_2338.class_2339 mutable = new class_2338.class_2339();
            int n = k - l;
            while (true) {
                if (n <= k + l) {
                } else {
                    if (m >= 0) {
                        class_286.method_43433((class_9801)bufferBuilder.method_60800());
                    }
                    RenderSystem.enableCull();
                    RenderSystem.disableBlend();
                    manager.method_3315();
                    break;
                }
                for (int o = i - l; o <= i + l; ++o) {
                    int ac;
                    double y;
                    float h;
                    int t;
                    int p = (n - k + 16) * 32 + o - i + 16;
                    double d = (double)this.field_20794[p] * 0.5;
                    double e = (double)this.field_20795[p] * 0.5;
                    mutable.method_10102((double)o, cameraY, (double)n);
                    class_1959 biome = (class_1959)world.method_23753((class_2338)mutable).comp_349();
                    if (!h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.cfr_renamed_25() && !biome.method_48163()) continue;
                    int q = h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.Upe2R9xjlSoNoO0YdYqun0UuZ9sGUyI2() ? -64 : world.method_8624(class_2902.class_2903.field_13197, o, n);
                    int r = j - l;
                    int s = j + l;
                    if (r < q) {
                        r = q;
                    }
                    if (s < q) {
                        s = q;
                    }
                    if ((t = q) < j) {
                        t = j;
                    }
                    if (r == s) continue;
                    class_5819 random = class_5819.method_43049((long)((long)o * (long)o * 3121L + (long)o * 45238971L ^ (long)n * (long)n * 418711L + (long)n * 13761L));
                    mutable.method_10103(o, r, n);
                    class_1959.class_1963 precipitation = h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.SPUgJnWHV4nuJuJD3jYuCqqXym1PnmQX(biome.method_48162((class_2338)mutable));
                    if (precipitation == class_1959.class_1963.field_9382) {
                        if (m != 0) {
                            if (m >= 0) {
                                class_286.method_43433((class_9801)bufferBuilder.method_60800());
                            }
                            m = 0;
                            RenderSystem.setShaderTexture((int)0, (class_2960)field_20797);
                            bufferBuilder = tessellator.method_60827(class_293.class_5596.field_27382, class_290.field_1584);
                        }
                        int u = this.field_4073 & 0x1FFFF;
                        int v = o * o * 3121 + o * 45238971 + n * n * 418711 + n * 13761 & 0xFF;
                        h = 3.0f + random.method_43057();
                        float w = -((float)(u + v) + tickDelta) / 32.0f * h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(h);
                        float x = w % 32.0f;
                        y = (double)o + 0.5 - cameraX;
                        double z = (double)n + 0.5 - cameraZ;
                        float aa = (float)Math.sqrt(y * y + z * z) / (float)l;
                        float ab = ((1.0f - aa * aa) * 0.5f + 0.5f) * f;
                        mutable.method_10103(o, t, n);
                        ac = MixinWorldRenderer.method_23794((class_1920)world, (class_2338)mutable);
                        bufferBuilder.method_22912((float)((double)o - cameraX - d + 0.5), (float)((double)s - cameraY), (float)((double)n - cameraZ - e + 0.5)).method_22913(0.0f, (float)r * 0.25f + x).method_22915(1.0f, 1.0f, 1.0f, ab).method_60803(ac);
                        bufferBuilder.method_22912((float)((double)o - cameraX + d + 0.5), (float)((double)s - cameraY), (float)((double)n - cameraZ + e + 0.5)).method_22913(1.0f, (float)r * 0.25f + x).method_22915(1.0f, 1.0f, 1.0f, ab).method_60803(ac);
                        bufferBuilder.method_22912((float)((double)o - cameraX + d + 0.5), (float)((double)r - cameraY), (float)((double)n - cameraZ + e + 0.5)).method_22913(1.0f, (float)s * 0.25f + x).method_22915(1.0f, 1.0f, 1.0f, ab).method_60803(ac);
                        bufferBuilder.method_22912((float)((double)o - cameraX - d + 0.5), (float)((double)r - cameraY), (float)((double)n - cameraZ - e + 0.5)).method_22913(0.0f, (float)s * 0.25f + x).method_22915(1.0f, 1.0f, 1.0f, ab).method_60803(ac);
                        continue;
                    }
                    if (precipitation != class_1959.class_1963.field_9383) continue;
                    if (m != 1) {
                        if (m == 0) {
                            class_286.method_43433((class_9801)bufferBuilder.method_60800());
                        }
                        m = 1;
                        RenderSystem.setShaderTexture((int)0, (class_2960)field_20798);
                        bufferBuilder = tessellator.method_60827(class_293.class_5596.field_27382, class_290.field_1584);
                    }
                    float ad = -((float)(this.field_4073 & 0x1FF) + tickDelta) / (512.0f / h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.xX5DZu0SdfTbTgkdw0k4dwMGzvTJXJMm());
                    float ae = (float)(random.method_43058() + (double)g * 0.01 * (double)((float)random.method_43059()));
                    h = (float)(random.method_43058() + (double)(g * (float)random.method_43059()) * 0.001);
                    double af = (double)o + 0.5 - cameraX;
                    y = (double)n + 0.5 - cameraZ;
                    float ag = (float)Math.sqrt(af * af + y * y) / (float)l;
                    float ah = ((1.0f - ag * ag) * 0.3f + 0.5f) * f;
                    mutable.method_10103(o, t, n);
                    int ai = MixinWorldRenderer.method_23794((class_1920)world, (class_2338)mutable);
                    int aj = ai >> 16 & 0xFFFF;
                    ac = ai & 0xFFFF;
                    int ak = (aj * 3 + 240) / 4;
                    int al = (ac * 3 + 240) / 4;
                    bufferBuilder.method_22912((float)((double)o - cameraX - d + 0.5), (float)((double)s - cameraY), (float)((double)n - cameraZ - e + 0.5)).method_22913(0.0f + ae, (float)r * 0.25f + ad + h).method_22915(1.0f, 1.0f, 1.0f, ah).method_22921(al, ak);
                    bufferBuilder.method_22912((float)((double)o - cameraX + d + 0.5), (float)((double)s - cameraY), (float)((double)n - cameraZ + e + 0.5)).method_22913(1.0f + ae, (float)r * 0.25f + ad + h).method_22915(1.0f, 1.0f, 1.0f, ah).method_22921(al, ak);
                    bufferBuilder.method_22912((float)((double)o - cameraX + d + 0.5), (float)((double)r - cameraY), (float)((double)n - cameraZ + e + 0.5)).method_22913(1.0f + ae, (float)s * 0.25f + ad + h).method_22915(1.0f, 1.0f, 1.0f, ah).method_22921(al, ak);
                    bufferBuilder.method_22912((float)((double)o - cameraX - d + 0.5), (float)((double)r - cameraY), (float)((double)n - cameraZ - e + 0.5)).method_22913(0.0f + ae, (float)s * 0.25f + ad + h).method_22915(1.0f, 1.0f, 1.0f, ah).method_22921(al, ak);
                }
                ++n;
            }
        }
    }

    @Shadow
    public abstract void method_3279();

    @ModifyArg(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;setupTerrain(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/Frustum;ZZ)V"), index=3)
    private boolean renderHook(boolean hasForcedFrustum) {
        return hasForcedFrustum || TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7();
    }

    static {
        TEXTURE_FACES = new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y[]{new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.0f, 0.0f, 0.33333334f, 0.5f), new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.33333334f, 0.5f, 0.6666667f, 1.0f), new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.6666667f, 0.0f, 1.0f, 0.5f), new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.33333334f, 0.0f, 0.6666667f, 0.5f), new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.6666667f, 0.5f, 1.0f, 1.0f), new flZ2QlW5XtZiHivkR5o1IsRUejidI60Y(0.0f, 0.5f, 0.33333334f, 1.0f)};
    }

    @Inject(method={"drawBlockOutline"}, at={@At(value="HEAD")}, cancellable=true)
    private void drawBlockOutlineHook(CallbackInfo ci) {
        this.invoke(new _1ypehC3kL0JSsCv0RrAQqhOm13XRUYjR());
        this.invoke(new MarKXPPdUWsxkSNhUnwQb4exkbflaSPJ(), ci);
    }

    @Redirect(method={"tickRainSplashing"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/biome/Biome;getPrecipitation(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome$Precipitation;"))
    private class_1959.class_1963 getPrecipitationHook2(class_1959 biome, class_2338 blockPos) {
        return h8XsoosExKicgnRCZfFzsLmTTsiGoQx4.SPUgJnWHV4nuJuJD3jYuCqqXym1PnmQX(biome.method_48162(blockPos));
    }

    @Inject(method={"renderSky"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderSkyHook(Matrix4f matrix4f, Matrix4f projectionMatrix, float tickDelta, class_4184 camera, boolean thickFog, Runnable fogCallback, CallbackInfo ci) {
        rlALIrCrf8zIwYOkNPPXoyDF1CpwGUv8 event = this.invoke(new rlALIrCrf8zIwYOkNPPXoyDF1CpwGUv8());
        if (event.isCancelled() && this.field_4087 != null) {
            ci.cancel();
            class_4587 matrixStack = new class_4587();
            matrixStack.method_34425(matrix4f);
            float r = event.yclwE9ekbGp1ivgXQTpk4iJkluKiInrO().x;
            float g = event.yclwE9ekbGp1ivgXQTpk4iJkluKiInrO().y;
            float b = event.yclwE9ekbGp1ivgXQTpk4iJkluKiInrO().z;
            switch (event.eHwtUAPvQcaGgIVrT1SSdXNGPMLaT0gV()) {
                case Texture: {
                    if (event.OGNuhS02LZl2fNru7xNl7ilxFbNHlWrj() && !tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5.yyraQStIALTzcqSdzTgkuwVbUkYRbna6() && !AfDCSdUoCnHMu8x6xjG2vpxHDldKDZf4.iU1E3Gxao64mLPvlg3S70vDxckAcYI4Q()) {
                        return;
                    }
                    RenderSystem.depthMask((boolean)false);
                    RenderSystem.enableBlend();
                    RenderSystem.setShader(class_757::method_34542);
                    matrixStack.method_22903();
                    class_289 tessellator = class_289.method_1348();
                    class_287 bufferBuilder = tessellator.method_60827(class_293.class_5596.field_27382, class_290.field_1585);
                    if (event.OGNuhS02LZl2fNru7xNl7ilxFbNHlWrj()) {
                        if (AfDCSdUoCnHMu8x6xjG2vpxHDldKDZf4.iU1E3Gxao64mLPvlg3S70vDxckAcYI4Q()) {
                            AfDCSdUoCnHMu8x6xjG2vpxHDldKDZf4.fRM6t2Rm0TXnTMYmiAJK2QuevTSjR9S7();
                        } else {
                            tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5.ewSf4B2qHowVBkMe5FW729v1UDTPok82();
                        }
                    } else {
                        RenderSystem.setShaderTexture((int)0, (class_2960)tk8Se4ha930LVrNwvVjQ74v2nP9wI4p5.ZYY6qMrX983B3oflEzHfVFKH7p84ft5b);
                    }
                    RenderSystem.setShaderColor((float)r, (float)g, (float)b, (float)1.0f);
                    for (int face = 0; face < 6; ++face) {
                        flZ2QlW5XtZiHivkR5o1IsRUejidI60Y tex = TEXTURE_FACES[face];
                        matrixStack.method_22903();
                        switch (face) {
                            case 1: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(90.0f));
                                break;
                            }
                            case 2: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(-90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(180.0f));
                                break;
                            }
                            case 3: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(180.0f));
                                break;
                            }
                            case 4: {
                                matrixStack.method_22907(class_7833.field_40718.rotationDegrees(90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(-90.0f));
                                break;
                            }
                            case 5: {
                                matrixStack.method_22907(class_7833.field_40718.rotationDegrees(-90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(90.0f));
                                break;
                            }
                        }
                        Matrix4f matrix4f2 = matrixStack.method_23760().method_23761();
                        bufferBuilder.method_22918(matrix4f2, -100.0f, -100.0f, -100.0f).method_22913(tex.cfr_renamed_38(), tex.hGEgF2N28yIvj8pVCwcWH9ztGOBfpMSM());
                        bufferBuilder.method_22918(matrix4f2, -100.0f, -100.0f, 100.0f).method_22913(tex.cfr_renamed_38(), tex.TdXqlk2CtWiZcLwGVOZCEPfrbeSNkeQd());
                        bufferBuilder.method_22918(matrix4f2, 100.0f, -100.0f, 100.0f).method_22913(tex.zuZLRvLLK9ln47KdlGsciwrSYDwgRGbY(), tex.TdXqlk2CtWiZcLwGVOZCEPfrbeSNkeQd());
                        bufferBuilder.method_22918(matrix4f2, 100.0f, -100.0f, -100.0f).method_22913(tex.zuZLRvLLK9ln47KdlGsciwrSYDwgRGbY(), tex.hGEgF2N28yIvj8pVCwcWH9ztGOBfpMSM());
                        matrixStack.method_22909();
                    }
                    s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(bufferBuilder);
                    matrixStack.method_22909();
                    RenderSystem.depthMask((boolean)true);
                    RenderSystem.disableBlend();
                    RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    break;
                }
                case Shader: {
                    qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.h36MtxA26fowaqmuziAaEhOEM02kwVLO.gHJwmeSUBBEgBfahMf2YOBSM7U6DOYqf();
                    qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.h36MtxA26fowaqmuziAaEhOEM02kwVLO.Sw8PvTbjfXxlPwTcmGerEhgRHUxTvTDt();
                    matrixStack.method_22903();
                    class_289 tessellator = class_289.method_1348();
                    class_287 bufferBuilder = tessellator.method_60827(class_293.class_5596.field_27382, class_290.field_1577);
                    for (int face = 0; face < 6; ++face) {
                        matrixStack.method_22903();
                        switch (face) {
                            case 1: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(90.0f));
                                break;
                            }
                            case 2: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(-90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(180.0f));
                                break;
                            }
                            case 3: {
                                matrixStack.method_22907(class_7833.field_40714.rotationDegrees(180.0f));
                                break;
                            }
                            case 4: {
                                matrixStack.method_22907(class_7833.field_40718.rotationDegrees(90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(-90.0f));
                                break;
                            }
                            case 5: {
                                matrixStack.method_22907(class_7833.field_40718.rotationDegrees(-90.0f));
                                matrixStack.method_22907(class_7833.field_40716.rotationDegrees(90.0f));
                                break;
                            }
                        }
                        Matrix4f matrix4f2 = matrixStack.method_23760().method_23761();
                        bufferBuilder.method_22918(matrix4f2, -100.0f, -100.0f, -100.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f).method_22913(0.0f, 0.0f).method_22914(0.0f, -1.0f, 0.0f);
                        bufferBuilder.method_22918(matrix4f2, -100.0f, -100.0f, 100.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f).method_22913(0.0f, 0.0f).method_22914(0.0f, -1.0f, 0.0f);
                        bufferBuilder.method_22918(matrix4f2, 100.0f, -100.0f, 100.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f).method_22913(0.0f, 0.0f).method_22914(0.0f, -1.0f, 0.0f);
                        bufferBuilder.method_22918(matrix4f2, 100.0f, -100.0f, -100.0f).method_22915(1.0f, 1.0f, 1.0f, 1.0f).method_22913(0.0f, 0.0f).method_22914(0.0f, -1.0f, 0.0f);
                        matrixStack.method_22909();
                    }
                    s7DAjgNhRmduZVDyDddmFhhDDl4kBube.lzmTeFBdOdGqc7rwcqcC5KLIyU7EXR8p(bufferBuilder);
                    matrixStack.method_22909();
                    break;
                }
            }
        }
    }

    @Shadow
    public static int method_23794(class_1920 world, class_2338 pos) {
        return 0;
    }

    @Inject(method={"reload()V"}, at={@At(value="RETURN")})
    private void reloadHook(CallbackInfo ci) {
        ((A2xG92loccN0hDhNDq0L7d45AY6WY7M0)A2xG92loccN0hDhNDq0L7d45AY6WY7M0.x0bQe1EhRqkYL9sw9WtrqoiPsS4xioGY.invoker()).baOMT4FlBbMfeW7zKglB4JEP6JSc2ln3((class_761)this);
    }

    @Inject(method={"spawnParticle(Lnet/minecraft/particle/ParticleEffect;ZZDDDDDD)Lnet/minecraft/client/particle/Particle;"}, at={@At(value="HEAD")}, cancellable=true)
    private void spawnHook(class_2394 parameters, boolean alwaysSpawn, boolean canSpawnOnMinimal, double x, double y, double z, double velocityX, double velocityY, double velocityZ, CallbackInfoReturnable<class_703> cir) {
        this.invoke(new rbz4rDZAhaos0HCAMLOi2d7yYcVG8sks(parameters.method_10295()), (CallbackInfo)cir);
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/OutlineVertexConsumerProvider;setColor(IIII)V"))
    private void renderHook(class_4618 instance, int red, int green, int blue, int alpha, @Local class_1297 entity) {
        l0BD6hElCpemYaEmYzWvFPb4yTaVjQpo module = l0BD6hElCpemYaEmYzWvFPb4yTaVjQpo.cfr_renamed_36();
        if (module == null) {
            instance.method_23286(red, green, blue, alpha);
            return;
        }
        if (module.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && MixinWorldRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null) {
            Color abstractColor = module.eW91Pqtye9IeNpiQ5NuTAweByp4N6Uie(entity);
            instance.method_23286(abstractColor.getRed(), abstractColor.getGreen(), abstractColor.getBlue(), abstractColor.getAlpha());
            return;
        }
        instance.method_23286(red, green, blue, alpha);
    }

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void renderHook1(class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, class_757 gameRenderer, class_765 lightmapTextureManager, Matrix4f matrix4f, Matrix4f matrix4f2, CallbackInfo ci) {
        P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_16011().method_15396("PhobosLite-World");
        class_4587 matrixStack = new class_4587();
        matrixStack.method_34425(matrix4f);
        qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh event = qc3lxk9Wtu6YW6bcD2hzO95RxPhDCKJh.cfr_renamed_39();
        event.cfr_renamed_40(tickCounter.method_60637(false));
        event.AQhEbNuaWJ97hYuaWslNb7DP685Jz52a(matrixStack);
        event.yHw81zgoWFJdjfv1zZi9OFJkybqU9CRf(camera);
        event.BWxiEMzBjTuL0SODMhacyv1ICjyL5drg(matrix4f);
        event.Dr5uZsmkGbNx9P1yEtG211QMeiTmJngP(matrix4f2);
        this.invoke(event);
        P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_16011().method_15407();
    }
}

