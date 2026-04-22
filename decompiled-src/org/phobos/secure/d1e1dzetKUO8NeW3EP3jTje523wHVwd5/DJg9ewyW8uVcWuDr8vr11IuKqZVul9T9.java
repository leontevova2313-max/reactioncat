/*
 * Decompiled with CFR.
 */
package org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5;

import net.minecraft.class_124;
import net.minecraft.class_2561;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
import org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn.NgjULeV3tmt7F8kooxmZygNSrhnwbXd1;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.FNPFavjE6HylVdEinqxeFQGPBBefHwSk;
import org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l.jAjUdhSJZoq13PSzPZw48f1KQAflzpMr;
import org.phobos.secure.pc6HIQuJAclXcc4JCpbef8Fre45f1Kdg.UgbL8oLi2FziCPshmWDWl1qyMeZnNpSt;
import org.phobos.secure.ulFKkKf3PI2HUx83QjvCny5RVdQ1JbCt.kXkRqFr8JYolDfdY9ZHctL8DnfGR4bre;
import org.phobos.secure.ulFKkKf3PI2HUx83QjvCny5RVdQ1JbCt.u1fPR9SaS8gENKk8HJQRPhYiPbYpKcom;

public class DJg9ewyW8uVcWuDr8vr11IuKqZVul9T9
extends u1fPR9SaS8gENKk8HJQRPhYiPbYpKcom {
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<String> cfr_renamed_756;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<String> RoLJxF0QqDiUOz6HqOkp2AQUqxPHqI6j;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<String> xwiDie5mkdwwVI9DPC75XDAanZ5LnoZW;
    public final /* synthetic */ g77G8vOcsOCkBD4vxs1B9Tu4ZA82vvYs<Boolean> CiaLB9m6PiQZc1VPv7m8Bys7vWMxsPeQ;

    public /* synthetic */ DJg9ewyW8uVcWuDr8vr11IuKqZVul9T9(EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Account", jAjUdhSJZoq13PSzPZw48f1KQAflzpMr.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Spoofs your name and UUID", new int[0]);
        this.RoLJxF0QqDiUOz6HqOkp2AQUqxPHqI6j = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC("Name", "Player999").xignl4As3eD3GKl6DCMH5smwpBuANNaF(16));
        this.cfr_renamed_756 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC("Email", "").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.xwiDie5mkdwwVI9DPC75XDAanZ5LnoZW = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new qhQ6mQs8dI49tyn8fx5jI2K1B4etv3hC("Password", "").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.CiaLB9m6PiQZc1VPv7m8Bys7vWMxsPeQ = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new kXkRqFr8JYolDfdY9ZHctL8DnfGR4bre("Login").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.cfr_renamed_69(new FNPFavjE6HylVdEinqxeFQGPBBefHwSk(this));
        this.cfr_renamed_89("Microsoft", this.cfr_renamed_756, this.xwiDie5mkdwwVI9DPC75XDAanZ5LnoZW, this.CiaLB9m6PiQZc1VPv7m8Bys7vWMxsPeQ);
        this.CiaLB9m6PiQZc1VPv7m8Bys7vWMxsPeQ.cfr_renamed_123(bl -> {
            if (bl.booleanValue()) {
                try {
                    NgjULeV3tmt7F8kooxmZygNSrhnwbXd1.login(this.cfr_renamed_756.getValue(), this.xwiDie5mkdwwVI9DPC75XDAanZ5LnoZW.getValue());
                }
                catch (UgbL8oLi2FziCPshmWDWl1qyMeZnNpSt MvupOwD48ZYzhPykN8eOGr1tsqstkNHp) {
                    this.sfFqEwZf1RlG36qMMiMtFTu84thFYxKS((class_2561)class_2561.method_43470((String)"Failed to login!").method_27692(class_124.field_1061));
                }
            }
        });
    }
}

