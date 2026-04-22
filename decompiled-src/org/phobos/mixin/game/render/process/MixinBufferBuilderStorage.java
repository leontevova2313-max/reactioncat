/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.process;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.util.SequencedMap;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_4597;
import net.minecraft.class_4599;
import net.minecraft.class_750;
import net.minecraft.class_9799;
import org.earthhack.ducks.IBufferBuilderStorage;
import org.phobos.secure.SFDLLxag6BrgT2xFaaiwM4KXMC6N6SbP.XZptnGrVGcF7CT9Cq9QPiPLlj2nAxG2n;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_4599.class})
public abstract class MixinBufferBuilderStorage
implements IBufferBuilderStorage {
    @Unique
    private class_4597.class_4598 backing;
    @Shadow
    @Final
    private class_750 field_20956;

    @Shadow
    private static void method_23798(Object2ObjectLinkedOpenHashMap<class_1921, class_9799> builderStorage, class_1921 layer) {
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void initHook(int maxBlockBuildersPoolSize, CallbackInfo ci) {
        SequencedMap sequencedMap = (SequencedMap)class_156.method_654((Object)new Object2ObjectLinkedOpenHashMap(), map -> {
            MixinBufferBuilderStorage.method_23798((Object2ObjectLinkedOpenHashMap<class_1921, class_9799>)map, class_1921.method_27949());
            MixinBufferBuilderStorage.method_23798((Object2ObjectLinkedOpenHashMap<class_1921, class_9799>)map, class_1921.method_23590());
            MixinBufferBuilderStorage.method_23798((Object2ObjectLinkedOpenHashMap<class_1921, class_9799>)map, class_1921.method_30676());
            MixinBufferBuilderStorage.method_23798((Object2ObjectLinkedOpenHashMap<class_1921, class_9799>)map, class_1921.method_23591());
            MixinBufferBuilderStorage.method_23798((Object2ObjectLinkedOpenHashMap<class_1921, class_9799>)map, class_1921.method_29707());
        });
        this.backing = class_4597.method_22992((SequencedMap)sequencedMap, (class_9799)new class_9799(10240));
    }

    @Inject(method={"assignBufferBuilder"}, at={@At(value="HEAD")})
    private static void assignBufferBuilderHook(Object2ObjectLinkedOpenHashMap<class_1921, class_9799> builderStorage, class_1921 layer, CallbackInfo ci) {
        XZptnGrVGcF7CT9Cq9QPiPLlj2nAxG2n.Sa3ncn2M8MJHrxVXcwqEhG3sIAdkTmFO(builderStorage);
    }

    @Override
    public class_4597.class_4598 getBackingContext() {
        return this.backing;
    }
}

