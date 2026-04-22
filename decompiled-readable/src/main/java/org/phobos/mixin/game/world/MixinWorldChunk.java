/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group008.SecureClass0123;
import org.phobos.secure.group019.SecureInterface0046;
import org.phobos.secure.group063.SecureClass1146;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2818.class})
public abstract class MixinWorldChunk
implements SecureInterface0046,
EventSubscriber {
    @Unique
    private final SecureClass0123 holeChunkWorker = new SecureClass0123();
    @Final
    @Shadow
    class_1937 field_12858;
    @Unique
    private final SecureClass0123 graphChunkWorker = new SecureClass0123();

    @Override
    public SecureClass0123 WHzZUEYqtQX4xgLP90H4owYTeBh2P13x() {
        return this.holeChunkWorker;
    }

    @Override
    public SecureClass0123 ei64nkVzVERI9lMGyvTvGPyvg3ENTOzL() {
        return this.graphChunkWorker;
    }

    @Inject(method={"setBlockState"}, at={@At(value="RETURN")})
    private void setBlockStateHook(class_2338 pos, class_2680 state, boolean moved, CallbackInfoReturnable<class_2680> cir) {
        if (this.field_12858.field_9236) {
            this.invoke(new SecureClass1146(pos, state, (class_2818)class_2818.class.cast(this)));
        }
    }
}

