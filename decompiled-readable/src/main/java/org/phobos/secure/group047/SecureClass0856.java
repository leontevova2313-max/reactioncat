/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group047;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1657;
import net.minecraft.class_638;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group023.SecureInterface0065;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0856 {
    public final /* synthetic */ SecureInterface0065 field001;
    public static final /* synthetic */ float field002 = 5.0f;
    public static final /* synthetic */ float field003 = 5.0f;
    public static final /* synthetic */ Logger field004;
    public static final /* synthetic */ float field005 = 6.0f;

    static {
        field004 = LoggerFactory.getLogger(SecureClass0856.class);
    }

    public /* synthetic */ SecureClass0856(SecureInterface0065 zAGWDwPgd80wEiipOfojCfWtVCmYHg4p) {
        this.field001 = zAGWDwPgd80wEiipOfojCfWtVCmYHg4p;
    }

    public static /* bridge */ /* synthetic */ void KkePNMQBVoFwO67SfG3oMoSPQKwO7P8U(class_638 VbbuyTQmN1hCnmj0dAmhrMUVGVSho84t, Predicate<class_1657> lyjCHSKFhovHfiHG9wy8ZKzOM22VQyFZ, Function<class_1657, Float> Sq7d4NKztzcdYn7EDIDnmPSux8qFshZw, Consumer<Float> b2k4tWHC24EZ4GY7r8NyTFQBVfi4C3rR) {
        MutableObject mutableObject = new MutableObject((Object)Float.valueOf(0.0f));
        Iterator<E> iterator = VbbuyTQmN1hCnmj0dAmhrMUVGVSho84t.method_18456().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                b2k4tWHC24EZ4GY7r8NyTFQBVfi4C3rR.accept((Float)mutableObject.getValue());
                return;
            }
            class_1657 field006 = (class_1657)iterator.next();
            if (!lyjCHSKFhovHfiHG9wy8ZKzOM22VQyFZ.test(field006)) continue;
            float field007 = Sq7d4NKztzcdYn7EDIDnmPSux8qFshZw.apply(field006).floatValue();
            if (!(((Float)mutableObject.getValue()).floatValue() < field007)) continue;
            mutableObject.setValue((Object)Float.valueOf(field007));
        }
    }
}

