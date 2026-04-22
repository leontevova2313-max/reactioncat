/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_7648;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={class_2535.class})
public interface IClientConnection {
    @Invoker(value="sendInternal")
    public void invokeSendInternal(class_2596<?> var1, @Nullable class_7648 var2, boolean var3);
}

