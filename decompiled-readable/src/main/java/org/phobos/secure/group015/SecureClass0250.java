/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import java.util.HashMap;
import java.util.Map;
import org.phobos.secure.group013.EvWdcG1PP9izG49L551LpNEH8r7HHj9e;
import org.phobos.secure.group015.SecureClass0242;

public class SecureClass0250 {
    public static final /* synthetic */ Map<String, EvWdcG1PP9izG49L551LpNEH8r7HHj9e> field001;
    public final /* synthetic */ SecureClass0242 field002;

    static {
        field001 = new HashMap<String, EvWdcG1PP9izG49L551LpNEH8r7HHj9e>();
        EvWdcG1PP9izG49L551LpNEH8r7HHj9e[] field003 = EvWdcG1PP9izG49L551LpNEH8r7HHj9e.values();
        int n = field003.length;
        int n2 = 0;
        while (n2 < n) {
            EvWdcG1PP9izG49L551LpNEH8r7HHj9e field004 = field003[n2];
            String field005 = field004.name().toLowerCase();
            field001.put(field005, field004);
            ++n2;
        }
        return;
    }

    public /* synthetic */ SecureClass0250(SecureClass0242 manWby1XVFXCfgcO6VH48wLQMU9Sq4WB) {
        this.field002 = manWby1XVFXCfgcO6VH48wLQMU9Sq4WB;
    }
}

