/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group049;

import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.SecureClass0426;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group036.SE5YbhY9yYQRf8GNUwttrDTVUH47tWDd;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoSoupModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Float>> health;
    public final /* synthetic */ SecureClass0603<Boolean> drop;
    public final /* synthetic */ SecureClass0603<Boolean> refill;

    public /* synthetic */ AutoSoupModule(SecureClass0242 JUCCEo63cFF1UEpHM5HUveH4mgocbaVL) {
        super(JUCCEo63cFF1UEpHM5HUveH4mgocbaVL, "AutoSoup", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Automatically uses mushroom stew to heal you", new int[0]);
        this.health = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0426<Float>("Health", Float.valueOf(6.0f), Float.valueOf(1.0f), Float.valueOf(16.0f), new String[0]));
        this.drop = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Drop"));
        this.refill = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Refill"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.drop, this.refill);
        this.cfr_renamed_69(new SE5YbhY9yYQRf8GNUwttrDTVUH47tWDd(this, JUCCEo63cFF1UEpHM5HUveH4mgocbaVL));
    }
}

