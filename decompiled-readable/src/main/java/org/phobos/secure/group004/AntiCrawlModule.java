/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group004;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.j8W78Q3wilDnKsAke0TNJcOHBBcQnCci;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0552;
import org.phobos.secure.group042.SecureClass0746;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AntiCrawlModule
extends SecureClass1027 {
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<j8W78Q3wilDnKsAke0TNJcOHBBcQnCci> mode;
    public final /* synthetic */ SecureClass0603<Boolean> invert;
    public final /* synthetic */ SecureClass0603<Integer> ticks;

    public /* synthetic */ AntiCrawlModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AntiCrawl", SecureClass1004.cfr_renamed_106, "Helps you escape swimming spaces", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<j8W78Q3wilDnKsAke0TNJcOHBBcQnCci>("Mode", j8W78Q3wilDnKsAke0TNJcOHBBcQnCci.Clip));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 2, 1, 5).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, j8W78Q3wilDnKsAke0TNJcOHBBcQnCci.Clip));
        this.invert = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Invert").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Looks up when clipping").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, j8W78Q3wilDnKsAke0TNJcOHBBcQnCci.Clip));
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.cfr_renamed_69(new SecureClass0552(this));
        this.cfr_renamed_69(new SecureClass0746(this));
    }
}

