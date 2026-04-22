/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group004;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_2338;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group001.lEZLXTExPY2IezouyUVkRxepfUxXCha9;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0085;
import org.phobos.secure.group005._1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group005.SecureClass0079;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group018.zWsBpt4bPu1qNFzqatnAlmfEd3MH1B1g;
import org.phobos.secure.group024.WoveApYiPN93Jw4yOBq7GSXZN2kQKSAD;
import org.phobos.secure.group033.nA0N2ELslnE3zcpNLXfALiypEasPdsRe;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.T5ASgfiIVlRyUqNb0YHfh6Xm4FiaRUP4;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group047.IP4XCJx0loLwg1dGQ3e6Z4bQnScihXWh;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.E7gEiDKZjIsYxiBrgTKWzBrgE7NhwAN9;
import org.phobos.secure.group063.RyZsHEzitHIY95qkt65l9CkOBEkiVXIW;
import org.phobos.secure.group044.zaB0gFJrRlhw0ar9MNAyAWrwnWSGE8dZ;
import org.phobos.secure.group052.n9WpKWnbEv2R1VlaZE73aTfez3Yv4GCt;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.PEhKYGj3Qs95az1ejldVU6a6Wz27u8nF;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class SpeedmineModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> mine;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> abort;
    public final /* synthetic */ SecureClass0603<Boolean> swap;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> swapDelay;
    public final /* synthetic */ SecureClass0603<Boolean> fast;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> field003;
    public final /* synthetic */ SecureClass0603<PEhKYGj3Qs95az1ejldVU6a6Wz27u8nF> rotateType;
    public static /* synthetic */ SpeedmineModule field004;
    public final /* synthetic */ SecureClass0603<zaB0gFJrRlhw0ar9MNAyAWrwnWSGE8dZ> double;
    public final /* synthetic */ SecureClass0603<Boolean> raytrace;
    public final /* synthetic */ SecureClass0603<Boolean> nCP;
    public final /* synthetic */ SecureClass0603<Boolean> swapMultiTask;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public final /* synthetic */ SecureClass0603<Integer> field005;
    public final /* synthetic */ SecureClass0603<Float> negate;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<Float> damage;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Boolean> grim;
    public final /* synthetic */ SecureClass0603<Boolean> doubleAir;
    public final /* synthetic */ SecureClass0603<Boolean> cancel;
    public final /* synthetic */ SecureClass0603<_1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN> mode;
    public final /* synthetic */ SecureClass0603<Boolean> strictDirection;
    public final /* synthetic */ SecureClass0603<Long> mineDelay;
    public final /* synthetic */ SecureClass0603<Boolean> fade;
    public final /* synthetic */ SecureClass0085 field007;
    public final /* synthetic */ SecureClass0603<Boolean> custom;
    public final /* synthetic */ SecureClass0603<Boolean> always;
    public final /* synthetic */ SecureClass0603<Long> fadeTime;
    public final /* synthetic */ SecureClass0603<Long> reset;
    public final /* synthetic */ SecureClass0603<Color> line;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field008;
    public final /* synthetic */ SecureClass0603<Boolean> end;
    public final /* synthetic */ SecureClass0603<Long> correctionTime;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field009;
    public final /* synthetic */ SecureClass0603<Color> box;
    public final /* synthetic */ SecureClass0603<Boolean> correction;
    public final /* synthetic */ SecureClass0079 field010;
    public final /* synthetic */ SecureClass0603<Boolean> animate;
    public final /* synthetic */ SecureClass0603<Boolean> render;
    public final /* synthetic */ SecureClass0603<Boolean> flow;
    public final /* synthetic */ Map<class_2338, zWsBpt4bPu1qNFzqatnAlmfEd3MH1B1g> field011;
    public final /* synthetic */ SecureClass0603<Integer> doubleTicks;
    public /* synthetic */ boolean field012;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field013;
    public final /* synthetic */ SecureClass0603<Boolean> renderReset;
    public final /* synthetic */ SecureClass0603<Boolean> swing;
    public final /* synthetic */ SecureClass0603<Boolean> start;
    public final /* synthetic */ SecureClass0603<Float> width;

    public /* synthetic */ SpeedmineModule(SecureClass0242 XZdXgvNjwF77MZc0nI91pZZqjNT1b6zo) {
        super(XZdXgvNjwF77MZc0nI91pZZqjNT1b6zo, "Speedmine", SecureClass1004.cfr_renamed_106, "Mines blocks really fast", new int[0]);
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotate", false));
        this.rotateType = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<PEhKYGj3Qs95az1ejldVU6a6Wz27u8nF>("RotateType", PEhKYGj3Qs95az1ejldVU6a6Wz27u8nF.Normal));
        this.swap = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swap", false));
        this.swapMultiTask = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("SwapMultiTask"));
        this.swapDelay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("1.21").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("1.21 delayed switch"));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SwapDelay", 2, 1, 4).WJ0vcdoIoTedaHc3VbdkGjMiqv0Ku7VO(this.swapDelay));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("SwapType", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Swap).cfr_renamed_110(() -> this.swapDelay.getValue() == false));
        this.strictDirection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("StrictDirection", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Strict direction"));
        this.grim = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Grim", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Grim"));
        this.raytrace = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Raytrace"));
        this.mine = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Mine", false));
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN>("Mode", _1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN.Fast));
        this.abort = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Abort", true).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN.Fast));
        this.fast = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fast").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Tries to break even if it's air").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN.Instant));
        this.mineDelay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("MineDelay", 0L, 0L, 500L).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, _1RxhUarIfZhS5Jbb5HV3FDqTj3x3OEtN.Instant));
        this.nCP = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("NCP", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("NCP Mode"));
        this.damage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Damage", Float.valueOf(1.0f), Float.valueOf(0.7f), Float.valueOf(1.0f)).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Block damage"));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 3, 0, 20).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Additional mining ticks"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Air", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Simulates breaking"));
        this.cancel = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Cancel", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Sends a cancel packet"));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 5.25, 1.0, 6.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Maximum range"));
        this.double = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<zaB0gFJrRlhw0ar9MNAyAWrwnWSGE8dZ>("2b2t", zaB0gFJrRlhw0ar9MNAyAWrwnWSGE8dZ.None).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Extra packets = bypass (Requires Swing -> End)"));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Double", false));
        this.negate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Negate", Float.valueOf(0.1f), Float.valueOf(0.0f), Float.valueOf(0.4f)));
        this.doubleAir = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("DoubleAir", false));
        this.doubleTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("DoubleTicks", 2, 1, 6));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Reset", 0L, 0L, 500L, true));
        this.swing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swing", false));
        this.start = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Start", true));
        this.end = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("End", true));
        this.render = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Render", false));
        this.renderReset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("RenderReset", false));
        this.animate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animate", false));
        this.always = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Always", false));
        this.flow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Flow", false));
        this.custom = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Custom", false));
        this.box = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Box", new Color(255, 255, 255, 100)));
        this.line = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Line", new Color(255, 255, 255, 255)));
        this.width = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(2.0f)));
        this.fade = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fade"));
        this.fadeTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("FadeTime", 250L, 50L, 1000L));
        this.correction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Correction").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Corrects invalid blocks"));
        this.correctionTime = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("CorrectionTime", 250L, 50L, 1000L));
        this.field010 = new SecureClass0079(this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv, this);
        this.field007 = new SecureClass0085(this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv, this);
        this.field009 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field013 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field012 = false;
        this.field008 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field011 = new ConcurrentHashMap<class_2338, zWsBpt4bPu1qNFzqatnAlmfEd3MH1B1g>();
        field004 = this;
        this.eM7F2KfmB7lIu8TiKh7fFNgxoOMXGWve();
        this.cfr_renamed_69(new E7gEiDKZjIsYxiBrgTKWzBrgE7NhwAN9(this));
        this.cfr_renamed_69(new IP4XCJx0loLwg1dGQ3e6Z4bQnScihXWh(this));
        this.cfr_renamed_69(new WoveApYiPN93Jw4yOBq7GSXZN2kQKSAD(this, 2));
        this.cfr_renamed_69(new T5ASgfiIVlRyUqNb0YHfh6Xm4FiaRUP4(this));
        this.cfr_renamed_69(new n9WpKWnbEv2R1VlaZE73aTfez3Yv4GCt(this));
        this.cfr_renamed_69(new nA0N2ELslnE3zcpNLXfALiypEasPdsRe(this));
        this.cfr_renamed_69(new lEZLXTExPY2IezouyUVkRxepfUxXCha9(this));
        this.cfr_renamed_69(new RyZsHEzitHIY95qkt65l9CkOBEkiVXIW(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field010.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
            this.field007.T8sEDqlbuTMyksbojDTczQZwY1phkt4R();
        });
    }

    public static /* bridge */ /* synthetic */ boolean WXyDq1wW84nDGTR5BNnOcvAEfhmtoW3U(class_2338 okU2EnzciWXtE9ppvLRpS06MvEr1RhoG) {
        return SpeedmineModule.field004.field010.cfr_renamed_111(okU2EnzciWXtE9ppvLRpS06MvEr1RhoG);
    }

    public static /* bridge */ /* synthetic */ List<class_2338> s9838bVQ3l5fekrz3NIs5T4hHjzq2ptO() {
        ArrayList<class_2338> field014 = new ArrayList<class_2338>(2);
        if (SpeedmineModule.field004.field010.Lp69VY8fqC26OQDk12qaLgSR7VsYfYiK()) {
            field014.add(SpeedmineModule.field004.field010.UFqKywsL6NGEa8YzWhlpjnup8E1kdpbB());
        }
        if (SpeedmineModule.field004.field007.Lp69VY8fqC26OQDk12qaLgSR7VsYfYiK()) {
            field014.add(SpeedmineModule.field004.field007.UFqKywsL6NGEa8YzWhlpjnup8E1kdpbB());
        }
        return field014;
    }

    public static /* bridge */ /* synthetic */ boolean FNhFpSRMJlo0p1yKBAXyPsmsknLwlRxN(class_2338 iMFeX5qiCAkOFj0Izpmy6ncrnUAtVzBh) {
        return SpeedmineModule.field004.field007.cfr_renamed_111(iMFeX5qiCAkOFj0Izpmy6ncrnUAtVzBh);
    }

    public static /* bridge */ /* synthetic */ boolean JJNeNzMbIlg8F1nkChrAKpxmh1glrGXn() {
        return field004.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && SpeedmineModule.field004.field010.Lp69VY8fqC26OQDk12qaLgSR7VsYfYiK() && SpeedmineModule.field004.nCP.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ SpeedmineModule jRtMpHr3crBoTwYdk4k7oYzfgZ60u5pE() {
        return field004;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(96);
    }
}

