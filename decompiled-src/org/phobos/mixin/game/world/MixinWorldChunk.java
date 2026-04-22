/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy;
import org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn.McCXQ01hdlnzqhv9O4KeQ6vC9XFzZQUa;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.GPm5iYEx1jcZ92yFs8U9yklbnxMlq1iV;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_2818.class})
public abstract class MixinWorldChunk
implements McCXQ01hdlnzqhv9O4KeQ6vC9XFzZQUa,
EventSubscriber {
    @Unique
    private final bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy holeChunkWorker = new bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy();
    @Final
    @Shadow
    class_1937 field_12858;
    @Unique
    private final bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy graphChunkWorker = new bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy();

    @Override
    public bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy WHzZUEYqtQX4xgLP90H4owYTeBh2P13x() {
        return this.holeChunkWorker;
    }

    @Override
    public bU3rl5LPKd3LeeWz0dGjdLZ06VMsheJy ei64nkVzVERI9lMGyvTvGPyvg3ENTOzL() {
        return this.graphChunkWorker;
    }

    @Inject(method={"setBlockState"}, at={@At(value="RETURN")})
    private void setBlockStateHook(class_2338 pos, class_2680 state, boolean moved, CallbackInfoReturnable<class_2680> cir) {
        if (this.field_12858.field_9236) {
            this.invoke(new GPm5iYEx1jcZ92yFs8U9yklbnxMlq1iV(pos, state, (class_2818)class_2818.class.cast(this)));
        }
    }
}

