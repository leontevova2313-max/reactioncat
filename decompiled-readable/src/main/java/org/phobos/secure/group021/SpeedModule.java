/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group021;

import java.util.Arrays;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group009.zaFbwmzF1qLYEWw6BsA1r9fnqdLPbA7i;
import org.phobos.secure.group007._4TOwVEeowmXXylMkrzeUm8EzgsHKXWAq;
import org.phobos.secure.group012.ZD05rQZRqZ10N6DMHOp7TmqsWrGoVmOa;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.Re47kGcaWLBno4LPRa4vQ4yOrWDA9chh;
import org.phobos.secure.group025.nWndv8mixlzVJAoWgyDS4GNOG5wazWaY;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group039._711dyPsIz6U6zaXGZL0TZld6VQZo7Kny;
import org.phobos.secure.group047.feytvNSeidqFqR4FNIAbUjou6Mh8CtON;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.xrns9GbDhPBo2IwqIAkFqXqVv4Cmd3SF;
import org.phobos.secure.group061.NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl;
import org.phobos.secure.group023.qqNKije59PlCfliLmGfIVDz7rm6IMd2W;
import org.phobos.secure.group031.kDcVZYharOITZKvdWamSEq878LD8RJZe;
import org.phobos.secure.group040.SecureClass0692;
import org.phobos.secure.group045.hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx;
import org.phobos.secure.group044.EYYOiBkKwuKBsXmXB60fxymCN2H80Kv8;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.phobos.secure.group059.MCcp8n4wtd1GiwwlF7gzWs4aODlFjMFB;

public class SpeedModule
extends SecureClass1027
implements EventSubscriber {
    public final /* synthetic */ SecureClass0603<Boolean> lock;
    public final /* synthetic */ SecureClass0603<Double> strafe;
    public /* synthetic */ int field001;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Float> field003;
    public final /* synthetic */ SecureClass0603<Double> threshold;
    public final /* synthetic */ SecureClass0603<Double> boostReduction;
    public final /* synthetic */ SecureClass0603<Integer> ticks;
    public /* synthetic */ int field004;
    public final /* synthetic */ SecureClass0603<xrns9GbDhPBo2IwqIAkFqXqVv4Cmd3SF> watchdog;
    public final /* synthetic */ SecureClass0603<Double> speed;
    public final /* synthetic */ SecureClass0603<Boolean> directional;
    public final /* synthetic */ SecureClass0603<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx> secondary;
    public final /* synthetic */ NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl field005;
    public final /* synthetic */ SecureClass0603<_4TOwVEeowmXXylMkrzeUm8EzgsHKXWAq> field006;
    public final /* synthetic */ SecureClass0603<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx> mode;
    public /* synthetic */ boolean field007;
    public final /* synthetic */ SecureClass0603<Boolean> instant;
    public final /* synthetic */ SecureClass0603<Boolean> rotation;
    public final /* synthetic */ SecureClass0603<Boolean> step;
    public final /* synthetic */ SecureClass0692 field008;
    public final /* synthetic */ SecureClass0603<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx> main;
    public final /* synthetic */ MutableBoolean field009;
    public final /* synthetic */ SecureClass0603<Double> lockDistance;
    public /* synthetic */ int field010;
    public /* synthetic */ float field011;
    public final /* synthetic */ SecureClass0603<Integer> boostTicks;
    public /* synthetic */ zaFbwmzF1qLYEWw6BsA1r9fnqdLPbA7i field012;
    public static /* synthetic */ SpeedModule field013;
    public final /* synthetic */ SecureClass0603<Float> acceleration;
    public final /* synthetic */ SecureClass0603<Boolean> useTimer;

    public /* synthetic */ SpeedModule(SecureClass0242 sieuFRYDS66vxyeCOmGE6mhaYI7fOao1) {
        super(sieuFRYDS66vxyeCOmGE6mhaYI7fOao1, "Speed", SecureClass1004.rKw3Lt3wcsM2rUfkxWeIcOYlCSlEU2jS, "Speeds up your movement", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx>("Mode", hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Grim));
        this.main = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx>("Main", hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Grim).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Merged));
        this.secondary = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx>("Secondary", hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Intave).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Merged));
        this.watchdog = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<xrns9GbDhPBo2IwqIAkFqXqVv4Cmd3SF>("Watchdog", xrns9GbDhPBo2IwqIAkFqXqVv4Cmd3SF._7Tick).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Watchdog)));
        this.rotation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Rotation").cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Watchdog)).dgRfo3eJqbUqE6YkSLHzP6agKtrqtz78(() -> !this.watchdog.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(xrns9GbDhPBo2IwqIAkFqXqVv4Cmd3SF.Strict), true));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Speed", 1.6835, 0.1, 4.0).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Vanilla)));
        this.ticks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Ticks", 2, 1, 5).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Skip)));
        this.acceleration = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Acceleration", Float.valueOf(1.65f), Float.valueOf(1.02f), Float.valueOf(2.0f)).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Skip)));
        this.strafe = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Strafe", 0.8, 0.1, 1.4).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Radon)));
        this.field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_4TOwVEeowmXXylMkrzeUm8EzgsHKXWAq>("Radon", _4TOwVEeowmXXylMkrzeUm8EzgsHKXWAq.Fast).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Radon)));
        this.directional = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Directional").cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Grim)));
        this.instant = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Instant").cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Legit)));
        this.threshold = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Threshold", 1.0, 0.1, 2.0).cfr_renamed_110(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Grim)));
        this.lock = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lock"));
        this.lockDistance = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("LockDistance", 0.3, 0.1, 2.0));
        this.useTimer = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("UseTimer").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses timer"));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("UseTimerSpeed", Float.valueOf(1.0888f), Float.valueOf(1.0f), Float.valueOf(2.0f)).cfr_renamed_85("NCP", Float.valueOf(1.0888f)));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Boost"));
        this.boostTicks = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("BoostTicks", 0, 0, 16).cfr_renamed_85("None", 0));
        this.boostReduction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("BoostReduction", 1.0, 0.1, 5.0));
        this.step = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Step").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Turns on and off step for you"));
        this.field005 = NU2JivdU8A99yWS9k8q4rYPplMeZH7Bl.Y7n7CeQ15PHfnehCbNsQQKLHkI5ao1rM().TYPyxpKkXEAjGnR6Sbja2toyqSQufqIV().n4AgQ3axG4LDodqny76OXEUutqyX5q44().cfr_renamed_744(18).YZb0FGlP8nuPHDK9E1bBCRzc2GB8Qlni();
        this.field009 = new MutableBoolean();
        this.field012 = new zaFbwmzF1qLYEWw6BsA1r9fnqdLPbA7i();
        this.field008 = new SecureClass0692();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.useTimer, this.field003).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx[]{hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Strafe, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Strict, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Fast, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Friction, hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.THop}));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.boostTicks, this.boostReduction).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(() -> Arrays.stream(this.cfr_renamed_745()).anyMatch(dzpqWC3aH6KC0vLBFQ8HxHr1MEzkxhyy -> dzpqWC3aH6KC0vLBFQ8HxHr1MEzkxhyy.supportsBoost));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lock, this.lockDistance).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.IL82B7xGEks7iLl59Rd9KDJjKomPnK0U(hWyZyeyWSjHPkQeb0dkOXLYDUHeTysmx.Grim));
        this.cfr_renamed_69(new Re47kGcaWLBno4LPRa4vQ4yOrWDA9chh(this, sieuFRYDS66vxyeCOmGE6mhaYI7fOao1));
        this.cfr_renamed_69(new EYYOiBkKwuKBsXmXB60fxymCN2H80Kv8(this, sieuFRYDS66vxyeCOmGE6mhaYI7fOao1));
        this.cfr_renamed_69(new nWndv8mixlzVJAoWgyDS4GNOG5wazWaY(this));
        this.cfr_renamed_69(new _711dyPsIz6U6zaXGZL0TZld6VQZo7Kny(this, sieuFRYDS66vxyeCOmGE6mhaYI7fOao1));
        this.cfr_renamed_69(new qqNKije59PlCfliLmGfIVDz7rm6IMd2W(this));
        this.cfr_renamed_69(new feytvNSeidqFqR4FNIAbUjou6Mh8CtON(this));
        this.cfr_renamed_69(new ZD05rQZRqZ10N6DMHOp7TmqsWrGoVmOa(this));
        this.cfr_renamed_69(new kDcVZYharOITZKvdWamSEq878LD8RJZe(this));
        this.cfr_renamed_69(new MCcp8n4wtd1GiwwlF7gzWs4aODlFjMFB(this));
        field013 = this;
    }

    public static /* bridge */ /* synthetic */ SpeedModule VTUdg81gXwIJYlq5utBfsuQBOK7AOVrv() {
        return field013;
    }
}

