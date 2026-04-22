/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group008;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.O1HWUStI0Kte5W0dnSlLXYbegdg3lMud;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0131
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<Boolean> air;
    public final /* synthetic */ SecureClass0603<SecureClass0666> key;
    public final /* synthetic */ SecureClass0603<O1HWUStI0Kte5W0dnSlLXYbegdg3lMud> mode;

    public /* synthetic */ SecureClass0131(SecureClass0242 Bf4v1cV0jALaYqcE5d6sxxZgiVQRUPxs) {
        super(Bf4v1cV0jALaYqcE5d6sxxZgiVQRUPxs, "Blocker", "Blocks mining positions around you", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 6);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<O1HWUStI0Kte5W0dnSlLXYbegdg3lMud>("Mode", O1HWUStI0Kte5W0dnSlLXYbegdg3lMud.Instant));
        this.air = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Air").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks empty blocks"));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 3, 0, 10).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, O1HWUStI0Kte5W0dnSlLXYbegdg3lMud.Auto));
        this.key = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("Key").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, O1HWUStI0Kte5W0dnSlLXYbegdg3lMud.Auto));
    }
}

