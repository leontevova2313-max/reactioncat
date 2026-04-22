/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0716;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class InvLockModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> armor;
    public final /* synthetic */ SecureClass0603<Boolean> offhand;

    public /* synthetic */ InvLockModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "InvLock", SecureClass1004.cfr_renamed_106, "Prevents you from accidentally picking up items", new int[0]);
        this.armor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Armor").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Block all armor slots"));
        this.offhand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Offhand").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Block offhand slot"));
        this.cfr_renamed_69(new SecureClass0716(this));
    }
}

