/*
 * Decompiled with CFR.
 */
package org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ._3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.GoxjttKIQeySrggj21XfizkQynGVZBzk;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D;

public class ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY
extends GoxjttKIQeySrggj21XfizkQynGVZBzk<X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D>
implements _3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX {
    public static final /* synthetic */ Path iZ7l7AVZs9s86s54dnycSkvhZfBvwmit;
    public static final /* synthetic */ ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY Y6zHEj4cMBufUhoOGwNtIX2BPgXlFVzu;
    public final /* synthetic */ MutableObject<X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D> IKyGqthpTJkZnNkmANISK2U5u3Lxxq2W;
    public final /* synthetic */ MutableBoolean cfr_renamed_449;

    public static /* bridge */ /* synthetic */ void stop() {
        iZ7l7AVZs9s86s54dnycSkvhZfBvwmit.toFile().mkdirs();
        Iterator<T> iterator = ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY.Y6zHEj4cMBufUhoOGwNtIX2BPgXlFVzu.iterator();
        while (iterator.hasNext()) {
            X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D itwE1Z2r5FZL9waJRDJL6HdzRW2ELqyp = (X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D)iterator.next();
            try {
                Files.writeString(iZ7l7AVZs9s86s54dnycSkvhZfBvwmit.resolve(itwE1Z2r5FZL9waJRDJL6HdzRW2ELqyp.getName() + ".json"), (CharSequence)itwE1Z2r5FZL9waJRDJL6HdzRW2ELqyp.syKFGJzqrCtbfvVOwCajUMKR84gWsmmY(cfr_renamed_328), new OpenOption[0]);
            }
            catch (Throwable throwable) {
            }
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void asTX5nZlsS4qmlDrYwmHUiVFh3Wz0ETr() {
        File[] siSHYyLueZVGhMeZtCwrIuvBwTTSPO2I = iZ7l7AVZs9s86s54dnycSkvhZfBvwmit.toFile().listFiles();
        if (siSHYyLueZVGhMeZtCwrIuvBwTTSPO2I == null) {
            return;
        }
        ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY zqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY = ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY.Y6zHEj4cMBufUhoOGwNtIX2BPgXlFVzu;
        for (File LWKLopeiFFErHmFT6DcqAK6XacB3QGly : siSHYyLueZVGhMeZtCwrIuvBwTTSPO2I) {
            String[] stringArray = LWKLopeiFFErHmFT6DcqAK6XacB3QGly.getName().split("\\.");
            String irEfxoI8xTxFcIBrQJFeaxl3anBSMmyK = stringArray.length > 0 ? stringArray[stringArray.length - 2] : LWKLopeiFFErHmFT6DcqAK6XacB3QGly.getName();
            try {
                String hDua8eN2M3INfuwMXDUSd4X6e0P0Xoaf = Files.readString(LWKLopeiFFErHmFT6DcqAK6XacB3QGly.toPath());
                X3fbDbfxeaytkeYOBaKbRHgVgBNy5C1D.Wq3b5UGlpHB8iMxypneRrcJ8ZDC59wVy(irEfxoI8xTxFcIBrQJFeaxl3anBSMmyK, hDua8eN2M3INfuwMXDUSd4X6e0P0Xoaf).ifPresent(zqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY::rs6ebe0vLusAQbFvhxTOqqdZKSHJidxv);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        String ZVYwcIwZdHl4bjdeh5rKkKJgWe9zG0x0 = o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().PHBE4hWDmoINKUEmf31FHeK0at0vqtZS.getValue();
        if (ZVYwcIwZdHl4bjdeh5rKkKJgWe9zG0x0.equalsIgnoreCase("none")) {
            return;
        }
        zqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY.qC2TVK9LFkHRG3VZKSRRXeWMRVeQJhOx(ZVYwcIwZdHl4bjdeh5rKkKJgWe9zG0x0);
    }

    static {
        iZ7l7AVZs9s86s54dnycSkvhZfBvwmit = Path.of(System.getProperty("user.home"), "earthhack", "kits");
        Y6zHEj4cMBufUhoOGwNtIX2BPgXlFVzu = new ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY();
    }

    public /* synthetic */ ZqWNM8ZpjqugLVpTrpCmEC6rwIwdpRGY() {
        this.IKyGqthpTJkZnNkmANISK2U5u3Lxxq2W = new MutableObject(null);
        this.cfr_renamed_449 = new MutableBoolean(false);
    }
}

