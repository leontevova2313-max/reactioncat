/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_638;
import org.phobos.secure.group022.SecureClass0361;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_1675.class})
public abstract class MixinProjectileUtil {
    @Redirect(method={"raycast"}, at=@At(value="INVOKE", target="Lnet/minecraft/world/World;getOtherEntities(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;)Ljava/util/List;"))
    private static List<class_1297> raycastPatch(class_1937 instance, class_1297 except, class_238 box, Predicate<? super class_1297> predicate) {
        class_638 world = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().dQ3tyFLaoz3UfQxd5pTgIhHivFR0rf1q().BjvJ511ATx4TUJ7A9Rp8eoVahp5LhQiq();
        try {
            return world.method_8333(except, box, predicate);
        }
        catch (Throwable throwable) {
            return Lists.newArrayList();
        }
    }
}

