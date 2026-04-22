/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.world;

import net.minecraft.class_1297;
import net.minecraft.class_5582;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_638.class})
public interface IClientWorld {
    @Accessor(value="networkHandler")
    public class_634 getConnection();

    @Accessor(value="entityManager")
    public class_5582<class_1297> getEntityManager();

    @Accessor(value="pendingUpdateManager")
    public class_7202 getPendingUpdateManager();
}

