/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group042;

import com.google.gson.internal.LinkedTreeMap;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.AVvNCw1ytYzmOMguLew2iwkRhfH826Lh;
import org.phobos.secure.group005._8rUUKbI6yalNVpe8fRr1KeCyLfUMZSiU;
import org.phobos.secure.group007.SecureEnum0002;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureClass0272;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group029.SecureClass0512;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class GameTiersModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> override;
    public final /* synthetic */ SecureClass0603<Boolean> icons;
    public final /* synthetic */ SecureClass0603<Boolean> field001;
    public final /* synthetic */ SecureClass0603<_8rUUKbI6yalNVpe8fRr1KeCyLfUMZSiU> overrideTier;
    public final /* synthetic */ SecureClass0603<Boolean> overrideR;
    public final /* synthetic */ SecureClass0603<AVvNCw1ytYzmOMguLew2iwkRhfH826Lh> display;
    public static /* synthetic */ GameTiersModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ LinkedTreeMap<String, Integer> field004;
    public final /* synthetic */ SecureClass0603<SecureEnum0002> vendor;

    public /* synthetic */ GameTiersModule(SecureClass0242 P6xAdAnvVZLHvrvEpDlJaiXlzLoEbqgr) {
        super(P6xAdAnvVZLHvrvEpDlJaiXlzLoEbqgr, "GameTiers", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Minecraft vanilla tiers", new int[0]);
        this.field001 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Online"));
        this.vendor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureEnum0002>("Vendor", SecureEnum0002.MCTiers));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Retired"));
        this.display = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<AVvNCw1ytYzmOMguLew2iwkRhfH826Lh>("Display", AVvNCw1ytYzmOMguLew2iwkRhfH826Lh.Tier));
        this.icons = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Icons"));
        this.override = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Override"));
        this.overrideTier = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_8rUUKbI6yalNVpe8fRr1KeCyLfUMZSiU>("OverrideTier", _8rUUKbI6yalNVpe8fRr1KeCyLfUMZSiU.LT5));
        this.overrideR = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("OverrideR"));
        this.field004 = new LinkedTreeMap();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field001, this.vendor, this.field003, this.display, this.icons);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.override, this.overrideTier, this.overrideR);
        this.field004.put((Object)"HT1", (Object)15252026);
        this.field004.put((Object)"LT1", (Object)14005077);
        this.field004.put((Object)"HT2", (Object)12899303);
        this.field004.put((Object)"LT2", (Object)10528690);
        this.field004.put((Object)"HT3", (Object)16293722);
        this.field004.put((Object)"LT3", (Object)13007682);
        this.field004.put((Object)"HT4", (Object)8483994);
        this.field004.put((Object)"LT4", (Object)6642553);
        this.field004.put((Object)"HT5", (Object)9405096);
        this.field004.put((Object)"LT5", (Object)6642553);
        this.vendor.cfr_renamed_123(JwXoshXi5gAJlCy9md7U129awWhVPvkH -> SecureClass0512.cfr_renamed_456(SecureClass0272::HyQrOKRTIgkexRcC7TtfE9xZuKtD6zKT));
        field002 = this;
        SecureClass0512.cfr_renamed_456(SecureClass0272::HyQrOKRTIgkexRcC7TtfE9xZuKtD6zKT);
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }

    public static /* bridge */ /* synthetic */ boolean FSo5NM8CyCAmli7dfSvCjLoOi0gZCJsM() {
        return field002 != null && field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && GameTiersModule.field002.override.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ GameTiersModule Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74() {
        return field002;
    }
}

