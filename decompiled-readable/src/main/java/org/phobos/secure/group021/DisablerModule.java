/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group021;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_2596;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group002.SecureClass0012;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.SecureClass0058;
import org.phobos.secure.group009.KZNuJxkKCqQupqxgoBCL57CwCU2o398v;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureClass0280;
import org.phobos.secure.group017.SecureClass0281;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group060.SecureClass1100;
import org.phobos.secure.group061.NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl;
import org.phobos.secure.group016.SecureClass0257;
import org.phobos.secure.group016.SecureClass0258;
import org.phobos.secure.group052.SecureClass0953;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group062.SecureClass1125;

public class DisablerModule
extends SecureClass1027 {
    public /* synthetic */ int field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public /* synthetic */ boolean field003;
    public /* synthetic */ boolean field004;
    public /* synthetic */ float field005;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ SecureClass0603<Boolean> motion;
    public /* synthetic */ boolean field007;
    public /* synthetic */ boolean field008;
    public /* synthetic */ int field009;
    public final /* synthetic */ SecureClass0603<KZNuJxkKCqQupqxgoBCL57CwCU2o398v> mode;
    public final /* synthetic */ SecureClass0603<Long> delay;
    public /* synthetic */ int field010;
    public /* synthetic */ boolean field011;
    public /* synthetic */ boolean field012;
    public /* synthetic */ boolean field013;
    public final /* synthetic */ NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl field014;
    public /* synthetic */ boolean field015;
    public /* synthetic */ int field016;
    public final /* synthetic */ SecureClass0603<SecureClass1100> vanillaPacket;
    public static /* synthetic */ DisablerModule field017;
    public final /* synthetic */ SecureClass0603<Float> field018;
    public /* synthetic */ boolean field019;
    public /* synthetic */ boolean field020;
    public final /* synthetic */ SecureClass0603<Boolean> scaffold;
    public final /* synthetic */ Queue<class_2596<?>> field021;
    public /* synthetic */ int field022;

    public /* synthetic */ DisablerModule(SecureClass0242 CcIYhpDbqZwa4sN4uY7SZQVcfMPk8c1F) {
        super(CcIYhpDbqZwa4sN4uY7SZQVcfMPk8c1F, "Disabler", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Disables parts of an anticheat", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<KZNuJxkKCqQupqxgoBCL57CwCU2o398v>("Mode", KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Verus));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Delay", 120L, 0L, 2000L, true).cfr_renamed_110(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new KZNuJxkKCqQupqxgoBCL57CwCU2o398v[]{KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Polar, KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Vulcan})));
        this.motion = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Motion").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Watchdog));
        this.scaffold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Scaffold").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Watchdog));
        this.vanillaPacket = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureClass1100>("VanillaPacket", SecureClass1100.OGO).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, (SecureClass1100)((Object)KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Vanilla)));
        this.field018 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Packets", Float.valueOf(10.0f), Float.valueOf(1.0f), Float.valueOf(20.0f)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Vanilla));
        this.field006 = false;
        this.field012 = false;
        this.field021 = new ConcurrentLinkedQueue<class_2596<?>>();
        this.field022 = -1;
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field009 = 0;
        this.field001 = 0;
        this.field014 = NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl.Y7n7CeQ15PHfnehCbNsQQKLHkI5ao1rM().b6Q7OR3SGBvQy0v0ZBIry7DpJf3CXVGT().cdGBMdWAcWOaHB7zfEHCKvW8TAGnkFvi().TYPyxpKkXEAjGnR6Sbja2toyqSQufqIV().n4AgQ3axG4LDodqny76OXEUutqyX5q44().SZ66qZ96XoUZmAc2ah6DVzEUOTZFffif().cfr_renamed_744(4).YZb0FGlP8nuPHDK9E1bBCRzc2GB8Qlni();
        this.cfr_renamed_69(new SecureClass0012(this));
        this.cfr_renamed_69(new SecureClass0058(this));
        this.cfr_renamed_69(new SecureClass0953(this));
        this.cfr_renamed_69(new SecureClass0280(this));
        this.cfr_renamed_69(new SecureClass0281(this));
        this.cfr_renamed_69(new SecureClass1125(this));
        this.cfr_renamed_69(new SecureClass0257(this));
        this.cfr_renamed_69(new SecureClass0258(this));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> {
            this.field019 = false;
            this.field001 = 0;
        });
        SecureClass0003.jPA6bM0nfUUc5xoIjBDbmAsGIChErjj8(this, () -> {
            this.field010 = 0;
            this.field020 = false;
            this.field015 = true;
        });
        SecureClass0003.w983xraM2Cg1plUsVtES0Kilv8JlIJ2o(this, () -> {
            this.field004 = true;
        });
        field017 = this;
    }

    public static /* bridge */ /* synthetic */ boolean wFcTucMiHLZ6rs3U21yw63KlFkAaoUxM() {
        if (!field017.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7()) {
            return false;
        }
        return switch (DisablerModule.field017.mode.getValue().ordinal()) {
            case 5 -> DisablerModule.field017.field011;
            case 8 -> true;
            default -> false;
        };
    }

    public static /* bridge */ /* synthetic */ boolean MgO7DEg0gu8AW7X70ZRDASoDyv4mJYOg() {
        return field017.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && DisablerModule.field017.mode.getValue().equals(KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Overflow);
    }

    public static /* bridge */ /* synthetic */ boolean fZckvtVwwCXl8zQOiDnHLvhkymRAsnn4() {
        return field017.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && DisablerModule.field017.mode.getValue().equals(KZNuJxkKCqQupqxgoBCL57CwCU2o398v.Direction);
    }
}

