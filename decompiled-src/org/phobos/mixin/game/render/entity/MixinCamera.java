/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.entity;

import net.minecraft.class_1297;
import net.minecraft.class_1922;
import net.minecraft.class_239;
import net.minecraft.class_4184;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.pcVRJNTUPNF6sGCD8iV9AH1G2f12b5YP;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(value={class_4184.class})
public abstract class MixinCamera
implements EventSubscriber {
    @Shadow
    private float field_18721;
    @Shadow
    private class_1297 field_18711;
    @Shadow
    private float field_18722;
    @Shadow
    private boolean field_18719;

    @ModifyArgs(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;setPos(DDD)V"))
    private void updateHook3(Args args) {
        if (!TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return;
        }
        double x = TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().fIMbo7UOmY60kwZGpzx07fiNlktmj3z2().cfr_renamed_26();
        double y = TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().cfr_renamed_27().cfr_renamed_26();
        double z = TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().JO1GIBSWqHCzbwdRcSRcz0lK82rJgYNK().cfr_renamed_26();
        args.setAll(new Object[]{x, y, z});
    }

    @Shadow
    protected abstract float method_19318(float var1);

    @Redirect(method={"clipToSpace"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/hit/HitResult;getType()Lnet/minecraft/util/hit/HitResult$Type;"))
    private class_239.class_240 clipToSpaceHook(class_239 instance) {
        return pcVRJNTUPNF6sGCD8iV9AH1G2f12b5YP.KNXntM9081EgPPIAoZgPwbmB3jQcORQT(instance.method_17783());
    }

    @Inject(method={"updateEyeHeight"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateEyeHeightHook(CallbackInfo ci) {
        if (this.field_18711 != null && gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.UJNc6kfAOVMoAqLqWFpd8vsHJ76eoQ7S()) {
            this.field_18721 = this.field_18722 = this.field_18711.method_5751();
            ci.cancel();
        }
    }

    @Shadow
    protected abstract void method_19324(float var1, float var2, float var3);

    @Inject(method={"update"}, at={@At(value="TAIL")})
    private void updateHook1(class_1922 area, class_1297 focusedEntity, boolean thirdPerson, boolean inverseView, float tickDelta, CallbackInfo ci) {
        if (!TiUWnmO2hSf25BrBWLJnYzIh9mrDMx3l.mIZUTeAmM4Xc7nuBDIxIBJrghXGZpMyW().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return;
        }
        this.field_18719 = true;
    }

    @Redirect(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/render/Camera;clipToSpace(F)F"))
    private float moveByHook(class_4184 instance, float f) {
        return this.method_19318(pcVRJNTUPNF6sGCD8iV9AH1G2f12b5YP.cfr_renamed_28(f));
    }
}

