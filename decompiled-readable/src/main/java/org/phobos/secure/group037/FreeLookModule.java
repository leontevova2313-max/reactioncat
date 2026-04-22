/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import net.minecraft.class_746;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.iR9Nze0kQzjSKmaznDKMADOTbluj9NcD;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs;
import org.phobos.secure.group063.GUjAoPpDr5hh3MNuJFY5ZMUkubgmhUZu;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class FreeLookModule
extends SecureClass1027 {
    public /* synthetic */ LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs field001;
    public static /* synthetic */ FreeLookModule field002;
    public final /* synthetic */ SecureClass0603<Boolean> yaw;
    public final /* synthetic */ SecureClass0603<Boolean> nametags;
    public final /* synthetic */ SecureClass0603<Boolean> pitch;

    public static /* bridge */ /* synthetic */ float Mbr99cqw4vAGnf6i5J5WRjB7XMOlb0nh(class_746 class_7462) {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? FreeLookModule.field002.field001.lSV3EydYgvGf2T9pb0gClUXJaW17TrNp() : class_7462.method_36454();
    }

    public /* synthetic */ FreeLookModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "FreeLook", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Better F5", new int[0]);
        this.nametags = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Nametags", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Tweaks nametags transformation"));
        this.yaw = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Yaw", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses starting yaw for nametags rotation"));
        this.pitch = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Pitch", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Uses starting pitch for nametags rotation"));
        this.field001 = new LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs(0.0f, 0.0f);
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.nametags, this.yaw, this.pitch);
        this.cfr_renamed_69(new iR9Nze0kQzjSKmaznDKMADOTbluj9NcD(this, -1, ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb));
        this.cfr_renamed_69(new GUjAoPpDr5hh3MNuJFY5ZMUkubgmhUZu(this, 2));
        field002 = this;
    }

    public static /* bridge */ /* synthetic */ boolean zkuNEewwwxBq3GrK4vOgDIIgFWEVpRNb() {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && FreeLookModule.field002.nametags.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ float qy5E4uH8agsK1gGpr15NybvHAFyUfCGI(class_746 o9dqgztTztgahY3Ut0iDS86SZu4IZo3Y) {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() ? FreeLookModule.field002.field001.SfAOCZWjOxio7WWcx4VHvoxfiaar48V1() : o9dqgztTztgahY3Ut0iDS86SZu4IZo3Y.method_36455();
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_858(float oYZYckRGvUeiSZmpJEFlJ9ms9HLwovzE) {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && FreeLookModule.field002.nametags.getValue() != false && FreeLookModule.field002.pitch.getValue() != false ? 0.0f : oYZYckRGvUeiSZmpJEFlJ9ms9HLwovzE;
    }

    public static /* bridge */ /* synthetic */ FreeLookModule XC29zHwnJuDCNjqLcudFe1bMXL353E7w() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ float cfr_renamed_378(float pdb2ByIPVQ2St7AMG493DoZTH7WOuvI4) {
        return field002.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && FreeLookModule.field002.nametags.getValue() != false && FreeLookModule.field002.yaw.getValue() != false ? FreeLookModule.field002.field001.lSV3EydYgvGf2T9pb0gClUXJaW17TrNp() : pdb2ByIPVQ2St7AMG493DoZTH7WOuvI4;
    }
}

