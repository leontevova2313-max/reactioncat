/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_1703;
import net.minecraft.class_485;
import org.phobos.mixin.game.ui.MixinHandledScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value={class_485.class})
public abstract class MixinAbstractInventoryScreen<T extends class_1703>
extends MixinHandledScreen<T> {
}

