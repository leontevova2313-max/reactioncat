/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group051;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1735;
import org.phobos.secure.group004.SecureClass0052;
import org.phobos.secure.group058.SecureClass1055;
import org.phobos.secure.group030.Ca1cMkMgIv0pWvdcNi40bY4bA6KD1VGe;

public class SecureClass0913 {
    public static final /* synthetic */ SecureClass0913 field001;
    public final /* synthetic */ Map<class_1735, SecureClass1055> field002;
    public final /* synthetic */ Ca1cMkMgIv0pWvdcNi40bY4bA6KD1VGe field003;
    public /* synthetic */ boolean field004;
    public /* synthetic */ Set<SecureClass1055> field005;
    public static final /* synthetic */ Robot field006;
    public final /* synthetic */ Ca1cMkMgIv0pWvdcNi40bY4bA6KD1VGe field007;
    public /* synthetic */ SecureClass0052 field008;

    static {
        field001 = new SecureClass0913();
        try {
            field006 = new Robot();
        }
        catch (AWTException tuXoN8IeilXHdKGEHAqNMPG4xi8uGREb) {
            throw new IllegalStateException("The client does not run in headless mode");
        }
    }

    public static /* bridge */ /* synthetic */ SecureClass0913 Room39dd8k2kdoQR6HNvt2m7CmYYSaEk() {
        return field001;
    }

    public /* synthetic */ SecureClass0913() {
        this.field002 = new HashMap<class_1735, SecureClass1055>();
        this.field003 = new Ca1cMkMgIv0pWvdcNi40bY4bA6KD1VGe();
        this.field007 = new Ca1cMkMgIv0pWvdcNi40bY4bA6KD1VGe();
        this.field008 = SecureClass0052.BTvtN8r5hNTac0XLx3DHiCWFbGnVfxdB();
        this.field005 = new HashSet<SecureClass1055>();
    }
}

