/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1657;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group025.F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0200
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Long> delay;
    public final /* synthetic */ SecureClass0603<Integer> cPT;
    public final /* synthetic */ SecureClass0603<Boolean> align;
    public final /* synthetic */ SecureClass0603<Integer> carts;
    public final /* synthetic */ Map<class_1657, Long> field001;
    public final /* synthetic */ SecureClass0603<F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob> mode;

    public /* synthetic */ SecureClass0200(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoTNT", "Places and ignites TNTs on top of enemy's head", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 4);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob>("Mode", F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob.Block));
        this.carts = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Carts", 5, 1, 40).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob.Minecart));
        this.cPT = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("CPT", 1, 1, 20).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Carts per tick").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob.Minecart));
        this.align = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Align").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob.Block));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 500L, 0L, 1000L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Per-player delay").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, F5JDoqTyHD6kWLV9FEFobp4Ove7R3Vob.Block));
        this.field001 = new HashMap<class_1657, Long>();
        this.UUfS4SyC7Bg4F9CbQRj2lCC9NQkaXYpm().getValue().clear();
    }
}

