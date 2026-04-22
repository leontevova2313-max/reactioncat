/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2464;
import net.minecraft.class_4970;
import org.phobos.secure.group047.NoRenderModule;
import org.phobos.secure.group051.XRayModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_4970.class_4971.class})
public abstract class MixinAbstractBlockState {
    @Inject(method={"getLuminance"}, at={@At(value="HEAD")}, cancellable=true)
    private void getLuminanceHook(CallbackInfoReturnable<Integer> cir) {
        if (XRayModule.cfr_renamed_25()) {
            cir.setReturnValue((Object)15);
        }
    }

    @Inject(method={"isTransparent"}, at={@At(value="HEAD")}, cancellable=true)
    private void isTransparentHook(class_1922 world, class_2338 pos, CallbackInfoReturnable<Boolean> cir) {
        if (!XRayModule.elDZyd5nc38X1YrMr5CoxLKq4G9WhsmN(this.method_26204()) || NoRenderModule.oQ3M64PiFnDzesCi3gKujk3jjRv13XK5(this.method_26204())) {
            cir.setReturnValue((Object)true);
        }
    }

    @Inject(method={"getRenderType"}, at={@At(value="HEAD")}, cancellable=true)
    private void getRenderTypeHook(CallbackInfoReturnable<class_2464> cir) {
        if (!XRayModule.elDZyd5nc38X1YrMr5CoxLKq4G9WhsmN(this.method_26204()) || NoRenderModule.oQ3M64PiFnDzesCi3gKujk3jjRv13XK5(this.method_26204())) {
            cir.setReturnValue((Object)class_2464.field_11455);
        }
    }

    @Shadow
    public abstract class_2248 method_26204();
}

