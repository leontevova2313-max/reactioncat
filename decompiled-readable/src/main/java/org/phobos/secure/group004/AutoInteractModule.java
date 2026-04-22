/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group004;

import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group028.SecureClass0490;
import org.phobos.secure.group028.SecureEnum0008;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoInteractModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Integer> delay;
    public final /* synthetic */ SecureClass0603<Integer> iterations;
    public /* synthetic */ int field001;
    public final /* synthetic */ SecureClass0603<Double> range;
    public final /* synthetic */ SecureClass0603<Boolean> swing;
    public final /* synthetic */ SecureClass0603<SecureEnum0008> mode;

    public /* synthetic */ AutoInteractModule(SecureClass0242 vondbHUqtQiPBOqfET9aaQ6q4HqiKeYD) {
        super(vondbHUqtQiPBOqfET9aaQ6q4HqiKeYD, "AutoInteract", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Clicks on buttons & levers", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureEnum0008>("Mode", SecureEnum0008.Single));
        this.iterations = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Iterations", 1, 1, 10));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Delay", 0, 0, 10));
        this.range = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Double>("Range", 6.0, 0.1, 6.0));
        this.swing = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Swing"));
        this.field001 = 0;
        this.cfr_renamed_69(new SecureClass0490(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

