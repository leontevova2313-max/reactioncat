/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import net.minecraft.class_746;
import org.jetbrains.annotations.Nullable;
import org.phobos.mixin.game.entity.MixinEntity;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.DCcaAo75sSV7ila7rhbXC9VYItnhmTvu;
import org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn.C8hHAWbt6uW3URrva7uar8qCmLp3Ia1a;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.n556eSAzBhAeeeC2qGARraZwUjF85w4w;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_1671.class})
public abstract class MixinFireworkRocketEntity
extends MixinEntity {
    @Shadow
    @Nullable
    private class_1309 field_7616;

    @ModifyExpressionValue(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;")})
    private class_243 tickHook2(class_243 original) {
        return this.getRotation(original);
    }

    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;setVelocity(Lnet/minecraft/util/math/Vec3d;)V"))
    private void tickHook1(class_1309 instance, class_243 vel) {
        if (!n556eSAzBhAeeeC2qGARraZwUjF85w4w.lQwdCF7YfRLGBeLoIc86hFOfdwG3nUvL()) {
            instance.method_18799(vel);
            return;
        }
        class_243 rotation = this.getRotation(instance.method_5720());
        class_243 velocity = instance.method_18798();
        double delta = n556eSAzBhAeeeC2qGARraZwUjF85w4w.shZY8eYlgLMzVWoQwJuBf1i9nGE6iXtV(1.5);
        instance.method_18799(velocity.method_1031(rotation.field_1352 * 0.1 + (rotation.field_1352 * delta - velocity.field_1352) * 0.5, rotation.field_1351 * 0.1 + (rotation.field_1351 * delta - velocity.field_1351) * 0.5, rotation.field_1350 * 0.1 + (rotation.field_1350 * delta - velocity.field_1350) * 0.5));
    }

    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;isFallFlying()Z"))
    private boolean tickHook(class_1309 instance) {
        if (C8hHAWbt6uW3URrva7uar8qCmLp3Ia1a.cfr_renamed_11()) {
            return false;
        }
        return instance.method_6128();
    }

    @Unique
    private class_243 getRotation(class_243 original) {
        if (!(this.field_7616 instanceof class_746)) {
            return original;
        }
        if (!DCcaAo75sSV7ila7rhbXC9VYItnhmTvu.LyhipsDcSND2mt20iy06Gz5RoalgpLk2()) {
            return original;
        }
        idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz manager = _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().jbJBRBvK3Na5rdi1h4WNK99O8tRtiWJB();
        LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs rotation = LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs.wYIqVd8kaoMUZ5dBj6Ya8DdLg7C8F4IR(manager.YlA5QfFebCosMijWjQmsEOTWMSwhtZT6(), manager.sCjikVoSm62g11jMI6NrrYX6Soz7zb1v());
        return rotation.WjVxiuc6QFRnGXPGp2cp2k8qugOPid4Z();
    }
}

