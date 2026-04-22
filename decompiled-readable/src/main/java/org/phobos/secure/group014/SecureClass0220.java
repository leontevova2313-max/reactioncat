/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group054.SecureInterface0130;

public class SecureClass0220
implements SecureInterface0130,
SecureInterface0050 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    @Nullable
    public /* synthetic */ String field002;
    public /* synthetic */ SecureInterface0130 field003;
    public final /* synthetic */ List<SecureClass0603<?>> field004;
    public final /* synthetic */ String name;

    public /* synthetic */ SecureClass0220(String kybbYWPmNB6pKC8xVyRozsMIFhovsm15, SecureClass0603<?> ... g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYsArray) {
        this.field004 = new ArrayList<SecureClass0603<?>>();
        this.field003 = SecureInterface0130.Z9Q347xopZXa5TwDjWAtOpsPhqjNSjpP;
        this.name = kybbYWPmNB6pKC8xVyRozsMIFhovsm15;
        this.field001 = null;
        Collections.addAll(this.field004, g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYsArray);
    }

    @Contract(pure=true)
    public /* synthetic */ SecureClass0220(SecureClass0603<Boolean> syFaxxlf8TRwHcwKXuqWeGJYiSl2kaD7, SecureClass0603<?> ... bLiNC537pA7OfcSqQFQvqaB7wTfe7C0K) {
        this.field004 = new ArrayList<SecureClass0603<?>>();
        this.field003 = SecureInterface0130.Z9Q347xopZXa5TwDjWAtOpsPhqjNSjpP;
        this.name = syFaxxlf8TRwHcwKXuqWeGJYiSl2kaD7.getName();
        this.field001 = syFaxxlf8TRwHcwKXuqWeGJYiSl2kaD7;
        Collections.addAll(this.field004, bLiNC537pA7OfcSqQFQvqaB7wTfe7C0K);
    }
}

