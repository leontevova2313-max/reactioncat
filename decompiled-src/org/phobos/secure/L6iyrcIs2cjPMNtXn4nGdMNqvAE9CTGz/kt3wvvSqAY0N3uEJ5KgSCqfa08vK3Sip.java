/*
 * Decompiled with CFR.
 */
package org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz;

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
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.SIeRhwvmMs3dFHuu19K4louZYuDDFYBt;
import org.phobos.secure.7KgfbqPz0TZEvgx4F8x37flDNykxuB6z.p1JjZ9H5kuUfIqN45LD7tvAtTJ6KAFA8;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.ps9cJ1XQlWLavF3B0adE4sHV2jTX9xmb;

public class kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip
implements Closeable {
    public /* synthetic */ boolean MBJG0JEOZ7gwbimPDt9myEdvYgMuhBwS;
    public final /* synthetic */ String PyEQu1TSDLaY17myVL28wC5YVoQQp640;
    public static final /* synthetic */ String PiPtGEWRqQFkRz9rT6LFV4CQOLSqGROw = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";
    public final /* synthetic */ Int2ObjectMap<ObjectList<p1JjZ9H5kuUfIqN45LD7tvAtTJ6KAFA8>> nKsE4ByBFIprOTU8MdWehX93u0JUO2eG;
    public /* synthetic */ int Et6jS15JUD6WtdTwEKcb2lLgmXsCzeX6;
    public final /* synthetic */ float cfr_renamed_484;
    public final /* synthetic */ ObjectList<ps9cJ1XQlWLavF3B0adE4sHV2jTX9xmb> X3UDFv4QCHLwDg6q3ALEDzOHduYvbR4w;
    public /* synthetic */ Font[] I3A19D8pRPeuKKIvNiDk5MDpGojDydRY;
    public final /* synthetic */ ReentrantReadWriteLock s1Qh3iKn9oInslZuUR5J6YPiSXjFi1re;
    public /* synthetic */ int gL0JI1ZSihd6VLmnlMwdwl9Z9IAlyLTW;
    public static final /* synthetic */ Char2IntArrayMap gobmJb3Ly6rjMZKTzzqza4WqqW2azk65;
    public final /* synthetic */ int WdOrIbu6skyF38wxrzbWM188ecQdYww5;
    public final /* synthetic */ int V9e9w86VwvpvINQyOQbAXDppttqEfdLk;
    public /* synthetic */ Future<Void> B0UrCrCHIiK0HEBk7TLr8MraPlfvKVkK;
    public static final /* synthetic */ ExecutorService CbdPZEoCF4nsI5zjxTbl75BWUpBlhx4T;

    public /* synthetic */ kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip(Font[] fontArray, float f) {
        this(fontArray, f, 256, 5, null);
    }

    public /* synthetic */ kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip(@NonNull Font[] N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO, float ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme, int l42B4xozwczMA7khyZQci3jH3lPBV15j, int gVhsqe8BFedzvpga6ds86zUwUsiOXGHu) {
        this.nKsE4ByBFIprOTU8MdWehX93u0JUO2eG = new Int2ObjectOpenHashMap();
        this.X3UDFv4QCHLwDg6q3ALEDzOHduYvbR4w = new ObjectArrayList();
        this.Et6jS15JUD6WtdTwEKcb2lLgmXsCzeX6 = 0;
        this.gL0JI1ZSihd6VLmnlMwdwl9Z9IAlyLTW = -1;
        this.s1Qh3iKn9oInslZuUR5J6YPiSXjFi1re = new ReentrantReadWriteLock();
        if (N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO == null) {
            throw new NullPointerException("fonts is marked non-null but is null");
        }
        Preconditions.checkArgument((ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme > 0.0f ? 1 : 0) != 0, (Object)"sizePx <= 0");
        Preconditions.checkArgument((N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO.length > 0 ? 1 : 0) != 0, (Object)"fonts.length <= 0");
        Preconditions.checkArgument((l42B4xozwczMA7khyZQci3jH3lPBV15j > 4 ? 1 : 0) != 0, (Object)"Unreasonable charactersPerPage count");
        Preconditions.checkArgument((gVhsqe8BFedzvpga6ds86zUwUsiOXGHu > 0 ? 1 : 0) != 0, (Object)"paddingBetweenCharacters <= 0");
        this.cfr_renamed_484 = ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme;
        this.V9e9w86VwvpvINQyOQbAXDppttqEfdLk = l42B4xozwczMA7khyZQci3jH3lPBV15j;
        this.WdOrIbu6skyF38wxrzbWM188ecQdYww5 = gVhsqe8BFedzvpga6ds86zUwUsiOXGHu;
        this.PyEQu1TSDLaY17myVL28wC5YVoQQp640 = PiPtGEWRqQFkRz9rT6LFV4CQOLSqGROw;
        this.gWT6gkaNf10sxa0xWghurCaDzZ9eI9uL(N2v4N5EQhQfgohGXI02pU8YjnaxTg0UO, ZFf9w6JlSWTtXp4pH0RsGWgKmsBPyCme);
    }

    public /* synthetic */ kt3wvvSqAY0N3uEJ5KgSCqfa08vK3Sip(@NonNull Font[] mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71, float ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8, int n, int qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b, @Nullable String a2O0WheDsIwgBepPdbxIJRy9jJJis1Ed) {
        this.nKsE4ByBFIprOTU8MdWehX93u0JUO2eG = new Int2ObjectOpenHashMap();
        this.X3UDFv4QCHLwDg6q3ALEDzOHduYvbR4w = new ObjectArrayList();
        this.Et6jS15JUD6WtdTwEKcb2lLgmXsCzeX6 = 0;
        this.gL0JI1ZSihd6VLmnlMwdwl9Z9IAlyLTW = -1;
        this.s1Qh3iKn9oInslZuUR5J6YPiSXjFi1re = new ReentrantReadWriteLock();
        if (mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71 == null) {
            throw new NullPointerException("fonts is marked non-null but is null");
        }
        Preconditions.checkArgument((ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8 > 0.0f ? 1 : 0) != 0, (Object)"sizePx <= 0");
        Preconditions.checkArgument((mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71.length > 0 ? 1 : 0) != 0, (Object)"fonts.length <= 0");
        Preconditions.checkArgument((n > 4 ? 1 : 0) != 0, (Object)"Unreasonable charactersPerPage count");
        Preconditions.checkArgument((qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b > 0 ? 1 : 0) != 0, (Object)"paddingBetweenCharacters <= 0");
        this.cfr_renamed_484 = ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8;
        this.V9e9w86VwvpvINQyOQbAXDppttqEfdLk = n;
        this.WdOrIbu6skyF38wxrzbWM188ecQdYww5 = qbSnS8QTBKhlP5nmvhy9ED0mqigVQr4b;
        this.PyEQu1TSDLaY17myVL28wC5YVoQQp640 = a2O0WheDsIwgBepPdbxIJRy9jJJis1Ed;
        this.gWT6gkaNf10sxa0xWghurCaDzZ9eI9uL(mT9WHmOcLdZtBYVuZfAzWOPFPVKbbE71, ScwUtdmevIQuxRWHWcFZFxTLUTGWxRG8);
    }

    public static /* bridge */ /* synthetic */ String rM8oDGJLXmxFzscZ1sCQWzKMLysZeOAK(String e1pZjHuqlUXJC5Ew2KvgE7NLMDvhW1XF) {
        char[] X6u6R1yyrUmHxq9yRYWSWPl5FePX9Ut2 = e1pZjHuqlUXJC5Ew2KvgE7NLMDvhW1XF.toCharArray();
        StringBuilder mSKcyo5Ofn4xnhEHrn1SCahhUDdgPdQG = new StringBuilder();
        int uhbNBsme5hO7oSHjZAM1aTNY5QDZHYBp = 0;
        while (uhbNBsme5hO7oSHjZAM1aTNY5QDZHYBp < X6u6R1yyrUmHxq9yRYWSWPl5FePX9Ut2.length) {
            char YH1Z6sCdWNgH0yYT8nLwTyqWmc4FAEtP = X6u6R1yyrUmHxq9yRYWSWPl5FePX9Ut2[uhbNBsme5hO7oSHjZAM1aTNY5QDZHYBp];
            if (YH1Z6sCdWNgH0yYT8nLwTyqWmc4FAEtP == '\u00a7') {
                ++uhbNBsme5hO7oSHjZAM1aTNY5QDZHYBp;
            } else {
                mSKcyo5Ofn4xnhEHrn1SCahhUDdgPdQG.append(YH1Z6sCdWNgH0yYT8nLwTyqWmc4FAEtP);
            }
            ++uhbNBsme5hO7oSHjZAM1aTNY5QDZHYBp;
        }
        return mSKcyo5Ofn4xnhEHrn1SCahhUDdgPdQG.toString();
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_485(int CcXSnuiRyABRtQfGGm5aK2kzCN3KwDNR, int fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L) {
        return fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L * (int)Math.floor((double)CcXSnuiRyABRtQfGGm5aK2kzCN3KwDNR / (double)fZff1jjmnyZqD2cl8LKV4dv9DhI1TA3L);
    }

    static {
        gobmJb3Ly6rjMZKTzzqza4WqqW2azk65 = new SIeRhwvmMs3dFHuu19K4louZYuDDFYBt();
        CbdPZEoCF4nsI5zjxTbl75BWUpBlhx4T = Executors.newCachedThreadPool();
    }
}

