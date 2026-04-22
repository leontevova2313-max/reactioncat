/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import net.minecraft.class_2561;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_8667;
import net.minecraft.class_9812;
import org.phobos.mixin.game.ui.IScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_419.class})
public interface IDisconnectedScreen
extends IScreen {
    @Accessor(value="parent")
    public class_437 getParent();

    @Accessor(value="info")
    public class_9812 getInfo();

    @Accessor(value="buttonLabel")
    public class_2561 getButtonLabel();

    @Accessor(value="grid")
    public class_8667 getGrid();
}

