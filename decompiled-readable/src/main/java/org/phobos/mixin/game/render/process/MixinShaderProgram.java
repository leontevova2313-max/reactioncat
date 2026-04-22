/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import java.util.List;
import java.util.Map;
import net.minecraft.class_5944;
import org.phobos.secure.group063.SecureInterface0144;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_5944.class})
public abstract class MixinShaderProgram
implements SecureInterface0144 {
    @Shadow
    @Final
    private Map<String, String> field_29487;

    @Override
    public boolean cfr_renamed_43(String name) {
        return this.field_29487.containsKey(name);
    }

    @Override
    @Accessor(value="samplerNames")
    public abstract List<String> Ese22SXfo5BuVkulPBOeRG2O0siuSZ4W();

    @Override
    @Accessor(value="loadedSamplerIds")
    public abstract List<Integer> Ix3IlOIiLsawwmaFu7vNpsFbYknfR1vY();
}

