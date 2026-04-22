/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net.interfaces;

import java.util.UUID;
import net.minecraft.class_2915;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_2915.class})
public interface ILoginHelloC2SPacket {
    @Mutable
    @Accessor(value="profileId")
    public void setProfileId(UUID var1);

    @Mutable
    @Accessor(value="name")
    public void setName(String var1);
}

