/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.screen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.class_276;
import net.minecraft.class_279;
import net.minecraft.class_283;
import net.minecraft.class_2960;
import org.earthhack.ducks.IPostEffectProcessor;
import org.phobos.mixin.game.render.interfaces.IPostEffectPass;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_279.class})
public abstract class MixinPostEffectProcessor
implements IPostEffectProcessor {
    @Shadow
    @Final
    private List<class_283> field_1497;
    @Unique
    private final List<String> buffers = new ArrayList<String>();
    @Shadow
    @Final
    private Map<String, class_276> field_1495;

    @Override
    public void createBuffer(String name, class_276 buffer) {
        class_276 old = this.field_1495.get(name);
        if (old != buffer) {
            if (old != null) {
                for (class_283 pass : this.field_1497) {
                    if (pass.field_1536 == old) {
                        ((IPostEffectPass)pass).setInput(buffer);
                    }
                    if (pass.field_1538 != old) continue;
                    ((IPostEffectPass)pass).setOutput(buffer);
                }
                this.field_1495.remove(name);
                this.buffers.remove(name);
            }
            this.field_1495.put(name, buffer);
            this.buffers.add(name);
        }
    }

    @Redirect(method={"parsePass"}, at=@At(value="INVOKE", target="Lnet/minecraft/util/Identifier;ofVanilla(Ljava/lang/String;)Lnet/minecraft/util/Identifier;"))
    private class_2960 parsePassHook(String path) {
        if (path.endsWith("shader.png")) {
            return class_2960.method_60655((String)"phobos", (String)"textures/shader.png");
        }
        return class_2960.method_60656((String)path);
    }
}

