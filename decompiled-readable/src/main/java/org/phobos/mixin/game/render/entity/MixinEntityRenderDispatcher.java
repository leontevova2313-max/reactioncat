/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import net.minecraft.class_1297;
import net.minecraft.class_4184;
import net.minecraft.class_4538;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import net.minecraft.class_898;
import org.earthhack.ducks.IEntityRenderDispatcher;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Quaternionf;
import org.phobos.secure.group026.ShaderModule;
import org.phobos.secure.group047.NoRenderModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_898.class})
public abstract class MixinEntityRenderDispatcher
implements EventSubscriber,
IEntityRenderDispatcher,
SecureInterface0134 {
    @Shadow
    public class_4184 field_4686;

    @Shadow
    public abstract <T extends class_1297> class_897<? super T> method_3953(T var1);

    @Inject(method={"renderFire"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderFireHook(class_4587 matrices, class_4597 vertexConsumers, class_1297 entity, Quaternionf rotation, CallbackInfo ci) {
        if (!ShaderModule.PxT46DtrmVgcN49ZkBTSDsFPlYoRxMP8(entity)) {
            return;
        }
        ci.cancel();
    }

    @Override
    public double renderPosY() {
        return this.field_4686.method_19326().field_1351;
    }

    @Inject(method={"render"}, at={@At(value="HEAD")}, cancellable=true)
    public <E extends class_1297> void render(E entity, double x, double y, double z, float yaw, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, int light, CallbackInfo ci) {
        if (entity != null) {
            return;
        }
        ci.cancel();
    }

    @Override
    public double renderPosX() {
        return this.field_4686.method_19326().field_1352;
    }

    @Override
    public double renderPosZ() {
        return this.field_4686.method_19326().field_1350;
    }

    @Inject(method={"renderShadow"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderShadowHook(class_4587 matrices, class_4597 vertexConsumers, class_1297 entity, float opacity, float tickDelta, class_4538 world, float radius, CallbackInfo ci) {
        if (!NoRenderModule.priGBqBlKthcKKxnu2hb4bCOjU9nZ3RS()) {
            return;
        }
        ci.cancel();
    }
}

