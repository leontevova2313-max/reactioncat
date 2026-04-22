/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group008._6S7OKOap4xXO67doWI7zC3QSZPIlhOzF;
import org.phobos.secure.group013._90uxMcCrKFi4U946EFSsbMwqYHudizvJ;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group020.B8SuUAX59nY5xydRRrT9uWr2JZwX8Ste;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoLogModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<_6S7OKOap4xXO67doWI7zC3QSZPIlhOzF> mode;
    public final /* synthetic */ SecureClass0603<Float> health;
    public final /* synthetic */ SecureClass0603<Boolean> noTotems;
    public final /* synthetic */ SecureClass0603<Integer> totems;

    public /* synthetic */ AutoLogModule(SecureClass0242 DGEOmpuhQK6P6d6qNySsJZ7daQaFBwIa) {
        super(DGEOmpuhQK6P6d6qNySsJZ7daQaFBwIa, "AutoLog", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_6S7OKOap4xXO67doWI7zC3QSZPIlhOzF>("Mode", _6S7OKOap4xXO67doWI7zC3QSZPIlhOzF.Pop));
        this.health = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Health", Float.valueOf(10.0f), Float.valueOf(0.1f), Float.valueOf(36.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _6S7OKOap4xXO67doWI7zC3QSZPIlhOzF.Health));
        this.noTotems = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("NoTotems").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Only when you have no totems").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _6S7OKOap4xXO67doWI7zC3QSZPIlhOzF.Health));
        this.totems = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Totems", 1, 0, 5).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _6S7OKOap4xXO67doWI7zC3QSZPIlhOzF.Totems));
        this.cfr_renamed_69(new _90uxMcCrKFi4U946EFSsbMwqYHudizvJ(this));
        this.cfr_renamed_69(new B8SuUAX59nY5xydRRrT9uWr2JZwX8Ste(this, DGEOmpuhQK6P6d6qNySsJZ7daQaFBwIa));
    }
}

