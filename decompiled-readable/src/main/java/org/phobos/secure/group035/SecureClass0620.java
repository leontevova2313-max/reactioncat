/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.chars.Char2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.awt.Font;
import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group011.SIeRhwvmMs3dFHuu19K4louZYuDDFYBt;
import org.phobos.secure.group012.p1JjZ9H5kuUfIqN45LD7tvAtTJ6KAFA8;
import org.phobos.secure.group020.SecureClass0332;

public class SecureClass0620
implements Closeable {
    public /* synthetic */ boolean field001;
    public final /* synthetic */ String field002;
    public static final /* synthetic */ String field003 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
    public final /* synthetic */ Int2ObjectMap<ObjectList<p1JjZ9H5kuUfIqN45LD7tvAtTJ6KAFA8>> field004;
    public /* synthetic */ int field005;
    public final /* synthetic */ float field006;
    public final /* synthetic */ ObjectList<SecureClass0332> field007;
    public /* synthetic */ Font[] field008;
    public final /* synthetic */ ReentrantReadWriteLock field009;
    public /* synthetic */ int field010;
    public static final /* synthetic */ Char2IntArrayMap field011;
    public final /* synthetic */ int field012;
    public final /* synthetic */ int field013;
    public /* synthetic */ Future<Void> field014;
    public static final /* synthetic */ ExecutorService field015;

    public /* synthetic */ SecureClass0620(Font[] fontArray, float f) {
        this(fontArray, f, 256, 5, null);
    }

    public /* synthetic */ SecureClass0620(@NonNull Font[] N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO, float ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme, int l42B4xozwczMA7khyZQci3jH3lPBV15j, int gVhsqe8BFedzvpga6ds86zUwUsiOXGHu) {
        this.field004 = new Int2ObjectOpenHashMap();
        this.field007 = new ObjectArrayList();
        this.field005 = 0;
        this.field010 = -1;
        this.field009 = new ReentrantReadWriteLock();
        if (N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO == null) {
            throw new NullPointerException("fonts is marked non-null but is null");
        }
        Preconditions.checkArgument((ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme > 0.0f ? 1 : 0) != 0, (Object)"sizePx <= 0");
        Preconditions.checkArgument((N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO.length > 0 ? 1 : 0) != 0, (Object)"fonts.length <= 0");
        Preconditions.checkArgument((l42B4xozwczMA7khyZQci3jH3lPBV15j > 4 ? 1 : 0) != 0, (Object)"Unreasonable charactersPerPage count");
        Preconditions.checkArgument((gVhsqe8BFedzvpga6ds86zUwUsiOXGHu > 0 ? 1 : 0) != 0, (Object)"paddingBetweenCharacters <= 0");
        this.field006 = ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme;
        this.field013 = l42B4xozwczMA7khyZQci3jH3lPBV15j;
        this.field012 = gVhsqe8BFedzvpga6ds86zUwUsiOXGHu;
        this.field002 = field003;
        this.gWT6gkaNf10sxa0xWghurCaDzZ9eI9uL(N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO, ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme);
    }

    public /* synthetic */ SecureClass0620(@NonNull Font[] mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71, float ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8, int n, int qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b, @Nullable String a2O0WheDsIwgBepPdbxIJRy9jJJis1Ed) {
        this.field004 = new Int2ObjectOpenHashMap();
        this.field007 = new ObjectArrayList();
        this.field005 = 0;
        this.field010 = -1;
        this.field009 = new ReentrantReadWriteLock();
        if (mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71 == null) {
            throw new NullPointerException("fonts is marked non-null but is null");
        }
        Preconditions.checkArgument((ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8 > 0.0f ? 1 : 0) != 0, (Object)"sizePx <= 0");
        Preconditions.checkArgument((mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71.length > 0 ? 1 : 0) != 0, (Object)"fonts.length <= 0");
        Preconditions.checkArgument((n > 4 ? 1 : 0) != 0, (Object)"Unreasonable charactersPerPage count");
        Preconditions.checkArgument((qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b > 0 ? 1 : 0) != 0, (Object)"paddingBetweenCharacters <= 0");
        this.field006 = ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8;
        this.field013 = n;
        this.field012 = qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b;
        this.field002 = a2O0WheDsIwgBepPdbxIJRy9jJJis1Ed;
        this.gWT6gkaNf10sxa0xWghurCaDzZ9eI9uL(mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71, ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8);
    }

    public static /* bridge */ /* synthetic */ String rM8oDGJLXmxFzscZ1sCQWzKMLysZeOAK(String e1pZjHuqlUXJC5Ew2KvgE7NLMDvhW1XF) {
        char[] field016 = e1pZjHuqlUXJC5Ew2KvgE7NLMDvhW1XF.toCharArray();
        StringBuilder field017 = new StringBuilder();
        int field018 = 0;
        while (field018 < field016.length) {
            char field019 = field016[field018];
            if (field019 == '\u00a7') {
                ++field018;
            } else {
                field017.append(field019);
            }
            ++field018;
        }
        return field017.toString();
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_485(int CcXSnuiRyABRtQfGGm5aK2kzCN3KwDNR, int fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L) {
        return fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L * (int)Math.floor((double)CcXSnuiRyABRtQfGGm5aK2kzCN3KwDNR / (double)fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L);
    }

    static {
        field011 = new SIeRhwvmMs3dFHuu19K4louZYuDDFYBt();
        field015 = Executors.newCachedThreadPool();
    }
}

