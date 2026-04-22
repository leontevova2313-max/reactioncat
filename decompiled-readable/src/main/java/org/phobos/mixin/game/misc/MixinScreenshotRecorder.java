/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.misc;

import java.io.File;
import java.util.function.Consumer;
import net.minecraft.class_1011;
import net.minecraft.class_124;
import net.minecraft.class_156;
import net.minecraft.class_2558;
import net.minecraft.class_2561;
import net.minecraft.class_276;
import net.minecraft.class_318;
import net.minecraft.class_5250;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group007.SecureClass0110;
import org.phobos.secure.group013.SecureClass0192;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_318.class})
public abstract class MixinScreenshotRecorder {
    @Shadow
    @Final
    private static Logger field_1974;
    @Shadow
    @Final
    public static String field_41337;

    @Shadow
    private static File method_1660(File directory) {
        return null;
    }

    @Inject(method={"saveScreenshotInner"}, at={@At(value="HEAD")}, cancellable=true)
    private static void saveScreenshotInnerHook(File gameDirectory, @Nullable String fileName, class_276 framebuffer, Consumer<class_2561> messageReceiver, CallbackInfo ci) {
        ci.cancel();
        class_1011 nativeImage = class_318.method_1663((class_276)framebuffer);
        File file = new File(gameDirectory, field_41337);
        file.mkdir();
        File file2 = fileName == null ? MixinScreenshotRecorder.method_1660(file) : new File(file, fileName);
        class_156.method_27958().execute(() -> {
            try {
                nativeImage.method_4325(file2);
                SecureClass0110.FnF2OpMxgca4oIh6rCHuas2XlZpErdWb(new SecureClass0192(file2));
                class_5250 text = class_2561.method_43470((String)file2.getName()).method_27692(class_124.field_1073).method_27694(style -> style.method_10958(new class_2558(class_2558.class_2559.field_11746, file2.getAbsolutePath())));
                messageReceiver.accept((class_2561)class_2561.method_43469((String)"screenshot.success", (Object[])new Object[]{text}));
            }
            catch (Exception exception) {
                field_1974.warn("Couldn't save screenshot", (Throwable)exception);
                messageReceiver.accept((class_2561)class_2561.method_43469((String)"screenshot.failure", (Object[])new Object[]{exception.getMessage()}));
            }
            finally {
                nativeImage.close();
            }
        });
    }
}

