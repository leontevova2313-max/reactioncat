/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group007.SecureClass0112;
import org.phobos.secure.group048.SecureEnum0018;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0069
implements SecureInterface0143,
Runnable {
    public /* synthetic */ int field001;
    public /* synthetic */ String[] field002;
    public /* synthetic */ String name;
    public /* synthetic */ SecureClass0112 field003;
    public /* synthetic */ SecureEnum0018 field004;

    @NotNull
    public static /* bridge */ /* synthetic */ SecureClass0069 IVkPmjPaHDiyW9CCdXiniYbCLQaNkeR8(String LcNMf5RY2BiQNIWmSYlXiDPoYyve8BNG, SecureClass0112 rvquXPnmkjYHzh7wTqsHC481QdJZ03oP, SecureClass0069 ... z8nRFqkhU56JoWHpKQSGtLWLHMrezO4C) {
        ArrayList<String> field005 = new ArrayList<String>();
        SecureClass0069[] field006 = z8nRFqkhU56JoWHpKQSGtLWLHMrezO4C;
        int n = field006.length;
        int n2 = 0;
        while (n2 < n) {
            SecureClass0069 field007 = field006[n2];
            field005.addAll(Arrays.asList(field007.field002));
            ++n2;
        }
        return new SecureClass0069(LcNMf5RY2BiQNIWmSYlXiDPoYyve8BNG, field005.toArray(new String[0]), rvquXPnmkjYHzh7wTqsHC481QdJZ03oP, SecureEnum0018.COMBINED);
    }

    public /* synthetic */ SecureClass0069(String HyU1T3jnmDO2xU6VYod7ENQSomyGXgVe, String[] stringArray, SecureClass0112 rvquXPnmkjYHzh7wTqsHC481QdJZ03oP) {
        this(HyU1T3jnmDO2xU6VYod7ENQSomyGXgVe, stringArray, rvquXPnmkjYHzh7wTqsHC481QdJZ03oP, SecureEnum0018.NORMAL);
    }

    public /* synthetic */ SecureClass0069() {
        this.field001 = 0;
    }

    public /* synthetic */ SecureClass0069(String RN0f0AQuLX4g7yQTyeli3mQ2xFtypdjo, String[] stringArray, SecureClass0112 UkrUS6uPomtG3286IM9DANaLjpiUC3xL, SecureEnum0018 vJyNgq4QmU3HlypQvp0ai8CDb15uERc1) {
        this.field001 = 0;
        this.name = RN0f0AQuLX4g7yQTyeli3mQ2xFtypdjo;
        this.field002 = stringArray;
        this.field003 = UkrUS6uPomtG3286IM9DANaLjpiUC3xL;
        this.field004 = vJyNgq4QmU3HlypQvp0ai8CDb15uERc1;
    }

    @Nullable
    public static /* bridge */ /* synthetic */ SecureClass0069 SzcAc3FWHabgDM22mGbAvODHeSE4etg0(String FPlVlazw9F0TPgbeVIvQdbXGErg4Ku2b, SecureClass0112 YNNUeFX9fNfzERQELSZcK9cnnqAdYngd, SecureClass0069 ... vH6ZNUozw2U8UM9L9e3gnZUwkQoJwu11) {
        ArrayList<String> arrayList = new ArrayList<String>();
        int field008 = 0;
        for (SecureClass0069 t4nQUAv6UyzA1lG1c1ZGqtOSwWHZxdlH : vH6ZNUozw2U8UM9L9e3gnZUwkQoJwu11) {
            if (!t4nQUAv6UyzA1lG1c1ZGqtOSwWHZxdlH.cfr_renamed_127().equals((Object)((Object)SecureEnum0018.NORMAL))) continue;
            arrayList.addAll(Arrays.asList(t4nQUAv6UyzA1lG1c1ZGqtOSwWHZxdlH.field002));
            ++field008;
        }
        if (field008 == 0) {
            return null;
        }
        return new SecureClass0069(FPlVlazw9F0TPgbeVIvQdbXGErg4Ku2b, arrayList.toArray(new String[0]), YNNUeFX9fNfzERQELSZcK9cnnqAdYngd, SecureEnum0018.SWITCH);
    }
}

