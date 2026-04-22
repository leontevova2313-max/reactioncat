/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group041;

import net.minecraft.class_1936;
import net.minecraft.class_3694;
import net.minecraft.class_634;
import net.minecraft.class_638;
import org.phobos.mixin.game.world.IClientWorld;
import org.phobos.secure.group032.y54zQvJ6GpHQW8kMLMMaF4QTCbtQsOhI;

public abstract class SecureClass0726
extends class_638
implements class_1936 {
    public final /* synthetic */ class_638 field001;

    public /* synthetic */ SecureClass0726(class_638 Io9SMFvgjWYayk3hWurjBQ3u71rNFJux) {
        this(Io9SMFvgjWYayk3hWurjBQ3u71rNFJux, SecureClass0726.cfr_renamed_548(Io9SMFvgjWYayk3hWurjBQ3u71rNFJux));
    }

    public static /* bridge */ /* synthetic */ class_634 cfr_renamed_548(class_638 Wh8JM2YI3gt2i2AwfBKSGfFGgrtx835w) {
        if (Wh8JM2YI3gt2i2AwfBKSGfFGgrtx835w instanceof IClientWorld) {
            IClientWorld field002 = (IClientWorld)Wh8JM2YI3gt2i2AwfBKSGfFGgrtx835w;
            return field002.getConnection();
        }
        return y54zQvJ6GpHQW8kMLMMaF4QTCbtQsOhI.QJVHStvaGRn7YYNxEslLiyqfwpHKvA9Z(Wh8JM2YI3gt2i2AwfBKSGfFGgrtx835w.method_30349());
    }

    public /* synthetic */ SecureClass0726(class_638 class_6382, class_634 IHw5cq9q5j1GoIm5heNZ53wV0JUYYdlu) {
        super(IHw5cq9q5j1GoIm5heNZ53wV0JUYYdlu, class_6382.method_28104(), class_6382.method_27983(), class_6382.method_40134(), 0, class_6382.method_39024(), () -> class_3694.field_16280, null, class_6382.method_27982(), 0L);
        this.field001 = class_6382;
    }
}

