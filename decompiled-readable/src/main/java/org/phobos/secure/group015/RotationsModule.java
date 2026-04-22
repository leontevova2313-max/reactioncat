/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group019.PWVDWHCQicx0rakNciYOx0N5fu6yROR1;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group021.DisablerModule;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class RotationsModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F> cursor;
    public final /* synthetic */ SecureClass0603<Integer> slices;
    public static /* synthetic */ RotationsModule field001;
    public final /* synthetic */ SecureClass0603<Boolean> moveFix;
    public final /* synthetic */ SecureClass0603<Boolean> sensitivity;
    public final /* synthetic */ SecureClass0603<PWVDWHCQicx0rakNciYOx0N5fu6yROR1> display;

    public static /* bridge */ /* synthetic */ boolean OOnB0dS3TU2JT53Hz1MAyvRL7DeRFFww() {
        return RotationsModule.field001.display.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(PWVDWHCQicx0rakNciYOx0N5fu6yROR1.Silent);
    }

    public static /* bridge */ /* synthetic */ boolean LyhipsDcSND2mt20iy06Gz5RoalgpLk2() {
        return RotationsModule.field001.moveFix.getValue() != false && !DisablerModule.wFcTucMiHLZ6rs3U21yw63KlFkAaoUxM();
    }

    public /* synthetic */ RotationsModule(SecureClass0242 JGURGQEuy6jTa1KprLOBcRclFnHIypq5) {
        super(JGURGQEuy6jTa1KprLOBcRclFnHIypq5, "Rotations", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Manages client rotations", new int[0]);
        this.moveFix = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("MoveFix").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Movement correction"));
        this.cursor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F>("Cursor", hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F.Track).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Controls cursor"));
        this.slices = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Slices", 6, 0, 10).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.cursor, hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F.Grim));
        this.sensitivity = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Sensitivity").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Adjusts sensitivity"));
        this.display = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<PWVDWHCQicx0rakNciYOx0N5fu6yROR1>("Display", PWVDWHCQicx0rakNciYOx0N5fu6yROR1.Smooth));
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ boolean Uz9TOY808UD9Cp8JI0TK7gl4eeCQURBY() {
        return RotationsModule.field001.display.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(PWVDWHCQicx0rakNciYOx0N5fu6yROR1.Smooth);
    }

    public static /* bridge */ /* synthetic */ boolean kHqXxgGiDirIIaRIN6NdALZNuU156ZXV() {
        return RotationsModule.field001.cursor.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F.Grim);
    }

    public static /* bridge */ /* synthetic */ boolean j9SvT6ZXosbL7aJ9uSTzUEmYzkInWoWr() {
        return RotationsModule.field001.display.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(PWVDWHCQicx0rakNciYOx0N5fu6yROR1.Instant);
    }

    public static /* bridge */ /* synthetic */ RotationsModule cfr_renamed_302() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_23() {
        return RotationsModule.field001.cursor.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(hUMCB6m1Om1QFFZkHA5sP76xzgTz3i4F.Track);
    }
}

