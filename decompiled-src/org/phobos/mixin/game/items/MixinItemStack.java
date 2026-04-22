/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.items;

import net.minecraft.class_1799;
import org.earthhack.ducks.IItemStack;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.EfmUvYSElSi2JU48pEiAe9KFGFzCxrII;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1799.class})
public abstract class MixinItemStack
implements IItemStack {
    @Unique
    private boolean glintOverride = false;

    @Override
    public void glint() {
        this.glintOverride = true;
    }

    @Inject(method={"hasGlint"}, at={@At(value="RETURN")}, cancellable=true)
    private void hasGlintHook(CallbackInfoReturnable<Boolean> cir) {
        if (this.glintOverride) {
            cir.setReturnValue((Object)true);
            return;
        }
        cir.setReturnValue((Object)EfmUvYSElSi2JU48pEiAe9KFGFzCxrII.xZ6Y7CCVp4BjLkGFZa6PXVwbmJYgQSWK((class_1799)this, (Boolean)cir.getReturnValue()));
    }
}

