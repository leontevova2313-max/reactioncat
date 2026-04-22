/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group023;

import com.google.common.base.Predicates;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0083;
import org.phobos.secure.group007.gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt;
import org.phobos.secure.group008.Hyt49BYQLWVqxVF2wzB4yuckFDNa1gfs;
import org.phobos.secure.group010.QfvNhE4CkKyTNmKJBUpJivYyQqGr15Us;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group014.SecureClass0220;
import org.phobos.secure.group014.SecureClass0214;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0598;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039._07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0;
import org.phobos.secure.group041.b3ys0ETTBiXrpU9x7hZ2oPQmhnQ06WLn;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group051.SecureClass0921;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.YnrZHgPm43S1bJQYJQEDNeIhBpVzx7Pg;
import org.phobos.secure.group060.th99jPUuj65hjnfWn4k3uNq61bkGAulI;
import org.phobos.secure.group061.dPeeEBFuOd4x59MjWDVJLlxH15AdF9R6;
import org.phobos.secure.group028.PLrw2hJSLnVRjUB4Uhyg8ZlzOIRQAyzJ;
import org.phobos.secure.group030.muOjnLsvgO9AfAlo0Gx2LkXrr801T7Xh;
import org.phobos.secure.group031.ThUmrkml96FMgR8FLa9xVI4a5McDYD7C;
import org.phobos.secure.group045.CbxCChmQsEbRH5rNTuTK7kYHOeSmGUTf;
import org.phobos.secure.group046.okwkoUhajZkecpFifPMadmre7bmsHSgI;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1024;
import org.phobos.secure.group056.SecureClass1027;

public class AntiCheatModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> aim;
    public final /* synthetic */ SecureClass0603<Boolean> clear;
    public final /* synthetic */ SecureClass0603<Boolean> friends;
    public final /* synthetic */ SecureClass0603<Boolean> autoClicker;
    public static /* synthetic */ AntiCheatModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> invalid;
    public final /* synthetic */ SecureClass0603<Long> vL;
    public final /* synthetic */ SecureClass0603<Double> threshold;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> self;
    public final /* synthetic */ SecureClass0603<Boolean> fly;
    public final /* synthetic */ SecureClass0603<Long> latency;
    public final /* synthetic */ SecureClass0603<Boolean> combat;
    public final /* synthetic */ SecureClass0603<Boolean> reach;
    public final /* synthetic */ SecureClass0603<Boolean> aura;
    public final /* synthetic */ SecureClass0603<Boolean> movement;
    public final /* synthetic */ SecureClass0603<okwkoUhajZkecpFifPMadmre7bmsHSgI> timing;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> scaffold;
    public final /* synthetic */ SecureClass0603<Boolean> placing;
    public final /* synthetic */ SecureClass0603<Boolean> placingSwing;
    public final /* synthetic */ SecureClass0603<Integer> placingExtension;
    public final /* synthetic */ SecureClass0603<Boolean> place;
    public final /* synthetic */ SecureClass0603<Integer> placingTicks;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<b3ys0ETTBiXrpU9x7hZ2oPQmhnQ06WLn> inventory;
    public final /* synthetic */ SecureClass0603<Boolean> ground;
    public final /* synthetic */ SecureClass0603<Boolean> debug;
    public final /* synthetic */ SecureClass0603<Boolean> reset;
    public final /* synthetic */ SecureClass0603<Integer> placingDelay;
    public final /* synthetic */ SecureClass0603<Boolean> misc;
    public final /* synthetic */ SecureClass0603<Boolean> raytrace;
    public final /* synthetic */ SecureClass0603<Boolean> placingStrictDirection;
    public final /* synthetic */ SecureClass0603<Boolean> ignoreDrops;
    public final /* synthetic */ SecureClass0603<Boolean> field006;
    public final /* synthetic */ SecureClass0603<Boolean> sneak;
    public final /* synthetic */ SecureClass0603<Boolean> placingGrim;
    public final /* synthetic */ SecureClass0603<Boolean> placingMultiTask;
    public final /* synthetic */ SecureClass0603<Boolean> hitboxSync;
    public final /* synthetic */ SecureClass0603<PLrw2hJSLnVRjUB4Uhyg8ZlzOIRQAyzJ> placingAirPlace;
    public final /* synthetic */ SecureClass0603<Boolean> accurate;
    public final /* synthetic */ SecureClass0603<Boolean> splitter;
    public final /* synthetic */ SecureClass0603<Boolean> placingAttack;
    public final /* synthetic */ SecureClass0603<Double> placingRange;
    public final /* synthetic */ SecureClass0603<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0> placingRotation;
    public final /* synthetic */ SecureClass0603<Boolean> mineFix;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> placingSwitch;
    public final /* synthetic */ SecureClass0603<Integer> packetLimiterAttacks;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field007;
    public final /* synthetic */ SecureClass0603<Boolean> switch;
    public final /* synthetic */ SecureClass0603<Integer> packetLimiterInteractions;
    public final /* synthetic */ SecureClass0603<Boolean> packetLimiter;
    public final /* synthetic */ SecureClass0603<Integer> packetLimiterGlobal;
    public final /* synthetic */ SecureClass0083 field008;
    public final /* synthetic */ SecureClass0083 field009;
    public final /* synthetic */ SecureClass0603<Integer> packetLimiterActions;
    public final /* synthetic */ SecureClass0083 field010;
    public final /* synthetic */ SecureClass0083 field011;
    public final /* synthetic */ SecureClass0603<Boolean> blockRotation;
    public /* synthetic */ SecureClass0598 field012;
    public final /* synthetic */ SecureClass0603<Integer> packetLimiterTicks;
    public final /* synthetic */ SecureClass0603<Long> cooldown;
    public final /* synthetic */ SecureClass0603<muOjnLsvgO9AfAlo0Gx2LkXrr801T7Xh> silent;

    public /* synthetic */ AntiCheatModule(SecureClass0242 i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ) {
        super(i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ, "AntiCheat", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Manages client interactions and local anticheat", new int[0]);
        this.latency = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Latency", 600L, 0L, 1000L, true));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Threshold", 1.0, Double.valueOf(0.0), Double.valueOf(3.0), "b"));
        this.self = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Self", false));
        this.friends = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Friends", false));
        this.clear = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Clear", true));
        this.vL = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("VL", 6000L, 0L, 12000L, true));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Experimental", false));
        this.aim = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Aim", false));
        this.invalid = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Invalid", false));
        this.combat = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Combat", false));
        this.aura = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Aura", false));
        this.autoClicker = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("AutoClicker", false));
        this.reach = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reach", false));
        this.movement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Movement", false));
        this.fly = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Fly", false));
        this.ground = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Ground", false));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Simulation", false));
        this.scaffold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Scaffold", false));
        this.misc = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Misc", false));
        this.place = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Place", false));
        this.reset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Reset", false));
        this.debug = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Debug", false));
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<b3ys0ETTBiXrpU9x7hZ2oPQmhnQ06WLn>("Inventory", b3ys0ETTBiXrpU9x7hZ2oPQmhnQ06WLn.Vanilla).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Inventory simulation"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("1.12").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Pre 1.13 server parameter"));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("LegacyPoses"));
        this.placing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Placing").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Synchronizes all block placing modules to local parameters"));
        this.timing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<okwkoUhajZkecpFifPMadmre7bmsHSgI>("Timing", okwkoUhajZkecpFifPMadmre7bmsHSgI.Vanilla).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Vanilla - Vanilla, Sequential - NCP"));
        this.placingTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PlacingTicks", 6, 1, 36).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Blocks pre tick"));
        this.placingDelay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PlacingDelay", 0, 0, 10).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Block placing delay in ticks"));
        this.placingExtension = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PlacingExtension", 6, 1, 10).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Extension limit"));
        this.placingSwing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingSwing", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Hand swing"));
        this.placingAttack = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingAttack", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Attack blocking crystals"));
        this.placingMultiTask = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingMultiTask", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Place while using"));
        this.placingRotation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0>("PlacingRotation", _07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0.Normal).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Rotation type"));
        this.raytrace = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Raytrace").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Raytrace checks the direction placing on"));
        this.placingStrictDirection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingStrictDirection", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Strict direction"));
        this.placingGrim = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingGrim", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Grim"));
        this.placingAirPlace = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<PLrw2hJSLnVRjUB4Uhyg8ZlzOIRQAyzJ>("PlacingAirPlace", PLrw2hJSLnVRjUB4Uhyg8ZlzOIRQAyzJ.None).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Allows placing on air"));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlacingNoGlitchBlocks", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("No glitch blocks"));
        this.placingRange = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("PlacingRange", 6.0, 0.0, 6.0).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Interaction range"));
        this.placingSwitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("PlacingSwitch", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Normal).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Switch type"));
        this.sneak = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sneak").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Sneaks before placing"));
        this.splitter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Splitter", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("For better validity calculations in AutoCrystal, might be resource heavy"));
        this.accurate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Accurate").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ignores all timers for dropped entities, all dropped items are computed immediately"));
        this.mineFix = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("MineFix").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("2b2t mining fix"));
        this.hitboxSync = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("HitboxSync", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Attempts to fix hitbox issues"));
        this.ignoreDrops = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("IgnoreDrops").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ignores dropped obsidian"));
        this.blockRotation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("BlockRotation", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ensures you're looking at a block (not speedmine related)"));
        this.switch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Switch").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Global switch override"));
        this.silent = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<muOjnLsvgO9AfAlo0Gx2LkXrr801T7Xh>("Silent", muOjnLsvgO9AfAlo0Gx2LkXrr801T7Xh.Inventory).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Switch type"));
        this.cooldown = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("Cooldown", 0L, 0L, 1500L, true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Cooldown between attempts to attack blocking entities"));
        this.packetLimiter = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PacketLimiter"));
        this.packetLimiterGlobal = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PacketLimiterGlobal", 1249, 50, 5000));
        this.packetLimiterActions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PacketLimiterActions", 120, 5, 500));
        this.packetLimiterInteractions = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PacketLimiterInteractions", 420, 5, 3000));
        this.packetLimiterAttacks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PacketLimiterAttacks", 79, 4, 1000));
        this.packetLimiterTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("PacketLimiterTicks", 20, 1, 40));
        this.field009 = new SecureClass0083((Supplier<Integer>)this.packetLimiterGlobal, (Supplier<Integer>)this.packetLimiterTicks, (Predicate<class_2596<?>>)Predicates.alwaysTrue()).BY0bqFpvpPj3jZ55iz8Ow7X5XmzZGXLQ();
        this.field010 = new SecureClass0083(this.packetLimiterActions, this.packetLimiterTicks, oGyZFrx22GDyP4C49EsiC0qiIagB58nz -> oGyZFrx22GDyP4C49EsiC0qiIagB58nz instanceof class_2846).BY0bqFpvpPj3jZ55iz8Ow7X5XmzZGXLQ();
        this.field011 = new SecureClass0083(this.packetLimiterActions, this.packetLimiterTicks, jZZYFsBz13zGR2Tf7jEdd7ahr6EGTSry -> jZZYFsBz13zGR2Tf7jEdd7ahr6EGTSry instanceof class_2885).BY0bqFpvpPj3jZ55iz8Ow7X5XmzZGXLQ();
        this.field008 = new SecureClass0083(this.packetLimiterActions, this.packetLimiterTicks, XQQfCTRy9shoPMDhUyH5tMNFMhcIWKFW -> XQQfCTRy9shoPMDhUyH5tMNFMhcIWKFW instanceof class_2824).BY0bqFpvpPj3jZ55iz8Ow7X5XmzZGXLQ();
        this.field007 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.LrXXknwEN2sYEMT2GCT3jTtO9AsOc8nV(new SecureClass0603[]{gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.GMYj3td70y1ULEISIB6YPLIxw3FrSsIb, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.b0yEeRhUyKgy10KixOPCbVmglhu2cc11, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.R8p34ftIsj7TIYUluwnO6jR2xmVneG8B, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.mBEc1FQ2byHFknsxdhnQwsuO9Wc6cXl0});
        SecureClass0220 field013 = this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.clear, this.vL);
        SecureClass0220 field014 = this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.placing, this.timing, this.placingTicks, this.placingDelay, this.placingExtension, this.placingSwing, this.placingAttack, this.placingMultiTask, this.placingRotation, this.raytrace, this.placingStrictDirection, this.placingGrim, this.placingAirPlace, this.field006, this.placingRange, this.placingSwitch);
        SecureClass0220 field015 = this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.packetLimiter, this.packetLimiterGlobal, this.packetLimiterActions, this.packetLimiterInteractions, this.packetLimiterAttacks, this.packetLimiterTicks);
        SecureClass1024 field016 = this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().zrsnUhlJgysTjRTGpVRftMbRhVwgXPGY("Config").DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.aim, this.invalid), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.combat, this.aura, this.autoClicker, this.reach), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.movement, this.fly, this.ground, this.field003)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.scaffold, this.misc, this.place).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        SecureClass0220 field017 = this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.switch, this.silent);
        SecureClass0921<th99jPUuj65hjnfWn4k3uNq61bkGAulI> field018 = new SecureClass0921<th99jPUuj65hjnfWn4k3uNq61bkGAulI>(this, th99jPUuj65hjnfWn4k3uNq61bkGAulI.Server);
        field018.BJ7zXnd7HnVniojawmZeAGnK7EregwTB(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Analysis, field013);
        field018.A1uUFjscZO7814rwCH5Vh026WxcR4vmF(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Analysis, field016);
        field018.ZwuEfTjyxuXGdC4gHpSNBfgoWn1vyI1j(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Analysis, this.field002, this.latency, this.threshold, this.friends, this.reset, this.debug, this.self);
        field018.ZwuEfTjyxuXGdC4gHpSNBfgoWn1vyI1j(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Server, this.inventory, this.field004, this.field005, this.sneak, this.splitter, this.silent, this.cooldown, this.accurate, this.mineFix, this.hitboxSync, this.ignoreDrops, this.blockRotation);
        field018.BJ7zXnd7HnVniojawmZeAGnK7EregwTB(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Server, field015, field014, field017);
        field018.ZwuEfTjyxuXGdC4gHpSNBfgoWn1vyI1j(th99jPUuj65hjnfWn4k3uNq61bkGAulI.Client, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.GMYj3td70y1ULEISIB6YPLIxw3FrSsIb, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.b0yEeRhUyKgy10KixOPCbVmglhu2cc11, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.R8p34ftIsj7TIYUluwnO6jR2xmVneG8B, gfNt2mieUi3P8IFkp8tvWetxb9e8iwkt.mBEc1FQ2byHFknsxdhnQwsuO9Wc6cXl0);
        this.reset.cfr_renamed_123(T1JEKD90vkmNWuX39diI6St4KXH4L8Y1 -> {
            if (T1JEKD90vkmNWuX39diI6St4KXH4L8Y1.booleanValue()) {
                if (this.field012 != null) {
                    this.field012.qQ1IRcpTBUC16OgpuLkH1OAmRd04EjVE().clear();
                }
                this.reset.crraVzykwykyJsThoWn3tfrxvjJ10d3S(false);
            }
        });
        this.timing.cfr_renamed_123(xsJm7q1OGDjWCIc42RE0HmBHn71ibBnD -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field019 = iterator.next();
                field019.KBofY4O4bjvvDto0USVQV667OZe8vIN7().crraVzykwykyJsThoWn3tfrxvjJ10d3S((okwkoUhajZkecpFifPMadmre7bmsHSgI)((Object)xsJm7q1OGDjWCIc42RE0HmBHn71ibBnD));
            }
            return;
        });
        this.placingTicks.cfr_renamed_123(GPZq5AYNVK37DxbWeg4myq1mrdqaclQx -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field020 = iterator.next();
                field020.AbLemQ6nGDFNIfwGXPysop7XLZM7AzJp().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Integer)GPZq5AYNVK37DxbWeg4myq1mrdqaclQx);
            }
            return;
        });
        this.placingDelay.cfr_renamed_123(bUhj4tDIvNMLQoOu9w1Cw9nb3C7grJeN -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field021 = iterator.next();
                field021.lxSk66pWOvbGxuZgfWuGPwGUZFB0AN0j().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Integer)bUhj4tDIvNMLQoOu9w1Cw9nb3C7grJeN);
            }
            return;
        });
        this.placingExtension.cfr_renamed_123(o5UCEzvUHd5D77qP3bl2db6sr7YMpl8H -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field022 = iterator.next();
                field022.RgIzzvICfv1JZBI32p1jQmlyObtaLyq7().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Integer)o5UCEzvUHd5D77qP3bl2db6sr7YMpl8H);
            }
            return;
        });
        this.placingSwing.cfr_renamed_123(dxmW5eYks6UTZ9cbQ1dkdQ4If8imxIsR -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field023 = iterator.next();
                field023.FfpbiXMTLt4hecApqAsT2qi8Wa9Pao3G().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)dxmW5eYks6UTZ9cbQ1dkdQ4If8imxIsR);
            }
            return;
        });
        this.placingAttack.cfr_renamed_123(eQMIFWjjxTeQKeOwRKL8kdd67BicVUUA -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field024 = iterator.next();
                field024.cfr_renamed_778().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)eQMIFWjjxTeQKeOwRKL8kdd67BicVUUA);
            }
            return;
        });
        this.placingMultiTask.cfr_renamed_123(bl -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field025 = iterator.next();
                field025.KGJbGfuyGFBztKQQRgadhKO1L6SoBcHe().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)bl);
            }
            return;
        });
        this.placingRotation.cfr_renamed_123(KsKqGMJHx3o11sjetZohtSRSZBkT8OI1 -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field026 = iterator.next();
                field026.BJdyDvX8S75xin0zLh5wnD6PlJzfqp9N().crraVzykwykyJsThoWn3tfrxvjJ10d3S((_07Wx3NDFEqwf6lBmfz5jivsgNoZbBxP0)KsKqGMJHx3o11sjetZohtSRSZBkT8OI1);
            }
            return;
        });
        this.raytrace.cfr_renamed_123(S9LFLwSDVITZmjX1fE7oDIYBPa5DgvD3 -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field027 = iterator.next();
                field027.jgNPx9rAs72uzOKjkDExPxetLc5ukNXB().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)S9LFLwSDVITZmjX1fE7oDIYBPa5DgvD3);
            }
            return;
        });
        this.placingStrictDirection.cfr_renamed_123(bl -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field028 = iterator.next();
                field028.XkTEtxLyuowCr0tFQTQBccxumlFb7lp3().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)bl);
            }
            return;
        });
        this.placingGrim.cfr_renamed_123(juWPZi8uNNk2LeLFXeGgKRaZSmALhozk -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field029 = iterator.next();
                field029.cfr_renamed_779().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)juWPZi8uNNk2LeLFXeGgKRaZSmALhozk);
            }
            return;
        });
        this.placingAirPlace.cfr_renamed_123(AvEj3OJitAmN2BonWWsmdvabPejKXwH9 -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field030 = iterator.next();
                field030.vjMZJDAMZiStFaIOuD99Xphtyve1mXk9().crraVzykwykyJsThoWn3tfrxvjJ10d3S((PLrw2hJSLnVRjUB4Uhyg8ZlzOIRQAyzJ)((Object)AvEj3OJitAmN2BonWWsmdvabPejKXwH9));
            }
            return;
        });
        this.field006.cfr_renamed_123(bl -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field024 = iterator.next();
                field024.cfr_renamed_780().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)bl);
            }
            return;
        });
        this.placingRange.cfr_renamed_123(d -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field031 = iterator.next();
                field031.ZzNw5K2t5ctMBt70yNB1uSU6g5Qt1x3P().crraVzykwykyJsThoWn3tfrxvjJ10d3S((Double)d);
            }
            return;
        });
        this.placingSwitch.cfr_renamed_123(Jbs88qNJAiTMW1RzsE62Ruub29EgTuJ0 -> {
            if (!this.placing.getValue().booleanValue()) {
                return;
            }
            Iterator<SecureClass0214> iterator = i6nOTtUsOezIcI7hWUeEnZ5uZW0xB3yZ.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().dfqIZiBIkRKgnjMBQ0kfCceqvJtjYbHx().iterator();
            while (iterator.hasNext()) {
                SecureClass0214 field032 = iterator.next();
                field032.hizuNrZVwm6hopdRRSanMIKpxtIGlgfM().crraVzykwykyJsThoWn3tfrxvjJ10d3S((UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6)Jbs88qNJAiTMW1RzsE62Ruub29EgTuJ0);
            }
            return;
        });
        this.packetLimiter.cfr_renamed_123(fsUJ0sZPL36BC0PgJz7wW77xWBVOhqua -> {
            this.field009.gY14odjmtnfbkxTVHH1fYsAWx9H4jPmO((boolean)fsUJ0sZPL36BC0PgJz7wW77xWBVOhqua);
            this.field010.gY14odjmtnfbkxTVHH1fYsAWx9H4jPmO((boolean)fsUJ0sZPL36BC0PgJz7wW77xWBVOhqua);
            this.field011.gY14odjmtnfbkxTVHH1fYsAWx9H4jPmO((boolean)fsUJ0sZPL36BC0PgJz7wW77xWBVOhqua);
            this.field008.gY14odjmtnfbkxTVHH1fYsAWx9H4jPmO((boolean)fsUJ0sZPL36BC0PgJz7wW77xWBVOhqua);
        });
        this.cfr_renamed_69(new Hyt49BYQLWVqxVF2wzB4yuckFDNa1gfs(this));
        this.cfr_renamed_69(new ThUmrkml96FMgR8FLa9xVI4a5McDYD7C(this));
        this.cfr_renamed_69(new YnrZHgPm43S1bJQYJQEDNeIhBpVzx7Pg(this));
        this.cfr_renamed_69(new CbxCChmQsEbRH5rNTuTK7kYHOeSmGUTf(this));
        this.cfr_renamed_69(new QfvNhE4CkKyTNmKJBUpJivYyQqGr15Us(this));
        this.cfr_renamed_69(new dPeeEBFuOd4x59MjWDVJLlxH15AdF9R6(this));
        SecureClass0003.w983xraM2Cg1plUsVtES0Kilv8JlIJ2o(this, () -> {
            this.field012 = null;
            this.field012 = new SecureClass0598(this);
        });
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_781() {
        return AntiCheatModule.field001.switch.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_782() {
        return AntiCheatModule.field001.silent.getValue().equals(muOjnLsvgO9AfAlo0Gx2LkXrr801T7Xh.Inventory);
    }

    public static /* bridge */ /* synthetic */ boolean BsDYPJIRoBEmfyLUYlfVDDSKE9KHe7Rd() {
        return AntiCheatModule.field001.field007.b24nuYXnft6L3aJgYhHbP25tDFZhX6ZN(AntiCheatModule.field001.cooldown.getValue());
    }

    public static /* bridge */ /* synthetic */ AntiCheatModule cAgW8tvusUVLXmpSlaxCd5MCfHcW6Jq7() {
        return field001;
    }
}

