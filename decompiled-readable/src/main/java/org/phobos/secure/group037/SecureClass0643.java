/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.iUQWfHNYD09SPcNqGLHnBTkU6M6pk9VY;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061.UiXOTQGeuJi6KAx8ZNcjc2QwCwN8CgLq;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0643
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Boolean> filter;
    public final /* synthetic */ SecureClass0603<iUQWfHNYD09SPcNqGLHnBTkU6M6pk9VY> mode;
    public final /* synthetic */ SecureClass0603<UiXOTQGeuJi6KAx8ZNcjc2QwCwN8CgLq> type;
    public final /* synthetic */ SecureClass0603<Integer> height;

    public /* synthetic */ SecureClass0643(SecureClass0242 T64LzdUScWDwOsBfIe3MmxQ9fjDBbsLj) {
        super(T64LzdUScWDwOsBfIe3MmxQ9fjDBbsLj, "AutoDrop", "Drops falling blocks on enemies", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 5);
        this.type = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UiXOTQGeuJi6KAx8ZNcjc2QwCwN8CgLq>("Type", UiXOTQGeuJi6KAx8ZNcjc2QwCwN8CgLq.Anvil));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<iUQWfHNYD09SPcNqGLHnBTkU6M6pk9VY>("Mode", iUQWfHNYD09SPcNqGLHnBTkU6M6pk9VY.Dynamic));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Height", 2, 2, 7).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, iUQWfHNYD09SPcNqGLHnBTkU6M6pk9VY.Static));
        this.filter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Filter").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Checks if there's a falling anvil"));
    }
}

