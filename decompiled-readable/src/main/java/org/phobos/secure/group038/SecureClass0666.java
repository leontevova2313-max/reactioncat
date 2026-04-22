/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group038;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.phobos.secure.group007.SecureClass0112;
import org.phobos.secure.group047.SecureInterface0115;
import org.phobos.secure.group047.SecureEnum0017;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0666
implements SecureInterface0143,
SecureInterface0115<SecureClass0112> {
    public /* synthetic */ SecureEnum0017 field001;
    public final /* synthetic */ Set<SecureClass0112> field002;

    public /* synthetic */ SecureClass0666(SecureEnum0017 a3GMAvmJhtraIULIp4gY0BBNkzVLJ4AE, SecureClass0112 ... lJ7qd5ix3tKKzul7kfdaBO2kyGdfQycT) {
        this(new HashSet<SecureClass0112>(Arrays.stream(lJ7qd5ix3tKKzul7kfdaBO2kyGdfQycT).toList()));
        this.field001 = a3GMAvmJhtraIULIp4gY0BBNkzVLJ4AE;
    }

    public /* synthetic */ SecureClass0666(Set<SecureClass0112> b0lSDy3s0v2kULhmmo5lFQWUATf9yWQU) {
        this.field001 = SecureEnum0017.Normal;
        this.field002 = b0lSDy3s0v2kULhmmo5lFQWUATf9yWQU;
    }

    public static /* bridge */ /* synthetic */ SecureClass0666 i9k5UEbxK6Oajly6lgnCcci5XUh6Whfb() {
        return new SecureClass0666(new SecureClass0112[0]);
    }

    public /* synthetic */ SecureClass0666(SecureClass0112 ... rvquXPnmkjYHzh7wTqsHC481QdJZ03oPArray) {
        this(new HashSet<SecureClass0112>(Arrays.stream(rvquXPnmkjYHzh7wTqsHC481QdJZ03oPArray).toList()));
    }
}

