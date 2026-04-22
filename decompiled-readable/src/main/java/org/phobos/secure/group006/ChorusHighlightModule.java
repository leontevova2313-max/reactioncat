/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group006;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0550;
import org.phobos.secure.group050.SecureClass0898;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class ChorusHighlightModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Color> field001;
    public final /* synthetic */ SecureClass0603<Float> field002;
    public final /* synthetic */ SecureClass0603<Long> field003;
    public final /* synthetic */ SecureClass0603<Color> field004;

    public /* synthetic */ ChorusHighlightModule(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        super(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, "ChorusHighlight", SecureClass1004.xT95XIw2kRR973ICAnx4z1vSEwKBGYMF, "Highlights chorus teleports", new int[0]);
        this.field001 = new SecureClass0074("Box", SecureClass0898.cV4S9wwpLtQBetPo2IY4fIDGpcfATNh4(Color.WHITE, 0.3f)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field004 = new SecureClass0074("Line", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs().Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0962<Float>("Width", Float.valueOf(1.0f), Float.valueOf(0.1f), Float.valueOf(3.0f)).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field003 = new SecureClass0840("Fade", 5000L, 250L, 15000L).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_89("Render", this.field001, this.field004, this.field002, this.field003);
        this.cfr_renamed_69(new SecureClass0550(this));
    }
}

