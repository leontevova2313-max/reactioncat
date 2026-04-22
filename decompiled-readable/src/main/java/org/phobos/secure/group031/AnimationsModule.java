/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group031;

import net.minecraft.class_1511;
import org.earthhack.ducks.IEndCrystalEntity;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group006.WrN2T9u6yOBESWEjH8yFqxJR1GdQOLAe;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.KZqiLb0B4rDcp5N9j2NSUgCPDVmKqud5;
import org.phobos.secure.group034._88NZtWg5ggjmhgx8bi9PROCcobAkX0Nm;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group030.CoDnCrmuyONruBo4fdKA8KXzLBY9ZZ63;
import org.phobos.secure.group053.PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group054.IuEP6ni9Fve8ng62GECRw2Z5WRBqtXEU;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AnimationsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public static /* synthetic */ AnimationsModule field003;
    public final /* synthetic */ SecureClass0603<Boolean> speed;
    public final /* synthetic */ SecureClass0603<Float> crystalsSpeedFactor;
    public final /* synthetic */ SecureClass0603<KZqiLb0B4rDcp5N9j2NSUgCPDVmKqud5> selection;
    public final /* synthetic */ SecureClass0603<Float> speedFactor;
    public final /* synthetic */ SecureClass0603<Boolean> position;
    public final /* synthetic */ SecureClass0603<Boolean> swing;
    public final /* synthetic */ SecureClass0603<Integer> swingSpeed;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsSpeed;
    public final /* synthetic */ SecureClass0603<Boolean> sneak;
    public final /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ SecureClass0603<Boolean> limbs;
    public final /* synthetic */ SecureClass0603<Float> crystalsScaleValue;
    public final /* synthetic */ SecureClass0603<Boolean> field005;
    public final /* synthetic */ SecureClass0603<PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS> sneakMode;
    public final /* synthetic */ SecureClass0603<Boolean> rotations;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsScale;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsSmooth;
    public final /* synthetic */ SecureClass0603<Boolean> crystals;
    public final /* synthetic */ SecureClass0603<Float> crystalsOffsetFactor;
    public final /* synthetic */ SecureClass0603<Boolean> crystalsOffset;

    public static /* bridge */ /* synthetic */ boolean uhUEorvwOnJawr2vLhH867pno0MJBfz8() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.sneak.getValue() != false && AnimationsModule.field003.sneakMode.getValue().equals((Object)((Object)PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS.Custom));
    }

    public static /* bridge */ /* synthetic */ float QmJG6PNOCAaV0SYbOKxjWSb3NPcs831M(float f) {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.crystals.getValue() != false && AnimationsModule.field003.crystalsSpeed.getValue() != false ? f * AnimationsModule.field003.crystalsSpeedFactor.getValue().floatValue() : f;
    }

    public /* synthetic */ AnimationsModule(SecureClass0242 vyKIWulmAUEFEASTobziiw7LeWxcjmrK) {
        super(vyKIWulmAUEFEASTobziiw7LeWxcjmrK, "Animations", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Manages animations", new int[0]);
        this.swing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swing", false));
        this.swingSpeed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("SwingSpeed", 6, 0, 25));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Speed", false));
        this.selection = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<KZqiLb0B4rDcp5N9j2NSUgCPDVmKqud5>("Selection", KZqiLb0B4rDcp5N9j2NSUgCPDVmKqud5.All));
        this.limbs = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Limbs"));
        this.rotations = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotations"));
        this.position = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Position"));
        this.speedFactor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("SpeedFactor", Float.valueOf(1.0f), Float.valueOf(-3.0f), Float.valueOf(3.0f)));
        this.sneak = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sneak", false));
        this.sneakMode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS>("SneakMode", PP1YxhwpDFYkLKIyC0iBzqZBrZ6Kk3AS.Lerp));
        this.crystals = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Crystals"));
        this.crystalsScale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsScale"));
        this.crystalsScaleValue = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("CrystalsScaleValue", Float.valueOf(2.0f), Float.valueOf(0.0f), Float.valueOf(3.0f)));
        this.crystalsSpeed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsSpeed"));
        this.crystalsSpeedFactor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("CrystalsSpeedFactor", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(100.0f)));
        this.crystalsOffset = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsOffset"));
        this.crystalsOffsetFactor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("CrystalsOffsetFactor", Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.crystalsSmooth = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("CrystalsSmooth"));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Players"));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("PlayersStatic"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("1.7").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("1.7 like animations"));
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("NoDeath").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Disables tilt when the entity is dead"));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.crystals).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.crystalsScale, this.crystalsScaleValue), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.crystalsSpeed, this.crystalsSpeedFactor), this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.crystalsOffset, this.crystalsOffsetFactor)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.crystalsSmooth).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.field005);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.swing, this.swingSpeed);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.speed, this.selection, this.limbs, this.rotations, this.position, this.speedFactor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.sneak, this.sneakMode);
        this.cfr_renamed_69(new IuEP6ni9Fve8ng62GECRw2Z5WRBqtXEU(this));
        this.cfr_renamed_69(new _88NZtWg5ggjmhgx8bi9PROCcobAkX0Nm(this));
        this.cfr_renamed_69(new WrN2T9u6yOBESWEjH8yFqxJR1GdQOLAe(this));
        this.cfr_renamed_69(new CoDnCrmuyONruBo4fdKA8KXzLBY9ZZ63(this));
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ float RwhidMckdx4lajUfQTr3nNv6v2XkfvTt(class_1511 wvgrEufzSUOawjx3kR1YaZ7gWvG1f6Y3) {
        if (field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.crystals.getValue().booleanValue() && AnimationsModule.field003.crystalsSmooth.getValue().booleanValue()) {
            IEndCrystalEntity field006 = (IEndCrystalEntity)wvgrEufzSUOawjx3kR1YaZ7gWvG1f6Y3;
            SecureClass0377 field007 = field006.getAnimation();
            field007.BMMCpqfUxEdTwLEu5UFj3ge24ytSFktk(10.0f, 0.1f);
            return field007.HboXzV3Ip3FFLIo2skUGVRPM5Vfd3ObY();
        }
        return 2.0f;
    }

    public static /* bridge */ /* synthetic */ boolean FnIzSkP2PGTjMrLncFA98RqTSQftOQee() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.field001.getValue() != false && AnimationsModule.field003.field005.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean gxP5Sdr5vYTqrg5UDiPPRC8tScUFDfQn() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.field002.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ float j8sCUn4q9LdqmZM3wfHGUoSep4qFhfg6(float field008) {
        if (field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.crystals.getValue().booleanValue() && AnimationsModule.field003.crystalsOffset.getValue().booleanValue()) {
            return field008 * AnimationsModule.field003.crystalsOffsetFactor.getValue().floatValue();
        }
        return field008;
    }

    public static /* bridge */ /* synthetic */ float YTtqj7VidmuGs4JuKjlLIsMLqagxU8W2() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.crystals.getValue() != false && AnimationsModule.field003.crystalsScale.getValue() != false ? AnimationsModule.field003.crystalsScaleValue.getValue().floatValue() : 2.0f;
    }

    public static /* bridge */ /* synthetic */ float AekSpQ3RY5j8K9090C81vP06Gib6su8V(float AE5UnVxEMt7NsReHG2VWOLFqe7U7thvP) {
        return AE5UnVxEMt7NsReHG2VWOLFqe7U7thvP * AnimationsModule.field003.speedFactor.getValue().floatValue();
    }

    public static /* bridge */ /* synthetic */ boolean dwUCEhoQBQX1Hun1W4TEMsmkuq71BvzY() {
        return AnimationsModule.cfr_renamed_831() && AnimationsModule.field003.rotations.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_35() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.field004.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_34() {
        return AnimationsModule.cfr_renamed_831() && AnimationsModule.field003.limbs.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean SECzLQRZ88n1cTyPN1IaGyGC3Kx8N7Gy() {
        return AnimationsModule.cfr_renamed_831() && AnimationsModule.field003.position.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_831() {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AnimationsModule.field003.speed.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ AnimationsModule cfr_renamed_832() {
        return field003;
    }
}

