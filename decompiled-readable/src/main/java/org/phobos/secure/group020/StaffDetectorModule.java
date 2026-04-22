/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group020;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group029.SecureClass0512;
import org.phobos.secure.group032.SecureClass0571;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.G28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8;
import org.phobos.secure.group045.SecureClass0802;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class StaffDetectorModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0802 field001;
    public final /* synthetic */ SecureClass0603<Boolean> leave;
    public final /* synthetic */ SecureClass0603<String> leaveCommand;
    public final /* synthetic */ SecureClass0603<G28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8> mode;
    public final /* synthetic */ SecureClass0603<String> chatElement;
    public final /* synthetic */ SecureClass0603<Boolean> chat;

    public /* synthetic */ StaffDetectorModule(SecureClass0242 MBXHKqrxnn2Cyj7FSvKeZALGMcRmhr8M) {
        super(MBXHKqrxnn2Cyj7FSvKeZALGMcRmhr8M, "StaffDetector", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<G28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8>("Mode", G28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8.Hypixel));
        this.chat = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Chat").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Sends something to in-game chat"));
        this.chatElement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("ChatElement", "[!] %s is a staff."));
        this.leave = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Leave").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Runs leave command when staff is detected"));
        this.leaveCommand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("LeaveCommand", "leave"));
        this.field001 = new SecureClass0802();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.chat, this.chatElement);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.leave, this.leaveCommand);
        this.cfr_renamed_69(new SecureClass0571(this));
        this.field001.MPc9tLaFi3LYiJH2FwvPkd4D55QiKKtY(this.mode.getValue().getKey());
        this.mode.cfr_renamed_123(g28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8 -> this.field001.MPc9tLaFi3LYiJH2FwvPkd4D55QiKKtY(g28k1jYakGDVsyHUXoGiWoDdwNNMDpJ8.getKey()));
        SecureClass0512.cfr_renamed_456(this.field001::OoG95mF5T9febXYoYpyLhl9ythRcS9nG);
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

