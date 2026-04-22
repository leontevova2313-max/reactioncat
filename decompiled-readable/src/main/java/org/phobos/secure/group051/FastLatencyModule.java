/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import org.phobos.secure.group001.o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group015._8DdlWXjhPDBp3JAP87eHmxNIHSt6i68w;
import org.phobos.secure.group026.grRaa4uXBtLskp2ncvM2pKrlMk4G5ReE;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group047.TYkUcMdZIMpxSXfJh7V7c0l0UogK49Bk;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group043._4NSHqAq8a4Fu6EgNoB3kvjqrStvgTsCm;
import org.phobos.secure.group044.n02VNdnEWNIy3X8UiPq7cVJPqrrtrp6l;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FastLatencyModule
extends SecureClass1027 {
    public volatile /* synthetic */ boolean field001;
    public volatile /* synthetic */ long field002;
    public volatile /* synthetic */ int field003;
    public final /* synthetic */ SecureClass0603<TYkUcMdZIMpxSXfJh7V7c0l0UogK49Bk> mode;
    public final /* synthetic */ o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe field004;
    public volatile /* synthetic */ long field005;
    public final /* synthetic */ SecureClass0603<Long> update;
    public final /* synthetic */ SecureClass0603<Boolean> screen;
    public static final /* synthetic */ int field006 = -9999999;
    public static /* synthetic */ FastLatencyModule field007;
    public final /* synthetic */ o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe field008;
    public final /* synthetic */ SecureClass0603<String> field009;

    public static /* bridge */ /* synthetic */ FastLatencyModule cfr_renamed_615() {
        return field007;
    }

    public /* synthetic */ FastLatencyModule(SecureClass0242 K4j6beP3iQXF1ZJHUQW5iZq3I6zqMYKQ) {
        super(K4j6beP3iQXF1ZJHUQW5iZq3I6zqMYKQ, "FastLatency", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Fetches your ping to the server", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<TYkUcMdZIMpxSXfJh7V7c0l0UogK49Bk>("Mode", TYkUcMdZIMpxSXfJh7V7c0l0UogK49Bk.Completion));
        this.field009 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Command", "w").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, TYkUcMdZIMpxSXfJh7V7c0l0UogK49Bk.Completion).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("/command (adds space after command!)"));
        this.update = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Update", 100L, 0L, 2000L));
        this.screen = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Screen"));
        this.field004 = new o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe();
        this.field008 = new o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe();
        this.field001 = false;
        this.cfr_renamed_69(new _4NSHqAq8a4Fu6EgNoB3kvjqrStvgTsCm(this));
        this.cfr_renamed_69(new n02VNdnEWNIy3X8UiPq7cVJPqrrtrp6l(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new grRaa4uXBtLskp2ncvM2pKrlMk4G5ReE(this));
        this.cfr_renamed_69(new _8DdlWXjhPDBp3JAP87eHmxNIHSt6i68w(this, Integer.MAX_VALUE));
        field007 = this;
    }
}

