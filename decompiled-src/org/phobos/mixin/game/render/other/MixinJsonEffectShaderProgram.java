/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.other;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_280;
import net.minecraft.class_281;
import net.minecraft.class_2960;
import net.minecraft.class_5912;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe._2W3QeEazEKnuhonUFpaMpeFF3ZHkzyFx;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value={class_280.class})
public abstract class MixinJsonEffectShaderProgram
implements _2W3QeEazEKnuhonUFpaMpeFF3ZHkzyFx {
    @WrapOperation(at={@At(value="INVOKE", target="net/minecraft/util/Identifier.ofVanilla (Ljava/lang/String;)Lnet/minecraft/util/Identifier;", ordinal=0)}, method={"<init>"})
    class_2960 constructProgramIdentifier(String arg, Operation<class_2960> original, class_5912 unused, String id) {
        if (!id.contains(":")) {
            return (class_2960)original.call(new Object[]{arg});
        }
        class_2960 split = class_2960.method_60654((String)id);
        return class_2960.method_60655((String)split.method_12836(), (String)("shaders/program/" + split.method_12832() + ".json"));
    }

    @WrapOperation(at={@At(value="INVOKE", target="net/minecraft/util/Identifier.ofVanilla (Ljava/lang/String;)Lnet/minecraft/util/Identifier;", ordinal=0)}, method={"loadEffect"})
    private static class_2960 constructProgramIdentifier(String arg, Operation<class_2960> original, class_5912 unused, class_281.class_282 shaderType, String id) {
        if (!arg.contains(":")) {
            return (class_2960)original.call(new Object[]{arg});
        }
        class_2960 split = class_2960.method_60654((String)id);
        return class_2960.method_60655((String)split.method_12836(), (String)("shaders/program/" + split.method_12832() + shaderType.method_1284()));
    }
}

