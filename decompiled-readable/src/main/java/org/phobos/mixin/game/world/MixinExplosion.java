/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1927;
import net.minecraft.class_1937;
import net.minecraft.class_3414;
import net.minecraft.class_3419;
import org.phobos.secure.group037.SoundFixerModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_1927.class})
public abstract class MixinExplosion {
    @Redirect(method={"affectWorld"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/World;playSound(DDDLnet/minecraft/sound/SoundEvent;Lnet/minecraft/sound/SoundCategory;FFZ)V"))
    private void affectWorldHook(class_1937 instance, double x, double y, double z, class_3414 sound, class_3419 category, float volume, float pitch, boolean useDistance) {
        instance.method_8486(x, y, z, sound, category, volume, pitch, SoundFixerModule.cfr_renamed_25() || useDistance);
    }
}

