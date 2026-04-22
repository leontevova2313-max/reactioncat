/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group039;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import net.minecraft.class_1799;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group022.SecureInterface0061;
import org.phobos.secure.group036.SecureInterface0092;
import org.phobos.secure.group042.SecureClass0737;

public class SecureClass0688<T>
extends SecureClass0603<Set<T>> {
    public final /* synthetic */ SecureInterface0061<T> field001;
    public final /* synthetic */ SecureClass0737<T> field002;
    public /* synthetic */ int limit;
    public final /* synthetic */ Function<T, class_1799> field003;
    public final /* synthetic */ Function<T, String> field004;
    public final /* synthetic */ SecureInterface0092 field005;

    public /* synthetic */ SecureClass0688(String g6aMcbx3NEYDfxaRoLOpRaUmZR2PR6Im, SecureInterface0061<T> E1YP8haSQ1wccC4ZEYyzUdIg3Hddthfz, Function<T, class_1799> YdJ7qRT8r6ahr0qBW9DL5Pov9Ke8Ri6y, Function<T, String> HGSm29Ls1EtFfN8hXpLdGaFhKOpYi6jG, SecureInterface0092 LGrVazH8reT4uumCmTIXWmvnnD18Wjex) {
        this(g6aMcbx3NEYDfxaRoLOpRaUmZR2PR6Im, new HashSet<E>(), E1YP8haSQ1wccC4ZEYyzUdIg3Hddthfz, YdJ7qRT8r6ahr0qBW9DL5Pov9Ke8Ri6y, HGSm29Ls1EtFfN8hXpLdGaFhKOpYi6jG, LGrVazH8reT4uumCmTIXWmvnnD18Wjex);
    }

    public /* synthetic */ SecureClass0688(String F8CBTg0lKrs5ZJxqQSmbcVQUjH23ifUp, Set<T> set, SecureInterface0061<T> u5gjs0pp4LyrPOqL14nvMiPoMROIMKzH, Function<T, class_1799> function, Function<T, String> WQS3Vl06wA4zGPxLwxJaEWl3h63nuGzg, SecureInterface0092 bbpkV5BssLekw3STjm9JWNf31oEw9IzL) {
        this(F8CBTg0lKrs5ZJxqQSmbcVQUjH23ifUp, "", set, u5gjs0pp4LyrPOqL14nvMiPoMROIMKzH, function, WQS3Vl06wA4zGPxLwxJaEWl3h63nuGzg, bbpkV5BssLekw3STjm9JWNf31oEw9IzL);
    }

    public /* synthetic */ SecureClass0688(String QXQleGQ4Te3dOZiyhO0X1lCDsS3hoTYB, @Nullable String HbKRdksfWZd9AsmyuonKa9eKl6k7gZfh, Set<T> jRQ8WFVUZOR0nsKj3KCsQfOGS9sen9e9, SecureInterface0061<T> C9sjuTviqQW8NLZvzrrwpI6FaWNPbtNn, Function<T, class_1799> jDfIkpGd25KwKRRr5KO9ZbXF68t8WisB, Function<T, String> Kdd4hhlmzEnb2BneeYmiL23H5NsnoqZF, SecureInterface0092 zvJbVcujyZdDzhOoNKABD5coeUBXHNuU) {
        super(QXQleGQ4Te3dOZiyhO0X1lCDsS3hoTYB, HbKRdksfWZd9AsmyuonKa9eKl6k7gZfh, jRQ8WFVUZOR0nsKj3KCsQfOGS9sen9e9);
        this.limit = -1;
        this.field002 = new SecureClass0737<T>();
        this.field001 = C9sjuTviqQW8NLZvzrrwpI6FaWNPbtNn;
        this.field003 = jDfIkpGd25KwKRRr5KO9ZbXF68t8WisB;
        this.field004 = Kdd4hhlmzEnb2BneeYmiL23H5NsnoqZF;
        this.field005 = zvJbVcujyZdDzhOoNKABD5coeUBXHNuU;
    }
}

