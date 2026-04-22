/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group006.uCxj1hUJEyj1BZ0PMyIgvbud1T0xmc6g;
import org.phobos.secure.group024.ClogsacASK2aLUyFOZoP2DEIshMDhBT2;
import org.phobos.secure.group027.Vn0ORIF1yRBgiVzlESEcfQHuPiI8cIij;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0247
extends SecureClass0966 {
    public final /* synthetic */ Map<Vn0ORIF1yRBgiVzlESEcfQHuPiI8cIij, Integer> field001;
    public final /* synthetic */ Map<Runnable, Integer> field002;
    public final /* synthetic */ Map<uCxj1hUJEyj1BZ0PMyIgvbud1T0xmc6g, Integer> field003;

    public /* synthetic */ SecureClass0247() {
        this.field001 = new ConcurrentHashMap<Vn0ORIF1yRBgiVzlESEcfQHuPiI8cIij, Integer>();
        this.field003 = new ConcurrentHashMap<uCxj1hUJEyj1BZ0PMyIgvbud1T0xmc6g, Integer>();
        this.field002 = new ConcurrentHashMap<Runnable, Integer>();
        this.cfr_renamed_69(new ClogsacASK2aLUyFOZoP2DEIshMDhBT2(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field001.clear();
            this.field003.clear();
            this.field002.clear();
        });
    }
}

