/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.internal;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1675;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_5636;
import net.minecraft.class_5912;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9779;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2.QIb4dlOBe7ifKFqsCrNzBC3xri5IBeCr;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.WKKzQ9NBbjSU5ibGVeh2NdDSgmcmYuFc;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.rpjRaPjCZMa5v1bzZhPkVQoQoQC8BBkN;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.EknXtGN7Q5xVgliwtaFXrFN9cxEdfDI2;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi._8z7ox5xwv6HsVjPvWD0kak5lCwNhqkUV;
import org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l._2c7suCFiah96klqmSM0t60HnaPx9EyWq;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.Zkvkjy8Id6O0CGQ7WPuSPtfFehZcaRpp;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.ngfi3id7U6Jbq7z3UvjG7EFUxzcE3eFZ;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.wrtijlpDgq1PPiLk9p9kXzH2fZkFYetr;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ._97g3timXLMTqrZUYC1aN5PJqqs6UwhXq;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb.BdJZJa5FlR7J5afswGbDWzlqUuz1vj2S;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_757.class})
public abstract class MixinGameRenderer
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T,
EventSubscriber {
    @Shadow
    private float field_3999;
    @Shadow
    private float field_4025;
    @Shadow
    private boolean field_4001;
    @Shadow
    private float field_4019;
    @Shadow
    @Final
    class_310 field_4015;

    @ModifyExpressionValue(method={"findCrosshairTarget"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/Entity;raycast(DFZ)Lnet/minecraft/util/hit/HitResult;")})
    private class_239 findCrosshairTargetHook(class_239 result, class_1297 camera, double blockInteractionRange, double entityInteractionRange, float tickDelta) {
        if (camera != this.field_4015.field_1724) {
            return result;
        }
        QIb4dlOBe7ifKFqsCrNzBC3xri5IBeCr event = this.invoke(new QIb4dlOBe7ifKFqsCrNzBC3xri5IBeCr(result, camera, blockInteractionRange, entityInteractionRange, tickDelta));
        return event.ESAbPHZ00KFPGl7BPhnAyDqvwHnxyzVh();
    }

    @Inject(method={"loadPrograms"}, at={@At(value="RETURN")})
    private void loadShaderPrograms(class_5912 factory, CallbackInfo ci) {
        Zkvkjy8Id6O0CGQ7WPuSPtfFehZcaRpp.FwgDUjeYUsEU6TNrxAFhMl24h0xebV2M.RhxwpMd5yWb67vgnsctktEr1SUrsi6TD(factory);
    }

    @Inject(method={"getFov"}, at={@At(value="RETURN")}, cancellable=true)
    private void getFovHook(class_4184 camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Double> cir) {
        WKKzQ9NBbjSU5ibGVeh2NdDSgmcmYuFc event = this.invoke(new WKKzQ9NBbjSU5ibGVeh2NdDSgmcmYuFc((Double)cir.getReturnValue()));
        cir.setReturnValue((Object)event.D0g465b8mhRmQwd40bXCoRVARLheK5zs());
    }

    @Shadow
    public abstract void method_3192(class_9779 var1, boolean var2);

    @Redirect(method={"findCrosshairTarget"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/projectile/ProjectileUtil;raycast(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;D)Lnet/minecraft/util/hit/EntityHitResult;"))
    private class_3966 findCrosshairTargetHook(class_1297 camera, class_243 min, class_243 max, class_238 box, Predicate<class_1297> predicate, double maxDistance) {
        return class_1675.method_18075((class_1297)camera, (class_243)min, (class_243)max, (class_238)box, entity -> !_2c7suCFiah96klqmSM0t60HnaPx9EyWq.IcATL1pUNwkUMHzsh9PjhreAmg4MPvVU() && !entity.method_7325() && entity.method_5863() && !_2c7suCFiah96klqmSM0t60HnaPx9EyWq.Ai5GN7PTdxdLdko5qLmgJSt79Kxt5Bm3(entity), (double)maxDistance);
    }

    @Inject(method={"bobView"}, at={@At(value="HEAD")}, cancellable=true)
    private void bobView(class_4587 matrices, float tickDelta, CallbackInfo ci) {
        this.invoke(new o8G00ENlKYiAGGCi7fD0AD2V38ItXj9a(), ci);
        if (ci.isCancelled()) {
            return;
        }
        rpjRaPjCZMa5v1bzZhPkVQoQoQC8BBkN.Npew5hEDxS9WEAOKGGqJcDIkSGpvzrTt(matrices, tickDelta, ci);
    }

    @Inject(method={"renderWorld"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;renderHand(Lnet/minecraft/client/render/Camera;FLorg/joml/Matrix4f;)V", shift=At.Shift.AFTER)})
    private void postRenderWorld(class_9779 renderTickCounter, CallbackInfo ci) {
        if (MixinGameRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 != null && MixinGameRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null) {
            _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().bwEmrDnsyfDEVWklw1PjrvbUN9ZrHHgH().qD1GEofLim50O0yH9WJcN1xMiDLhP5hh();
            return;
        }
    }

    @Redirect(method={"renderHand"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;getFov(Lnet/minecraft/client/render/Camera;FZ)D"))
    private double handGetFovHook(class_757 renderer, class_4184 camera, float tickDelta, boolean changingFov) {
        class_5636 cameraSubmersionType;
        if (this.field_4001) {
            return 90.0;
        }
        double d = 70.0;
        if (changingFov) {
            d = ((Integer)this.field_4015.field_1690.method_41808().method_41753()).intValue();
            d *= (double)class_3532.method_16439((float)tickDelta, (float)this.field_3999, (float)this.field_4019);
        }
        if (camera.method_19331() instanceof class_1309 && ((class_1309)camera.method_19331()).method_29504()) {
            float f = Math.min((float)((class_1309)camera.method_19331()).field_6213 + tickDelta, 20.0f);
            d /= (double)((1.0f - 500.0f / (f + 500.0f)) * 2.0f + 1.0f);
        }
        if ((cameraSubmersionType = camera.method_19334()) == class_5636.field_27885 || cameraSubmersionType == class_5636.field_27886) {
            d *= class_3532.method_16436((double)((Double)this.field_4015.field_1690.method_42454().method_41753()), (double)1.0, (double)0.8571428656578064);
        }
        return d;
    }

    @Inject(method={"getBasicProjectionMatrix"}, at={@At(value="TAIL")}, cancellable=true)
    public void matrixHook(double d, CallbackInfoReturnable<Matrix4f> cir) {
        class_4587 stack = new class_4587();
        stack.method_23760().method_23761().identity();
        stack.method_23760().method_23761().mul((Matrix4fc)new Matrix4f().setPerspective((float)(d * 0.01745329238474369), _8z7ox5xwv6HsVjPvWD0kak5lCwNhqkUV.HgZDCck4IVesnWUBjaXqB2yOonplYz0Z(), 0.05f, this.field_4025 * 4.0f));
        cir.setReturnValue((Object)stack.method_23760().method_23761());
    }

    @Inject(method={"tiltViewWhenHurt"}, at={@At(value="HEAD")}, cancellable=true)
    private void tiltViewWhenHurt(CallbackInfo ci) {
        this.invoke(new EknXtGN7Q5xVgliwtaFXrFN9cxEdfDI2(), ci);
    }

    @Inject(method={"showFloatingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void showFloatingItem(class_1799 floatingItem, CallbackInfo ci) {
        if (floatingItem != null && floatingItem.method_31574(class_1802.field_8288)) {
            this.invoke(new ngfi3id7U6Jbq7z3UvjG7EFUxzcE3eFZ(), ci);
        }
    }

    @Inject(method={"renderWorld"}, at={@At(value="FIELD", target="Lnet/minecraft/client/render/GameRenderer;renderHand:Z", opcode=180, ordinal=0)})
    private void renderTransformedWorldHook(class_9779 renderTickCounter, CallbackInfo ci) {
        P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_16011().method_15396("PhobosLite-Game");
        class_4184 camera = MixinGameRenderer.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1773.method_19418();
        class_4587 matrixStack = new class_4587();
        RenderSystem.getModelViewStack().pushMatrix().mul((Matrix4fc)matrixStack.method_23760().method_23761());
        matrixStack.method_22907(class_7833.field_40714.rotationDegrees(camera.method_19329()));
        matrixStack.method_22907(class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        RenderSystem.applyModelViewMatrix();
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.feagZTJV0b1ETKgfUthTwp5BU9EvyLrf.set((Matrix4fc)RenderSystem.getProjectionMatrix());
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.gLxEFteOSvzsBkMo91QHS0sZfUrlnldU.set((Matrix4fc)RenderSystem.getModelViewMatrix());
        qeCPMEzHtR7BwaQvMN4WXb78hJssEIMJ.jrUNjljFx8cvUow5IRs07XpZ5AtWNv20.set((Matrix4fc)matrixStack.method_23760().method_23761());
        _97g3timXLMTqrZUYC1aN5PJqqs6UwhXq.MWSRVOIRJQ48Clsh4hkIMJMThwIKvrGp();
        this.invoke(new wrtijlpDgq1PPiLk9p9kXzH2fZkFYetr(matrixStack, renderTickCounter.method_60637(false)));
        RenderSystem.getModelViewStack().popMatrix();
        RenderSystem.applyModelViewMatrix();
        P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_16011().method_15407();
    }

    @Inject(method={"render"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/WorldRenderer;drawEntityOutlinesFramebuffer()V", shift=At.Shift.AFTER)})
    private void renderHook0(class_9779 tickCounter, boolean tick, CallbackInfo ci) {
        this.invoke(new BdJZJa5FlR7J5afswGbDWzlqUuz1vj2S(tickCounter.method_60637(tick)));
    }
}

