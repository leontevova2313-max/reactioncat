/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.minecraft.class_268;
import net.minecraft.class_269;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_269.class})
public abstract class MixinScoreboard {
    @Shadow
    @Final
    private Object2ObjectMap<String, class_268> field_1427;

    @Redirect(method={"addTeam"}, at=@At(value="INVOKE", target="Lorg/slf4j/Logger;warn(Ljava/lang/String;Ljava/lang/Object;)V"))
    private void addTeamHook(Logger instance, String string, Object object) {
    }

    @Overwrite
    public void method_1157(String scoreHolderName, class_268 team) {
        if (this.method_1164(scoreHolderName) != team) {
            return;
        }
        this.field_1427.remove((Object)scoreHolderName);
        team.method_1204().remove(scoreHolderName);
    }

    @Shadow
    @Nullable
    public abstract class_268 method_1164(String var1);
}

