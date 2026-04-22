/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group014;

import engine.linking.NativeMethodHandler;
import java.awt.Color;
import java.text.SimpleDateFormat;
import org.phobos.secure.group003.Yc3g8z4kxaw8Nuzt9pTK8WIpbAqk4VTV;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group004.VyesZDSEZIvOpIZh6SEyv8BYZ0xCOkJc;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.Ps79s3PpOeB6j2TaQvRY0ECgur7Yanee;
import org.phobos.secure.group011.oCm8cmExWEhZsLospCqSdMZKhMT94GZG;
import org.phobos.secure.group013.DZezalAk4MDUEk5hd29qWw211cyzIK0z;
import org.phobos.secure.group014.wQtfOHukBolR5bpkGTPv5IiDLPrVGU9v;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032.EGYnhue1zAKmB4K23BnCFZ1WmuvBWi2m;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group016.V7mLZx1Ua4wg70vnozcPk5gk2VqA1CPT;
import org.phobos.secure.group045.Y5QMU2EMuyMASnBMftvsKNqt7zokw98m;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Yc3g8z4kxaw8Nuzt9pTK8WIpbAqk4VTV> bypassType;
    public final /* synthetic */ SecureClass0603<Color> field001;
    public static /* synthetic */ ChatModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public static final /* synthetic */ String[] field004;
    public static final /* synthetic */ int field005;
    public final /* synthetic */ SimpleDateFormat field006;
    public final /* synthetic */ SecureClass0603<Boolean> askGrok;
    public final /* synthetic */ SecureClass0603<Boolean> extension;
    public final /* synthetic */ SecureClass0603<oCm8cmExWEhZsLospCqSdMZKhMT94GZG> brackets;
    public final /* synthetic */ SecureClass0603<String> custom;
    public final /* synthetic */ SecureClass0603<Boolean> animate;
    public final /* synthetic */ SecureClass0603<DZezalAk4MDUEk5hd29qWw211cyzIK0z> suffix;
    public static final /* synthetic */ Logger field007;
    public final /* synthetic */ SecureClass0603<Boolean> bypass;
    public final /* synthetic */ SecureClass0603<Color> timestampsDate;
    public final /* synthetic */ SecureClass0603<Boolean> timestamps;
    public final /* synthetic */ SecureClass0603<wQtfOHukBolR5bpkGTPv5IiDLPrVGU9v> timestampsRainbow;

    static {
        NativeMethodHandler.registerNativeCallbacks(84);
        field007 = LoggerFactory.getLogger(ChatModule.class);
        field005 = new Color(255, 255, 255, 150).hashCode();
        field004 = new String[]{"ass", "asshole", "autist", "bitch", "braindead", "cock", "cunt", "dick", "fag", "faggot", "fuck", "fucker", "jew", "kike", "motherfucker", "nigga", "nigger", "pussy", "pedo", "pedophile", "retard", "shit", "slut", "sped", "tranny"};
    }

    public /* synthetic */ ChatModule(SecureClass0242 IcncHDSyCboH4E9x6dxAESZ5w7cU079g) {
        super(IcncHDSyCboH4E9x6dxAESZ5w7cU079g, "Chat", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "In-game chat modifications", new int[0]);
        this.timestamps = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Timestamps"));
        this.timestampsRainbow = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<wQtfOHukBolR5bpkGTPv5IiDLPrVGU9v>("TimestampsRainbow", wQtfOHukBolR5bpkGTPv5IiDLPrVGU9v.None));
        this.timestampsDate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("TimestampsDate", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.timestampsRainbow, wQtfOHukBolR5bpkGTPv5IiDLPrVGU9v.None));
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("TimestampsBrackets", Color.GRAY));
        this.bypass = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Bypass").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Attempts to disable chat filtering"));
        this.bypassType = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Yc3g8z4kxaw8Nuzt9pTK8WIpbAqk4VTV>("BypassType", Yc3g8z4kxaw8Nuzt9pTK8WIpbAqk4VTV.C2N));
        this.animate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animate"));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Indicators", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Secure/Insecure chat indicator"));
        this.brackets = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<oCm8cmExWEhZsLospCqSdMZKhMT94GZG>("Brackets", oCm8cmExWEhZsLospCqSdMZKhMT94GZG.Angle));
        this.suffix = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<DZezalAk4MDUEk5hd29qWw211cyzIK0z>("Suffix", DZezalAk4MDUEk5hd29qWw211cyzIK0z.None));
        this.custom = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Custom", "").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.suffix, DZezalAk4MDUEk5hd29qWw211cyzIK0z.Custom));
        this.askGrok = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("AskGrok"));
        this.extension = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Extension"));
        this.field006 = new SimpleDateFormat("HH:mm");
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.timestamps, this.timestampsRainbow, this.timestampsDate, this.field001);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.bypass, this.bypassType);
        this.cfr_renamed_69(new Ps79s3PpOeB6j2TaQvRY0ECgur7Yanee(this));
        this.cfr_renamed_69(new VyesZDSEZIvOpIZh6SEyv8BYZ0xCOkJc(this));
        this.cfr_renamed_69(new Y5QMU2EMuyMASnBMftvsKNqt7zokw98m(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new EGYnhue1zAKmB4K23BnCFZ1WmuvBWi2m(this, Integer.MIN_VALUE, IcncHDSyCboH4E9x6dxAESZ5w7cU079g));
        this.cfr_renamed_69(new V7mLZx1Ua4wg70vnozcPk5gk2VqA1CPT(this));
        field002 = this;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_49() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ChatModule.field002.animate.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ ChatModule cfr_renamed_47() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_44() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && ChatModule.field002.extension.getValue() != false;
    }
}

