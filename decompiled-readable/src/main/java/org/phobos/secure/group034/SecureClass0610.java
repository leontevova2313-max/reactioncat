/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group034;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group014.SecureClass0230;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group033.nxG78VpURU4PbjR6G82xiDgW2dNTUb3u;
import org.phobos.secure.group041.SecureClass0735;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0610
extends SecureClass0966 {
    public final /* synthetic */ Map<SecureClass0230, Long> field001;
    public final /* synthetic */ SecureClass0242 field002;

    public /* synthetic */ SecureClass0610(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        this.field001 = new ConcurrentHashMap<SecureClass0230, Long>();
        this.field002 = ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.fDnXU6aUnQ5WrX7n7hVKqFXaTGcEObzI().RnnUuNNh3JW28ws7linsjvyVcjubYo13(SecureClass0735.class, kd86pn3DNEZkFssvquj5l7nuWAHSFah8 -> {
            SecureClass0230 field003;
            if (this.field001.isEmpty()) {
                return;
            }
            String field004 = kd86pn3DNEZkFssvquj5l7nuWAHSFah8.qQRMijNhqWInjq1JmGakBvwLYawxbTwN();
            Iterator<SecureClass0230> iterator = this.field001.keySet().iterator();
            do {
                if (iterator.hasNext()) continue;
                return;
            } while (!(field003 = iterator.next()).cfr_renamed_480().equals(field004));
            field003.CToFBjQCCATVUliHYLhlic0ydwSk4C81().IUAZofhnDCkjjoTAGH5i51Bh7UkGpjHe(kd86pn3DNEZkFssvquj5l7nuWAHSFah8.getMessage());
            this.field001.remove(field003);
        });
        this.cfr_renamed_69(new nxG78VpURU4PbjR6G82xiDgW2dNTUb3u(this));
    }
}

