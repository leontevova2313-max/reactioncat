/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1657;
import org.phobos.secure.group012._8GKMFZWIzuh8a1e66YywvijlQ5PrLYwp;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.SecureClass0303;
import org.phobos.secure.group032.SecureClass0572;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group034.wYKE6ucjMQ6f9xfFaajINnor9IyHmtdB;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group043.WHMUahpdDFiob39ApBGAM51ykXstVIOw;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class TrackerModule
extends SecureClass1027 {
    public final /* synthetic */ Map<class_1657, SecureClass0572> field001;
    public final /* synthetic */ SecureClass0603<Boolean> friends;
    public final /* synthetic */ SecureClass0603<Boolean> drops;

    public /* synthetic */ TrackerModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "Tracker", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Tracks how many items target uses", new int[0]);
        this.drops = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Drops").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Notifies you of any items picked up"));
        this.friends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Friends"));
        this.field001 = new HashMap<class_1657, SecureClass0572>();
        this.cfr_renamed_69(new wYKE6ucjMQ6f9xfFaajINnor9IyHmtdB(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new WHMUahpdDFiob39ApBGAM51ykXstVIOw(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new _8GKMFZWIzuh8a1e66YywvijlQ5PrLYwp(this, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        SecureClass0303.jAZWizPMofRM1OcVW4xW62a898RhI6k2(class_1657.class, this.field001, BCUih9BetIqHUz7yCHhL77OtHcjcklzL -> new SecureClass0572(), this);
    }
}

