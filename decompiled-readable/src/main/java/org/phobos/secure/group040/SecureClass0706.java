/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import java.util.function.Consumer;
import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.phobos.mixin.game.world.IClientWorld;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0706
implements SecureInterface0134 {
    public static /* bridge */ /* synthetic */ void bZp0s5aAZrT1w2f06ojUiQu30JRT0VWK() {
        if (SecureClass0706.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return;
        }
        IClientWorld field001 = (IClientWorld)SecureClass0706.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687;
        field001.getPendingUpdateManager().method_41937().close();
    }

    public static /* bridge */ /* synthetic */ void T7aevwkT794i7JY8BllPXRGGe7xNioUj(class_638 AI5LE0Ee3HsdkeYEZU4AeSrCJLmFSreC, Consumer<Integer> Fa0x5xwHZHv3FMYC92TV67ho5xHdXaAw) {
        try (class_7202 class_72022 = ((IClientWorld)AI5LE0Ee3HsdkeYEZU4AeSrCJLmFSreC).getPendingUpdateManager().method_41937();){
            int field002 = class_72022.method_41942();
            Fa0x5xwHZHv3FMYC92TV67ho5xHdXaAw.accept(field002);
        }
    }

    public /* synthetic */ SecureClass0706() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(Consumer<Integer> upNptt3Eh1HnOa4mbhZAUXMAuFp81jHm) {
        if (SecureClass0706.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return;
        }
        SecureClass0706.T7aevwkT794i7JY8BllPXRGGe7xNioUj(SecureClass0706.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, upNptt3Eh1HnOa4mbhZAUXMAuFp81jHm);
    }
}

