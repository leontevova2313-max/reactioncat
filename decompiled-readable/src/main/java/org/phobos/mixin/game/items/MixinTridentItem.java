/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.items;

import net.minecraft.class_1268;
import net.minecraft.class_1271;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1313;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1685;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_1890;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3468;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_9331;
import net.minecraft.class_9701;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group041.AutoTridentModule;
import org.phobos.secure.group052.SecureClass0942;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1835.class})
public abstract class MixinTridentItem
implements EventSubscriber {
    @Inject(method={"use"}, at={@At(value="HEAD")}, cancellable=true)
    private void useHook(class_1937 world, class_1657 user, class_1268 hand, CallbackInfoReturnable<class_1271<class_1799>> cir) {
        class_1799 itemStack;
        if (AutoTridentModule.RvH2mqbZbQaNGaPqtWIxGE3U30ct9isz().iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && !MixinTridentItem.method_61168(itemStack = user.method_5998(hand))) {
            user.method_6019(hand);
            cir.setReturnValue((Object)class_1271.method_22428((Object)itemStack));
        }
    }

    @Inject(method={"onStoppedUsing"}, at={@At(value="HEAD")}, cancellable=true)
    private void onStoppedUsingHook(class_1799 stack, class_1937 world, class_1309 user, int remainingUseTicks, CallbackInfo ci) {
        if (user instanceof class_1657) {
            class_1657 playerEntity = (class_1657)user;
            ci.cancel();
            int ticks = this.method_7881(stack, user) - remainingUseTicks;
            float power = class_1890.method_60123((class_1799)stack, (class_1309)playerEntity);
            SecureClass0942 event = this.invoke(new SecureClass0942(ticks, false, false));
            if (!(!event.isCancelled() && event.WMqV8syH3FOhOXs4PU2ljN295ctE7isL() < 10 || !event.gckgdC4b8S4rF6dUiZfabWaY9BAn0L93() && power > 0.0f && !playerEntity.method_5721() || MixinTridentItem.method_61168(stack))) {
                class_6880 registryEntry = class_1890.method_60165((class_1799)stack, (class_9331)class_9701.field_51654).orElse(class_3417.field_15001);
                if (!world.field_9236) {
                    stack.method_7970(1, (class_1309)playerEntity, class_1309.method_56079((class_1268)user.method_6058()));
                    if (power == 0.0f) {
                        class_1685 tridentEntity = new class_1685(world, (class_1309)playerEntity, stack);
                        tridentEntity.method_24919((class_1297)playerEntity, playerEntity.method_36455(), playerEntity.method_36454(), 0.0f, 2.5f, 1.0f);
                        if (playerEntity.method_56992()) {
                            tridentEntity.field_7572 = class_1665.class_1666.field_7594;
                        }
                        world.method_8649((class_1297)tridentEntity);
                        world.method_43129(null, (class_1297)tridentEntity, (class_3414)registryEntry.comp_349(), class_3419.field_15248, 1.0f, 1.0f);
                        if (!playerEntity.method_56992()) {
                            playerEntity.method_31548().method_7378(stack);
                        }
                    }
                }
                playerEntity.method_7259(class_3468.field_15372.method_14956((Object)((class_1835)this)));
                if (power > 0.0f) {
                    float yaw = playerEntity.method_36454();
                    float pitch = playerEntity.method_36455();
                    float x = -class_3532.method_15374((float)(yaw * ((float)Math.PI / 180))) * class_3532.method_15362((float)(pitch * ((float)Math.PI / 180)));
                    float y = -class_3532.method_15374((float)(pitch * ((float)Math.PI / 180)));
                    float z = class_3532.method_15362((float)(yaw * ((float)Math.PI / 180))) * class_3532.method_15362((float)(pitch * ((float)Math.PI / 180)));
                    float length = class_3532.method_15355((float)(x * x + y * y + z * z));
                    playerEntity.method_5762((double)(x *= power / length), (double)(y *= power / length), (double)(z *= power / length));
                    if (!event.BP7kssBbBBldGfikO6SQhFzokGLbQglS()) {
                        playerEntity.method_40126(20, 8.0f, stack);
                    }
                    if (playerEntity.method_24828()) {
                        playerEntity.method_5784(class_1313.field_6308, new class_243(0.0, 1.1999999284744263, 0.0));
                    }
                    if (!event.BP7kssBbBBldGfikO6SQhFzokGLbQglS()) {
                        world.method_43129(null, (class_1297)playerEntity, (class_3414)registryEntry.comp_349(), class_3419.field_15248, 1.0f, 1.0f);
                    }
                }
            }
        }
    }

    @Shadow
    public abstract int method_7881(class_1799 var1, class_1309 var2);

    @Shadow
    private static boolean method_61168(class_1799 stack) {
        return false;
    }
}

