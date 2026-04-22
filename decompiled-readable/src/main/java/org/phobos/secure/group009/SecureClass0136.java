/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group009;

import engine.linking.NativeMethodHandler;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group005.SecureClass0069;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group062.SecureInterface0143;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0136
implements SecureInterface0038,
SecureInterface0143,
SecureInterface0134,
Iterable<SecureClass0069> {
    public static final /* synthetic */ Logger field001;
    public final /* synthetic */ List<SecureClass0069> field002;
    public final /* synthetic */ SecureClass0242 field003;

    public static /* bridge */ /* synthetic */ boolean KnezcaY31MRDc7HKbnvXCGbHWmMzzvX4(String oeEQa1Lartin2XykhvVqBWeqBtnuHMkO, SecureClass0069 QceRKerR875pv5uA1JigVdq6uOJfkS47) {
        return QceRKerR875pv5uA1JigVdq6uOJfkS47.getName().equals(oeEQa1Lartin2XykhvVqBWeqBtnuHMkO);
    }

    public static /* bridge */ /* synthetic */ boolean NrQz97y28CJfnk3AzZx9H4hJEmervkbt(SecureClass0069 UFoQ7revzTbfxtPBhe1BWG8sD24PAEHq, SecureClass0069 lzhkor4w322pl6BY0w1bRoiAv2qjd15i) {
        return lzhkor4w322pl6BY0w1bRoiAv2qjd15i.getName().equals(UFoQ7revzTbfxtPBhe1BWG8sD24PAEHq.getName());
    }

    public /* synthetic */ SecureClass0136(SecureClass0242 aWNOvqy36MV4GjSx5dcnIAlezd1p2TP7) {
        this.field002 = new ArrayList<SecureClass0069>();
        this.field003 = aWNOvqy36MV4GjSx5dcnIAlezd1p2TP7;
    }

    public static /* bridge */ /* synthetic */ boolean zR4Lb0FBqw1ZqqRo0EjHdgO5h2eng2DO(String yoHyCknIDpxlvrXXV3ukm4c2gAnHu4Ag, MutableObject pTWDDj2m1NTmwegu9POCQQ8mS4f2uPSE, SecureClass0069 oHqYITPKf1aa9tlSucGSOnipFbThG8MJ) {
        String field004 = oHqYITPKf1aa9tlSucGSOnipFbThG8MJ.AlqyJdwIG71luB78r1TwzoiMBsob7Bvn().getName();
        if (yoHyCknIDpxlvrXXV3ukm4c2gAnHu4Ag.equals(oHqYITPKf1aa9tlSucGSOnipFbThG8MJ.getName())) {
            pTWDDj2m1NTmwegu9POCQQ8mS4f2uPSE.setValue((Object)true);
            return true;
        }
        if (yoHyCknIDpxlvrXXV3ukm4c2gAnHu4Ag.equals(field004)) {
            pTWDDj2m1NTmwegu9POCQQ8mS4f2uPSE.setValue((Object)true);
            return true;
        }
        return false;
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(53);
        field001 = LoggerFactory.getLogger(SecureClass0136.class);
    }
}

