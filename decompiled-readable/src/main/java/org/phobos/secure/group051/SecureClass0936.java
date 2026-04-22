/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import net.minecraft.class_2338;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.tmJrVr0sV8jaAcbttGIxuFgJaG0T6cYO;
import org.phobos.secure.group025.SecureClass0426;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group045.INgOIqiKdh56bcqUo3rCnzhmw66li7PA;
import org.phobos.secure.group045.RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt;

public class SecureClass0936
extends SecureClass0214 {
    public final /* synthetic */ MutableObject<class_2338> field001;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> field002;
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Integer>> field003;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field004;
    public final /* synthetic */ SecureClass0603<RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt> mode;
    public final /* synthetic */ SecureClass0603<INgOIqiKdh56bcqUo3rCnzhmw66li7PA> field005;

    public /* synthetic */ SecureClass0936(SecureClass0242 g8P3Ow4YnFh07caUKADASjSBenK20Q7x) {
        super(g8P3Ow4YnFh07caUKADASjSBenK20Q7x, "AutoEnderChest", "Farms obsidian from enderchests", SecureClass1004.cfr_renamed_106, 1);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt>("Mode", RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt.Mine));
        this.field005 = new SecureClass0033<INgOIqiKdh56bcqUo3rCnzhmw66li7PA>("Block", INgOIqiKdh56bcqUo3rCnzhmw66li7PA.None).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (INgOIqiKdh56bcqUo3rCnzhmw66li7PA)((Object)RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt.Mine)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0547("Wait", 500L, 50L, 5000L).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt.Combat).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0426<Integer>("Tick", 1, Integer.valueOf(1), Integer.valueOf(3), new String[0]).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt.Combat).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field001 = new MutableObject(null);
        this.field004 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.wQmStBqRMLz8129caFX4oSmE9yGtCMQV().forEach(u2BfB98sMvAH4OBH7t1hZ3xpFY47HzSf -> u2BfB98sMvAH4OBH7t1hZ3xpFY47HzSf.Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, RQZIw2q4lkhb4MdkOVReJH6vvGp5MaOt.Mine));
        this.cfr_renamed_69(new tmJrVr0sV8jaAcbttGIxuFgJaG0T6cYO(this, g8P3Ow4YnFh07caUKADASjSBenK20Q7x));
    }
}

