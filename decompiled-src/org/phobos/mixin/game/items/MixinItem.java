/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.items;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import java.util.Optional;
import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_1839;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_5632;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.DCcaAo75sSV7ila7rhbXC9VYItnhmTvu;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG.n06V4jYMMdWGbExHTb4jZrNP0D3hv8US;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.zW1JVXcp70MFdsRVZOsnrwXAMNzJKMdj;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1792.class})
public abstract class MixinItem
implements EventSubscriber {
    @ModifyReturnValue(method={"getUseAction"}, at={@At(value="RETURN")})
    private class_1839 getUseActionHook(class_1839 original) {
        if (this.isSword() && n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return class_1839.field_8949;
        }
        return original;
    }

    @ModifyExpressionValue(method={"raycast"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/player/PlayerEntity;getRotationVector(FF)Lnet/minecraft/util/math/Vec3d;")})
    private static class_243 raycastHook(class_243 original) {
        if (DCcaAo75sSV7ila7rhbXC9VYItnhmTvu.cfr_renamed_23() && !idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz.FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm().cfr_renamed_16()) {
            return idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz.FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm().WjVxiuc6QFRnGXPGp2cp2k8qugOPid4Z();
        }
        return original;
    }

    @Unique
    private boolean isSword() {
        return this instanceof class_1829;
    }

    @Inject(method={"getTooltipData"}, at={@At(value="HEAD")}, cancellable=true)
    private void getTooltipDataHook(class_1799 stack, CallbackInfoReturnable<Optional<class_5632>> cir) {
        zW1JVXcp70MFdsRVZOsnrwXAMNzJKMdj event = this.invoke(zW1JVXcp70MFdsRVZOsnrwXAMNzJKMdj.XU7jmanq95JEvmU4YCGhAATf3yZ6amoU(stack));
        if (event.e5R5sKIFVHynkPMrddXb3SMdXp036ddH() != null) {
            cir.setReturnValue(Optional.of(event.e5R5sKIFVHynkPMrddXb3SMdXp036ddH()));
        }
    }

    @ModifyReturnValue(method={"getMaxUseTime"}, at={@At(value="RETURN")})
    private int getMaxUseItemHook(int original) {
        if (this.isSword() && n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return 72000;
        }
        return original;
    }

    @Inject(method={"use"}, at={@At(value="HEAD")}, cancellable=true)
    private void useHook(class_1937 world, class_1657 user, class_1268 hand, CallbackInfoReturnable<class_1271<class_1799>> cir) {
        if (this.isSword() && n06V4jYMMdWGbExHTb4jZrNP0D3hv8US.cfr_renamed_22().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            class_1799 stack = user.method_5998(hand);
            user.method_6019(hand);
            cir.setReturnValue((Object)class_1271.method_22428((Object)stack));
        }
    }
}

