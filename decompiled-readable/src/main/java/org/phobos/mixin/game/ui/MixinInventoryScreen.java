/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.ui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1735;
import net.minecraft.class_1802;
import net.minecraft.class_308;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4597;
import net.minecraft.class_490;
import net.minecraft.class_898;
import org.earthhack.ducks.IInventoryScreen;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.phobos.mixin.game.ui.MixinAbstractInventoryScreen;
import org.phobos.secure.group001.o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group051.SecureClass0913;
import org.phobos.secure.group055.SecureInterface0135;
import org.phobos.secure.group058.SecureClass1055;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group023.ChamsModule;
import org.phobos.secure.group053.AutoTotemModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_490.class})
public abstract class MixinInventoryScreen
extends MixinAbstractInventoryScreen<class_1723>
implements IInventoryScreen {
    @Unique
    private final o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe openTime = new o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe();

    @Overwrite
    public static void method_48472(class_332 context, float x, float y, float size, Vector3f vector3f, Quaternionf quaternionf, @Nullable Quaternionf quaternionf2, class_1309 entity) {
        context.method_51448().method_22903();
        context.method_51448().method_22904((double)x, (double)y, 50.0);
        context.method_51448().method_22905(size, size, -size);
        context.method_51448().method_46416(vector3f.x, vector3f.y, vector3f.z);
        context.method_51448().method_22907(quaternionf);
        class_308.method_34742();
        class_898 entityRenderDispatcher = class_310.method_1551().method_1561();
        if (quaternionf2 != null) {
            entityRenderDispatcher.method_24196(quaternionf2.conjugate(new Quaternionf()).rotateY((float)Math.PI));
        }
        entityRenderDispatcher.method_3948(false);
        RenderSystem.runAsFancy(() -> {
            ChamsModule.jEBOVTBlkhI8Ww9vH7Zg9mhaJnjodOZq = true;
            entityRenderDispatcher.method_3954((class_1297)entity, 0.0, 0.0, 0.0, 0.0f, 1.0f, context.method_51448(), (class_4597)context.method_51450(), 0xF000F0);
            ChamsModule.jEBOVTBlkhI8Ww9vH7Zg9mhaJnjodOZq = false;
        });
        context.method_51452();
        entityRenderDispatcher.method_3948(true);
        context.method_51448().method_22909();
        class_308.method_24211();
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void renderHook(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci) {
        class_1735 focused = this.field_2787;
        if (focused == null) {
            return;
        }
        SecureClass1055 action = SecureClass0913.Room39dd8k2kdoQR6HNvt2m7CmYYSaEk().BnLXVU4DorzHnDo7viMH6sVwlnTFo5PP(focused);
        if (action != null) {
            SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().nx1hZqNRv4jtS3XgQaMIaZh7gHtRiTxY().djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(ctx -> ctx.wp9rY0CWk1sYOcWFWcK2RMTpkLdGTRNH(focused, action));
            return;
        }
        if (!AutoTotemModule.J0ksPHFygEZs344LOkwoXNjKlf9TfZb7()) {
            return;
        }
        if (!focused.method_7677().method_31574(class_1802.field_8288)) {
            return;
        }
        if (AutoTotemModule.ZXFjM0vMcJoNVJQ4gLFSKi0PWM0t7p4A()) {
            this.doTick(focused);
        }
    }

    @Override
    public o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe getOpenTime() {
        return this.openTime;
    }

    @Unique
    private void doTick(class_1735 slot) {
        SecureClass0242 phobos = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ();
        phobos.nx1hZqNRv4jtS3XgQaMIaZh7gHtRiTxY().djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(ctx -> {
            if (ctx.win6vD2lfur7HrbTuNoh8GtHmuSKWSqv().equals(slot)) {
                return;
            }
            if (!(ctx.win6vD2lfur7HrbTuNoh8GtHmuSKWSqv().method_7677().method_31574(class_1802.field_8288) || AutoTotemModule.cfr_renamed_53() && !AutoTotemModule.rg9VfhJnIXguipzH26gV9ShcjTy8XuDB(true))) {
                ctx.Dr0z1bjgjnfoAy4ksuJhmfstQ2E8EiGN(slot.field_7874, 40, class_1713.field_7791, new boolean[0]);
                AutoTotemModule.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
                return;
            }
            SecureInterface0135<Boolean, Integer> doubleHand = AutoTotemModule.eYX6D0QQ7ZBTLrt4I9iBJHR3NLHaFssc();
            if (!doubleHand.Y6Nk0e6yZ9Yxyl8A5gEiVheaxvCGSzLi().booleanValue()) {
                return;
            }
            ctx.y8bGKCoDdEyJ44UxXC3xPRZyKQzumwdx(doubleHand.oX4a1wSFm2W97zCTriKsGVDMJc5GyCEZ() - 1, mainhand -> {
                if (mainhand.method_7677().method_31574(class_1802.field_8288)) {
                    return;
                }
                if (!AutoTotemModule.jQhszJiYYFrPFVJTM0NJIbibdVVGi8Nf(true)) {
                    return;
                }
                ctx.Dr0z1bjgjnfoAy4ksuJhmfstQ2E8EiGN(slot.field_7874, mainhand.method_34266(), class_1713.field_7791, new boolean[0]);
                AutoTotemModule.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            });
        });
    }

    @Inject(method={"init"}, at={@At(value="HEAD")})
    private void initHook(CallbackInfo ci) {
        this.openTime.kBV8JHPVfmyQSmxrXmFgvwxMsYzBEJIy();
    }
}

