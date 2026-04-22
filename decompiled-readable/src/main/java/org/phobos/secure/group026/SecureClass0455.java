/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group026;

import engine.linking.NativeMethodHandler;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group001._9o5YMwXXT1FNN30L49KcHRxgRDoZb5mW;
import org.phobos.secure.group007._3JtiI2vTMvRwd9Kl6pHOEtBbro9L7PCx;
import org.phobos.secure.group029._0mQdkh7DsQQAuYC9msM6DEGahVeLIiYh;
import org.phobos.secure.group020._58nGR5bUe1j6uISkK76YU8K4rF5tpKuG;
import org.phobos.secure.group028.WbhWaTgvWae4em4ZoJRc0NJEMCjXCEvj;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0455
extends SecureClass0966 {
    public /* synthetic */ String field001;
    public final /* synthetic */ Map<Integer, Integer> field002;
    public final /* synthetic */ AtomicInteger field003;
    public /* synthetic */ boolean field004;
    public final /* synthetic */ MutableBoolean field005;
    public final /* synthetic */ IntList field006;
    public /* synthetic */ int field007;

    public /* synthetic */ SecureClass0455() {
        this.field002 = new HashMap<Integer, Integer>();
        this.field007 = 0;
        this.field004 = true;
        this.field006 = new IntArrayList();
        this.field005 = new MutableBoolean();
        this.field001 = "Unknown";
        this.field003 = new AtomicInteger();
        this.cfr_renamed_69(new _58nGR5bUe1j6uISkK76YU8K4rF5tpKuG(this));
        this.cfr_renamed_69(new _0mQdkh7DsQQAuYC9msM6DEGahVeLIiYh(this));
        this.cfr_renamed_69(new _3JtiI2vTMvRwd9Kl6pHOEtBbro9L7PCx(this));
        this.cfr_renamed_69(new WbhWaTgvWae4em4ZoJRc0NJEMCjXCEvj(this));
        this.cfr_renamed_69(new _9o5YMwXXT1FNN30L49KcHRxgRDoZb5mW(this, Integer.MIN_VALUE));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> this.field003.set(0));
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(50);
    }
}

