/*
 * Decompiled with CFR.
 */
package org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND;

import java.util.function.Consumer;
import net.minecraft.class_638;
import net.minecraft.class_7202;
import org.phobos.mixin.game.world.IClientWorld;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T;

public final class ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4
implements s4XZdZJWqtIHXzepkZyqthA5ydjzHW2T {
    public static /* bridge */ /* synthetic */ void bZp0s5aAZrT1w2f06ojUiQu30JRT0VWK() {
        if (ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return;
        }
        IClientWorld sfgaOzgLT2h9Yufs8v3F9CVDFK3rsX93 = (IClientWorld)ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687;
        sfgaOzgLT2h9Yufs8v3F9CVDFK3rsX93.getPendingUpdateManager().method_41937().close();
    }

    public static /* bridge */ /* synthetic */ void T7aevwkT794i7JY8BllPXRGGe7xNioUj(class_638 AI5LE0Ee3HsdkeYEZU4AeSrCJLmFSreC, Consumer<Integer> Fa0x5xwHZHv3FMYC92TV67ho5xHdXaAw) {
        try (class_7202 class_72022 = ((IClientWorld)AI5LE0Ee3HsdkeYEZU4AeSrCJLmFSreC).getPendingUpdateManager().method_41937();){
            int bZ3529PuAitPFY2wxQyU2PgpGQevmU2k = class_72022.method_41942();
            Fa0x5xwHZHv3FMYC92TV67ho5xHdXaAw.accept(bZ3529PuAitPFY2wxQyU2PgpGQevmU2k);
        }
    }

    public /* synthetic */ ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ void djxxJTepSQ0gWAaFoRBQBXx7Ko46B6zk(Consumer<Integer> upNptt3Eh1HnOa4mbhZAUXMAuFp81jHm) {
        if (ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
            return;
        }
        ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4.T7aevwkT794i7JY8BllPXRGGe7xNioUj(ptrvF5KUfO6kB3eJT6os0RTmZPCkyhz4.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, upNptt3Eh1HnOa4mbhZAUXMAuFp81jHm);
    }
}

