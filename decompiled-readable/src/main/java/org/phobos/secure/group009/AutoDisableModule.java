/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import java.util.Iterator;
import java.util.Map;
import org.phobos.secure.group014.KJRmoYGDYonMVioNlMf80XltiDtnkGY3;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0409;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.wEE9p6tCsm1wztiYnWndVEiNtXdCmk4o;
import org.phobos.secure.group041._1OCksgGCCVZ4wspmjpZdWf08c13zwBWz;
import org.phobos.secure.group049.SecureClass0889;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group040.IxiMvShF274oChanRlcUm7L3dzhVYSx6;
import org.phobos.secure.group044.BxhASolcmiE5S5q8JcG94IImzhZIRt7Y;
import org.phobos.secure.group056.SecureClass1027;

public class AutoDisableModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Map<IxiMvShF274oChanRlcUm7L3dzhVYSx6, Boolean>> field001;
    public final /* synthetic */ SecureClass0603<Map<SecureClass1027, Boolean>> field002;

    public /* synthetic */ AutoDisableModule(SecureClass0242 zDLKBjNwcZahnmNss7SifKEwdppBzt0o) {
        super(zDLKBjNwcZahnmNss7SifKEwdppBzt0o, "AutoDisable", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Automatically disables selected modules on certain events", new int[0]);
        this.field001 = new SecureClass0889<IxiMvShF274oChanRlcUm7L3dzhVYSx6>("Trigger", IxiMvShF274oChanRlcUm7L3dzhVYSx6.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(jDM9U7k3juBXRqUJq7pvMZXg9aGO4fay -> {
            IxiMvShF274oChanRlcUm7L3dzhVYSx6[] field003 = IxiMvShF274oChanRlcUm7L3dzhVYSx6.values();
            int n = field003.length;
            int n2 = 0;
            while (n2 < n) {
                IxiMvShF274oChanRlcUm7L3dzhVYSx6 field004 = field003[n2];
                jDM9U7k3juBXRqUJq7pvMZXg9aGO4fay.bGwM62Ubm12oMVmfN57O7Jq3mIRAft3L(field004, field004.name(), false);
                ++n2;
            }
            return;
        }).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.field002 = new SecureClass0889<SecureClass1027>("Modules", SecureClass1027.class).GvLUyjS0XBqdVrWA0juYEAMBslkbqzXn(rcYI2DrJauP6cDDeugbbv5PySX2J0Qdf2 -> {
            Iterator<SecureClass1027> iterator = this.bpGcJez0mXhtoHJNzH04ZaxV13Vu5tqv.YWrhoDEJcoNJc9Sdg7JAbAVaQJLoaiKS().cfr_renamed_154().iterator();
            while (iterator.hasNext()) {
                SecureClass1027 field005 = iterator.next();
                rcYI2DrJauP6cDDeugbbv5PySX2J0Qdf2.bGwM62Ubm12oMVmfN57O7Jq3mIRAft3L(field005, field005.getName(), false);
            }
            return;
        }).Ev95FpkGRTQwT3vYCftzy9t8cEMRmrsV(this);
        this.cfr_renamed_69(new KJRmoYGDYonMVioNlMf80XltiDtnkGY3(this, zDLKBjNwcZahnmNss7SifKEwdppBzt0o));
        this.cfr_renamed_69(new wEE9p6tCsm1wztiYnWndVEiNtXdCmk4o(this));
        this.cfr_renamed_69(new BxhASolcmiE5S5q8JcG94IImzhZIRt7Y(this));
        this.cfr_renamed_69(new _1OCksgGCCVZ4wspmjpZdWf08c13zwBWz(this));
        SecureClass0409.GfjeVBDwZhLIlQYaqI3T7bpwBoYpDOJx().cfr_renamed_83("legacy", this);
    }
}

