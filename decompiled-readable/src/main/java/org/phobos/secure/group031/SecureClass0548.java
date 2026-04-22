/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group031;

import engine.linking.NativeMethodHandler;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class SecureClass0548 {
    public static /* synthetic */ String field001;
    public static final /* synthetic */ Map<Long, Long> field002;
    public static final /* synthetic */ Map<Integer, Integer> field003;

    public static /* bridge */ native /* synthetic */ void GRPW1JHcGj7HVZX9qf5NAeGrG7y4laed(String var0);

    public static /* bridge */ /* synthetic */ boolean yvTHIkQ9BHrGzZakmailidaYby1D2pPE(File Oeg91cYEfYZAS4xPjYTVBKiT2ziQwvcy) {
        return Files.isDirectory(Oeg91cYEfYZAS4xPjYTVBKiT2ziQwvcy.toPath(), new LinkOption[0]);
    }

    public static /* bridge */ native /* synthetic */ void xK7NAu8rmMMMA8bDt3DJoFqaHsv7Kh86();

    public static /* bridge */ native /* synthetic */ File WvOkjD8XXznIdoVuwzMlthDE1CPItX0N();

    public static /* bridge */ native /* synthetic */ void start();

    public static /* bridge */ native /* synthetic */ void E7vvPTJKcXc8d62XjdIOI28YTYVaXP3N(Consumer<String> var0);

    public static /* bridge */ /* synthetic */ String DiftDWAlriMkZq7WcCAYrr0krZJjAPX5(long field004) {
        return field004 == 1L ? "" : "s";
    }

    public static /* bridge */ native /* synthetic */ void stop();

    public static /* bridge */ native /* synthetic */ void EuKFOiN8QbAXlmL57KwMaZWrYmEPYZb1();

    static {
        NativeMethodHandler.registerNativeCallbacks(37);
        field003 = new HashMap<Integer, Integer>();
        field002 = new HashMap<Long, Long>();
        SecureClass0548.PBRsEEmNhpzxqJXqEo72QMz1NJAFZUsD();
    }

    public static /* bridge */ native /* synthetic */ void hNQOb0SK1SAZf3q7HAnlkiRAYhTXc5w4();

    public static /* bridge */ native /* synthetic */ void PBRsEEmNhpzxqJXqEo72QMz1NJAFZUsD();
}

