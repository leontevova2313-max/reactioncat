/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group052;

import java.awt.Color;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.lang3.builder.HashCodeExclude;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group025.SecureClass0438;
import org.phobos.secure.group034.BbXI7ivZXrzJO6WxNQGOYFpewZUSSFdD;
import org.phobos.secure.group038.SecureClass0658;
import org.phobos.secure.group039.SecureClass0688;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group051._111eu35nylPLZG3cJ60q5em7VtMSkj0h;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group042.SecureClass0755;

public class SecureClass0950<T>
extends SecureClass0438<Set<T>, SecureClass0688<T>> {
    @HashCodeExclude
    public final /* synthetic */ Color field001;
    @HashCodeExclude
    public final /* synthetic */ Color field002;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field003;
    public final /* synthetic */ SecureClass0377 field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ String field006;
    public /* synthetic */ String field007;
    public /* synthetic */ boolean field008;
    public final /* synthetic */ BbXI7ivZXrzJO6WxNQGOYFpewZUSSFdD field009;
    public final /* synthetic */ Set<T> field010;
    @HashCodeExclude
    public final /* synthetic */ Color field011;
    public final /* synthetic */ Set<_111eu35nylPLZG3cJ60q5em7VtMSkj0h<T>> field012;

    public /* synthetic */ SecureClass0950(SecureClass0874 Lgd4F6CNYbQGm9X3e3uYneQbNb385Wmi, SecureClass0755 mmbwltnD0jXnhB07byf3dFCkcw2DkJdN, float QJqP99X45sq0oMjYCokWAgdqToMKlpLg, float lVkH38xCcwF3yxP9ufnNs8Gs86oehXgh, float f, float dMFCFl5zmQAySZJePTKeeNbGh1BL4ksl, SecureClass0658 ekh33WofyqFD9V9P2uB5vJQH742Oe77J, String Rw1mU4FaBuxvhO51mVSWr8SzoXZTEKIY, SecureClass0688<T> z8enE7LqZH0g3D13ei8t5YUP9Heab4er2) {
        super(Lgd4F6CNYbQGm9X3e3uYneQbNb385Wmi, mmbwltnD0jXnhB07byf3dFCkcw2DkJdN, QJqP99X45sq0oMjYCokWAgdqToMKlpLg, lVkH38xCcwF3yxP9ufnNs8Gs86oehXgh, f, dMFCFl5zmQAySZJePTKeeNbGh1BL4ksl, ekh33WofyqFD9V9P2uB5vJQH742Oe77J, Rw1mU4FaBuxvhO51mVSWr8SzoXZTEKIY, z8enE7LqZH0g3D13ei8t5YUP9Heab4er2);
        this.field004 = new SecureClass0377();
        this.field003 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field010 = new HashSet<T>();
        this.field012 = new HashSet<_111eu35nylPLZG3cJ60q5em7VtMSkj0h<T>>();
        this.field002 = new Color(255, 255, 255, 70);
        this.field001 = new Color(255, 0, 0, 40);
        this.field011 = new Color(0, 0, 0, 70);
        Iterator<E> iterator = ((Set)z8enE7LqZH0g3D13ei8t5YUP9Heab4er2.getValue()).iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.field009 = new BbXI7ivZXrzJO6WxNQGOYFpewZUSSFdD("");
                this.field006 = "";
                return;
            }
            E e = iterator.next();
            this.field010.add(e);
            this.field012.add(new _111eu35nylPLZG3cJ60q5em7VtMSkj0h<E>(e, ((SecureClass0688)this.cfr_renamed_811()).kuXT4DdGwM5wTQ3IgWGoaMwY5F0xborp().apply(e), ((SecureClass0688)this.cfr_renamed_811()).WxtSi7jb35dcFJtarU98icg7aexJhXwv().apply(e)));
        }
    }
}

