/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_2818;
import net.minecraft.class_746;
import org.phobos.secure.group054.SecureInterface0134;

public final class SecureClass0855
implements SecureInterface0134 {
    public static /* bridge */ /* synthetic */ List<class_2818> femAd1o8X9J4PqEjDs4QZEjKEU4AygFA(class_746 G8crsxF0fZ5mfalYmnRP2qIqBAlHcLba, class_1937 UkXEfY6QuWoFySoU6Umi37mHTymCuEAV) {
        class_1923 class_19232 = new class_1923(G8crsxF0fZ5mfalYmnRP2qIqBAlHcLba.method_24515());
        int field001 = (Integer)SecureClass0855.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1690.method_42503().method_41753();
        if (field001 <= 0) {
            field001 = 10;
        }
        int field002 = class_19232.field_9181 - field001;
        int field003 = class_19232.field_9181 + field001;
        int field004 = class_19232.field_9180 - field001;
        int field005 = class_19232.field_9180 + field001;
        ArrayList<class_2818> field006 = new ArrayList<class_2818>();
        int field007 = field002;
        while (field007 <= field003) {
            for (int L5MDLdSSEK4lk4ipklObTw9jk7KwOzhG = field004; L5MDLdSSEK4lk4ipklObTw9jk7KwOzhG <= field005; ++L5MDLdSSEK4lk4ipklObTw9jk7KwOzhG) {
                class_2818 field008 = UkXEfY6QuWoFySoU6Umi37mHTymCuEAV.method_8398().method_21730(field007, L5MDLdSSEK4lk4ipklObTw9jk7KwOzhG);
                if (field008 == null) continue;
                field006.add(field008);
            }
            ++field007;
        }
        return field006;
    }

    public /* synthetic */ SecureClass0855() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }
}

