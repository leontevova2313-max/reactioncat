/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.TyyOL4IIzrl2lVyJ6wzmjnLx845UAsuH;
import org.phobos.secure.group053.SecureClass0962;

public class SecureClass1082
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Double> offset;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<TyyOL4IIzrl2lVyJ6wzmjnLx845UAsuH> block;

    public /* synthetic */ SecureClass1082(SecureClass0242 nKjM07Drky1qkK2jDkl8AjJMHr8i7LOI) {
        super(nKjM07Drky1qkK2jDkl8AjJMHr8i7LOI, "AntiMace", "Prevents players from macing you", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 11);
        this.block = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<TyyOL4IIzrl2lVyJ6wzmjnLx845UAsuH>("Block", TyyOL4IIzrl2lVyJ6wzmjnLx845UAsuH.Original));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 4, 1, 5));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 5.0, 4.0, 10.0));
        this.offset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Offset", 4.0, -1.0, 8.0));
    }
}

