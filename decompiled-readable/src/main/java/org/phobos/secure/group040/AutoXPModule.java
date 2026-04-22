/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import org.phobos.secure.group001.vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group010.UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.TKEqkaahlSip6PQRmXAZNZjSK9dewG6v;
import org.phobos.secure.group033.AVH7UMNVNq97HmY7Gn4JkHe20qEghcBs;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoXPModule
extends SecureClass1027 {
    public static /* synthetic */ AutoXPModule field001;
    public final /* synthetic */ SecureClass0603<Float> stopPercentage;
    public final /* synthetic */ SecureClass0603<Integer> packets;
    public final /* synthetic */ SecureClass0603<Boolean> stop;
    public final /* synthetic */ SecureClass0603<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6> switch;
    public final /* synthetic */ SecureClass0603<AVH7UMNVNq97HmY7Gn4JkHe20qEghcBs> field002;
    public final /* synthetic */ SecureClass0603<vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn> direction;

    public /* synthetic */ AutoXPModule(SecureClass0242 IuD7Ao3jnWdOfTEWc5V2zVlOxRcmjbSa) {
        super(IuD7Ao3jnWdOfTEWc5V2zVlOxRcmjbSa, "AutoXP", SecureClass1004.cfr_renamed_106, "Automatically throws exp", new int[0]);
        this.packets = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Packets", 1, 1, 10));
        this.switch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6>("Switch", UE7ZSQkt1tB82K1biuKkoCmCTtx9k8N6.Normal));
        this.direction = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn>("Direction", vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn.Facing));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<AVH7UMNVNq97HmY7Gn4JkHe20qEghcBs>("Rotate", AVH7UMNVNq97HmY7Gn4JkHe20qEghcBs.Normal).ltGJOpUERmhquFn9DJvLnyTOqWwML34D(this.direction, (AVH7UMNVNq97HmY7Gn4JkHe20qEghcBs[])new vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn[]{vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn.Correction, vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn.Down, vZGJP6z7FaxbvvWTOCQU3rxnp5hUrBfn.Smart}));
        this.stop = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Stop").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Prevents you from XPing when theres nothing to mend"));
        this.stopPercentage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("StopPercentage", Float.valueOf(100.0f), Float.valueOf(0.1f), Float.valueOf(100.0f), "%"));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.stop, this.stopPercentage);
        this.cfr_renamed_69(new TKEqkaahlSip6PQRmXAZNZjSK9dewG6v(this, 2, IuD7Ao3jnWdOfTEWc5V2zVlOxRcmjbSa));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ AutoXPModule ZN6PeiShd6tVZ0Q4HGG5PRSarsM3zHZl() {
        return field001;
    }
}

