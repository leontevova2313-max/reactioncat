/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4604;
import net.minecraft.class_897;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.E7qwU8abcwz3brAbulptWa86RqdgSg2V.d7W7jZbVsEqJ36YmyV5GdJRuAqG5Z0Ds;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp._5nb8TaW5dDrr4qUBOzDUlHcB1HfXjSF3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_897.class})
public abstract class MixinEntityRenderer<T extends class_1297>
implements EventSubscriber {
    @Inject(method={"shouldRender"}, at={@At(value="HEAD")}, cancellable=true)
    private void shouldRenderHook(T entity, class_4604 frustum, double x, double y, double z, CallbackInfoReturnable<Boolean> cir) {
        _5nb8TaW5dDrr4qUBOzDUlHcB1HfXjSF3<T> event = this.invoke(new _5nb8TaW5dDrr4qUBOzDUlHcB1HfXjSF3<T>(entity));
        if (event.isCancelled()) {
            cir.setReturnValue((Object)false);
        }
    }

    @Shadow
    protected abstract <E extends class_1297> void method_61049(T var1, float var2, class_4587 var3, class_4597 var4, E var5);

    @Shadow
    public abstract class_2960 method_3931(T var1);

    @Inject(method={"renderLabelIfPresent"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderLabelIfPresentHook(T entity, class_2561 text, class_4587 matrices, class_4597 vertexConsumers, int light, float tickDelta, CallbackInfo ci) {
        if (entity instanceof class_1657 && d7W7jZbVsEqJ36YmyV5GdJRuAqG5Z0Ds.cfr_renamed_31()) {
            ci.cancel();
        }
    }

    @Shadow
    protected abstract void method_3926(T var1, class_2561 var2, class_4587 var3, class_4597 var4, int var5, float var6);

    @Shadow
    public abstract void method_3936(T var1, float var2, float var3, class_4587 var4, class_4597 var5, int var6);

    @Unique
    public <E extends class_1297> void __renderLeash(T entity, float tickDelta, class_4587 matrices, class_4597 vertexConsumers, E leashHolder) {
        this.method_61049(entity, tickDelta, matrices, vertexConsumers, leashHolder);
    }
}

