/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import com.mojang.blaze3d.systems.RenderSystem;
import engine.linking.NativeMethodHandler;
import java.awt.Color;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group013.EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.SecureClass0312;
import org.phobos.secure.group029.Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group041.vRpVx8zJb9x5Q3Duz3xlsdMGVzkjpV8A;
import org.phobos.secure.group051.Vg0qz3OFgPDbDOX4XdRRYgPnBy4FqXKF;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group063.SecureInterface0145;
import org.phobos.secure.group028.SecureInterface0078;
import org.phobos.secure.group030.yiSNy1bsJQ6Ox48H1wXGiy5oL7l0Os92;
import org.phobos.secure.group031.wBi7dTE0NoVsM0iHsG31l2ezWtTMvAPx;
import org.phobos.secure.group043.ykQoS3cFrNKL8bmDIYYvKH9Su76mQxjY;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.KY6cbATCVdICaOLkj9PposBhc9JvQ5sl;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AmbienceModule
extends SecureClass1027 {
    public static /* synthetic */ AmbienceModule field001;
    public final /* synthetic */ SecureClass0603<Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF> skyLocation;
    public final /* synthetic */ SecureClass0603<Color> hitColor;
    public final /* synthetic */ SecureClass0603<Float> field002;
    public final /* synthetic */ SecureClass0603<Boolean> bloom;
    public final /* synthetic */ SecureClass0603<Color> lightningColor;
    public final /* synthetic */ SecureClass0603<Color> backgroundColor;
    public /* synthetic */ long field003;
    public final /* synthetic */ SecureClass0603<Boolean> time;
    public final /* synthetic */ SecureInterface0078 field004;
    public final /* synthetic */ SecureClass0603<Color> lightColor;
    public final /* synthetic */ SecureClass0603<KY6cbATCVdICaOLkj9PposBhc9JvQ5sl> skyMode;
    public final /* synthetic */ SecureClass0603<Boolean> lightning;
    public final /* synthetic */ SecureClass0603<Boolean> hit;
    public final /* synthetic */ SecureClass0603<Integer> timeValue;
    public final /* synthetic */ SecureClass0603<Boolean> sky;
    public final /* synthetic */ SecureClass0603<Boolean> light;
    public final /* synthetic */ SecureClass0603<EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui> field005;
    public /* synthetic */ SecureClass0312 field006;
    public final /* synthetic */ SecureClass0603<Boolean> background;
    public final /* synthetic */ SecureClass0603<Color> skyColor;
    public final /* synthetic */ SecureClass0603<Float> blur;
    public final /* synthetic */ SecureClass0603<String> skyName;

    public static /* bridge */ /* synthetic */ Color f9FWytvKEc6mwAFo46qJUqvSbA8eWO9G() {
        return AmbienceModule.field001.hitColor.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean QYuw9tBcsX8RgHrfwyLxO2hX9hkcjiXu() {
        return field001 != null && field001.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && AmbienceModule.field001.hit.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ boolean iU1E3Gxao64mLPvlg3S70vDxckAcYI4Q() {
        return AmbienceModule.field001.field006 != null && AmbienceModule.field001.field006.ryq2NYXdNafQmIEYxGsxMAXtgED4g7Ks();
    }

    public static /* bridge */ /* synthetic */ void fRM6t2Rm0TXnTMYmiAJK2QuevTSjR9S7() {
        AmbienceModule.field001.field006.cfr_renamed_122();
        class_1043 field007 = AmbienceModule.field001.field006.ChyPldbXJkrDTkyhXRmkFS3Ed968fwLE();
        RenderSystem.setShaderTexture((int)0, (int)field007.method_4624());
    }

    public /* synthetic */ AmbienceModule(SecureClass0242 ZflspcA0kvWrQnaPx4qtZMOgcXkJjuXr) {
        super(ZflspcA0kvWrQnaPx4qtZMOgcXkJjuXr, "Ambience", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Manages world look", new int[0]);
        this.light = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Light"));
        this.lightColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LightColor", Color.WHITE));
        this.sky = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sky", true));
        this.skyMode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<KY6cbATCVdICaOLkj9PposBhc9JvQ5sl>("SkyMode", KY6cbATCVdICaOLkj9PposBhc9JvQ5sl.Color));
        this.skyColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("SkyColor", Color.BLACK));
        this.skyLocation = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF>("SkyLocation", Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF.Resources).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.skyMode, (Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF)((Object)KY6cbATCVdICaOLkj9PposBhc9JvQ5sl.Texture)));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui>("SkyType", EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui.Image).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.skyMode, (EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui)((Object)KY6cbATCVdICaOLkj9PposBhc9JvQ5sl.Texture)).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.skyLocation, Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF.Global));
        this.skyName = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("SkyName", "skybox.png").UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.skyMode, KY6cbATCVdICaOLkj9PposBhc9JvQ5sl.Texture).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.skyLocation, Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF.Global));
        this.background = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Background"));
        this.backgroundColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BackgroundColor", Color.WHITE));
        this.time = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Time", false));
        this.timeValue = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("TimeValue", 21, 0, 23));
        this.bloom = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Bloom"));
        this.blur = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Blur", Float.valueOf(512.0f), Float.valueOf(1.0f), Float.valueOf(1000.0f)));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Intensity", Float.valueOf(0.35f), Float.valueOf(0.0f), Float.valueOf(1.0f)));
        this.lightning = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Lightning"));
        this.lightningColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LightningColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.hit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Hit"));
        this.hitColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("HitColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field004 = SecureInterface0145.PtJPKA0EcuQD6qGGWW8Wiw1qVYm5uv9q().F3sfSlq2AZLMblUCFXglKOK50zB3kY3d(class_2960.method_60655((String)"phoboslite", (String)"shaders/post/bloom.json"));
        this.field003 = 0L;
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.light, this.lightColor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.sky, this.skyMode, this.skyColor, this.skyLocation, this.field005, this.skyName);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.background, this.backgroundColor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.time, this.timeValue);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.bloom, this.blur, this.field002);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.lightning, this.lightningColor);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.hit, this.hitColor);
        this.time.cfr_renamed_123(VlLlC0UYP2ReSBGePYRDNHG2eO2FzshD -> {
            if (AmbienceModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687 == null) {
                return;
            }
            if (VlLlC0UYP2ReSBGePYRDNHG2eO2FzshD.booleanValue()) {
                this.field003 = AmbienceModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687.method_8510();
            }
            if (!VlLlC0UYP2ReSBGePYRDNHG2eO2FzshD.booleanValue()) {
                AmbienceModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687.method_8435(this.field003);
            }
        });
        this.skyLocation.cfr_renamed_123(MCUuq7H6WNLvb7NLca2upAMPDOvNcLql -> SecureClass0242.XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(() -> this.B5VqWsrb71A9Ckmgbujv1toKvqaVizYR((Ks9s7jCUJptmplFrfgp28ehJxRyFE5VF)MCUuq7H6WNLvb7NLca2upAMPDOvNcLql)));
        this.skyName.cfr_renamed_123(AMoR0DOyauQTfFyDbvi3lHDtphRuUHuZ -> this.Viauj0s6Yn9WjiYnPw3hQwve1pcV3hWl(this.field005.getValue()));
        this.field005.cfr_renamed_123(KJ2h5xu5YJdf9jHA6FHGMyLoNAtMSH2n -> SecureClass0242.XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(() -> this.Viauj0s6Yn9WjiYnPw3hQwve1pcV3hWl((EKLVzn0Q5igmB4VaQ3jo9hUwVqhxUaui)((Object)KJ2h5xu5YJdf9jHA6FHGMyLoNAtMSH2n))));
        this.sky.cfr_renamed_123(eMGBXLbG1lIHpFIVME0FtOeS54B1bVWZ -> {
            if (!eMGBXLbG1lIHpFIVME0FtOeS54B1bVWZ.booleanValue()) {
                this.lJdQ8xpsZAFbGyCQ6Ug3lBGAB5BmYSwC();
                return;
            }
            this.Viauj0s6Yn9WjiYnPw3hQwve1pcV3hWl(this.field005.getValue());
        });
        this.cfr_renamed_69(new yiSNy1bsJQ6Ox48H1wXGiy5oL7l0Os92(this));
        this.cfr_renamed_69(new ykQoS3cFrNKL8bmDIYYvKH9Su76mQxjY(this));
        this.cfr_renamed_69(new vRpVx8zJb9x5Q3Duz3xlsdMGVzkjpV8A(this));
        this.cfr_renamed_69(new wBi7dTE0NoVsM0iHsG31l2ezWtTMvAPx(this));
        this.cfr_renamed_69(new Vg0qz3OFgPDbDOX4XdRRYgPnBy4FqXKF(this));
        this.asTX5nZlsS4qmlDrYwmHUiVFh3Wz0ETr();
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ AmbienceModule W5pOdQ4T6ASzwm4W9DoGzC89oh4KhkOZ() {
        return field001;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(104);
    }
}

