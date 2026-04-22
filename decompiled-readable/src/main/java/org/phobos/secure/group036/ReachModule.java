/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group036;

import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class ReachModule
extends SecureClass1027 {
    public static /* synthetic */ ReachModule field001;
    public final /* synthetic */ SecureClass0603<Double> distance;

    public static /* bridge */ /* synthetic */ ReachModule ki0e2KvGcuVYx9JLNKxpPpWksotghXCu() {
        return field001;
    }

    public /* synthetic */ ReachModule(SecureClass0242 IAVKkFr6BoSZzorLa0dodvngm8yJW0d6) {
        super(IAVKkFr6BoSZzorLa0dodvngm8yJW0d6, "Reach", SecureClass1004.cfr_renamed_106, "Allows you to reach farther away", new int[0]);
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 6.0, 0.1, 6.0));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ double P0xFXTUvDPWYGgXB2ypH2mdI8uAN47OO(double hqhe3T2QWsOWJD0XbiaWfclqKIAeQ0RF) {
        return field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? ReachModule.field001.distance.getValue() : hqhe3T2QWsOWJD0XbiaWfclqKIAeQ0RF;
    }
}

