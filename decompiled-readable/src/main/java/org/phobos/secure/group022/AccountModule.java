/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

import net.minecraft.class_124;
import net.minecraft.class_2561;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.SecureClass0310;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group041.FNPFavjE6HylVdEinqxeFQGPBBefHwSk;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group044.SecureClass0788;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AccountModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<String> field001;
    public final /* synthetic */ SecureClass0603<String> name;
    public final /* synthetic */ SecureClass0603<String> password;
    public final /* synthetic */ SecureClass0603<Boolean> login;

    public /* synthetic */ AccountModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Account", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Spoofs your name and UUID", new int[0]);
        this.name = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Name", "Player999").xignl4As3eD3GKl6DCMH5smwpBuANNaF(16));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Email", "").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.password = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Password", "").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.login = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Login").an6rGH3Mler2DHQI4OcLCKOfiEv8mCG8());
        this.cfr_renamed_69(new FNPFavjE6HylVdEinqxeFQGPBBefHwSk(this));
        this.cfr_renamed_89("Microsoft", this.field001, this.password, this.login);
        this.login.cfr_renamed_123(bl -> {
            if (bl.booleanValue()) {
                try {
                    SecureClass0310.login(this.field001.getValue(), this.password.getValue());
                }
                catch (SecureClass0788 MvupOwD48ZYzhPykN8eOGr1tsqstkNHp) {
                    this.sfFqEwZf1RlG36qMMiMtFTu84thFYxKS((class_2561)class_2561.method_43470((String)"Failed to login!").method_27692(class_124.field_1061));
                }
            }
        });
    }
}

