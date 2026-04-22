/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group019;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2371;
import net.minecraft.class_746;
import org.phobos.secure.group062.SecureInterface0143;

public class SecureClass0308
implements SecureInterface0143 {
    public final /* synthetic */ Map<Integer, class_1792> field001;

    public /* synthetic */ SecureClass0308() {
        this.field001 = new HashMap<Integer, class_1792>();
    }

    public static /* bridge */ /* synthetic */ SecureClass0308 K0XrUCjgAty6jSrzmDB5ECnG4eLVoV9J(class_746 class_7462) {
        class_2371 field002 = class_7462.field_7498.method_7602();
        SecureClass0308 field003 = new SecureClass0308();
        int field004 = 0;
        while (field004 < field002.size()) {
            field003.Mwk9POQngds0tmfy3OAJkEt9fJ4vwzJO(field004, ((class_1799)field002.get(field004)).method_7909());
            ++field004;
        }
        return field003;
    }
}

