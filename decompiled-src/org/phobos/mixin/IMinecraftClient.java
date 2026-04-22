/*
 * Decompiled with CFR.
 */
package org.phobos.mixin;

import java.util.function.Supplier;
import net.minecraft.class_128;
import net.minecraft.class_310;
import net.minecraft.class_320;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_310.class})
public interface IMinecraftClient {
    @Mutable
    @Accessor(value="session")
    public void setSession(class_320 var1);

    @Accessor(value="crashReportSupplier")
    public Supplier<class_128> getCrashReportSupplier();

    @Accessor(value="itemUseCooldown")
    public void setItemUseCooldown(int var1);
}

