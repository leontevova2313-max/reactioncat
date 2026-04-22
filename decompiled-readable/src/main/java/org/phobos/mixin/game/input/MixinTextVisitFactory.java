/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.input;

import java.awt.Color;
import net.minecraft.class_124;
import net.minecraft.class_2583;
import net.minecraft.class_5223;
import net.minecraft.class_5224;
import org.phobos.secure.group014.MediaModule;
import org.phobos.secure.group060.ColorsModule;
import org.phobos.secure.group054.SecureInterface0134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_5223.class})
public abstract class MixinTextVisitFactory
implements SecureInterface0134 {
    @Shadow
    private static boolean method_27477(class_2583 style, class_5224 visitor, int index, char c) {
        return false;
    }

    @ModifyArg(method={"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"}, at=@At(value="INVOKE", target="Lnet/minecraft/text/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z", ordinal=0), index=0)
    private static String transform(String string, int i, class_2583 style1, class_2583 style2, class_5224 characterVisitor) {
        return MediaModule.cfr_renamed_20(string);
    }

    @Inject(method={"visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"}, at={@At(value="HEAD")}, cancellable=true)
    private static void visitFormattedHook(String text, int startIndex, class_2583 startingStyle, class_2583 resetStyle, class_5224 visitor, CallbackInfoReturnable<Boolean> cir) {
        int length = text.length();
        class_2583 style = startingStyle;
        boolean rainbow = false;
        for (int index = startIndex; index < length; ++index) {
            char next;
            char character = text.charAt(index);
            if (character == '\u00a7') {
                if (index + 1 >= length) break;
                next = text.charAt(index + 1);
                class_124 formatting = class_124.method_544((char)next);
                if (formatting != null) {
                    style = formatting == class_124.field_1070 ? resetStyle : style.method_27707(formatting);
                    rainbow = false;
                } else if (next == '+') {
                    rainbow = true;
                }
                ++index;
                continue;
            }
            if (Character.isHighSurrogate(character)) {
                if (index + 1 >= length) {
                    if (visitor.accept(index, style, 65533)) break;
                    cir.setReturnValue((Object)false);
                    return;
                }
                next = text.charAt(index + 1);
                if (Character.isLowSurrogate(next)) {
                    if (!visitor.accept(index, style, Character.toCodePoint(character, next))) {
                        cir.setReturnValue((Object)false);
                        return;
                    }
                    ++index;
                    continue;
                }
                if (visitor.accept(index, style, 65533)) continue;
                cir.setReturnValue((Object)false);
                return;
            }
            if (rainbow) {
                style = style.method_36139(Color.HSBtoRGB(ColorsModule.NEGseh6AOwsEuKg0GAwIRSZxZxSByPHY(index * 10), 1.0f, 1.0f));
            }
            if (MixinTextVisitFactory.method_27477(style, visitor, index, character)) continue;
            cir.setReturnValue((Object)false);
            return;
        }
        cir.setReturnValue((Object)true);
    }
}

