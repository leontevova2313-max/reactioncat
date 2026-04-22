/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group032;

import java.util.Random;
import java.util.Set;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group013.SecureClass0188;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017._3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039._07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group042.SecureClass0738;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group062.SecureClass1124;

public class BuildsSomethingModule
extends SecureClass0214 {
    public final /* synthetic */ SecureClass0603<Double> nametagRange;
    public final /* synthetic */ Random field001;
    public final /* synthetic */ SecureClass0603<Integer> expand;
    public final /* synthetic */ SecureClass0603<Integer> width;
    public final /* synthetic */ SecureClass0603<Set<class_2248>> blocks;
    public static final /* synthetic */ SecureClass0188 field002;
    public static final /* synthetic */ SecureClass0188 field003;
    public final /* synthetic */ SecureClass0603<_3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu> mode;
    public final /* synthetic */ SecureClass0603<Boolean> nametag;
    public final /* synthetic */ SecureClass0603<Double> distance;
    public final /* synthetic */ SecureClass0603<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0> nametagRotation;
    public final /* synthetic */ SecureClass0603<Integer> field004;
    public final /* synthetic */ SecureClass0603<Integer> seed;

    static {
        field003 = SecureClass0188.cfr_renamed_259().kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 0, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 1, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(1, 1, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(-1, 1, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(1, 0, 0, class_2246.field_10124).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(-1, 0, 0, class_2246.field_10124).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 0, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 0, class_2246.field_10101).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(1, 2, 0, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(1, 2, 0, class_2246.field_10101).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(-1, 2, 0, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(-1, 2, 0, class_2246.field_10101).qT1lDllL21qba2RqiSIby4na6K2Wp3ms();
        field002 = SecureClass0188.cfr_renamed_259().kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 0, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 1, 0, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 1, 1, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 1, -1, class_2246.field_10114).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 0, 1, class_2246.field_10124).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 0, -1, class_2246.field_10124).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 0, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 0, class_2246.field_10101).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 1, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, 1, class_2246.field_10101).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, -1, class_2246.field_10177).kqEy6B5nP2PcscVmGDfHmLPMPUsSf8UY(0, 2, -1, class_2246.field_10101).qT1lDllL21qba2RqiSIby4na6K2Wp3ms();
    }

    public /* synthetic */ BuildsSomethingModule(SecureClass0242 hlz1qSthMoypNFb4gTav0sF09mF0reZv) {
        super(hlz1qSthMoypNFb4gTav0sF09mF0reZv, "Builder", "Builds something", SecureClass1004.cfr_renamed_106, 3);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu>("Mode", _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Highway));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Width", 5, 1, 5).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Highway width").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Highway));
        this.expand = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Expand", 2, 1, 4).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Highway));
        this.blocks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0738("Blocks", new class_2248[0]).cfr_renamed_110(() -> !this.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(_3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Wither) && !this.mode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(_3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Holes)));
        this.nametag = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Nametag").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Nametag the wither").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Wither));
        this.nametagRange = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("NametagRange", 6.0, 3.0, 6.0));
        this.nametagRotation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0>("NametagRotation", _07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0.Normal));
        this.seed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Seed", 0, 0, Integer.MAX_VALUE).cfr_renamed_85("Dynamic", 0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Random));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Average", 5, 1, 20).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Random));
        this.distance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Distance", 2.0, 0.5, 4.0).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Holes));
        this.field001 = new Random();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.nametag, this.nametagRange, this.nametagRotation).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, _3JJTzSux1CyY3Gf9Wc4yzeUZM20y4niu.Wither);
        this.cfr_renamed_69(new SecureClass1124(this));
    }
}

