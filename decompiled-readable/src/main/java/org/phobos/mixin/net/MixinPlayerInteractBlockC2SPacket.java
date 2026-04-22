/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import net.minecraft.class_2540;
import net.minecraft.class_2885;
import net.minecraft.class_3965;
import org.phobos.secure.group021.DisablerModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value={class_2885.class})
public abstract class MixinPlayerInteractBlockC2SPacket {
    @Redirect(method={"write"}, at=@At(value="INVOKE", target="Lnet/minecraft/network/PacketByteBuf;writeBlockHitResult(Lnet/minecraft/util/hit/BlockHitResult;)V"))
    private void writeBlockHitResult(class_2540 buf, class_3965 hitResult) {
        if (DisablerModule.fZckvtVwwCXl8zQOiDnHLvhkymRAsnn4()) {
            buf.method_10807(hitResult.method_17777());
            buf.method_10804(6 + hitResult.method_17780().ordinal() * 7);
            buf.method_52941((float)hitResult.method_17784().field_1352 - (float)hitResult.method_17777().method_10263());
            buf.method_52941((float)hitResult.method_17784().field_1351 - (float)hitResult.method_17777().method_10264());
            buf.method_52941((float)hitResult.method_17784().field_1350 - (float)hitResult.method_17777().method_10260());
            buf.method_52964(hitResult.method_17781());
            return;
        }
        buf.method_17813(hitResult);
    }
}

