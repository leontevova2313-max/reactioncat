/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.player;

import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.dck0MthNkJTJjzfWB8kVPVNlK1jk6uQK;
import org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn.gwt2CyEn1SUXgr2wGqj9UXfSs66yE0zI;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_591.class})
public abstract class MixinPlayerEntityModel
implements gwt2CyEn1SUXgr2wGqj9UXfSs66yE0zI {
    @Shadow
    @Final
    public class_630 field_3485;

    @Override
    public class_630 Dc7zIPnzRCj4KEZYlmmqtg1QqwN5nxPV() {
        return this.field_3485;
    }

    @Inject(method={"renderCape"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderCapeHook(class_4587 matrices, class_4588 vertices, int light, int overlay, CallbackInfo ci) {
        if (!dck0MthNkJTJjzfWB8kVPVNlK1jk6uQK.RkLi0hqJ7Mz6MytvJ7Ebg1aIvUywTtLI()) {
            return;
        }
        ci.cancel();
    }
}

