/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group056;

import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.digest.Md5Crypt;

public class SecureClass1018 {
    public static /* bridge */ /* synthetic */ String FZNUwU4U6GJwaoGDVUFDPRZpOC3HhFJJ(String string, String x83HXv0QsYjvSjZekKsNihW6vWGbCuny) {
        return Md5Crypt.md5Crypt((byte[])string.getBytes(StandardCharsets.UTF_8), (String)x83HXv0QsYjvSjZekKsNihW6vWGbCuny);
    }

    public static /* bridge */ /* synthetic */ String z1oUvaNd9qhtgh3ECsEhpbxKN136z62r(String g6apFypqB3MiIHDo2JG5kSp1rR40lNMC) {
        return Md5Crypt.md5Crypt((byte[])g6apFypqB3MiIHDo2JG5kSp1rR40lNMC.getBytes(StandardCharsets.UTF_8));
    }
}

