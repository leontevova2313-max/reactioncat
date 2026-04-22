/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.light;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Objects;
import net.minecraft.class_2338;
import net.minecraft.class_2804;
import net.minecraft.class_3556;
import net.minecraft.class_3560;
import net.minecraft.class_4076;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_3560.class})
public abstract class MixinLightStorage<M extends class_3556<M>> {
    @Shadow
    @Final
    protected LongSet field_15802;
    @Shadow
    @Final
    protected LongSet field_16448;
    @Shadow
    @Final
    protected M field_15796;

    @Shadow
    @Nullable
    protected abstract class_2804 method_15522(long var1, boolean var3);

    @Overwrite
    public void method_15525(long blockPos, int value) {
        long l = class_4076.method_18691((long)blockPos);
        class_2804 chunkNibbleArray = this.field_15802.add(l) ? this.field_15796.method_15502(l) : this.method_15522(l, true);
        if (chunkNibbleArray == null) {
            return;
        }
        chunkNibbleArray.method_12145(class_4076.method_18684((int)class_2338.method_10061((long)blockPos)), class_4076.method_18684((int)class_2338.method_10071((long)blockPos)), class_4076.method_18684((int)class_2338.method_10083((long)blockPos)), value);
        LongSet var10001 = this.field_16448;
        Objects.requireNonNull(var10001);
        class_4076.method_39490((long)blockPos, arg_0 -> ((LongSet)var10001).add(arg_0));
    }
}

