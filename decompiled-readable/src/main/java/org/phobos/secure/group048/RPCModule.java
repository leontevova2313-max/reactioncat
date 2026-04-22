/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group048;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group028._9G6NVQGMso6i5BNHa1WlC0XEdYEPaZW3;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group040.QLQPH5DzWiMM5lCu1Un5oJ98Ax1LZhdD;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class RPCModule
extends SecureClass1027 {
    public final /* synthetic */ _9G6NVQGMso6i5BNHa1WlC0XEdYEPaZW3 field001;
    public static /* synthetic */ String field002;
    public final /* synthetic */ SecureClass0603<Boolean> actions;
    public final /* synthetic */ SecureClass0603<QLQPH5DzWiMM5lCu1Un5oJ98Ax1LZhdD> info;

    static {
        field002 = "";
    }

    public /* synthetic */ RPCModule(SecureClass0242 G99F94ub3dhs3nFQxVdtqjuG8Ym5Dht4) {
        super(G99F94ub3dhs3nFQxVdtqjuG8Ym5Dht4, "RPC", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Discord status", new int[0]);
        this.info = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<QLQPH5DzWiMM5lCu1Un5oJ98Ax1LZhdD>("Info", QLQPH5DzWiMM5lCu1Un5oJ98Ax1LZhdD.None));
        this.actions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Actions").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Enables ask to join game button"));
        this.field001 = new _9G6NVQGMso6i5BNHa1WlC0XEdYEPaZW3(this);
        if (SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H().TRtJL8LJ7isXaPlFPqWfsDmss8gV6DTx().isBeta()) {
            field002 = "Beta ";
        }
    }
}

