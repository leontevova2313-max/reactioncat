/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import engine.linking.NativeMethodHandler;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2199;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group001.JGh8kuXfTM7eQnoyDyLRkg8PXyhZc9HA;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.SpeedmineModule;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group010._0GROeX8yTioeqxcjYXTX0BhQxeE3tLzQ;
import org.phobos.secure.group014._4JyeVwHbFicx6iVgLKocIaukjSSeaDPe;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group029.HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0725;
import org.phobos.secure.group051.sRoALUZ07rR024tKNx6ZpCwECBAXsaqB;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group037.crG7SWWVL5GVBTNre2odIX3MCCUNbrmY;
import org.phobos.secure.group043._3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.SecureClass1129;

public class AutoMineModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> inside;
    public final /* synthetic */ SecureClass0603<Boolean> onGround;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> crystalsSilent;
    public final /* synthetic */ SecureClass0603<Boolean> strict;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsBase;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsGeneric;
    public final /* synthetic */ Map<class_2338, _4JyeVwHbFicx6iVgLKocIaukjSSeaDPe> field002;
    public final /* synthetic */ SecureClass0603<Boolean> bombing;
    public final /* synthetic */ SecureClass0603<Boolean> await;
    public static /* synthetic */ AutoMineModule field003;
    public final /* synthetic */ SecureClass0603<HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS> mode;
    public final /* synthetic */ SecureClass0603<Boolean> crystals;
    public final /* synthetic */ SecureClass0603<_3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr> field004;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ SecureClass0603<Boolean> unbox;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass1129 field007;
    public final /* synthetic */ SecureClass0603<Boolean> down;
    public /* synthetic */ class_1657 field008;
    public final /* synthetic */ SecureClass0603<_0GROeX8yTioeqxcjYXTX0BhQxeE3tLzQ> selection;

    public /* synthetic */ AutoMineModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "AutoMine", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS>("Mode", HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Combat));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 6.0, 0.0, 6.0));
        this.unbox = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Unbox").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Breaks outline before the bed itself").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Beds));
        this.strict = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Strict").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Beds));
        this.selection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_0GROeX8yTioeqxcjYXTX0BhQxeE3tLzQ>("Selection", _0GROeX8yTioeqxcjYXTX0BhQxeE3tLzQ.Dynamic).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (_0GROeX8yTioeqxcjYXTX0BhQxeE3tLzQ)((Object)HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Combat)));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Uncrawl").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Combat));
        this.crystals = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Crystals", true));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr>("CrystalsSwitch", _3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr.Silent));
        this.crystalsSilent = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("CrystalsSilent", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Swap).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.field004, (UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6)((Object)_3nDhRDhT1KWcZAdHhy74h2OqBtn72cAr.Silent)));
        this.crystalsBase = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsBase"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsInstant").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Attacks the crystal when it spawns and pre-places another one"));
        this.crystalsGeneric = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsGeneric").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Crystals anywhere where it can blow up the drop"));
        this.inside = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Inside", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Mines blocks the enemy is inside"));
        this.bombing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Bombing", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Mines blocks to bomb crystals"));
        this.down = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Down", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Mines below target"));
        this.onGround = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("OnGround").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Excludes air-bone targets").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Combat));
        this.await = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Await").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Does not mine until second position is broken"));
        this.field007 = SecureClass1129.cfr_renamed_856(this);
        this.field002 = new HashMap<class_2338, _4JyeVwHbFicx6iVgLKocIaukjSSeaDPe>();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.crystals, this.field004, this.crystalsSilent, this.crystalsBase, this.field001, this.crystalsGeneric).Ig0Mx5sfqQ4v3m9L8ObzmZVsLC4LPnc4(this.mode, HNhdfXdAnric9MLKUwCnSJwwXqPfa5JS.Combat);
        this.cfr_renamed_69(new JGh8kuXfTM7eQnoyDyLRkg8PXyhZc9HA(this, Integer.MIN_VALUE, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new sRoALUZ07rR024tKNx6ZpCwECBAXsaqB(this));
        this.cfr_renamed_69(new crG7SWWVL5GVBTNre2odIX3MCCUNbrmY(this, -20, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field002.clear();
            this.field008 = null;
        });
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ boolean rOSPIgjcqJJPYTz3TUS1P9Xd8ozdUJCa(class_638 LGxLJVVNo81cRJRpuJiNvYn1PaP4LSEZ, class_2338 hCI26YRcwlnGFb4iJqYZhFv7LahukInI) {
        class_2680 field009 = LGxLJVVNo81cRJRpuJiNvYn1PaP4LSEZ.method_8320(hCI26YRcwlnGFb4iJqYZhFv7LahukInI);
        if (SecureClass0725.VV0scOfwYhBCh1PKGEg8oT8nI6wmmJJF(hCI26YRcwlnGFb4iJqYZhFv7LahukInI, (class_1937)LGxLJVVNo81cRJRpuJiNvYn1PaP4LSEZ)) {
            return false;
        }
        if (field009.method_27852(class_2246.field_10343)) {
            return false;
        }
        return !(field009.method_26204() instanceof class_2199);
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_857(class_638 xgcCzm9tS9dDuS7TnQ9MqvnceX4DhHIh, class_2338 nDrHG7YlV7NOeDnTfNHBm2RNungSYYqC) {
        return !SecureClass0725.O5nVAdzxVkOWXKHdgZNpgQV1UiwgALpn(nDrHG7YlV7NOeDnTfNHBm2RNungSYYqC.method_10084(), (class_1937)xgcCzm9tS9dDuS7TnQ9MqvnceX4DhHIh);
    }

    public static /* bridge */ /* synthetic */ boolean FWzqYFPWJCcbrttY9XFzwbVA6T8l6xp6(class_1657 class_16572, class_2338 rzioFBn5gISWI0HfHa5B7GE1iA1cH0oE) {
        return (double)rzioFBn5gISWI0HfHa5B7GE1iA1cH0oE.method_10264() < class_16572.method_23318() - 0.45;
    }

    public static /* bridge */ /* synthetic */ boolean LnQl8TiIrBWqihPd67yLlbUJLcX7cRhQ(class_638 class_6382, class_2338 iTCGfkNpiwmO1ipditGo1B7EHemBJDqi) {
        return !SecureClass0725.O5nVAdzxVkOWXKHdgZNpgQV1UiwgALpn(iTCGfkNpiwmO1ipditGo1B7EHemBJDqi.method_10084(), (class_1937)class_6382);
    }

    public static /* bridge */ /* synthetic */ boolean C0dVaCCZvPYxkahurOFKaR2xchp15OjI(class_638 Nd8CtmlqlqE7Of1U55BASxQ2MTu64vAO, class_746 class_7462, class_2338 AmZjpm6Zu26lIysWf39gAPwkConeod8F) {
        class_2680 field010 = Nd8CtmlqlqE7Of1U55BASxQ2MTu64vAO.method_8320(AmZjpm6Zu26lIysWf39gAPwkConeod8F);
        SpeedmineModule field011 = SpeedmineModule.jRtMpHr3crBoTwYdk4k7oYzfgZ60u5pE();
        return field011.ON9UMERhSHLRolvBJcCpJs066drjdgMQ(AmZjpm6Zu26lIysWf39gAPwkConeod8F, field010, class_7462, Nd8CtmlqlqE7Of1U55BASxQ2MTu64vAO) && field011.KZlHvy0aWqMZDfw5cvL2SwOe2K7z0XZG(class_7462, Nd8CtmlqlqE7Of1U55BASxQ2MTu64vAO, AmZjpm6Zu26lIysWf39gAPwkConeod8F) && !field010.method_27852(class_2246.field_10343) && !(field010.method_26204() instanceof class_2199);
    }

    public static /* bridge */ /* synthetic */ AutoMineModule dUVk1YceFsHjzcwQZs0yAvDsloeLJyQN() {
        return field003;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(77);
    }
}

