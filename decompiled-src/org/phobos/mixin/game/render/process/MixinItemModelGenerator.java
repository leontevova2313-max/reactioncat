/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import java.util.List;
import net.minecraft.class_7764;
import net.minecraft.class_785;
import net.minecraft.class_801;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_801.class})
public abstract class MixinItemModelGenerator {
    @Overwrite
    private void method_3482(List<class_801.class_802> cubes, class_801.class_803 side, int x, int y) {
        if (!g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.fTQ2EIYcmOeNMc6pg5GIANHGP762gByS(cubes, side, x, y)) {
            int k;
            class_801.class_802 frame = null;
            for (class_801.class_802 frame2 : cubes) {
                int i;
                if (frame2.method_3484() != side) continue;
                int n = i = side.method_3491() ? y : x;
                if (frame2.method_3486() != i) continue;
                frame = frame2;
                break;
            }
            int j = side.method_3491() ? y : x;
            int n = k = side.method_3491() ? x : y;
            if (frame == null) {
                cubes.add(new class_801.class_802(side, k, j));
            } else {
                frame.method_3483(k);
            }
        }
    }

    @Inject(method={"addSubComponents"}, at={@At(value="RETURN")}, cancellable=true)
    private void addSubComponentsHook(class_7764 sprite, String key, int layer, CallbackInfoReturnable<List<class_785>> cir) {
        g6lQYC0cbux3YIbHlhKg4PGj9mDvIDxa.ury0awWvwu8ituMn0vLvBuFp9bzSNXBC(cir);
    }
}

