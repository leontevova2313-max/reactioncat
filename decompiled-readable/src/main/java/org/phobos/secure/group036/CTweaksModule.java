/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group036;

import engine.linking.NativeMethodHandler;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.SecureClass0699;
import org.phobos.secure.group046.Yc6sTHWbRpGJ2r3xoxeRSogKneeYWtQ5;
import org.phobos.secure.group050.LETdVkcwLuGmLMkIaYCuDgb3kNdEr2rl;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class CTweaksModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> spawnInvincible;
    public final /* synthetic */ SecureClass0603<Boolean> spawnBaby;
    public final /* synthetic */ SecureClass0603<Yc6sTHWbRpGJ2r3xoxeRSogKneeYWtQ5> spawnType;
    public final /* synthetic */ SecureClass0603<Double> field001;
    public final /* synthetic */ SecureClass0603<Integer> field002;
    public final /* synthetic */ SecureClass0603<SecureClass0666> fireballKey;
    public final /* synthetic */ SecureClass0603<SecureClass0666> spawnKey;
    public final /* synthetic */ SecureClass0603<Boolean> spawnGlow;
    public final /* synthetic */ SecureClass0603<SecureClass0666> arrowKey;
    public final /* synthetic */ SecureClass0603<String> field003;
    public final /* synthetic */ SecureClass0603<Double> fireballSpeed;
    public final /* synthetic */ SecureClass0603<Integer> spawnArea;
    public final /* synthetic */ SecureClass0603<Integer> spawnMultiplier;

    public /* synthetic */ CTweaksModule(SecureClass0242 SKngJeYUXIlYAH6bYo3EfY5uCO43Jg5x) {
        super(SKngJeYUXIlYAH6bYo3EfY5uCO43Jg5x, "CTweaks", SecureClass1004.cfr_renamed_106, new int[0]);
        this.arrowKey = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("ArrowKey"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("ArrowSpeed", 10.0, 0.1, 10.0));
        this.fireballKey = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("FireballKey"));
        this.fireballSpeed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("FireballSpeed", 6.0, 0.1, 10.0));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("FireballPower", 15, 2, 50));
        this.spawnKey = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("SpawnKey"));
        this.spawnType = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Yc6sTHWbRpGJ2r3xoxeRSogKneeYWtQ5>("SpawnType", Yc6sTHWbRpGJ2r3xoxeRSogKneeYWtQ5.Dragon));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("SpawnName", "Nigger"));
        this.spawnInvincible = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("SpawnInvincible"));
        this.spawnGlow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("SpawnGlow"));
        this.spawnBaby = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("SpawnBaby"));
        this.spawnArea = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SpawnArea", 60, 10, 200));
        this.spawnMultiplier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SpawnMultiplier", 1, 1, 10));
        this.cfr_renamed_89("Arrow", this.arrowKey, this.field001).DBhPWD7PVqTWgYmQv6fkqzLRJutncZBs("Summons an arrow");
        this.cfr_renamed_89("Fireball", this.fireballKey, this.fireballSpeed, this.field002).DBhPWD7PVqTWgYmQv6fkqzLRJutncZBs("Summons a custom fireball");
        this.cfr_renamed_89("Spawn", this.spawnKey, this.spawnType, this.field003, this.spawnInvincible, this.spawnGlow, this.spawnBaby, this.spawnArea, this.spawnMultiplier).DBhPWD7PVqTWgYmQv6fkqzLRJutncZBs("Summons entities");
        SecureClass0699.VC88vMnA5DaF7779RiezVp36cUDr2dAM(this.arrowKey, this::CD9Tz1tv51lzRogXf1jRW1UrP8ZgOPxV, this, LETdVkcwLuGmLMkIaYCuDgb3kNdEr2rl.Active);
        SecureClass0699.VC88vMnA5DaF7779RiezVp36cUDr2dAM(this.fireballKey, this::RrbxEUus9QzRCMtZzlverLH5yIEufibT, this, LETdVkcwLuGmLMkIaYCuDgb3kNdEr2rl.Active);
        SecureClass0699.VC88vMnA5DaF7779RiezVp36cUDr2dAM(this.spawnKey, this::H0EjB4BUWZDbu2mr36UpUHuhcIK0t6Br, this, LETdVkcwLuGmLMkIaYCuDgb3kNdEr2rl.Active);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(93);
    }
}

